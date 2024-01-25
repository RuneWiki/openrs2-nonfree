import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
	public static int anInt7021;

	@OriginalMember(owner = "client!pk", name = "m", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_92 = new Class158(41, 8);

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V")
	public static void method5882() {
		for (@Pc(11) int local11 = 0; local11 < Static313.aClass92ArrayArray1.length; local11++) {
			for (@Pc(15) int local15 = 0; local15 < Static313.aClass92ArrayArray1[local11].length; local15++) {
				Static313.aClass92ArrayArray1[local11][local15] = Static510.aClass92_2;
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIII)V")
	public static void method5884(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) Class296[] local7 = Static518.aClass296Array2;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(15) Class296 local15 = local7[local9];
			if (local15 != null && local15.anInt8744 == 2) {
				Static86.method1760(local15.anInt8743, local15.anInt8746 * 2, arg1 >> 1, local15.anInt8740, arg2 >> 1, local15.anInt8739);
				if (Static447.anIntArray695[0] > -1 && Static223.anInt4829 % 20 < 10) {
					Static51.aClass119Array4[local15.anInt8747].method6678(Static447.anIntArray695[0] + arg3 - 12, arg0 + -28 - -Static447.anIntArray695[1]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(B)V")
	public static void method5885() {
		if (Static256.anInt5191 < 0) {
			Static152.anInt3124 = -1;
			Static256.anInt5191 = 0;
			Static531.anInt9235 = -1;
		}
		if (Static55.anInt1972 < Static256.anInt5191) {
			Static531.anInt9235 = -1;
			Static152.anInt3124 = -1;
			Static256.anInt5191 = Static55.anInt1972;
		}
		if (Static129.anInt2692 < 0) {
			Static129.anInt2692 = 0;
			Static531.anInt9235 = -1;
			Static152.anInt3124 = -1;
		}
		if (Static129.anInt2692 > Static55.anInt1982) {
			Static152.anInt3124 = -1;
			Static531.anInt9235 = -1;
			Static129.anInt2692 = Static55.anInt1982;
		}
	}
}
