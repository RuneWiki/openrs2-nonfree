import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "Lclient!pu;")
	public static Class118_Sub1 aClass118_Sub1_2;

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
	public static int anInt5478;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_76 = new Class134("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIZII)V")
	public static void method4340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static119.anInt2204;
		Static242.anInt3896 = 0;
		@Pc(11) int[] local11 = Static200.anIntArray295;
		@Pc(188) int local188;
		@Pc(213) int local213;
		@Pc(262) int local262;
		@Pc(344) int local344;
		@Pc(437) int local437;
		@Pc(889) int local889;
		@Pc(548) int local548;
		for (@Pc(13) int local13 = 0; local13 < Static351.anInt5969 + local7; local13++) {
			@Pc(17) Class245 local17 = null;
			@Pc(30) Class3_Sub4_Sub1 local30;
			if (local13 < local7) {
				local30 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local11[local13]];
			} else {
				local30 = ((Class2_Sub28) Static49.aClass72_11.method1659((long) Static40.anIntArray84[local13 - local7])).aClass3_Sub4_Sub1_Sub1_1;
				local17 = ((Class3_Sub4_Sub1_Sub1) local30).aClass245_1;
				if (local17.anIntArray560 != null) {
					local17 = local17.method5205(Static138.aClass268_1);
					if (local17 == null) {
						continue;
					}
				}
			}
			if (local30.anInt4972 >= 0 && (local30.anInt4935 == Static197.anInt3347 || local30.aByte91 == Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91)) {
				Static354.method4723(local30.method4012(), arg0 >> 1, arg1 >> 1, local30);
				if (Static31.anIntArray53[0] >= 0) {
					if (local30.aString146 != null && (local7 <= local13 || Static11.anInt160 == 0 || Static11.anInt160 == 3 || Static11.anInt160 == 1 && Static407.method5162(((Class3_Sub4_Sub1_Sub2) local30).aString148)) && Static242.anInt3896 < Static196.anInt3331) {
						Static196.anIntArray283[Static242.anInt3896] = Static241.aClass141_5.method2914(local30.aString146) / 2;
						Static196.anIntArray277[Static242.anInt3896] = Static31.anIntArray53[0];
						Static196.anIntArray281[Static242.anInt3896] = Static31.anIntArray53[1];
						Static196.anIntArray279[Static242.anInt3896] = local30.anInt4914;
						Static196.anIntArray275[Static242.anInt3896] = local30.anInt4896;
						Static196.anIntArray282[Static242.anInt3896] = local30.anInt4961;
						Static196.aStringArray17[Static242.anInt3896] = local30.aString146;
						Static242.anInt3896++;
					}
					local188 = Static31.anIntArray53[1] + arg2;
					@Pc(247) Class13[] local247;
					@Pc(254) Class17[] local254;
					@Pc(316) Class13 local316;
					if (local30.aBoolean351 || Static266.anInt4392 >= local30.anInt4965) {
						local188 -= Math.max(Static241.aClass141_5.anInt3623, Static295.aClass13Array16[0].ZA());
					} else {
						@Pc(199) byte local199 = 1;
						if (local7 > local13) {
							@Pc(208) Class3_Sub4_Sub1_Sub2 local208 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local11[local13]];
							local213 = local30.method4001().anInt4487;
							if (local208.aBoolean358) {
								local199 = 2;
							}
						} else {
							local213 = local17.anInt6737;
							if (local213 == -1) {
								local213 = local30.method4001().anInt4487;
							}
						}
						@Pc(237) Class13[] local237 = Static295.aClass13Array16;
						if (local213 != -1) {
							local247 = (Class13[]) Static343.aClass132_53.method2701((long) local213);
							if (local247 == null) {
								local254 = Static461.method256(Static103.aClass54_28, local213);
								if (local254 != null) {
									local247 = new Class13[local254.length];
									for (local262 = 0; local262 < local254.length; local262++) {
										local247[local262] = Static82.aClass163_1.method5549(local254[local262]);
									}
									Static343.aClass132_53.method2711(local247, (long) local213);
								}
							}
							if (local247 != null && local247.length >= 2) {
								local237 = local247;
							}
						}
						if (local199 >= local237.length) {
							local199 = 1;
						}
						@Pc(312) Class13 local312 = local237[0];
						local316 = local237[local199];
						local188 -= Math.max(Static241.aClass141_5.anInt3623, local312.ZA());
						local262 = Static31.anIntArray53[0] + arg3 - (local312.YA() >> 1);
						local344 = local312.YA() * local30.anInt4925 / 255;
						if (local30.anInt4925 > 0 && local344 < 2) {
							local344 = 2;
						}
						local312.method5668(local262, local188);
						Static82.aClass163_1.HA(local262, local188, local344 + local262, local188 - -local312.ZA());
						local316.method5668(local262, local188);
						Static82.aClass163_1.ba(arg3, arg2, arg0 + arg3, arg1 + arg2);
					}
					local188 -= 2;
					if (!local30.aBoolean351) {
						@Pc(420) Class13 local420;
						if (Static266.anInt4392 < local30.anInt4971) {
							local420 = Static323.aClass13Array7[local30.aBoolean352 ? 2 : 0];
							@Pc(429) Class13 local429 = Static323.aClass13Array7[local30.aBoolean352 ? 3 : 1];
							if (local30 instanceof Class3_Sub4_Sub1_Sub1) {
								local437 = local17.anInt6714;
								if (local437 == -1) {
									local437 = local30.method4001().anInt4489;
								}
							} else {
								local437 = local30.method4001().anInt4489;
							}
							if (local437 != -1) {
								local247 = (Class13[]) Static154.aClass132_18.method2701((long) local437);
								if (local247 == null) {
									local254 = Static461.method256(Static103.aClass54_28, local437);
									if (local254 != null) {
										local247 = new Class13[local254.length];
										for (local262 = 0; local262 < local254.length; local262++) {
											local247[local262] = Static82.aClass163_1.method5549(local254[local262]);
										}
										Static154.aClass132_18.method2711(local247, (long) local437);
									}
								}
								if (local247 != null && local247.length == 4) {
									local420 = local247[local30.aBoolean352 ? 2 : 0];
									local429 = local247[local30.aBoolean352 ? 3 : 1];
								}
							}
							@Pc(541) int local541 = local30.anInt4971 - Static266.anInt4392;
							if (local541 <= local30.anInt4941) {
								local548 = local420.YA();
							} else {
								local541 -= local30.anInt4941;
								local262 = local30.anInt4956 == 0 ? 0 : (local30.anInt4931 - local541) / local30.anInt4956 * local30.anInt4956;
								local548 = local420.YA() * local262 / local30.anInt4931;
							}
							local262 = local420.ZA();
							local188 -= local262;
							local344 = arg3 + Static31.anIntArray53[0] - (local420.YA() >> 1);
							local420.method5668(local344, local188);
							Static82.aClass163_1.HA(local344, local188, local548 + local344, local262 + local188);
							local429.method5668(local344, local188);
							local188 -= 2;
							Static82.aClass163_1.ba(arg3, arg2, arg3 + arg0, arg1 + arg2);
						}
						if (local13 < local7) {
							@Pc(666) Class3_Sub4_Sub1_Sub2 local666 = (Class3_Sub4_Sub1_Sub2) local30;
							if (local666.anInt5006 != -1) {
								local188 -= 25;
								Static303.aClass13Array17[local666.anInt5006].method5668(arg3 + Static31.anIntArray53[0] - 12, local188);
								local188 -= 2;
							}
							if (local666.anInt5009 != -1) {
								local188 -= 25;
								Static32.aClass13Array1[local666.anInt5009].method5668(Static31.anIntArray53[0] + arg3 - 12, local188);
								local188 -= 2;
							}
						} else if (local17.anInt6725 >= 0 && Static32.aClass13Array1.length > local17.anInt6725) {
							local188 -= 25;
							local420 = Static32.aClass13Array1[local17.anInt6725];
							local420.method5668(Static31.anIntArray53[0] + arg3 - (local420.YA() >> 1), local188);
							local188 -= 2;
						}
					}
					@Pc(718) Class185[] local718;
					@Pc(726) Class185 local726;
					if (!(local30 instanceof Class3_Sub4_Sub1_Sub2)) {
						local213 = 0;
						local718 = Static186.aClass185Array5;
						for (local437 = 0; local437 < local718.length; local437++) {
							local726 = local718[local437];
							if (local726 != null && local726.anInt4814 == 1 && Static40.anIntArray84[local13 - local7] == local726.anInt4822) {
								local316 = Static84.aClass13Array4[local726.anInt4818];
								if (local316.ZA() > local213) {
									local213 = local316.ZA();
								}
								if (Static266.anInt4392 % 20 < 10) {
									local316.method5668(Static31.anIntArray53[0] + arg3 - 12, -local316.ZA() + local188);
								}
							}
						}
						if (local213 > 0) {
						}
					} else if (local13 >= 0) {
						local213 = 0;
						local718 = Static186.aClass185Array5;
						for (local437 = 0; local437 < local718.length; local437++) {
							local726 = local718[local437];
							if (local726 != null && local726.anInt4814 == 10 && local11[local13] == local726.anInt4822) {
								local316 = Static84.aClass13Array4[local726.anInt4818];
								if (local316.ZA() > local213) {
									local213 = local316.ZA();
								}
								local316.method5668(arg3 + Static31.anIntArray53[0] - 12, -local316.ZA() + local188);
							}
						}
						if (local213 > 0) {
						}
					}
					for (local213 = 0; local213 < 4; local213++) {
						if (local30.anIntArray423[local213] > Static266.anInt4392) {
							local889 = local30.method4012() / 2;
							Static354.method4723(local889, arg0 >> 1, arg1 >> 1, local30);
							if (Static31.anIntArray53[0] > -1) {
								local437 = Static222.aClass13Array19[local30.anIntArray421[local213]].YA();
								if (local213 == 1) {
									Static31.anIntArray53[1] -= 20;
								}
								if (local213 == 2) {
									Static31.anIntArray53[0] -= local437 - 9;
									Static31.anIntArray53[1] -= 10;
								}
								if (local213 == 3) {
									Static31.anIntArray53[0] += local437 - 9;
									Static31.anIntArray53[1] -= 10;
								}
								Static222.aClass13Array19[local30.anIntArray421[local213]].method5668(arg3 + Static31.anIntArray53[0] - (local437 >> 1), Static31.anIntArray53[1] + -12 + arg2);
								Static46.aClass92_2.method4515(-1, Integer.toString(local30.anIntArray422[local213]), 0, arg2 + Static31.anIntArray53[1] + 3, Static31.anIntArray53[0] + arg3 + -1);
							}
						}
					}
				}
			}
		}
		@Pc(1047) int local1047;
		for (@Pc(1041) int local1041 = 0; local1041 < Static456.anInt7293; local1041++) {
			local1047 = Static197.anIntArray284[local1041];
			@Pc(1062) Class3_Sub4_Sub1 local1062;
			if (local1047 >= 2048) {
				local1062 = ((Class2_Sub28) Static49.aClass72_11.method1659((long) (local1047 - 2048))).aClass3_Sub4_Sub1_Sub1_1;
			} else {
				local1062 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local1047];
			}
			local213 = Static163.anIntArray222[local1041];
			@Pc(1079) Class3_Sub4_Sub1 local1079;
			if (local213 < 2048) {
				local1079 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local213];
			} else {
				local1079 = ((Class2_Sub28) Static49.aClass72_11.method1659((long) (local213 - 2048))).aClass3_Sub4_Sub1_Sub1_1;
			}
			Static217.method2870(arg3, --local1062.anInt4952, arg1, local1079, arg2, arg0, local1062);
		}
		local1047 = Static241.aClass141_5.anInt3623 + Static241.aClass141_5.anInt3614 + 2;
		for (local188 = 0; local188 < Static242.anInt3896; local188++) {
			local213 = Static196.anIntArray277[local188];
			local889 = Static196.anIntArray281[local188];
			local437 = Static196.anIntArray283[local188];
			@Pc(1142) boolean local1142 = true;
			while (local1142) {
				local1142 = false;
				for (local548 = 0; local548 < local188; local548++) {
					if (Static196.anIntArray281[local548] - local1047 < local889 + 2 && Static196.anIntArray281[local548] + 2 > local889 + -local1047 && local213 - local437 < Static196.anIntArray277[local548] - -Static196.anIntArray283[local548] && Static196.anIntArray277[local548] - Static196.anIntArray283[local548] < local213 + local437 && local889 > Static196.anIntArray281[local548] - local1047) {
						local889 = Static196.anIntArray281[local548] - local1047;
						local1142 = true;
					}
				}
			}
			Static196.anIntArray281[local188] = local889;
			@Pc(1234) String local1234 = Static196.aStringArray17[local188];
			if (Static300.anInt4858 == 0) {
				local262 = 16776960;
				if (Static196.anIntArray279[local188] < 6) {
					local262 = Static26.anIntArray42[Static196.anIntArray279[local188]];
				}
				if (Static196.anIntArray279[local188] == 6) {
					local262 = Static197.anInt3347 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static196.anIntArray279[local188] == 7) {
					local262 = Static197.anInt3347 % 20 >= 10 ? 65535 : 255;
				}
				if (Static196.anIntArray279[local188] == 8) {
					local262 = Static197.anInt3347 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static196.anIntArray279[local188] == 9) {
					local344 = 150 - Static196.anIntArray282[local188];
					if (local344 < 50) {
						local262 = local344 * 1280 + 16711680;
					} else if (local344 < 100) {
						local262 = 16384000 + 16776960 - local344 * 327680;
					} else if (local344 < 150) {
						local262 = (local344 - 100) * 5 + 65280;
					}
				}
				if (Static196.anIntArray279[local188] == 10) {
					local344 = 150 - Static196.anIntArray282[local188];
					if (local344 < 50) {
						local262 = local344 * 5 + 16711680;
					} else if (local344 < 100) {
						local262 = 16711935 - (local344 - 50) * 327680;
					} else if (local344 < 150) {
						local262 = local344 * 327680 + 500 + 255 - local344 * 5 - 32768000;
					}
				}
				if (Static196.anIntArray279[local188] == 11) {
					local344 = 150 - Static196.anIntArray282[local188];
					if (local344 < 50) {
						local262 = 16777215 - local344 * 327685;
					} else if (local344 < 100) {
						local262 = local344 * 327685 + 65280 - 16384250;
					} else if (local344 < 150) {
						local262 = 16777215 - (local344 - 100) * 327680;
					}
				}
				local344 = local262 | 0xFF000000;
				if (Static196.anIntArray275[local188] == 0) {
					Static143.aClass92_3.method4515(local344, local1234, -16777216, arg2 + local889, local213 + arg3);
				}
				if (Static196.anIntArray275[local188] == 1) {
					Static143.aClass92_3.method4513(local889 + arg2, local344, Static197.anInt3347, arg3 + local213, local1234);
				}
				if (Static196.anIntArray275[local188] == 2) {
					Static143.aClass92_3.method4516(Static197.anInt3347, local1234, local344, arg2 + local889, arg3 + local213);
				}
				if (Static196.anIntArray275[local188] == 3) {
					Static143.aClass92_3.method4502(arg2 + local889, 150 - Static196.anIntArray282[local188], Static197.anInt3347, local344, local1234, arg3 + local213);
				}
				@Pc(1563) int local1563;
				if (Static196.anIntArray275[local188] == 4) {
					local1563 = (150 - Static196.anIntArray282[local188]) * (Static241.aClass141_5.method2914(local1234) + 100) / 150;
					Static82.aClass163_1.HA(local213 + arg3 - 50, arg2, local213 + arg3 + 50, arg2 - -arg1);
					Static143.aClass92_3.method4512(arg2 + local889, local213 + (arg3 - -50) - local1563, local1234, local344, -16777216);
					Static82.aClass163_1.ba(arg3, arg2, arg0 + arg3, arg2 + arg1);
				}
				if (Static196.anIntArray275[local188] == 5) {
					local1563 = 150 - Static196.anIntArray282[local188];
					@Pc(1621) int local1621 = 0;
					if (local1563 < 25) {
						local1621 = local1563 - 25;
					} else if (local1563 > 125) {
						local1621 = local1563 - 125;
					}
					@Pc(1646) int local1646 = Static241.aClass141_5.anInt3623 + Static241.aClass141_5.anInt3614;
					Static82.aClass163_1.HA(arg3, arg2 + local889 - local1646 - 1, arg3 + arg0, local889 + arg2 + 5);
					Static143.aClass92_3.method4515(local344, local1234, -16777216, local889 + arg2 + local1621, arg3 - -local213);
					Static82.aClass163_1.ba(arg3, arg2, arg3 + arg0, arg2 + arg1);
				}
			} else {
				Static143.aClass92_3.method4515(-256, local1234, -16777216, local889 + arg2, arg3 - -local213);
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
	public static void method4341() {
		Static233.aClass156_57 = new Class156();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIZI)I")
	public static int method4344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg1;
		@Pc(13) int local13 = arg0 & arg1 - 1;
		@Pc(17) int local17 = arg2 / arg1;
		@Pc(23) int local23 = arg1 - 1 & arg2;
		@Pc(28) int local28 = Static194.method2628(local17, local7);
		@Pc(35) int local35 = Static194.method2628(local17, local7 + 1);
		@Pc(42) int local42 = Static194.method2628(local17 + 1, local7);
		@Pc(51) int local51 = Static194.method2628(local17 + 1, local7 + 1);
		@Pc(58) int local58 = Static183.method2529(local13, arg1, local35, local28);
		@Pc(65) int local65 = Static183.method2529(local13, arg1, local51, local42);
		return Static183.method2529(local23, arg1, local65, local58);
	}
}
