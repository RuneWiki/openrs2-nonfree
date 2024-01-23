import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!rc", name = "Jb", descriptor = "Lclient!qn;")
	public static Class3_Sub4_Sub12_Sub2 aClass3_Sub4_Sub12_Sub2_4;

	@OriginalMember(owner = "client!rc", name = "Tb", descriptor = "Lclient!rn;")
	public static Class155 aClass155_96;

	@OriginalMember(owner = "client!rc", name = "Kb", descriptor = "[S")
	public static short[] aShortArray83 = new short[] { 48, 44, 17, 50, 13, 29, 8, 35 };

	@OriginalMember(owner = "client!rc", name = "Yb", descriptor = "Ljava/lang/String;")
	public static String aString162 = "Loaded sprites";

	@OriginalMember(owner = "client!rc", name = "Zb", descriptor = "[I")
	public static int[] anIntArray505 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIILclient!rg;Lclient!ho;II)V")
	public static void method3951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class151 arg3, @OriginalArg(4) Class3_Sub4_Sub12 arg4, @OriginalArg(6) int arg5) {
		if (arg4 == null) {
			return;
		}
		@Pc(18) int local18;
		if (Static25.anInt467 == 4) {
			local18 = (int) Static84.aFloat21 & 0x7FF;
		} else {
			local18 = Static241.anInt4889 + (int) Static84.aFloat21 & 0x7FF;
		}
		@Pc(39) int local39 = Math.max(arg3.anInt4773 / 2, arg3.anInt4751 / 2) + 10;
		@Pc(47) int local47 = arg5 * arg5 + arg1 * arg1;
		if (local39 * local39 < local47) {
			return;
		}
		@Pc(67) int local67 = Class11.anIntArray27[local18];
		@Pc(71) int local71 = Class11.anIntArray26[local18];
		if (Static25.anInt467 != 4) {
			local71 = local71 * 256 / (Static125.anInt2421 + 256);
			local67 = local67 * 256 / (Static125.anInt2421 + 256);
		}
		@Pc(102) int local102 = local67 * arg1 + arg5 * local71 >> 16;
		@Pc(112) int local112 = local67 * arg5 - arg1 * local71 >> 16;
		if (Static283.aBoolean393) {
			((Class3_Sub4_Sub12_Sub1) arg4).method2281(local102 + arg2 + arg3.anInt4773 / 2 - arg4.anInt5723 / 2, -local112 + arg0 + arg3.anInt4751 / 2 + -(arg4.anInt5731 / 2), (Class3_Sub4_Sub12_Sub1) arg3.method4000(false));
		} else {
			((Class3_Sub4_Sub12_Sub2) arg4).method4707(arg3.anInt4773 / 2 + arg2 + local102 - arg4.anInt5723 / 2, -local112 + arg3.anInt4751 / 2 + arg0 + -(arg4.anInt5731 / 2), arg3.anIntArray509, arg3.anIntArray523);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "([IIIIII)V")
	public static void method3953(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class3_Sub25 local7 = Static146.aClass3_Sub25ArrayArrayArray7[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class110 local13 = local7.aClass110_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt3161;
			if (local18 != 0) {
				for (local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) Class111 local58 = local7.aClass111_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt3171;
		@Pc(67) int local67 = local58.anInt3174;
		@Pc(70) int local70 = local58.anInt3173;
		@Pc(73) int local73 = local58.anInt3172;
		@Pc(77) int[] local77 = Static279.anIntArrayArray73[local23];
		@Pc(81) int[] local81 = Static208.anIntArrayArray60[local67];
		@Pc(83) int local83 = 0;
		@Pc(87) int local87;
		if (local70 != 0) {
			for (local87 = 0; local87 < 4; local87++) {
				arg0[arg1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (local87 = 0; local87 < 4; local87++) {
			if (local77[local81[local83++]] != 0) {
				arg0[arg1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "(II)V")
	public static void method3956() {
		Static306.anInt6012 = -1;
		Static44.anInt828 = 2;
		Static305.aBoolean426 = false;
		Static93.anInt1696 = -1;
		Static94.anInt1711 = 1;
		Static110.anInt2029 = 0;
		Static310.aClass155_122 = null;
	}

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "(B)Lclient!vo;")
	public static Class3_Sub4_Sub23 method3957() {
		if (Static228.aClass115_4 == null) {
			return null;
		} else {
			Static37.aClass17_1.method412(Static228.aClass115_4);
			@Pc(23) Class3_Sub4_Sub23 local23 = (Class3_Sub4_Sub23) Static37.aClass17_1.method415();
			@Pc(28) Class40 local28 = Static96.method1438(local23.anInt5971);
			return local28 != null && local28.aBoolean86 && local28.method978() ? local23 : Static17.method292();
		}
	}
}
