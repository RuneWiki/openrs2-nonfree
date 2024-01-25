import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bg", name = "P", descriptor = "Lclient!of;")
	public static final Class174 aClass174_17 = new Class174("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!bg", name = "W", descriptor = "I")
	public static final int anInt448 = 50;

	@OriginalMember(owner = "client!bg", name = "V", descriptor = "[I")
	public static final int[] anIntArray13 = new int[anInt448];

	@OriginalMember(owner = "client!bg", name = "X", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray3 = new String[anInt448];

	@OriginalMember(owner = "client!bg", name = "Y", descriptor = "[I")
	public static final int[] anIntArray14 = new int[anInt448];

	@OriginalMember(owner = "client!bg", name = "Z", descriptor = "[I")
	public static final int[] anIntArray15 = new int[anInt448];

	@OriginalMember(owner = "client!bg", name = "ab", descriptor = "[I")
	public static final int[] anIntArray16 = new int[anInt448];

	@OriginalMember(owner = "client!bg", name = "bb", descriptor = "[I")
	public static final int[] anIntArray17 = new int[anInt448];

	@OriginalMember(owner = "client!bg", name = "cb", descriptor = "[I")
	public static final int[] anIntArray18 = new int[anInt448];

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLclient!ci;)V")
	public static void method466(@OriginalArg(1) Class23_Sub2 arg0) {
		arg0.aClass1_Sub2_Sub6_1 = null;
		if (Static52.anInt944 < 20) {
			Static459.aClass194_8.method4582(arg0);
			Static52.anInt944++;
		}
	}

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "(I)Z")
	public static boolean method468() throws IOException {
		if (Static328.aClass116_1 == null) {
			return false;
		}
		@Pc(75) int local75;
		if (Static167.aClass136_81 == null) {
			if (Static107.aBoolean116) {
				if (!Static328.aClass116_1.method2924(1)) {
					return false;
				}
				Static328.aClass116_1.method2919(Static176.aClass3_Sub25_Sub1_1.aByteArray88, 1, 0);
				Static269.anInt3398 = 0;
				Static107.aBoolean116 = false;
				Static128.anInt2337++;
			}
			Static176.aClass3_Sub25_Sub1_1.anInt4974 = 0;
			if (Static176.aClass3_Sub25_Sub1_1.method2776()) {
				if (!Static328.aClass116_1.method2924(1)) {
					return false;
				}
				Static328.aClass116_1.method2919(Static176.aClass3_Sub25_Sub1_1.aByteArray88, 1, 1);
				Static269.anInt3398 = 0;
				Static128.anInt2337++;
			}
			Static107.aBoolean116 = true;
			@Pc(71) Class136[] local71 = Static64.method1221();
			local75 = Static176.aClass3_Sub25_Sub1_1.method2774();
			if (local75 < 0 || local71.length <= local75) {
				throw new IOException("invo:" + local75 + " ip:" + Static176.aClass3_Sub25_Sub1_1.anInt4974);
			}
			Static167.aClass136_81 = local71[local75];
			Static102.anInt1839 = Static167.aClass136_81.anInt3797;
		}
		if (Static102.anInt1839 == -1) {
			if (!Static328.aClass116_1.method2924(1)) {
				return false;
			}
			Static328.aClass116_1.method2919(Static176.aClass3_Sub25_Sub1_1.aByteArray88, 1, 0);
			Static269.anInt3398 = 0;
			Static128.anInt2337++;
			Static102.anInt1839 = Static176.aClass3_Sub25_Sub1_1.aByteArray88[0] & 0xFF;
		}
		if (Static102.anInt1839 == -2) {
			if (!Static328.aClass116_1.method2924(2)) {
				return false;
			}
			Static328.aClass116_1.method2919(Static176.aClass3_Sub25_Sub1_1.aByteArray88, 2, 0);
			Static176.aClass3_Sub25_Sub1_1.anInt4974 = 0;
			Static102.anInt1839 = Static176.aClass3_Sub25_Sub1_1.method4083();
			Static269.anInt3398 = 0;
			Static128.anInt2337 += 2;
		}
		if (Static102.anInt1839 > 0) {
			if (!Static328.aClass116_1.method2924(Static102.anInt1839)) {
				return false;
			}
			Static176.aClass3_Sub25_Sub1_1.anInt4974 = 0;
			Static328.aClass116_1.method2919(Static176.aClass3_Sub25_Sub1_1.aByteArray88, Static102.anInt1839, 0);
			Static269.anInt3398 = 0;
			Static128.anInt2337 += Static102.anInt1839;
		}
		Static46.aClass136_17 = Static237.aClass136_117;
		Static237.aClass136_117 = Static452.aClass136_201;
		Static452.aClass136_201 = Static167.aClass136_81;
		@Pc(210) int local210;
		@Pc(214) byte local214;
		if (Static167.aClass136_81 == Static421.aClass136_189) {
			local210 = Static176.aClass3_Sub25_Sub1_1.method4083();
			local214 = Static176.aClass3_Sub25_Sub1_1.method4074();
			Static119.aClass47_1.method1269(local210, local214);
			Static167.aClass136_81 = null;
			return true;
		}
		@Pc(242) int local242;
		if (Static167.aClass136_81 == Static348.aClass136_162) {
			local210 = Static176.aClass3_Sub25_Sub1_1.method4083();
			local214 = Static176.aClass3_Sub25_Sub1_1.method4074();
			local242 = Static176.aClass3_Sub25_Sub1_1.method4109();
			if (Static110.method1810(local242)) {
				Static457.method6233(local210, local214);
			}
			Static167.aClass136_81 = null;
			return true;
		} else if (Static278.aClass136_131 == Static167.aClass136_81) {
			local210 = Static176.aClass3_Sub25_Sub1_1.method4083();
			local75 = Static176.aClass3_Sub25_Sub1_1.method4117();
			local242 = Static176.aClass3_Sub25_Sub1_1.method4067();
			if (Static110.method1810(local242)) {
				Static457.method6233(local210, local75);
			}
			Static167.aClass136_81 = null;
			return true;
		} else if (Static167.aClass136_81 == Static67.aClass136_34) {
			Static200.anInt3579 = Static176.aClass3_Sub25_Sub1_1.method4076();
			Static119.anInt2106 = Static176.aClass3_Sub25_Sub1_1.method4097() << 3;
			Static343.anInt5784 = Static176.aClass3_Sub25_Sub1_1.method4097() << 3;
			Static167.aClass136_81 = null;
			return true;
		} else if (Static247.aClass136_182 == Static167.aClass136_81) {
			Static429.method5845();
			Static167.aClass136_81 = null;
			return false;
		} else if (Static167.aClass136_81 == Static207.aClass136_100) {
			Static400.method5480();
			Static167.aClass136_81 = null;
			return true;
		} else {
			@Pc(357) int local357;
			@Pc(359) int local359;
			if (Static167.aClass136_81 == Static221.aClass136_184) {
				local210 = Static176.aClass3_Sub25_Sub1_1.method4095();
				local75 = Static176.aClass3_Sub25_Sub1_1.method4068();
				local242 = Static176.aClass3_Sub25_Sub1_1.method4066();
				Static400.anIntArray418[local210] = local75;
				Static226.anIntArray443[local210] = local242;
				Static95.anIntArray80[local210] = 1;
				local357 = Static226.anIntArray440[local210] - 1;
				for (local359 = 0; local359 < local357; local359++) {
					if (local75 >= Class3_Sub3_Sub6.anIntArray351[local359]) {
						Static95.anIntArray80[local210] = local359 + 2;
					}
				}
				Static389.anIntArray212[Static197.anInt3553++ & 0x1F] = local210;
				Static167.aClass136_81 = null;
				return true;
			}
			@Pc(405) String local405;
			if (Static167.aClass136_81 == Static360.aClass136_169) {
				local405 = Static176.aClass3_Sub25_Sub1_1.method4073();
				local75 = Static176.aClass3_Sub25_Sub1_1.method4096();
				local242 = Static176.aClass3_Sub25_Sub1_1.method4067();
				if (local242 == 65535) {
					local242 = -1;
				}
				local357 = Static176.aClass3_Sub25_Sub1_1.method4095();
				if (local75 >= 1 && local75 <= 8) {
					if (local405.equalsIgnoreCase("null")) {
						local405 = null;
					}
					Static100.aStringArray11[local75 - 1] = local405;
					Static314.anIntArray336[local75 - 1] = local242;
					Static142.aBooleanArray10[local75 - 1] = local357 == 0;
				}
				Static167.aClass136_81 = null;
				return true;
			}
			@Pc(494) int local494;
			if (Static193.aClass136_96 == Static167.aClass136_81) {
				local210 = Static176.aClass3_Sub25_Sub1_1.method4083();
				local75 = Static176.aClass3_Sub25_Sub1_1.method4096();
				local242 = Static176.aClass3_Sub25_Sub1_1.method4096();
				local357 = Static176.aClass3_Sub25_Sub1_1.method4083() << 0;
				local359 = Static176.aClass3_Sub25_Sub1_1.method4096();
				local494 = Static176.aClass3_Sub25_Sub1_1.method4096();
				if (Static110.method1810(local210)) {
					Static27.method497(local75, local357, local494, local242, local359);
				}
				Static167.aClass136_81 = null;
				return true;
			} else if (Static167.aClass136_81 == Static432.aClass136_194) {
				Static120.aClass123_2 = Static222.method4445(Static176.aClass3_Sub25_Sub1_1.method4096());
				Static167.aClass136_81 = null;
				return true;
			} else {
				@Pc(556) boolean local556;
				@Pc(540) String local540;
				@Pc(544) String local544;
				@Pc(536) boolean local536;
				@Pc(852) String local852;
				@Pc(576) int local576;
				@Pc(816) String local816;
				@Pc(554) String local554;
				@Pc(614) boolean local614;
				if (Static167.aClass136_81 == Static319.aClass136_146) {
					while (Static176.aClass3_Sub25_Sub1_1.anInt4974 < Static102.anInt1839) {
						local536 = Static176.aClass3_Sub25_Sub1_1.method4096() == 1;
						local540 = Static176.aClass3_Sub25_Sub1_1.method4073();
						local544 = Static176.aClass3_Sub25_Sub1_1.method4073();
						local357 = Static176.aClass3_Sub25_Sub1_1.method4083();
						local359 = Static176.aClass3_Sub25_Sub1_1.method4096();
						local554 = "";
						local556 = false;
						if (local357 > 0) {
							local554 = Static176.aClass3_Sub25_Sub1_1.method4073();
							local556 = Static176.aClass3_Sub25_Sub1_1.method4096() == 1;
						}
						for (local576 = 0; local576 < Static12.anInt180; local576++) {
							if (local536) {
								if (local544.equals(Static296.aStringArray32[local576])) {
									Static296.aStringArray32[local576] = local540;
									Static347.aStringArray35[local576] = local544;
									local540 = null;
									break;
								}
							} else if (local540.equals(Static296.aStringArray32[local576])) {
								if (local357 != Static216.anIntArray238[local576]) {
									local614 = true;
									for (@Pc(619) Class23_Sub1_Sub1 local619 = (Class23_Sub1_Sub1) Static268.aClass194_6.method4577(); local619 != null; local619 = (Class23_Sub1_Sub1) Static268.aClass194_6.method4580()) {
										if (local619.aString3.equals(local540)) {
											if (local357 != 0 && local619.aShort9 == 0) {
												local614 = false;
												local619.method5853();
											} else if (local357 == 0 && local619.aShort9 != 0) {
												local614 = false;
												local619.method5853();
											}
										}
									}
									if (local614) {
										Static268.aClass194_6.method4582(new Class23_Sub1_Sub1(local540, local357));
									}
									Static216.anIntArray238[local576] = local357;
								}
								Static347.aStringArray35[local576] = local544;
								Static77.aStringArray10[local576] = local554;
								Static83.anIntArray74[local576] = local359;
								local540 = null;
								Static122.aBooleanArray8[local576] = local556;
								break;
							}
						}
						if (local540 != null && Static12.anInt180 < 200) {
							Static296.aStringArray32[Static12.anInt180] = local540;
							Static347.aStringArray35[Static12.anInt180] = local544;
							Static216.anIntArray238[Static12.anInt180] = local357;
							Static77.aStringArray10[Static12.anInt180] = local554;
							Static83.anIntArray74[Static12.anInt180] = local359;
							Static122.aBooleanArray8[Static12.anInt180] = local556;
							Static12.anInt180++;
						}
					}
					Static414.anInt7474 = Static125.anInt2284;
					Static284.anInt5007 = 2;
					local75 = Static12.anInt180;
					while (local75 > 0) {
						local536 = true;
						local75--;
						for (local242 = 0; local242 < local75; local242++) {
							if (Static367.aClass241_6.anInt6624 != Static216.anIntArray238[local242] && Static367.aClass241_6.anInt6624 == Static216.anIntArray238[local242 + 1] || Static216.anIntArray238[local242] == 0 && Static216.anIntArray238[local242 + 1] != 0) {
								local357 = Static216.anIntArray238[local242];
								Static216.anIntArray238[local242] = Static216.anIntArray238[local242 + 1];
								Static216.anIntArray238[local242 + 1] = local357;
								local816 = Static77.aStringArray10[local242];
								Static77.aStringArray10[local242] = Static77.aStringArray10[local242 + 1];
								Static77.aStringArray10[local242 + 1] = local816;
								local554 = Static296.aStringArray32[local242];
								Static296.aStringArray32[local242] = Static296.aStringArray32[local242 + 1];
								Static296.aStringArray32[local242 + 1] = local554;
								local852 = Static347.aStringArray35[local242];
								Static347.aStringArray35[local242] = Static347.aStringArray35[local242 + 1];
								Static347.aStringArray35[local242 + 1] = local852;
								local576 = Static83.anIntArray74[local242];
								Static83.anIntArray74[local242] = Static83.anIntArray74[local242 + 1];
								Static83.anIntArray74[local242 + 1] = local576;
								local614 = Static122.aBooleanArray8[local242];
								Static122.aBooleanArray8[local242] = Static122.aBooleanArray8[local242 + 1];
								Static122.aBooleanArray8[local242 + 1] = local614;
								local536 = false;
							}
						}
						if (local536) {
							break;
						}
					}
					Static167.aClass136_81 = null;
					return true;
				}
				@Pc(955) Class3_Sub10 local955;
				if (Static167.aClass136_81 == Static393.aClass136_180) {
					local210 = Static176.aClass3_Sub25_Sub1_1.method4088();
					local75 = Static176.aClass3_Sub25_Sub1_1.method4096();
					local242 = Static176.aClass3_Sub25_Sub1_1.method4083();
					local357 = Static176.aClass3_Sub25_Sub1_1.method4117();
					if (Static110.method1810(local242)) {
						local955 = (Class3_Sub10) Static32.aClass140_5.method3490((long) local357);
						if (local955 != null) {
							Static87.method1538(local955, false, local210 != local955.anInt827);
						}
						Static435.method5882(local75, local210, false, local357);
					}
					Static167.aClass136_81 = null;
					return true;
				}
				@Pc(1027) int local1027;
				@Pc(1012) long local1012;
				@Pc(1019) long local1019;
				@Pc(1037) int local1037;
				if (Static178.aClass136_89 == Static167.aClass136_81) {
					local536 = Static176.aClass3_Sub25_Sub1_1.method4096() == 1;
					local540 = Static176.aClass3_Sub25_Sub1_1.method4073();
					local544 = local540;
					if (local536) {
						local544 = Static176.aClass3_Sub25_Sub1_1.method4073();
					}
					local1012 = Static176.aClass3_Sub25_Sub1_1.method4083();
					local1019 = Static176.aClass3_Sub25_Sub1_1.method4099();
					local576 = Static176.aClass3_Sub25_Sub1_1.method4096();
					local1027 = Static176.aClass3_Sub25_Sub1_1.method4083();
					@Pc(1033) long local1033 = (local1012 << 32) + local1019;
					@Pc(1035) boolean local1035 = false;
					local1037 = 0;
					while (true) {
						if (local1037 >= 100) {
							if (local576 <= 1 && Static350.method4880(local544)) {
								local1035 = true;
							}
							break;
						}
						if (local1033 == Static50.aLongArray1[local1037]) {
							local1035 = true;
							break;
						}
						local1037++;
					}
					if (!local1035 && Static119.anInt2103 == 0) {
						Static50.aLongArray1[Static74.anInt1341] = local1033;
						Static74.anInt1341 = (Static74.anInt1341 + 1) % 100;
						@Pc(1090) String local1090 = Static141.aClass61_1.method1599(local1027).method6111(Static176.aClass3_Sub25_Sub1_1);
						if (local576 == 2) {
							Static114.method1846(local1090, null, 18, "<img=1>" + local540, local1027, "<img=1>" + local544, 0);
						} else if (local576 == 1) {
							Static114.method1846(local1090, null, 18, "<img=0>" + local540, local1027, "<img=0>" + local544, 0);
						} else {
							Static114.method1846(local1090, null, 18, local540, local1027, local544, 0);
						}
					}
					Static167.aClass136_81 = null;
					return true;
				} else if (Static134.aClass136_64 == Static167.aClass136_81) {
					local210 = Static176.aClass3_Sub25_Sub1_1.method4083();
					if (Static110.method1810(local210)) {
						Static142.method2184();
					}
					Static167.aClass136_81 = null;
					return true;
				} else if (Static119.aClass136_58 == Static167.aClass136_81) {
					local210 = Static176.aClass3_Sub25_Sub1_1.method4117();
					local75 = Static176.aClass3_Sub25_Sub1_1.method4067();
					local242 = Static176.aClass3_Sub25_Sub1_1.method4109();
					if (local242 == 65535) {
						local242 = -1;
					}
					local357 = Static176.aClass3_Sub25_Sub1_1.method4100();
					if (Static110.method1810(local75)) {
						Static387.method5393(local210, local357, local242);
						@Pc(1218) Class209 local1218 = Static158.aClass272_1.method6283(local242);
						Static193.method3013(local1218.anInt6037, local1218.anInt6041, local1218.anInt6057, local357);
						Static386.method5392(local1218.anInt6027, local357, local1218.anInt6036, local1218.anInt6044);
					}
					Static167.aClass136_81 = null;
					return true;
				} else if (Static277.aClass136_132 == Static167.aClass136_81) {
					local210 = Static176.aClass3_Sub25_Sub1_1.method4068();
					local75 = Static176.aClass3_Sub25_Sub1_1.method4088();
					local242 = Static176.aClass3_Sub25_Sub1_1.method4109();
					local357 = Static176.aClass3_Sub25_Sub1_1.method4083();
					if (Static110.method1810(local75)) {
						Static170.method2608(local210, local242 + (local357 << 16));
					}
					Static167.aClass136_81 = null;
					return true;
				} else if (Static167.aClass136_81 == Static423.aClass136_190) {
					Static176.aClass3_Sub25_Sub1_1.anInt4974 += 28;
					if (Static176.aClass3_Sub25_Sub1_1.method4094()) {
						Static332.method4600(Static176.aClass3_Sub25_Sub1_1, Static176.aClass3_Sub25_Sub1_1.anInt4974 - 28);
					}
					Static167.aClass136_81 = null;
					return true;
				} else if (Static120.aClass136_59 == Static167.aClass136_81) {
					local210 = Static176.aClass3_Sub25_Sub1_1.method4088();
					local75 = Static176.aClass3_Sub25_Sub1_1.method4100();
					Static119.aClass47_1.method1269(local210, local75);
					Static167.aClass136_81 = null;
					return true;
				} else if (Static57.aClass136_25 == Static167.aClass136_81) {
					local210 = Static176.aClass3_Sub25_Sub1_1.method4121();
					local75 = Static176.aClass3_Sub25_Sub1_1.method4109();
					local242 = Static176.aClass3_Sub25_Sub1_1.method4068();
					if (Static110.method1810(local75)) {
						Static392.method5428(local210, local242);
					}
					Static167.aClass136_81 = null;
					return true;
				} else if (Static167.aClass136_81 == Static192.aClass136_95) {
					Static284.anInt5007 = 1;
					Static414.anInt7474 = Static125.anInt2284;
					Static167.aClass136_81 = null;
					return true;
				} else if (Static96.aClass136_48 == Static167.aClass136_81) {
					Static356.method5852(Static217.aClass183_6);
					Static167.aClass136_81 = null;
					return true;
				} else {
					@Pc(1432) long local1432;
					@Pc(1449) Class3_Sub42 local1449;
					@Pc(1438) Class3_Sub42 local1438;
					if (Static130.aClass136_62 == Static167.aClass136_81) {
						local210 = Static176.aClass3_Sub25_Sub1_1.method4108();
						local75 = Static176.aClass3_Sub25_Sub1_1.method4083();
						if (local75 == 65535) {
							local75 = -1;
						}
						local242 = Static176.aClass3_Sub25_Sub1_1.method4088();
						if (local242 == 65535) {
							local242 = -1;
						}
						local357 = Static176.aClass3_Sub25_Sub1_1.method4083();
						local359 = Static176.aClass3_Sub25_Sub1_1.method4100();
						if (Static110.method1810(local357)) {
							for (local494 = local75; local494 <= local242; local494++) {
								local1432 = (long) local494 + ((long) local210 << 32);
								local1438 = (Class3_Sub42) Static228.aClass140_25.method3490(local1432);
								if (local1438 != null) {
									local1449 = new Class3_Sub42(local359, local1438.anInt6590);
									local1438.method6288();
								} else if (local494 == -1) {
									local1449 = new Class3_Sub42(local359, Static180.method2857(local210).aClass3_Sub42_2.anInt6590);
								} else {
									local1449 = new Class3_Sub42(local359, -1);
								}
								Static228.aClass140_25.method3494(local1432, local1449);
							}
						}
						Static167.aClass136_81 = null;
						return true;
					}
					@Pc(1571) int local1571;
					@Pc(1514) String local1514;
					if (Static167.aClass136_81 == Static182.aClass136_90) {
						local210 = Static176.aClass3_Sub25_Sub1_1.method4096();
						@Pc(1506) boolean local1506 = (local210 & 0x1) == 1;
						local544 = Static176.aClass3_Sub25_Sub1_1.method4073();
						local1514 = Static176.aClass3_Sub25_Sub1_1.method4073();
						if (local1514.equals("")) {
							local1514 = local544;
						}
						local816 = Static176.aClass3_Sub25_Sub1_1.method4073();
						local554 = Static176.aClass3_Sub25_Sub1_1.method4073();
						if (local554.equals("")) {
							local554 = local816;
						}
						if (local1506) {
							for (local1571 = 0; local1571 < Static79.anInt1430; local1571++) {
								if (Static331.aStringArray45[local1571].equals(local554)) {
									Static47.aStringArray7[local1571] = local544;
									Static331.aStringArray45[local1571] = local1514;
									Static334.aStringArray34[local1571] = local816;
									Static141.aStringArray14[local1571] = local554;
									break;
								}
							}
						} else {
							Static47.aStringArray7[Static79.anInt1430] = local544;
							Static331.aStringArray45[Static79.anInt1430] = local1514;
							Static334.aStringArray34[Static79.anInt1430] = local816;
							Static141.aStringArray14[Static79.anInt1430] = local554;
							Static173.aBooleanArray16[Static79.anInt1430] = (local210 & 0x2) == 2;
							Static79.anInt1430++;
						}
						Static414.anInt7474 = Static125.anInt2284;
						Static167.aClass136_81 = null;
						return true;
					} else if (Static118.aClass136_56 == Static167.aClass136_81) {
						local210 = Static176.aClass3_Sub25_Sub1_1.method4095();
						local75 = Static176.aClass3_Sub25_Sub1_1.method4083();
						local242 = Static176.aClass3_Sub25_Sub1_1.method4067();
						if (Static110.method1810(local242)) {
							if (local210 == 2) {
								Static152.method6185();
							}
							Static343.anInt5785 = local75;
							Static141.method2174(local75);
							Static213.method3196(false);
							Static219.method3209(Static343.anInt5785);
							for (local357 = 0; local357 < 100; local357++) {
								Static391.aBooleanArray22[local357] = true;
							}
						}
						Static167.aClass136_81 = null;
						return true;
					} else if (Static423.aClass136_191 == Static167.aClass136_81) {
						local210 = Static176.aClass3_Sub25_Sub1_1.method4088();
						local75 = Static176.aClass3_Sub25_Sub1_1.method4083();
						local242 = Static176.aClass3_Sub25_Sub1_1.method4109();
						if (Static110.method1810(local210)) {
							Static342.method4769(local75, local242);
						}
						Static167.aClass136_81 = null;
						return true;
					} else if (Static146.aClass136_70 == Static167.aClass136_81) {
						Static167.aClass136_81 = null;
						return false;
					} else if (Static353.aClass136_197 == Static167.aClass136_81) {
						local210 = Static176.aClass3_Sub25_Sub1_1.method4117();
						local75 = Static176.aClass3_Sub25_Sub1_1.method4065();
						local242 = Static176.aClass3_Sub25_Sub1_1.method4067();
						local357 = Static176.aClass3_Sub25_Sub1_1.method4121();
						if (Static110.method1810(local242)) {
							Static107.method1789(local75, local210, local357);
						}
						Static167.aClass136_81 = null;
						return true;
					} else if (Static167.aClass136_81 == Static231.aClass136_112) {
						for (local210 = 0; local210 < Static216.aClass1_Sub2_Sub6_Sub2Array1.length; local210++) {
							if (Static216.aClass1_Sub2_Sub6_Sub2Array1[local210] != null) {
								Static216.aClass1_Sub2_Sub6_Sub2Array1[local210].anInt7612 = -1;
							}
						}
						for (local75 = 0; local75 < Static76.anInt1390; local75++) {
							Static407.aClass3_Sub40Array1[local75].aClass1_Sub2_Sub6_Sub1_2.anInt7612 = -1;
						}
						Static167.aClass136_81 = null;
						return true;
					} else if (Static356.aClass136_193 == Static167.aClass136_81) {
						Static200.anInt3579 = Static176.aClass3_Sub25_Sub1_1.method4076();
						Static119.anInt2106 = Static176.aClass3_Sub25_Sub1_1.method4074() << 3;
						Static343.anInt5784 = Static176.aClass3_Sub25_Sub1_1.method4097() << 3;
						for (@Pc(1805) Class3_Sub13 local1805 = (Class3_Sub13) Static242.aClass140_26.method3486(); local1805 != null; local1805 = (Class3_Sub13) Static242.aClass140_26.method3485()) {
							local75 = (int) (local1805.aLong248 >> 28 & 0x3L);
							local242 = (int) (local1805.aLong248 & 0x3FFFL);
							local357 = local242 - Static59.anInt1127;
							local359 = (int) (local1805.aLong248 >> 14 & 0x3FFFL);
							local494 = local359 - Static49.anInt873;
							if (Static200.anInt3579 == local75 && Static343.anInt5784 <= local357 && local357 < Static343.anInt5784 + 8 && Static119.anInt2106 <= local494 && local494 < Static119.anInt2106 + 8) {
								local1805.method6288();
								if (local357 >= 0 && local494 >= 0 && local357 < Static373.anInt6324 && Static291.anInt5062 > local494) {
									Static158.method2487(Static200.anInt3579, local357, local494);
								}
							}
						}
						for (@Pc(1908) Class3_Sub14 local1908 = (Class3_Sub14) Static305.aClass193_49.method4519(); local1908 != null; local1908 = (Class3_Sub14) Static305.aClass193_49.method4525()) {
							if (Static343.anInt5784 <= local1908.anInt1627 && local1908.anInt1627 < Static343.anInt5784 + 8 && Static119.anInt2106 <= local1908.anInt1629 && Static119.anInt2106 + 8 > local1908.anInt1629 && local1908.anInt1621 == Static200.anInt3579) {
								local1908.anInt1626 = 0;
							}
						}
						Static167.aClass136_81 = null;
						return true;
					} else if (Static141.aClass136_68 == Static167.aClass136_81) {
						local210 = Static176.aClass3_Sub25_Sub1_1.method4096();
						local75 = local210 >> 5;
						local242 = local210 & 0x1F;
						if (local242 == 0) {
							Static138.aClass36Array1[local75] = null;
							Static167.aClass136_81 = null;
							return true;
						}
						@Pc(1989) Class36 local1989 = new Class36();
						local1989.anInt1123 = local242;
						local1989.anInt1119 = Static176.aClass3_Sub25_Sub1_1.method4096();
						if (local1989.anInt1119 >= 0 && Static93.aClass2Array4.length > local1989.anInt1119) {
							if (local1989.anInt1123 == 1 || local1989.anInt1123 == 10) {
								local1989.anInt1122 = Static176.aClass3_Sub25_Sub1_1.method4083();
								Static176.aClass3_Sub25_Sub1_1.anInt4974 += 6;
							} else if (local1989.anInt1123 >= 2 && local1989.anInt1123 <= 6) {
								if (local1989.anInt1123 == 2) {
									local1989.anInt1126 = 64;
									local1989.anInt1120 = 64;
								}
								if (local1989.anInt1123 == 3) {
									local1989.anInt1120 = 0;
									local1989.anInt1126 = 64;
								}
								if (local1989.anInt1123 == 4) {
									local1989.anInt1126 = 64;
									local1989.anInt1120 = 128;
								}
								if (local1989.anInt1123 == 5) {
									local1989.anInt1120 = 64;
									local1989.anInt1126 = 0;
								}
								if (local1989.anInt1123 == 6) {
									local1989.anInt1120 = 64;
									local1989.anInt1126 = 128;
								}
								local1989.anInt1123 = 2;
								local1989.anInt1121 = Static176.aClass3_Sub25_Sub1_1.method4096();
								local1989.anInt1120 += Static176.aClass3_Sub25_Sub1_1.method4083() - Static59.anInt1127 << 7;
								local1989.anInt1126 += Static176.aClass3_Sub25_Sub1_1.method4083() - Static49.anInt873 << 7;
								local1989.anInt1125 = Static176.aClass3_Sub25_Sub1_1.method4096() << 0;
								local1989.anInt1116 = Static176.aClass3_Sub25_Sub1_1.method4083();
							}
							local1989.anInt1117 = Static176.aClass3_Sub25_Sub1_1.method4083();
							if (local1989.anInt1117 == 65535) {
								local1989.anInt1117 = -1;
							}
							Static138.aClass36Array1[local75] = local1989;
						}
						Static167.aClass136_81 = null;
						return true;
					} else if (Static167.aClass136_81 == Static68.aClass136_36) {
						local210 = Static176.aClass3_Sub25_Sub1_1.method4083();
						local75 = Static176.aClass3_Sub25_Sub1_1.method4096();
						local242 = Static176.aClass3_Sub25_Sub1_1.method4096();
						local357 = Static176.aClass3_Sub25_Sub1_1.method4083() << 0;
						local359 = Static176.aClass3_Sub25_Sub1_1.method4096();
						local494 = Static176.aClass3_Sub25_Sub1_1.method4096();
						if (Static110.method1810(local210)) {
							Static260.method5120(local359, local75, true, local357, local494, local242);
						}
						Static167.aClass136_81 = null;
						return true;
					} else {
						@Pc(2285) int local2285;
						@Pc(2440) int local2440;
						@Pc(2236) boolean local2236;
						@Pc(2736) int local2736;
						@Pc(2664) int local2664;
						if (Static167.aClass136_81 == Static368.aClass136_171) {
							local210 = Static176.aClass3_Sub25_Sub1_1.method4100();
							local75 = Static176.aClass3_Sub25_Sub1_1.method4083();
							local242 = Static176.aClass3_Sub25_Sub1_1.method4096();
							local357 = Static176.aClass3_Sub25_Sub1_1.method4067();
							local359 = Static176.aClass3_Sub25_Sub1_1.method4088();
							local2236 = (local242 & 0x80) != 0;
							if (local210 >> 30 == 0) {
								@Pc(2348) Class52 local2348;
								@Pc(2364) Class261 local2364;
								@Pc(2370) Class261 local2370;
								if (local210 >> 29 != 0) {
									local1571 = local210 & 0xFFFF;
									@Pc(2573) Class3_Sub40 local2573 = (Class3_Sub40) Static63.aClass140_37.method3490((long) local1571);
									if (local2573 != null) {
										if (local359 == 65535) {
											local359 = -1;
										}
										@Pc(2585) Class1_Sub2_Sub6_Sub1 local2585 = local2573.aClass1_Sub2_Sub6_Sub1_2;
										@Pc(2587) boolean local2587 = true;
										local2440 = local2236 ? local2585.anInt7605 : local2585.anInt7596;
										if (local359 != -1 && local2440 != -1) {
											if (local2440 == local359) {
												local2348 = Static387.aClass201_2.method4775(local359);
												if (local2348.aBoolean92 && local2348.anInt1397 != -1) {
													local2364 = Static444.aClass59_3.method1552(local2348.anInt1397);
													local2664 = local2364.anInt7421;
													if (local2664 == 0 || local2664 == 2) {
														local2587 = false;
													} else if (local2664 == 1) {
														local2587 = true;
													}
												}
											} else {
												local2348 = Static387.aClass201_2.method4775(local359);
												@Pc(2614) Class52 local2614 = Static387.aClass201_2.method4775(local2440);
												if (local2348.anInt1397 != -1 && local2614.anInt1397 != -1) {
													local2370 = Static444.aClass59_3.method1552(local2348.anInt1397);
													@Pc(2634) Class261 local2634 = Static444.aClass59_3.method1552(local2614.anInt1397);
													if (local2370.anInt7419 < local2634.anInt7419) {
														local2587 = false;
													}
												}
											}
										}
										if (local2587) {
											if (local2236) {
												local2585.anInt7605 = local359;
												local2585.anInt7595 = local357 + Static172.anInt3107;
												local2585.anInt7584 = local242 & 0x7;
												local2585.anInt7593 = 1;
												local2585.anInt7606 = local75;
												local2585.anInt7629 = 0;
												local2585.anInt7592 = 0;
												if (Static172.anInt3107 < local2585.anInt7595) {
													local2585.anInt7629 = -1;
												}
												if (local2585.anInt7605 != -1 && Static172.anInt3107 == local2585.anInt7595) {
													local2736 = Static387.aClass201_2.method4775(local2585.anInt7605).anInt1397;
													if (local2736 != -1) {
														local2364 = Static444.aClass59_3.method1552(local2736);
														if (local2364 != null && local2364.anIntArray494 != null) {
															Static192.method3007(local2364, local2585.aByte101, 0, local2585.anInt7560, local2585.anInt7557, false);
														}
													}
												}
											} else {
												local2585.anInt7572 = 0;
												local2585.anInt7631 = local75;
												local2585.anInt7614 = 1;
												local2585.anInt7590 = local357 + Static172.anInt3107;
												local2585.anInt7596 = local359;
												local2585.anInt7604 = 0;
												local2585.anInt7635 = local242 & 0x7;
												if (Static172.anInt3107 < local2585.anInt7590) {
													local2585.anInt7572 = -1;
												}
												if (local2585.anInt7596 != -1 && local2585.anInt7590 == Static172.anInt3107) {
													local2736 = Static387.aClass201_2.method4775(local2585.anInt7596).anInt1397;
													if (local2736 != -1) {
														local2364 = Static444.aClass59_3.method1552(local2736);
														if (local2364 != null && local2364.anIntArray494 != null) {
															Static192.method3007(local2364, local2585.aByte101, 0, local2585.anInt7560, local2585.anInt7557, false);
														}
													}
												}
											}
										}
									}
								} else if (local210 >> 28 != 0) {
									local1571 = local210 & 0xFFFF;
									@Pc(2262) Class1_Sub2_Sub6_Sub2 local2262;
									if (local1571 == Static317.anInt5364) {
										local2262 = Static203.aClass1_Sub2_Sub6_Sub2_1;
									} else {
										local2262 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local1571];
									}
									if (local2262 != null) {
										if (local359 == 65535) {
											local359 = -1;
										}
										local614 = true;
										local2285 = local2236 ? local2262.anInt7605 : local2262.anInt7596;
										@Pc(2314) Class261 local2314;
										if (local359 != -1 && local2285 != -1) {
											@Pc(2300) Class52 local2300;
											if (local2285 == local359) {
												local2300 = Static387.aClass201_2.method4775(local359);
												if (local2300.aBoolean92 && local2300.anInt1397 != -1) {
													local2314 = Static444.aClass59_3.method1552(local2300.anInt1397);
													local1037 = local2314.anInt7421;
													if (local1037 == 0 || local1037 == 2) {
														local614 = false;
													} else if (local1037 == 1) {
														local614 = true;
													}
												}
											} else {
												local2300 = Static387.aClass201_2.method4775(local359);
												local2348 = Static387.aClass201_2.method4775(local2285);
												if (local2300.anInt1397 != -1 && local2348.anInt1397 != -1) {
													local2364 = Static444.aClass59_3.method1552(local2300.anInt1397);
													local2370 = Static444.aClass59_3.method1552(local2348.anInt1397);
													if (local2370.anInt7419 > local2364.anInt7419) {
														local614 = false;
													}
												}
											}
										}
										if (local614) {
											if (local2236) {
												local2262.anInt7592 = 0;
												local2262.anInt7595 = Static172.anInt3107 + local357;
												local2262.anInt7584 = local242 & 0x7;
												local2262.anInt7605 = local359;
												local2262.anInt7629 = 0;
												local2262.anInt7606 = local75;
												local2262.anInt7593 = 1;
												if (local2262.anInt7605 == 65535) {
													local2262.anInt7605 = -1;
												}
												if (local2262.anInt7595 > Static172.anInt3107) {
													local2262.anInt7629 = -1;
												}
												if (local2262.anInt7605 != -1 && Static172.anInt3107 == local2262.anInt7595) {
													local2440 = Static387.aClass201_2.method4775(local2262.anInt7605).anInt1397;
													if (local2440 != -1) {
														local2314 = Static444.aClass59_3.method1552(local2440);
														if (local2314 != null && local2314.anIntArray494 != null) {
															Static192.method3007(local2314, local2262.aByte101, 0, local2262.anInt7560, local2262.anInt7557, local2262 == Static203.aClass1_Sub2_Sub6_Sub2_1);
														}
													}
												}
											} else {
												local2262.anInt7635 = local242 & 0x7;
												local2262.anInt7614 = 1;
												local2262.anInt7596 = local359;
												local2262.anInt7604 = 0;
												local2262.anInt7572 = 0;
												local2262.anInt7590 = Static172.anInt3107 + local357;
												local2262.anInt7631 = local75;
												if (local2262.anInt7596 == 65535) {
													local2262.anInt7596 = -1;
												}
												if (local2262.anInt7590 > Static172.anInt3107) {
													local2262.anInt7572 = -1;
												}
												if (local2262.anInt7596 != -1 && local2262.anInt7590 == Static172.anInt3107) {
													local2440 = Static387.aClass201_2.method4775(local2262.anInt7596).anInt1397;
													if (local2440 != -1) {
														local2314 = Static444.aClass59_3.method1552(local2440);
														if (local2314 != null && local2314.anIntArray494 != null) {
															Static192.method3007(local2314, local2262.aByte101, 0, local2262.anInt7560, local2262.anInt7557, Static203.aClass1_Sub2_Sub6_Sub2_1 == local2262);
														}
													}
												}
											}
										}
									}
								}
							} else {
								local1571 = local210 >> 28 & 0x3;
								local576 = (local210 >> 14 & 0x3FFF) - Static59.anInt1127;
								local1027 = (local210 & 0x3FFF) - Static49.anInt873;
								if (local576 >= 0 && local1027 >= 0 && Static373.anInt6324 > local576 && Static291.anInt5062 > local1027) {
									local2285 = local576 * 128 + 64;
									local2440 = local1027 * 128 + 64;
									local2736 = local1571;
									if (local1571 < 3 && Static24.method2475(local576, local1027)) {
										local2736 = local1571 + 1;
									}
									@Pc(2928) Class1_Sub2_Sub5 local2928 = new Class1_Sub2_Sub5(local359, 0, Static172.anInt3107, local1571, local2736, local2285, Static181.method4212(local1571, local2440, local2285) - local75, local2440, local576, local576, local1027, local1027, local242);
									Static236.aClass193_34.method4527(new Class3_Sub3_Sub1(local2928));
								}
							}
							Static167.aClass136_81 = null;
							return true;
						} else if (Static167.aClass136_81 == Static8.aClass136_1) {
							Static34.method2873(Static176.aClass3_Sub25_Sub1_1.method4073());
							Static167.aClass136_81 = null;
							return true;
						} else if (Static167.aClass136_81 == Static303.aClass136_141) {
							local536 = Static176.aClass3_Sub25_Sub1_1.method4096() == 1;
							local540 = Static176.aClass3_Sub25_Sub1_1.method4073();
							local544 = local540;
							if (local536) {
								local544 = Static176.aClass3_Sub25_Sub1_1.method4073();
							}
							local357 = Static176.aClass3_Sub25_Sub1_1.method4096();
							local359 = Static176.aClass3_Sub25_Sub1_1.method4083();
							local2236 = false;
							if (local357 <= 1 && Static350.method4880(local544)) {
								local2236 = true;
							}
							if (!local2236 && Static119.anInt2103 == 0) {
								local852 = Static141.aClass61_1.method1599(local359).method6111(Static176.aClass3_Sub25_Sub1_1);
								if (local357 == 2) {
									Static114.method1846(local852, null, 25, "<img=1>" + local540, local359, "<img=1>" + local544, 0);
								} else if (local357 == 1) {
									Static114.method1846(local852, null, 25, "<img=0>" + local540, local359, "<img=0>" + local544, 0);
								} else {
									Static114.method1846(local852, null, 25, local540, local359, local544, 0);
								}
							}
							Static167.aClass136_81 = null;
							return true;
						} else if (Static167.aClass136_81 == Static213.aClass136_102) {
							local405 = Static176.aClass3_Sub25_Sub1_1.method4073();
							local540 = Static227.method3265(Static223.method3237(Static176.aClass3_Sub25_Sub1_1));
							Static349.method4875(0, local405, 6, local405, local540);
							Static167.aClass136_81 = null;
							return true;
						} else if (Static167.aClass136_81 == Static244.aClass136_119) {
							local210 = Static176.aClass3_Sub25_Sub1_1.method4083();
							if (Static110.method1810(local210)) {
								Static371.method5204();
							}
							Static167.aClass136_81 = null;
							return true;
						} else if (Static146.aClass136_71 == Static167.aClass136_81) {
							Static119.aClass47_1.method1272();
							Static201.anInt3591 += 32;
							Static167.aClass136_81 = null;
							return true;
						} else if (Static258.aClass136_126 == Static167.aClass136_81) {
							local210 = Static176.aClass3_Sub25_Sub1_1.method4067();
							local75 = Static176.aClass3_Sub25_Sub1_1.method4068();
							local544 = Static176.aClass3_Sub25_Sub1_1.method4073();
							if (Static110.method1810(local210)) {
								Static379.method5267(local75, local544);
							}
							Static167.aClass136_81 = null;
							return true;
						} else if (Static167.aClass136_81 == Static353.aClass136_198) {
							local536 = Static176.aClass3_Sub25_Sub1_1.method4096() == 1;
							local540 = Static176.aClass3_Sub25_Sub1_1.method4073();
							local544 = local540;
							if (local536) {
								local544 = Static176.aClass3_Sub25_Sub1_1.method4073();
							}
							local1012 = Static176.aClass3_Sub25_Sub1_1.method4083();
							local1019 = Static176.aClass3_Sub25_Sub1_1.method4099();
							local576 = Static176.aClass3_Sub25_Sub1_1.method4096();
							@Pc(3217) long local3217 = (local1012 << 32) + local1019;
							@Pc(3219) boolean local3219 = false;
							local2736 = 0;
							while (true) {
								if (local2736 >= 100) {
									if (local576 <= 1) {
										if (Static61.aBoolean81 && !Static177.aBoolean251 || Static401.aBoolean449) {
											local3219 = true;
										} else if (Static350.method4880(local544)) {
											local3219 = true;
										}
									}
									break;
								}
								if (Static50.aLongArray1[local2736] == local3217) {
									local3219 = true;
									break;
								}
								local2736++;
							}
							if (!local3219 && Static119.anInt2103 == 0) {
								Static50.aLongArray1[Static74.anInt1341] = local3217;
								Static74.anInt1341 = (Static74.anInt1341 + 1) % 100;
								@Pc(3282) String local3282 = Static227.method3265(Static223.method3237(Static176.aClass3_Sub25_Sub1_1));
								if (local576 == 2) {
									Static114.method1846(local3282, null, 7, "<img=1>" + local540, -1, "<img=1>" + local544, 0);
								} else if (local576 == 1) {
									Static114.method1846(local3282, null, 7, "<img=0>" + local540, -1, "<img=0>" + local544, 0);
								} else {
									Static114.method1846(local3282, null, 3, local540, -1, local544, 0);
								}
							}
							Static167.aClass136_81 = null;
							return true;
						} else if (Static130.aClass136_63 == Static167.aClass136_81) {
							Static356.method5852(Static364.aClass183_17);
							Static167.aClass136_81 = null;
							return true;
						} else if (Static216.aClass136_103 == Static167.aClass136_81) {
							Static119.anInt2106 = Static176.aClass3_Sub25_Sub1_1.method4097() << 3;
							Static343.anInt5784 = Static176.aClass3_Sub25_Sub1_1.method4097() << 3;
							Static200.anInt3579 = Static176.aClass3_Sub25_Sub1_1.method4095();
							while (Static102.anInt1839 > Static176.aClass3_Sub25_Sub1_1.anInt4974) {
								@Pc(3389) Class183 local3389 = Static103.method1719()[Static176.aClass3_Sub25_Sub1_1.method4096()];
								Static356.method5852(local3389);
							}
							Static167.aClass136_81 = null;
							return true;
						} else if (Static167.aClass136_81 == Static406.aClass136_185) {
							local210 = Static176.aClass3_Sub25_Sub1_1.method4067();
							if (local210 == 65535) {
								local210 = -1;
							}
							local75 = Static176.aClass3_Sub25_Sub1_1.method4109();
							local242 = Static176.aClass3_Sub25_Sub1_1.method4108();
							if (Static110.method1810(local75)) {
								Static79.method1436(local210, local242);
							}
							Static167.aClass136_81 = null;
							return true;
						} else {
							@Pc(3461) boolean local3461;
							if (Static74.aClass136_38 == Static167.aClass136_81) {
								local210 = Static176.aClass3_Sub25_Sub1_1.method4083();
								local75 = Static176.aClass3_Sub25_Sub1_1.method4095();
								local3461 = (local75 & 0x1) == 1;
								Static455.method6216(local3461, local210);
								Static247.anIntArray417[Static433.anInt7251++ & 0x1F] = local210;
								Static167.aClass136_81 = null;
								return true;
							} else if (Static167.aClass136_81 == Static165.aClass136_60) {
								Static339.anInt5690 = Static176.aClass3_Sub25_Sub1_1.method4096();
								Static118.anInt2076 = Static176.aClass3_Sub25_Sub1_1.method4066();
								Static167.aClass136_81 = null;
								return true;
							} else if (Static167.aClass136_81 == Static205.aClass136_165) {
								local210 = Static176.aClass3_Sub25_Sub1_1.method4068();
								local75 = Static176.aClass3_Sub25_Sub1_1.method4100();
								local242 = Static176.aClass3_Sub25_Sub1_1.method4083();
								local357 = Static176.aClass3_Sub25_Sub1_1.method4083();
								if (Static110.method1810(local242)) {
									Static306.method4342(local75, 5, local357, local210);
								}
								Static167.aClass136_81 = null;
								return true;
							} else if (Static149.aClass136_72 == Static167.aClass136_81) {
								local210 = Static176.aClass3_Sub25_Sub1_1.method4108();
								local75 = local210 >> 28 & 0x3;
								local242 = local210 >> 14 & 0x3FFF;
								local357 = local210 & 0x3FFF;
								local359 = Static176.aClass3_Sub25_Sub1_1.method4095();
								local494 = local359 >> 2;
								local1571 = local359 & 0x3;
								local576 = Static289.anIntArray310[local494];
								local1027 = Static176.aClass3_Sub25_Sub1_1.method4088();
								if (local1027 == 65535) {
									local1027 = -1;
								}
								local242 -= Static59.anInt1127;
								local357 -= Static49.anInt873;
								Static47.method888(local576, local357, local242, local75, local494, local1027, local1571);
								Static167.aClass136_81 = null;
								return true;
							} else if (Static167.aClass136_81 == Static167.aClass136_80) {
								Static439.anInt7311 = Static176.aClass3_Sub25_Sub1_1.method4096();
								Static167.aClass136_81 = null;
								return true;
							} else if (Static167.aClass136_81 == Static341.aClass136_158) {
								Static356.method5852(Static181.aClass183_13);
								Static167.aClass136_81 = null;
								return true;
							} else if (Static167.aClass136_81 == Static350.aClass136_164) {
								local210 = Static176.aClass3_Sub25_Sub1_1.method4083();
								local540 = Static176.aClass3_Sub25_Sub1_1.method4073();
								local242 = Static176.aClass3_Sub25_Sub1_1.method4088();
								if (Static110.method1810(local242)) {
									Static174.method2780(local540, local210);
								}
								Static167.aClass136_81 = null;
								return true;
							} else if (Static100.aClass136_50 == Static167.aClass136_81) {
								Static356.method5852(Static350.aClass183_14);
								Static167.aClass136_81 = null;
								return true;
							} else if (Static167.aClass136_81 == Static162.aClass136_79) {
								local210 = Static176.aClass3_Sub25_Sub1_1.method4100();
								local75 = Static176.aClass3_Sub25_Sub1_1.method4067();
								local242 = Static176.aClass3_Sub25_Sub1_1.method4109();
								if (Static110.method1810(local242)) {
									Static187.method2929(local75, local210);
								}
								Static167.aClass136_81 = null;
								return true;
							} else {
								@Pc(3731) long local3731;
								if (Static197.aClass136_97 == Static167.aClass136_81) {
									local536 = Static176.aClass3_Sub25_Sub1_1.method4096() == 1;
									local540 = Static176.aClass3_Sub25_Sub1_1.method4073();
									local544 = local540;
									if (local536) {
										local544 = Static176.aClass3_Sub25_Sub1_1.method4073();
									}
									local1012 = Static176.aClass3_Sub25_Sub1_1.method4087();
									local1019 = Static176.aClass3_Sub25_Sub1_1.method4083();
									local3731 = Static176.aClass3_Sub25_Sub1_1.method4099();
									local2285 = Static176.aClass3_Sub25_Sub1_1.method4096();
									@Pc(3742) long local3742 = (local1019 << 32) + local3731;
									@Pc(3744) boolean local3744 = false;
									local2664 = 0;
									while (true) {
										if (local2664 >= 100) {
											if (local2285 <= 1) {
												if (Static61.aBoolean81 && !Static177.aBoolean251 || Static401.aBoolean449) {
													local3744 = true;
												} else if (Static350.method4880(local544)) {
													local3744 = true;
												}
											}
											break;
										}
										if (Static50.aLongArray1[local2664] == local3742) {
											local3744 = true;
											break;
										}
										local2664++;
									}
									if (!local3744 && Static119.anInt2103 == 0) {
										Static50.aLongArray1[Static74.anInt1341] = local3742;
										Static74.anInt1341 = (Static74.anInt1341 + 1) % 100;
										@Pc(3811) String local3811 = Static227.method3265(Static223.method3237(Static176.aClass3_Sub25_Sub1_1));
										if (local2285 == 2 || local2285 == 3) {
											Static114.method1846(local3811, Static281.method3884(local1012), 9, "<img=1>" + local540, -1, "<img=1>" + local544, 0);
										} else if (local2285 == 1) {
											Static114.method1846(local3811, Static281.method3884(local1012), 9, "<img=0>" + local540, -1, "<img=0>" + local544, 0);
										} else {
											Static114.method1846(local3811, Static281.method3884(local1012), 9, local540, -1, local544, 0);
										}
									}
									Static167.aClass136_81 = null;
									return true;
								} else if (Static406.aClass136_186 == Static167.aClass136_81) {
									Static356.method5852(Static359.aClass183_16);
									Static167.aClass136_81 = null;
									return true;
								} else if (Static350.aClass136_163 == Static167.aClass136_81) {
									Static356.method5852(Static379.aClass183_19);
									Static167.aClass136_81 = null;
									return true;
								} else if (Static378.aClass136_174 == Static167.aClass136_81) {
									local405 = Static176.aClass3_Sub25_Sub1_1.method4073();
									local75 = Static176.aClass3_Sub25_Sub1_1.method4083();
									local544 = Static141.aClass61_1.method1599(local75).method6111(Static176.aClass3_Sub25_Sub1_1);
									Static114.method1846(local544, null, 19, local405, local75, local405, 0);
									Static167.aClass136_81 = null;
									return true;
								} else if (Static167.aClass136_81 == Static240.aClass136_173) {
									local536 = Static176.aClass3_Sub25_Sub1_1.method4096() == 1;
									@Pc(3968) byte[] local3968 = new byte[Static102.anInt1839 - 1];
									Static176.aClass3_Sub25_Sub1_1.method4118(local3968, Static102.anInt1839 - 1);
									Static233.method3409(local536, local3968);
									Static167.aClass136_81 = null;
									return true;
								} else if (Static167.aClass136_81 == Static84.aClass136_168) {
									local210 = Static176.aClass3_Sub25_Sub1_1.method4083();
									local75 = Static176.aClass3_Sub25_Sub1_1.method4096();
									local3461 = (local75 & 0x1) == 1;
									Static256.method3581(local3461, local210);
									local357 = Static176.aClass3_Sub25_Sub1_1.method4083();
									for (local359 = 0; local359 < local357; local359++) {
										local494 = Static176.aClass3_Sub25_Sub1_1.method4066();
										if (local494 == 255) {
											local494 = Static176.aClass3_Sub25_Sub1_1.method4100();
										}
										local1571 = Static176.aClass3_Sub25_Sub1_1.method4109();
										Static340.method4763(local1571 - 1, local494, local359, local210, local3461);
									}
									Static247.anIntArray417[Static433.anInt7251++ & 0x1F] = local210;
									Static167.aClass136_81 = null;
									return true;
								} else if (Static189.aClass136_92 == Static167.aClass136_81) {
									local536 = Static176.aClass3_Sub25_Sub1_1.method4096() == 1;
									local540 = Static176.aClass3_Sub25_Sub1_1.method4073();
									local544 = local540;
									if (local536) {
										local544 = Static176.aClass3_Sub25_Sub1_1.method4073();
									}
									local1012 = Static176.aClass3_Sub25_Sub1_1.method4087();
									local1019 = Static176.aClass3_Sub25_Sub1_1.method4083();
									local3731 = Static176.aClass3_Sub25_Sub1_1.method4099();
									local2285 = Static176.aClass3_Sub25_Sub1_1.method4096();
									local2440 = Static176.aClass3_Sub25_Sub1_1.method4083();
									@Pc(4122) long local4122 = local3731 + (local1019 << 32);
									@Pc(4124) boolean local4124 = false;
									@Pc(4126) int local4126 = 0;
									while (true) {
										if (local4126 >= 100) {
											if (local2285 <= 1 && Static350.method4880(local544)) {
												local4124 = true;
											}
											break;
										}
										if (local4122 == Static50.aLongArray1[local4126]) {
											local4124 = true;
											break;
										}
										local4126++;
									}
									if (!local4124 && Static119.anInt2103 == 0) {
										Static50.aLongArray1[Static74.anInt1341] = local4122;
										Static74.anInt1341 = (Static74.anInt1341 + 1) % 100;
										@Pc(4181) String local4181 = Static141.aClass61_1.method1599(local2440).method6111(Static176.aClass3_Sub25_Sub1_1);
										if (local2285 == 2) {
											Static114.method1846(local4181, Static281.method3884(local1012), 20, "<img=1>" + local540, local2440, "<img=1>" + local544, 0);
										} else if (local2285 == 1) {
											Static114.method1846(local4181, Static281.method3884(local1012), 20, "<img=0>" + local540, local2440, "<img=0>" + local544, 0);
										} else {
											Static114.method1846(local4181, Static281.method3884(local1012), 20, local540, local2440, local544, 0);
										}
									}
									Static167.aClass136_81 = null;
									return true;
								} else if (Static398.aClass136_181 == Static167.aClass136_81) {
									Static356.method5852(Static84.aClass183_15);
									Static167.aClass136_81 = null;
									return true;
								} else if (Static167.aClass136_81 == Static310.aClass136_144) {
									local210 = Static176.aClass3_Sub25_Sub1_1.method4086();
									local75 = Static176.aClass3_Sub25_Sub1_1.method4108();
									local242 = Static176.aClass3_Sub25_Sub1_1.method4096();
									local1514 = "";
									local816 = local1514;
									if ((local242 & 0x1) != 0) {
										local1514 = Static176.aClass3_Sub25_Sub1_1.method4073();
										if ((local242 & 0x2) == 0) {
											local816 = local1514;
										} else {
											local816 = Static176.aClass3_Sub25_Sub1_1.method4073();
										}
									}
									local554 = Static176.aClass3_Sub25_Sub1_1.method4073();
									if (local210 == 99) {
										Static61.method1151(local554);
									} else if (local816.equals("") || !Static350.method4880(local816)) {
										Static349.method4875(local75, local1514, local210, local816, local554);
									} else {
										Static167.aClass136_81 = null;
										return true;
									}
									Static167.aClass136_81 = null;
									return true;
								} else if (Static167.aClass136_81 == Static225.aClass136_105) {
									Static356.method5852(Static372.aClass183_18);
									Static167.aClass136_81 = null;
									return true;
								} else if (Static390.aClass136_178 == Static167.aClass136_81) {
									Static225.aString47 = Static102.anInt1839 > 2 ? Static176.aClass3_Sub25_Sub1_1.method4073() : Static310.aClass174_151.method4208(Static300.anInt5192);
									Static413.anInt6976 = Static102.anInt1839 > 0 ? Static176.aClass3_Sub25_Sub1_1.method4083() : -1;
									Static167.aClass136_81 = null;
									if (Static413.anInt6976 == 65535) {
										Static413.anInt6976 = -1;
									}
									return true;
								} else if (Static167.aClass136_81 == Static237.aClass136_116) {
									Static79.anInt1430 = Static176.aClass3_Sub25_Sub1_1.method4096();
									for (local210 = 0; local210 < Static79.anInt1430; local210++) {
										Static47.aStringArray7[local210] = Static176.aClass3_Sub25_Sub1_1.method4073();
										Static331.aStringArray45[local210] = Static176.aClass3_Sub25_Sub1_1.method4073();
										if (Static331.aStringArray45[local210].equals("")) {
											Static331.aStringArray45[local210] = Static47.aStringArray7[local210];
										}
										Static334.aStringArray34[local210] = Static176.aClass3_Sub25_Sub1_1.method4073();
										Static141.aStringArray14[local210] = Static176.aClass3_Sub25_Sub1_1.method4073();
										if (Static141.aStringArray14[local210].equals("")) {
											Static141.aStringArray14[local210] = Static334.aStringArray34[local210];
										}
										Static173.aBooleanArray16[local210] = false;
									}
									Static167.aClass136_81 = null;
									Static414.anInt7474 = Static125.anInt2284;
									return true;
								} else if (Static256.aClass136_124 == Static167.aClass136_81) {
									local210 = Static176.aClass3_Sub25_Sub1_1.method4083();
									local75 = Static176.aClass3_Sub25_Sub1_1.method4108();
									if (Static110.method1810(local210)) {
										@Pc(4488) Class3_Sub10 local4488 = (Class3_Sub10) Static32.aClass140_5.method3490((long) local75);
										if (local4488 != null) {
											Static87.method1538(local4488, false, true);
										}
										if (Static444.aClass82_23 != null) {
											Static463.method6297(Static444.aClass82_23);
											Static444.aClass82_23 = null;
										}
									}
									Static167.aClass136_81 = null;
									return true;
								} else if (Static250.aClass136_123 == Static167.aClass136_81) {
									Static168.method2583(false);
									Static167.aClass136_81 = null;
									return false;
								} else if (Static67.aClass136_35 == Static167.aClass136_81) {
									local210 = Static176.aClass3_Sub25_Sub1_1.method4083();
									if (local210 == 65535) {
										local210 = -1;
									}
									local75 = Static176.aClass3_Sub25_Sub1_1.method4096();
									local242 = Static176.aClass3_Sub25_Sub1_1.method4083();
									local357 = Static176.aClass3_Sub25_Sub1_1.method4096();
									Static254.method4736(local210, local242, local357, local75);
									Static167.aClass136_81 = null;
									return true;
								} else if (Static104.aClass136_51 == Static167.aClass136_81) {
									Static440.method5937(Static176.aClass3_Sub25_Sub1_1, Static102.anInt1839);
									Static167.aClass136_81 = null;
									return true;
								} else if (Static262.aClass136_127 == Static167.aClass136_81) {
									local210 = Static176.aClass3_Sub25_Sub1_1.method4088();
									local75 = Static176.aClass3_Sub25_Sub1_1.method4108();
									local242 = Static176.aClass3_Sub25_Sub1_1.method4088();
									if (Static110.method1810(local242)) {
										Static83.method1501(local210, local75);
									}
									Static167.aClass136_81 = null;
									return true;
								} else if (Static167.aClass136_81 == Static94.aClass136_45) {
									local210 = Static176.aClass3_Sub25_Sub1_1.method4117();
									local75 = Static176.aClass3_Sub25_Sub1_1.method4083();
									if (Static110.method1810(local75)) {
										Static306.method4342(-1, 3, -1, local210);
									}
									Static167.aClass136_81 = null;
									return true;
								} else if (Static167.aClass136_81 == Static57.aClass136_24) {
									Static356.method5852(Static217.aClass183_7);
									Static167.aClass136_81 = null;
									return true;
								} else if (Static167.aClass136_81 == Static54.aClass136_20) {
									Static50.method931(false);
									Static167.aClass136_81 = null;
									return true;
								} else if (Static181.aClass136_135 == Static167.aClass136_81) {
									local210 = Static176.aClass3_Sub25_Sub1_1.method4083();
									if (local210 == 65535) {
										local210 = -1;
									}
									local75 = Static176.aClass3_Sub25_Sub1_1.method4096();
									local242 = Static176.aClass3_Sub25_Sub1_1.method4083();
									local357 = Static176.aClass3_Sub25_Sub1_1.method4096();
									Static462.method6277(local357, local242, local75, local210);
									Static167.aClass136_81 = null;
									return true;
								} else if (Static167.aClass136_81 == Static246.aClass136_121) {
									Static50.method931(true);
									Static167.aClass136_81 = null;
									return true;
								} else if (Static167.aClass136_81 == Static289.aClass136_130) {
									local210 = Static176.aClass3_Sub25_Sub1_1.method4095();
									local75 = Static176.aClass3_Sub25_Sub1_1.method4067();
									if (local75 == 65535) {
										local75 = -1;
									}
									local242 = Static176.aClass3_Sub25_Sub1_1.method4095();
									Static218.method6133(local242, local210, local75);
									Static167.aClass136_81 = null;
									return true;
								} else if (Static346.aClass136_160 == Static167.aClass136_81) {
									local210 = Static176.aClass3_Sub25_Sub1_1.method4067();
									if (local210 == 65535) {
										local210 = -1;
									}
									local75 = Static176.aClass3_Sub25_Sub1_1.method4096();
									local242 = Static176.aClass3_Sub25_Sub1_1.method4085();
									Static261.method3617(local242, local75, local210);
									Static167.aClass136_81 = null;
									return true;
								} else if (Static167.aClass136_81 == Static229.aClass136_107) {
									local210 = Static176.aClass3_Sub25_Sub1_1.method4109();
									local75 = Static176.aClass3_Sub25_Sub1_1.method4067();
									local242 = Static176.aClass3_Sub25_Sub1_1.method4096();
									@Pc(4779) Class3_Sub40 local4779 = (Class3_Sub40) Static63.aClass140_37.method3490((long) local75);
									if (local4779 != null) {
										Static306.method4345(local4779.aClass1_Sub2_Sub6_Sub1_2, local242, local210);
									}
									Static167.aClass136_81 = null;
									return true;
								} else if (Static218.aClass136_200 == Static167.aClass136_81) {
									local536 = Static176.aClass3_Sub25_Sub1_1.method4096() == 1;
									local540 = Static176.aClass3_Sub25_Sub1_1.method4073();
									local544 = local540;
									if (local536) {
										local544 = Static176.aClass3_Sub25_Sub1_1.method4073();
									}
									local357 = Static176.aClass3_Sub25_Sub1_1.method4096();
									@Pc(4823) boolean local4823 = false;
									if (local357 <= 1) {
										if (Static61.aBoolean81 && !Static177.aBoolean251 || Static401.aBoolean449) {
											local4823 = true;
										} else if (local357 <= 1 && Static350.method4880(local544)) {
											local4823 = true;
										}
									}
									if (!local4823 && Static119.anInt2103 == 0) {
										local554 = Static227.method3265(Static223.method3237(Static176.aClass3_Sub25_Sub1_1));
										if (local357 == 2) {
											Static114.method1846(local554, null, 24, "<img=1>" + local540, -1, "<img=1>" + local544, 0);
										} else if (local357 == 1) {
											Static114.method1846(local554, null, 24, "<img=0>" + local540, -1, "<img=0>" + local544, 0);
										} else {
											Static114.method1846(local554, null, 24, local540, -1, local544, 0);
										}
									}
									Static167.aClass136_81 = null;
									return true;
								} else if (Static167.aClass136_81 == Static150.aClass136_73) {
									Static356.method5852(Static441.aClass183_21);
									Static167.aClass136_81 = null;
									return true;
								} else if (Static167.aClass136_81 == Static191.aClass136_94) {
									local210 = Static176.aClass3_Sub25_Sub1_1.method4088();
									local75 = Static176.aClass3_Sub25_Sub1_1.method4083();
									local242 = Static176.aClass3_Sub25_Sub1_1.method4067();
									if (local242 == 65535) {
										local242 = -1;
									}
									local357 = Static176.aClass3_Sub25_Sub1_1.method4083();
									if (local357 == 65535) {
										local357 = -1;
									}
									local359 = Static176.aClass3_Sub25_Sub1_1.method4100();
									if (Static110.method1810(local210)) {
										for (local494 = local357; local494 <= local242; local494++) {
											local1432 = (long) local494 + ((long) local359 << 32);
											local1438 = (Class3_Sub42) Static228.aClass140_25.method3490(local1432);
											if (local1438 != null) {
												local1449 = new Class3_Sub42(local1438.anInt6593, local75);
												local1438.method6288();
											} else if (local494 == -1) {
												local1449 = new Class3_Sub42(Static180.method2857(local359).aClass3_Sub42_2.anInt6593, local75);
											} else {
												local1449 = new Class3_Sub42(0, local75);
											}
											Static228.aClass140_25.method3494(local1432, local1449);
										}
									}
									Static167.aClass136_81 = null;
									return true;
								} else if (Static135.aClass136_66 == Static167.aClass136_81) {
									local210 = Static176.aClass3_Sub25_Sub1_1.method4096();
									if (Static176.aClass3_Sub25_Sub1_1.method4096() == 0) {
										Static295.aClass161Array1[local210] = new Class161();
									} else {
										Static176.aClass3_Sub25_Sub1_1.anInt4974--;
										Static295.aClass161Array1[local210] = new Class161(Static176.aClass3_Sub25_Sub1_1);
									}
									Static324.anInt5429 = Static125.anInt2284;
									Static167.aClass136_81 = null;
									return true;
								} else if (Static167.aClass136_81 == Static210.aClass136_101) {
									local210 = Static176.aClass3_Sub25_Sub1_1.method4083();
									local75 = Static176.aClass3_Sub25_Sub1_1.method4100();
									local242 = Static176.aClass3_Sub25_Sub1_1.method4109();
									if (local242 == 65535) {
										local242 = -1;
									}
									if (Static110.method1810(local210)) {
										Static306.method4342(-1, 1, local242, local75);
									}
									Static167.aClass136_81 = null;
									return true;
								} else if (Static33.aClass136_15 == Static167.aClass136_81) {
									local210 = Static176.aClass3_Sub25_Sub1_1.method4067();
									if (local210 == 65535) {
										local210 = -1;
									}
									local75 = Static176.aClass3_Sub25_Sub1_1.method4117();
									local242 = Static176.aClass3_Sub25_Sub1_1.method4088();
									if (Static110.method1810(local242)) {
										Static306.method4342(-1, 2, local210, local75);
									}
									Static167.aClass136_81 = null;
									return true;
								} else if (Static167.aClass136_81 == Static327.aClass136_151) {
									Static461.method6268();
									Static167.aClass136_81 = null;
									return false;
								} else if (Static167.aClass136_81 == Static177.aClass136_88) {
									local210 = Static176.aClass3_Sub25_Sub1_1.method4109();
									local75 = Static176.aClass3_Sub25_Sub1_1.method4095();
									Static119.aClass47_1.method1274(local75, local210);
									Static167.aClass136_81 = null;
									return true;
								} else if (Static13.aClass136_7 == Static167.aClass136_81) {
									Static356.method5852(Static10.aClass183_1);
									Static167.aClass136_81 = null;
									return true;
								} else if (Static309.aClass136_143 == Static167.aClass136_81) {
									Static356.method5852(Static386.aClass183_20);
									Static167.aClass136_81 = null;
									return true;
								} else if (Static54.aClass136_21 == Static167.aClass136_81) {
									Static413.anInt6972 = Static176.aClass3_Sub25_Sub1_1.method4065();
									Static457.anInt7712 = Static125.anInt2284;
									Static167.aClass136_81 = null;
									return true;
								} else if (Static288.aClass136_134 == Static167.aClass136_81) {
									local210 = Static176.aClass3_Sub25_Sub1_1.method4117();
									local75 = Static176.aClass3_Sub25_Sub1_1.method4067();
									Static119.aClass47_1.method1274(local210, local75);
									Static167.aClass136_81 = null;
									return true;
								} else if (Static167.aClass136_81 == Static97.aClass136_49) {
									local210 = Static176.aClass3_Sub25_Sub1_1.method4083();
									local75 = Static176.aClass3_Sub25_Sub1_1.method4083();
									local242 = Static176.aClass3_Sub25_Sub1_1.method4088();
									local357 = Static176.aClass3_Sub25_Sub1_1.method4117();
									local359 = Static176.aClass3_Sub25_Sub1_1.method4088();
									if (Static110.method1810(local75)) {
										Static193.method3013(local210, local359, local242, local357);
									}
									Static167.aClass136_81 = null;
									return true;
								} else if (Static167.aClass136_81 == Static60.aClass136_26) {
									Static110.anInt1958 = Static176.aClass3_Sub25_Sub1_1.method4103();
									Static61.aBoolean81 = Static176.aClass3_Sub25_Sub1_1.method4096() == 1;
									Static167.aClass136_81 = null;
									return true;
								} else {
									@Pc(5434) Class54 local5434;
									if (Static167.aClass136_81 == Static171.aClass136_83) {
										local405 = Static176.aClass3_Sub25_Sub1_1.method4073();
										local3461 = Static176.aClass3_Sub25_Sub1_1.method4096() == 1;
										if (local3461) {
											local540 = Static176.aClass3_Sub25_Sub1_1.method4073();
										} else {
											local540 = local405;
										}
										local357 = Static176.aClass3_Sub25_Sub1_1.method4083();
										@Pc(5346) byte local5346 = Static176.aClass3_Sub25_Sub1_1.method4097();
										local2236 = false;
										if (local5346 == -128) {
											local2236 = true;
										}
										if (local2236) {
											if (Static413.anInt6975 == 0) {
												Static167.aClass136_81 = null;
												return true;
											}
											for (local1571 = 0; local1571 < Static413.anInt6975 && (!Static169.aClass54Array131[local1571].aString26.equals(local540) || local357 != Static169.aClass54Array131[local1571].anInt1438); local1571++) {
											}
											if (local1571 < Static413.anInt6975) {
												while (local1571 < Static413.anInt6975 - 1) {
													Static169.aClass54Array131[local1571] = Static169.aClass54Array131[local1571 + 1];
													local1571++;
												}
												Static413.anInt6975--;
												Static169.aClass54Array131[Static413.anInt6975] = null;
											}
										} else {
											local852 = Static176.aClass3_Sub25_Sub1_1.method4073();
											local5434 = new Class54();
											local5434.aString26 = local540;
											local5434.aString23 = local405;
											local5434.aString24 = Static30.method547(local5434.aString26);
											local5434.aByte13 = local5346;
											local5434.aString25 = local852;
											local5434.anInt1438 = local357;
											for (local1027 = Static413.anInt6975 - 1; local1027 >= 0; local1027--) {
												local2285 = Static169.aClass54Array131[local1027].aString24.compareTo(local5434.aString24);
												if (local2285 == 0) {
													Static169.aClass54Array131[local1027].anInt1438 = local357;
													Static169.aClass54Array131[local1027].aByte13 = local5346;
													Static169.aClass54Array131[local1027].aString25 = local852;
													if (local540.equals(Static203.aClass1_Sub2_Sub6_Sub2_1.aString69)) {
														Static429.aByte99 = local5346;
													}
													Static167.aClass136_81 = null;
													Static390.anInt6539 = Static125.anInt2284;
													return true;
												}
												if (local2285 < 0) {
													break;
												}
											}
											if (Static169.aClass54Array131.length <= Static413.anInt6975) {
												Static167.aClass136_81 = null;
												return true;
											}
											for (local2285 = Static413.anInt6975 - 1; local2285 > local1027; local2285--) {
												Static169.aClass54Array131[local2285 + 1] = Static169.aClass54Array131[local2285];
											}
											if (Static413.anInt6975 == 0) {
												Static169.aClass54Array131 = new Class54[100];
											}
											Static169.aClass54Array131[local1027 + 1] = local5434;
											Static413.anInt6975++;
											if (local540.equals(Static203.aClass1_Sub2_Sub6_Sub2_1.aString69)) {
												Static429.aByte99 = local5346;
											}
										}
										Static390.anInt6539 = Static125.anInt2284;
										Static167.aClass136_81 = null;
										return true;
									} else if (Static315.aClass136_145 == Static167.aClass136_81) {
										local210 = Static176.aClass3_Sub25_Sub1_1.method4067();
										local75 = Static176.aClass3_Sub25_Sub1_1.method4100();
										local242 = Static176.aClass3_Sub25_Sub1_1.method4083();
										local357 = Static176.aClass3_Sub25_Sub1_1.method4088();
										local359 = Static176.aClass3_Sub25_Sub1_1.method4088();
										if (Static110.method1810(local357)) {
											Static306.method4342(local242, 7, local210 | local359 << 16, local75);
										}
										Static167.aClass136_81 = null;
										return true;
									} else if (Static337.aClass136_156 == Static167.aClass136_81) {
										Static356.method5852(Static145.aClass183_10);
										Static167.aClass136_81 = null;
										return true;
									} else if (Static379.aClass136_175 == Static167.aClass136_81) {
										Static168.method2583(Static187.aBoolean258);
										Static167.aClass136_81 = null;
										return false;
									} else if (Static307.aClass136_154 == Static167.aClass136_81) {
										Static69.anInt1288 = Static176.aClass3_Sub25_Sub1_1.method4096();
										Static457.anInt7712 = Static125.anInt2284;
										Static167.aClass136_81 = null;
										return true;
									} else if (Static167.aClass136_81 == Static15.aClass136_9) {
										local210 = Static176.aClass3_Sub25_Sub1_1.method4066();
										local75 = Static176.aClass3_Sub25_Sub1_1.method4088();
										if (Static110.method1810(local75)) {
											Static342.anInt5741 = local210;
										}
										Static167.aClass136_81 = null;
										return true;
									} else if (Static167.aClass136_81 == Static399.aClass136_78) {
										local210 = Static176.aClass3_Sub25_Sub1_1.method4068();
										local75 = Static176.aClass3_Sub25_Sub1_1.method4096();
										local242 = Static176.aClass3_Sub25_Sub1_1.method4109();
										if (Static110.method1810(local242)) {
											Static132.method2043(local210, local75);
										}
										Static167.aClass136_81 = null;
										return true;
									} else if (Static167.aClass136_81 == Static200.aClass136_98) {
										local210 = Static176.aClass3_Sub25_Sub1_1.method4083();
										local75 = Static176.aClass3_Sub25_Sub1_1.method4096();
										local242 = Static176.aClass3_Sub25_Sub1_1.method4096();
										local357 = Static176.aClass3_Sub25_Sub1_1.method4096();
										local359 = Static176.aClass3_Sub25_Sub1_1.method4096();
										local494 = Static176.aClass3_Sub25_Sub1_1.method4083();
										if (Static110.method1810(local210)) {
											Static408.aBooleanArray26[local75] = true;
											Static392.anIntArray403[local75] = local242;
											Static342.anIntArray353[local75] = local357;
											Static197.anIntArray223[local75] = local359;
											Static179.anIntArray196[local75] = local494;
										}
										Static167.aClass136_81 = null;
										return true;
									} else if (Static167.aClass136_81 == Static27.aClass136_11) {
										local210 = Static176.aClass3_Sub25_Sub1_1.method4083();
										local75 = Static176.aClass3_Sub25_Sub1_1.method4096();
										local3461 = (local75 & 0x1) == 1;
										while (Static102.anInt1839 > Static176.aClass3_Sub25_Sub1_1.anInt4974) {
											local357 = Static176.aClass3_Sub25_Sub1_1.method4086();
											local359 = Static176.aClass3_Sub25_Sub1_1.method4083();
											local494 = 0;
											if (local359 != 0) {
												local494 = Static176.aClass3_Sub25_Sub1_1.method4096();
												if (local494 == 255) {
													local494 = Static176.aClass3_Sub25_Sub1_1.method4108();
												}
											}
											Static340.method4763(local359 - 1, local494, local357, local210, local3461);
										}
										Static247.anIntArray417[Static433.anInt7251++ & 0x1F] = local210;
										Static167.aClass136_81 = null;
										return true;
									} else if (Static322.aClass136_147 == Static167.aClass136_81) {
										Static356.method5852(Static149.aClass183_11);
										Static167.aClass136_81 = null;
										return true;
									} else if (Static135.aClass136_65 == Static167.aClass136_81) {
										Static390.anInt6539 = Static125.anInt2284;
										if (Static102.anInt1839 == 0) {
											Static169.aClass54Array131 = null;
											Static413.anInt6975 = 0;
											Static53.aString8 = null;
											Static167.aClass136_81 = null;
											Static207.aString45 = null;
											return true;
										}
										Static207.aString45 = Static176.aClass3_Sub25_Sub1_1.method4073();
										local536 = Static176.aClass3_Sub25_Sub1_1.method4096() == 1;
										if (local536) {
											Static176.aClass3_Sub25_Sub1_1.method4073();
										}
										@Pc(5889) long local5889 = Static176.aClass3_Sub25_Sub1_1.method4087();
										Static53.aString8 = Static56.method1103(local5889);
										Static204.aByte64 = Static176.aClass3_Sub25_Sub1_1.method4097();
										local357 = Static176.aClass3_Sub25_Sub1_1.method4096();
										if (local357 == 255) {
											Static167.aClass136_81 = null;
											return true;
										}
										Static413.anInt6975 = local357;
										@Pc(5913) Class54[] local5913 = new Class54[100];
										for (local494 = 0; local494 < Static413.anInt6975; local494++) {
											local5913[local494] = new Class54();
											local5913[local494].aString23 = Static176.aClass3_Sub25_Sub1_1.method4073();
											local536 = Static176.aClass3_Sub25_Sub1_1.method4096() == 1;
											if (local536) {
												local5913[local494].aString26 = Static176.aClass3_Sub25_Sub1_1.method4073();
											} else {
												local5913[local494].aString26 = local5913[local494].aString23;
											}
											local5913[local494].aString24 = Static30.method547(local5913[local494].aString26);
											local5913[local494].anInt1438 = Static176.aClass3_Sub25_Sub1_1.method4083();
											local5913[local494].aByte13 = Static176.aClass3_Sub25_Sub1_1.method4097();
											local5913[local494].aString25 = Static176.aClass3_Sub25_Sub1_1.method4073();
											if (local5913[local494].aString26.equals(Static203.aClass1_Sub2_Sub6_Sub2_1.aString69)) {
												Static429.aByte99 = local5913[local494].aByte13;
											}
										}
										local1027 = Static413.anInt6975;
										while (local1027 > 0) {
											local556 = true;
											local1027--;
											for (local2285 = 0; local2285 < local1027; local2285++) {
												if (local5913[local2285].aString24.compareTo(local5913[local2285 + 1].aString24) > 0) {
													local5434 = local5913[local2285];
													local5913[local2285] = local5913[local2285 + 1];
													local556 = false;
													local5913[local2285 + 1] = local5434;
												}
											}
											if (local556) {
												break;
											}
										}
										Static167.aClass136_81 = null;
										Static169.aClass54Array131 = local5913;
										return true;
									} else if (Static392.aClass136_179 == Static167.aClass136_81) {
										if (Static52.aFrame1 != null) {
											Static435.method5879(-1, Static39.aClass79_Sub1_1.anInt2150, -1, false);
										}
										@Pc(6093) byte[] local6093 = new byte[Static102.anInt1839];
										Static176.aClass3_Sub25_Sub1_1.method2778(Static102.anInt1839, local6093);
										local540 = Static300.method4282(local6093, 0, Static102.anInt1839);
										Static166.method2553(Static402.anInt6656 == 1, Static32.aClass51_1, local540, true);
										Static167.aClass136_81 = null;
										return true;
									} else if (Static171.aClass136_84 == Static167.aClass136_81) {
										local210 = Static176.aClass3_Sub25_Sub1_1.method4108();
										Static232.aClass181_5 = Static32.aClass51_1.method1382(local210);
										Static167.aClass136_81 = null;
										return true;
									} else if (Static167.aClass136_81 == Static66.aClass136_32) {
										Static228.method3282(Static32.aClass51_1, Static102.anInt1839, Static176.aClass3_Sub25_Sub1_1);
										Static167.aClass136_81 = null;
										return true;
									} else if (Static233.aClass136_114 == Static167.aClass136_81) {
										if (Static343.anInt5785 != -1) {
											Static407.method5564(Static343.anInt5785, 0);
										}
										Static167.aClass136_81 = null;
										return true;
									} else if (Static67.aClass136_33 == Static167.aClass136_81) {
										local210 = Static176.aClass3_Sub25_Sub1_1.method4109();
										local75 = Static176.aClass3_Sub25_Sub1_1.method4117();
										local242 = Static176.aClass3_Sub25_Sub1_1.method4083();
										if (Static110.method1810(local210)) {
											Static408.method5639(local75, local242);
										}
										Static167.aClass136_81 = null;
										return true;
									} else if (Static302.aClass136_139 == Static167.aClass136_81) {
										local210 = Static176.aClass3_Sub25_Sub1_1.method4088();
										local75 = Static176.aClass3_Sub25_Sub1_1.method4083();
										local544 = Static176.aClass3_Sub25_Sub1_1.method4073();
										if (Static110.method1810(local75)) {
											Static174.method2780(local544, local210);
										}
										Static167.aClass136_81 = null;
										return true;
									} else if (Static167.aClass136_81 == Static448.aClass136_199) {
										local210 = Static176.aClass3_Sub25_Sub1_1.method4109();
										local75 = Static176.aClass3_Sub25_Sub1_1.method4100();
										local242 = Static176.aClass3_Sub25_Sub1_1.method4117();
										if (Static110.method1810(local210)) {
											@Pc(6246) Class3_Sub10 local6246 = (Class3_Sub10) Static32.aClass140_5.method3490((long) local242);
											local955 = (Class3_Sub10) Static32.aClass140_5.method3490((long) local75);
											if (local955 != null) {
												Static87.method1538(local955, false, local6246 == null || local6246.anInt827 != local955.anInt827);
											}
											if (local6246 != null) {
												local6246.method6288();
												Static32.aClass140_5.method3494((long) local75, local6246);
											}
											@Pc(6288) Class82 local6288 = Static180.method2857(local242);
											if (local6288 != null) {
												Static463.method6297(local6288);
											}
											local6288 = Static180.method2857(local75);
											if (local6288 != null) {
												Static463.method6297(local6288);
												Static325.method4506(local6288, true);
											}
											if (Static343.anInt5785 != -1) {
												Static407.method5564(Static343.anInt5785, 1);
											}
										}
										Static167.aClass136_81 = null;
										return true;
									} else if (Static167.aClass136_81 == Static364.aClass136_170) {
										Static356.method5852(Static248.aClass183_12);
										Static167.aClass136_81 = null;
										return true;
									} else if (Static167.aClass136_81 == Static15.aClass136_8) {
										local210 = Static176.aClass3_Sub25_Sub1_1.method4083();
										local75 = Static176.aClass3_Sub25_Sub1_1.method4117();
										if (Static110.method1810(local210)) {
											Static306.method4342(0, 5, Static317.anInt5364, local75);
										}
										Static167.aClass136_81 = null;
										return true;
									} else if (Static324.aClass136_150 == Static167.aClass136_81) {
										local210 = Static176.aClass3_Sub25_Sub1_1.method4083();
										local75 = Static176.aClass3_Sub25_Sub1_1.method4083();
										local242 = Static176.aClass3_Sub25_Sub1_1.method4083();
										local357 = Static176.aClass3_Sub25_Sub1_1.method4083();
										if (Static110.method1810(local210) && Static298.aClass82ArrayArray2[local75] != null) {
											for (local359 = local242; local359 < local357; local359++) {
												local494 = Static176.aClass3_Sub25_Sub1_1.method4099();
												if (Static298.aClass82ArrayArray2[local75].length > local359 && Static298.aClass82ArrayArray2[local75][local359] != null) {
													Static298.aClass82ArrayArray2[local75][local359].anInt2190 = local494;
												}
											}
										}
										Static167.aClass136_81 = null;
										return true;
									} else if (Static128.aClass136_61 == Static167.aClass136_81) {
										local210 = Static176.aClass3_Sub25_Sub1_1.method4096();
										local75 = Static176.aClass3_Sub25_Sub1_1.method4095();
										if (local210 == 255) {
											local75 = -1;
											local210 = -1;
										}
										Static210.method3178(local210, local75);
										Static167.aClass136_81 = null;
										return true;
									} else if (Static243.aClass136_192 == Static167.aClass136_81) {
										if (Static213.method3197(Static345.anInt5823)) {
											Static245.anInt4185 = (int) ((float) Static176.aClass3_Sub25_Sub1_1.method4083() * 2.5F);
										} else {
											Static245.anInt4185 = Static176.aClass3_Sub25_Sub1_1.method4083() * 30;
										}
										Static167.aClass136_81 = null;
										Static457.anInt7712 = Static125.anInt2284;
										return true;
									} else if (Static167.aClass136_81 == Static154.aClass136_74) {
										local210 = Static176.aClass3_Sub25_Sub1_1.method4083();
										local540 = Static176.aClass3_Sub25_Sub1_1.method4073();
										@Pc(6504) Object[] local6504 = new Object[local540.length() + 1];
										for (local357 = local540.length() - 1; local357 >= 0; local357--) {
											if (local540.charAt(local357) == 's') {
												local6504[local357 + 1] = Static176.aClass3_Sub25_Sub1_1.method4073();
											} else {
												local6504[local357 + 1] = Integer.valueOf(Static176.aClass3_Sub25_Sub1_1.method4108());
											}
										}
										local6504[0] = Integer.valueOf(Static176.aClass3_Sub25_Sub1_1.method4108());
										if (Static110.method1810(local210)) {
											@Pc(6566) Class3_Sub15 local6566 = new Class3_Sub15();
											local6566.anObjectArray3 = local6504;
											Static219.method3217(local6566);
										}
										Static167.aClass136_81 = null;
										return true;
									} else {
										Static120.method1926("T1 - " + (Static167.aClass136_81 == null ? -1 : Static167.aClass136_81.method3269()) + "," + (Static237.aClass136_117 == null ? -1 : Static237.aClass136_117.method3269()) + "," + (Static46.aClass136_17 == null ? -1 : Static46.aClass136_17.method3269()) + " - " + Static102.anInt1839, null);
										Static168.method2583(false);
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
