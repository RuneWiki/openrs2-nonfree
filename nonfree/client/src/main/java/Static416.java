import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!or", name = "h", descriptor = "I")
	public static int anInt7323 = -1;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)V")
	public static void method6438() {
		@Pc(9) int[] local9 = new int[Static298.aClass132_1.anInt3568];
		@Pc(11) int local11 = 0;
		for (@Pc(19) int local19 = 0; local19 < Static298.aClass132_1.anInt3568; local19++) {
			@Pc(26) Class259 local26 = Static298.aClass132_1.method3062(local19);
			if (local26.anInt7347 >= 0 || local26.anInt7368 >= 0) {
				local9[local11++] = local19;
			}
		}
		Static99.anIntArray494 = new int[local11];
		for (@Pc(53) int local53 = 0; local53 < local11; local53++) {
			Static99.anIntArray494[local53] = local9[local53];
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(II)V")
	public static void method6439(@OriginalArg(1) int arg0) {
		if (!Static64.method1061(arg0)) {
			return;
		}
		@Pc(14) Class344[] local14 = Static319.aClass344ArrayArray2[arg0];
		for (@Pc(22) int local22 = 0; local22 < local14.length; local22++) {
			@Pc(28) Class344 local28 = local14[local22];
			if (local28 != null) {
				local28.anInt9630 = 1;
				local28.anInt9556 = 0;
				local28.anInt9582 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(B)Z")
	public static boolean method6440() throws IOException {
		if (Static547.aClass197_1 == null) {
			return false;
		}
		@Pc(73) int local73;
		if (Static180.aClass194_100 == null) {
			if (Static590.aBoolean735) {
				if (!Static547.aClass197_1.method5195(1)) {
					return false;
				}
				Static547.aClass197_1.method5194(Static47.aClass3_Sub9_Sub2_1.aByteArray51, 1, 0);
				Static590.aBoolean735 = false;
				Static636.anInt10110++;
				Static381.anInt6903 = 0;
			}
			Static47.aClass3_Sub9_Sub2_1.anInt6453 = 0;
			if (Static47.aClass3_Sub9_Sub2_1.method5641()) {
				if (!Static547.aClass197_1.method5195(1)) {
					return false;
				}
				Static547.aClass197_1.method5194(Static47.aClass3_Sub9_Sub2_1.aByteArray51, 1, 1);
				Static381.anInt6903 = 0;
				Static636.anInt10110++;
			}
			Static590.aBoolean735 = true;
			@Pc(69) Class194[] local69 = Static85.method1427();
			local73 = Static47.aClass3_Sub9_Sub2_1.method5651();
			if (local73 < 0 || local73 >= local69.length) {
				throw new IOException("invo:" + local73 + " ip:" + Static47.aClass3_Sub9_Sub2_1.anInt6453);
			}
			Static180.aClass194_100 = local69[local73];
			Static94.anInt1852 = Static180.aClass194_100.anInt5980;
		}
		if (Static94.anInt1852 == -1) {
			if (!Static547.aClass197_1.method5195(1)) {
				return false;
			}
			Static547.aClass197_1.method5194(Static47.aClass3_Sub9_Sub2_1.aByteArray51, 1, 0);
			Static94.anInt1852 = Static47.aClass3_Sub9_Sub2_1.aByteArray51[0] & 0xFF;
			Static381.anInt6903 = 0;
			Static636.anInt10110++;
		}
		if (Static94.anInt1852 == -2) {
			if (!Static547.aClass197_1.method5195(2)) {
				return false;
			}
			Static547.aClass197_1.method5194(Static47.aClass3_Sub9_Sub2_1.aByteArray51, 2, 0);
			Static47.aClass3_Sub9_Sub2_1.anInt6453 = 0;
			Static94.anInt1852 = Static47.aClass3_Sub9_Sub2_1.method5610();
			Static381.anInt6903 = 0;
			Static636.anInt10110 += 2;
		}
		if (Static94.anInt1852 > 0) {
			if (!Static547.aClass197_1.method5195(Static94.anInt1852)) {
				return false;
			}
			Static47.aClass3_Sub9_Sub2_1.anInt6453 = 0;
			Static547.aClass197_1.method5194(Static47.aClass3_Sub9_Sub2_1.aByteArray51, Static94.anInt1852, 0);
			Static381.anInt6903 = 0;
			Static636.anInt10110 += Static94.anInt1852;
		}
		Static278.aClass194_159 = Static427.aClass194_241;
		Static427.aClass194_241 = Static409.aClass194_231;
		Static409.aClass194_231 = Static180.aClass194_100;
		@Pc(209) int local209;
		if (Static483.aClass194_264 == Static180.aClass194_100) {
			local209 = Static47.aClass3_Sub9_Sub2_1.method5633();
			Static95.method1581();
			Static224.anInt4539 = local209;
			Static180.aClass194_100 = null;
			return true;
		}
		@Pc(229) String local229;
		if (Static180.aClass194_100 == Static220.aClass194_122) {
			local209 = Static47.aClass3_Sub9_Sub2_1.method5610();
			local229 = Static47.aClass3_Sub9_Sub2_1.method5607();
			Static95.method1581();
			Static126.method2240(local229, local209);
			Static180.aClass194_100 = null;
			return true;
		}
		@Pc(255) int local255;
		if (Static180.aClass194_100 == Static573.aClass194_204) {
			local209 = Static47.aClass3_Sub9_Sub2_1.method5597();
			local73 = Static47.aClass3_Sub9_Sub2_1.method5610();
			local255 = Static47.aClass3_Sub9_Sub2_1.method5610();
			Static95.method1581();
			Static582.method8113(local209, local255 + (local73 << 16));
			Static180.aClass194_100 = null;
			return true;
		} else if (Static180.aClass194_100 == Static298.aClass194_170) {
			for (local209 = 0; local209 < Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1.length; local209++) {
				if (Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local209] != null) {
					Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local209].anIntArray666 = null;
					Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local209].anInt10193 = -1;
				}
			}
			for (local73 = 0; local73 < Static73.anInt1445; local73++) {
				Static179.aClass3_Sub43Array1[local73].aClass9_Sub2_Sub1_Sub2_Sub2_2.anIntArray666 = null;
				Static179.aClass3_Sub43Array1[local73].aClass9_Sub2_Sub1_Sub2_Sub2_2.anInt10193 = -1;
			}
			Static180.aClass194_100 = null;
			return true;
		} else if (Static221.aClass194_310 == Static180.aClass194_100) {
			local209 = Static47.aClass3_Sub9_Sub2_1.method5628();
			local73 = Static47.aClass3_Sub9_Sub2_1.method5597();
			Static95.method1581();
			Static56.method1017(local73, local209);
			Static180.aClass194_100 = null;
			return true;
		} else if (Static465.aClass194_255 == Static180.aClass194_100) {
			Static461.aString68 = Static94.anInt1852 > 2 ? Static47.aClass3_Sub9_Sub2_1.method5607() : Static369.aClass235_29.method5893(Static455.anInt7738);
			Static90.anInt8334 = Static94.anInt1852 > 0 ? Static47.aClass3_Sub9_Sub2_1.method5610() : -1;
			Static180.aClass194_100 = null;
			if (Static90.anInt8334 == 65535) {
				Static90.anInt8334 = -1;
			}
			return true;
		} else {
			@Pc(414) int local414;
			@Pc(418) int local418;
			@Pc(710) String local710;
			@Pc(442) int local442;
			@Pc(402) boolean local402;
			@Pc(674) String local674;
			@Pc(420) String local420;
			@Pc(410) String local410;
			if (Static123.aClass194_80 == Static180.aClass194_100) {
				@Pc(480) boolean local480;
				while (Static94.anInt1852 > Static47.aClass3_Sub9_Sub2_1.anInt6453) {
					local402 = Static47.aClass3_Sub9_Sub2_1.method5633() == 1;
					local229 = Static47.aClass3_Sub9_Sub2_1.method5607();
					local410 = Static47.aClass3_Sub9_Sub2_1.method5607();
					local414 = Static47.aClass3_Sub9_Sub2_1.method5610();
					local418 = Static47.aClass3_Sub9_Sub2_1.method5633();
					local420 = "";
					@Pc(422) boolean local422 = false;
					if (local414 > 0) {
						local420 = Static47.aClass3_Sub9_Sub2_1.method5607();
						local422 = Static47.aClass3_Sub9_Sub2_1.method5633() == 1;
					}
					for (local442 = 0; local442 < Static606.anInt9791; local442++) {
						if (local402) {
							if (local410.equals(Static233.aStringArray32[local442])) {
								Static233.aStringArray32[local442] = local229;
								local229 = null;
								Static633.aStringArray14[local442] = local410;
								break;
							}
						} else if (local229.equals(Static233.aStringArray32[local442])) {
							if (local414 != Static112.anIntArray152[local442]) {
								local480 = true;
								for (@Pc(485) Class9_Sub3_Sub1 local485 = (Class9_Sub3_Sub1) Static132.aClass139_3.method3198(); local485 != null; local485 = (Class9_Sub3_Sub1) Static132.aClass139_3.method3205()) {
									if (local485.aString21.equals(local229)) {
										if (local414 != 0 && local485.aShort41 == 0) {
											local485.method8593();
											local480 = false;
										} else if (local414 == 0 && local485.aShort41 != 0) {
											local480 = false;
											local485.method8593();
										}
									}
								}
								if (local480) {
									Static132.aClass139_3.method3203(new Class9_Sub3_Sub1(local229, local414));
								}
								Static112.anIntArray152[local442] = local414;
							}
							Static633.aStringArray14[local442] = local410;
							Static1.aStringArray75[local442] = local420;
							Static33.anIntArray38[local442] = local418;
							Static211.aBooleanArray13[local442] = local422;
							local229 = null;
							break;
						}
					}
					if (local229 != null && Static606.anInt9791 < 200) {
						Static233.aStringArray32[Static606.anInt9791] = local229;
						Static633.aStringArray14[Static606.anInt9791] = local410;
						Static112.anIntArray152[Static606.anInt9791] = local414;
						Static1.aStringArray75[Static606.anInt9791] = local420;
						Static33.anIntArray38[Static606.anInt9791] = local418;
						Static211.aBooleanArray13[Static606.anInt9791] = local422;
						Static606.anInt9791++;
					}
				}
				Static492.anInt8360 = Static303.anInt8405;
				Static468.anInt8022 = 2;
				local73 = Static606.anInt9791;
				while (local73 > 0) {
					local402 = true;
					local73--;
					for (local255 = 0; local255 < local73; local255++) {
						if (Static112.anIntArray152[local255] != Static28.aClass157_1.anInt4641 && Static28.aClass157_1.anInt4641 == Static112.anIntArray152[local255 + 1] || Static112.anIntArray152[local255] == 0 && Static112.anIntArray152[local255 + 1] != 0) {
							local414 = Static112.anIntArray152[local255];
							Static112.anIntArray152[local255] = Static112.anIntArray152[local255 + 1];
							Static112.anIntArray152[local255 + 1] = local414;
							local674 = Static1.aStringArray75[local255];
							Static1.aStringArray75[local255] = Static1.aStringArray75[local255 + 1];
							Static1.aStringArray75[local255 + 1] = local674;
							local420 = Static233.aStringArray32[local255];
							Static233.aStringArray32[local255] = Static233.aStringArray32[local255 + 1];
							Static233.aStringArray32[local255 + 1] = local420;
							local710 = Static633.aStringArray14[local255];
							Static633.aStringArray14[local255] = Static633.aStringArray14[local255 + 1];
							Static633.aStringArray14[local255 + 1] = local710;
							local442 = Static33.anIntArray38[local255];
							Static33.anIntArray38[local255] = Static33.anIntArray38[local255 + 1];
							Static33.anIntArray38[local255 + 1] = local442;
							local480 = Static211.aBooleanArray13[local255];
							Static211.aBooleanArray13[local255] = Static211.aBooleanArray13[local255 + 1];
							Static211.aBooleanArray13[local255 + 1] = local480;
							local402 = false;
						}
					}
					if (local402) {
						break;
					}
				}
				Static180.aClass194_100 = null;
				return true;
			} else if (Static590.aClass194_289 == Static180.aClass194_100) {
				Static234.method3997(Static562.aClass215_13);
				Static180.aClass194_100 = null;
				return true;
			} else if (Static618.aClass194_300 == Static180.aClass194_100) {
				local209 = Static47.aClass3_Sub9_Sub2_1.method5594();
				local73 = Static47.aClass3_Sub9_Sub2_1.method5628();
				@Pc(804) int[] local804 = new int[4];
				for (local414 = 0; local414 < 4; local414++) {
					local804[local414] = Static47.aClass3_Sub9_Sub2_1.method5634();
				}
				@Pc(825) Class3_Sub43 local825 = (Class3_Sub43) Static545.aClass25_40.method426((long) local73);
				if (local825 != null) {
					Static217.method3798(local804, local209, local825.aClass9_Sub2_Sub1_Sub2_Sub2_2);
				}
				Static180.aClass194_100 = null;
				return true;
			} else if (Static148.aClass194_88 == Static180.aClass194_100) {
				local209 = Static47.aClass3_Sub9_Sub2_1.method5585();
				Static95.method1581();
				Static270.method4506(local209, 5, Static54.anInt1032, 0);
				Static180.aClass194_100 = null;
				return true;
			} else if (Static583.aClass194_309 == Static180.aClass194_100) {
				local209 = Static47.aClass3_Sub9_Sub2_1.method5586();
				if (Static198.anInt7015 != local209) {
					Static198.anInt7015 = local209;
					Static400.method6281(Static277.aClass379_7, -1, -1);
				}
				Static180.aClass194_100 = null;
				return true;
			} else if (Static311.aClass194_177 == Static180.aClass194_100) {
				Static479.method6549(Static94.anInt1852, Static47.aClass3_Sub9_Sub2_1, Static48.aClass298_12);
				Static180.aClass194_100 = null;
				return true;
			} else if (Static180.aClass194_100 == Static179.aClass194_99) {
				Static108.method1800();
				Static180.aClass194_100 = null;
				return true;
			} else if (Static180.aClass194_100 == Static107.aClass194_73) {
				local209 = Static47.aClass3_Sub9_Sub2_1.method5611();
				Static95.method1581();
				@Pc(915) Class3_Sub1 local915 = (Class3_Sub1) Static128.aClass25_7.method426((long) local209);
				if (local915 != null) {
					Static69.method1233(local915, true, false);
				}
				if (Static9.aClass344_1 != null) {
					Static605.method8323(Static9.aClass344_1);
					Static9.aClass344_1 = null;
				}
				Static180.aClass194_100 = null;
				return true;
			} else if (Static180.aClass194_100 == Static439.aClass194_284) {
				Static234.method3997(Static278.aClass215_8);
				Static180.aClass194_100 = null;
				return true;
			} else if (Static4.aClass194_3 == Static180.aClass194_100) {
				Static281.method4577(Static47.aClass3_Sub9_Sub2_1, Static94.anInt1852);
				Static180.aClass194_100 = null;
				return true;
			} else if (Static379.aClass194_207 == Static180.aClass194_100) {
				local209 = Static47.aClass3_Sub9_Sub2_1.method5610();
				local73 = Static47.aClass3_Sub9_Sub2_1.method5594();
				Static95.method1581();
				if (local73 == 2) {
					Static464.method6853();
				}
				Static528.anInt8950 = local209;
				method6439(local209);
				Static228.method3952(false);
				Static400.method6287(Static528.anInt8950);
				for (local255 = 0; local255 < 100; local255++) {
					Static110.aBooleanArray5[local255] = true;
				}
				Static180.aClass194_100 = null;
				return true;
			} else if (Static180.aClass194_100 == Static329.aClass194_188) {
				Static589.anInt9635 = Static47.aClass3_Sub9_Sub2_1.method5602();
				Static110.anInt2203 = Static47.aClass3_Sub9_Sub2_1.method5602();
				Static180.aClass194_100 = null;
				return true;
			} else if (Static180.aClass194_100 == Static444.aClass194_250) {
				Static132.method2343();
				Static180.aClass194_100 = null;
				return false;
			} else if (Static180.aClass194_100 == Static84.aClass194_278) {
				local209 = Static47.aClass3_Sub9_Sub2_1.method5602();
				local73 = Static47.aClass3_Sub9_Sub2_1.method5610();
				Static183.aClass285_1.method6947(local73, local209);
				Static180.aClass194_100 = null;
				return true;
			} else if (Static180.aClass194_100 == Static355.aClass194_302) {
				Static95.method1581();
				Static366.method5861();
				Static180.aClass194_100 = null;
				return true;
			} else if (Static415.aClass194_234 == Static180.aClass194_100) {
				Static234.method3997(Static469.aClass215_12);
				Static180.aClass194_100 = null;
				return true;
			} else {
				@Pc(1097) int local1097;
				@Pc(1085) boolean local1085;
				if (Static426.aClass194_239 == Static180.aClass194_100) {
					local209 = Static47.aClass3_Sub9_Sub2_1.method5610();
					local73 = Static47.aClass3_Sub9_Sub2_1.method5633();
					local1085 = (local73 & 0x1) == 1;
					while (Static47.aClass3_Sub9_Sub2_1.anInt6453 < Static94.anInt1852) {
						local414 = Static47.aClass3_Sub9_Sub2_1.method5606();
						local418 = Static47.aClass3_Sub9_Sub2_1.method5610();
						local1097 = 0;
						if (local418 != 0) {
							local1097 = Static47.aClass3_Sub9_Sub2_1.method5633();
							if (local1097 == 255) {
								local1097 = Static47.aClass3_Sub9_Sub2_1.method5585();
							}
						}
						Static111.method1839(local414, local1097, local1085, local209, local418 - 1);
					}
					Static597.anIntArray612[Static88.anInt1731++ & 0x1F] = local209;
					Static180.aClass194_100 = null;
					return true;
				}
				@Pc(1153) String local1153;
				if (Static180.aClass194_100 == Static350.aClass194_198) {
					local1153 = Static47.aClass3_Sub9_Sub2_1.method5607();
					local229 = Static212.method3300(Static590.method8196(Static47.aClass3_Sub9_Sub2_1));
					Static329.method5394(local229, local1153, local1153, local1153, 6, 0);
					Static180.aClass194_100 = null;
					return true;
				}
				@Pc(1188) String local1188;
				if (Static81.aClass194_61 == Static180.aClass194_100) {
					local209 = Static47.aClass3_Sub9_Sub2_1.method5606();
					local73 = Static47.aClass3_Sub9_Sub2_1.method5585();
					local255 = Static47.aClass3_Sub9_Sub2_1.method5633();
					local1188 = "";
					local674 = local1188;
					if ((local255 & 0x1) != 0) {
						local1188 = Static47.aClass3_Sub9_Sub2_1.method5607();
						if ((local255 & 0x2) == 0) {
							local674 = local1188;
						} else {
							local674 = Static47.aClass3_Sub9_Sub2_1.method5607();
						}
					}
					local420 = Static47.aClass3_Sub9_Sub2_1.method5607();
					if (local209 == 99) {
						Static8.method147(local420);
					} else if (local674.equals("") || !Static427.method6524(local674)) {
						Static329.method5394(local420, local674, local1188, local1188, local209, local73);
					} else {
						Static180.aClass194_100 = null;
						return true;
					}
					Static180.aClass194_100 = null;
					return true;
				}
				@Pc(1295) long local1295;
				@Pc(1301) Class3_Sub50 local1301;
				@Pc(1316) Class3_Sub50 local1316;
				if (Static233.aClass194_127 == Static180.aClass194_100) {
					local209 = Static47.aClass3_Sub9_Sub2_1.method5611();
					local73 = Static47.aClass3_Sub9_Sub2_1.method5628();
					if (local73 == 65535) {
						local73 = -1;
					}
					local255 = Static47.aClass3_Sub9_Sub2_1.method5628();
					if (local255 == 65535) {
						local255 = -1;
					}
					local414 = Static47.aClass3_Sub9_Sub2_1.method5597();
					Static95.method1581();
					for (local418 = local73; local418 <= local255; local418++) {
						local1295 = (long) local418 + ((long) local414 << 32);
						local1301 = (Class3_Sub50) Static389.aClass25_29.method426(local1295);
						if (local1301 != null) {
							local1316 = new Class3_Sub50(local209, local1301.anInt9448);
							local1301.method8682();
						} else if (local418 == -1) {
							local1316 = new Class3_Sub50(local209, Static324.method5363(local414).aClass3_Sub50_3.anInt9448);
						} else {
							local1316 = new Class3_Sub50(local209, -1);
						}
						Static389.aClass25_29.method434(local1295, local1316);
					}
					Static180.aClass194_100 = null;
					return true;
				} else if (Static180.aClass194_100 == Static76.aClass194_59) {
					local209 = Static47.aClass3_Sub9_Sub2_1.method5626();
					local73 = Static47.aClass3_Sub9_Sub2_1.method5585();
					local255 = Static47.aClass3_Sub9_Sub2_1.method5626();
					Static114.anIntArray160[local255] = local73;
					Static442.anIntArray462[local255] = local209;
					Static389.anIntArray406[local255] = 1;
					local414 = Static256.anIntArray274[local255] - 1;
					for (local418 = 0; local418 < local414; local418++) {
						if (Class3_Sub2_Sub23.anIntArray373[local418] <= local73) {
							Static389.anIntArray406[local255] = local418 + 2;
						}
					}
					Static478.anIntArray498[Static632.anInt10072++ & 0x1F] = local255;
					Static180.aClass194_100 = null;
					return true;
				} else if (Static180.aClass194_100 == Static133.aClass194_308) {
					local209 = Static47.aClass3_Sub9_Sub2_1.method5586();
					local73 = Static47.aClass3_Sub9_Sub2_1.method5634();
					Static95.method1581();
					if (local73 == 65535) {
						local73 = -1;
					}
					Static270.method4506(local209, 1, local73, -1);
					Static180.aClass194_100 = null;
					return true;
				} else if (Static180.aClass194_100 == Static95.aClass194_67) {
					local209 = Static47.aClass3_Sub9_Sub2_1.method5633();
					local73 = Static47.aClass3_Sub9_Sub2_1.method5610();
					local1085 = (local209 & 0x1) == 1;
					Static464.method6849(local73, local1085);
					Static597.anIntArray612[Static88.anInt1731++ & 0x1F] = local73;
					Static180.aClass194_100 = null;
					return true;
				} else if (Static236.aClass194_128 == Static180.aClass194_100) {
					if (Static528.anInt8950 != -1) {
						Static24.method329(Static528.anInt8950, 0);
					}
					Static180.aClass194_100 = null;
					return true;
				} else if (Static180.aClass194_100 == Static629.aClass194_303) {
					local209 = Static47.aClass3_Sub9_Sub2_1.method5611();
					local73 = Static47.aClass3_Sub9_Sub2_1.method5585();
					local255 = Static47.aClass3_Sub9_Sub2_1.method5610();
					Static95.method1581();
					if (local255 == 65535) {
						local255 = -1;
					}
					Static291.method4811(local73, local209, local255);
					@Pc(1543) Class259 local1543 = Static298.aClass132_1.method3062(local255);
					Static173.method2879(local1543.anInt7335, local1543.anInt7384, local209, local1543.anInt7375);
					Static424.method6728(local1543.anInt7363, local1543.anInt7362, local209, local1543.anInt7382);
					Static180.aClass194_100 = null;
					return true;
				} else if (Static180.aClass194_100 == Static317.aClass194_183) {
					Static180.aClass194_100 = null;
					return false;
				} else if (Static180.aClass194_100 == Static198.aClass194_214) {
					Static191.anInt3579 = Static47.aClass3_Sub9_Sub2_1.method5633();
					for (local209 = 0; local209 < Static191.anInt3579; local209++) {
						Static151.aStringArray24[local209] = Static47.aClass3_Sub9_Sub2_1.method5607();
						Static209.aStringArray30[local209] = Static47.aClass3_Sub9_Sub2_1.method5607();
						if (Static209.aStringArray30[local209].equals("")) {
							Static209.aStringArray30[local209] = Static151.aStringArray24[local209];
						}
						Static193.aStringArray82[local209] = Static47.aClass3_Sub9_Sub2_1.method5607();
						Static492.aStringArray70[local209] = Static47.aClass3_Sub9_Sub2_1.method5607();
						if (Static492.aStringArray70[local209].equals("")) {
							Static492.aStringArray70[local209] = Static193.aStringArray82[local209];
						}
						Static158.aBooleanArray9[local209] = false;
					}
					Static492.anInt8360 = Static303.anInt8405;
					Static180.aClass194_100 = null;
					return true;
				} else if (Static180.aClass194_100 == Static13.aClass194_11) {
					local209 = Static47.aClass3_Sub9_Sub2_1.method5597();
					Static95.method1581();
					Static270.method4506(local209, 3, -1, -1);
					Static180.aClass194_100 = null;
					return true;
				} else if (Static180.aClass194_100 == Static267.aClass194_152) {
					Static95.method1581();
					Static494.method7224();
					Static180.aClass194_100 = null;
					return true;
				} else if (Static301.aClass194_171 == Static180.aClass194_100) {
					local209 = Static47.aClass3_Sub9_Sub2_1.method5628();
					if (local209 == 65535) {
						local209 = -1;
					}
					local73 = Static47.aClass3_Sub9_Sub2_1.method5611();
					Static95.method1581();
					Static409.method6365(local209, local73);
					Static180.aClass194_100 = null;
					return true;
				} else if (Static180.aClass194_100 == Static333.aClass194_189) {
					local209 = Static47.aClass3_Sub9_Sub2_1.method5610();
					if (local209 == 65535) {
						local209 = -1;
					}
					local73 = Static47.aClass3_Sub9_Sub2_1.method5633();
					local255 = Static47.aClass3_Sub9_Sub2_1.method5610();
					local414 = Static47.aClass3_Sub9_Sub2_1.method5633();
					local418 = Static47.aClass3_Sub9_Sub2_1.method5610();
					Static93.method1568(local209, local418, local414, local73, local255);
					Static180.aClass194_100 = null;
					return true;
				} else if (Static180.aClass194_100 == Static286.aClass194_163) {
					local209 = Static47.aClass3_Sub9_Sub2_1.method5611();
					local73 = Static47.aClass3_Sub9_Sub2_1.method5583();
					Static95.method1581();
					Static382.method6018(local73, local209);
					Static180.aClass194_100 = null;
					return true;
				} else if (Static180.aClass194_100 == Static610.aClass194_298) {
					local209 = Static47.aClass3_Sub9_Sub2_1.method5610();
					local73 = Static47.aClass3_Sub9_Sub2_1.method5586();
					Static95.method1581();
					Static368.method5888(local209, local73);
					Static180.aClass194_100 = null;
					return true;
				} else if (Static180.aClass194_100 == Static96.aClass194_70) {
					local209 = Static47.aClass3_Sub9_Sub2_1.method5610();
					if (local209 == 65535) {
						local209 = -1;
					}
					local73 = Static47.aClass3_Sub9_Sub2_1.method5633();
					local255 = Static47.aClass3_Sub9_Sub2_1.method5610();
					local414 = Static47.aClass3_Sub9_Sub2_1.method5633();
					local418 = Static47.aClass3_Sub9_Sub2_1.method5610();
					Static84.method7777(local414, local209, local418, false, local255, local73);
					Static180.aClass194_100 = null;
					return true;
				} else if (Static161.aClass194_87 == Static180.aClass194_100) {
					local209 = Static47.aClass3_Sub9_Sub2_1.method5586();
					local73 = Static47.aClass3_Sub9_Sub2_1.method5610();
					Static183.aClass285_1.method6944(local73, local209);
					Static180.aClass194_100 = null;
					return true;
				} else if (Static489.aClass194_267 == Static180.aClass194_100) {
					local209 = Static47.aClass3_Sub9_Sub2_1.method5585();
					local73 = Static47.aClass3_Sub9_Sub2_1.method5628();
					Static183.aClass285_1.method6947(local73, local209);
					Static180.aClass194_100 = null;
					return true;
				} else if (Static180.aClass194_100 == Static55.aClass194_40) {
					Static234.method3997(Static234.aClass215_6);
					Static180.aClass194_100 = null;
					return true;
				} else if (Static220.aClass194_121 == Static180.aClass194_100) {
					Static180.aClass194_100 = null;
					Static468.anInt8022 = 1;
					Static492.anInt8360 = Static303.anInt8405;
					return true;
				} else if (Static180.aClass194_100 == Static306.aClass194_173) {
					local209 = Static47.aClass3_Sub9_Sub2_1.method5611();
					local73 = Static47.aClass3_Sub9_Sub2_1.method5583();
					if (local73 == 65535) {
						local73 = -1;
					}
					local255 = Static47.aClass3_Sub9_Sub2_1.method5583();
					local414 = Static47.aClass3_Sub9_Sub2_1.method5610();
					if (local414 == 65535) {
						local414 = -1;
					}
					Static95.method1581();
					for (local418 = local73; local418 <= local414; local418++) {
						local1295 = ((long) local209 << 32) + (long) local418;
						local1301 = (Class3_Sub50) Static389.aClass25_29.method426(local1295);
						if (local1301 != null) {
							local1316 = new Class3_Sub50(local1301.anInt9447, local255);
							local1301.method8682();
						} else if (local418 == -1) {
							local1316 = new Class3_Sub50(Static324.method5363(local209).aClass3_Sub50_3.anInt9447, local255);
						} else {
							local1316 = new Class3_Sub50(0, local255);
						}
						Static389.aClass25_29.method434(local1295, local1316);
					}
					Static180.aClass194_100 = null;
					return true;
				} else if (Static290.aClass194_167 == Static180.aClass194_100) {
					if (Static311.method5226(Static82.anInt1653)) {
						Static269.anInt5252 = (int) ((float) Static47.aClass3_Sub9_Sub2_1.method5610() * 2.5F);
					} else {
						Static269.anInt5252 = Static47.aClass3_Sub9_Sub2_1.method5610() * 30;
					}
					Static180.aClass194_100 = null;
					Static500.anInt8429 = Static303.anInt8405;
					return true;
				} else if (Static180.aClass194_100 == Static289.aClass194_165) {
					Static234.method3997(Static602.aClass215_15);
					Static180.aClass194_100 = null;
					return true;
				} else if (Static180.aClass194_100 == Static131.aClass194_82) {
					method6442(Static207.aBoolean269);
					Static180.aClass194_100 = null;
					return false;
				} else if (Static180.aClass194_100 == Static258.aClass194_146) {
					Static234.method3997(Static269.aClass215_7);
					Static180.aClass194_100 = null;
					return true;
				} else {
					@Pc(2212) int local2212;
					@Pc(2095) boolean local2095;
					@Pc(2115) int local2115;
					@Pc(2202) int local2202;
					if (Static33.aClass194_17 == Static180.aClass194_100) {
						local1153 = Static47.aClass3_Sub9_Sub2_1.method5607();
						local1085 = Static47.aClass3_Sub9_Sub2_1.method5633() == 1;
						if (local1085) {
							local229 = Static47.aClass3_Sub9_Sub2_1.method5607();
						} else {
							local229 = local1153;
						}
						local414 = Static47.aClass3_Sub9_Sub2_1.method5610();
						@Pc(2093) byte local2093 = Static47.aClass3_Sub9_Sub2_1.method5619();
						local2095 = false;
						if (local2093 == -128) {
							local2095 = true;
						}
						if (local2095) {
							if (Static398.anInt7117 == 0) {
								Static180.aClass194_100 = null;
								return true;
							}
							for (local2115 = 0; local2115 < Static398.anInt7117 && (!Static95.aClass253Array1[local2115].aString60.equals(local229) || Static95.aClass253Array1[local2115].anInt7221 != local414); local2115++) {
							}
							if (local2115 < Static398.anInt7117) {
								while (local2115 < Static398.anInt7117 - 1) {
									Static95.aClass253Array1[local2115] = Static95.aClass253Array1[local2115 + 1];
									local2115++;
								}
								Static398.anInt7117--;
								Static95.aClass253Array1[Static398.anInt7117] = null;
							}
						} else {
							local710 = Static47.aClass3_Sub9_Sub2_1.method5607();
							@Pc(2177) Class253 local2177 = new Class253();
							local2177.aString59 = local1153;
							local2177.aString60 = local229;
							local2177.aString58 = Static353.method5667(local2177.aString60);
							local2177.aByte78 = local2093;
							local2177.anInt7221 = local414;
							local2177.aString61 = local710;
							for (local2202 = Static398.anInt7117 - 1; local2202 >= 0; local2202--) {
								local2212 = Static95.aClass253Array1[local2202].aString58.compareTo(local2177.aString58);
								if (local2212 == 0) {
									Static95.aClass253Array1[local2202].anInt7221 = local414;
									Static95.aClass253Array1[local2202].aByte78 = local2093;
									Static95.aClass253Array1[local2202].aString61 = local710;
									if (local229.equals(Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aString5)) {
										Static284.aByte69 = local2093;
									}
									Static180.aClass194_100 = null;
									Static570.anInt3589 = Static303.anInt8405;
									return true;
								}
								if (local2212 < 0) {
									break;
								}
							}
							if (Static398.anInt7117 >= Static95.aClass253Array1.length) {
								Static180.aClass194_100 = null;
								return true;
							}
							for (local2212 = Static398.anInt7117 - 1; local2212 > local2202; local2212--) {
								Static95.aClass253Array1[local2212 + 1] = Static95.aClass253Array1[local2212];
							}
							if (Static398.anInt7117 == 0) {
								Static95.aClass253Array1 = new Class253[100];
							}
							Static95.aClass253Array1[local2202 + 1] = local2177;
							Static398.anInt7117++;
							if (local229.equals(Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aString5)) {
								Static284.aByte69 = local2093;
							}
						}
						Static180.aClass194_100 = null;
						Static570.anInt3589 = Static303.anInt8405;
						return true;
					} else if (Static131.aClass194_83 == Static180.aClass194_100) {
						local209 = Static47.aClass3_Sub9_Sub2_1.method5610();
						local73 = Static47.aClass3_Sub9_Sub2_1.method5633();
						local1085 = (local73 & 0x1) == 1;
						Static16.method246(local1085, local209);
						local414 = Static47.aClass3_Sub9_Sub2_1.method5610();
						for (local418 = 0; local418 < local414; local418++) {
							local1097 = Static47.aClass3_Sub9_Sub2_1.method5634();
							local2115 = Static47.aClass3_Sub9_Sub2_1.method5594();
							if (local2115 == 255) {
								local2115 = Static47.aClass3_Sub9_Sub2_1.method5585();
							}
							Static111.method1839(local418, local2115, local1085, local209, local1097 - 1);
						}
						Static597.anIntArray612[Static88.anInt1731++ & 0x1F] = local209;
						Static180.aClass194_100 = null;
						return true;
					} else if (Static395.aClass194_219 == Static180.aClass194_100) {
						local209 = Static47.aClass3_Sub9_Sub2_1.method5634();
						local73 = Static47.aClass3_Sub9_Sub2_1.method5634();
						Static95.method1581();
						Static512.method7422(local209, local73);
						Static180.aClass194_100 = null;
						return true;
					} else if (Static180.aClass194_100 == Static117.aClass194_76) {
						Static243.method4100();
						Static180.aClass194_100 = null;
						return false;
					} else if (Static180.aClass194_100 == Static258.aClass194_147) {
						local209 = Static47.aClass3_Sub9_Sub2_1.method5586();
						local73 = local209 >> 28 & 0x3;
						local255 = local209 >> 14 & 0x3FFF;
						local414 = local209 & 0x3FFF;
						local418 = Static47.aClass3_Sub9_Sub2_1.method5583();
						if (local418 == 65535) {
							local418 = -1;
						}
						local1097 = Static47.aClass3_Sub9_Sub2_1.method5633();
						local2115 = local1097 >> 2;
						local442 = local1097 & 0x3;
						local255 -= Static427.anInt7462;
						local2202 = Static408.anIntArray431[local2115];
						local414 -= Static22.anInt329;
						Static26.method364(local2115, local73, local414, local2202, local442, local255, local418);
						Static180.aClass194_100 = null;
						return true;
					} else if (Static174.aClass194_98 == Static180.aClass194_100) {
						local209 = Static47.aClass3_Sub9_Sub2_1.method5597();
						local73 = Static47.aClass3_Sub9_Sub2_1.method5628();
						local255 = Static47.aClass3_Sub9_Sub2_1.method5610();
						local414 = Static47.aClass3_Sub9_Sub2_1.method5583();
						Static95.method1581();
						Static173.method2879(local73, local255, local209, local414);
						Static180.aClass194_100 = null;
						return true;
					} else if (Static180.aClass194_100 == Static68.aClass194_49) {
						Static234.method3997(Static8.aClass215_1);
						Static180.aClass194_100 = null;
						return true;
					} else {
						@Pc(2564) long local2564;
						@Pc(2574) long local2574;
						@Pc(2586) boolean local2586;
						@Pc(2588) int local2588;
						if (Static180.aClass194_100 == Static133.aClass194_306) {
							local402 = Static47.aClass3_Sub9_Sub2_1.method5633() == 1;
							local229 = Static47.aClass3_Sub9_Sub2_1.method5607();
							local410 = local229;
							if (local402) {
								local410 = Static47.aClass3_Sub9_Sub2_1.method5607();
							}
							local2564 = Static47.aClass3_Sub9_Sub2_1.method5603();
							local1295 = (long) Static47.aClass3_Sub9_Sub2_1.method5610();
							local2574 = (long) Static47.aClass3_Sub9_Sub2_1.method5604();
							local2212 = Static47.aClass3_Sub9_Sub2_1.method5633();
							@Pc(2584) long local2584 = local2574 + (local1295 << 32);
							local2586 = false;
							local2588 = 0;
							while (true) {
								if (local2588 >= 100) {
									if (local2212 <= 1) {
										if (Static11.aBoolean13 && !Static317.aBoolean446 || Static61.aBoolean57) {
											local2586 = true;
										} else if (Static427.method6524(local410)) {
											local2586 = true;
										}
									}
									break;
								}
								if (local2584 == Static164.aLongArray5[local2588]) {
									local2586 = true;
									break;
								}
								local2588++;
							}
							if (!local2586 && Static368.anInt6773 == 0) {
								Static164.aLongArray5[Static595.anInt9700] = local2584;
								Static595.anInt9700 = (Static595.anInt9700 + 1) % 100;
								@Pc(2647) String local2647 = Static212.method3300(Static590.method8196(Static47.aClass3_Sub9_Sub2_1));
								if (local2212 == 2 || local2212 == 3) {
									Static256.method4306("<img=1>" + local410, 9, 0, -1, local2647, "<img=1>" + local229, local229, Static119.method2188(local2564));
								} else if (local2212 == 1) {
									Static256.method4306("<img=0>" + local410, 9, 0, -1, local2647, "<img=0>" + local229, local229, Static119.method2188(local2564));
								} else {
									Static256.method4306(local410, 9, 0, -1, local2647, local229, local229, Static119.method2188(local2564));
								}
							}
							Static180.aClass194_100 = null;
							return true;
						} else if (Static180.aClass194_100 == Static142.aClass194_283) {
							Static234.method3997(Static590.aClass215_14);
							Static180.aClass194_100 = null;
							return true;
						} else if (Static180.aClass194_100 == Static136.aClass194_85) {
							Static1.method8035();
							Static180.aClass194_100 = null;
							return true;
						} else {
							@Pc(2799) int local2799;
							@Pc(2797) boolean local2797;
							if (Static380.aClass194_209 == Static180.aClass194_100) {
								local402 = Static47.aClass3_Sub9_Sub2_1.method5633() == 1;
								local229 = Static47.aClass3_Sub9_Sub2_1.method5607();
								local410 = local229;
								if (local402) {
									local410 = Static47.aClass3_Sub9_Sub2_1.method5607();
								}
								local2564 = (long) Static47.aClass3_Sub9_Sub2_1.method5610();
								local1295 = (long) Static47.aClass3_Sub9_Sub2_1.method5604();
								local442 = Static47.aClass3_Sub9_Sub2_1.method5633();
								local2202 = Static47.aClass3_Sub9_Sub2_1.method5610();
								@Pc(2795) long local2795 = (local2564 << 32) + local1295;
								local2797 = false;
								local2799 = 0;
								while (true) {
									if (local2799 >= 100) {
										if (local442 <= 1 && Static427.method6524(local410)) {
											local2797 = true;
										}
										break;
									}
									if (Static164.aLongArray5[local2799] == local2795) {
										local2797 = true;
										break;
									}
									local2799++;
								}
								if (!local2797 && Static368.anInt6773 == 0) {
									Static164.aLongArray5[Static595.anInt9700] = local2795;
									Static595.anInt9700 = (Static595.anInt9700 + 1) % 100;
									@Pc(2852) String local2852 = Static54.aClass257_1.method6447(local2202).method4309(Static47.aClass3_Sub9_Sub2_1);
									if (local442 == 2) {
										Static256.method4306("<img=1>" + local410, 18, 0, local2202, local2852, "<img=1>" + local229, local229, (String) null);
									} else if (local442 == 1) {
										Static256.method4306("<img=0>" + local410, 18, 0, local2202, local2852, "<img=0>" + local229, local229, (String) null);
									} else {
										Static256.method4306(local410, 18, 0, local2202, local2852, local229, local229, (String) null);
									}
								}
								Static180.aClass194_100 = null;
								return true;
							} else if (Static180.aClass194_100 == Static527.aClass194_274) {
								Static71.anInt1420 = Static47.aClass3_Sub9_Sub2_1.method5632() << 3;
								Static489.anInt8328 = Static47.aClass3_Sub9_Sub2_1.method5580() << 3;
								Static46.anInt876 = Static47.aClass3_Sub9_Sub2_1.method5633();
								Static180.aClass194_100 = null;
								return true;
							} else if (Static180.aClass194_100 == Static204.aClass194_107) {
								local209 = Static47.aClass3_Sub9_Sub2_1.method5602();
								local73 = Static47.aClass3_Sub9_Sub2_1.method5602();
								local255 = Static47.aClass3_Sub9_Sub2_1.method5602();
								local414 = Static47.aClass3_Sub9_Sub2_1.method5602();
								local418 = Static47.aClass3_Sub9_Sub2_1.method5610() << 2;
								Static95.method1581();
								Static570.method3074(true, local209, local418, local73, local414, local255);
								Static180.aClass194_100 = null;
								return true;
							} else if (Static105.aClass194_72 == Static180.aClass194_100) {
								local209 = Static47.aClass3_Sub9_Sub2_1.method5622();
								local73 = Static47.aClass3_Sub9_Sub2_1.method5597();
								Static95.method1581();
								Static28.method380(local209, local73);
								Static180.aClass194_100 = null;
								return true;
							} else if (Static180.aClass194_100 == Static44.aClass194_28) {
								Static234.method3997(Static294.aClass215_10);
								Static180.aClass194_100 = null;
								return true;
							} else if (Static180.aClass194_100 == Static132.aClass194_84) {
								local209 = Static47.aClass3_Sub9_Sub2_1.method5628();
								Static95.method1581();
								Static29.method385(local209);
								Static180.aClass194_100 = null;
								return true;
							} else if (Static409.aClass194_232 == Static180.aClass194_100) {
								Static278.aClass261_4 = Static213.method3758(Static47.aClass3_Sub9_Sub2_1.method5633());
								Static180.aClass194_100 = null;
								return true;
							} else if (Static248.aClass194_139 == Static180.aClass194_100) {
								Static322.anInt6163 = Static47.aClass3_Sub9_Sub2_1.method5633();
								Static180.aClass194_100 = null;
								return true;
							} else {
								@Pc(3123) int local3123;
								@Pc(3387) int local3387;
								@Pc(3143) int local3143;
								if (Static190.aClass194_105 == Static180.aClass194_100) {
									local209 = Static47.aClass3_Sub9_Sub2_1.method5611();
									local73 = Static47.aClass3_Sub9_Sub2_1.method5634();
									local255 = Static47.aClass3_Sub9_Sub2_1.method5594();
									local414 = Static47.aClass3_Sub9_Sub2_1.method5594();
									local418 = Static47.aClass3_Sub9_Sub2_1.method5634();
									local1097 = Static47.aClass3_Sub9_Sub2_1.method5610();
									local2115 = local414 & 0x7;
									local442 = local414 >> 3 & 0xF;
									if (local442 == 15) {
										local442 = -1;
									}
									if (local209 >> 30 == 0) {
										@Pc(3304) Class267 local3304;
										@Pc(3245) Class207 local3245;
										@Pc(3266) Class267 local3266;
										if (local209 >> 29 != 0) {
											local2202 = local209 & 0xFFFF;
											@Pc(3211) Class3_Sub43 local3211 = (Class3_Sub43) Static545.aClass25_40.method426((long) local2202);
											if (local3211 != null) {
												@Pc(3216) Class9_Sub2_Sub1_Sub2_Sub2 local3216 = local3211.aClass9_Sub2_Sub1_Sub2_Sub2_2;
												@Pc(3221) Class380 local3221 = local3216.aClass380Array3[local255];
												if (local73 == 65535) {
													local73 = -1;
												}
												local2586 = true;
												local2588 = local3221.anInt10136;
												if (local73 != -1 && local2588 != -1) {
													if (local2588 == local73) {
														local3245 = Static266.aClass135_1.method3108(local73);
														if (local3245.aBoolean457 && local3245.anInt6225 != -1) {
															local3304 = Static474.aClass264_2.method6574(local3245.anInt6225);
															@Pc(3307) int local3307 = local3304.anInt7585;
															if (local3307 == 0 || local3307 == 2) {
																local2586 = false;
															} else if (local3307 == 1) {
																local2586 = true;
															}
														}
													} else {
														local3245 = Static266.aClass135_1.method3108(local73);
														@Pc(3250) Class207 local3250 = Static266.aClass135_1.method3108(local2588);
														if (local3245.anInt6225 != -1 && local3250.anInt6225 != -1) {
															local3266 = Static474.aClass264_2.method6574(local3245.anInt6225);
															@Pc(3272) Class267 local3272 = Static474.aClass264_2.method6574(local3250.anInt6225);
															if (local3266.anInt7582 < local3272.anInt7582) {
																local2586 = false;
															}
														}
													}
												}
												if (local2586) {
													local3221.anInt10147 = local2115;
													local3221.anInt10138 = local418;
													local3221.anInt10143 = local442;
													local3221.anInt10145 = 0;
													local3221.anInt10146 = local1097 + Static304.anInt8391;
													local3221.anInt10144 = 1;
													local3221.anInt10139 = 0;
													local3221.anInt10136 = local73;
													if (Static304.anInt8391 < local3221.anInt10146) {
														local3221.anInt10139 = -1;
													}
													if (local3221.anInt10136 == 65535) {
														local3221.anInt10136 = -1;
													}
													if (local3221.anInt10136 != -1 && local3221.anInt10146 == Static304.anInt8391) {
														local3387 = Static266.aClass135_1.method3108(local3221.anInt10136).anInt6225;
														if (local3387 != -1) {
															local3304 = Static474.aClass264_2.method6574(local3387);
															if (local3304 != null && local3304.anIntArray458 != null && !local3216.aBoolean772) {
																Static522.method7586(0, local3216, local3304);
															}
														}
													}
												}
											}
										} else if (local209 >> 28 != 0) {
											local2202 = local209 & 0xFFFF;
											@Pc(3423) Class9_Sub2_Sub1_Sub2_Sub1 local3423;
											if (local2202 == Static54.anInt1032) {
												local3423 = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1;
											} else {
												local3423 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local2202];
											}
											if (local3423 != null) {
												if (local73 == 65535) {
													local73 = -1;
												}
												@Pc(3441) Class380 local3441 = local3423.aClass380Array3[local255];
												local2797 = true;
												local2799 = local3441.anInt10136;
												@Pc(3475) Class267 local3475;
												if (local73 != -1 && local2799 != -1) {
													@Pc(3462) Class207 local3462;
													if (local2799 == local73) {
														local3462 = Static266.aClass135_1.method3108(local73);
														if (local3462.aBoolean457 && local3462.anInt6225 != -1) {
															local3475 = Static474.aClass264_2.method6574(local3462.anInt6225);
															@Pc(3478) int local3478 = local3475.anInt7585;
															if (local3478 == 0 || local3478 == 2) {
																local2797 = false;
															} else if (local3478 == 1) {
																local2797 = true;
															}
														}
													} else {
														local3462 = Static266.aClass135_1.method3108(local73);
														local3245 = Static266.aClass135_1.method3108(local2799);
														if (local3462.anInt6225 != -1 && local3245.anInt6225 != -1) {
															local3304 = Static474.aClass264_2.method6574(local3462.anInt6225);
															local3266 = Static474.aClass264_2.method6574(local3245.anInt6225);
															if (local3304.anInt7582 < local3266.anInt7582) {
																local2797 = false;
															}
														}
													}
												}
												if (local2797) {
													local3441.anInt10146 = Static304.anInt8391 + local1097;
													local3441.anInt10147 = local2115;
													local3441.anInt10139 = 0;
													local3441.anInt10144 = 1;
													local3441.anInt10136 = local73;
													local3441.anInt10143 = local442;
													local3441.anInt10145 = 0;
													local3441.anInt10138 = local418;
													if (Static304.anInt8391 < local3441.anInt10146) {
														local3441.anInt10139 = -1;
													}
													if (local3441.anInt10136 == 65535) {
														local3441.anInt10136 = -1;
													}
													if (local3441.anInt10136 != -1 && Static304.anInt8391 == local3441.anInt10146) {
														local2588 = Static266.aClass135_1.method3108(local3441.anInt10136).anInt6225;
														if (local2588 != -1) {
															local3475 = Static474.aClass264_2.method6574(local2588);
															if (local3475 != null && local3475.anIntArray458 != null && !local3423.aBoolean772) {
																Static522.method7586(0, local3423, local3475);
															}
														}
													}
												}
											}
										}
									} else {
										local2202 = local209 >> 28 & 0x3;
										local2212 = (local209 >> 14 & 0x3FFF) - Static427.anInt7462;
										local3123 = (local209 & 0x3FFF) - Static22.anInt329;
										if (local2212 >= 0 && local3123 >= 0 && Static399.anInt7121 > local2212 && local3123 < Static24.anInt345) {
											local3143 = local2212 * 512 + 256;
											local2799 = local3123 * 512 + 256;
											local2588 = local2202;
											if (local2202 < 3 && Static97.method1657(local3123, local2212)) {
												local2588 = local2202 + 1;
											}
											@Pc(3184) Class9_Sub2_Sub1_Sub4 local3184 = new Class9_Sub2_Sub1_Sub4(local73, local1097, Static304.anInt8391, local2202, local2588, local3143, Static594.method8211(local3143, local2799, local2202) - local418, local2799, local2212, local2212, local3123, local3123, local2115);
											Static536.aClass216_64.method5449(new Class3_Sub7_Sub1(local3184));
										}
									}
									Static180.aClass194_100 = null;
									return true;
								} else if (Static180.aClass194_100 == Static607.aClass194_297) {
									local209 = Static47.aClass3_Sub9_Sub2_1.method5597();
									local229 = Static47.aClass3_Sub9_Sub2_1.method5607();
									Static95.method1581();
									Static85.method1433(local209, local229);
									Static180.aClass194_100 = null;
									return true;
								} else if (Static246.aClass194_135 == Static180.aClass194_100) {
									Static234.method3997(Static283.aClass215_9);
									Static180.aClass194_100 = null;
									return true;
								} else if (Static180.aClass194_100 == Static462.aClass194_254) {
									Static277.method4540(Static47.aClass3_Sub9_Sub2_1.method5607());
									Static180.aClass194_100 = null;
									return true;
								} else if (Static338.aClass194_195 == Static180.aClass194_100) {
									local402 = Static47.aClass3_Sub9_Sub2_1.method5633() == 1;
									local229 = Static47.aClass3_Sub9_Sub2_1.method5607();
									local410 = local229;
									if (local402) {
										local410 = Static47.aClass3_Sub9_Sub2_1.method5607();
									}
									local2564 = (long) Static47.aClass3_Sub9_Sub2_1.method5610();
									local1295 = (long) Static47.aClass3_Sub9_Sub2_1.method5604();
									local442 = Static47.aClass3_Sub9_Sub2_1.method5633();
									@Pc(3712) long local3712 = (local2564 << 32) + local1295;
									@Pc(3714) boolean local3714 = false;
									local3143 = 0;
									while (true) {
										if (local3143 >= 100) {
											if (local442 <= 1) {
												if (Static11.aBoolean13 && !Static317.aBoolean446 || Static61.aBoolean57) {
													local3714 = true;
												} else if (Static427.method6524(local410)) {
													local3714 = true;
												}
											}
											break;
										}
										if (Static164.aLongArray5[local3143] == local3712) {
											local3714 = true;
											break;
										}
										local3143++;
									}
									if (!local3714 && Static368.anInt6773 == 0) {
										Static164.aLongArray5[Static595.anInt9700] = local3712;
										Static595.anInt9700 = (Static595.anInt9700 + 1) % 100;
										@Pc(3773) String local3773 = Static212.method3300(Static590.method8196(Static47.aClass3_Sub9_Sub2_1));
										if (local442 == 2) {
											Static256.method4306("<img=1>" + local410, 7, 0, -1, local3773, "<img=1>" + local229, local229, (String) null);
										} else if (local442 == 1) {
											Static256.method4306("<img=0>" + local410, 7, 0, -1, local3773, "<img=0>" + local229, local229, (String) null);
										} else {
											Static256.method4306(local410, 3, 0, -1, local3773, local229, local229, (String) null);
										}
									}
									Static180.aClass194_100 = null;
									return true;
								} else if (Static253.aClass194_142 == Static180.aClass194_100) {
									local402 = Static47.aClass3_Sub9_Sub2_1.method5602() == 1;
									Static95.method1581();
									Static180.aClass194_100 = null;
									Static142.aBoolean696 = local402;
									return true;
								} else if (Static180.aClass194_100 == Static533.aClass194_51) {
									local209 = Static47.aClass3_Sub9_Sub2_1.method5610();
									local73 = Static47.aClass3_Sub9_Sub2_1.method5610();
									local255 = Static47.aClass3_Sub9_Sub2_1.method5610();
									Static95.method1581();
									if (Static319.aClass344ArrayArray2[local209] != null) {
										for (local414 = local73; local414 < local255; local414++) {
											local418 = Static47.aClass3_Sub9_Sub2_1.method5604();
											if (local414 < Static319.aClass344ArrayArray2[local209].length && Static319.aClass344ArrayArray2[local209][local414] != null) {
												Static319.aClass344ArrayArray2[local209][local414].anInt9598 = local418;
											}
										}
									}
									Static180.aClass194_100 = null;
									return true;
								} else if (Static255.aClass194_144 == Static180.aClass194_100) {
									Static183.aClass285_1.method6945();
									Static180.aClass194_100 = null;
									Static64.anInt1101 += 32;
									return true;
								} else if (Static180.aClass194_100 == Static493.aClass194_268) {
									Static234.method3997(Static233.aClass215_5);
									Static180.aClass194_100 = null;
									return true;
								} else if (Static271.aClass194_158 == Static180.aClass194_100) {
									local1153 = Static47.aClass3_Sub9_Sub2_1.method5607();
									local73 = Static47.aClass3_Sub9_Sub2_1.method5626();
									local255 = Static47.aClass3_Sub9_Sub2_1.method5610();
									if (local255 == 65535) {
										local255 = -1;
									}
									local414 = Static47.aClass3_Sub9_Sub2_1.method5594();
									if (local73 >= 1 && local73 <= 8) {
										if (local1153.equalsIgnoreCase("null")) {
											local1153 = null;
										}
										Static414.aStringArray57[local73 - 1] = local1153;
										Static239.anIntArray260[local73 - 1] = local255;
										Static73.aBooleanArray1[local73 - 1] = local414 == 0;
									}
									Static180.aClass194_100 = null;
									return true;
								} else if (Static180.aClass194_100 == Static373.aClass194_206) {
									local402 = Static47.aClass3_Sub9_Sub2_1.method5633() == 1;
									local229 = Static47.aClass3_Sub9_Sub2_1.method5607();
									local410 = local229;
									if (local402) {
										local410 = Static47.aClass3_Sub9_Sub2_1.method5607();
									}
									local2564 = Static47.aClass3_Sub9_Sub2_1.method5603();
									local1295 = (long) Static47.aClass3_Sub9_Sub2_1.method5610();
									local2574 = (long) Static47.aClass3_Sub9_Sub2_1.method5604();
									local2212 = Static47.aClass3_Sub9_Sub2_1.method5633();
									local3123 = Static47.aClass3_Sub9_Sub2_1.method5610();
									@Pc(4064) long local4064 = local2574 + (local1295 << 32);
									@Pc(4066) boolean local4066 = false;
									local3387 = 0;
									while (true) {
										if (local3387 >= 100) {
											if (local2212 <= 1 && Static427.method6524(local410)) {
												local4066 = true;
											}
											break;
										}
										if (Static164.aLongArray5[local3387] == local4064) {
											local4066 = true;
											break;
										}
										local3387++;
									}
									if (!local4066 && Static368.anInt6773 == 0) {
										Static164.aLongArray5[Static595.anInt9700] = local4064;
										Static595.anInt9700 = (Static595.anInt9700 + 1) % 100;
										@Pc(4119) String local4119 = Static54.aClass257_1.method6447(local3123).method4309(Static47.aClass3_Sub9_Sub2_1);
										if (local2212 == 2) {
											Static256.method4306("<img=1>" + local410, 20, 0, local3123, local4119, "<img=1>" + local229, local229, Static119.method2188(local2564));
										} else if (local2212 == 1) {
											Static256.method4306("<img=0>" + local410, 20, 0, local3123, local4119, "<img=0>" + local229, local229, Static119.method2188(local2564));
										} else {
											Static256.method4306(local410, 20, 0, local3123, local4119, local229, local229, Static119.method2188(local2564));
										}
									}
									Static180.aClass194_100 = null;
									return true;
								} else if (Static457.aClass194_253 == Static180.aClass194_100) {
									local209 = Static47.aClass3_Sub9_Sub2_1.method5626();
									local73 = Static47.aClass3_Sub9_Sub2_1.method5610() << 2;
									local255 = Static47.aClass3_Sub9_Sub2_1.method5626();
									local414 = Static47.aClass3_Sub9_Sub2_1.method5626();
									local418 = Static47.aClass3_Sub9_Sub2_1.method5602();
									Static95.method1581();
									Static613.method8373(local414, local209, local73, local418, local255);
									Static180.aClass194_100 = null;
									return true;
								} else {
									@Pc(4245) byte local4245;
									if (Static72.aClass194_54 == Static180.aClass194_100) {
										local209 = Static47.aClass3_Sub9_Sub2_1.method5583();
										local4245 = Static47.aClass3_Sub9_Sub2_1.method5632();
										Static95.method1581();
										Static382.method6018(local209, local4245);
										Static180.aClass194_100 = null;
										return true;
									} else if (Static180.aClass194_100 == Static351.aClass194_202) {
										local209 = Static47.aClass3_Sub9_Sub2_1.method5611();
										local73 = Static47.aClass3_Sub9_Sub2_1.method5628();
										Static95.method1581();
										if (local73 == 65535) {
											local73 = -1;
										}
										Static270.method4506(local209, 2, local73, -1);
										Static180.aClass194_100 = null;
										return true;
									} else if (Static417.aClass194_235 == Static180.aClass194_100) {
										local402 = Static47.aClass3_Sub9_Sub2_1.method5633() == 1;
										@Pc(4302) byte[] local4302 = new byte[Static94.anInt1852 - 1];
										Static47.aClass3_Sub9_Sub2_1.method5577(0, Static94.anInt1852 - 1, local4302);
										Static27.method373(local4302, local402);
										Static180.aClass194_100 = null;
										return true;
									} else {
										@Pc(4343) Class3_Sub1 local4343;
										if (Static180.aClass194_100 == Static84.aClass194_279) {
											local209 = Static47.aClass3_Sub9_Sub2_1.method5594();
											local73 = Static47.aClass3_Sub9_Sub2_1.method5628();
											local255 = Static47.aClass3_Sub9_Sub2_1.method5597();
											Static95.method1581();
											local4343 = (Class3_Sub1) Static128.aClass25_7.method426((long) local255);
											if (local4343 != null) {
												Static69.method1233(local4343, local73 != local4343.anInt24, false);
											}
											Static90.method7198(local209, local73, false, local255);
											Static180.aClass194_100 = null;
											return true;
										} else if (Static547.aClass194_281 == Static180.aClass194_100) {
											local209 = Static47.aClass3_Sub9_Sub2_1.method5602();
											local4245 = Static47.aClass3_Sub9_Sub2_1.method5631();
											Static95.method1581();
											Static258.method4332(local209, local4245);
											Static180.aClass194_100 = null;
											return true;
										} else if (Static180.aClass194_100 == Static22.aClass194_12) {
											local209 = Static47.aClass3_Sub9_Sub2_1.method5611();
											Static95.method1581();
											if (local209 == -1) {
												Static68.anInt1361 = -1;
												Static189.anInt3565 = -1;
											} else {
												local73 = local209 >> 14 & 0x3FFF;
												local255 = local209 & 0x3FFF;
												local73 -= Static427.anInt7462;
												local255 -= Static22.anInt329;
												if (local73 < 0) {
													local73 = 0;
												} else if (local73 >= Static399.anInt7121) {
													local73 = Static399.anInt7121;
												}
												if (local255 < 0) {
													local255 = 0;
												} else if (Static24.anInt345 <= local255) {
													local255 = Static24.anInt345;
												}
												Static68.anInt1361 = (local73 << 9) + 256;
												Static189.anInt3565 = (local255 << 9) + 256;
											}
											Static180.aClass194_100 = null;
											return true;
										} else if (Static180.aClass194_100 == Static590.aClass194_290) {
											local209 = Static47.aClass3_Sub9_Sub2_1.method5610();
											local73 = Static47.aClass3_Sub9_Sub2_1.method5633();
											Static95.method1581();
											Static574.method8061(local209, local73, true);
											Static180.aClass194_100 = null;
											return true;
										} else if (Static193.aClass194_311 == Static180.aClass194_100) {
											local209 = Static47.aClass3_Sub9_Sub2_1.method5594();
											local73 = Static47.aClass3_Sub9_Sub2_1.method5586();
											Static95.method1581();
											Static300.method8280(local73, local209);
											Static180.aClass194_100 = null;
											return true;
										} else if (Static392.aClass194_215 == Static180.aClass194_100) {
											Static279.anInt5376 = Static47.aClass3_Sub9_Sub2_1.method5596();
											Static11.aBoolean13 = Static47.aClass3_Sub9_Sub2_1.method5633() == 1;
											Static180.aClass194_100 = null;
											return true;
										} else if (Static312.aClass194_178 == Static180.aClass194_100) {
											method6442(false);
											Static180.aClass194_100 = null;
											return false;
										} else if (Static631.aClass194_304 == Static180.aClass194_100) {
											Static489.anInt8328 = Static47.aClass3_Sub9_Sub2_1.method5631() << 3;
											Static46.anInt876 = Static47.aClass3_Sub9_Sub2_1.method5633();
											Static71.anInt1420 = Static47.aClass3_Sub9_Sub2_1.method5619() << 3;
											for (@Pc(4570) Class3_Sub25 local4570 = (Class3_Sub25) Static39.aClass25_8.method435(); local4570 != null; local4570 = (Class3_Sub25) Static39.aClass25_8.method432()) {
												local73 = (int) (local4570.aLong277 >> 28 & 0x3L);
												local255 = (int) (local4570.aLong277 & 0x3FFFL);
												local414 = local255 - Static427.anInt7462;
												local418 = (int) (local4570.aLong277 >> 14 & 0x3FFFL);
												local1097 = local418 - Static22.anInt329;
												if (local73 == Static46.anInt876 && Static71.anInt1420 <= local414 && local414 < Static71.anInt1420 + 8 && local1097 >= Static489.anInt8328 && Static489.anInt8328 + 8 > local1097) {
													local4570.method8682();
													if (local414 >= 0 && local1097 >= 0 && Static399.anInt7121 > local414 && Static24.anInt345 > local1097) {
														Static61.method1047(Static46.anInt876, local1097, local414);
													}
												}
											}
											@Pc(4674) Class3_Sub26 local4674;
											for (local4674 = (Class3_Sub26) Static588.aClass216_70.method5457(); local4674 != null; local4674 = (Class3_Sub26) Static588.aClass216_70.method5458()) {
												if (local4674.anInt5296 >= Static71.anInt1420 && local4674.anInt5296 < Static71.anInt1420 + 8 && Static489.anInt8328 <= local4674.anInt5286 && Static489.anInt8328 + 8 > local4674.anInt5286 && local4674.anInt5293 == Static46.anInt876) {
													local4674.aBoolean387 = true;
												}
											}
											for (local4674 = (Class3_Sub26) Static48.aClass216_69.method5457(); local4674 != null; local4674 = (Class3_Sub26) Static48.aClass216_69.method5458()) {
												if (Static71.anInt1420 <= local4674.anInt5296 && Static71.anInt1420 + 8 > local4674.anInt5296 && Static489.anInt8328 <= local4674.anInt5286 && Static489.anInt8328 + 8 > local4674.anInt5286 && local4674.anInt5293 == Static46.anInt876) {
													local4674.aBoolean387 = true;
												}
											}
											Static180.aClass194_100 = null;
											return true;
										} else if (Static33.aClass194_18 == Static180.aClass194_100) {
											local209 = Static47.aClass3_Sub9_Sub2_1.method5586();
											local73 = Static47.aClass3_Sub9_Sub2_1.method5585();
											local255 = Static47.aClass3_Sub9_Sub2_1.method5583();
											Static95.method1581();
											Static270.method4506(local209, 5, local255, local73);
											Static180.aClass194_100 = null;
											return true;
										} else if (Static180.aClass194_100 == Static43.aClass194_21) {
											local209 = Static47.aClass3_Sub9_Sub2_1.method5634();
											Static95.method1581();
											Static558.method7939(local209);
											Static180.aClass194_100 = null;
											return true;
										} else {
											@Pc(4859) boolean local4859;
											if (Static180.aClass194_100 == Static525.aClass194_273) {
												local209 = Static47.aClass3_Sub9_Sub2_1.method5610();
												@Pc(4830) Class9_Sub2_Sub1_Sub2_Sub1 local4830;
												if (Static54.anInt1032 == local209) {
													local4830 = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1;
												} else {
													local4830 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local209];
												}
												if (local4830 == null) {
													Static180.aClass194_100 = null;
													return true;
												}
												local255 = Static47.aClass3_Sub9_Sub2_1.method5610();
												local414 = Static47.aClass3_Sub9_Sub2_1.method5633();
												local4859 = (local255 & 0x8000) != 0;
												if (local4830.aString5 != null && local4830.aClass375_1 != null) {
													local2095 = false;
													if (local414 <= 1) {
														if (!local4859 && (Static11.aBoolean13 && !Static317.aBoolean446 || Static61.aBoolean57)) {
															local2095 = true;
														} else if (Static427.method6524(local4830.aString5)) {
															local2095 = true;
														}
													}
													if (!local2095 && Static368.anInt6773 == 0) {
														local442 = -1;
														if (local4859) {
															local255 &= 0x7FFF;
															@Pc(4916) Class238 local4916 = Static14.method242(Static47.aClass3_Sub9_Sub2_1);
															local442 = local4916.anInt6830;
															local710 = local4916.aClass3_Sub7_Sub14_1.method4309(Static47.aClass3_Sub9_Sub2_1);
														} else {
															local710 = Static212.method3300(Static590.method8196(Static47.aClass3_Sub9_Sub2_1));
														}
														local4830.aString107 = local710.trim();
														local4830.anInt10174 = local255 & 0xFF;
														local4830.anInt10170 = local255 >> 8;
														local4830.anInt10187 = 150;
														if (local414 == 1 || local414 == 2) {
															local2202 = local4859 ? 17 : 1;
														} else {
															local2202 = local4859 ? 17 : 2;
														}
														if (local414 == 2) {
															Static256.method4306("<img=1>" + local4830.method1159(), local2202, 0, local442, local710, "<img=1>" + local4830.method1160(), local4830.aString6, (String) null);
														} else if (local414 == 1) {
															Static256.method4306("<img=0>" + local4830.method1159(), local2202, 0, local442, local710, "<img=0>" + local4830.method1160(), local4830.aString6, (String) null);
														} else {
															Static256.method4306(local4830.method1159(), local2202, 0, local442, local710, local4830.method1160(), local4830.aString6, (String) null);
														}
													}
												}
												Static180.aClass194_100 = null;
												return true;
											} else if (Static180.aClass194_100 == Static133.aClass194_307) {
												local209 = Static47.aClass3_Sub9_Sub2_1.method5633();
												local73 = local209 >> 5;
												local255 = local209 & 0x1F;
												if (local255 == 0) {
													Static16.aClass118Array1[local73] = null;
													Static180.aClass194_100 = null;
													return true;
												}
												@Pc(5091) Class118 local5091 = new Class118();
												local5091.anInt3289 = local255;
												local5091.anInt3285 = Static47.aClass3_Sub9_Sub2_1.method5633();
												if (local5091.anInt3285 >= 0 && Static205.aClass103Array22.length > local5091.anInt3285) {
													if (local5091.anInt3289 == 1 || local5091.anInt3289 == 10) {
														local5091.anInt3290 = Static47.aClass3_Sub9_Sub2_1.method5610();
														Static47.aClass3_Sub9_Sub2_1.anInt6453 += 6;
													} else if (local5091.anInt3289 >= 2 && local5091.anInt3289 <= 6) {
														if (local5091.anInt3289 == 2) {
															local5091.anInt3294 = 256;
															local5091.anInt3288 = 256;
														}
														if (local5091.anInt3289 == 3) {
															local5091.anInt3294 = 0;
															local5091.anInt3288 = 256;
														}
														if (local5091.anInt3289 == 4) {
															local5091.anInt3294 = 512;
															local5091.anInt3288 = 256;
														}
														if (local5091.anInt3289 == 5) {
															local5091.anInt3288 = 0;
															local5091.anInt3294 = 256;
														}
														if (local5091.anInt3289 == 6) {
															local5091.anInt3288 = 512;
															local5091.anInt3294 = 256;
														}
														local5091.anInt3289 = 2;
														local5091.anInt3298 = Static47.aClass3_Sub9_Sub2_1.method5633();
														local5091.anInt3294 += Static47.aClass3_Sub9_Sub2_1.method5610() - Static427.anInt7462 << 9;
														local5091.anInt3288 += Static47.aClass3_Sub9_Sub2_1.method5610() - Static22.anInt329 << 9;
														local5091.anInt3291 = Static47.aClass3_Sub9_Sub2_1.method5633() << 2;
														local5091.anInt3296 = Static47.aClass3_Sub9_Sub2_1.method5610();
													}
													local5091.anInt3293 = Static47.aClass3_Sub9_Sub2_1.method5610();
													if (local5091.anInt3293 == 65535) {
														local5091.anInt3293 = -1;
													}
													Static16.aClass118Array1[local73] = local5091;
												}
												Static180.aClass194_100 = null;
												return true;
											} else if (Static180.aClass194_100 == Static475.aClass194_262) {
												local209 = Static47.aClass3_Sub9_Sub2_1.method5634();
												local73 = Static47.aClass3_Sub9_Sub2_1.method5611();
												Static95.method1581();
												Static11.method199(local209, local73);
												Static180.aClass194_100 = null;
												return true;
											} else if (Static266.aClass194_151 == Static180.aClass194_100) {
												local209 = Static47.aClass3_Sub9_Sub2_1.method5610();
												if (local209 == 65535) {
													local209 = -1;
												}
												local73 = Static47.aClass3_Sub9_Sub2_1.method5633();
												local255 = Static47.aClass3_Sub9_Sub2_1.method5610();
												local414 = Static47.aClass3_Sub9_Sub2_1.method5633();
												Static84.method7777(local414, local209, 256, true, local255, local73);
												Static180.aClass194_100 = null;
												return true;
											} else if (Static180.aClass194_100 == Static438.aClass194_246) {
												local402 = Static47.aClass3_Sub9_Sub2_1.method5633() == 1;
												local229 = Static47.aClass3_Sub9_Sub2_1.method5607();
												local410 = local229;
												if (local402) {
													local410 = Static47.aClass3_Sub9_Sub2_1.method5607();
												}
												local414 = Static47.aClass3_Sub9_Sub2_1.method5633();
												local418 = Static47.aClass3_Sub9_Sub2_1.method5610();
												local2095 = false;
												if (local414 <= 1 && Static427.method6524(local410)) {
													local2095 = true;
												}
												if (!local2095 && Static368.anInt6773 == 0) {
													local710 = Static54.aClass257_1.method6447(local418).method4309(Static47.aClass3_Sub9_Sub2_1);
													if (local414 == 2) {
														Static256.method4306("<img=1>" + local410, 25, 0, local418, local710, "<img=1>" + local229, local229, (String) null);
													} else if (local414 == 1) {
														Static256.method4306("<img=0>" + local410, 25, 0, local418, local710, "<img=0>" + local229, local229, (String) null);
													} else {
														Static256.method4306(local410, 25, 0, local418, local710, local229, local229, (String) null);
													}
												}
												Static180.aClass194_100 = null;
												return true;
											} else if (Static45.aClass194_30 == Static180.aClass194_100) {
												local209 = Static47.aClass3_Sub9_Sub2_1.method5633();
												if (Static47.aClass3_Sub9_Sub2_1.method5633() == 0) {
													Static467.aClass206Array1[local209] = new Class206();
												} else {
													Static47.aClass3_Sub9_Sub2_1.anInt6453--;
													Static467.aClass206Array1[local209] = new Class206(Static47.aClass3_Sub9_Sub2_1);
												}
												Static180.aClass194_100 = null;
												Static518.anInt8723 = Static303.anInt8405;
												return true;
											} else if (Static180.aClass194_100 == Static280.aClass194_161) {
												Static489.anInt8328 = Static47.aClass3_Sub9_Sub2_1.method5619() << 3;
												Static46.anInt876 = Static47.aClass3_Sub9_Sub2_1.method5626();
												Static71.anInt1420 = Static47.aClass3_Sub9_Sub2_1.method5631() << 3;
												while (Static94.anInt1852 > Static47.aClass3_Sub9_Sub2_1.anInt6453) {
													@Pc(5518) Class215 local5518 = Static195.method3101()[Static47.aClass3_Sub9_Sub2_1.method5633()];
													Static234.method3997(local5518);
												}
												Static180.aClass194_100 = null;
												return true;
											} else if (Class3_Sub41.lb == Static180.aClass194_100) {
												Static475.anInt8127 = Static47.aClass3_Sub9_Sub2_1.method5624();
												Static500.anInt8429 = Static303.anInt8405;
												Static180.aClass194_100 = null;
												return true;
											} else if (Static180.aClass194_100 == Static249.aClass194_141) {
												Static73.aByte35 = Static47.aClass3_Sub9_Sub2_1.method5619();
												Static180.aClass194_100 = null;
												if (Static73.aByte35 == 0 || Static73.aByte35 == 1) {
													Static387.aBoolean503 = true;
												}
												return true;
											} else if (Static180.aClass194_100 == Static317.aClass194_182) {
												Static461.anInt7890 = Static47.aClass3_Sub9_Sub2_1.method5633();
												Static500.anInt8429 = Static303.anInt8405;
												Static180.aClass194_100 = null;
												return true;
											} else if (Static5.aClass194_4 == Static180.aClass194_100) {
												local402 = Static47.aClass3_Sub9_Sub2_1.method5633() == 1;
												local229 = Static47.aClass3_Sub9_Sub2_1.method5607();
												local410 = local229;
												if (local402) {
													local410 = Static47.aClass3_Sub9_Sub2_1.method5607();
												}
												local414 = Static47.aClass3_Sub9_Sub2_1.method5633();
												local4859 = false;
												if (local414 <= 1) {
													if (Static11.aBoolean13 && !Static317.aBoolean446 || Static61.aBoolean57) {
														local4859 = true;
													} else if (local414 <= 1 && Static427.method6524(local410)) {
														local4859 = true;
													}
												}
												if (!local4859 && Static368.anInt6773 == 0) {
													local420 = Static212.method3300(Static590.method8196(Static47.aClass3_Sub9_Sub2_1));
													if (local414 == 2) {
														Static256.method4306("<img=1>" + local410, 24, 0, -1, local420, "<img=1>" + local229, local229, (String) null);
													} else if (local414 == 1) {
														Static256.method4306("<img=0>" + local410, 24, 0, -1, local420, "<img=0>" + local229, local229, (String) null);
													} else {
														Static256.method4306(local410, 24, 0, -1, local420, local229, local229, (String) null);
													}
												}
												Static180.aClass194_100 = null;
												return true;
											} else if (Static471.aClass194_257 == Static180.aClass194_100) {
												local209 = Static47.aClass3_Sub9_Sub2_1.method5633();
												local73 = Static47.aClass3_Sub9_Sub2_1.method5633();
												if (local73 == 255) {
													local73 = -1;
													local209 = -1;
												}
												Static519.method7550(local209, local73);
												Static180.aClass194_100 = null;
												return true;
											} else if (Static223.aClass194_123 == Static180.aClass194_100) {
												Static234.method3997(Static170.aClass215_3);
												Static180.aClass194_100 = null;
												return true;
											} else if (Static398.aClass194_221 == Static180.aClass194_100) {
												local1153 = Static47.aClass3_Sub9_Sub2_1.method5607();
												@Pc(5767) Object[] local5767 = new Object[local1153.length() + 1];
												for (local255 = local1153.length() - 1; local255 >= 0; local255--) {
													if (local1153.charAt(local255) == 's') {
														local5767[local255 + 1] = Static47.aClass3_Sub9_Sub2_1.method5607();
													} else {
														local5767[local255 + 1] = Integer.valueOf(Static47.aClass3_Sub9_Sub2_1.method5585());
													}
												}
												local5767[0] = Integer.valueOf(Static47.aClass3_Sub9_Sub2_1.method5585());
												Static95.method1581();
												@Pc(5819) Class3_Sub36 local5819 = new Class3_Sub36();
												local5819.anObjectArray1 = local5767;
												Static400.method6288(local5819);
												Static180.aClass194_100 = null;
												return true;
											} else if (Static180.aClass194_100 == Static452.aClass194_251) {
												if (Static355.aFrame7 != null) {
													Static545.method7843(-1, Static32.aClass3_Sub41_3.aClass7_Sub22_2.method6533(), -1, false);
												}
												@Pc(5845) byte[] local5845 = new byte[Static94.anInt1852];
												Static47.aClass3_Sub9_Sub2_1.method5648(local5845, Static94.anInt1852);
												local229 = Static284.method4606(Static94.anInt1852, local5845, 0);
												Static254.method1240(Static32.aClass3_Sub41_3.aClass7_Sub9_2.method4181() == 1, true, local229, Static48.aClass298_12);
												Static180.aClass194_100 = null;
												return true;
											} else if (Static556.aClass194_282 == Static180.aClass194_100) {
												local209 = Static47.aClass3_Sub9_Sub2_1.method5585();
												local73 = Static47.aClass3_Sub9_Sub2_1.method5586();
												Static95.method1581();
												@Pc(5896) Class3_Sub1 local5896 = (Class3_Sub1) Static128.aClass25_7.method426((long) local209);
												local4343 = (Class3_Sub1) Static128.aClass25_7.method426((long) local73);
												if (local4343 != null) {
													Static69.method1233(local4343, local5896 == null || local4343.anInt24 != local5896.anInt24, false);
												}
												if (local5896 != null) {
													local5896.method8682();
													Static128.aClass25_7.method434((long) local73, local5896);
												}
												@Pc(5934) Class344 local5934 = Static324.method5363(local209);
												if (local5934 != null) {
													Static605.method8323(local5934);
												}
												local5934 = Static324.method5363(local73);
												if (local5934 != null) {
													Static605.method8323(local5934);
													Static335.method5417(true, local5934);
												}
												if (Static528.anInt8950 != -1) {
													Static24.method329(Static528.anInt8950, 1);
												}
												Static180.aClass194_100 = null;
												return true;
											} else if (Static269.aClass194_154 == Static180.aClass194_100) {
												Static234.method3997(Static412.aClass215_11);
												Static180.aClass194_100 = null;
												return true;
											} else if (Static180.aClass194_100 == Static305.aClass194_172) {
												@Pc(5981) byte local5981 = Static47.aClass3_Sub9_Sub2_1.method5580();
												local73 = Static47.aClass3_Sub9_Sub2_1.method5583();
												Static183.aClass285_1.method6944(local73, local5981);
												Static180.aClass194_100 = null;
												return true;
											} else if (Static180.aClass194_100 == Static59.aClass194_42) {
												local209 = Static47.aClass3_Sub9_Sub2_1.method5634();
												local73 = Static47.aClass3_Sub9_Sub2_1.method5634();
												local255 = Static47.aClass3_Sub9_Sub2_1.method5597();
												local414 = Static47.aClass3_Sub9_Sub2_1.method5583();
												Static95.method1581();
												Static270.method4506(local255, 7, local414 | local73 << 16, local209);
												Static180.aClass194_100 = null;
												return true;
											} else if (Static180.aClass194_100 == Static218.aClass194_117) {
												local73 = Static47.aClass3_Sub9_Sub2_1.method5622();
												local255 = Static47.aClass3_Sub9_Sub2_1.method5599();
												local414 = Static47.aClass3_Sub9_Sub2_1.method5597();
												Static95.method1581();
												Static486.method7138(local255, local73, local414);
												Static180.aClass194_100 = null;
												return true;
											} else if (Static32.aClass194_16 == Static180.aClass194_100) {
												local73 = Static47.aClass3_Sub9_Sub2_1.method5611();
												local255 = Static47.aClass3_Sub9_Sub2_1.method5583();
												Static95.method1581();
												Static305.method5149(local255, local73);
												Static180.aClass194_100 = null;
												return true;
											} else if (Static254.aClass194_53 == Static180.aClass194_100) {
												Static570.anInt3589 = Static303.anInt8405;
												if (Static94.anInt1852 == 0) {
													Static122.aString17 = null;
													Static9.aString1 = null;
													Static95.aClass253Array1 = null;
													Static180.aClass194_100 = null;
													Static398.anInt7117 = 0;
													return true;
												}
												Static122.aString17 = Static47.aClass3_Sub9_Sub2_1.method5607();
												@Pc(6124) boolean local6124 = Static47.aClass3_Sub9_Sub2_1.method5633() == 1;
												if (local6124) {
													Static47.aClass3_Sub9_Sub2_1.method5607();
												}
												@Pc(6134) long local6134 = Static47.aClass3_Sub9_Sub2_1.method5603();
												Static9.aString1 = Static23.method325(local6134);
												Static292.aByte70 = Static47.aClass3_Sub9_Sub2_1.method5619();
												local418 = Static47.aClass3_Sub9_Sub2_1.method5633();
												if (local418 == 255) {
													Static180.aClass194_100 = null;
													return true;
												}
												Static398.anInt7117 = local418;
												@Pc(6158) Class253[] local6158 = new Class253[100];
												for (local2115 = 0; local2115 < Static398.anInt7117; local2115++) {
													local6158[local2115] = new Class253();
													local6158[local2115].aString59 = Static47.aClass3_Sub9_Sub2_1.method5607();
													local6124 = Static47.aClass3_Sub9_Sub2_1.method5633() == 1;
													if (local6124) {
														local6158[local2115].aString60 = Static47.aClass3_Sub9_Sub2_1.method5607();
													} else {
														local6158[local2115].aString60 = local6158[local2115].aString59;
													}
													local6158[local2115].aString58 = Static353.method5667(local6158[local2115].aString60);
													local6158[local2115].anInt7221 = Static47.aClass3_Sub9_Sub2_1.method5610();
													local6158[local2115].aByte78 = Static47.aClass3_Sub9_Sub2_1.method5619();
													local6158[local2115].aString61 = Static47.aClass3_Sub9_Sub2_1.method5607();
													if (local6158[local2115].aString60.equals(Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aString5)) {
														Static284.aByte69 = local6158[local2115].aByte78;
													}
												}
												local2212 = Static398.anInt7117;
												while (local2212 > 0) {
													local2212--;
													@Pc(6264) boolean local6264 = true;
													for (local3123 = 0; local3123 < local2212; local3123++) {
														if (local6158[local3123].aString58.compareTo(local6158[local3123 + 1].aString58) > 0) {
															@Pc(6287) Class253 local6287 = local6158[local3123];
															local6158[local3123] = local6158[local3123 + 1];
															local6158[local3123 + 1] = local6287;
															local6264 = false;
														}
													}
													if (local6264) {
														break;
													}
												}
												Static180.aClass194_100 = null;
												Static95.aClass253Array1 = local6158;
												return true;
											} else if (Static180.aClass194_100 == Static537.aClass194_280) {
												Static234.method3997(Static217.aClass215_4);
												Static180.aClass194_100 = null;
												return true;
											} else if (Static126.aClass194_81 == Static180.aClass194_100) {
												local73 = Static47.aClass3_Sub9_Sub2_1.method5633();
												local1085 = (local73 & 0x1) == 1;
												local1188 = Static47.aClass3_Sub9_Sub2_1.method5607();
												local674 = Static47.aClass3_Sub9_Sub2_1.method5607();
												if (local674.equals("")) {
													local674 = local1188;
												}
												local420 = Static47.aClass3_Sub9_Sub2_1.method5607();
												local710 = Static47.aClass3_Sub9_Sub2_1.method5607();
												if (local710.equals("")) {
													local710 = local420;
												}
												if (local1085) {
													for (local442 = 0; local442 < Static191.anInt3579; local442++) {
														if (Static209.aStringArray30[local442].equals(local710)) {
															Static151.aStringArray24[local442] = local1188;
															Static209.aStringArray30[local442] = local674;
															Static193.aStringArray82[local442] = local420;
															Static492.aStringArray70[local442] = local710;
															break;
														}
													}
												} else {
													Static151.aStringArray24[Static191.anInt3579] = local1188;
													Static209.aStringArray30[Static191.anInt3579] = local674;
													Static193.aStringArray82[Static191.anInt3579] = local420;
													Static492.aStringArray70[Static191.anInt3579] = local710;
													Static158.aBooleanArray9[Static191.anInt3579] = (local73 & 0x2) == 2;
													Static191.anInt3579++;
												}
												Static492.anInt8360 = Static303.anInt8405;
												Static180.aClass194_100 = null;
												return true;
											} else if (Static180.aClass194_100 == Static290.aClass194_166) {
												local73 = Static47.aClass3_Sub9_Sub2_1.method5594();
												local255 = Static47.aClass3_Sub9_Sub2_1.method5610();
												if (local255 == 65535) {
													local255 = -1;
												}
												local414 = Static47.aClass3_Sub9_Sub2_1.method5626();
												Static40.method733(local255, local73, local414);
												Static180.aClass194_100 = null;
												return true;
											} else if (Static50.aClass194_36 == Static180.aClass194_100) {
												local73 = Static47.aClass3_Sub9_Sub2_1.method5628();
												if (local73 == 65535) {
													local73 = -1;
												}
												local255 = Static47.aClass3_Sub9_Sub2_1.method5613();
												local414 = Static47.aClass3_Sub9_Sub2_1.method5633();
												Static208.method3270(local255, local414, local73);
												Static180.aClass194_100 = null;
												return true;
											} else if (Static180.aClass194_100 == Static187.aClass194_104) {
												local229 = Static47.aClass3_Sub9_Sub2_1.method5607();
												local255 = Static47.aClass3_Sub9_Sub2_1.method5610();
												local1188 = Static54.aClass257_1.method6447(local255).method4309(Static47.aClass3_Sub9_Sub2_1);
												Static256.method4306(local229, 19, 0, local255, local1188, local229, local229, (String) null);
												Static180.aClass194_100 = null;
												return true;
											} else if (Static333.aClass194_190 == Static180.aClass194_100) {
												local73 = Static47.aClass3_Sub9_Sub2_1.method5585();
												Static170.aClass174_4 = Static48.aClass298_12.method7273(local73);
												Static180.aClass194_100 = null;
												return true;
											} else if (Static24.aClass194_14 == Static180.aClass194_100) {
												Static47.aClass3_Sub9_Sub2_1.anInt6453 += 28;
												if (Static47.aClass3_Sub9_Sub2_1.method5618()) {
													Static435.method6599(Static47.aClass3_Sub9_Sub2_1.anInt6453 - 28, Static47.aClass3_Sub9_Sub2_1);
												}
												Static180.aClass194_100 = null;
												return true;
											} else if (Static180.aClass194_100 == Static75.aClass194_58) {
												Static234.method3997(Static56.aClass215_2);
												Static180.aClass194_100 = null;
												return true;
											} else if (Static180.aClass194_100 == Static337.aClass194_191) {
												local73 = Static47.aClass3_Sub9_Sub2_1.method5626();
												local255 = Static47.aClass3_Sub9_Sub2_1.method5626();
												local414 = Static47.aClass3_Sub9_Sub2_1.method5633();
												local418 = Static47.aClass3_Sub9_Sub2_1.method5633();
												local1097 = Static47.aClass3_Sub9_Sub2_1.method5634();
												Static95.method1581();
												Static186.aBooleanArray12[local255] = true;
												Static646.anIntArray258[local255] = local73;
												Static198.anIntArray409[local255] = local418;
												Static279.anIntArray296[local255] = local414;
												Static649.anIntArray680[local255] = local1097;
												Static180.aClass194_100 = null;
												return true;
											} else if (Static180.aClass194_100 == Static23.aClass194_13) {
												local229 = Static47.aClass3_Sub9_Sub2_1.method5607();
												local255 = Static47.aClass3_Sub9_Sub2_1.method5634();
												Static95.method1581();
												Static126.method2240(local229, local255);
												Static180.aClass194_100 = null;
												return true;
											} else {
												Static296.method5075((Throwable) null, "T1 - " + (Static180.aClass194_100 == null ? -1 : Static180.aClass194_100.method5152()) + "," + (Static427.aClass194_241 == null ? -1 : Static427.aClass194_241.method5152()) + "," + (Static278.aClass194_159 == null ? -1 : Static278.aClass194_159.method5152()) + " - " + Static94.anInt1852);
												method6442(false);
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

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZZ)V")
	public static void method6442(@OriginalArg(0) boolean arg0) {
		if (Static547.aClass197_1 != null) {
			Static547.aClass197_1.method5188();
			Static547.aClass197_1 = null;
		}
		Static71.anInt1424 = 0;
		Static393.method7906();
		Static56.method1016();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static174.aClass237Array1[local19].method5911();
		}
		Static412.method6389(false);
		System.gc();
		Static551.method7858();
		Static145.aBoolean263 = false;
		Static573.anInt6752 = -1;
		Static612.method8364();
		Static616.method8422(true);
		Static270.anInt5273 = 0;
		Static427.anInt7462 = 0;
		Static22.anInt329 = 0;
		Static263.anInt5102 = 0;
		Static41.anInt768 = 0;
		Static259.anInt5048 = 0;
		for (@Pc(60) int local60 = 0; local60 < Static16.aClass118Array1.length; local60++) {
			Static16.aClass118Array1[local60] = null;
		}
		Static172.method2846();
		for (@Pc(75) int local75 = 0; local75 < 2048; local75++) {
			Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local75] = null;
		}
		Static596.anInt9702 = 0;
		Static545.aClass25_40.method433();
		Static73.anInt1445 = 0;
		Static39.aClass25_8.method433();
		Static494.method7224();
		Static322.anInt6148 = 0;
		Static183.aClass285_1.method6945();
		Static244.method4104();
		Static109.method1815();
		Static532.aLong244 = 0L;
		Static576.aClass3_Sub42_2 = null;
		if (arg0) {
			Static206.method3226(12);
			return;
		}
		Static206.method3226(3);
		try {
			Static652.method1818("loggedout", Static303.anApplet3);
		} catch (@Pc(122) Throwable local122) {
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZIILclient!vi;Lclient!vi;ZI)I")
	public static int method6444(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class354_Sub1 arg3, @OriginalArg(4) Class354_Sub1 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(10) int local10 = Static310.method5197(arg5, arg3, arg4, arg1);
		if (local10 != 0) {
			return arg5 ? -local10 : local10;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(33) int local33 = Static310.method5197(arg0, arg3, arg4, arg2);
			return arg0 ? -local33 : local33;
		}
	}
}
