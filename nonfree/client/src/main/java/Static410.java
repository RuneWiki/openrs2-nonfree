import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
	public static int anInt6680;

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
	public static int anInt6683;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)I")
	public static int method5541() {
		@Pc(13) Class162 local13 = Static417.aClass162_17;
		@Pc(15) boolean local15 = false;
		if (Static226.anInt3318 != 0) {
			@Pc(24) Canvas local24 = new Canvas();
			local24.setSize(100, 100);
			local15 = true;
			local13 = Static451.method6877(null, null, local24, 0, 0);
		}
		@Pc(41) long local41 = Static362.method5133();
		for (@Pc(43) int local43 = 0; local43 < 10000; local43++) {
			local13.method6828();
		}
		@Pc(68) int local68 = (int) (Static362.method5133() - local41);
		local13.method6885(0, -16777216, 100, 0, 100);
		if (local15) {
			local13.method6821();
		}
		return local68;
	}
}
