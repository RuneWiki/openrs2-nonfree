import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!nga", name = "d", descriptor = "Lclient!g;")
	public static Class111 aClass111_4;

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "I")
	public static int anInt6936 = 0;

	@OriginalMember(owner = "client!nga", name = "h", descriptor = "[I")
	public static final int[] anIntArray388 = new int[2];

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lclient!wp;I)V")
	public static void method5682(@OriginalArg(0) Class8_Sub8_Sub2 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static94.anInt6311; local7++) {
			@Pc(13) int local13 = Static488.anIntArray480[local7];
			@Pc(17) Class15_Sub1_Sub2_Sub2_Sub1 local17 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local13];
			@Pc(21) int local21 = arg0.method8525();
			if ((local21 & 0x1) != 0) {
				local21 += arg0.method8525() << 8;
			}
			if ((local21 & 0x1000) != 0) {
				local21 += arg0.method8525() << 16;
			}
			Static163.method3267(arg0, local17, local13, local21);
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(B)V")
	public static void method5683() {
		@Pc(1) Class236 local1 = Static505.aClass236_85;
		synchronized (Static505.aClass236_85) {
			Static505.aClass236_85.method6245();
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(III)I")
	public static int method5684(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14;
		if (arg1 > arg0) {
			local14 = arg0;
			arg0 = arg1;
			arg1 = local14;
		}
		while (arg1 != 0) {
			local14 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local14;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lclient!ha;IBIII)V")
	public static void method5685(@OriginalArg(0) Class16 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		Static580.aClass16_10 = arg0;
		Static114.aClass54_2 = Static580.aClass16_10.method6076();
		Static332.aClass54_5 = Static580.aClass16_10.method6076();
		Static499.aClass54_9 = Static580.aClass16_10.method6076();
		Static86.anIntArray105 = null;
		Static596.anInterface11Array1 = null;
		Static1.anInt10287 = 100;
		Static389.anInt7547 = 100;
		Static105.anInt2774 = 0;
		Static599.method8250(arg2, arg1);
		Static153.anInt3786 = -1;
		Static354.anInt6830 = -1;
		Static64.anInt2000 = -1;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(BIIIIZ)V")
	public static void method5686(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static405.aClass56ArrayArrayArray2 == null) {
			Static171.aClass16_5.method6114(-16777216, arg2, arg1, arg0, arg3);
		} else if (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10301 >= 0 && Static372.anInt7082 * 512 > Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10301 && Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10298 >= 0 && Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10298 < Static218.anInt5023 * 512) {
			Static609.anInt9845++;
			if (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2 != null && Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10301 - (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.method6692() - 1) * 256 >> 9 == Static370.anInt7031 && Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10298 + 256 - Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.method6692() * 256 >> 9 == Static29.anInt1137) {
				Static370.anInt7031 = -1;
				Static29.anInt1137 = -1;
				Static21.method901();
			}
			Static434.method6730();
			if (!arg4) {
				Static457.method6928();
			}
			Static318.method3873();
			Static469.method7021(arg2, true, arg0, arg3, arg1);
			@Pc(112) int local112 = Static563.anInt9711;
			@Pc(114) int local114 = Static60.anInt1929;
			@Pc(116) int local116 = Static603.anInt10259;
			@Pc(118) int local118 = Static122.anInt3287;
			Static115.anInt3009 = Static115.anInt3010;
			@Pc(133) int local133;
			@Pc(164) int local164;
			if (Static427.anInt8005 == 1) {
				local133 = (int) Static64.aFloat44;
				if (Static291.anInt5934 >> 8 > local133) {
					local133 = Static291.anInt5934 >> 8;
				}
				if (Static97.aBooleanArray4[4] && local133 < Static18.anIntArray22[4] + 128) {
					local133 = Static18.anIntArray22[4] + 128;
				}
				local164 = (int) Static499.aFloat185 + Static425.anInt6305 & 0x3FFF;
				Static354.method5607(local164, (local133 >> 3) * 3 + 600 << 2, local133, local118, Static427.anInt8006, Static177.method3098(Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10298, Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10301, Static128.anInt3428) - 200, Static572.anInt9826);
			} else if (Static427.anInt8005 == 4) {
				local133 = (int) Static64.aFloat44;
				if (local133 < Static291.anInt5934 >> 8) {
					local133 = Static291.anInt5934 >> 8;
				}
				if (Static97.aBooleanArray4[4] && local133 < Static18.anIntArray22[4] + 128) {
					local133 = Static18.anIntArray22[4] + 128;
				}
				local164 = (int) Static499.aFloat185 & 0x3FFF;
				Static354.method5607(local164, (local133 >> 3) * 3 + 600 << 2, local133, local118, Static427.anInt8006, Static177.method3098(Static93.anInt2585, Static4.anInt24, Static128.anInt3428) - 200, Static572.anInt9826);
			} else if (Static427.anInt8005 == 5) {
				Static476.method7050(local118);
			}
			local133 = Static637.anInt10650;
			local164 = Static504.anInt8868;
			@Pc(280) int local280 = Static377.anInt7114;
			@Pc(282) int local282 = Static443.anInt8245;
			@Pc(284) int local284 = Static25.anInt1035;
			@Pc(328) int local328;
			for (@Pc(286) int local286 = 0; local286 < 5; local286++) {
				if (Static97.aBooleanArray4[local286]) {
					local328 = (int) ((double) -Static303.anIntArray354[local286] + Math.random() * (double) (Static303.anIntArray354[local286] * 2 + 1) + Math.sin((double) Static562.anIntArray535[local286] / 100.0D * (double) Static626.anIntArray615[local286]) * (double) Static18.anIntArray22[local286]);
					if (local286 == 1) {
						Static504.anInt8868 += local328 << 2;
					}
					if (local286 == 2) {
						Static377.anInt7114 += local328 << 2;
					}
					if (local286 == 3) {
						Static25.anInt1035 = Static25.anInt1035 + local328 & 0x3FFF;
					}
					if (local286 == 0) {
						Static637.anInt10650 += local328 << 2;
					}
					if (local286 == 4) {
						Static443.anInt8245 += local328;
						if (Static443.anInt8245 < 1024) {
							Static443.anInt8245 = 1024;
						} else if (Static443.anInt8245 > 3072) {
							Static443.anInt8245 = 3072;
						}
					}
				}
			}
			if (Static637.anInt10650 < 0) {
				Static637.anInt10650 = 0;
			}
			if (Static377.anInt7114 < 0) {
				Static377.anInt7114 = 0;
			}
			if (Static637.anInt10650 > (Static489.anInt8688 << 9) - 1) {
				Static637.anInt10650 = (Static489.anInt8688 << 9) - 1;
			}
			if ((Static596.anInt10195 << 9) - 1 < Static377.anInt7114) {
				Static377.anInt7114 = (Static596.anInt10195 << 9) - 1;
			}
			Static433.method6718();
			Static623.method5387();
			Static171.aClass16_5.KA(local114, local116, local112 + local114, local116 - -local118);
			Static427.method6639(true);
			if (Static513.aBoolean642) {
				Static389.method6230(Static237.anInt5337);
				if (Static280.anInt5800 != Static115.anInt3009) {
					Static147.aBoolean271 = true;
				}
				Static280.anInt5800 = Static115.anInt3009;
			} else {
				Static171.aClass16_5.ya();
				local328 = Static237.anInt5337;
				if (Static328.aClass203_5 == null) {
					Static171.aClass16_5.GA(local328);
				} else {
					Static328.aClass203_5.method5421(local112, local328, Static83.anInt2471 << 3, local118, Static443.anInt8245, Static25.anInt1035, Static171.aClass16_5, local114, local116);
				}
			}
			Static92.method2160();
			Static3.aClass54_1.method5127(Static637.anInt10650, Static504.anInt8868, Static377.anInt7114, -Static443.anInt8245 & 0x3FFF, -Static25.anInt1035 & 0x3FFF, -Static512.anInt8976 & 0x3FFF);
			Static171.aClass16_5.method6066(Static3.aClass54_1);
			Static171.aClass16_5.DA(local112 / 2 + local114, local116 + local118 / 2, Static499.anInt8783 << 1, Static499.anInt8783 << 1);
			Static21.method899(Static499.anInt8783 << 1, Static499.anInt8783 << 1, local116 + local118 / 2, local112 / 2 + local114);
			Static510.method7352(-Static25.anInt1035 & 0x3FFF, Static377.anInt7114, Static504.anInt8868, -Static512.anInt8976 & 0x3FFF, Static637.anInt10650, -Static443.anInt8245 & 0x3FFF);
			@Pc(574) byte local574 = Static155.aClass8_Sub25_6.aClass36_Sub3_2.method2233() == 2 ? (byte) Static609.anInt9845 : 1;
			if (Static513.aBoolean642) {
				Static500.method7262(-Static25.anInt1035 & 0x3FFF, -Static443.anInt8245 & 0x3FFF, -Static512.anInt8976 & 0x3FFF);
				Static230.method4277(Static637.anInt10650, Static377.anInt7114, Static115.anInt3009, Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10301 >> 9, Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124 + 1, Static303.anIntArray353, Static504.anInt8868, Static28.aByteArrayArrayArray7, local574, Static435.anInt8192, Static82.anIntArray101, Static155.aClass8_Sub25_6.aClass36_Sub27_1.method8108() == 0, Static37.anIntArray51, Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10298 >> 9, Static86.anIntArray106, Static389.anIntArray409);
			} else {
				Static382.method6145(Static435.anInt8192, Static637.anInt10650, Static504.anInt8868, Static377.anInt7114, Static28.aByteArrayArrayArray7, Static86.anIntArray106, Static303.anIntArray353, Static37.anIntArray51, Static82.anIntArray101, Static389.anIntArray409, Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124 + 1, local574, Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10301 >> 9, Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10298 >> 9, Static155.aClass8_Sub25_6.aClass36_Sub27_1.method8108() == 0, Static183.aBoolean308 ? Static115.anInt3009 : -1, 0, false);
			}
			Static92.method2160();
			if (Static435.anInt8191 == 10) {
				Static355.method5611(local114, local116, local118, local112);
				Static547.method7692(local116, local114, local118, local112);
				Static339.method1902(local114, local112, local116, local118);
				Static42.method1332(local118, local116, local114, local112);
			}
			Static383.method6157();
			Static25.anInt1035 = local284;
			Static443.anInt8245 = local282;
			Static504.anInt8868 = local164;
			Static377.anInt7114 = local280;
			Static637.anInt10650 = local133;
			if (Static50.aBoolean125 && Static499.aClass113_3.method3337() == 0) {
				Static50.aBoolean125 = false;
			}
			if (Static50.aBoolean125) {
				Static171.aClass16_5.method6114(-16777216, local114, local118, local116, local112);
				Static500.method7268(Static634.aClass27_19, false, Static171.aClass16_5, Static121.aClass84_12.method2710(Static372.anInt7083), Static446.aClass345_13);
			}
			Static427.method6639(false);
		} else {
			Static171.aClass16_5.method6114(-16777216, arg2, arg1, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method5687(@OriginalArg(1) Class16 arg0) {
		for (@Pc(10) Class15_Sub8 local10 = (Class15_Sub8) Static266.aClass123_7.method3537(); local10 != null; local10 = (Class15_Sub8) Static266.aClass123_7.method3541()) {
			if (local10.aBoolean570) {
				local10.method6546(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public static void method5688(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(8) String arg7) {
		@Pc(9) Class57 local9 = Static96.aClass57Array1[99];
		for (@Pc(16) int local16 = 99; local16 > 0; local16--) {
			Static96.aClass57Array1[local16] = Static96.aClass57Array1[local16 - 1];
		}
		if (local9 == null) {
			local9 = new Class57(arg2, arg0, arg5, arg6, arg7, arg1, arg4, arg3);
		} else {
			local9.method1880(arg6, arg5, arg7, arg0, arg2, arg3, arg1, arg4);
		}
		Static74.anInt2291++;
		Static96.aClass57Array1[0] = local9;
		Static383.anInt7458 = Static75.anInt2309;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Z)V")
	public static void method5689() {
		if (Static112.anInt2926 <= 0) {
			Static378.aString72 = "";
			return;
		}
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static281.aStringArray16.length; local14++) {
			if (Static281.aStringArray16[local14].indexOf("--> ") != -1) {
				@Pc(27) int local27 = ~Static112.anInt2926;
				local12++;
				if (local27 == ~local12) {
					Static378.aString72 = Static281.aStringArray16[local14].substring(Static281.aStringArray16[local14].indexOf(">") + 2);
					break;
				}
			}
		}
	}
}
