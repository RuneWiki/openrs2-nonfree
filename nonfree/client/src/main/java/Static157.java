import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!fda", name = "o", descriptor = "Z")
	public static boolean aBoolean165;

	@OriginalMember(owner = "client!fda", name = "g", descriptor = "I")
	public static int anInt2396;

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "Lclient!eba;")
	public static Class14_Sub1_Sub3 aClass14_Sub1_Sub3_1;

	@OriginalMember(owner = "client!fda", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!fda", name = "h", descriptor = "Lclient!da;")
	public static Class68 aClass68_1;

	@OriginalMember(owner = "client!fda", name = "e", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_66 = new Class160(30, -1);

	@OriginalMember(owner = "client!fda", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray15 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(II)Z")
	public static boolean method2249(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class14_Sub2_Sub20 local14 = (Class14_Sub2_Sub20) Static111.aClass32_7.method584(); local14 != null; local14 = (Class14_Sub2_Sub20) Static111.aClass32_7.method577()) {
			if (Static621.method8720(local14.anInt10001) && (long) arg0 == local14.aLong281) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lclient!rg;ILclient!iha;)V")
	public static void method2250(@OriginalArg(0) Class310 arg0, @OriginalArg(2) Class173 arg1) {
		Static639.aClass173_6 = arg1;
		Static547.aString50 = "";
		Static690.aClass310_139 = arg0;
		if (Class275.aString86.startsWith("win")) {
			Static547.aString50 = Static547.aString50 + "windows/";
		} else if (Class275.aString86.startsWith("linux")) {
			Static547.aString50 = Static547.aString50 + "linux/";
		} else if (Class275.aString86.startsWith("mac")) {
			Static547.aString50 = Static547.aString50 + "macos/";
		}
		if (Static639.aClass173_6.aBoolean359) {
			Static547.aString50 = Static547.aString50 + "msjava/";
		} else if (Class275.aString87.startsWith("amd64") || Class275.aString87.startsWith("x86_64")) {
			Static547.aString50 = Static547.aString50 + "x86_64/";
		} else if (Class275.aString87.startsWith("i386") || Class275.aString87.startsWith("i486") || Class275.aString87.startsWith("i586") || Class275.aString87.startsWith("x86")) {
			Static547.aString50 = Static547.aString50 + "x86/";
		} else if (Class275.aString87.startsWith("ppc")) {
			Static547.aString50 = Static547.aString50 + "ppc/";
		} else {
			Static547.aString50 = Static547.aString50 + "universal/";
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIII[IIII)Z")
	public static boolean method2251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static55.anInt955 < arg5) {
			arg5 = Static55.anInt955;
		}
		if (arg2 < 0) {
			arg2 = 0;
		}
		if (arg2 >= arg5) {
			return true;
		}
		@Pc(25) int local25 = arg5 - arg2 >> 2;
		arg0 += arg2 * arg4;
		arg1 += arg2 - 1;
		@Pc(64) int local64;
		@Pc(51) int local51;
		if (Static178.anInt2910 == 1) {
			Static241.anInt4621 += local25;
			while (true) {
				local25--;
				@Pc(67) int local67;
				if (local25 < 0) {
					local25 = arg5 - arg2 & 0x3;
					while (true) {
						local25--;
						if (local25 < 0) {
							return true;
						}
						local67 = ~arg0;
						arg1++;
						if (local67 > ~arg3[arg1]) {
							arg3[arg1] = arg0;
						}
						arg0 += arg4;
					}
				}
				local51 = arg1 + 1;
				if (arg0 < arg3[local51]) {
					arg3[local51] = arg0;
				}
				local64 = arg0 + arg4;
				local67 = ~local64;
				local51++;
				if (local67 > ~arg3[local51]) {
					arg3[local51] = local64;
				}
				local64 += arg4;
				local51++;
				if (arg3[local51] > local64) {
					arg3[local51] = local64;
				}
				local64 += arg4;
				arg1 = local51 + 1;
				if (arg3[arg1] > local64) {
					arg3[arg1] = local64;
				}
				arg0 = local64 + arg4;
			}
		} else {
			arg0 -= 38400;
			while (true) {
				local25--;
				if (local25 < 0) {
					local25 = arg5 - arg2 & 0x3;
					while (true) {
						local25--;
						if (local25 < 0) {
							return true;
						}
						arg1++;
						if (arg3[arg1] > arg0) {
							return false;
						}
						arg0 += arg4;
					}
				}
				local51 = arg1 + 1;
				if (arg3[local51] > arg0) {
					return false;
				}
				local64 = arg0 + arg4;
				local51++;
				if (arg3[local51] > local64) {
					return false;
				}
				local64 += arg4;
				local51++;
				if (local64 < arg3[local51]) {
					return false;
				}
				local64 += arg4;
				arg1 = local51 + 1;
				if (arg3[arg1] > local64) {
					return false;
				}
				arg0 = local64 + arg4;
			}
		}
	}

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "(II)V")
	public static void method2252(@OriginalArg(1) int arg0) {
		@Pc(11) Class14_Sub2_Sub9 local11 = Static499.method7527((long) arg0, 8);
		local11.method4001();
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(ILclient!nh;Lclient!nh;IIIIIII)V")
	public static void method2255(@OriginalArg(1) Class4_Sub3_Sub3_Sub3 arg0, @OriginalArg(2) Class4_Sub3_Sub3_Sub3 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg0.method2869();
		if (local7 == -1) {
			return;
		}
		@Pc(22) Class45 local22 = (Class45) Static541.aClass317_58.method7882((long) local7);
		if (local22 == null) {
			@Pc(29) Class266[] local29 = Static697.method6470(Static99.aClass310_23, local7);
			if (local29 == null) {
				return;
			}
			local22 = Static103.aClass144_3.method6964(local29[0], true);
			Static541.aClass317_58.method7875((long) local7, local22);
		}
		Static552.method7981(arg2 >> 1, arg1.anInt11178, 0, arg1.method2870(0) * 256, arg1.anInt11184, arg1.aByte146, arg5 >> 1);
		@Pc(80) int local80 = Static172.anIntArray151[0] + arg3 - 18;
		@Pc(88) int local88 = local80 + arg4 / 4 * 18;
		@Pc(98) int local98 = Static172.anIntArray151[1] + arg6 - 54 - 16;
		@Pc(106) int local106 = local98 + arg4 % 4 * 18;
		local22.method7488(local88, local106);
		if (arg0 == arg1) {
			Static103.aClass144_3.method6906(local88 - 1, 18, 18, -256, local106 - 1);
		}
		Static140.method2127(local88 + 18, local88 + -1, local106 + 18, local106 + -1);
		@Pc(146) Class4_Sub7 local146 = Static482.method7255();
		local146.anInt8871 = local88;
		local146.aClass4_Sub3_Sub3_Sub3_1 = arg0;
		local146.anInt8866 = local88 + 16;
		local146.anInt8869 = local106 + 16;
		local146.anInt8870 = local106;
		Static423.aClass283_10.method6802(local146);
	}
}
