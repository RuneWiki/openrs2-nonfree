import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static641 {

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "Lclient!fca;")
	public static final Class114 aClass114_67 = new Class114();

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
	public static void method8652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16, @OriginalArg(18) boolean arg17) {
		Static521.aBoolean738 = true;
		Static389.aBoolean601 = Static10.aClass65_1.method6892() > 0;
		Static5.aBoolean4 = true;
		Static57.anInt852 = arg1 >> Static588.anInt9672;
		Static481.anInt8080 = arg3 >> Static588.anInt9672;
		Static66.anInt6449 = arg1;
		Static309.anInt5881 = arg3;
		Static592.anInt9719 = arg2;
		Static521.anInt8682 = Static57.anInt852 - Static187.anInt6996;
		if (Static521.anInt8682 < 0) {
			Static411.anInt7311 = -Static521.anInt8682;
			Static521.anInt8682 = 0;
		} else {
			Static411.anInt7311 = 0;
		}
		Static450.anInt7698 = Static481.anInt8080 - Static187.anInt6996;
		if (Static450.anInt7698 < 0) {
			Static320.anInt10891 = -Static450.anInt7698;
			Static450.anInt7698 = 0;
		} else {
			Static320.anInt10891 = 0;
		}
		Static23.anInt329 = Static57.anInt852 + Static187.anInt6996;
		if (Static23.anInt329 > Static216.anInt4042) {
			Static23.anInt329 = Static216.anInt4042;
		}
		Static68.anInt1012 = Static481.anInt8080 + Static187.anInt6996;
		if (Static68.anInt1012 > Static233.anInt4238) {
			Static68.anInt1012 = Static233.anInt4238;
		}
		@Pc(72) boolean[][] local72 = Static453.aBooleanArrayArray4;
		@Pc(74) boolean[][] local74 = Static422.aBooleanArrayArray3;
		@Pc(78) int local78;
		@Pc(81) int local81;
		@Pc(83) int local83;
		if (Static5.aBoolean4) {
			for (local78 = 0; local78 < Static187.anInt6996 + Static187.anInt6996 + 2; local78++) {
				local81 = 0;
				local83 = 0;
				for (@Pc(85) int local85 = 0; local85 < Static187.anInt6996 + Static187.anInt6996 + 2; local85++) {
					if (local85 > 1) {
						Static112.anIntArray83[local85 - 2] = local81;
					}
					local81 = local83;
					@Pc(103) int local103 = Static57.anInt852 + local78 - Static187.anInt6996;
					@Pc(109) int local109 = Static481.anInt8080 + local85 - Static187.anInt6996;
					@Pc(123) int local123;
					if (local103 >= 0 && local109 >= 0 && local103 < Static216.anInt4042 && local109 < Static233.anInt4238) {
						local123 = local103 << Static588.anInt9672;
						@Pc(127) int local127 = local109 << Static588.anInt9672;
						@Pc(144) int local144 = Static605.aClass109Array5[Static605.aClass109Array5.length - 1].method7695(local109, local103) - (0x3E8 << Static588.anInt9672 - 7);
						@Pc(166) int local166 = Static111.aClass109Array3 == null ? Static605.aClass109Array5[0].method7695(local109, local103) + Static671.anInt10769 : Static111.aClass109Array3[0].method7695(local109, local103) + Static671.anInt10769;
						local83 = arg15 >= 0 ? Static10.aClass65_1.r(local123, local144, local127, local123, local166, local127, arg15) : Static10.aClass65_1.JA(local123, local144, local127, local123, local166, local127);
						Static422.aBooleanArrayArray3[local78][local85] = local83 == 0;
					} else {
						local83 = -1;
						Static422.aBooleanArrayArray3[local78][local85] = false;
					}
					if (local78 > 0 && local85 > 0) {
						local123 = Static112.anIntArray83[local85 - 1] & Static112.anIntArray83[local85] & local81 & local83;
						Static453.aBooleanArrayArray4[local78 - 1][local85 - 1] = local123 == 0;
					}
				}
				Static112.anIntArray83[Static187.anInt6996 + Static187.anInt6996] = local81;
				Static112.anIntArray83[Static187.anInt6996 + Static187.anInt6996 + 1] = local83;
			}
			if (arg15 >= 0) {
				Static521.aBoolean738 = false;
			} else {
				Static53.anIntArray44 = arg5;
				Static308.anIntArray331 = arg6;
				Static300.anIntArray564 = arg7;
				Static160.anIntArray137 = arg8;
				Static669.anIntArray609 = arg9;
				Static636.method8562(arg10, Static10.aClass65_1);
			}
		} else {
			if (Static153.aBooleanArrayArray2 == null) {
				Static153.aBooleanArrayArray2 = new boolean[Static216.anInt4042 + Static216.anInt4042 + 1][Static233.anInt4238 + Static216.anInt4042 + 1];
			}
			for (local78 = 0; local78 < Static153.aBooleanArrayArray2.length; local78++) {
				for (local81 = 0; local81 < Static153.aBooleanArrayArray2[0].length; local81++) {
					Static153.aBooleanArrayArray2[local78][local81] = true;
				}
			}
			Static422.aBooleanArrayArray3 = Static153.aBooleanArrayArray2;
			Static453.aBooleanArrayArray4 = Static153.aBooleanArrayArray2;
			Static521.anInt8682 = 0;
			Static450.anInt7698 = 0;
			Static23.anInt329 = Static216.anInt4042;
			Static68.anInt1012 = Static233.anInt4238;
			Static521.aBoolean738 = false;
		}
		Static610.method8303(Static10.aClass65_1);
		if (!Static296.aClass270_3.aBoolean649) {
			@Pc(349) Class156 local349 = Static296.aClass270_3.aClass156_6;
			for (@Pc(354) Class28_Sub7 local354 = (Class28_Sub7) local349.method3776(); local354 != null; local354 = (Class28_Sub7) local349.method3783()) {
				local354.method9022();
				Static334.method5129(local354);
			}
		}
		if (Static389.aBoolean601) {
			for (local78 = 0; local78 < Static667.anInt10686; local78++) {
				Static50.aClass199Array1[local78].method4982(arg14, arg0);
			}
		}
		if (Static23.aBoolean21) {
			Static204.anIntArray195 = Static10.aClass65_1.Y();
			Static10.aClass65_1.K(Static358.anIntArray372);
			local78 = (Static358.anIntArray372[2] - Static358.anIntArray372[0]) / Static306.anInt5853;
			for (local81 = 0; local81 < Static306.anInt5853 - 1; local81++) {
				Static481.anIntArray450[local81] = local78 * (local81 + 1) + Static661.anIntArray603[local81];
			}
			for (local83 = 0; local83 < Static393.aClass204Array1.length; local83++) {
				Static393.aClass204Array1[local83].method5075();
			}
		}
		if (Static413.aClass226ArrayArrayArray1 != null) {
			if (Static23.aBoolean21) {
				Static293.method4686(0);
			}
			Static13.method7332(true);
			Static10.aClass65_1.ra(-1, 1583160, 40, 127);
			Static155.method444(true, arg4, arg10, arg11, arg15, arg16, arg17);
			if (Static23.aBoolean21) {
				Static219.method3467();
			}
			Static10.aClass65_1.pa();
			Static13.method7332(false);
		}
		Static155.method444(false, arg4, arg10, arg11, arg15, arg16, arg17);
		if (Static23.aBoolean21) {
			for (local78 = 0; local78 < Static219.anInt4088; local78++) {
				Static194.aBooleanArrayArrayArray1[local78] = Static376.aBooleanArrayArrayArray11[local78];
			}
			Static293.method4686(0);
			for (local81 = 0; local81 < Static393.aClass204Array1.length; local81++) {
				Static393.aClass204Array1[local81].method5075();
			}
		}
		if (Static23.aBoolean21) {
			Static219.method3467();
			for (local78 = 0; local78 < Static219.anInt4088; local78++) {
				Static376.aBooleanArrayArrayArray11[local78] = Static194.aBooleanArrayArrayArray1[local78];
			}
			if (Static581.anInt9529 == 2) {
				@Pc(543) int local543;
				if (Static63.aLongArray3[0] < Static63.aLongArray3[1]) {
					if (Static481.anIntArray450[0] + Static661.anIntArray603[0] > Static358.anIntArray372[0]) {
						local543 = Static661.anIntArray603[0]++;
					}
				} else if (Static63.aLongArray3[0] > Static63.aLongArray3[1] && Static481.anIntArray450[0] + Static661.anIntArray603[0] < Static358.anIntArray372[2]) {
					local543 = Static661.anIntArray603[0]--;
				}
			}
		}
		if (!Static5.aBoolean4) {
			Static453.aBooleanArrayArray4 = local72;
			Static422.aBooleanArrayArray3 = local74;
		}
		Static349.method5306();
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIIIIII)V")
	public static void method8654(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg3 - arg6;
		@Pc(20) int local20 = arg1 - arg6;
		@Pc(24) int local24 = arg3 * arg3;
		@Pc(28) int local28 = arg1 * arg1;
		@Pc(32) int local32 = local15 * local15;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg1 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(69) int local69 = local24 * (1 - local56) + local40;
		@Pc(78) int local78 = local28 - (local56 - 1) * local44;
		@Pc(87) int local87 = (1 - local60) * local32 + local48;
		@Pc(96) int local96 = local36 - local52 * (local60 - 1);
		@Pc(100) int local100 = local24 << 2;
		@Pc(104) int local104 = local28 << 2;
		@Pc(108) int local108 = local32 << 2;
		@Pc(112) int local112 = local36 << 2;
		@Pc(116) int local116 = local40 * 3;
		@Pc(122) int local122 = local44 * (local56 - 3);
		@Pc(126) int local126 = local48 * 3;
		@Pc(132) int local132 = local52 * (local60 - 3);
		@Pc(134) int local134 = local104;
		@Pc(145) int local145 = local100 * (arg1 - 1);
		@Pc(147) int local147 = local112;
		@Pc(153) int local153 = (local20 - 1) * local108;
		@Pc(157) int[] local157 = Static16.anIntArrayArray2[arg0];
		Static197.method3240(arg5 - local15, local157, arg5 - arg3, arg2);
		Static197.method3240(arg5 + local15, local157, arg5 - local15, arg4);
		Static197.method3240(arg3 + arg5, local157, arg5 + local15, arg2);
		while (local9 > 0) {
			@Pc(204) boolean local204 = local20 >= local9;
			if (local69 < 0) {
				while (local69 < 0) {
					local78 += local134;
					local69 += local116;
					local116 += local104;
					local7++;
					local134 += local104;
				}
			}
			if (local204) {
				if (local87 < 0) {
					while (local87 < 0) {
						local96 += local147;
						local87 += local126;
						local147 += local112;
						local11++;
						local126 += local112;
					}
				}
				if (local96 < 0) {
					local96 += local147;
					local87 += local126;
					local11++;
					local147 += local112;
					local126 += local112;
				}
				local96 += -local132;
				local87 += -local153;
				local153 -= local108;
				local132 -= local108;
			}
			if (local78 < 0) {
				local78 += local134;
				local69 += local116;
				local116 += local104;
				local7++;
				local134 += local104;
			}
			local78 += -local122;
			local69 += -local145;
			local145 -= local100;
			local122 -= local100;
			local9--;
			@Pc(341) int local341 = arg0 - local9;
			@Pc(345) int local345 = local9 + arg0;
			@Pc(350) int local350 = arg5 + local7;
			@Pc(354) int local354 = arg5 - local7;
			if (local204) {
				@Pc(379) int local379 = arg5 + local11;
				@Pc(384) int local384 = arg5 - local11;
				Static197.method3240(local384, Static16.anIntArrayArray2[local341], local354, arg2);
				Static197.method3240(local379, Static16.anIntArrayArray2[local341], local384, arg4);
				Static197.method3240(local350, Static16.anIntArrayArray2[local341], local379, arg2);
				Static197.method3240(local384, Static16.anIntArrayArray2[local345], local354, arg2);
				Static197.method3240(local379, Static16.anIntArrayArray2[local345], local384, arg4);
				Static197.method3240(local350, Static16.anIntArrayArray2[local345], local379, arg2);
			} else {
				Static197.method3240(local350, Static16.anIntArrayArray2[local341], local354, arg2);
				Static197.method3240(local350, Static16.anIntArrayArray2[local345], local354, arg2);
			}
		}
	}
}
