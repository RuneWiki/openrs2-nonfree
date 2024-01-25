import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
	public static int anInt3758 = 2;

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)I")
	public static int method3248() {
		@Pc(5) Class13 local5 = Static141.aClass13_27;
		@Pc(7) boolean local7 = false;
		if (Static305.aClass2_Sub49_15.aClass33_Sub28_1.method8687() != 0) {
			@Pc(19) Canvas local19 = new Canvas();
			local19.setSize(100, 100);
			local5 = Static620.method8621(0, local19, (Interface2) null, 0, (Class238) null);
			local7 = true;
		}
		@Pc(36) long local36 = Static48.method1203();
		for (@Pc(46) int local46 = 0; local46 < 10000; local46++) {
			local5.method8126();
		}
		@Pc(75) int local75 = (int) (Static48.method1203() - local36);
		local5.method8164(-16777216, 100, 0, 100, 0);
		if (local7) {
			local5.method8117();
		}
		return local75;
	}
}
