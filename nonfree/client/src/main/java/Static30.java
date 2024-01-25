import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray14 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "Lclient!wo;")
	public static final Class266 aClass266_8 = new Class266();

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method492(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) Class1_Sub19 local7 = null;
		for (@Pc(12) Class1_Sub19 local12 = (Class1_Sub19) Static225.aClass266_35.method6000(); local12 != null; local12 = (Class1_Sub19) Static225.aClass266_35.method5994()) {
			if (arg1 == local12.anInt3385 && local12.anInt3387 == arg3 && arg5 == local12.anInt3386 && local12.anInt3378 == arg4) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class1_Sub19();
			local7.anInt3378 = arg4;
			local7.anInt3387 = arg3;
			local7.anInt3385 = arg1;
			local7.anInt3386 = arg5;
			if (arg3 >= 0 && arg5 >= 0 && Static135.anInt2314 > arg3 && Static352.anInt6022 > arg5) {
				Static178.method2762(local7);
			}
			Static225.aClass266_35.method5998(local7);
		}
		local7.anInt3384 = arg2;
		local7.anInt3375 = -1;
		local7.anInt3376 = arg0;
		local7.anInt3383 = arg6;
		local7.anInt3382 = 0;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!vh;I)V")
	public static void method494(@OriginalArg(0) Class250 arg0) {
		Static75.aClass250_16 = arg0;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIIII)V")
	public static void method495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg5 - arg0;
		@Pc(21) int local21 = arg2 - arg0;
		@Pc(25) int local25 = arg5 * arg5;
		@Pc(29) int local29 = arg2 * arg2;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg2 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(71) int local71 = local25 * (1 - local57) + local41;
		@Pc(80) int local80 = local29 - (local57 - 1) * local45;
		@Pc(89) int local89 = local49 + local33 * (1 - local61);
		@Pc(98) int local98 = local37 - (local61 - 1) * local53;
		@Pc(102) int local102 = local25 << 2;
		@Pc(106) int local106 = local29 << 2;
		@Pc(110) int local110 = local33 << 2;
		@Pc(114) int local114 = local37 << 2;
		@Pc(118) int local118 = local41 * 3;
		@Pc(124) int local124 = (local57 - 3) * local45;
		@Pc(128) int local128 = local49 * 3;
		@Pc(134) int local134 = (local61 - 3) * local53;
		@Pc(136) int local136 = local106;
		@Pc(142) int local142 = (arg2 - 1) * local102;
		@Pc(144) int local144 = local114;
		@Pc(169) int local169;
		@Pc(177) int local177;
		@Pc(188) int local188;
		@Pc(196) int local196;
		if (arg4 >= Static305.anInt5429 && arg4 <= Static212.anInt452) {
			@Pc(158) int[] local158 = Static59.anIntArrayArray34[arg4];
			local169 = Static85.method1427(Static221.anInt4001, arg3 - arg5, Static83.anInt7380);
			local177 = Static85.method1427(Static221.anInt4001, arg5 + arg3, Static83.anInt7380);
			local188 = Static85.method1427(Static221.anInt4001, arg3 - local16, Static83.anInt7380);
			local196 = Static85.method1427(Static221.anInt4001, local16 + arg3, Static83.anInt7380);
			Static217.method3280(local158, local169, arg6, local188);
			Static217.method3280(local158, local188, arg1, local196);
			Static217.method3280(local158, local196, arg6, local177);
		}
		@Pc(222) int local222 = local110 * (local21 - 1);
		while (local9 > 0) {
			@Pc(231) boolean local231 = local21 >= local9;
			if (local71 < 0) {
				while (local71 < 0) {
					local80 += local136;
					local71 += local118;
					local136 += local106;
					local118 += local106;
					local7++;
				}
			}
			if (local231) {
				if (local89 < 0) {
					while (local89 < 0) {
						local89 += local128;
						local98 += local144;
						local128 += local114;
						local11++;
						local144 += local114;
					}
				}
				if (local98 < 0) {
					local98 += local144;
					local89 += local128;
					local144 += local114;
					local128 += local114;
					local11++;
				}
				local98 += -local134;
				local89 += -local222;
				local134 -= local110;
				local222 -= local110;
			}
			if (local80 < 0) {
				local80 += local136;
				local71 += local118;
				local136 += local106;
				local118 += local106;
				local7++;
			}
			local80 += -local124;
			local71 += -local142;
			local124 -= local102;
			local9--;
			local142 -= local102;
			local169 = arg4 - local9;
			local177 = arg4 + local9;
			if (local177 >= Static305.anInt5429 && local169 <= Static212.anInt452) {
				local188 = Static85.method1427(Static221.anInt4001, arg3 + local7, Static83.anInt7380);
				local196 = Static85.method1427(Static221.anInt4001, arg3 - local7, Static83.anInt7380);
				if (local231) {
					@Pc(405) int local405 = Static85.method1427(Static221.anInt4001, arg3 + local11, Static83.anInt7380);
					@Pc(414) int local414 = Static85.method1427(Static221.anInt4001, arg3 - local11, Static83.anInt7380);
					@Pc(425) int[] local425;
					if (Static305.anInt5429 <= local169) {
						local425 = Static59.anIntArrayArray34[local169];
						Static217.method3280(local425, local196, arg6, local414);
						Static217.method3280(local425, local414, arg1, local405);
						Static217.method3280(local425, local405, arg6, local188);
					}
					if (Static212.anInt452 >= local177) {
						local425 = Static59.anIntArrayArray34[local177];
						Static217.method3280(local425, local196, arg6, local414);
						Static217.method3280(local425, local414, arg1, local405);
						Static217.method3280(local425, local405, arg6, local188);
					}
				} else {
					if (local169 >= Static305.anInt5429) {
						Static217.method3280(Static59.anIntArrayArray34[local169], local196, arg6, local188);
					}
					if (local177 <= Static212.anInt452) {
						Static217.method3280(Static59.anIntArrayArray34[local177], local196, arg6, local188);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!ir;II)V")
	public static void method496(@OriginalArg(0) Class26_Sub2_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		if (Static403.anInt6978 < arg0.anInt7088) {
			Static215.method3266(arg0);
		} else if (Static403.anInt6978 <= arg0.anInt7103) {
			Static307.method4416(arg0);
		} else {
			Static404.method5461(false, arg0);
			local11 = Static108.anInt1990;
			local13 = Static64.anInt1341;
		}
		if (arg0.anInt7068 < 128 || arg0.anInt7065 < 128 || (Static135.anInt2314 - 1) * 128 <= arg0.anInt7068 || arg0.anInt7065 >= Static352.anInt6022 * 128 - 128) {
			arg0.anInt7103 = 0;
			local11 = -1;
			arg0.anInt7102 = -1;
			arg0.anInt7073 = -1;
			arg0.anInt7119 = -1;
			local13 = 0;
			arg0.anInt7088 = 0;
			arg0.anInt7068 = arg0.anIntArray590[0] * 128 + arg0.method5535() * 64;
			arg0.anInt7065 = arg0.anIntArray589[0] * 128 + arg0.method5535() * 64;
			arg0.method5541();
		}
		if (arg0 == Static196.aClass26_Sub2_Sub2_Sub1_1 && (arg0.anInt7068 < 1536 || arg0.anInt7065 < 1536 || (Static135.anInt2314 - 12) * 128 <= arg0.anInt7068 || arg0.anInt7065 >= Static352.anInt6022 * 128 - 1536)) {
			arg0.anInt7102 = -1;
			local13 = 0;
			local11 = -1;
			arg0.anInt7119 = -1;
			arg0.anInt7073 = -1;
			arg0.anInt7103 = 0;
			arg0.anInt7088 = 0;
			arg0.anInt7068 = arg0.anIntArray590[0] * 128 + arg0.method5535() * 64;
			arg0.anInt7065 = arg0.anIntArray589[0] * 128 + arg0.method5535() * 64;
			arg0.method5541();
		}
		@Pc(210) int local210 = Static123.method1836(arg0);
		Static23.method426(local13, arg0, local11, local210);
		Static150.method2264(arg0);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V")
	public static void method497(@OriginalArg(0) int arg0) {
		Static440.anInt7583 = arg0;
		Static397.anInt6910 = 100;
		Static66.anInt1356 = -1;
		Static273.anInt4877 = 3;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZLjava/awt/Component;)Lclient!oo;")
	public static Class163 method498(@OriginalArg(1) Component arg0) {
		return new Class163_Sub1(arg0);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I[BLjava/lang/String;IIB)I")
	public static int method499(@OriginalArg(1) byte[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10 = arg2;
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			@Pc(25) char local25 = arg1.charAt(local17);
			if (local25 > '\u0000' && local25 < '\u0080' || !(local25 < ' ' || local25 > 'ÿ')) {
				arg0[arg3 + local17] = (byte) local25;
			} else if (local25 == '€') {
				arg0[local17 + arg3] = -128;
			} else if (local25 == '‚') {
				arg0[arg3 + local17] = -126;
			} else if (local25 == 'ƒ') {
				arg0[arg3 + local17] = -125;
			} else if (local25 == '„') {
				arg0[local17 + arg3] = -124;
			} else if (local25 == '…') {
				arg0[arg3 + local17] = -123;
			} else if (local25 == '†') {
				arg0[local17 + arg3] = -122;
			} else if (local25 == '‡') {
				arg0[local17 + arg3] = -121;
			} else if (local25 == 'ˆ') {
				arg0[local17 + arg3] = -120;
			} else if (local25 == '‰') {
				arg0[arg3 + local17] = -119;
			} else if (local25 == 'Š') {
				arg0[local17 + arg3] = -118;
			} else if (local25 == '‹') {
				arg0[arg3 + local17] = -117;
			} else if (local25 == 'Œ') {
				arg0[arg3 + local17] = -116;
			} else if (local25 == 'Ž') {
				arg0[arg3 + local17] = -114;
			} else if (local25 == '‘') {
				arg0[arg3 + local17] = -111;
			} else if (local25 == '’') {
				arg0[local17 + arg3] = -110;
			} else if (local25 == '“') {
				arg0[arg3 + local17] = -109;
			} else if (local25 == '”') {
				arg0[local17 + arg3] = -108;
			} else if (local25 == '•') {
				arg0[local17 + arg3] = -107;
			} else if (local25 == '–') {
				arg0[arg3 + local17] = -106;
			} else if (local25 == '—') {
				arg0[local17 + arg3] = -105;
			} else if (local25 == '˜') {
				arg0[local17 + arg3] = -104;
			} else if (local25 == '™') {
				arg0[local17 + arg3] = -103;
			} else if (local25 == 'š') {
				arg0[local17 + arg3] = -102;
			} else if (local25 == '›') {
				arg0[local17 + arg3] = -101;
			} else if (local25 == 'œ') {
				arg0[arg3 + local17] = -100;
			} else if (local25 == 'ž') {
				arg0[local17 + arg3] = -98;
			} else if (local25 == 'Ÿ') {
				arg0[local17 + arg3] = -97;
			} else {
				arg0[arg3 + local17] = 63;
			}
		}
		return local10;
	}
}
