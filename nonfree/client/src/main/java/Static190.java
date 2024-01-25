import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!jh", name = "u", descriptor = "I")
	public static int anInt3826;

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
	public static final int anInt3818 = 52;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!qa;B)V")
	public static void method3170(@OriginalArg(0) Class75 arg0) {
		arg0.pa(0, 0, Static385.anInt6686, 350);
		arg0.NA(0, 0, Static385.anInt6686, 350, Static78.anInt1703 << 24 | 0x332277, 1);
		@Pc(25) int local25 = 350 / Static325.anInt5927;
		@Pc(37) int local37;
		if (Static296.anInt5416 > 0) {
			local37 = 346 - Static325.anInt5927 - 4;
			@Pc(48) int local48 = local37 * local25 / (local25 + Static296.anInt5416 - 1);
			@Pc(50) int local50 = 4;
			if (Static296.anInt5416 > 1) {
				local50 = (local37 - local48) * (Static296.anInt5416 + -1 + -Static120.anInt2614) / (Static296.anInt5416 - 1) + 4;
			}
			arg0.NA(Static385.anInt6686 - 16, local50, 12, local48, Static78.anInt1703 << 24 | 0x332277, 2);
			for (@Pc(88) int local88 = Static120.anInt2614; local88 < local25 + Static120.anInt2614 && Static296.anInt5416 > local88; local88++) {
				@Pc(96) String[] local96 = Static365.method5139('\b', Static230.aStringArray101[local88]);
				@Pc(105) int local105 = (Static385.anInt6686 - 8 - 16) / local96.length;
				for (@Pc(107) int local107 = 0; local107 < local96.length; local107++) {
					@Pc(114) int local114 = local105 * local107 + 8;
					arg0.pa(local114, 0, local114 + local105 - 8, 350);
					Static277.aClass65_5.method5818(348 - Static43.anInt1083 - Static230.aClass179_11.anInt5440 - (local88 - Static120.anInt2614) * Static325.anInt5927, local114, -16777216, -1, local96[local107]);
				}
			}
		}
		arg0.pa(0, 0, Static385.anInt6686, 350);
		arg0.method2639(0, 350 - Static43.anInt1083, -1, Static385.anInt6686);
		Static399.aClass65_7.method5818(350 - Static222.aClass179_10.anInt5440 - 1, 10, -16777216, -1, "--> " + Static155.aString32);
		local37 = -1;
		if (Static290.anInt5325 % 30 > 15) {
			local37 = 16777215;
		}
		arg0.method2573(local37, 12, 350 - Static222.aClass179_10.anInt5440 - 11, Static222.aClass179_10.method4385("--> " + Static155.aString32.substring(0, Static364.anInt6527)) + 10);
	}
}
