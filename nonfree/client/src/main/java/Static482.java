import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)I")
	public static int method7137() {
		if (Static628.aFrame3 == null) {
			return Static24.aBoolean32 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)I")
	public static int method7139() {
		@Pc(7) Class137 local7 = Static677.aClass137_47;
		@Pc(9) boolean local9 = false;
		if (Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7541() != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local7 = Static473.method6864(0, (Class386) null, (Interface3) null, local18, 0);
			local9 = true;
		}
		@Pc(35) long local35 = Static521.method7499();
		for (@Pc(37) int local37 = 0; local37 < 10000; local37++) {
			local7.method7929();
		}
		@Pc(74) int local74 = (int) (Static521.method7499() - local35);
		local7.method7869(0, 100, -16777216, 0, 100);
		if (local9) {
			local7.method7935();
		}
		return local74;
	}
}
