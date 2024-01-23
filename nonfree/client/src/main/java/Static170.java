import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!mf", name = "I", descriptor = "F")
	public static float aFloat46;

	@OriginalMember(owner = "client!mf", name = "F", descriptor = "[I")
	public static int[] anIntArray386 = new int[25];

	@OriginalMember(owner = "client!mf", name = "K", descriptor = "I")
	public static int anInt3194 = 99;

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(B)[Lclient!kk;")
	public static Class81_Sub2[] method2811() {
		@Pc(16) Class81_Sub2[] local16 = new Class81_Sub2[Static28.anInt494];
		for (@Pc(18) int local18 = 0; local18 < Static28.anInt494; local18++) {
			local16[local18] = new Class81_Sub2(Static148.anInt2816, Static43.anInt812, Static93.anIntArray162[local18], Static35.anIntArray54[local18], Static101.anIntArray185[local18], Static306.anIntArray618[local18], Static314.aByteArrayArray130[local18], Static299.anIntArray611);
		}
		Static6.method108();
		return local16;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
	public static void method2812() {
		for (@Pc(17) Class3_Sub4_Sub20 local17 = (Class3_Sub4_Sub20) Static259.aClass56_25.method1281(); local17 != null; local17 = (Class3_Sub4_Sub20) Static259.aClass56_25.method1278()) {
			@Pc(23) Class10_Sub1 local23 = local17.aClass10_Sub1_1;
			if (Static99.anInt1826 != local23.anInt275 || local23.aBoolean20) {
				local17.method5013();
			} else if (Static124.anInt2371 >= local23.anInt282) {
				local23.method228(Static140.anInt2709);
				if (local23.aBoolean20) {
					local17.method5013();
				} else {
					Static236.method3997(local23.anInt275, local23.anInt279, local23.anInt271, local23.anInt281, 60, local23, 0, -1L, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)V")
	public static void method2813(@OriginalArg(0) boolean arg0) {
		@Pc(7) byte[][] local7;
		if (Static283.aBoolean393 && arg0) {
			local7 = Static50.aByteArrayArray22;
		} else {
			local7 = Static302.aByteArrayArray126;
		}
		@Pc(18) int local18 = Static44.aByteArrayArray18.length;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) byte[] local27 = local7[local20];
			if (local27 != null) {
				@Pc(39) int local39 = (Static297.anIntArray220[local20] >> 8) * 64 - Static101.anInt1844;
				@Pc(50) int local50 = (Static297.anIntArray220[local20] & 0xFF) * 64 - Static43.anInt798;
				Static174.method2872();
				Static158.method2619(arg0, local27, Static138.aClass153Array1, local50, local39);
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIILclient!f;II)Z")
	public static boolean method2815(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class49 arg3) {
		@Pc(18) Class182 local18 = Static281.method3885(arg3.anInt1350);
		if (local18.anInt5766 == -1) {
			return true;
		}
		if (arg3.aBoolean109) {
			@Pc(37) int local37 = arg2 + arg3.anInt1364;
			arg2 = local37 & 0x3;
		} else {
			arg2 = 0;
		}
		@Pc(48) Class81_Sub2 local48 = local18.method4741(arg3.aBoolean113, arg2);
		if (local48 == null) {
			return false;
		}
		@Pc(56) int local56 = arg3.anInt1360;
		@Pc(59) int local59 = local48.anInt2802;
		@Pc(62) int local62 = arg3.anInt1329;
		if ((arg2 & 0x1) == 1) {
			local62 = arg3.anInt1360;
			local56 = arg3.anInt1329;
		}
		@Pc(77) int local77 = local48.anInt2795;
		if (local18.aBoolean411) {
			local77 = local62 * 4;
			local59 = local56 * 4;
		}
		if (local18.anInt5764 == 0) {
			local48.method2510(arg1 * 4 + 48, (-local62 + -arg0 + 104) * 4 + 48, local59, local77);
		} else {
			local48.method2503(arg1 * 4 + 48, (-local62 + -arg0 + 104) * 4 + 48, local59, local77, local18.anInt5764);
		}
		return true;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIILclient!lk;)V")
	public static void method2816(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class3_Sub20 arg4) {
		if (arg4.anInt2988 == -1 && arg4.anIntArray348 == null) {
			return;
		}
		@Pc(19) int local19 = 0;
		if (arg4.anInt2992 < arg3) {
			local19 = arg3 - arg4.anInt2992;
		} else if (arg4.anInt2993 > arg3) {
			local19 = arg4.anInt2993 - arg3;
		}
		@Pc(52) int local52 = Static305.anInt6006 * arg4.anInt2990 >> 8;
		if (arg4.anInt2996 < arg0) {
			local19 += arg0 - arg4.anInt2996;
		} else if (arg0 < arg4.anInt2998) {
			local19 += arg4.anInt2998 - arg0;
		}
		if (arg4.anInt2995 == 0 || local19 - 64 > arg4.anInt2995 || Static305.anInt6006 == 0 || arg4.anInt2985 != arg1) {
			if (arg4.aClass3_Sub15_Sub1_3 != null) {
				Static86.aClass3_Sub15_Sub2_1.method2432(arg4.aClass3_Sub15_Sub1_3);
				arg4.aClass3_Sub15_Sub1_3 = null;
			}
			if (arg4.aClass3_Sub15_Sub1_2 != null) {
				Static86.aClass3_Sub15_Sub2_1.method2432(arg4.aClass3_Sub15_Sub1_2);
				arg4.aClass3_Sub15_Sub1_2 = null;
			}
			return;
		}
		local19 -= 64;
		if (local19 < 0) {
			local19 = 0;
		}
		@Pc(150) int local150 = (arg4.anInt2995 - local19) * local52 / arg4.anInt2995;
		if (arg4.aClass3_Sub15_Sub1_3 != null) {
			arg4.aClass3_Sub15_Sub1_3.method2138(local150);
		} else if (arg4.anInt2988 >= 0) {
			@Pc(165) Class45 local165 = Static317.method1046(Static220.aClass155_105, arg4.anInt2988, 0);
			if (local165 != null) {
				@Pc(172) Class3_Sub11_Sub1 local172 = local165.method1045().method3668(Static231.aClass152_1);
				@Pc(177) Class3_Sub15_Sub1 local177 = Static319.method2148(local172, local150);
				local177.method2133(-1);
				Static86.aClass3_Sub15_Sub2_1.method2430(local177);
				arg4.aClass3_Sub15_Sub1_3 = local177;
			}
		}
		if (arg4.aClass3_Sub15_Sub1_2 != null) {
			arg4.aClass3_Sub15_Sub1_2.method2138(local150);
			if (!arg4.aClass3_Sub15_Sub1_2.method5016()) {
				arg4.aClass3_Sub15_Sub1_2 = null;
			}
		} else if (arg4.anIntArray348 != null && (arg4.anInt2987 -= arg2) <= 0) {
			@Pc(231) int local231 = (int) (Math.random() * (double) arg4.anIntArray348.length);
			@Pc(239) Class45 local239 = Static317.method1046(Static220.aClass155_105, arg4.anIntArray348[local231], 0);
			if (local239 != null) {
				@Pc(247) Class3_Sub11_Sub1 local247 = local239.method1045().method3668(Static231.aClass152_1);
				@Pc(252) Class3_Sub15_Sub1 local252 = Static319.method2148(local247, local150);
				local252.method2133(0);
				Static86.aClass3_Sub15_Sub2_1.method2430(local252);
				arg4.anInt2987 = (int) (Math.random() * (double) (arg4.anInt2997 - arg4.anInt3000)) + arg4.anInt3000;
				arg4.aClass3_Sub15_Sub1_2 = local252;
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIII)V")
	public static void method2817(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == arg1) {
			Static21.method350(arg4, arg2, arg1, arg3);
		} else if (Static175.anInt3267 <= arg4 - arg1 && Static204.anInt4020 >= arg4 + arg1 && Static245.anInt6027 <= arg2 - arg0 && Static111.anInt2039 >= arg0 + arg2) {
			Static308.method4939(arg3, arg1, arg2, arg4, arg0);
		} else {
			Static3.method45(arg0, arg4, arg2, arg3, arg1);
		}
	}
}
