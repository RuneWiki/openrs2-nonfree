import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "Lclient!dd;")
	public static Class52 aClass52_7;

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "[Lclient!ha;")
	public static Class35[] aClass35Array18;

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
	public static int anInt3354 = 0;

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_106 = new Class202("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(II[F)[F")
	public static float[] method3003(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(6) float[] local6 = new float[arg0];
		Static553.method3374(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZIILjava/lang/String;)Z")
	public static boolean method3004(@OriginalArg(3) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(41) char local41 = arg0.charAt(local35);
			if (local35 == 0) {
				if (local41 == '-') {
					local26 = true;
					continue;
				}
				if (local41 == '+') {
					continue;
				}
			}
			@Pc(89) int local89;
			if (local41 >= '0' && local41 <= '9') {
				local89 = local41 - '0';
			} else if (local41 >= 'A' && local41 <= 'Z') {
				local89 = local41 - '7';
			} else if (local41 >= 'a' && local41 <= 'z') {
				local89 = local41 - 'W';
			} else {
				return false;
			}
			if (local89 >= 10) {
				return false;
			}
			if (local26) {
				local89 = -local89;
			}
			@Pc(117) int local117 = local89 + local30 * 10;
			if (local30 != local117 / 10) {
				return false;
			}
			local28 = true;
			local30 = local117;
		}
		return local28;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIZIB)V")
	public static void method3006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		if (Static399.aClass262ArrayArrayArray2 == null) {
			Static103.aClass39_3.method6052(arg1, -16777216, arg2, arg0, arg4);
		} else if (Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7660 >= 0 && Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7660 < Static363.anInt1158 * 128 && Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7659 >= 0 && Static511.anInt8889 * 128 > Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7659) {
			Static313.anInt6819++;
			if (Static266.aClass1_Sub1_Sub2_Sub1_1 != null && Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7660 + 64 - Static266.aClass1_Sub1_Sub2_Sub1_1.method4394() * 64 >> 7 == Static440.anInt8023 && Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7659 - (Static266.aClass1_Sub1_Sub2_Sub1_1.method4394() - 1) * 64 >> 7 == Static203.anInt3677) {
				Static203.anInt3677 = -1;
				Static440.anInt8023 = -1;
				Static347.method5459();
			}
			Static409.method6413();
			if (!arg3) {
				Static209.method3335();
			}
			Static494.method7275();
			Static241.method3722(arg4, arg2, true, arg1, arg0);
			@Pc(122) int local122 = Static265.anInt6990;
			@Pc(124) int local124 = Static273.anInt4974;
			@Pc(126) int local126 = Static104.anInt2002;
			@Pc(128) int local128 = Static77.anInt1645;
			@Pc(145) int local145;
			@Pc(176) int local176;
			if (Static427.anInt7875 == 1) {
				local145 = (int) Static265.aFloat182;
				if (local145 < Static284.anInt9397 >> 8) {
					local145 = Static284.anInt9397 >> 8;
				}
				if (Static352.aBooleanArray29[4] && Static165.anIntArray350[4] + 128 > local145) {
					local145 = Static165.anIntArray350[4] + 128;
				}
				local176 = (int) Static161.aFloat56 + Static114.anInt2317 & 0x3FFF;
				Static233.method6721(Static169.anInt3089, local126, local145, Static31.anInt5633, Static200.method3233(Static208.anInt3742, Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7660, Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7659) - 50, (local145 >> 3) * 3 + 600 << 0, local176);
			} else if (Static427.anInt7875 == 4) {
				local145 = (int) Static265.aFloat182;
				if (Static284.anInt9397 >> 8 > local145) {
					local145 = Static284.anInt9397 >> 8;
				}
				if (Static352.aBooleanArray29[4] && local145 < Static165.anIntArray350[4] + 128) {
					local145 = Static165.anIntArray350[4] + 128;
				}
				local176 = (int) Static161.aFloat56 & 0x3FFF;
				Static233.method6721(Static169.anInt3089, local126, local145, Static31.anInt5633, Static200.method3233(Static208.anInt3742, Static4.anInt115, Static365.anInt6883) - 50, 600 - -((local145 >> 3) * 3) << 0, local176);
			} else if (Static427.anInt7875 == 5) {
				Static161.method2732(local126);
			}
			local145 = Static187.anInt3432;
			local176 = Static329.anInt3848;
			@Pc(270) int local270 = Static353.anInt5258;
			@Pc(277) int local277 = Static209.anInt3769;
			@Pc(279) int local279 = Static429.anInt7997;
			@Pc(323) int local323;
			for (@Pc(281) int local281 = 0; local281 < 5; local281++) {
				if (Static352.aBooleanArray29[local281]) {
					local323 = (int) ((double) -Static192.anIntArray380[local281] + Math.random() * (double) (Static192.anIntArray380[local281] * 2 + 1) + Math.sin((double) Static4.anIntArray10[local281] / 100.0D * (double) Static540.anIntArray763[local281]) * (double) Static165.anIntArray350[local281]);
					if (local281 == 4) {
						Static209.anInt3769 += local323;
						if (Static209.anInt3769 < 1024) {
							Static209.anInt3769 = 1024;
						} else if (Static209.anInt3769 > 3072) {
							Static209.anInt3769 = 3072;
						}
					}
					if (local281 == 3) {
						Static429.anInt7997 = local323 + Static429.anInt7997 & 0x3FFF;
					}
					if (local281 == 0) {
						Static187.anInt3432 += local323 << 0;
					}
					if (local281 == 2) {
						Static353.anInt5258 += local323 << 0;
					}
					if (local281 == 1) {
						Static329.anInt3848 += local323 << 0;
					}
				}
			}
			if (Static187.anInt3432 < 0) {
				Static187.anInt3432 = 0;
			}
			if (Static187.anInt3432 > (Static515.anInt3809 << 7) - 1) {
				Static187.anInt3432 = (Static515.anInt3809 << 7) - 1;
			}
			if (Static353.anInt5258 < 0) {
				Static353.anInt5258 = 0;
			}
			if ((Static315.anInt5693 << 7) - 1 < Static353.anInt5258) {
				Static353.anInt5258 = (Static315.anInt5693 << 7) - 1;
			}
			Static382.method5986();
			Static55.method1020();
			Static103.aClass39_3.N(local122, local128, local124 + local122, local128 + local126);
			Static103.aClass39_3.method6056();
			local323 = Static169.anInt3087;
			if (Static26.aClass191_1 == null) {
				Static103.aClass39_3.Z(local323);
			} else {
				Static26.aClass191_1.method4744(local126, local124, local323, Static429.anInt7997, local128, Static103.aClass39_3, Static209.anInt3769, local122, Static120.anInt2435 << 3);
			}
			Static491.method6549();
			Static338.aClass181_13.B(Static187.anInt3432, Static329.anInt3848, Static353.anInt5258, -Static209.anInt3769 & 0x3FFF, -Static429.anInt7997 & 0x3FFF, -Static344.anInt6362 & 0x3FFF);
			Static103.aClass39_3.method6015(Static338.aClass181_13);
			Static103.aClass39_3.b(local122 + local124 / 2, local128 - -(local126 / 2), Static32.anInt592 << 1, Static32.anInt592 << 1);
			Static510.method7459(local122 + local124 / 2, Static32.anInt592 << 1, Static32.anInt592 << 1, local126 / 2 + local128);
			Static146.method2563(Static353.anInt5258, Static329.anInt3848, -Static209.anInt3769 & 0x3FFF, Static187.anInt3432, -Static344.anInt6362 & 0x3FFF, -Static429.anInt7997 & 0x3FFF);
			@Pc(570) byte local570 = Static281.aClass2_Sub19_Sub1_1.method2160(Static266.anInt4923) == 2 ? (byte) Static313.anInt6819 : 1;
			Static141.method7497(Static103.aClass39_3, Static115.anInt2326, Static178.anInt3308, Static338.aClass181_13, Static187.anInt3432, Static329.anInt3848, Static353.anInt5258, Static139.aByteArrayArrayArray8, Static415.anIntArray592, Static358.anIntArray519, Static261.anIntArray438, Static92.anIntArray139, Static211.anIntArray607, Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90 + 1, local570, Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7660 >> 7, Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7659 >> 7, !Static281.aClass2_Sub19_Sub1_1.aBoolean187);
			Static491.method6549();
			if (Static271.anInt8654 == 9) {
				Static60.method1125(local128, local126, local124, local122);
				Static170.method2865(local128, local126, local124, local122);
				Static319.method5093(local128, local124, local126, local122);
				Static367.method5867(local124, local128, local122, local126);
			}
			Static105.method1938();
			Static329.anInt3848 = local176;
			Static187.anInt3432 = local145;
			Static353.anInt5258 = local270;
			Static429.anInt7997 = local279;
			Static209.anInt3769 = local277;
			if (Static105.aBoolean148 && Static100.aClass94_1.method2489() == 0) {
				Static105.aBoolean148 = false;
			}
			if (Static105.aBoolean148) {
				Static103.aClass39_3.method6052(local128, -16777216, local122, local126, local124);
				Static263.method4275(Static477.aClass47_4, false, Static290.aClass202_161.method5139(Static172.anInt6352));
			}
		} else {
			Static103.aClass39_3.method6052(arg1, -16777216, arg2, arg0, arg4);
		}
	}
}
