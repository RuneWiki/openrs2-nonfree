import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "Lclient!oh;")
	public static Class11_Sub1 aClass11_Sub1_22;

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "Lclient!lf;")
	public static Class49 aClass49_738 = Static32.method683("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "Lclient!lf;")
	private static Class49 aClass49_739 = Static32.method683("Location");

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "Lclient!lf;")
	public static Class49 aClass49_740 = aClass49_739;

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
	public static int anInt1405 = 1;

	@OriginalMember(owner = "client!hd", name = "v", descriptor = "Lclient!lf;")
	public static Class49 aClass49_741 = Static32.method683("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)J")
	public static long method1129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub1 local7 = Static72.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass47_1 == null ? 0L : local7.aClass47_1.aLong89;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method1130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class59 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class59(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static72.aClass2_Sub1ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static72.aClass2_Sub1ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub1(local14, arg1, arg2);
				}
			}
			Static72.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2].aClass59_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class59(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static72.aClass2_Sub1ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static72.aClass2_Sub1ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub1(local14, arg1, arg2);
				}
			}
			Static72.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2].aClass59_1 = local12;
		} else {
			@Pc(134) Class21 local134 = new Class21(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static72.aClass2_Sub1ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static72.aClass2_Sub1ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub1(local14, arg1, arg2);
				}
			}
			Static72.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2].aClass21_1 = local134;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
	public static void method1131() {
		aClass49_739 = null;
		aClass49_741 = null;
		aClass11_Sub1_22 = null;
		aClass49_740 = null;
		aClass49_738 = null;
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)Lclient!kf;")
	public static Class2_Sub2_Sub2_Sub3 method1132() {
		@Pc(9) Class2_Sub2_Sub2_Sub3 local9 = new Class2_Sub2_Sub2_Sub3();
		local9.anInt1886 = Static20.anIntArray41[0];
		local9.anInt1889 = Static103.anInt2179;
		local9.anInt1885 = Static63.anIntArray165[0];
		local9.anInt1888 = Static142.anIntArray282[0];
		local9.anInt1887 = Static148.anInt3150;
		@Pc(34) byte[] local34 = Static9.aByteArrayArray1[0];
		local9.anInt1890 = Static178.anIntArray364[0];
		@Pc(45) int local45 = local9.anInt1886 * local9.anInt1885;
		local9.anIntArray191 = new int[local45];
		for (@Pc(51) int local51 = 0; local51 < local45; local51++) {
			local9.anIntArray191[local51] = Static47.anIntArray105[local34[local51] & 0xFF];
		}
		Static63.method1094();
		return local9;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
	public static void method1133() {
		for (@Pc(3) int local3 = 0; local3 < Static88.anInt1850; local3++) {
			@Pc(14) int local14 = Static90.anIntArray192[local3];
			@Pc(18) Class2_Sub2_Sub3_Sub7_Sub2 local18 = Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[local14];
			@Pc(22) int local22 = Static86.aClass2_Sub13_Sub1_13.method2962();
			if ((local22 & 0x4) != 0) {
				local22 += Static86.aClass2_Sub13_Sub1_13.method2962() << 8;
			}
			Static124.method2149(local14, local18, local22);
		}
	}
}
