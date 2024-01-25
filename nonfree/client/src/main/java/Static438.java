import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!pm", name = "D", descriptor = "Lclient!kha;")
	public static Class181 aClass181_82;

	@OriginalMember(owner = "client!pm", name = "H", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("a04de4d8fd16b66290a5590a331e4189285bf63947ce81b587782fb92de6f68d278ec6f46c8416d9151ac3f021686c72d1436e169b3b73c07f62b9eca687f2a34d178e05dd1ed799c03d3953b9b59af99c297db275697afa7d56b49a222e0d59373345e06cd3887a2b3b093564d7f6eeafd38e37e3ea5c62f5985fb3cb490d2b29d503ba315ac9a47d26434cf44dd00971fd68b2531c6402a9731fe4bafeb70140db127b1551b962bfb6fce46c11dbba5f9f49c151594d9e53dfc8a9cc963a72f436611b2f5d0d2a815e9ab907bdb519f682253cc152b633cc3c5dd0955d4443da638d9955b77774541fb6c7d00454980d0b673d60e2983a0c075a11fe6a50e196e3b828cf2ad1816d3d3c70914673158678cb29d6a64b7d15714c1426f527601c25e6276de257c3c5cd389f3b1dbef4901722e178ee05a7782fae1fe591b1f01addee2123c424aa4daa23e0c428e234c6cee33b67ec0c8a49a636c63a0cca859dc77012b9c94901e446b1a4a50aef9c2b54f5ad2b034a0c46d04bee3b03570edca3d75173b1774e6e8b02e03d9962079ad28dbf78079afec120da50b62004bc4f0b0861f27b82586fce91841ec0d6420cd34469d5b1e6e2f830da234fb92473eb49f1b3dc14d427155b5744455293a3cba347ae394aec6d7f49df2ab8fe1def6445cf40f08370498cfd4624be352edbf2af1f197367beda3301e939fe9ca6d9", 16);

	@OriginalMember(owner = "client!pm", name = "N", descriptor = "Z")
	public static final boolean aBoolean676 = false;

	@OriginalMember(owner = "client!pm", name = "P", descriptor = "Lclient!jt;")
	public static final Class167 aClass167_5 = new Class167(0);

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
	public static byte[] method6664(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(29) int local29 = 0; local29 < local8; local29++) {
			@Pc(35) char local35 = arg0.charAt(local29);
			if (local35 > '\u0000' && local35 < '\u0080' || !(local35 < ' ' || local35 > 'ÿ')) {
				local11[local29] = (byte) local35;
			} else if (local35 == '€') {
				local11[local29] = -128;
			} else if (local35 == '‚') {
				local11[local29] = -126;
			} else if (local35 == 'ƒ') {
				local11[local29] = -125;
			} else if (local35 == '„') {
				local11[local29] = -124;
			} else if (local35 == '…') {
				local11[local29] = -123;
			} else if (local35 == '†') {
				local11[local29] = -122;
			} else if (local35 == '‡') {
				local11[local29] = -121;
			} else if (local35 == 'ˆ') {
				local11[local29] = -120;
			} else if (local35 == '‰') {
				local11[local29] = -119;
			} else if (local35 == 'Š') {
				local11[local29] = -118;
			} else if (local35 == '‹') {
				local11[local29] = -117;
			} else if (local35 == 'Œ') {
				local11[local29] = -116;
			} else if (local35 == 'Ž') {
				local11[local29] = -114;
			} else if (local35 == '‘') {
				local11[local29] = -111;
			} else if (local35 == '’') {
				local11[local29] = -110;
			} else if (local35 == '“') {
				local11[local29] = -109;
			} else if (local35 == '”') {
				local11[local29] = -108;
			} else if (local35 == '•') {
				local11[local29] = -107;
			} else if (local35 == '–') {
				local11[local29] = -106;
			} else if (local35 == '—') {
				local11[local29] = -105;
			} else if (local35 == '˜') {
				local11[local29] = -104;
			} else if (local35 == '™') {
				local11[local29] = -103;
			} else if (local35 == 'š') {
				local11[local29] = -102;
			} else if (local35 == '›') {
				local11[local29] = -101;
			} else if (local35 == 'œ') {
				local11[local29] = -100;
			} else if (local35 == 'ž') {
				local11[local29] = -98;
			} else if (local35 == 'Ÿ') {
				local11[local29] = -97;
			} else {
				local11[local29] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIIZIILclient!rl;I)Z")
	public static boolean method6665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class291 arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg3;
		@Pc(9) int local9 = arg1;
		@Pc(18) int local18 = arg3 - 64;
		@Pc(23) int local23 = arg1 - 64;
		Static97.anIntArrayArray23[64][64] = 99;
		Static634.anIntArrayArray103[64][64] = 0;
		@Pc(37) byte local37 = 0;
		Static478.anIntArray606[0] = arg3;
		@Pc(43) int local43 = 0;
		@Pc(46) int local46 = local37 + 1;
		Static273.anIntArray338[0] = arg1;
		@Pc(51) int[][] local51 = arg8.anIntArrayArray89;
		while (local43 != local46) {
			local7 = Static478.anIntArray606[local43];
			local9 = Static273.anIntArray338[local43];
			@Pc(66) int local66 = local9 - local23;
			@Pc(71) int local71 = local7 - local18;
			local43 = local43 + 1 & 0xFFF;
			@Pc(83) int local83 = local7 - arg8.anInt8721;
			@Pc(88) int local88 = local9 - arg8.anInt8715;
			if (arg4 == -4) {
				if (local7 == arg6 && arg2 == local9) {
					Static390.anInt7402 = local7;
					Static243.anInt5476 = local9;
					return true;
				}
			} else if (arg4 == -3) {
				if (Static192.method3820(arg5, local7, arg7, 2, arg6, arg2, 2, local9)) {
					Static243.anInt5476 = local9;
					Static390.anInt7402 = local7;
					return true;
				}
			} else if (arg4 == -2) {
				if (arg8.method7199(2, arg7, arg2, local9, arg5, 2, arg9, arg6, local7)) {
					Static390.anInt7402 = local7;
					Static243.anInt5476 = local9;
					return true;
				}
			} else if (arg4 == -1) {
				if (arg8.method7204(arg6, local7, arg5, arg9, arg2, 2, arg7, local9)) {
					Static243.anInt5476 = local9;
					Static390.anInt7402 = local7;
					return true;
				}
			} else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
				if (arg8.method7210(local9, 2, arg6, arg4, arg0, local7, arg2)) {
					Static243.anInt5476 = local9;
					Static390.anInt7402 = local7;
					return true;
				}
			} else if (arg8.method7203(local9, arg6, arg4, 2, arg0, arg2, local7)) {
				Static390.anInt7402 = local7;
				Static243.anInt5476 = local9;
				return true;
			}
			@Pc(248) int local248 = Static634.anIntArrayArray103[local71][local66] + 1;
			if (local71 > 0 && Static97.anIntArrayArray23[local71 - 1][local66] == 0 && (local51[local83 - 1][local88] & 0x43A40000) == 0 && (local51[local83 - 1][local88 + 1] & 0x4E240000) == 0) {
				Static478.anIntArray606[local46] = local7 - 1;
				Static273.anIntArray338[local46] = local9;
				Static97.anIntArrayArray23[local71 - 1][local66] = 2;
				local46 = local46 + 1 & 0xFFF;
				Static634.anIntArrayArray103[local71 - 1][local66] = local248;
			}
			if (local71 < 126 && Static97.anIntArrayArray23[local71 + 1][local66] == 0 && (local51[local83 + 2][local88] & 0x60E40000) == 0 && (local51[local83 + 2][local88 + 1] & 0x78240000) == 0) {
				Static478.anIntArray606[local46] = local7 + 1;
				Static273.anIntArray338[local46] = local9;
				Static97.anIntArrayArray23[local71 + 1][local66] = 8;
				local46 = local46 + 1 & 0xFFF;
				Static634.anIntArrayArray103[local71 + 1][local66] = local248;
			}
			if (local66 > 0 && Static97.anIntArrayArray23[local71][local66 - 1] == 0 && (local51[local83][local88 - 1] & 0x43A40000) == 0 && (local51[local83 + 1][local88 - 1] & 0x60E40000) == 0) {
				Static478.anIntArray606[local46] = local7;
				Static273.anIntArray338[local46] = local9 - 1;
				Static97.anIntArrayArray23[local71][local66 - 1] = 1;
				local46 = local46 + 1 & 0xFFF;
				Static634.anIntArrayArray103[local71][local66 - 1] = local248;
			}
			if (local66 < 126 && Static97.anIntArrayArray23[local71][local66 + 1] == 0 && (local51[local83][local88 + 2] & 0x4E240000) == 0 && (local51[local83 + 1][local88 + 2] & 0x78240000) == 0) {
				Static478.anIntArray606[local46] = local7;
				Static273.anIntArray338[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static97.anIntArrayArray23[local71][local66 + 1] = 4;
				Static634.anIntArrayArray103[local71][local66 + 1] = local248;
			}
			if (local71 > 0 && local66 > 0 && Static97.anIntArrayArray23[local71 - 1][local66 - 1] == 0 && (local51[local83 - 1][local88] & 0x4FA40000) == 0 && (local51[local83 - 1][local88 - 1] & 0x43A40000) == 0 && (local51[local83][local88 - 1] & 0x63E40000) == 0) {
				Static478.anIntArray606[local46] = local7 - 1;
				Static273.anIntArray338[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static97.anIntArrayArray23[local71 - 1][local66 - 1] = 3;
				Static634.anIntArrayArray103[local71 - 1][local66 - 1] = local248;
			}
			if (local71 < 126 && local66 > 0 && Static97.anIntArrayArray23[local71 + 1][local66 - 1] == 0 && (local51[local83 + 1][local88 - 1] & 0x63E40000) == 0 && (local51[local83 + 2][local88 - 1] & 0x60E40000) == 0 && (local51[local83 + 2][local88] & 0x78E40000) == 0) {
				Static478.anIntArray606[local46] = local7 + 1;
				Static273.anIntArray338[local46] = local9 - 1;
				Static97.anIntArrayArray23[local71 + 1][local66 - 1] = 9;
				local46 = local46 + 1 & 0xFFF;
				Static634.anIntArrayArray103[local71 + 1][local66 - 1] = local248;
			}
			if (local71 > 0 && local66 < 126 && Static97.anIntArrayArray23[local71 - 1][local66 + 1] == 0 && (local51[local83 - 1][local88 + 1] & 0x4FA40000) == 0 && (local51[local83 - 1][local88 + 2] & 0x4E240000) == 0 && (local51[local83][local88 + 2] & 0x7E240000) == 0) {
				Static478.anIntArray606[local46] = local7 - 1;
				Static273.anIntArray338[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static97.anIntArrayArray23[local71 - 1][local66 + 1] = 6;
				Static634.anIntArrayArray103[local71 - 1][local66 + 1] = local248;
			}
			if (local71 < 126 && local66 < 126 && Static97.anIntArrayArray23[local71 + 1][local66 + 1] == 0 && (local51[local83 + 1][local88 + 2] & 0x7E240000) == 0 && (local51[local83 + 2][local88 + 2] & 0x78240000) == 0 && (local51[local83 + 2][local88 + 1] & 0x78E40000) == 0) {
				Static478.anIntArray606[local46] = local7 + 1;
				Static273.anIntArray338[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static97.anIntArrayArray23[local71 + 1][local66 + 1] = 12;
				Static634.anIntArrayArray103[local71 + 1][local66 + 1] = local248;
			}
		}
		Static243.anInt5476 = local9;
		Static390.anInt7402 = local7;
		return false;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(II)V")
	public static void method6667(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = Static251.anInt5580 - Static374.anInt7101;
		if (local8 >= 100) {
			Static516.anInt9019 = 1;
			Static155.anInt3810 = -1;
			Static531.anInt9157 = -1;
			return;
		}
		@Pc(23) int local23 = (int) Static103.aFloat96;
		if (Static239.anInt5443 >> 8 > local23) {
			local23 = Static239.anInt5443 >> 8;
		}
		if (Static479.aBooleanArray20[4] && Static248.anIntArray316[4] + 128 > local23) {
			local23 = Static248.anIntArray316[4] + 128;
		}
		@Pc(60) int local60 = (int) Static502.aFloat230 + Static88.anInt2309 & 0x3FFF;
		Static73.method1849(Static202.method3958(Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10424, Static552.anInt9440, Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10428) - 200, (local23 >> 3) * 3 + 600 << 2, Static242.anInt5467, arg0, Static77.anInt3996, local23, local60);
		@Pc(105) float local105 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static289.anInt5908 = (int) (local105 * (float) (Static289.anInt5908 - Static402.anInt8217) + (float) Static402.anInt8217);
		Static299.anInt8877 = (int) ((float) (Static299.anInt8877 - Static428.anInt7858) * local105 + (float) Static428.anInt7858);
		Static641.anInt10516 = (int) ((float) Static255.anInt5644 + local105 * (float) (Static641.anInt10516 - Static255.anInt5644));
		Static465.anInt8425 = (int) ((float) Static106.anInt2666 + local105 * (float) (Static465.anInt8425 - Static106.anInt2666));
		@Pc(156) int local156 = Static166.anInt3989 - Static17.anInt193;
		if (local156 > 8192) {
			local156 -= 16384;
		} else if (local156 < -8192) {
			local156 += 16384;
		}
		Static166.anInt3989 = (int) ((float) local156 * local105 + (float) Static17.anInt193);
		Static166.anInt3989 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(IB)Z")
	public static boolean method6668(@OriginalArg(0) int arg0) {
		if (arg0 == 15 || arg0 == 60 || arg0 == 17 || arg0 == 22 || arg0 == 8) {
			return true;
		} else {
			return arg0 == 58 || arg0 == 1012;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V")
	public static void method6669() {
		for (@Pc(7) int local7 = 0; local7 < Static111.anInt2930; local7++) {
			@Pc(18) int local18 = Static480.anIntArray536[local7];
			@Pc(26) Class2_Sub3_Sub1_Sub2_Sub1 local26 = ((Class3_Sub49) Static60.aClass307_6.method7424((long) local18)).aClass2_Sub3_Sub1_Sub2_Sub1_2;
			@Pc(30) int local30 = Static281.aClass3_Sub15_Sub1_4.method8401();
			if ((local30 & 0x20) != 0) {
				local30 += Static281.aClass3_Sub15_Sub1_4.method8401() << 8;
			}
			@Pc(53) int local53;
			@Pc(57) int local57;
			@Pc(66) int local66;
			@Pc(70) int local70;
			@Pc(76) int local76;
			if ((local30 & 0x40) != 0) {
				local53 = Static281.aClass3_Sub15_Sub1_4.method8414();
				local57 = Static281.aClass3_Sub15_Sub1_4.method8463();
				if (local53 == 65535) {
					local53 = -1;
				}
				local66 = Static281.aClass3_Sub15_Sub1_4.method8424();
				local70 = local66 & 0x7;
				local76 = local66 >> 3 & 0xF;
				if (local76 == 15) {
					local76 = -1;
				}
				local26.method5315(local57, local76, false, local53, local70);
			}
			if ((local30 & 0x80) != 0) {
				if (local26.aClass22_1.method422()) {
					Static9.method113(local26);
				}
				local26.method2679(Static604.aClass139_2.method4345(Static281.aClass3_Sub15_Sub1_4.method8429()));
				local26.method5309(local26.aClass22_1.anInt404);
				local26.anInt6275 = local26.aClass22_1.anInt423 << 3;
				if (local26.aClass22_1.method422()) {
					Static493.method7238(local26.anIntArray378[0], null, local26.anIntArray377[0], local26.aByte128, null, 0, local26);
				}
			}
			if ((local30 & 0x1000) != 0) {
				local53 = Static281.aClass3_Sub15_Sub1_4.method8460();
				local57 = Static281.aClass3_Sub15_Sub1_4.method8402();
				if (local53 == 65535) {
					local53 = -1;
				}
				local66 = Static281.aClass3_Sub15_Sub1_4.method8401();
				local70 = local66 & 0x7;
				local76 = local66 >> 3 & 0xF;
				if (local76 == 15) {
					local76 = -1;
				}
				local26.method5315(local57, local76, true, local53, local70);
			}
			if ((local30 & 0x200) != 0) {
				local26.aByte79 = Static281.aClass3_Sub15_Sub1_4.method8438();
				local26.aByte82 = Static281.aClass3_Sub15_Sub1_4.method8443();
				local26.aByte78 = Static281.aClass3_Sub15_Sub1_4.method8440();
				local26.aByte80 = (byte) Static281.aClass3_Sub15_Sub1_4.method8447();
				local26.anInt6274 = Static251.anInt5580 + Static281.aClass3_Sub15_Sub1_4.method8429();
				local26.anInt6268 = Static251.anInt5580 + Static281.aClass3_Sub15_Sub1_4.method8414();
			}
			if ((local30 & 0x8) != 0) {
				local26.anInt2889 = Static281.aClass3_Sub15_Sub1_4.method8460();
				local26.anInt2896 = Static281.aClass3_Sub15_Sub1_4.method8414();
			}
			@Pc(278) int local278;
			@Pc(264) int[] local264;
			@Pc(267) int[] local267;
			if ((local30 & 0x800) != 0) {
				local53 = Static281.aClass3_Sub15_Sub1_4.method8424();
				local264 = new int[local53];
				local267 = new int[local53];
				@Pc(270) int[] local270 = new int[local53];
				for (local76 = 0; local76 < local53; local76++) {
					local278 = Static281.aClass3_Sub15_Sub1_4.method8414();
					if (local278 == 65535) {
						local278 = -1;
					}
					local264[local76] = local278;
					local267[local76] = Static281.aClass3_Sub15_Sub1_4.method8447();
					local270[local76] = Static281.aClass3_Sub15_Sub1_4.method8429();
				}
				Static314.method5349(local264, local267, local26, local270);
			}
			if ((local30 & 0x10) != 0) {
				local26.aString66 = Static281.aClass3_Sub15_Sub1_4.method8413();
				local26.anInt6282 = 100;
			}
			if ((local30 & 0x1) != 0) {
				local53 = Static281.aClass3_Sub15_Sub1_4.method8424();
				if (local53 > 0) {
					for (local57 = 0; local57 < local53; local57++) {
						local70 = -1;
						local76 = -1;
						local66 = Static281.aClass3_Sub15_Sub1_4.method8465();
						local278 = -1;
						if (local66 == 32767) {
							local66 = Static281.aClass3_Sub15_Sub1_4.method8465();
							local76 = Static281.aClass3_Sub15_Sub1_4.method8465();
							local70 = Static281.aClass3_Sub15_Sub1_4.method8465();
							local278 = Static281.aClass3_Sub15_Sub1_4.method8465();
						} else if (local66 == 32766) {
							local66 = -1;
						} else {
							local76 = Static281.aClass3_Sub15_Sub1_4.method8465();
						}
						@Pc(388) int local388 = Static281.aClass3_Sub15_Sub1_4.method8465();
						@Pc(392) int local392 = Static281.aClass3_Sub15_Sub1_4.method8447();
						local26.method5311(local76, Static251.anInt5580, local388, local66, local278, local392, local70);
					}
				}
			}
			if ((local30 & 0x2000) != 0) {
				local26.anInt6330 = Static281.aClass3_Sub15_Sub1_4.method8443();
				local26.anInt6298 = Static281.aClass3_Sub15_Sub1_4.method8443();
				local26.anInt6280 = Static281.aClass3_Sub15_Sub1_4.method8440();
				local26.lb = Static281.aClass3_Sub15_Sub1_4.method8443();
				local26.anInt6278 = Static281.aClass3_Sub15_Sub1_4.method8426() + Static251.anInt5580;
				local26.anInt6290 = Static281.aClass3_Sub15_Sub1_4.method8460() + Static251.anInt5580;
				local26.anInt6271 = Static281.aClass3_Sub15_Sub1_4.method8401();
				local26.anInt6280 += local26.anIntArray378[0];
				local26.anInt6343 = 1;
				local26.anInt6346 = 0;
				local26.lb += local26.anIntArray377[0];
				local26.anInt6330 += local26.anIntArray378[0];
				local26.anInt6298 += local26.anIntArray377[0];
			}
			if ((local30 & 0x4000) != 0) {
				local53 = Static281.aClass3_Sub15_Sub1_4.method8401();
				local264 = new int[local53];
				local267 = new int[local53];
				for (local70 = 0; local70 < local53; local70++) {
					local76 = Static281.aClass3_Sub15_Sub1_4.method8429();
					if ((local76 & 0xC000) == 49152) {
						local278 = Static281.aClass3_Sub15_Sub1_4.method8429();
						local264[local70] = local278 | local76 << 16;
					} else {
						local264[local70] = local76;
					}
					local267[local70] = Static281.aClass3_Sub15_Sub1_4.method8414();
				}
				local26.method5310(local267, local264);
			}
			if ((local30 & 0x2) != 0) {
				local26.anInt6331 = Static281.aClass3_Sub15_Sub1_4.method8460();
				if (local26.anInt6331 == 65535) {
					local26.anInt6331 = -1;
				}
			}
			if ((local30 & 0x4) != 0) {
				@Pc(595) int[] local595 = new int[4];
				for (local57 = 0; local57 < 4; local57++) {
					local595[local57] = Static281.aClass3_Sub15_Sub1_4.method8426();
					if (local595[local57] == 65535) {
						local595[local57] = -1;
					}
				}
				local66 = Static281.aClass3_Sub15_Sub1_4.method8447();
				Static121.method5577(local26, local595, local66);
			}
			if ((local30 & 0x100) != 0) {
				local53 = Static281.aClass3_Sub15_Sub1_4.method8426();
				local26.anInt6338 = Static281.aClass3_Sub15_Sub1_4.method8401();
				local26.anInt6286 = Static281.aClass3_Sub15_Sub1_4.method8447();
				local26.aBoolean532 = (local53 & 0x8000) != 0;
				local26.anInt6334 = local53 & 0x7FFF;
				local26.anInt6320 = Static251.anInt5580 + local26.anInt6334 + local26.anInt6338;
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZII)Z")
	public static boolean method6670(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
