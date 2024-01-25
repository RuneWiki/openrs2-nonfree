import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!kp", name = "h", descriptor = "F")
	public static float aFloat73;

	@OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
	public static int anInt3925;

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "Z")
	public static boolean aBoolean272 = false;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZLclient!lg;)V")
	public static void method3269(@OriginalArg(1) Class146 arg0) {
		@Pc(17) int local17;
		@Pc(27) int local27;
		@Pc(35) int local35;
		@Pc(53) int local53;
		@Pc(60) int local60;
		@Pc(74) int local74;
		@Pc(84) int local84;
		@Pc(88) int local88;
		@Pc(92) int local92;
		@Pc(103) int local103;
		@Pc(46) boolean local46;
		@Pc(64) int local64;
		@Pc(68) int local68;
		@Pc(80) int local80;
		@Pc(199) Class26_Sub2_Sub5 local199;
		if (arg0 == Static4.aClass146_1) {
			local17 = Static173.aClass1_Sub1_Sub1_1.method4130();
			local27 = (local17 >> 4 & 0xF) + Static9.anInt245 * 2;
			local35 = (local17 & 0xF) + Static42.anInt754 * 2;
			local46 = Static173.aClass1_Sub1_Sub1_1.method4130() != 0;
			local53 = local27 + Static173.aClass1_Sub1_Sub1_1.method4112();
			local60 = local35 + Static173.aClass1_Sub1_Sub1_1.method4112();
			local64 = Static173.aClass1_Sub1_Sub1_1.method4100();
			local68 = Static173.aClass1_Sub1_Sub1_1.method4093();
			local74 = Static173.aClass1_Sub1_Sub1_1.method4130() * 4;
			local80 = Static173.aClass1_Sub1_Sub1_1.method4130() * 4;
			local84 = Static173.aClass1_Sub1_Sub1_1.method4093();
			local88 = Static173.aClass1_Sub1_Sub1_1.method4093();
			local92 = Static173.aClass1_Sub1_Sub1_1.method4130();
			if (local92 == 255) {
				local92 = -1;
			}
			local103 = Static173.aClass1_Sub1_Sub1_1.method4130();
			if (local27 >= 0 && local35 >= 0 && local27 < Static135.anInt2314 * 2 && Static135.anInt2314 * 2 > local35 && local53 >= 0 && local60 >= 0 && local53 < Static352.anInt6022 * 2 && Static352.anInt6022 * 2 > local60 && local68 != 65535) {
				local74 <<= 0x0;
				local60 *= 64;
				local27 *= 64;
				local53 = local53 * 64;
				local80 <<= 0x0;
				local35 = local35 * 64;
				local199 = new Class26_Sub2_Sub5(local68, Static167.anInt3119, local27, local35, local74, local84 + Static403.anInt6978, Static403.anInt6978 + local88, local92, local103, local64, local80, local46);
				local199.method4259(local60, Static289.method4078(local53, local60, Static167.anInt3119) - local80, local53, Static403.anInt6978 + local84);
				Static193.aClass266_10.method5998(new Class1_Sub2_Sub8(local199));
			}
			return;
		}
		@Pc(257) int local257;
		if (arg0 == Static437.aClass146_15) {
			local17 = Static173.aClass1_Sub1_Sub1_1.method4130();
			@Pc(241) boolean local241 = (local17 & 0x80) != 0;
			local35 = Static9.anInt245 + (local17 >> 3 & 0x7);
			local257 = Static42.anInt754 + (local17 & 0x7);
			local53 = local35 + Static173.aClass1_Sub1_Sub1_1.method4112();
			local60 = Static173.aClass1_Sub1_Sub1_1.method4112() + local257;
			local64 = Static173.aClass1_Sub1_Sub1_1.method4100();
			local68 = Static173.aClass1_Sub1_Sub1_1.method4093();
			local74 = Static173.aClass1_Sub1_Sub1_1.method4130() * 4;
			local80 = Static173.aClass1_Sub1_Sub1_1.method4130() * 4;
			local84 = Static173.aClass1_Sub1_Sub1_1.method4093();
			local88 = Static173.aClass1_Sub1_Sub1_1.method4093();
			local92 = Static173.aClass1_Sub1_Sub1_1.method4130();
			if (local92 == 255) {
				local92 = -1;
			}
			local103 = Static173.aClass1_Sub1_Sub1_1.method4130();
			if (local35 >= 0 && local257 >= 0 && local35 < Static135.anInt2314 && Static352.anInt6022 > local257 && local53 >= 0 && local60 >= 0 && Static135.anInt2314 > local53 && local60 < Static352.anInt6022 && local68 != 65535) {
				local60 = local60 * 128 + 64;
				local74 <<= 0x0;
				local35 = local35 * 128 + 64;
				local53 = local53 * 128 + 64;
				local257 = local257 * 128 + 64;
				local80 <<= 0x0;
				local199 = new Class26_Sub2_Sub5(local68, Static167.anInt3119, local35, local257, local74, local84 + Static403.anInt6978, local88 + Static403.anInt6978, local92, local103, local64, local80, local241);
				local199.method4259(local60, Static289.method4078(local53, local60, Static167.anInt3119) - local80, local53, local84 + Static403.anInt6978);
				Static193.aClass266_10.method5998(new Class1_Sub2_Sub8(local199));
			}
		} else if (arg0 == Static18.aClass146_2) {
			local17 = Static173.aClass1_Sub1_Sub1_1.method4124();
			local27 = Static173.aClass1_Sub1_Sub1_1.method4118();
			local35 = (local27 >> 4 & 0x7) + Static9.anInt245;
			local257 = Static42.anInt754 + (local27 & 0x7);
			local53 = Static173.aClass1_Sub1_Sub1_1.method4124();
			if (local35 >= 0 && local257 >= 0 && local35 < Static135.anInt2314 && local257 < Static352.anInt6022) {
				Static330.method4639(local257, new Class1_Sub18(local17, local53), Static167.anInt3119, local35);
				Static377.method5162(Static167.anInt3119, local35, local257);
			}
		} else if (arg0 == Static327.aClass146_9) {
			local17 = Static173.aClass1_Sub1_Sub1_1.method4130();
			local27 = (local17 >> 4 & 0x7) + Static9.anInt245;
			local35 = (local17 & 0x7) + Static42.anInt754;
			local257 = Static173.aClass1_Sub1_Sub1_1.method4093();
			local53 = Static173.aClass1_Sub1_Sub1_1.method4130();
			local60 = Static173.aClass1_Sub1_Sub1_1.method4093();
			local64 = Static173.aClass1_Sub1_Sub1_1.method4130();
			if (local27 >= 0 && local35 >= 0 && local27 < Static135.anInt2314 && Static352.anInt6022 > local35) {
				local68 = local27 * 128 + 64;
				local74 = local35 * 128 + 64;
				local80 = Static167.anInt3119;
				if (local80 < 3 && Static340.method4799(local35, local27)) {
					local80++;
				}
				@Pc(590) Class26_Sub2_Sub3 local590 = new Class26_Sub2_Sub3(local257, local60, Static403.anInt6978, Static167.anInt3119, local80, local68, Static289.method4078(local68, local74, Static167.anInt3119) - local53, local74, local27, local27, local35, local35, local64);
				Static136.aClass266_16.method5998(new Class1_Sub2_Sub15(local590));
			}
		} else if (arg0 == Static445.aClass146_17) {
			local17 = Static173.aClass1_Sub1_Sub1_1.method4093();
			local27 = Static173.aClass1_Sub1_Sub1_1.method4130();
			Static71.aClass105_6.method2336(local17).method4384(local27);
		} else if (Static371.aClass146_10 == arg0) {
			local17 = Static173.aClass1_Sub1_Sub1_1.method4130();
			local27 = (local17 >> 4 & 0x7) + Static9.anInt245;
			local35 = Static42.anInt754 + (local17 & 0x7);
			local257 = Static173.aClass1_Sub1_Sub1_1.method4093();
			if (local257 == 65535) {
				local257 = -1;
			}
			local53 = Static173.aClass1_Sub1_Sub1_1.method4130();
			local60 = local53 >> 4 & 0xF;
			local64 = local53 & 0x7;
			local68 = Static173.aClass1_Sub1_Sub1_1.method4130();
			local74 = Static173.aClass1_Sub1_Sub1_1.method4130();
			if (local27 >= 0 && local35 >= 0 && local27 < Static135.anInt2314 && local35 < Static352.anInt6022) {
				local80 = local60 + 1;
				if (local27 - local80 <= Static196.aClass26_Sub2_Sub2_Sub1_1.anIntArray590[0] && Static196.aClass26_Sub2_Sub2_Sub1_1.anIntArray590[0] <= local80 + local27 && Static196.aClass26_Sub2_Sub2_Sub1_1.anIntArray589[0] >= local35 - local80 && local35 + local80 >= Static196.aClass26_Sub2_Sub2_Sub1_1.anIntArray589[0]) {
					Static453.method6085(local64, local68, local74, local257, (local35 << 8) + (local27 << 16) + (Static167.anInt3119 << 24) + local60);
				}
			}
		} else if (arg0 == Static126.aClass146_3) {
			local17 = Static173.aClass1_Sub1_Sub1_1.method4130();
			local27 = (local17 >> 4 & 0x7) + Static9.anInt245;
			local35 = (local17 & 0x7) + Static42.anInt754;
			local257 = Static173.aClass1_Sub1_Sub1_1.method4088();
			local53 = Static173.aClass1_Sub1_Sub1_1.method4088();
			local60 = Static173.aClass1_Sub1_Sub1_1.method4095();
			if (local27 >= 0 && local35 >= 0 && Static135.anInt2314 > local27 && Static352.anInt6022 > local35 && Static453.anInt7845 != local257) {
				Static330.method4639(local35, new Class1_Sub18(local53, local60), Static167.anInt3119, local27);
				Static377.method5162(Static167.anInt3119, local27, local35);
			}
		} else if (Static286.aClass146_7 == arg0) {
			local17 = Static173.aClass1_Sub1_Sub1_1.method4118();
			local27 = (local17 >> 4 & 0x7) + Static9.anInt245;
			local35 = (local17 & 0x7) + Static42.anInt754;
			local257 = Static173.aClass1_Sub1_Sub1_1.method4118();
			local53 = local257 >> 2;
			local60 = local257 & 0x3;
			local64 = Static127.anIntArray286[local53];
			local68 = Static173.aClass1_Sub1_Sub1_1.method4093();
			if (local68 == 65535) {
				local68 = -1;
			}
			Static378.method5177(Static167.anInt3119, local35, local68, local60, local27, local53, local64);
		} else if (arg0 == Static375.aClass146_11) {
			local17 = Static173.aClass1_Sub1_Sub1_1.method4129();
			local27 = local17 >> 2;
			local35 = local17 & 0x3;
			local257 = Static127.anIntArray286[local27];
			local53 = Static173.aClass1_Sub1_Sub1_1.method4086();
			local60 = (local53 >> 4 & 0x7) + Static9.anInt245;
			local64 = Static42.anInt754 + (local53 & 0x7);
			local68 = Static173.aClass1_Sub1_Sub1_1.method4093();
			if (Static152.method2307(Static12.anInt325) || local60 >= 0 && local64 >= 0 && local60 < Static135.anInt2314 && local64 < Static352.anInt6022) {
				Static30.method492(local68, Static167.anInt3119, local35, local60, local257, local64, local27);
			}
		} else if (Static136.aClass146_4 == arg0) {
			local17 = Static173.aClass1_Sub1_Sub1_1.method4130();
			local27 = (local17 >> 4 & 0x7) + Static9.anInt245;
			local35 = (local17 & 0x7) + Static42.anInt754;
			local257 = Static173.aClass1_Sub1_Sub1_1.method4130();
			local53 = local257 >> 2;
			local60 = local257 & 0x3;
			local64 = Static127.anIntArray286[local53];
			if (Static152.method2307(Static12.anInt325) || local27 >= 0 && local35 >= 0 && local27 < Static135.anInt2314 && local35 < Static352.anInt6022) {
				Static30.method492(-1, Static167.anInt3119, local60, local27, local64, local35, local53);
			}
		} else if (Static384.aClass146_12 == arg0) {
			local17 = Static173.aClass1_Sub1_Sub1_1.method4093();
			@Pc(1048) byte local1048 = Static173.aClass1_Sub1_Sub1_1.method4112();
			local35 = Static173.aClass1_Sub1_Sub1_1.method4118();
			local257 = local35 >> 2;
			local53 = local35 & 0x3;
			local60 = Static173.aClass1_Sub1_Sub1_1.method4093();
			local64 = Static173.aClass1_Sub1_Sub1_1.method4111();
			local68 = Static173.aClass1_Sub1_Sub1_1.method4124();
			local74 = Static173.aClass1_Sub1_Sub1_1.method4129();
			local80 = Static9.anInt245 + (local74 >> 4 & 0x7);
			local84 = Static42.anInt754 + (local74 & 0x7);
			@Pc(1095) byte local1095 = Static173.aClass1_Sub1_Sub1_1.method4112();
			@Pc(1099) byte local1099 = Static173.aClass1_Sub1_Sub1_1.method4112();
			@Pc(1103) byte local1103 = Static173.aClass1_Sub1_Sub1_1.method4128();
			if (!Static276.aClass109_10.method4703()) {
				Static165.method2662(local1048, local53, local1095, local84, local68, local1099, local17, local60, local80, local257, local64, local1103, Static167.anInt3119);
			}
		} else if (arg0 == Static437.aClass146_16) {
			local17 = Static173.aClass1_Sub1_Sub1_1.method4130();
			local27 = Static9.anInt245 * 2 + (local17 >> 4 & 0xF);
			local35 = Static42.anInt754 * 2 + (local17 & 0xF);
			local46 = Static173.aClass1_Sub1_Sub1_1.method4130() != 0;
			local53 = Static173.aClass1_Sub1_Sub1_1.method4112() + local27;
			local60 = local35 + Static173.aClass1_Sub1_Sub1_1.method4112();
			local64 = Static173.aClass1_Sub1_Sub1_1.method4100();
			local68 = Static173.aClass1_Sub1_Sub1_1.method4100();
			local74 = Static173.aClass1_Sub1_Sub1_1.method4093();
			@Pc(1185) byte local1185 = Static173.aClass1_Sub1_Sub1_1.method4112();
			local84 = Static173.aClass1_Sub1_Sub1_1.method4130() * 4;
			local88 = Static173.aClass1_Sub1_Sub1_1.method4093();
			local92 = Static173.aClass1_Sub1_Sub1_1.method4093();
			local103 = Static173.aClass1_Sub1_Sub1_1.method4130();
			@Pc(1207) int local1207 = Static173.aClass1_Sub1_Sub1_1.method4130();
			if (local103 == 255) {
				local103 = -1;
			}
			if (local27 >= 0 && local35 >= 0 && Static135.anInt2314 * 2 > local27 && local35 < Static135.anInt2314 * 2 && local53 >= 0 && local60 >= 0 && local53 < Static352.anInt6022 * 2 && local60 < Static352.anInt6022 * 2 && local74 != 65535) {
				local35 *= 64;
				local84 <<= 0x0;
				local80 = local1185 << 0;
				local60 *= 64;
				local53 = local53 * 64;
				local27 = local27 * 64;
				if (local64 != 0) {
					@Pc(1316) int local1316;
					@Pc(1320) Class26_Sub2_Sub2 local1320;
					@Pc(1306) int local1306;
					@Pc(1310) int local1310;
					if (local64 >= 0) {
						local1306 = local64 - 1;
						local1310 = local1306 & 0x7FF;
						local1316 = local1306 >> 11 & 0xF;
						local1320 = Static410.aClass26_Sub2_Sub2_Sub2Array1[local1310];
					} else {
						local1306 = -local64 - 1;
						local1310 = local1306 & 0x7FF;
						local1316 = local1306 >> 11 & 0xF;
						if (local1310 == Static453.anInt7845) {
							local1320 = Static196.aClass26_Sub2_Sub2_Sub1_1;
						} else {
							local1320 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local1310];
						}
					}
					if (local1320 != null) {
						@Pc(1354) Class164 local1354 = local1320.method5533();
						if (local1354.anIntArrayArray130 != null && local1354.anIntArrayArray130[local1316] != null) {
							local1310 = local1354.anIntArrayArray130[local1316][0];
							@Pc(1376) int local1376 = local1354.anIntArrayArray130[local1316][2];
							@Pc(1381) int local1381 = local1320.aClass255_7.method5749();
							@Pc(1385) int local1385 = Class4.anIntArray7[local1381];
							@Pc(1389) int local1389 = Class4.anIntArray6[local1381];
							@Pc(1399) int local1399 = local1389 * local1310 + local1385 * local1376 >> 15;
							@Pc(1410) int local1410 = local1389 * local1376 - local1385 * local1310 >> 15;
							local80 -= local1354.anIntArrayArray130[local1316][1];
							local27 += local1399;
							local35 += local1410;
						}
					}
				}
				@Pc(1449) Class26_Sub2_Sub5 local1449 = new Class26_Sub2_Sub5(local74, Static167.anInt3119, local27, local35, local80, Static403.anInt6978 + local88, Static403.anInt6978 + local92, local103, local1207, local68, local84, local46);
				local1449.method4259(local60, Static289.method4078(local53, local60, Static167.anInt3119) - local84, local53, local88 + Static403.anInt6978);
				Static193.aClass266_10.method5998(new Class1_Sub2_Sub8(local1449));
			}
		} else if (arg0 == Static455.aClass146_8) {
			Static173.aClass1_Sub1_Sub1_1.method4130();
			local17 = Static173.aClass1_Sub1_Sub1_1.method4130();
			local27 = Static9.anInt245 + (local17 >> 4 & 0x7);
			local35 = (local17 & 0x7) + Static42.anInt754;
			local257 = Static173.aClass1_Sub1_Sub1_1.method4093();
			local53 = Static173.aClass1_Sub1_Sub1_1.method4130();
			local60 = Static173.aClass1_Sub1_Sub1_1.method4142();
			@Pc(1514) String local1514 = Static173.aClass1_Sub1_Sub1_1.method4137();
			Static314.method3276(local53, local1514, local27, local35, Static167.anInt3119, local257, local60);
		} else if (Static395.aClass146_13 == arg0) {
			local17 = Static173.aClass1_Sub1_Sub1_1.method4093();
			local27 = Static173.aClass1_Sub1_Sub1_1.method4118();
			local35 = (local27 >> 4 & 0x7) + Static9.anInt245;
			local257 = (local27 & 0x7) + Static42.anInt754;
			if (local35 >= 0 && local257 >= 0 && local35 < Static135.anInt2314 && Static352.anInt6022 > local257) {
				@Pc(1581) Class1_Sub20 local1581 = (Class1_Sub20) Static184.aClass27_23.method553((long) (local35 | local257 << 14 | Static167.anInt3119 << 28));
				if (local1581 != null) {
					for (@Pc(1589) Class1_Sub18 local1589 = (Class1_Sub18) local1581.aClass266_29.method6000(); local1589 != null; local1589 = (Class1_Sub18) local1581.aClass266_29.method5994()) {
						if ((local17 & 0x7FFF) == local1589.anInt3167) {
							local1589.method6071();
							break;
						}
					}
					if (local1581.aClass266_29.method5996()) {
						local1581.method6071();
					}
					Static377.method5162(Static167.anInt3119, local35, local257);
				}
			}
		} else if (arg0 == Static430.aClass146_14) {
			local17 = Static173.aClass1_Sub1_Sub1_1.method4130();
			local27 = (local17 >> 4 & 0x7) + Static9.anInt245;
			local35 = (local17 & 0x7) + Static42.anInt754;
			local257 = Static173.aClass1_Sub1_Sub1_1.method4093();
			local53 = Static173.aClass1_Sub1_Sub1_1.method4093();
			local60 = Static173.aClass1_Sub1_Sub1_1.method4093();
			if (Static184.aClass27_23 != null && local27 >= 0 && local35 >= 0 && local27 < Static135.anInt2314 && Static352.anInt6022 > local35) {
				@Pc(1688) Class1_Sub20 local1688 = (Class1_Sub20) Static184.aClass27_23.method553((long) (Static167.anInt3119 << 28 | local35 << 14 | local27));
				if (local1688 != null) {
					for (@Pc(1696) Class1_Sub18 local1696 = (Class1_Sub18) local1688.aClass266_29.method6000(); local1696 != null; local1696 = (Class1_Sub18) local1688.aClass266_29.method5994()) {
						if ((local257 & 0x7FFF) == local1696.anInt3167 && local53 == local1696.anInt3163) {
							local1696.method6071();
							local1696.anInt3163 = local60;
							Static330.method4639(local35, local1696, Static167.anInt3119, local27);
							break;
						}
					}
					Static377.method5162(Static167.anInt3119, local27, local35);
				}
			}
		} else {
			Static315.method4700(null, "T3 - " + arg0);
			Static234.method3459();
		}
	}
}
