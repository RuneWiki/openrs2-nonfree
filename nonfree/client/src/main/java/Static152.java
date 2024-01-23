import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!la", name = "P", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray18;

	@OriginalMember(owner = "client!la", name = "O", descriptor = "I")
	public static int anInt3020 = 0;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method2440(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(21) int local21 = 0; local21 < local8; local21++) {
			@Pc(28) char local28 = arg0.charAt(local21);
			if (local28 > '\u0000' && local28 < '\u0080' || !(local28 < ' ' || local28 > 'ÿ')) {
				local11[local21] = (byte) local28;
			} else if (local28 == '€') {
				local11[local21] = -128;
			} else if (local28 == '‚') {
				local11[local21] = -126;
			} else if (local28 == 'ƒ') {
				local11[local21] = -125;
			} else if (local28 == '„') {
				local11[local21] = -124;
			} else if (local28 == '…') {
				local11[local21] = -123;
			} else if (local28 == '†') {
				local11[local21] = -122;
			} else if (local28 == '‡') {
				local11[local21] = -121;
			} else if (local28 == 'ˆ') {
				local11[local21] = -120;
			} else if (local28 == '‰') {
				local11[local21] = -119;
			} else if (local28 == 'Š') {
				local11[local21] = -118;
			} else if (local28 == '‹') {
				local11[local21] = -117;
			} else if (local28 == 'Œ') {
				local11[local21] = -116;
			} else if (local28 == 'Ž') {
				local11[local21] = -114;
			} else if (local28 == '‘') {
				local11[local21] = -111;
			} else if (local28 == '’') {
				local11[local21] = -110;
			} else if (local28 == '“') {
				local11[local21] = -109;
			} else if (local28 == '”') {
				local11[local21] = -108;
			} else if (local28 == '•') {
				local11[local21] = -107;
			} else if (local28 == '–') {
				local11[local21] = -106;
			} else if (local28 == '—') {
				local11[local21] = -105;
			} else if (local28 == '˜') {
				local11[local21] = -104;
			} else if (local28 == '™') {
				local11[local21] = -103;
			} else if (local28 == 'š') {
				local11[local21] = -102;
			} else if (local28 == '›') {
				local11[local21] = -101;
			} else if (local28 == 'œ') {
				local11[local21] = -100;
			} else if (local28 == 'ž') {
				local11[local21] = -98;
			} else if (local28 == 'Ÿ') {
				local11[local21] = -97;
			} else {
				local11[local21] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIII)V")
	public static void method2441(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static238.method3147(arg5);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg5 - arg4;
		@Pc(16) int local16 = arg5;
		@Pc(19) int local19 = -arg5;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(35) int local35 = local14;
		@Pc(38) int local38 = -local14;
		@Pc(42) int[] local42 = Static253.anIntArrayArray34[arg2];
		@Pc(44) int local44 = -1;
		@Pc(46) int local46 = -1;
		@Pc(50) int local50 = arg3 + local14;
		@Pc(55) int local55 = arg3 - local14;
		Static190.method3151(local55, local42, arg1, arg3 - arg5);
		Static190.method3151(local50, local42, arg0, local55);
		Static190.method3151(arg5 + arg3, local42, arg1, local50);
		while (local16 > local10) {
			local46 += 2;
			local19 += local46;
			local44 += 2;
			local38 += local44;
			if (local38 >= 0 && local35 >= 1) {
				Static74.anIntArray143[local35] = local10;
				local35--;
				local38 -= local35 << 1;
			}
			local10++;
			@Pc(132) int[] local132;
			@Pc(139) int[] local139;
			@Pc(143) int local143;
			@Pc(148) int local148;
			@Pc(188) int local188;
			@Pc(192) int local192;
			@Pc(197) int local197;
			if (local19 >= 0) {
				local16--;
				if (local14 <= local16) {
					local132 = Static253.anIntArrayArray34[local16 + arg2];
					local139 = Static253.anIntArrayArray34[arg2 - local16];
					local143 = local10 + arg3;
					local148 = arg3 - local10;
					Static190.method3151(local143, local132, arg1, local148);
					Static190.method3151(local143, local139, arg1, local148);
				} else {
					local132 = Static253.anIntArrayArray34[local16 + arg2];
					local139 = Static253.anIntArrayArray34[arg2 - local16];
					local143 = Static74.anIntArray143[local16];
					local148 = arg3 + local10;
					local188 = arg3 - local10;
					local192 = arg3 + local143;
					local197 = arg3 - local143;
					Static190.method3151(local197, local132, arg1, local188);
					Static190.method3151(local192, local132, arg0, local197);
					Static190.method3151(local148, local132, arg1, local192);
					Static190.method3151(local197, local139, arg1, local188);
					Static190.method3151(local192, local139, arg0, local197);
					Static190.method3151(local148, local139, arg1, local192);
				}
				local19 -= local16 << 1;
			}
			local132 = Static253.anIntArrayArray34[arg2 + local10];
			local139 = Static253.anIntArrayArray34[arg2 - local10];
			local143 = arg3 + local16;
			local148 = arg3 - local16;
			if (local14 <= local10) {
				Static190.method3151(local143, local132, arg1, local148);
				Static190.method3151(local143, local139, arg1, local148);
			} else {
				local188 = local35 >= local10 ? local35 : Static74.anIntArray143[local10];
				local197 = arg3 - local188;
				local192 = arg3 + local188;
				Static190.method3151(local197, local132, arg1, local148);
				Static190.method3151(local192, local132, arg0, local197);
				Static190.method3151(local143, local132, arg1, local192);
				Static190.method3151(local197, local139, arg1, local148);
				Static190.method3151(local192, local139, arg0, local197);
				Static190.method3151(local143, local139, arg1, local192);
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method2442(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) boolean local7 = false;
		@Pc(13) String local13 = Static198.method3235(Static19.method425(arg0));
		for (@Pc(15) int local15 = 0; local15 < Static85.anInt1730; local15++) {
			@Pc(28) Class13_Sub5_Sub1 local28 = Static100.aClass13_Sub5_Sub1Array1[Static291.anIntArray457[local15]];
			if (local28 != null && local28.aString148 != null && local28.aString148.equalsIgnoreCase(local13)) {
				if (arg1 == 1) {
					Static175.aClass4_Sub24_Sub1_1.method3123(66);
					Static175.aClass4_Sub24_Sub1_1.method3097(0);
					Static175.aClass4_Sub24_Sub1_1.method3112(Static291.anIntArray457[local15]);
				} else if (arg1 == 4) {
					Static175.aClass4_Sub24_Sub1_1.method3123(104);
					Static175.aClass4_Sub24_Sub1_1.method3080(Static291.anIntArray457[local15]);
					Static175.aClass4_Sub24_Sub1_1.method3097(0);
				} else if (arg1 == 5) {
					Static175.aClass4_Sub24_Sub1_1.method3123(99);
					Static175.aClass4_Sub24_Sub1_1.method3082(0);
					Static175.aClass4_Sub24_Sub1_1.method3064(Static291.anIntArray457[local15]);
				} else if (arg1 == 6) {
					Static175.aClass4_Sub24_Sub1_1.method3123(93);
					Static175.aClass4_Sub24_Sub1_1.method3064(Static291.anIntArray457[local15]);
					Static175.aClass4_Sub24_Sub1_1.method3097(0);
				} else if (arg1 == 7) {
					Static175.aClass4_Sub24_Sub1_1.method3123(73);
					Static175.aClass4_Sub24_Sub1_1.method3097(0);
					Static175.aClass4_Sub24_Sub1_1.method3105(Static291.anIntArray457[local15]);
				}
				local7 = true;
				break;
			}
		}
		if (!local7) {
			Static173.method2811(0, Static99.aString76 + local13, "");
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILclient!lg;)V")
	public static void method2448(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class97 arg2) {
		if (Static186.aClass97_17 != null || Static137.aBoolean176 || (arg2 == null || Static113.method1908(arg2) == null)) {
			return;
		}
		Static186.aClass97_17 = arg2;
		Static48.aClass97_7 = Static113.method1908(arg2);
		Static139.anInt2751 = 0;
		Static257.anInt5060 = arg0;
		Static85.anInt1726 = arg1;
		Static173.aBoolean229 = false;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([[IIIBII[[F[[FZILclient!bl;IBI[[FI)V")
	public static void method2449(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float[][] arg5, @OriginalArg(7) float[][] arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class4_Sub8 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) byte arg11, @OriginalArg(13) int arg12, @OriginalArg(14) float[][] arg13, @OriginalArg(15) int arg14) {
		@Pc(7) int local7 = (arg2 << 8) + 255;
		@Pc(13) int local13 = (arg1 << 8) + 255;
		@Pc(17) int[] local17 = Static216.anIntArrayArray29[arg3];
		@Pc(23) int local23 = (arg10 << 8) + 255;
		@Pc(25) int[] local25 = null;
		@Pc(31) int local31 = (arg14 << 8) + 255;
		@Pc(37) int[] local37 = new int[local17.length >> 1];
		@Pc(43) int local43;
		for (local43 = 0; local43 < local37.length; local43++) {
			local37[local43] = Static265.method4193(arg5, local13, arg13, local7, local17[local43 + local43], false, local31, arg8, null, local17[local43 + local43 + 1], arg6, local23, arg12, arg11, arg0, arg9, 0.0F);
		}
		if (arg7) {
			@Pc(194) int local194;
			if (arg3 == 1) {
				local25 = new int[6];
				local43 = Static265.method4193(arg5, local13, arg13, local7, 64, true, local31, arg8, null, 128, arg6, local23, arg12, arg11, arg0, arg9, 0.0F);
				local194 = Static265.method4193(arg5, local13, arg13, local7, 128, true, local31, arg8, null, 64, arg6, local23, arg12, arg11, arg0, arg9, 0.0F);
				local25[2] = local37[2];
				local25[3] = local43;
				local25[0] = local194;
				local25[5] = local37[2];
				local25[4] = local37[0];
				local25[1] = local43;
			} else if (arg3 == 2) {
				local43 = Static265.method4193(arg5, local13, arg13, local7, 128, true, local31, arg8, null, 128, arg6, local23, arg12, arg11, arg0, arg9, 0.0F);
				local25 = new int[6];
				local194 = Static265.method4193(arg5, local13, arg13, local7, 64, true, local31, arg8, null, 0, arg6, local23, arg12, arg11, arg0, arg9, 0.0F);
				local25[0] = local37[0];
				local25[3] = local43;
				local25[2] = local43;
				local25[5] = local37[0];
				local25[1] = local194;
				local25[4] = local37[1];
			} else if (arg3 == 3) {
				local43 = Static265.method4193(arg5, local13, arg13, local7, 0, true, local31, arg8, null, 128, arg6, local23, arg12, arg11, arg0, arg9, 0.0F);
				local194 = Static265.method4193(arg5, local13, arg13, local7, 64, true, local31, arg8, null, 0, arg6, local23, arg12, arg11, arg0, arg9, 0.0F);
				local25 = new int[] { local37[2], local37[1], local43, local43, local194, local37[2] };
			} else if (arg3 == 4) {
				local25 = new int[3];
				local43 = Static265.method4193(arg5, local13, arg13, local7, 0, true, local31, arg8, null, 128, arg6, local23, arg12, arg11, arg0, arg9, 0.0F);
				local25[0] = local37[3];
				local25[1] = local43;
				local25[2] = local37[0];
			} else if (arg3 == 5) {
				local43 = Static265.method4193(arg5, local13, arg13, local7, 128, true, local31, arg8, null, 128, arg6, local23, arg12, arg11, arg0, arg9, 0.0F);
				local25 = new int[] { local37[2], local43, local37[3] };
			} else if (arg3 == 6) {
				local43 = Static265.method4193(arg5, local13, arg13, local7, 128, true, local31, arg8, null, 0, arg6, local23, arg12, arg11, arg0, arg9, 0.0F);
				local25 = new int[6];
				local194 = Static265.method4193(arg5, local13, arg13, local7, 128, true, local31, arg8, null, 128, arg6, local23, arg12, arg11, arg0, arg9, 0.0F);
				local25[1] = local43;
				local25[0] = local37[3];
				local25[3] = local194;
				local25[5] = local37[3];
				local25[2] = local194;
				local25[4] = local37[0];
			} else if (arg3 == 7) {
				local25 = new int[6];
				local43 = Static265.method4193(arg5, local13, arg13, local7, 0, true, local31, arg8, null, 128, arg6, local23, arg12, arg11, arg0, arg9, 0.0F);
				local194 = Static265.method4193(arg5, local13, arg13, local7, 128, true, local31, arg8, null, 0, arg6, local23, arg12, arg11, arg0, arg9, 0.0F);
				local25[3] = local43;
				local25[0] = local37[1];
				local25[2] = local43;
				local25[1] = local194;
				local25[5] = local37[1];
				local25[4] = local37[2];
			} else if (arg3 == 8) {
				local43 = Static265.method4193(arg5, local13, arg13, local7, 0, true, local31, arg8, null, 0, arg6, local23, arg12, arg11, arg0, arg9, 0.0F);
				local25 = new int[] { local37[3], local43, local37[4] };
			} else if (arg3 == 9) {
				local25 = new int[15];
				local43 = Static265.method4193(arg5, local13, arg13, local7, 128, true, local31, arg8, null, 64, arg6, local23, arg12, arg11, arg0, arg9, 0.0F);
				local194 = Static265.method4193(arg5, local13, arg13, local7, 96, true, local31, arg8, null, 32, arg6, local23, arg12, arg11, arg0, arg9, 0.0F);
				@Pc(722) int local722 = Static265.method4193(arg5, local13, arg13, local7, 64, true, local31, arg8, null, 0, arg6, local23, arg12, arg11, arg0, arg9, 0.0F);
				local25[14] = local722;
				local25[9] = local194;
				local25[1] = local43;
				local25[12] = local194;
				local25[3] = local194;
				local25[11] = local37[1];
				local25[7] = local37[3];
				local25[0] = local194;
				local25[13] = local37[1];
				local25[5] = local37[3];
				local25[2] = local37[4];
				local25[4] = local37[4];
				local25[8] = local37[2];
				local25[10] = local37[2];
				local25[6] = local194;
			} else if (arg3 == 10) {
				local25 = new int[9];
				local43 = Static265.method4193(arg5, local13, arg13, local7, 0, true, local31, arg8, null, 128, arg6, local23, arg12, arg11, arg0, arg9, 0.0F);
				local25[4] = local43;
				local25[5] = local37[4];
				local25[1] = local43;
				local25[6] = local37[4];
				local25[7] = local43;
				local25[0] = local37[2];
				local25[8] = local37[0];
				local25[2] = local37[3];
				local25[3] = local37[3];
			} else if (arg3 == 11) {
				local25 = new int[12];
				local43 = Static265.method4193(arg5, local13, arg13, local7, 0, true, local31, arg8, null, 64, arg6, local23, arg12, arg11, arg0, arg9, 0.0F);
				local194 = Static265.method4193(arg5, local13, arg13, local7, 128, true, local31, arg8, null, 64, arg6, local23, arg12, arg11, arg0, arg9, 0.0F);
				local25[7] = local194;
				local25[1] = local43;
				local25[5] = local43;
				local25[8] = local43;
				local25[0] = local37[3];
				local25[3] = local37[3];
				local25[10] = local37[1];
				local25[11] = local194;
				local25[2] = local37[0];
				local25[6] = local37[2];
				local25[9] = local37[2];
				local25[4] = local37[2];
			}
		}
		arg9.method573(arg4, arg12, arg8, local37, local25, false);
	}
}
