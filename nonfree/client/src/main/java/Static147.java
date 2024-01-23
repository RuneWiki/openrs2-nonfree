import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!la", name = "A", descriptor = "Lclient!km;")
	public static Class91 aClass91_117;

	@OriginalMember(owner = "client!la", name = "t", descriptor = "I")
	public static int anInt3194 = 0;

	@OriginalMember(owner = "client!la", name = "v", descriptor = "I")
	public static int anInt3196 = 0;

	@OriginalMember(owner = "client!la", name = "w", descriptor = "I")
	public static int anInt3197 = 0;

	@OriginalMember(owner = "client!la", name = "x", descriptor = "Z")
	public static boolean aBoolean235 = false;

	@OriginalMember(owner = "client!la", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString186 = "scroll:";

	@OriginalMember(owner = "client!la", name = "z", descriptor = "Z")
	public static boolean aBoolean236 = true;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!km;)V")
	public static void method2570(@OriginalArg(1) Class91 arg0) {
		Static116.aClass91_205 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V")
	public static void method2579(@OriginalArg(1) int arg0) {
		if (arg0 > 256) {
			arg0 = 256;
		}
		if (arg0 > 10) {
			arg0 = 10;
		}
		Static272.anInt5315 += arg0 * 128;
		@Pc(42) int local42;
		if (Static124.anIntArray257.length < Static272.anInt5315) {
			Static272.anInt5315 -= Static124.anIntArray257.length;
			local42 = (int) (Math.random() * 12.0D);
			Static31.method646(Static272.aClass12_Sub2Array1[local42]);
		}
		local42 = 0;
		@Pc(53) int local53 = arg0 * 128;
		@Pc(60) int local60 = (256 - arg0) * 128;
		@Pc(62) int local62;
		@Pc(87) int local87;
		for (local62 = 0; local62 < local60; local62++) {
			local87 = Static233.anIntArray408[local42 + local53] - arg0 * Static124.anIntArray257[Static124.anIntArray257.length - 1 & local42 + Static272.anInt5315] / 6;
			if (local87 < 0) {
				local87 = 0;
			}
			Static233.anIntArray408[local42++] = local87;
		}
		@Pc(116) int local116;
		@Pc(126) int local126;
		for (local62 = 256 - arg0; local62 < 256; local62++) {
			local87 = local62 * 128;
			for (local116 = 0; local116 < 128; local116++) {
				local126 = (int) (Math.random() * 100.0D);
				if (local126 < 50 && local116 > 10 && local116 < 118) {
					Static233.anIntArray408[local87 + local116] = 255;
				} else {
					Static233.anIntArray408[local116 + local87] = 0;
				}
			}
		}
		for (local62 = 0; local62 < 256 - arg0; local62++) {
			Static266.anIntArray348[local62] = Static266.anIntArray348[local62 + arg0];
		}
		for (local62 = 256 - arg0; local62 < 256; local62++) {
			Static266.anIntArray348[local62] = (int) (Math.sin((double) Static179.anInt3764 / 14.0D) * 16.0D + Math.sin((double) Static179.anInt3764 / 15.0D) * 14.0D + Math.sin((double) Static179.anInt3764 / 16.0D) * 12.0D);
			Static179.anInt3764++;
		}
		Static263.anInt5153 += arg0;
		local62 = (arg0 + (Static237.anInt4710 & 0x1)) / 2;
		if (local62 <= 0) {
			return;
		}
		for (local87 = 0; local87 < Static263.anInt5153; local87++) {
			local116 = (int) (Math.random() * 124.0D) + 2;
			local126 = (int) (Math.random() * 128.0D) + 128;
			Static233.anIntArray408[(local126 << 7) + local116] = 192;
		}
		Static263.anInt5153 = 0;
		@Pc(298) int local298;
		for (local87 = 0; local87 < 256; local87++) {
			local116 = 0;
			local126 = local87 * 128;
			for (local298 = -local62; local298 < 128; local298++) {
				if (local298 + local62 < 128) {
					local116 += Static233.anIntArray408[local62 + local298 + local126];
				}
				if (local298 - local62 - 1 >= 0) {
					local116 -= Static233.anIntArray408[local298 + local126 - local62 - 1];
				}
				if (local298 >= 0) {
					Static123.anIntArray256[local298 + local126] = local116 / (local62 * 2 + 1);
				}
			}
		}
		for (local87 = 0; local87 < 128; local87++) {
			local116 = 0;
			for (local126 = -local62; local126 < 256; local126++) {
				local298 = local126 * 128;
				if (local126 + local62 < 256) {
					local116 += Static123.anIntArray256[local62 * 128 + local298 + local87];
				}
				if (local126 - local62 - 1 >= 0) {
					local116 -= Static123.anIntArray256[local87 + local298 - local62 * 128 - 128];
				}
				if (local126 >= 0) {
					Static233.anIntArray408[local87 + local298] = local116 / (local62 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(B)Z")
	public static boolean method2583() throws IOException {
		if (Static87.aClass113_1 == null) {
			return false;
		}
		@Pc(14) int local14 = Static87.aClass113_1.method3014();
		if (local14 == 0) {
			return false;
		}
		if (Static201.anInt4077 == -1) {
			Static87.aClass113_1.method3015(Static187.aClass1_Sub11_Sub1_2.aByteArray47, 1, 0);
			local14--;
			Static187.aClass1_Sub11_Sub1_2.anInt3264 = 0;
			Static201.anInt4077 = Static187.aClass1_Sub11_Sub1_2.method2702();
			Static33.anInt762 = Static56.anIntArray128[Static201.anInt4077];
		}
		if (Static33.anInt762 == -1) {
			if (local14 <= 0) {
				return false;
			}
			Static87.aClass113_1.method3015(Static187.aClass1_Sub11_Sub1_2.aByteArray47, 1, 0);
			Static33.anInt762 = Static187.aClass1_Sub11_Sub1_2.aByteArray47[0] & 0xFF;
			local14--;
		}
		if (Static33.anInt762 == -2) {
			if (local14 <= 1) {
				return false;
			}
			Static87.aClass113_1.method3015(Static187.aClass1_Sub11_Sub1_2.aByteArray47, 2, 0);
			local14 -= 2;
			Static187.aClass1_Sub11_Sub1_2.anInt3264 = 0;
			Static33.anInt762 = Static187.aClass1_Sub11_Sub1_2.method2691();
		}
		if (local14 < Static33.anInt762) {
			return false;
		}
		Static187.aClass1_Sub11_Sub1_2.anInt3264 = 0;
		Static87.aClass113_1.method3015(Static187.aClass1_Sub11_Sub1_2.aByteArray47, Static33.anInt762, 0);
		Static33.anInt768 = Static227.anInt4510;
		Static227.anInt4510 = Static198.anInt36;
		Static175.anInt3720 = 0;
		Static198.anInt36 = Static201.anInt4077;
		@Pc(132) int local132;
		if (Static201.anInt4077 == 21) {
			local132 = Static187.aClass1_Sub11_Sub1_2.method2691();
			if (Static129.method2220(local132)) {
				Static56.method1051();
			}
			Static201.anInt4077 = -1;
			return true;
		} else if (Static201.anInt4077 == 104) {
			for (local132 = 0; local132 < Static98.aClass14_Sub2_Sub1Array1.length; local132++) {
				if (Static98.aClass14_Sub2_Sub1Array1[local132] != null) {
					Static98.aClass14_Sub2_Sub1Array1[local132].anInt4620 = -1;
				}
			}
			for (local132 = 0; local132 < Static254.aClass14_Sub2_Sub2Array1.length; local132++) {
				if (Static254.aClass14_Sub2_Sub2Array1[local132] != null) {
					Static254.aClass14_Sub2_Sub2Array1[local132].anInt4620 = -1;
				}
			}
			Static201.anInt4077 = -1;
			return true;
		} else {
			@Pc(298) String local298;
			@Pc(211) int local211;
			@Pc(221) int local221;
			@Pc(207) long local207;
			@Pc(197) long local197;
			@Pc(202) long local202;
			if (Static201.anInt4077 == 61) {
				local197 = Static187.aClass1_Sub11_Sub1_2.method2646();
				local202 = Static187.aClass1_Sub11_Sub1_2.method2691();
				local207 = Static187.aClass1_Sub11_Sub1_2.method2681();
				local211 = Static187.aClass1_Sub11_Sub1_2.method2690();
				@Pc(217) long local217 = local207 + (local202 << 32);
				local221 = Static187.aClass1_Sub11_Sub1_2.method2691();
				@Pc(223) boolean local223 = false;
				@Pc(225) int local225 = 0;
				label1301: while (true) {
					if (local225 < 100) {
						if (Static121.aLongArray3[local225] != local217) {
							local225++;
							continue;
						}
						local223 = true;
						break;
					}
					if (local211 <= 1) {
						for (local225 = 0; local225 < Static148.anInt3198; local225++) {
							if (local197 == Static255.aLongArray8[local225]) {
								local223 = true;
								break label1301;
							}
						}
					}
					break;
				}
				if (!local223 && Static266.anInt3889 == 0) {
					Static121.aLongArray3[Static241.anInt4778] = local217;
					Static241.anInt4778 = (Static241.anInt4778 + 1) % 100;
					local298 = Static74.method1304(local221).method2210(Static187.aClass1_Sub11_Sub1_2);
					if (local211 == 2) {
						Static221.method3478(local298, "<img=1>" + Static24.method3641(local197), local221, null, 18);
					} else if (local211 == 1) {
						Static221.method3478(local298, "<img=0>" + Static24.method3641(local197), local221, null, 18);
					} else {
						Static221.method3478(local298, Static24.method3641(local197), local221, null, 18);
					}
				}
				Static201.anInt4077 = -1;
				return true;
			}
			@Pc(403) int local403;
			@Pc(497) boolean local497;
			@Pc(500) int local500;
			@Pc(490) int local490;
			if (Static201.anInt4077 == 176) {
				Static34.anInt802 = Static23.anInt471;
				local197 = Static187.aClass1_Sub11_Sub1_2.method2646();
				if (local197 == 0L) {
					Static117.aClass1_Sub4Array1 = null;
					Static128.anInt2850 = 0;
					Static201.anInt4077 = -1;
					Static174.aString218 = null;
					Static174.aString217 = null;
					return true;
				}
				local202 = Static187.aClass1_Sub11_Sub1_2.method2646();
				Static174.aString217 = Static252.method3871(local202);
				Static174.aString218 = Static252.method3871(local197);
				Static191.aByte14 = Static187.aClass1_Sub11_Sub1_2.method2663();
				local403 = Static187.aClass1_Sub11_Sub1_2.method2690();
				if (local403 == 255) {
					Static201.anInt4077 = -1;
					return true;
				}
				Static128.anInt2850 = local403;
				@Pc(417) Class1_Sub4[] local417 = new Class1_Sub4[100];
				for (local211 = 0; local211 < Static128.anInt2850; local211++) {
					local417[local211] = new Class1_Sub4();
					local417[local211].aLong205 = Static187.aClass1_Sub11_Sub1_2.method2646();
					local417[local211].aString18 = Static252.method3871(local417[local211].aLong205);
					local417[local211].anInt239 = Static187.aClass1_Sub11_Sub1_2.method2691();
					local417[local211].aByte1 = Static187.aClass1_Sub11_Sub1_2.method2663();
					local417[local211].aString19 = Static187.aClass1_Sub11_Sub1_2.method2629();
					if (Static189.aLong146 == local417[local211].aLong205) {
						Static256.aByte21 = local417[local211].aByte1;
					}
				}
				local490 = Static128.anInt2850;
				while (local490 > 0) {
					local497 = true;
					local490--;
					for (local500 = 0; local500 < local490; local500++) {
						if (local417[local500].aString18.compareTo(local417[local500 + 1].aString18) > 0) {
							local497 = false;
							@Pc(527) Class1_Sub4 local527 = local417[local500];
							local417[local500] = local417[local500 + 1];
							local417[local500 + 1] = local527;
						}
					}
					if (local497) {
						break;
					}
				}
				Static117.aClass1_Sub4Array1 = local417;
				Static201.anInt4077 = -1;
				return true;
			}
			@Pc(571) int local571;
			@Pc(567) int local567;
			if (Static201.anInt4077 == 174) {
				local132 = Static187.aClass1_Sub11_Sub1_2.method2669();
				local567 = Static187.aClass1_Sub11_Sub1_2.method2639();
				local571 = Static187.aClass1_Sub11_Sub1_2.method2643();
				if (Static129.method2220(local567)) {
					Static214.method3395(local571, local132);
				}
				Static201.anInt4077 = -1;
				return true;
			} else if (Static201.anInt4077 == 208) {
				if (Static116.anInt5593 != -1) {
					Static90.method1588(0, Static116.anInt5593);
				}
				Static201.anInt4077 = -1;
				return true;
			} else {
				@Pc(622) int local622;
				@Pc(611) String local611;
				if (Static201.anInt4077 == 3) {
					local132 = Static187.aClass1_Sub11_Sub1_2.method2691();
					local611 = Static187.aClass1_Sub11_Sub1_2.method2629();
					@Pc(617) Object[] local617 = new Object[local611.length() + 1];
					for (local622 = local611.length() - 1; local622 >= 0; local622--) {
						if (local611.charAt(local622) == 's') {
							local617[local622 + 1] = Static187.aClass1_Sub11_Sub1_2.method2629();
						} else {
							local617[local622 + 1] = Integer.valueOf(Static187.aClass1_Sub11_Sub1_2.method2643());
						}
					}
					local617[0] = Integer.valueOf(Static187.aClass1_Sub11_Sub1_2.method2643());
					if (Static129.method2220(local132)) {
						@Pc(671) Class1_Sub14 local671 = new Class1_Sub14();
						local671.anObjectArray1 = local617;
						Static188.method3144(local671);
					}
					Static201.anInt4077 = -1;
					return true;
				}
				@Pc(708) long local708;
				if (Static201.anInt4077 == 15) {
					local197 = Static187.aClass1_Sub11_Sub1_2.method2646();
					Static187.aClass1_Sub11_Sub1_2.method2663();
					local202 = Static187.aClass1_Sub11_Sub1_2.method2646();
					local207 = Static187.aClass1_Sub11_Sub1_2.method2691();
					local708 = Static187.aClass1_Sub11_Sub1_2.method2681();
					local490 = Static187.aClass1_Sub11_Sub1_2.method2690();
					local500 = Static187.aClass1_Sub11_Sub1_2.method2691();
					@Pc(722) long local722 = local708 + (local207 << 32);
					@Pc(724) boolean local724 = false;
					@Pc(726) int local726 = 0;
					label1345: while (true) {
						if (local726 >= 100) {
							if (local490 <= 1) {
								for (local726 = 0; local726 < Static148.anInt3198; local726++) {
									if (local197 == Static255.aLongArray8[local726]) {
										local724 = true;
										break label1345;
									}
								}
							}
							break;
						}
						if (Static121.aLongArray3[local726] == local722) {
							local724 = true;
							break;
						}
						local726++;
					}
					if (!local724 && Static266.anInt3889 == 0) {
						Static121.aLongArray3[Static241.anInt4778] = local722;
						Static241.anInt4778 = (Static241.anInt4778 + 1) % 100;
						@Pc(791) String local791 = Static74.method1304(local500).method2210(Static187.aClass1_Sub11_Sub1_2);
						if (local490 == 2 || local490 == 3) {
							Static221.method3478(local791, "<img=1>" + Static24.method3641(local197), local500, Static24.method3641(local202), 20);
						} else if (local490 == 1) {
							Static221.method3478(local791, "<img=0>" + Static24.method3641(local197), local500, Static24.method3641(local202), 20);
						} else {
							Static221.method3478(local791, Static24.method3641(local197), local500, Static24.method3641(local202), 20);
						}
					}
					Static201.anInt4077 = -1;
					return true;
				}
				@Pc(885) int local885;
				if (Static201.anInt4077 == 251) {
					local132 = Static187.aClass1_Sub11_Sub1_2.method2691();
					local567 = Static187.aClass1_Sub11_Sub1_2.method2690();
					local571 = Static187.aClass1_Sub11_Sub1_2.method2690();
					local622 = Static187.aClass1_Sub11_Sub1_2.method2690();
					local403 = Static187.aClass1_Sub11_Sub1_2.method2690();
					local885 = Static187.aClass1_Sub11_Sub1_2.method2691();
					if (Static129.method2220(local132)) {
						Static71.aBooleanArray16[local567] = true;
						Static186.anIntArray345[local567] = local571;
						Static181.anIntArray339[local567] = local622;
						Static14.anIntArray35[local567] = local403;
						Static246.anIntArray427[local567] = local885;
					}
					Static201.anInt4077 = -1;
					return true;
				} else if (Static201.anInt4077 == 23) {
					Static148.anInt3198 = Static33.anInt762 / 8;
					for (local132 = 0; local132 < Static148.anInt3198; local132++) {
						Static255.aLongArray8[local132] = Static187.aClass1_Sub11_Sub1_2.method2646();
						Static270.aStringArray55[local132] = Static259.method3976(Static255.aLongArray8[local132]);
						Static273.aBooleanArray51[local132] = false;
					}
					Static67.anInt1414 = Static23.anInt471;
					Static201.anInt4077 = -1;
					return true;
				} else if (Static201.anInt4077 == 0) {
					local132 = Static187.aClass1_Sub11_Sub1_2.method2691();
					if (Static129.method2220(local132)) {
						Static256.method3915();
					}
					Static201.anInt4077 = -1;
					return true;
				} else if (Static201.anInt4077 == 126) {
					Static6.method207(false);
					Static201.anInt4077 = -1;
					return true;
				} else if (Static201.anInt4077 == 164) {
					local132 = Static187.aClass1_Sub11_Sub1_2.method2643();
					local567 = Static187.aClass1_Sub11_Sub1_2.method2639();
					Static230.method1573(local567, local132);
					Static201.anInt4077 = -1;
					return true;
				} else if (Static201.anInt4077 == 37) {
					local132 = Static187.aClass1_Sub11_Sub1_2.method2691();
					local567 = Static187.aClass1_Sub11_Sub1_2.method2631();
					local571 = Static187.aClass1_Sub11_Sub1_2.method2665();
					if (Static129.method2220(local567)) {
						Static263.method4032(local571, local132);
					}
					Static201.anInt4077 = -1;
					return true;
				} else if (Static201.anInt4077 == 201) {
					Static63.method1128(Static33.anInt762, Static253.aClass175_4, Static187.aClass1_Sub11_Sub1_2);
					Static201.anInt4077 = -1;
					return true;
				} else if (Static201.anInt4077 == 47) {
					Static254.anInt4975 = Static187.aClass1_Sub11_Sub1_2.method2690();
					Static201.anInt4077 = -1;
					Static67.anInt1414 = Static23.anInt471;
					return true;
				} else if (Static201.anInt4077 == 200) {
					local132 = Static187.aClass1_Sub11_Sub1_2.method2691();
					local567 = Static187.aClass1_Sub11_Sub1_2.method2690();
					local571 = Static187.aClass1_Sub11_Sub1_2.method2690();
					local622 = Static187.aClass1_Sub11_Sub1_2.method2691();
					local403 = Static187.aClass1_Sub11_Sub1_2.method2690();
					local885 = Static187.aClass1_Sub11_Sub1_2.method2690();
					if (Static129.method2220(local132)) {
						Static16.method304(local622, local885, local571, true, local403, local567);
					}
					Static201.anInt4077 = -1;
					return true;
				} else if (Static201.anInt4077 == 136 || Static201.anInt4077 == 46 || Static201.anInt4077 == 140 || Static201.anInt4077 == 7 || Static201.anInt4077 == 111 || Static201.anInt4077 == 133 || Static201.anInt4077 == 247 || Static201.anInt4077 == 70 || Static201.anInt4077 == 41 || Static201.anInt4077 == 101 || Static201.anInt4077 == 159 || Static201.anInt4077 == 193 || Static201.anInt4077 == 197 || Static201.anInt4077 == 215) {
					Static100.method1871();
					Static201.anInt4077 = -1;
					return true;
				} else {
					@Pc(1295) String local1295;
					if (Static201.anInt4077 == 166) {
						local197 = Static187.aClass1_Sub11_Sub1_2.method2646();
						Static187.aClass1_Sub11_Sub1_2.method2663();
						local202 = Static187.aClass1_Sub11_Sub1_2.method2646();
						local207 = Static187.aClass1_Sub11_Sub1_2.method2691();
						local708 = Static187.aClass1_Sub11_Sub1_2.method2681();
						local490 = Static187.aClass1_Sub11_Sub1_2.method2690();
						@Pc(1203) boolean local1203 = false;
						@Pc(1209) long local1209 = local708 + (local207 << 32);
						@Pc(1211) int local1211 = 0;
						label1381: while (true) {
							if (local1211 < 100) {
								if (local1209 != Static121.aLongArray3[local1211]) {
									local1211++;
									continue;
								}
								local1203 = true;
								break;
							}
							if (local490 <= 1) {
								if (Static127.aBoolean211 && !Static296.aBoolean449 || aBoolean235) {
									local1203 = true;
								} else {
									for (local1211 = 0; local1211 < Static148.anInt3198; local1211++) {
										if (Static255.aLongArray8[local1211] == local197) {
											local1203 = true;
											break label1381;
										}
									}
								}
							}
							break;
						}
						if (!local1203 && Static266.anInt3889 == 0) {
							Static121.aLongArray3[Static241.anInt4778] = local1209;
							Static241.anInt4778 = (Static241.anInt4778 + 1) % 100;
							local1295 = Static231.method450(Static248.method3830(Static186.method3094(Static187.aClass1_Sub11_Sub1_2)));
							if (local490 == 2 || local490 == 3) {
								Static267.method4060(local1295, Static24.method3641(local202), "<img=1>" + Static24.method3641(local197));
							} else if (local490 == 1) {
								Static267.method4060(local1295, Static24.method3641(local202), "<img=0>" + Static24.method3641(local197));
							} else {
								Static267.method4060(local1295, Static24.method3641(local202), Static24.method3641(local197));
							}
						}
						Static201.anInt4077 = -1;
						return true;
					} else if (Static201.anInt4077 == 138) {
						local132 = Static187.aClass1_Sub11_Sub1_2.method2647();
						local567 = Static187.aClass1_Sub11_Sub1_2.method2639();
						local571 = Static187.aClass1_Sub11_Sub1_2.method2686();
						if (Static129.method2220(local567)) {
							Static98.method1833(local571, local132);
						}
						Static201.anInt4077 = -1;
						return true;
					} else if (Static201.anInt4077 == 38) {
						Static263.method4038();
						Static201.anInt4077 = -1;
						return true;
					} else {
						@Pc(1429) Class1_Sub17 local1429;
						if (Static201.anInt4077 == 1) {
							local132 = Static187.aClass1_Sub11_Sub1_2.method2690();
							local567 = Static187.aClass1_Sub11_Sub1_2.method2661();
							local571 = Static187.aClass1_Sub11_Sub1_2.method2691();
							local622 = Static187.aClass1_Sub11_Sub1_2.method2665();
							if (Static129.method2220(local567)) {
								local1429 = (Class1_Sub17) Static256.aClass70_17.method2075((long) local622);
								if (local1429 != null) {
									Static59.method3199(local571 != local1429.anInt2431, local1429);
								}
								Static154.method2704(local622, local132, local571);
							}
							Static201.anInt4077 = -1;
							return true;
						} else if (Static201.anInt4077 == 243) {
							local132 = Static187.aClass1_Sub11_Sub1_2.method2639();
							local567 = Static187.aClass1_Sub11_Sub1_2.method2643();
							local571 = Static187.aClass1_Sub11_Sub1_2.method2691();
							local622 = Static187.aClass1_Sub11_Sub1_2.method2631();
							if (Static129.method2220(local571)) {
								Static216.method3409(local132 + (local622 << 16), local567);
							}
							Static201.anInt4077 = -1;
							return true;
						} else if (Static201.anInt4077 == 141) {
							local132 = Static187.aClass1_Sub11_Sub1_2.method2691();
							local567 = Static187.aClass1_Sub11_Sub1_2.method2690();
							if (local132 == 65535) {
								local132 = -1;
							}
							local571 = Static187.aClass1_Sub11_Sub1_2.method2691();
							local622 = Static187.aClass1_Sub11_Sub1_2.method2690();
							Static242.method3712(local132, local622, local571, local567);
							Static201.anInt4077 = -1;
							return true;
						} else if (Static201.anInt4077 == 63) {
							local132 = Static187.aClass1_Sub11_Sub1_2.method2665();
							local567 = Static187.aClass1_Sub11_Sub1_2.method2631();
							local571 = Static187.aClass1_Sub11_Sub1_2.method2661();
							local622 = Static187.aClass1_Sub11_Sub1_2.method2691();
							local403 = Static187.aClass1_Sub11_Sub1_2.method2691();
							if (Static129.method2220(local403)) {
								Static49.method940(local567 << 16 | local571, local622, local132, 7);
							}
							Static201.anInt4077 = -1;
							return true;
						} else if (Static201.anInt4077 == 128) {
							Static190.anInt3915 = Static187.aClass1_Sub11_Sub1_2.method2690();
							Static115.anInt2632 = Static187.aClass1_Sub11_Sub1_2.method2690();
							Static6.anInt188 = Static187.aClass1_Sub11_Sub1_2.method2690();
							Static201.anInt4077 = -1;
							return true;
						} else if (Static201.anInt4077 == 137) {
							local132 = Static187.aClass1_Sub11_Sub1_2.method2643();
							local567 = Static187.aClass1_Sub11_Sub1_2.method2631();
							local571 = Static187.aClass1_Sub11_Sub1_2.method2661();
							if (local571 == 65535) {
								local571 = -1;
							}
							if (Static129.method2220(local567)) {
								Static49.method940(local571, -1, local132, 1);
							}
							Static201.anInt4077 = -1;
							return true;
						} else if (Static201.anInt4077 == 235) {
							local132 = Static187.aClass1_Sub11_Sub1_2.method2690();
							if (Static187.aClass1_Sub11_Sub1_2.method2690() == 0) {
								Static262.aClass177Array1[local132] = new Class177();
							} else {
								Static187.aClass1_Sub11_Sub1_2.anInt3264--;
								Static262.aClass177Array1[local132] = new Class177(Static187.aClass1_Sub11_Sub1_2);
							}
							Static201.anInt4077 = -1;
							Static14.anInt278 = Static23.anInt471;
							return true;
						} else if (Static201.anInt4077 == 209) {
							local132 = Static187.aClass1_Sub11_Sub1_2.method2643();
							Static215.aClass116_4 = Static253.aClass175_4.method4333(local132);
							Static201.anInt4077 = -1;
							return true;
						} else if (Static201.anInt4077 == 35) {
							local132 = Static187.aClass1_Sub11_Sub1_2.method2691();
							local567 = Static187.aClass1_Sub11_Sub1_2.method2639();
							local571 = Static187.aClass1_Sub11_Sub1_2.method2639();
							if (Static129.method2220(local567)) {
								Static175.method2988(local571, local132);
							}
							Static201.anInt4077 = -1;
							return true;
						} else if (Static201.anInt4077 == 198) {
							local132 = Static187.aClass1_Sub11_Sub1_2.method2690();
							local567 = Static187.aClass1_Sub11_Sub1_2.method2654();
							local571 = Static187.aClass1_Sub11_Sub1_2.method2690();
							Static140.anInt3034 = local571 >> 1;
							Static197.aClass14_Sub2_Sub1_2.method1349(local567, local132, (local571 & 0x1) == 1);
							Static201.anInt4077 = -1;
							return true;
						} else {
							@Pc(1767) boolean local1767;
							@Pc(1960) int local1960;
							@Pc(1783) String local1783;
							if (Static201.anInt4077 == 226) {
								local197 = Static187.aClass1_Sub11_Sub1_2.method2646();
								local571 = Static187.aClass1_Sub11_Sub1_2.method2691();
								local1767 = true;
								local622 = Static187.aClass1_Sub11_Sub1_2.method2690();
								if (local197 < 0L) {
									local1767 = false;
									local197 &= Long.MAX_VALUE;
								}
								local1783 = "";
								if (local571 > 0) {
									local1783 = Static187.aClass1_Sub11_Sub1_2.method2629();
								}
								@Pc(1794) String local1794 = Static24.method3641(local197);
								for (local221 = 0; local221 < Static49.anInt1128; local221++) {
									if (local197 == Static298.aLongArray11[local221]) {
										if (local571 != Static117.anIntArray242[local221]) {
											Static117.anIntArray242[local221] = local571;
											if (local571 > 0) {
												Static196.method1924(5, local1794 + Static169.aString211, "");
											}
											if (local571 == 0) {
												Static196.method1924(5, local1794 + Static134.aString170, "");
											}
										}
										local1794 = null;
										Static59.aStringArray51[local221] = local1783;
										Static100.anIntArray211[local221] = local622;
										Static15.aBooleanArray7[local221] = local1767;
										break;
									}
								}
								if (local1794 != null && Static49.anInt1128 < 200) {
									Static298.aLongArray11[Static49.anInt1128] = local197;
									Static149.aStringArray43[Static49.anInt1128] = local1794;
									Static117.anIntArray242[Static49.anInt1128] = local571;
									Static59.aStringArray51[Static49.anInt1128] = local1783;
									Static100.anIntArray211[Static49.anInt1128] = local622;
									Static15.aBooleanArray7[Static49.anInt1128] = local1767;
									Static49.anInt1128++;
								}
								Static67.anInt1414 = Static23.anInt471;
								local490 = Static49.anInt1128;
								while (local490 > 0) {
									local490--;
									@Pc(1917) boolean local1917 = true;
									for (local500 = 0; local500 < local490; local500++) {
										if (Static117.anIntArray242[local500] != Static33.anInt764 && Static117.anIntArray242[local500 + 1] == Static33.anInt764 || Static117.anIntArray242[local500] == 0 && Static117.anIntArray242[local500 + 1] != 0) {
											local1960 = Static117.anIntArray242[local500];
											local1917 = false;
											Static117.anIntArray242[local500] = Static117.anIntArray242[local500 + 1];
											Static117.anIntArray242[local500 + 1] = local1960;
											local298 = Static59.aStringArray51[local500];
											Static59.aStringArray51[local500] = Static59.aStringArray51[local500 + 1];
											Static59.aStringArray51[local500 + 1] = local298;
											local1295 = Static149.aStringArray43[local500];
											Static149.aStringArray43[local500] = Static149.aStringArray43[local500 + 1];
											Static149.aStringArray43[local500 + 1] = local1295;
											@Pc(2016) long local2016 = Static298.aLongArray11[local500];
											Static298.aLongArray11[local500] = Static298.aLongArray11[local500 + 1];
											Static298.aLongArray11[local500 + 1] = local2016;
											@Pc(2034) int local2034 = Static100.anIntArray211[local500];
											Static100.anIntArray211[local500] = Static100.anIntArray211[local500 + 1];
											Static100.anIntArray211[local500 + 1] = local2034;
											@Pc(2052) boolean local2052 = Static15.aBooleanArray7[local500];
											Static15.aBooleanArray7[local500] = Static15.aBooleanArray7[local500 + 1];
											Static15.aBooleanArray7[local500 + 1] = local2052;
										}
									}
									if (local1917) {
										break;
									}
								}
								Static201.anInt4077 = -1;
								return true;
							} else if (Static201.anInt4077 == 127) {
								@Pc(2083) String local2083 = Static187.aClass1_Sub11_Sub1_2.method2629();
								if (local2083.endsWith(":tradereq:")) {
									local611 = local2083.substring(0, local2083.indexOf(":"));
									local1767 = false;
									local202 = Static93.method1658(local611);
									for (local885 = 0; local885 < Static148.anInt3198; local885++) {
										if (Static255.aLongArray8[local885] == local202) {
											local1767 = true;
											break;
										}
									}
									if (!local1767 && Static266.anInt3889 == 0) {
										Static196.method1924(4, Static102.aString139, local611);
									}
								} else if (local2083.endsWith(":chalreq:")) {
									local611 = local2083.substring(0, local2083.indexOf(":"));
									local202 = Static93.method1658(local611);
									local1767 = false;
									for (local885 = 0; local885 < Static148.anInt3198; local885++) {
										if (local202 == Static255.aLongArray8[local885]) {
											local1767 = true;
											break;
										}
									}
									if (!local1767 && Static266.anInt3889 == 0) {
										local1783 = local2083.substring(local2083.indexOf(":") + 1, local2083.length() + -9);
										Static196.method1924(8, local1783, local611);
									}
								} else if (local2083.endsWith(":assistreq:")) {
									local611 = local2083.substring(0, local2083.indexOf(":"));
									local1767 = false;
									local202 = Static93.method1658(local611);
									for (local885 = 0; local885 < Static148.anInt3198; local885++) {
										if (local202 == Static255.aLongArray8[local885]) {
											local1767 = true;
											break;
										}
									}
									if (!local1767 && Static266.anInt3889 == 0) {
										Static196.method1924(10, "", local611);
									}
								} else if (local2083.endsWith(":clan:")) {
									local611 = local2083.substring(0, local2083.indexOf(":clan:"));
									Static196.method1924(11, local611, "");
								} else if (local2083.endsWith(":trade:")) {
									local611 = local2083.substring(0, local2083.indexOf(":trade:"));
									if (Static266.anInt3889 == 0) {
										Static196.method1924(12, local611, "");
									}
								} else if (local2083.endsWith(":assist:")) {
									local611 = local2083.substring(0, local2083.indexOf(":assist:"));
									if (Static266.anInt3889 == 0) {
										Static196.method1924(13, local611, "");
									}
								} else if (local2083.endsWith(":duelstake:")) {
									local611 = local2083.substring(0, local2083.indexOf(":"));
									local202 = Static93.method1658(local611);
									local1767 = false;
									for (local885 = 0; local885 < Static148.anInt3198; local885++) {
										if (Static255.aLongArray8[local885] == local202) {
											local1767 = true;
											break;
										}
									}
									if (!local1767 && Static266.anInt3889 == 0) {
										Static196.method1924(14, "", local611);
									}
								} else if (local2083.endsWith(":duelfriend:")) {
									local611 = local2083.substring(0, local2083.indexOf(":"));
									local202 = Static93.method1658(local611);
									local1767 = false;
									for (local885 = 0; local885 < Static148.anInt3198; local885++) {
										if (local202 == Static255.aLongArray8[local885]) {
											local1767 = true;
											break;
										}
									}
									if (!local1767 && Static266.anInt3889 == 0) {
										Static196.method1924(15, "", local611);
									}
								} else if (local2083.endsWith(":clanreq:")) {
									local611 = local2083.substring(0, local2083.indexOf(":"));
									local202 = Static93.method1658(local611);
									local1767 = false;
									for (local885 = 0; local885 < Static148.anInt3198; local885++) {
										if (local202 == Static255.aLongArray8[local885]) {
											local1767 = true;
											break;
										}
									}
									if (!local1767 && Static266.anInt3889 == 0) {
										Static196.method1924(16, "", local611);
									}
								} else if (local2083.endsWith(":allyreq:")) {
									local611 = local2083.substring(0, local2083.indexOf(":"));
									local202 = Static93.method1658(local611);
									local1767 = false;
									for (local885 = 0; local885 < Static148.anInt3198; local885++) {
										if (local202 == Static255.aLongArray8[local885]) {
											local1767 = true;
											break;
										}
									}
									if (!local1767 && Static266.anInt3889 == 0) {
										local1783 = local2083.substring(local2083.indexOf(":") + 1, local2083.length() + -9);
										Static196.method1924(21, local1783, local611);
									}
								} else {
									Static196.method1924(0, local2083, "");
								}
								Static201.anInt4077 = -1;
								return true;
							} else if (Static201.anInt4077 == 94) {
								Static69.anInt1462 = Static187.aClass1_Sub11_Sub1_2.method2631() * 30;
								Static201.anInt4077 = -1;
								Static63.anInt1344 = Static23.anInt471;
								return true;
							} else {
								@Pc(2594) String local2594;
								if (Static201.anInt4077 == 60) {
									local197 = Static187.aClass1_Sub11_Sub1_2.method2646();
									local571 = Static187.aClass1_Sub11_Sub1_2.method2691();
									local2594 = Static74.method1304(local571).method2210(Static187.aClass1_Sub11_Sub1_2);
									Static221.method3478(local2594, Static24.method3641(local197), local571, null, 19);
									Static201.anInt4077 = -1;
									return true;
								} else if (Static201.anInt4077 == 54) {
									Static39.method822();
									Static201.anInt4077 = -1;
									return false;
								} else if (Static201.anInt4077 == 131) {
									local132 = Static187.aClass1_Sub11_Sub1_2.method2691();
									if (local132 == 65535) {
										local132 = -1;
									}
									local567 = Static187.aClass1_Sub11_Sub1_2.method2690();
									local571 = Static187.aClass1_Sub11_Sub1_2.method2647();
									local2594 = Static187.aClass1_Sub11_Sub1_2.method2629();
									if (local567 >= 1 && local567 <= 8) {
										if (local2594.equalsIgnoreCase("null")) {
											local2594 = null;
										}
										Static258.aStringArray53[local567 - 1] = local2594;
										Static75.anIntArray153[local567 - 1] = local132;
										Static131.aBooleanArray30[local567 - 1] = local571 == 0;
									}
									Static201.anInt4077 = -1;
									return true;
								} else if (Static201.anInt4077 == 51) {
									local132 = Static187.aClass1_Sub11_Sub1_2.method2627();
									local567 = Static187.aClass1_Sub11_Sub1_2.method2657();
									local571 = Static187.aClass1_Sub11_Sub1_2.method2691();
									local622 = Static187.aClass1_Sub11_Sub1_2.method2632();
									if (Static129.method2220(local571)) {
										Static19.method363(local132, local622, local567);
									}
									Static201.anInt4077 = -1;
									return true;
								} else if (Static201.anInt4077 == 181) {
									local197 = Static187.aClass1_Sub11_Sub1_2.method2646();
									local202 = Static187.aClass1_Sub11_Sub1_2.method2691();
									local207 = Static187.aClass1_Sub11_Sub1_2.method2681();
									local211 = Static187.aClass1_Sub11_Sub1_2.method2690();
									@Pc(2750) long local2750 = local207 + (local202 << 32);
									@Pc(2752) boolean local2752 = false;
									local1960 = 0;
									label1510: while (true) {
										if (local1960 < 100) {
											if (Static121.aLongArray3[local1960] != local2750) {
												local1960++;
												continue;
											}
											local2752 = true;
											break;
										}
										if (local211 <= 1) {
											if (Static127.aBoolean211 && !Static296.aBoolean449 || aBoolean235) {
												local2752 = true;
											} else {
												for (local1960 = 0; local1960 < Static148.anInt3198; local1960++) {
													if (Static255.aLongArray8[local1960] == local197) {
														local2752 = true;
														break label1510;
													}
												}
											}
										}
										break;
									}
									if (!local2752 && Static266.anInt3889 == 0) {
										Static121.aLongArray3[Static241.anInt4778] = local2750;
										Static241.anInt4778 = (Static241.anInt4778 + 1) % 100;
										@Pc(2838) String local2838 = Static231.method450(Static248.method3830(Static186.method3094(Static187.aClass1_Sub11_Sub1_2)));
										if (local211 == 2 || local211 == 3) {
											Static196.method1924(7, local2838, "<img=1>" + Static24.method3641(local197));
										} else if (local211 == 1) {
											Static196.method1924(7, local2838, "<img=0>" + Static24.method3641(local197));
										} else {
											Static196.method1924(3, local2838, Static24.method3641(local197));
										}
									}
									Static201.anInt4077 = -1;
									return true;
								} else if (Static201.anInt4077 == 80) {
									Static142.method2352();
									Static107.anInt2500 = Static187.aClass1_Sub11_Sub1_2.method2690();
									Static63.anInt1344 = Static23.anInt471;
									Static201.anInt4077 = -1;
									return true;
								} else if (Static201.anInt4077 == 228) {
									local132 = Static187.aClass1_Sub11_Sub1_2.method2661();
									local567 = Static187.aClass1_Sub11_Sub1_2.method2675();
									if (Static129.method2220(local132)) {
										Static246.anInt4896 = local567;
									}
									Static201.anInt4077 = -1;
									return true;
								} else if (Static201.anInt4077 == 253) {
									local132 = Static187.aClass1_Sub11_Sub1_2.method2690();
									local567 = Static187.aClass1_Sub11_Sub1_2.method2661();
									local571 = Static187.aClass1_Sub11_Sub1_2.method2661();
									if (Static129.method2220(local571)) {
										if (local132 == 2) {
											Static143.method2367();
										}
										Static116.anInt5593 = local567;
										Static127.method2192(local567);
										Static84.method1470(false);
										Static77.method1355(Static116.anInt5593);
										for (local622 = 0; local622 < 100; local622++) {
											Static272.aBooleanArray50[local622] = true;
										}
									}
									Static201.anInt4077 = -1;
									return true;
								} else {
									@Pc(3003) String local3003;
									if (Static201.anInt4077 == 92) {
										local132 = Static187.aClass1_Sub11_Sub1_2.method2631();
										local567 = Static187.aClass1_Sub11_Sub1_2.method2691();
										local3003 = Static187.aClass1_Sub11_Sub1_2.method2629();
										if (Static129.method2220(local567)) {
											Static181.method3036(local3003, local132);
										}
										Static201.anInt4077 = -1;
										return true;
									} else if (Static201.anInt4077 == 213) {
										Static6.method207(true);
										Static201.anInt4077 = -1;
										return true;
									} else {
										@Pc(3042) byte local3042;
										if (Static201.anInt4077 == 83) {
											local132 = Static187.aClass1_Sub11_Sub1_2.method2639();
											local3042 = Static187.aClass1_Sub11_Sub1_2.method2666();
											local571 = Static187.aClass1_Sub11_Sub1_2.method2639();
											if (Static129.method2220(local132)) {
												Static168.method2912(local3042, local571);
											}
											Static201.anInt4077 = -1;
											return true;
										} else if (Static201.anInt4077 == 56) {
											local197 = Static187.aClass1_Sub11_Sub1_2.method2646();
											local1767 = false;
											if ((Long.MIN_VALUE & local197) != 0L) {
												local1767 = true;
											}
											local571 = Static187.aClass1_Sub11_Sub1_2.method2691();
											@Pc(3084) byte local3084 = Static187.aClass1_Sub11_Sub1_2.method2663();
											if (local1767) {
												if (Static128.anInt2850 == 0) {
													Static201.anInt4077 = -1;
													return true;
												}
												local197 &= Long.MAX_VALUE;
												for (local885 = 0; Static128.anInt2850 > local885 && (Static117.aClass1_Sub4Array1[local885].aLong205 != local197 || local571 != Static117.aClass1_Sub4Array1[local885].anInt239); local885++) {
												}
												if (local885 < Static128.anInt2850) {
													while (local885 < Static128.anInt2850 - 1) {
														Static117.aClass1_Sub4Array1[local885] = Static117.aClass1_Sub4Array1[local885 + 1];
														local885++;
													}
													Static128.anInt2850--;
													Static117.aClass1_Sub4Array1[Static128.anInt2850] = null;
												}
											} else {
												local1783 = Static187.aClass1_Sub11_Sub1_2.method2629();
												@Pc(3179) Class1_Sub4 local3179 = new Class1_Sub4();
												local3179.aLong205 = local197;
												local3179.aString18 = Static252.method3871(local3179.aLong205);
												local3179.aByte1 = local3084;
												local3179.aString19 = local1783;
												local3179.anInt239 = local571;
												for (local221 = Static128.anInt2850 - 1; local221 >= 0; local221--) {
													local490 = Static117.aClass1_Sub4Array1[local221].aString18.compareTo(local3179.aString18);
													if (local490 == 0) {
														Static117.aClass1_Sub4Array1[local221].anInt239 = local571;
														Static117.aClass1_Sub4Array1[local221].aByte1 = local3084;
														Static117.aClass1_Sub4Array1[local221].aString19 = local1783;
														Static34.anInt802 = Static23.anInt471;
														if (local197 == Static189.aLong146) {
															Static256.aByte21 = local3084;
														}
														Static201.anInt4077 = -1;
														return true;
													}
													if (local490 < 0) {
														break;
													}
												}
												if (Static117.aClass1_Sub4Array1.length <= Static128.anInt2850) {
													Static201.anInt4077 = -1;
													return true;
												}
												for (local490 = Static128.anInt2850 - 1; local490 > local221; local490--) {
													Static117.aClass1_Sub4Array1[local490 + 1] = Static117.aClass1_Sub4Array1[local490];
												}
												if (Static128.anInt2850 == 0) {
													Static117.aClass1_Sub4Array1 = new Class1_Sub4[100];
												}
												Static117.aClass1_Sub4Array1[local221 + 1] = local3179;
												if (local197 == Static189.aLong146) {
													Static256.aByte21 = local3084;
												}
												Static128.anInt2850++;
											}
											Static34.anInt802 = Static23.anInt471;
											Static201.anInt4077 = -1;
											return true;
										} else if (Static201.anInt4077 == 34) {
											if (Static33.anInt762 == 0) {
												Static118.aString159 = Static13.aString21;
											} else {
												Static118.aString159 = Static187.aClass1_Sub11_Sub1_2.method2629();
											}
											Static201.anInt4077 = -1;
											return true;
										} else if (Static201.anInt4077 == 187) {
											local132 = Static187.aClass1_Sub11_Sub1_2.method2686();
											local567 = Static187.aClass1_Sub11_Sub1_2.method2631();
											if (Static129.method2220(local567)) {
												local571 = 0;
												if (Static197.aClass14_Sub2_Sub1_2.aClass93_1 != null) {
													local571 = Static197.aClass14_Sub2_Sub1_2.aClass93_1.method2591();
												}
												Static49.method940(local571, -1, local132, 3);
											}
											Static201.anInt4077 = -1;
											return true;
										} else if (Static201.anInt4077 == 98) {
											local132 = Static187.aClass1_Sub11_Sub1_2.method2631();
											local611 = Static187.aClass1_Sub11_Sub1_2.method2629();
											local571 = Static187.aClass1_Sub11_Sub1_2.method2661();
											if (Static129.method2220(local571)) {
												Static181.method3036(local611, local132);
											}
											Static201.anInt4077 = -1;
											return true;
										} else if (Static201.anInt4077 == 36) {
											local132 = Static187.aClass1_Sub11_Sub1_2.method2643();
											@Pc(3412) Class71 local3412 = Static56.method1058(local132);
											for (local571 = 0; local571 < local3412.anIntArray243.length; local571++) {
												local3412.anIntArray243[local571] = -1;
												local3412.anIntArray243[local571] = 0;
											}
											Static160.method2779(local3412);
											Static201.anInt4077 = -1;
											return true;
										} else if (Static201.anInt4077 == 49) {
											local132 = Static187.aClass1_Sub11_Sub1_2.method2690();
											local567 = Static187.aClass1_Sub11_Sub1_2.method2639();
											local571 = Static187.aClass1_Sub11_Sub1_2.method2691();
											@Pc(3465) Class14_Sub2_Sub2 local3465 = Static254.aClass14_Sub2_Sub2Array1[local567];
											if (local3465 != null) {
												Static205.method3297(local571, local3465, local132);
											}
											Static201.anInt4077 = -1;
											return true;
										} else if (Static201.anInt4077 == 189) {
											Static45.anInt1101 = 0;
											Static201.anInt4077 = -1;
											return true;
										} else if (Static201.anInt4077 == 26) {
											local132 = Static187.aClass1_Sub11_Sub1_2.method2691();
											local567 = Static187.aClass1_Sub11_Sub1_2.method2647();
											Static230.method1573(local132, local567);
											Static201.anInt4077 = -1;
											return true;
										} else if (Static201.anInt4077 == 148) {
											Static142.method2352();
											Static225.anInt4482 = Static187.aClass1_Sub11_Sub1_2.method2632();
											Static201.anInt4077 = -1;
											Static63.anInt1344 = Static23.anInt471;
											return true;
										} else if (Static201.anInt4077 == 130) {
											local132 = Static187.aClass1_Sub11_Sub1_2.method2686();
											local567 = Static187.aClass1_Sub11_Sub1_2.method2639();
											local3003 = Static187.aClass1_Sub11_Sub1_2.method2629();
											if (Static129.method2220(local567)) {
												Static5.method199(local3003, local132);
											}
											Static201.anInt4077 = -1;
											return true;
										} else if (Static201.anInt4077 == 216) {
											local132 = Static187.aClass1_Sub11_Sub1_2.method2639();
											local567 = Static187.aClass1_Sub11_Sub1_2.method2665();
											local571 = Static187.aClass1_Sub11_Sub1_2.method2661();
											if (Static129.method2220(local132)) {
												Static168.method2912(local567, local571);
											}
											Static201.anInt4077 = -1;
											return true;
										} else if (Static201.anInt4077 == 183) {
											local132 = Static187.aClass1_Sub11_Sub1_2.method2631();
											local3042 = Static187.aClass1_Sub11_Sub1_2.method2663();
											Static170.method2927(local3042, local132);
											Static201.anInt4077 = -1;
											return true;
										} else if (Static201.anInt4077 == 82) {
											local132 = Static187.aClass1_Sub11_Sub1_2.method2686();
											local567 = Static187.aClass1_Sub11_Sub1_2.method2631();
											Static170.method2927(local132, local567);
											Static201.anInt4077 = -1;
											return true;
										} else if (Static201.anInt4077 == 103) {
											local132 = Static187.aClass1_Sub11_Sub1_2.method2686();
											local567 = Static187.aClass1_Sub11_Sub1_2.method2631();
											local571 = Static187.aClass1_Sub11_Sub1_2.method2643();
											if (Static129.method2220(local567)) {
												@Pc(3655) Class1_Sub17 local3655 = (Class1_Sub17) Static256.aClass70_17.method2075((long) local571);
												local1429 = (Class1_Sub17) Static256.aClass70_17.method2075((long) local132);
												if (local1429 != null) {
													Static59.method3199(local3655 == null || local3655.anInt2431 != local1429.anInt2431, local1429);
												}
												if (local3655 != null) {
													local3655.method4441();
													Static256.aClass70_17.method2084((long) local132, local3655);
												}
												@Pc(3699) Class71 local3699 = Static56.method1058(local571);
												if (local3699 != null) {
													Static160.method2779(local3699);
												}
												local3699 = Static56.method1058(local132);
												if (local3699 != null) {
													Static160.method2779(local3699);
													Static239.method3686(true, local3699);
												}
												if (Static116.anInt5593 != -1) {
													Static90.method1588(1, Static116.anInt5593);
												}
											}
											Static201.anInt4077 = -1;
											return true;
										} else if (Static201.anInt4077 == 5) {
											local132 = Static187.aClass1_Sub11_Sub1_2.method2691();
											local567 = Static187.aClass1_Sub11_Sub1_2.method2690();
											local571 = Static187.aClass1_Sub11_Sub1_2.method2690();
											local622 = Static187.aClass1_Sub11_Sub1_2.method2691();
											local403 = Static187.aClass1_Sub11_Sub1_2.method2690();
											local885 = Static187.aClass1_Sub11_Sub1_2.method2690();
											if (Static129.method2220(local132)) {
												Static82.method1392(local403, local567, local622, local885, local571);
											}
											Static201.anInt4077 = -1;
											return true;
										} else {
											@Pc(3853) Class1_Sub15 local3853;
											@Pc(3844) Class1_Sub15 local3844;
											if (Static201.anInt4077 == 123) {
												local132 = Static187.aClass1_Sub11_Sub1_2.method2627();
												local567 = Static187.aClass1_Sub11_Sub1_2.method2631();
												if (local567 == 65535) {
													local567 = -1;
												}
												local571 = Static187.aClass1_Sub11_Sub1_2.method2691();
												local622 = Static187.aClass1_Sub11_Sub1_2.method2665();
												if (local571 == 65535) {
													local571 = -1;
												}
												local403 = Static187.aClass1_Sub11_Sub1_2.method2631();
												if (Static129.method2220(local403)) {
													for (local885 = local571; local885 <= local567; local885++) {
														local708 = (long) local885 + ((long) local622 << 32);
														local3844 = (Class1_Sub15) Static263.aClass70_19.method2075(local708);
														if (local3844 != null) {
															local3853 = new Class1_Sub15(local132, local3844.anInt1760);
															local3844.method4441();
														} else if (local885 == -1) {
															local3853 = new Class1_Sub15(local132, Static56.method1058(local622).aClass1_Sub15_1.anInt1760);
														} else {
															local3853 = new Class1_Sub15(local132, -1);
														}
														Static263.aClass70_19.method2084(local708, local3853);
													}
												}
												Static201.anInt4077 = -1;
												return true;
											} else if (Static201.anInt4077 == 79) {
												local132 = Static187.aClass1_Sub11_Sub1_2.method2643();
												local567 = Static187.aClass1_Sub11_Sub1_2.method2691();
												local571 = Static187.aClass1_Sub11_Sub1_2.method2661();
												local622 = Static187.aClass1_Sub11_Sub1_2.method2631();
												local403 = Static187.aClass1_Sub11_Sub1_2.method2639();
												if (Static129.method2220(local571)) {
													Static125.method2186(local403, local567, local622, local132);
												}
												Static201.anInt4077 = -1;
												return true;
											} else if (Static201.anInt4077 == 73) {
												local132 = Static187.aClass1_Sub11_Sub1_2.method2691();
												Static44.method887(local132);
												Static276.anIntArray268[Static101.anInt2397++ & 0x1F] = local132 & 0x7FFF;
												Static201.anInt4077 = -1;
												return true;
											} else if (Static201.anInt4077 == 238) {
												Static174.method2980();
												Static142.method2352();
												Static201.anInt4077 = -1;
												Static129.anInt2878 += 32;
												return true;
											} else if (Static201.anInt4077 == 152) {
												local132 = Static187.aClass1_Sub11_Sub1_2.method2691();
												if (local132 == 65535) {
													local132 = -1;
												}
												local567 = Static187.aClass1_Sub11_Sub1_2.method2647();
												local622 = local567 & 0x3;
												local571 = local567 >> 2;
												local403 = Static23.anIntArray58[local571];
												local885 = Static187.aClass1_Sub11_Sub1_2.method2627();
												local221 = local885 >> 14 & 0x3FFF;
												local211 = local885 >> 28 & 0x3;
												local221 -= Static53.anInt5288;
												local490 = local885 & 0x3FFF;
												@Pc(4037) int local4037 = local490 - Static83.anInt1875;
												Static99.method1842(local211, local403, local221, local4037, local571, local132, local622);
												Static201.anInt4077 = -1;
												return true;
											} else if (Static201.anInt4077 == 154) {
												Static135.anInt2980 = Static187.aClass1_Sub11_Sub1_2.method2647();
												Static49.anInt1133 = Static187.aClass1_Sub11_Sub1_2.method2654();
												for (local132 = Static135.anInt2980; local132 < Static135.anInt2980 + 8; local132++) {
													for (local567 = Static49.anInt1133; local567 < Static49.anInt1133 + 8; local567++) {
														if (Static229.aClass61ArrayArrayArray1[Static140.anInt3034][local132][local567] != null) {
															Static229.aClass61ArrayArrayArray1[Static140.anInt3034][local132][local567] = null;
															Static183.method3509(local132, local567);
														}
													}
												}
												for (@Pc(4113) Class1_Sub20 local4113 = (Class1_Sub20) Static80.aClass61_3.method1835(); local4113 != null; local4113 = (Class1_Sub20) Static80.aClass61_3.method1836()) {
													if (Static135.anInt2980 <= local4113.anInt3353 && Static135.anInt2980 + 8 > local4113.anInt3353 && Static49.anInt1133 <= local4113.anInt3341 && Static49.anInt1133 + 8 > local4113.anInt3341 && Static140.anInt3034 == local4113.anInt3349) {
														local4113.anInt3346 = 0;
													}
												}
												Static201.anInt4077 = -1;
												return true;
											} else if (Static201.anInt4077 == 156) {
												Static135.anInt2980 = Static187.aClass1_Sub11_Sub1_2.method2690();
												Static49.anInt1133 = Static187.aClass1_Sub11_Sub1_2.method2654();
												Static201.anInt4077 = -1;
												return true;
											} else if (Static201.anInt4077 == 115) {
												for (local132 = 0; local132 < Static128.anIntArray259.length; local132++) {
													if (Static13.anIntArray31[local132] != Static128.anIntArray259[local132]) {
														Static128.anIntArray259[local132] = Static13.anIntArray31[local132];
														Static250.method3857(local132);
														Static179.anIntArray337[Static129.anInt2878++ & 0x1F] = local132;
													}
												}
												Static201.anInt4077 = -1;
												return true;
											} else if (Static201.anInt4077 == 143) {
												local197 = Static187.aClass1_Sub11_Sub1_2.method2646();
												local3003 = Static231.method450(Static248.method3830(Static186.method3094(Static187.aClass1_Sub11_Sub1_2)));
												Static196.method1924(6, local3003, Static24.method3641(local197));
												Static201.anInt4077 = -1;
												return true;
											} else if (Static201.anInt4077 == 144) {
												local132 = Static187.aClass1_Sub11_Sub1_2.method2631();
												local567 = Static187.aClass1_Sub11_Sub1_2.method2631();
												local571 = Static187.aClass1_Sub11_Sub1_2.method2643();
												if (Static129.method2220(local132)) {
													Static156.method1235(local567, local571);
												}
												Static201.anInt4077 = -1;
												return true;
											} else if (Static201.anInt4077 == 107) {
												local132 = Static187.aClass1_Sub11_Sub1_2.method2661();
												if (local132 == 65535) {
													local132 = -1;
												}
												local567 = Static187.aClass1_Sub11_Sub1_2.method2643();
												local571 = Static187.aClass1_Sub11_Sub1_2.method2631();
												local622 = Static187.aClass1_Sub11_Sub1_2.method2631();
												if (local622 == 65535) {
													local622 = -1;
												}
												local403 = Static187.aClass1_Sub11_Sub1_2.method2661();
												if (Static129.method2220(local403)) {
													for (local885 = local622; local885 <= local132; local885++) {
														local708 = ((long) local567 << 32) + ((long) local885);
														local3844 = (Class1_Sub15) Static263.aClass70_19.method2075(local708);
														if (local3844 != null) {
															local3853 = new Class1_Sub15(local3844.anInt1759, local571);
															local3844.method4441();
														} else if (local885 == -1) {
															local3853 = new Class1_Sub15(Static56.method1058(local567).aClass1_Sub15_1.anInt1759, local571);
														} else {
															local3853 = new Class1_Sub15(0, local571);
														}
														Static263.aClass70_19.method2084(local708, local3853);
													}
												}
												Static201.anInt4077 = -1;
												return true;
											} else if (Static201.anInt4077 == 151) {
												local132 = Static187.aClass1_Sub11_Sub1_2.method2661();
												local567 = Static187.aClass1_Sub11_Sub1_2.method2691();
												local571 = Static187.aClass1_Sub11_Sub1_2.method2686();
												local622 = Static187.aClass1_Sub11_Sub1_2.method2691();
												if (local571 >> 30 == 0) {
													@Pc(4462) Class157 local4462;
													@Pc(4487) Class125 local4487;
													@Pc(4482) Class125 local4482;
													@Pc(4467) Class157 local4467;
													@Pc(4513) Class125 local4513;
													if (local571 >> 29 != 0) {
														local403 = local571 & 0xFFFF;
														@Pc(4432) Class14_Sub2_Sub2 local4432 = Static254.aClass14_Sub2_Sub2Array1[local403];
														if (local4432 != null) {
															if (local132 == 65535) {
																local132 = -1;
															}
															local497 = true;
															if (local132 != -1 && local4432.anInt4656 != -1) {
																if (local132 == local4432.anInt4656) {
																	local4462 = Static242.method3711(local132);
																	if (local4462.aBoolean375 && local4462.anInt4951 != -1) {
																		local4513 = Static90.method1591(local4462.anInt4951);
																		local500 = local4513.anInt3941;
																		if (local500 == 1) {
																			local4432.anInt4673 = 0;
																			local4432.anInt4661 = 0;
																			local4432.anInt4655 = 1;
																			local4432.anInt4657 = 0;
																			local4432.anInt4652 = Static237.anInt4710 + local567;
																			local497 = false;
																			Static77.method1354(local4432.anInt4673, false, local4432.anInt4680, local4513, local4432.anInt4630);
																		} else if (local500 == 2) {
																			local497 = false;
																			local4432.anInt4693 = 0;
																		}
																	}
																} else {
																	local4462 = Static242.method3711(local132);
																	local4467 = Static242.method3711(local4432.anInt4656);
																	if (local4462.anInt4951 != -1 && local4467.anInt4951 != -1) {
																		local4482 = Static90.method1591(local4462.anInt4951);
																		local4487 = Static90.method1591(local4467.anInt4951);
																		if (local4487.anInt3944 > local4482.anInt3944) {
																			local497 = false;
																		}
																	}
																}
															}
															if (local497) {
																local4432.anInt4657 = 0;
																local4432.anInt4641 = local622;
																local4432.anInt4652 = Static237.anInt4710 + local567;
																local4432.anInt4673 = 0;
																local4432.anInt4656 = local132;
																if (local4432.anInt4652 > Static237.anInt4710) {
																	local4432.anInt4673 = -1;
																}
																local4432.anInt4655 = 1;
																if (local4432.anInt4656 != -1 && local4432.anInt4652 == Static237.anInt4710) {
																	local221 = Static242.method3711(local4432.anInt4656).anInt4951;
																	if (local221 != -1) {
																		local4513 = Static90.method1591(local221);
																		if (local4513 != null && local4513.anIntArray357 != null) {
																			Static77.method1354(0, false, local4432.anInt4680, local4513, local4432.anInt4630);
																		}
																	}
																}
															}
														}
													} else if (local571 >> 28 != 0) {
														local403 = local571 & 0xFFFF;
														@Pc(4652) Class14_Sub2_Sub1 local4652;
														if (Static71.anInt1526 == local403) {
															local4652 = Static197.aClass14_Sub2_Sub1_2;
														} else {
															local4652 = Static98.aClass14_Sub2_Sub1Array1[local403];
														}
														if (local4652 != null) {
															local497 = true;
															if (local132 == 65535) {
																local132 = -1;
															}
															if (local132 != -1 && local4652.anInt4656 != -1) {
																if (local132 == local4652.anInt4656) {
																	local4462 = Static242.method3711(local132);
																	if (local4462.aBoolean375 && local4462.anInt4951 != -1) {
																		local4513 = Static90.method1591(local4462.anInt4951);
																		local500 = local4513.anInt3941;
																		if (local500 == 1) {
																			local4652.anInt4673 = 0;
																			local4652.anInt4652 = Static237.anInt4710 + local567;
																			local497 = false;
																			local4652.anInt4657 = 0;
																			local4652.anInt4661 = 0;
																			local4652.anInt4655 = 1;
																			Static77.method1354(local4652.anInt4673, false, local4652.anInt4680, local4513, local4652.anInt4630);
																		} else if (local500 == 2) {
																			local4652.anInt4693 = 0;
																			local497 = false;
																		}
																	}
																} else {
																	local4462 = Static242.method3711(local132);
																	local4467 = Static242.method3711(local4652.anInt4656);
																	if (local4462.anInt4951 != -1 && local4467.anInt4951 != -1) {
																		local4482 = Static90.method1591(local4462.anInt4951);
																		local4487 = Static90.method1591(local4467.anInt4951);
																		if (local4487.anInt3944 > local4482.anInt3944) {
																			local497 = false;
																		}
																	}
																}
															}
															if (local497) {
																local4652.anInt4655 = 1;
																local4652.anInt4656 = local132;
																local4652.anInt4652 = Static237.anInt4710 + local567;
																local4652.anInt4657 = 0;
																if (local4652.anInt4656 == 65535) {
																	local4652.anInt4656 = -1;
																}
																local4652.anInt4641 = local622;
																local4652.anInt4673 = 0;
																if (Static237.anInt4710 < local4652.anInt4652) {
																	local4652.anInt4673 = -1;
																}
																if (local4652.anInt4656 != -1 && Static237.anInt4710 == local4652.anInt4652) {
																	local221 = Static242.method3711(local4652.anInt4656).anInt4951;
																	if (local221 != -1) {
																		local4513 = Static90.method1591(local221);
																		if (local4513 != null && local4513.anIntArray357 != null) {
																			Static77.method1354(0, local4652 == Static197.aClass14_Sub2_Sub1_2, local4652.anInt4680, local4513, local4652.anInt4630);
																		}
																	}
																}
															}
														}
													}
												} else {
													local885 = (local571 >> 14 & 0x3FFF) - Static53.anInt5288;
													local403 = local571 >> 28 & 0x3;
													local211 = (local571 & 0x3FFF) - Static83.anInt1875;
													if (local885 >= 0 && local211 >= 0 && local885 < 104 && local211 < 104) {
														local211 = local211 * 128 + 64;
														local885 = local885 * 128 + 64;
														@Pc(4950) Class14_Sub7 local4950 = new Class14_Sub7(local132, local403, local885, local211, Static20.method383(local211, local403, local885) - local622, local567, Static237.anInt4710);
														Static211.aClass61_23.method1839(new Class1_Sub2_Sub5(local4950));
													}
												}
												Static201.anInt4077 = -1;
												return true;
											} else if (Static201.anInt4077 == 91) {
												local132 = Static187.aClass1_Sub11_Sub1_2.method2654();
												local567 = Static187.aClass1_Sub11_Sub1_2.method2691();
												if (local567 == 65535) {
													local567 = -1;
												}
												Static143.method2371(local132, local567);
												Static201.anInt4077 = -1;
												return true;
											} else if (Static201.anInt4077 == 223) {
												local132 = Static187.aClass1_Sub11_Sub1_2.method2636();
												local567 = Static187.aClass1_Sub11_Sub1_2.method2691();
												local571 = Static187.aClass1_Sub11_Sub1_2.method2675();
												if (local567 == 65535) {
													local567 = -1;
												}
												Static178.method3183(local571, local567, local132);
												Static201.anInt4077 = -1;
												return true;
											} else {
												@Pc(5045) Class71 local5045;
												if (Static201.anInt4077 == 255) {
													local132 = Static187.aClass1_Sub11_Sub1_2.method2643();
													local567 = Static187.aClass1_Sub11_Sub1_2.method2691();
													if (local132 < -70000) {
														local567 += 32768;
													}
													if (local132 < 0) {
														local5045 = null;
													} else {
														local5045 = Static56.method1058(local132);
													}
													while (Static187.aClass1_Sub11_Sub1_2.anInt3264 < Static33.anInt762) {
														local622 = Static187.aClass1_Sub11_Sub1_2.method2664();
														local403 = Static187.aClass1_Sub11_Sub1_2.method2691();
														local885 = 0;
														if (local403 != 0) {
															local885 = Static187.aClass1_Sub11_Sub1_2.method2690();
															if (local885 == 255) {
																local885 = Static187.aClass1_Sub11_Sub1_2.method2643();
															}
														}
														if (local5045 != null && local622 >= 0 && local622 < local5045.anIntArray243.length) {
															local5045.anIntArray243[local622] = local403;
															local5045.anIntArray239[local622] = local885;
														}
														Static77.method1352(local885, local622, local567, local403 - 1);
													}
													if (local5045 != null) {
														Static160.method2779(local5045);
													}
													Static142.method2352();
													Static276.anIntArray268[Static101.anInt2397++ & 0x1F] = local567 & 0x7FFF;
													Static201.anInt4077 = -1;
													return true;
												} else if (Static201.anInt4077 == 124) {
													Static187.aClass1_Sub11_Sub1_2.anInt3264 += 28;
													if (Static187.aClass1_Sub11_Sub1_2.method2674()) {
														Static141.method2346(Static187.aClass1_Sub11_Sub1_2, Static187.aClass1_Sub11_Sub1_2.anInt3264 - 28);
													}
													Static201.anInt4077 = -1;
													return true;
												} else if (Static201.anInt4077 == 229) {
													if (Static237.aFrame2 != null) {
														Static102.method1909(Static296.anInt5585, -1, false, -1);
													}
													@Pc(5180) byte[] local5180 = new byte[Static33.anInt762];
													Static187.aClass1_Sub11_Sub1_2.method2695(local5180, Static33.anInt762);
													local611 = Static100.method1873(Static33.anInt762, local5180, 0);
													if (Static193.aFrame1 == null && (Static288.anInt5481 == 3 || !Static288.aString328.startsWith("win") || Static194.aBoolean305)) {
														Static85.method1482(true, local611);
													} else {
														Static196.aBoolean168 = true;
														Static262.aString303 = local611;
														Static244.aClass116_5 = Static253.aClass175_4.method4331(local611);
													}
													Static201.anInt4077 = -1;
													return true;
												} else if (Static201.anInt4077 == 10) {
													anInt3196 = Static187.aClass1_Sub11_Sub1_2.method2690();
													Static201.anInt4077 = -1;
													return true;
												} else if (Static201.anInt4077 == 179) {
													local132 = Static187.aClass1_Sub11_Sub1_2.method2661();
													if (local132 == 65535) {
														local132 = -1;
													}
													local567 = Static187.aClass1_Sub11_Sub1_2.method2639();
													local571 = Static187.aClass1_Sub11_Sub1_2.method2627();
													if (Static129.method2220(local567)) {
														Static49.method940(local132, -1, local571, 2);
													}
													Static201.anInt4077 = -1;
													return true;
												} else if (Static201.anInt4077 == 116) {
													local132 = Static187.aClass1_Sub11_Sub1_2.method2691();
													local567 = Static187.aClass1_Sub11_Sub1_2.method2643();
													if (Static129.method2220(local132)) {
														@Pc(5302) Class1_Sub17 local5302 = (Class1_Sub17) Static256.aClass70_17.method2075((long) local567);
														if (local5302 != null) {
															Static59.method3199(true, local5302);
														}
														if (Static3.aClass71_1 != null) {
															Static160.method2779(Static3.aClass71_1);
															Static3.aClass71_1 = null;
														}
													}
													Static201.anInt4077 = -1;
													return true;
												} else if (Static201.anInt4077 == 96) {
													Static246.method3818();
													Static201.anInt4077 = -1;
													return true;
												} else if (Static201.anInt4077 == 192) {
													local132 = Static187.aClass1_Sub11_Sub1_2.method2643();
													local567 = Static187.aClass1_Sub11_Sub1_2.method2691();
													if (local132 < -70000) {
														local567 += 32768;
													}
													if (local132 >= 0) {
														local5045 = Static56.method1058(local132);
													} else {
														local5045 = null;
													}
													if (local5045 != null) {
														for (local622 = 0; local622 < local5045.anIntArray243.length; local622++) {
															local5045.anIntArray243[local622] = 0;
															local5045.anIntArray239[local622] = 0;
														}
													}
													Static143.method2368(local567);
													local622 = Static187.aClass1_Sub11_Sub1_2.method2691();
													for (local403 = 0; local403 < local622; local403++) {
														local885 = Static187.aClass1_Sub11_Sub1_2.method2654();
														if (local885 == 255) {
															local885 = Static187.aClass1_Sub11_Sub1_2.method2665();
														}
														local211 = Static187.aClass1_Sub11_Sub1_2.method2631();
														if (local5045 != null && local5045.anIntArray243.length > local403) {
															local5045.anIntArray243[local403] = local211;
															local5045.anIntArray239[local403] = local885;
														}
														Static77.method1352(local885, local403, local567, local211 - 1);
													}
													if (local5045 != null) {
														Static160.method2779(local5045);
													}
													Static142.method2352();
													Static276.anIntArray268[Static101.anInt2397++ & 0x1F] = local567 & 0x7FFF;
													Static201.anInt4077 = -1;
													return true;
												} else if (Static201.anInt4077 == 89) {
													Static254.method3889(Static187.aClass1_Sub11_Sub1_2.method2629());
													Static201.anInt4077 = -1;
													return true;
												} else if (Static201.anInt4077 == 211) {
													local132 = Static187.aClass1_Sub11_Sub1_2.method2627();
													local567 = Static187.aClass1_Sub11_Sub1_2.method2631();
													local571 = Static187.aClass1_Sub11_Sub1_2.method2665();
													local622 = Static187.aClass1_Sub11_Sub1_2.method2639();
													if (local622 == 65535) {
														local622 = -1;
													}
													if (Static129.method2220(local567)) {
														@Pc(5522) Class71 local5522 = Static56.method1058(local571);
														@Pc(5534) Class42 local5534;
														if (local5522.aBoolean196) {
															Static137.method2332(local132, local571, local622);
															local5534 = Static112.method2060(local622);
															Static125.method2186(local5534.anInt1485, local5534.anInt1498, local5534.anInt1461, local571);
															Static29.method565(local5534.anInt1492, local5534.anInt1495, local571, local5534.anInt1468);
														} else if (local622 == -1) {
															Static201.anInt4077 = -1;
															local5522.anInt2705 = 0;
															return true;
														} else {
															local5534 = Static112.method2060(local622);
															local5522.anInt2651 = local622;
															local5522.anInt2635 = local5534.anInt1485;
															local5522.anInt2672 = local5534.anInt1498;
															local5522.anInt2634 = local5534.anInt1461 * 100 / local132;
															local5522.anInt2705 = 4;
															Static160.method2779(local5522);
														}
													}
													Static201.anInt4077 = -1;
													return true;
												} else if (Static201.anInt4077 == 99) {
													Static49.anInt1133 = Static187.aClass1_Sub11_Sub1_2.method2647();
													Static135.anInt2980 = Static187.aClass1_Sub11_Sub1_2.method2654();
													while (Static187.aClass1_Sub11_Sub1_2.anInt3264 < Static33.anInt762) {
														Static201.anInt4077 = Static187.aClass1_Sub11_Sub1_2.method2690();
														Static100.method1871();
													}
													Static201.anInt4077 = -1;
													return true;
												} else if (Static201.anInt4077 == 204) {
													Static142.method2352();
													local132 = Static187.aClass1_Sub11_Sub1_2.method2675();
													local567 = Static187.aClass1_Sub11_Sub1_2.method2643();
													local571 = Static187.aClass1_Sub11_Sub1_2.method2654();
													Static179.anIntArray336[local132] = local567;
													Static216.anIntArray384[local132] = local571;
													Static181.anIntArray340[local132] = 1;
													for (local622 = 0; local622 < 98; local622++) {
														if (Class126.anIntArray360[local622] <= local567) {
															Static181.anIntArray340[local132] = local622 + 2;
														}
													}
													Static108.anIntArray220[Static244.anInt4849++ & 0x1F] = local132;
													Static201.anInt4077 = -1;
													return true;
												} else if (Static201.anInt4077 == 30) {
													local132 = Static187.aClass1_Sub11_Sub1_2.method2690();
													local567 = local132 >> 5;
													local571 = local132 & 0x1F;
													if (local571 == 0) {
														Static198.aClass80Array2[local567] = null;
														Static201.anInt4077 = -1;
														return true;
													}
													@Pc(5732) Class80 local5732 = new Class80();
													local5732.anInt2843 = local571;
													local5732.anInt2843 = local132 & 0x3F;
													local5732.anInt2848 = Static187.aClass1_Sub11_Sub1_2.method2690();
													if (local5732.anInt2848 >= 0 && Static135.aClass1_Sub2_Sub11Array3.length > local5732.anInt2848) {
														if (local5732.anInt2843 == 1 || local5732.anInt2843 == 10) {
															local5732.anInt2839 = Static187.aClass1_Sub11_Sub1_2.method2691();
															Static187.aClass1_Sub11_Sub1_2.anInt3264 += 5;
														} else if (local5732.anInt2843 >= 2 && local5732.anInt2843 <= 6) {
															if (local5732.anInt2843 == 2) {
																local5732.anInt2854 = 64;
																local5732.anInt2849 = 64;
															}
															if (local5732.anInt2843 == 3) {
																local5732.anInt2849 = 0;
																local5732.anInt2854 = 64;
															}
															if (local5732.anInt2843 == 4) {
																local5732.anInt2854 = 64;
																local5732.anInt2849 = 128;
															}
															if (local5732.anInt2843 == 5) {
																local5732.anInt2854 = 0;
																local5732.anInt2849 = 64;
															}
															if (local5732.anInt2843 == 6) {
																local5732.anInt2849 = 64;
																local5732.anInt2854 = 128;
															}
															local5732.anInt2843 = 2;
															local5732.anInt2847 = Static187.aClass1_Sub11_Sub1_2.method2691();
															local5732.anInt2855 = Static187.aClass1_Sub11_Sub1_2.method2691();
															local5732.anInt2853 = Static187.aClass1_Sub11_Sub1_2.method2690();
															local5732.anInt2838 = Static187.aClass1_Sub11_Sub1_2.method2691();
														}
														local5732.anInt2852 = Static187.aClass1_Sub11_Sub1_2.method2691();
														if (local5732.anInt2852 == 65535) {
															local5732.anInt2852 = -1;
														}
														Static198.aClass80Array2[local567] = local5732;
													}
													Static201.anInt4077 = -1;
													return true;
												} else {
													Static3.method136("T1 - " + Static201.anInt4077 + "," + Static227.anInt4510 + "," + Static33.anInt768 + " - " + Static33.anInt762, null);
													Static39.method822();
													return true;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
