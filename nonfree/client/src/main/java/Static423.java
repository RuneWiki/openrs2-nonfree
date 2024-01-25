import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!oa;I)V")
	public static void method6210(@OriginalArg(0) Class121 arg0) {
		arg0.ca(0, 0, Static502.anInt8364, 350);
		arg0.C(0, 0, Static502.anInt8364, 350, Static501.anInt8338 << 24 | 0x332277, 1);
		@Pc(27) int local27 = 350 / Static534.anInt9078;
		@Pc(34) int local34;
		if (Static444.anInt7729 > 0) {
			local34 = 342 - Static534.anInt9078;
			@Pc(44) int local44 = local27 * local34 / (Static444.anInt7729 + local27 - 1);
			@Pc(46) int local46 = 4;
			if (Static444.anInt7729 > 1) {
				local46 = (local34 - local44) * (-Static537.anInt9110 + -1 + Static444.anInt7729) / (Static444.anInt7729 - 1) + 4;
			}
			arg0.C(Static502.anInt8364 - 16, local46, 12, local44, Static501.anInt8338 << 24 | 0x332277, 2);
			for (@Pc(83) int local83 = Static537.anInt9110; Static537.anInt9110 + local27 > local83 && Static444.anInt7729 > local83; local83++) {
				@Pc(92) String[] local92 = Static128.method1936(Static316.aStringArray22[local83], '\b');
				@Pc(99) int local99 = (Static502.anInt8364 - 24) / local92.length;
				for (@Pc(101) int local101 = 0; local101 < local92.length; local101++) {
					@Pc(110) int local110 = local101 * local99 + 8;
					arg0.ca(local110, 0, local99 + local110 - 8, 350);
					Static85.aClass56_2.method7879(local92[local101], local110, -1, 350 - Static534.anInt9078 * (local83 - Static537.anInt9110) - Static495.anInt8262 - Static340.aClass146_8.anInt3689 - 2, -16777216);
				}
			}
		}
		arg0.ca(0, 0, Static502.anInt8364, 350);
		arg0.method7138(Static502.anInt8364, 350 - Static495.anInt8262, -1, 0);
		Static408.aClass56_4.method7879("--> " + Static298.aString68, 10, -1, 350 - Static338.aClass146_7.anInt3689 - 1, -16777216);
		if (!Static241.aBoolean259) {
			return;
		}
		local34 = -1;
		if (Static358.anInt6263 % 30 > 15) {
			local34 = 16777215;
		}
		arg0.method7140(Static338.aClass146_7.method3173("--> " + Static298.aString68.substring(0, Static133.anInt4719)) + 10, 350 - (Static338.aClass146_7.anInt3689 + 11), local34, 12);
	}
}
