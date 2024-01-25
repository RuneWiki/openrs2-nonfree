import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Lclient!fc;")
	public static Class73 aClass73_4;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
	public static int anInt729;

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "[Lclient!da;")
	public static Class2_Sub8_Sub1[] aClass2_Sub8_Sub1Array1;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_18 = new Class208(9, -2);

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Z")
	public static boolean aBoolean51 = true;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)Z")
	public static boolean method581() throws IOException {
		if (Static386.aClass226_4 == null) {
			return false;
		}
		@Pc(13) int local13 = Static386.aClass226_4.method5550();
		if (local13 == 0) {
			return false;
		}
		@Pc(70) int local70;
		if (Static178.aClass208_103 == null) {
			if (Static204.aBoolean308) {
				local13--;
				Static386.aClass226_4.method5546(Static321.aClass2_Sub24_Sub2_34.aByteArray100, 0, 1);
				Static347.anInt6376++;
				Static204.aBoolean308 = false;
			}
			Static321.aClass2_Sub24_Sub2_34.anInt6669 = 0;
			if (Static321.aClass2_Sub24_Sub2_34.method5785()) {
				if (local13 == 0) {
					return false;
				}
				local13--;
				Static386.aClass226_4.method5546(Static321.aClass2_Sub24_Sub2_34.aByteArray100, 1, 1);
				Static347.anInt6376++;
			}
			Static204.aBoolean308 = true;
			@Pc(66) Class208[] local66 = Static195.method3548();
			local70 = Static321.aClass2_Sub24_Sub2_34.method5786();
			if (local70 < 0 || local66.length <= local70) {
				throw new IOException("invo:" + local70);
			}
			Static178.aClass208_103 = local66[local70];
			Static248.anInt4821 = Static178.aClass208_103.anInt5774;
		}
		if (Static248.anInt4821 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static386.aClass226_4.method5546(Static321.aClass2_Sub24_Sub2_34.aByteArray100, 0, 1);
			local13--;
			Static347.anInt6376++;
			Static248.anInt4821 = Static321.aClass2_Sub24_Sub2_34.aByteArray100[0] & 0xFF;
		}
		if (Static248.anInt4821 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static386.aClass226_4.method5546(Static321.aClass2_Sub24_Sub2_34.aByteArray100, 0, 2);
			Static321.aClass2_Sub24_Sub2_34.anInt6669 = 0;
			Static248.anInt4821 = Static321.aClass2_Sub24_Sub2_34.method5753();
			local13 -= 2;
			Static347.anInt6376 += 2;
		}
		if (Static248.anInt4821 > local13) {
			return false;
		}
		Static321.aClass2_Sub24_Sub2_34.anInt6669 = 0;
		Static386.aClass226_4.method5546(Static321.aClass2_Sub24_Sub2_34.aByteArray100, 0, Static248.anInt4821);
		Static198.aClass208_113 = Static217.aClass208_121;
		Static89.anInt1900 = 0;
		Static347.anInt6376 += Static248.anInt4821;
		Static217.aClass208_121 = Static317.aClass208_165;
		Static317.aClass208_165 = Static178.aClass208_103;
		if (Static4.aClass208_3 == Static178.aClass208_103) {
			Static306.anInt5661 = Static321.aClass2_Sub24_Sub2_34.method5723();
			Static276.anInt7132 = Static321.aClass2_Sub24_Sub2_34.method5723();
			Static192.anInt4019 = Static321.aClass2_Sub24_Sub2_34.method5777();
			while (Static248.anInt4821 > Static321.aClass2_Sub24_Sub2_34.anInt6669) {
				@Pc(206) Class213 local206 = Static154.method2744()[Static321.aClass2_Sub24_Sub2_34.method5732()];
				Static289.method4749(local206);
			}
			Static178.aClass208_103 = null;
			return true;
		}
		@Pc(228) int local228;
		@Pc(243) boolean local243;
		if (Static178.aClass208_103 == Static154.aClass208_93) {
			local228 = Static321.aClass2_Sub24_Sub2_34.method5732();
			local70 = Static321.aClass2_Sub24_Sub2_34.method5720();
			local243 = (local228 & 0x1) == 1;
			Static388.method6091(local70, local243);
			Static167.anIntArray268[Static204.anInt4205++ & 0x1F] = local70;
			Static178.aClass208_103 = null;
			return true;
		} else if (Static178.aClass208_103 == Static340.aClass208_186) {
			Static19.method214(Static321.aClass2_Sub24_Sub2_34, Static248.anInt4821);
			Static178.aClass208_103 = null;
			return true;
		} else if (Static72.aClass208_37 == Static178.aClass208_103) {
			local228 = Static321.aClass2_Sub24_Sub2_34.method5776();
			Static283.aClass86_8 = Static154.aClass123_2.method3270(local228);
			Static178.aClass208_103 = null;
			return true;
		} else {
			@Pc(318) int local318;
			@Pc(320) int local320;
			@Pc(326) int local326;
			@Pc(337) int local337;
			if (Static178.aClass208_103 == aClass208_18) {
				local228 = Static321.aClass2_Sub24_Sub2_34.method5753();
				local70 = Static321.aClass2_Sub24_Sub2_34.method5732();
				local243 = (local70 & 0x1) == 1;
				Static306.method5016(local243, local228);
				local318 = Static321.aClass2_Sub24_Sub2_34.method5753();
				for (local320 = 0; local320 < local318; local320++) {
					local326 = Static321.aClass2_Sub24_Sub2_34.method5733();
					if (local326 == 255) {
						local326 = Static321.aClass2_Sub24_Sub2_34.method5745();
					}
					local337 = Static321.aClass2_Sub24_Sub2_34.method5767();
					Static299.method4901(local320, local326, local243, local228, local337 - 1);
				}
				Static167.anIntArray268[Static204.anInt4205++ & 0x1F] = local228;
				Static178.aClass208_103 = null;
				return true;
			} else if (Static205.aClass208_117 == Static178.aClass208_103) {
				Static289.method4749(Static28.aClass213_4);
				Static178.aClass208_103 = null;
				return true;
			} else if (Static178.aClass208_103 == Static338.aClass208_185) {
				local228 = Static321.aClass2_Sub24_Sub2_34.method5753();
				if (local228 == 65535) {
					local228 = -1;
				}
				local70 = Static321.aClass2_Sub24_Sub2_34.method5723();
				Static269.method4567(local228, local70);
				Static178.aClass208_103 = null;
				return true;
			} else {
				@Pc(424) int local424;
				if (Static178.aClass208_103 == Static111.aClass208_62) {
					local228 = Static321.aClass2_Sub24_Sub2_34.method5725();
					local70 = Static321.aClass2_Sub24_Sub2_34.method5767();
					if (local70 == 65535) {
						local70 = -1;
					}
					local424 = Static321.aClass2_Sub24_Sub2_34.method5723();
					Static128.method2227(local228, local424, local70);
					Static178.aClass208_103 = null;
					return true;
				} else if (Static178.aClass208_103 == Static77.aClass208_40) {
					local228 = Static321.aClass2_Sub24_Sub2_34.method5753();
					local70 = Static321.aClass2_Sub24_Sub2_34.method5767();
					@Pc(448) byte local448 = Static321.aClass2_Sub24_Sub2_34.method5763();
					if (Static192.method3514(local70)) {
						Static364.method5779(local228, local448);
					}
					Static178.aClass208_103 = null;
					return true;
				} else if (Static385.aClass208_205 == Static178.aClass208_103) {
					Static289.method4749(Static110.aClass213_7);
					Static178.aClass208_103 = null;
					return true;
				} else if (Static178.aClass208_103 == Static274.aClass208_151) {
					local228 = Static321.aClass2_Sub24_Sub2_34.method5720();
					if (local228 == 65535) {
						local228 = -1;
					}
					local70 = Static321.aClass2_Sub24_Sub2_34.method5720();
					local424 = Static321.aClass2_Sub24_Sub2_34.method5714();
					if (Static192.method3514(local70)) {
						Static376.method5739(-1, local424, 1, local228);
					}
					Static178.aClass208_103 = null;
					return true;
				} else if (Static148.aClass208_87 == Static178.aClass208_103) {
					local228 = Static321.aClass2_Sub24_Sub2_34.method5714();
					local70 = Static321.aClass2_Sub24_Sub2_34.method5753();
					local424 = Static321.aClass2_Sub24_Sub2_34.method5719();
					if (Static192.method3514(local424)) {
						Static287.method4732(local70, local228);
					}
					Static178.aClass208_103 = null;
					return true;
				} else if (Static92.aClass208_48 == Static178.aClass208_103) {
					local228 = Static321.aClass2_Sub24_Sub2_34.method5732();
					local70 = Static321.aClass2_Sub24_Sub2_34.method5733();
					if (local70 == 255) {
						local228 = -1;
						local70 = -1;
					}
					Static306.method5009(local70, local228);
					Static178.aClass208_103 = null;
					return true;
				} else if (Static319.aClass208_168 == Static178.aClass208_103) {
					local228 = Static321.aClass2_Sub24_Sub2_34.method5753();
					if (Static192.method3514(local228)) {
						Static370.method4294();
					}
					Static178.aClass208_103 = null;
					return true;
				} else if (Static144.aClass208_84 == Static178.aClass208_103) {
					local228 = Static321.aClass2_Sub24_Sub2_34.method5753();
					local70 = Static321.aClass2_Sub24_Sub2_34.method5753();
					local424 = Static321.aClass2_Sub24_Sub2_34.method5753();
					local318 = Static321.aClass2_Sub24_Sub2_34.method5753();
					if (Static192.method3514(local228) && Static272.aClass3ArrayArray1[local70] != null) {
						for (local320 = local424; local320 < local318; local320++) {
							local326 = Static321.aClass2_Sub24_Sub2_34.method5736();
							if (local320 < Static272.aClass3ArrayArray1[local70].length && Static272.aClass3ArrayArray1[local70][local320] != null) {
								Static272.aClass3ArrayArray1[local70][local320].anInt65 = local326;
							}
						}
					}
					Static178.aClass208_103 = null;
					return true;
				} else if (Static178.aClass208_103 == Static270.aClass208_149) {
					if (Static248.anInt4821 == 0) {
						Static330.aString59 = Static57.aClass62_36.method1389(Static200.anInt4144);
					} else {
						Static330.aString59 = Static321.aClass2_Sub24_Sub2_34.method5744();
					}
					Static178.aClass208_103 = null;
					return true;
				} else if (Static178.aClass208_103 == Static337.aClass208_184) {
					local228 = Static321.aClass2_Sub24_Sub2_34.method5719();
					local70 = Static321.aClass2_Sub24_Sub2_34.method5776();
					local424 = Static321.aClass2_Sub24_Sub2_34.method5733();
					if (Static192.method3514(local228)) {
						Static39.method545(local424, local70);
					}
					Static178.aClass208_103 = null;
					return true;
				} else if (Static178.aClass208_103 == Static288.aClass208_159) {
					local228 = Static321.aClass2_Sub24_Sub2_34.method5743();
					local70 = Static321.aClass2_Sub24_Sub2_34.method5719();
					local424 = Static321.aClass2_Sub24_Sub2_34.method5714();
					local318 = Static321.aClass2_Sub24_Sub2_34.method5778();
					if (Static192.method3514(local70)) {
						Static392.method6134(local228, local424, local318);
					}
					Static178.aClass208_103 = null;
					return true;
				} else {
					@Pc(759) String local759;
					@Pc(763) String local763;
					@Pc(773) String local773;
					@Pc(779) String local779;
					if (Static63.aClass208_27 == Static178.aClass208_103) {
						local228 = Static321.aClass2_Sub24_Sub2_34.method5732();
						@Pc(755) boolean local755 = (local228 & 0x1) == 1;
						local759 = Static321.aClass2_Sub24_Sub2_34.method5744();
						local763 = Static321.aClass2_Sub24_Sub2_34.method5744();
						if (local763.equals("")) {
							local763 = local759;
						}
						local773 = Static321.aClass2_Sub24_Sub2_34.method5744();
						local779 = Static321.aClass2_Sub24_Sub2_34.method5744();
						if (local779.equals("")) {
							local779 = local773;
						}
						if (local755) {
							for (local337 = 0; local337 < Static158.anInt3256; local337++) {
								if (Static190.aStringArray19[local337].equals(local779)) {
									Static45.aStringArray37[local337] = local759;
									Static190.aStringArray19[local337] = local763;
									Static134.aStringArray14[local337] = local773;
									Static68.aStringArray9[local337] = local779;
									break;
								}
							}
						} else {
							Static45.aStringArray37[Static158.anInt3256] = local759;
							Static190.aStringArray19[Static158.anInt3256] = local763;
							Static134.aStringArray14[Static158.anInt3256] = local773;
							Static68.aStringArray9[Static158.anInt3256] = local779;
							Static302.aBooleanArray24[Static158.anInt3256] = (local228 & 0x2) == 2;
							Static158.anInt3256++;
						}
						Static342.anInt6304 = Static245.anInt4796;
						Static178.aClass208_103 = null;
						return true;
					} else if (Static178.aClass208_103 == Static46.aClass208_160) {
						local228 = Static321.aClass2_Sub24_Sub2_34.method5753();
						local70 = Static321.aClass2_Sub24_Sub2_34.method5745();
						Static179.aClass115_1.method2779(local70, local228);
						Static178.aClass208_103 = null;
						return true;
					} else if (Static178.aClass208_103 == Static310.aClass208_162) {
						Static321.aClass2_Sub24_Sub2_34.anInt6669 += 28;
						if (Static321.aClass2_Sub24_Sub2_34.method5718()) {
							Static34.method466(Static321.aClass2_Sub24_Sub2_34, Static321.aClass2_Sub24_Sub2_34.anInt6669 - 28);
						}
						Static178.aClass208_103 = null;
						return true;
					} else {
						@Pc(934) Class2_Sub26 local934;
						if (Static69.aClass208_35 == Static178.aClass208_103) {
							local228 = Static321.aClass2_Sub24_Sub2_34.method5720();
							local70 = Static321.aClass2_Sub24_Sub2_34.method5767();
							local424 = Static321.aClass2_Sub24_Sub2_34.method5723();
							local318 = Static321.aClass2_Sub24_Sub2_34.method5714();
							if (Static192.method3514(local228)) {
								local934 = (Class2_Sub26) Static273.aClass243_20.method5967((long) local318);
								if (local934 != null) {
									Static110.method2010(local934, false, local934.anInt4145 != local70);
								}
								Static36.method2331(local70, false, local318, local424);
							}
							Static178.aClass208_103 = null;
							return true;
						}
						@Pc(973) String local973;
						if (Static178.aClass208_103 == Static39.aClass208_17) {
							local228 = Static321.aClass2_Sub24_Sub2_34.method5777();
							local973 = Static321.aClass2_Sub24_Sub2_34.method5744();
							local424 = Static321.aClass2_Sub24_Sub2_34.method5720();
							if (local424 == 65535) {
								local424 = -1;
							}
							local318 = Static321.aClass2_Sub24_Sub2_34.method5733();
							if (local228 >= 1 && local228 <= 8) {
								if (local973.equalsIgnoreCase("null")) {
									local973 = null;
								}
								Static209.aStringArray22[local228 - 1] = local973;
								Static38.anIntArray57[local228 - 1] = local424;
								Static312.aBooleanArray25[local228 - 1] = local318 == 0;
							}
							Static178.aClass208_103 = null;
							return true;
						}
						@Pc(1080) long local1080;
						@Pc(1097) Class2_Sub27 local1097;
						@Pc(1088) Class2_Sub27 local1088;
						if (Static178.aClass208_103 == Static99.aClass208_54) {
							local228 = Static321.aClass2_Sub24_Sub2_34.method5760();
							local70 = Static321.aClass2_Sub24_Sub2_34.method5714();
							local424 = Static321.aClass2_Sub24_Sub2_34.method5719();
							local318 = Static321.aClass2_Sub24_Sub2_34.method5720();
							if (local318 == 65535) {
								local318 = -1;
							}
							local320 = Static321.aClass2_Sub24_Sub2_34.method5720();
							if (local320 == 65535) {
								local320 = -1;
							}
							if (Static192.method3514(local424)) {
								for (local326 = local320; local326 <= local318; local326++) {
									local1080 = ((long) local228 << 32) + ((long) local326);
									local1088 = (Class2_Sub27) Static328.aClass243_28.method5967(local1080);
									if (local1088 != null) {
										local1097 = new Class2_Sub27(local70, local1088.anInt4225);
										local1088.method6130();
									} else if (local326 == -1) {
										local1097 = new Class2_Sub27(local70, Static380.method5987(local228).aClass2_Sub27_1.anInt4225);
									} else {
										local1097 = new Class2_Sub27(local70, -1);
									}
									Static328.aClass243_28.method5968(local1080, local1097);
								}
							}
							Static178.aClass208_103 = null;
							return true;
						} else if (Static178.aClass208_103 == Static152.aClass208_129) {
							Static289.method4749(Static347.aClass213_14);
							Static178.aClass208_103 = null;
							return true;
						} else if (Static178.aClass208_103 == Static34.aClass208_11) {
							local228 = Static321.aClass2_Sub24_Sub2_34.method5753();
							local70 = Static321.aClass2_Sub24_Sub2_34.method5732();
							local424 = Static321.aClass2_Sub24_Sub2_34.method5732();
							local318 = Static321.aClass2_Sub24_Sub2_34.method5753();
							local320 = Static321.aClass2_Sub24_Sub2_34.method5732();
							local326 = Static321.aClass2_Sub24_Sub2_34.method5732();
							if (Static192.method3514(local228)) {
								Static153.method2736(local318, local326, local320, local70, local424);
							}
							Static178.aClass208_103 = null;
							return true;
						} else if (Static178.aClass208_103 == Static272.aClass208_150) {
							Static289.method4749(Static183.aClass213_9);
							Static178.aClass208_103 = null;
							return true;
						} else if (Static178.aClass208_103 == Static268.aClass208_148) {
							local228 = Static321.aClass2_Sub24_Sub2_34.method5753();
							if (local228 == 65535) {
								local228 = -1;
							}
							local70 = Static321.aClass2_Sub24_Sub2_34.method5767();
							if (local70 == 65535) {
								local70 = -1;
							}
							local424 = Static321.aClass2_Sub24_Sub2_34.method5720();
							local318 = Static321.aClass2_Sub24_Sub2_34.method5753();
							local320 = Static321.aClass2_Sub24_Sub2_34.method5776();
							if (Static192.method3514(local424)) {
								for (local326 = local70; local326 <= local228; local326++) {
									local1080 = ((long) local320 << 32) + (long) local326;
									local1088 = (Class2_Sub27) Static328.aClass243_28.method5967(local1080);
									if (local1088 != null) {
										local1097 = new Class2_Sub27(local1088.anInt4220, local318);
										local1088.method6130();
									} else if (local326 == -1) {
										local1097 = new Class2_Sub27(Static380.method5987(local320).aClass2_Sub27_1.anInt4220, local318);
									} else {
										local1097 = new Class2_Sub27(0, local318);
									}
									Static328.aClass243_28.method5968(local1080, local1097);
								}
							}
							Static178.aClass208_103 = null;
							return true;
						} else if (Static190.aClass208_107 == Static178.aClass208_103) {
							Static289.method4749(Static13.aClass213_2);
							Static178.aClass208_103 = null;
							return true;
						} else if (Static147.aClass208_86 == Static178.aClass208_103) {
							local228 = Static321.aClass2_Sub24_Sub2_34.method5767();
							local70 = Static321.aClass2_Sub24_Sub2_34.method5724();
							local424 = Static321.aClass2_Sub24_Sub2_34.method5776();
							if (Static192.method3514(local228)) {
								Static253.method4380(local70, local424);
							}
							Static178.aClass208_103 = null;
							return true;
						} else if (Static36.aClass208_80 == Static178.aClass208_103) {
							Static82.method1414(true);
							Static178.aClass208_103 = null;
							return false;
						} else if (Static27.aClass208_74 == Static178.aClass208_103) {
							local228 = Static321.aClass2_Sub24_Sub2_34.method5777();
							local70 = Static321.aClass2_Sub24_Sub2_34.method5720();
							local424 = Static321.aClass2_Sub24_Sub2_34.method5753();
							@Pc(1386) Class1_Sub2_Sub1_Sub2 local1386 = Static223.aClass1_Sub2_Sub1_Sub2Array1[local70];
							if (local1386 != null) {
								Static278.method4617(local424, local1386, local228);
							}
							Static178.aClass208_103 = null;
							return true;
						} else if (Static178.aClass208_103 == Static334.aClass208_180) {
							local228 = Static321.aClass2_Sub24_Sub2_34.method5745();
							local70 = Static321.aClass2_Sub24_Sub2_34.method5760();
							local424 = Static321.aClass2_Sub24_Sub2_34.method5767();
							local318 = Static321.aClass2_Sub24_Sub2_34.method5719();
							if (local318 == 65535) {
								local318 = -1;
							}
							if (Static192.method3514(local424)) {
								Static381.method5693(local318, local228, local70);
								@Pc(1441) Class152 local1441 = Static57.aClass196_1.method4827(local318);
								Static336.method5413(local1441.anInt4351, local1441.anInt4305, local228, local1441.anInt4350);
								Static80.method1373(local1441.anInt4348, local228, local1441.anInt4329, local1441.anInt4333);
							}
							Static178.aClass208_103 = null;
							return true;
						} else if (Static178.aClass208_103 == Static371.aClass208_198) {
							local228 = Static321.aClass2_Sub24_Sub2_34.method5767();
							if (local228 == 65535) {
								local228 = -1;
							}
							local70 = Static321.aClass2_Sub24_Sub2_34.method5753();
							local424 = Static321.aClass2_Sub24_Sub2_34.method5776();
							if (Static192.method3514(local70)) {
								Static376.method5739(-1, local424, 2, local228);
							}
							Static178.aClass208_103 = null;
							return true;
						} else if (Static88.aClass208_45 == Static178.aClass208_103) {
							local228 = Static321.aClass2_Sub24_Sub2_34.method5767();
							local70 = Static321.aClass2_Sub24_Sub2_34.method5777();
							local424 = Static321.aClass2_Sub24_Sub2_34.method5753();
							if (Static192.method3514(local228)) {
								if (local70 == 2) {
									Static152.method4181();
								}
								Static388.anInt7080 = local424;
								Static314.method5082(local424);
								Static357.method5625(false);
								Static351.method5591(Static388.anInt7080);
								for (local318 = 0; local318 < 100; local318++) {
									Static93.aBooleanArray10[local318] = true;
								}
							}
							Static178.aClass208_103 = null;
							return true;
						} else {
							@Pc(1595) int local1595;
							@Pc(1599) int local1599;
							@Pc(1569) boolean local1569;
							@Pc(1586) long local1586;
							@Pc(1591) long local1591;
							@Pc(1668) String local1668;
							if (Static223.aClass208_124 == Static178.aClass208_103) {
								local1569 = Static321.aClass2_Sub24_Sub2_34.method5732() == 1;
								local973 = Static321.aClass2_Sub24_Sub2_34.method5744();
								local759 = local973;
								if (local1569) {
									local759 = Static321.aClass2_Sub24_Sub2_34.method5744();
								}
								local1586 = Static321.aClass2_Sub24_Sub2_34.method5753();
								local1591 = Static321.aClass2_Sub24_Sub2_34.method5736();
								local1595 = Static321.aClass2_Sub24_Sub2_34.method5732();
								local1599 = Static321.aClass2_Sub24_Sub2_34.method5753();
								@Pc(1605) long local1605 = local1591 + (local1586 << 32);
								@Pc(1607) boolean local1607 = false;
								@Pc(1609) int local1609 = 0;
								while (true) {
									if (local1609 >= 100) {
										if (local1595 <= 1 && Static14.method170(local759)) {
											local1607 = true;
										}
										break;
									}
									if (local1605 == Static162.aLongArray3[local1609]) {
										local1607 = true;
										break;
									}
									local1609++;
								}
								if (!local1607 && Static350.anInt6468 == 0) {
									Static162.aLongArray3[Static218.anInt4414] = local1605;
									Static218.anInt4414 = (Static218.anInt4414 + 1) % 100;
									local1668 = Static116.method2078(local1599).method1718(Static321.aClass2_Sub24_Sub2_34);
									if (local1595 == 2) {
										Static295.method4840("<img=1>" + local759, local1599, local1668, 18, 0, "<img=1>" + local973, null);
									} else if (local1595 == 1) {
										Static295.method4840("<img=0>" + local759, local1599, local1668, 18, 0, "<img=0>" + local973, null);
									} else {
										Static295.method4840(local759, local1599, local1668, 18, 0, local973, null);
									}
								}
								Static178.aClass208_103 = null;
								return true;
							} else if (Static383.aClass208_204 == Static178.aClass208_103) {
								Static364.method5790(true);
								Static178.aClass208_103 = null;
								return true;
							} else if (Static178.aClass208_103 == Static5.aClass208_4) {
								for (local228 = 0; local228 < Static42.aClass1_Sub2_Sub1_Sub1Array1.length; local228++) {
									if (Static42.aClass1_Sub2_Sub1_Sub1Array1[local228] != null) {
										Static42.aClass1_Sub2_Sub1_Sub1Array1[local228].anInt5366 = -1;
									}
								}
								for (local70 = 0; local70 < Static223.aClass1_Sub2_Sub1_Sub2Array1.length; local70++) {
									if (Static223.aClass1_Sub2_Sub1_Sub2Array1[local70] != null) {
										Static223.aClass1_Sub2_Sub1_Sub2Array1[local70].anInt5366 = -1;
									}
								}
								Static178.aClass208_103 = null;
								return true;
							} else if (Static178.aClass208_103 == Static128.aClass208_71) {
								local228 = Static321.aClass2_Sub24_Sub2_34.method5753();
								local70 = Static321.aClass2_Sub24_Sub2_34.method5732();
								local243 = (local70 & 0x1) == 1;
								while (Static248.anInt4821 > Static321.aClass2_Sub24_Sub2_34.anInt6669) {
									local318 = Static321.aClass2_Sub24_Sub2_34.method5722();
									local320 = Static321.aClass2_Sub24_Sub2_34.method5753();
									local326 = 0;
									if (local320 != 0) {
										local326 = Static321.aClass2_Sub24_Sub2_34.method5732();
										if (local326 == 255) {
											local326 = Static321.aClass2_Sub24_Sub2_34.method5776();
										}
									}
									Static299.method4901(local318, local326, local243, local228, local320 - 1);
								}
								Static167.anIntArray268[Static204.anInt4205++ & 0x1F] = local228;
								Static178.aClass208_103 = null;
								return true;
							} else if (Static178.aClass208_103 == Static120.aClass208_70) {
								local228 = Static321.aClass2_Sub24_Sub2_34.method5753();
								if (local228 == 65535) {
									local228 = -1;
								}
								local70 = Static321.aClass2_Sub24_Sub2_34.method5732();
								local424 = Static321.aClass2_Sub24_Sub2_34.method5753();
								local318 = Static321.aClass2_Sub24_Sub2_34.method5732();
								Static88.method1493(local424, local228, local70, local318);
								Static178.aClass208_103 = null;
								return true;
							} else if (Static178.aClass208_103 == Static320.aClass208_209) {
								local228 = Static321.aClass2_Sub24_Sub2_34.method5753();
								local70 = Static321.aClass2_Sub24_Sub2_34.method5753();
								local424 = Static321.aClass2_Sub24_Sub2_34.method5745();
								if (Static192.method3514(local70)) {
									Static355.method5615(local424, local228);
								}
								Static178.aClass208_103 = null;
								return true;
							} else if (Static10.aClass208_194 == Static178.aClass208_103) {
								local228 = Static321.aClass2_Sub24_Sub2_34.method5732();
								if (Static321.aClass2_Sub24_Sub2_34.method5732() == 0) {
									Static146.aClass231Array1[local228] = new Class231();
								} else {
									Static321.aClass2_Sub24_Sub2_34.anInt6669--;
									Static146.aClass231Array1[local228] = new Class231(Static321.aClass2_Sub24_Sub2_34);
								}
								Static178.aClass208_103 = null;
								Static263.anInt5016 = Static245.anInt4796;
								return true;
							} else if (Static107.aClass208_59 == Static178.aClass208_103) {
								local228 = Static321.aClass2_Sub24_Sub2_34.method5777();
								local70 = Static321.aClass2_Sub24_Sub2_34.method5714();
								local424 = Static321.aClass2_Sub24_Sub2_34.method5777();
								Static140.anIntArray232[local228] = local70;
								Static385.anIntArray585[local228] = local424;
								Static226.anIntArray377[local228] = 1;
								local318 = Static353.anIntArray554[local228] - 1;
								for (local320 = 0; local320 < local318; local320++) {
									if (Class171.anIntArray394[local320] <= local70) {
										Static226.anIntArray377[local228] = local320 + 2;
									}
								}
								Static228.anIntArray380[Static236.anInt4681++ & 0x1F] = local228;
								Static178.aClass208_103 = null;
								return true;
							} else if (Static178.aClass208_103 == Static252.aClass208_140) {
								Static212.method3825(Static321.aClass2_Sub24_Sub2_34.method5744());
								Static178.aClass208_103 = null;
								return true;
							} else if (Static31.aClass208_10 == Static178.aClass208_103) {
								Static289.method4749(Static58.aClass213_6);
								Static178.aClass208_103 = null;
								return true;
							} else if (Static178.aClass208_103 == Static131.aClass208_75) {
								Static289.method4749(Static115.aClass213_8);
								Static178.aClass208_103 = null;
								return true;
							} else if (Static178.aClass208_103 == Static2.aClass208_207) {
								Static289.method4749(Static247.aClass213_11);
								Static178.aClass208_103 = null;
								return true;
							} else if (Static178.aClass208_103 == Static346.aClass208_189) {
								local228 = Static321.aClass2_Sub24_Sub2_34.method5767();
								if (local228 == 65535) {
									local228 = -1;
								}
								local70 = Static321.aClass2_Sub24_Sub2_34.method5714();
								local424 = local70 >> 28 & 0x3;
								local318 = local70 >> 14 & 0x3FFF;
								local320 = local70 & 0x3FFF;
								local326 = Static321.aClass2_Sub24_Sub2_34.method5732();
								local337 = local326 >> 2;
								local1595 = local326 & 0x3;
								local320 -= Static350.anInt6470;
								local318 -= Static279.anInt5198;
								local1599 = Static307.anIntArray497[local337];
								Static193.method3519(local318, local228, local1599, local1595, local424, local337, local320);
								Static178.aClass208_103 = null;
								return true;
							} else if (Static178.aClass208_103 == Static133.aClass208_78) {
								local228 = Static321.aClass2_Sub24_Sub2_34.method5720();
								if (local228 == 65535) {
									local228 = -1;
								}
								local70 = Static321.aClass2_Sub24_Sub2_34.method5714();
								local424 = Static321.aClass2_Sub24_Sub2_34.method5767();
								if (Static192.method3514(local424)) {
									Static63.method1177(local228, local70);
								}
								Static178.aClass208_103 = null;
								return true;
							} else if (Static178.aClass208_103 == Static97.aClass208_53) {
								local228 = Static321.aClass2_Sub24_Sub2_34.method5714();
								local70 = Static321.aClass2_Sub24_Sub2_34.method5719();
								Static179.aClass115_1.method2781(local70, local228);
								Static178.aClass208_103 = null;
								return true;
							} else if (Static197.aClass208_112 == Static178.aClass208_103) {
								local228 = Static321.aClass2_Sub24_Sub2_34.method5720();
								local70 = Static321.aClass2_Sub24_Sub2_34.method5745();
								local424 = Static321.aClass2_Sub24_Sub2_34.method5767();
								local318 = Static321.aClass2_Sub24_Sub2_34.method5753();
								if (Static192.method3514(local228)) {
									Static56.method4661((local318 << 16) + local424, local70);
								}
								Static178.aClass208_103 = null;
								return true;
							} else if (Static178.aClass208_103 == Static189.aClass208_16) {
								local228 = Static321.aClass2_Sub24_Sub2_34.method5714();
								local70 = Static321.aClass2_Sub24_Sub2_34.method5720();
								local759 = Static321.aClass2_Sub24_Sub2_34.method5744();
								if (Static192.method3514(local70)) {
									Static286.method4709(local759, local228);
								}
								Static178.aClass208_103 = null;
								return true;
							} else if (Static261.aClass208_144 == Static178.aClass208_103) {
								local228 = Static321.aClass2_Sub24_Sub2_34.method5767();
								local70 = Static321.aClass2_Sub24_Sub2_34.method5745();
								if (Static192.method3514(local228)) {
									Static376.method5739(0, local70, 5, Static93.anInt1976);
								}
								Static178.aClass208_103 = null;
								return true;
							} else if (Static178.aClass208_103 == Static278.aClass208_154) {
								Static23.anInt353 = Static321.aClass2_Sub24_Sub2_34.method5732();
								Static132.anInt2862 = Static321.aClass2_Sub24_Sub2_34.method5733();
								Static381.anInt6604 = Static321.aClass2_Sub24_Sub2_34.method5732();
								Static178.aClass208_103 = null;
								return true;
							} else if (Static155.aClass208_94 == Static178.aClass208_103) {
								if (Static388.anInt7080 != -1) {
									Static206.method3765(0, Static388.anInt7080);
								}
								Static178.aClass208_103 = null;
								return true;
							} else if (Static178.aClass208_103 == Static48.aClass208_21) {
								local228 = Static321.aClass2_Sub24_Sub2_34.method5719();
								local70 = Static321.aClass2_Sub24_Sub2_34.method5719();
								local424 = Static321.aClass2_Sub24_Sub2_34.method5753();
								if (Static192.method3514(local228)) {
									Static23.method269(local424, local70);
								}
								Static178.aClass208_103 = null;
								return true;
							} else if (Static178.aClass208_103 == Static218.aClass208_122) {
								Static158.anInt3256 = Static321.aClass2_Sub24_Sub2_34.method5732();
								for (local228 = 0; local228 < Static158.anInt3256; local228++) {
									Static45.aStringArray37[local228] = Static321.aClass2_Sub24_Sub2_34.method5744();
									Static190.aStringArray19[local228] = Static321.aClass2_Sub24_Sub2_34.method5744();
									if (Static190.aStringArray19[local228].equals("")) {
										Static190.aStringArray19[local228] = Static45.aStringArray37[local228];
									}
									Static134.aStringArray14[local228] = Static321.aClass2_Sub24_Sub2_34.method5744();
									Static68.aStringArray9[local228] = Static321.aClass2_Sub24_Sub2_34.method5744();
									if (Static68.aStringArray9[local228].equals("")) {
										Static68.aStringArray9[local228] = Static134.aStringArray14[local228];
									}
									Static302.aBooleanArray24[local228] = false;
								}
								Static178.aClass208_103 = null;
								Static342.anInt6304 = Static245.anInt4796;
								return true;
							} else if (Static178.aClass208_103 == Static70.aClass208_36) {
								Static73.method1286(Static248.anInt4821, Static154.aClass123_2, Static321.aClass2_Sub24_Sub2_34);
								Static178.aClass208_103 = null;
								return true;
							} else if (Static360.aClass208_197 == Static178.aClass208_103) {
								local228 = Static321.aClass2_Sub24_Sub2_34.method5767();
								local70 = Static321.aClass2_Sub24_Sub2_34.method5760();
								local424 = Static321.aClass2_Sub24_Sub2_34.method5714();
								local318 = Static321.aClass2_Sub24_Sub2_34.method5719();
								if (Static192.method3514(local228)) {
									Static376.method5739(local70, local424, 5, local318);
								}
								Static178.aClass208_103 = null;
								return true;
							} else {
								@Pc(2613) String local2613;
								@Pc(2545) long local2545;
								@Pc(2549) int local2549;
								@Pc(2553) int local2553;
								if (Static257.aClass208_143 == Static178.aClass208_103) {
									local1569 = Static321.aClass2_Sub24_Sub2_34.method5732() == 1;
									local973 = Static321.aClass2_Sub24_Sub2_34.method5744();
									local759 = local973;
									if (local1569) {
										local759 = Static321.aClass2_Sub24_Sub2_34.method5744();
									}
									local1586 = Static321.aClass2_Sub24_Sub2_34.method5740();
									local1591 = Static321.aClass2_Sub24_Sub2_34.method5753();
									local2545 = Static321.aClass2_Sub24_Sub2_34.method5736();
									local2549 = Static321.aClass2_Sub24_Sub2_34.method5732();
									local2553 = Static321.aClass2_Sub24_Sub2_34.method5753();
									@Pc(2559) long local2559 = local2545 + (local1591 << 32);
									@Pc(2561) boolean local2561 = false;
									@Pc(2563) int local2563 = 0;
									while (true) {
										if (local2563 >= 100) {
											if (local2549 <= 1 && Static14.method170(local759)) {
												local2561 = true;
											}
											break;
										}
										if (Static162.aLongArray3[local2563] == local2559) {
											local2561 = true;
											break;
										}
										local2563++;
									}
									if (!local2561 && Static350.anInt6468 == 0) {
										Static162.aLongArray3[Static218.anInt4414] = local2559;
										Static218.anInt4414 = (Static218.anInt4414 + 1) % 100;
										local2613 = Static116.method2078(local2553).method1718(Static321.aClass2_Sub24_Sub2_34);
										if (local2549 == 2) {
											Static295.method4840("<img=1>" + local759, local2553, local2613, 20, 0, "<img=1>" + local973, Static94.method1601(local1586));
										} else if (local2549 == 1) {
											Static295.method4840("<img=0>" + local759, local2553, local2613, 20, 0, "<img=0>" + local973, Static94.method1601(local1586));
										} else {
											Static295.method4840(local759, local2553, local2613, 20, 0, local973, Static94.method1601(local1586));
										}
									}
									Static178.aClass208_103 = null;
									return true;
								} else if (Static178.aClass208_103 == Static312.aClass208_164) {
									Static289.method4749(Static206.aClass213_10);
									Static178.aClass208_103 = null;
									return true;
								} else if (Static178.aClass208_103 == Static9.aClass208_5) {
									Static241.method2190();
									Static178.aClass208_103 = null;
									return false;
								} else if (Static182.aClass208_106 == Static178.aClass208_103) {
									local228 = Static321.aClass2_Sub24_Sub2_34.method5720();
									local973 = Static321.aClass2_Sub24_Sub2_34.method5744();
									local424 = Static321.aClass2_Sub24_Sub2_34.method5719();
									if (Static192.method3514(local228)) {
										Static299.method4903(local424, local973);
									}
									Static178.aClass208_103 = null;
									return true;
								} else if (Static65.aClass208_29 == Static178.aClass208_103) {
									Static232.anInt4636 = Static321.aClass2_Sub24_Sub2_34.method5732();
									Static342.anInt6304 = Static245.anInt4796;
									Static178.aClass208_103 = null;
									return true;
								} else if (Static178.aClass208_103 == Static151.aClass208_120) {
									Static289.method4749(Static357.aClass213_15);
									Static178.aClass208_103 = null;
									return true;
								} else if (Static2.aClass208_208 == Static178.aClass208_103) {
									local228 = Static321.aClass2_Sub24_Sub2_34.method5753();
									local973 = Static321.aClass2_Sub24_Sub2_34.method5744();
									local424 = Static321.aClass2_Sub24_Sub2_34.method5720();
									if (Static192.method3514(local424)) {
										Static299.method4903(local228, local973);
									}
									Static178.aClass208_103 = null;
									return true;
								} else if (Static114.aClass208_63 == Static178.aClass208_103) {
									Static192.anInt4019 = Static321.aClass2_Sub24_Sub2_34.method5732();
									Static306.anInt5661 = Static321.aClass2_Sub24_Sub2_34.method5732();
									Static276.anInt7132 = Static321.aClass2_Sub24_Sub2_34.method5732();
									for (@Pc(2802) Class2_Sub30 local2802 = (Class2_Sub30) Static301.aClass243_24.method5975(); local2802 != null; local2802 = (Class2_Sub30) Static301.aClass243_24.method5973()) {
										local70 = (int) (local2802.aLong213 & 0x3FFFL);
										local424 = (int) (local2802.aLong213 >> 14 & 0x3FFFL);
										local318 = (int) (local2802.aLong213 >> 28 & 0x3L);
										if (Static276.anInt7132 == local318 && Static306.anInt5661 <= local70 && Static306.anInt5661 + 8 > local70 && Static192.anInt4019 <= local424 && Static192.anInt4019 + 8 > local424) {
											local2802.method6130();
											Static89.method1500(Static276.anInt7132, local424, local70);
										}
									}
									for (@Pc(2869) Class2_Sub15 local2869 = (Class2_Sub15) Static35.aClass238_3.method5795(); local2869 != null; local2869 = (Class2_Sub15) Static35.aClass238_3.method5799()) {
										if (local2869.anInt2548 >= Static306.anInt5661 && local2869.anInt2548 < Static306.anInt5661 + 8 && Static192.anInt4019 <= local2869.anInt2545 && local2869.anInt2545 < Static192.anInt4019 + 8 && local2869.anInt2543 == Static276.anInt7132) {
											local2869.anInt2549 = 0;
										}
									}
									Static178.aClass208_103 = null;
									return true;
								} else if (Static178.aClass208_103 == Static133.aClass208_79) {
									Static289.method4749(Static53.aClass213_5);
									Static178.aClass208_103 = null;
									return true;
								} else {
									@Pc(2936) String local2936;
									if (Static15.aClass208_7 == Static178.aClass208_103) {
										local2936 = Static321.aClass2_Sub24_Sub2_34.method5744();
										local70 = Static321.aClass2_Sub24_Sub2_34.method5753();
										local759 = Static116.method2078(local70).method1718(Static321.aClass2_Sub24_Sub2_34);
										Static295.method4840(local2936, local70, local759, 19, 0, local2936, null);
										Static178.aClass208_103 = null;
										return true;
									} else if (Static178.aClass208_103 == Static344.aClass208_187) {
										local228 = Static321.aClass2_Sub24_Sub2_34.method5767();
										local70 = Static321.aClass2_Sub24_Sub2_34.method5720();
										local424 = Static321.aClass2_Sub24_Sub2_34.method5719();
										local318 = Static321.aClass2_Sub24_Sub2_34.method5767();
										local320 = Static321.aClass2_Sub24_Sub2_34.method5714();
										if (Static192.method3514(local70)) {
											Static376.method5739(local318, local320, 7, local424 | local228 << 16);
										}
										Static178.aClass208_103 = null;
										return true;
									} else if (Static331.aClass208_176 == Static178.aClass208_103) {
										local228 = Static321.aClass2_Sub24_Sub2_34.method5753();
										local70 = Static321.aClass2_Sub24_Sub2_34.method5732();
										local424 = Static321.aClass2_Sub24_Sub2_34.method5732();
										local318 = Static321.aClass2_Sub24_Sub2_34.method5753();
										local320 = Static321.aClass2_Sub24_Sub2_34.method5732();
										local326 = Static321.aClass2_Sub24_Sub2_34.method5732();
										if (Static192.method3514(local228)) {
											Static358.method5631(local326, true, local320, local70, local318, local424);
										}
										Static178.aClass208_103 = null;
										return true;
									} else if (Static87.aClass208_43 == Static178.aClass208_103) {
										Static222.anInt4434 = Static321.aClass2_Sub24_Sub2_34.method5753() * 30;
										Static178.aClass208_103 = null;
										Static287.anInt5313 = Static245.anInt4796;
										return true;
									} else if (Static237.aClass208_132 == Static178.aClass208_103) {
										local228 = Static321.aClass2_Sub24_Sub2_34.method5753();
										local973 = Static321.aClass2_Sub24_Sub2_34.method5744();
										@Pc(3086) Object[] local3086 = new Object[local973.length() + 1];
										for (local318 = local973.length() - 1; local318 >= 0; local318--) {
											if (local973.charAt(local318) == 's') {
												local3086[local318 + 1] = Static321.aClass2_Sub24_Sub2_34.method5744();
											} else {
												local3086[local318 + 1] = Integer.valueOf(Static321.aClass2_Sub24_Sub2_34.method5776());
											}
										}
										local3086[0] = Integer.valueOf(Static321.aClass2_Sub24_Sub2_34.method5776());
										if (Static192.method3514(local228)) {
											@Pc(3145) Class2_Sub5 local3145 = new Class2_Sub5();
											local3145.anObjectArray33 = local3086;
											Static351.method5589(local3145);
										}
										Static178.aClass208_103 = null;
										return true;
									} else if (Static249.aClass208_139 == Static178.aClass208_103) {
										Static154.anInt3222 = Static321.aClass2_Sub24_Sub2_34.method5743();
										Static178.aClass208_103 = null;
										Static287.anInt5313 = Static245.anInt4796;
										return true;
									} else if (Static178.aClass208_103 == Static262.aClass208_145) {
										local228 = Static321.aClass2_Sub24_Sub2_34.method5753();
										local70 = Static321.aClass2_Sub24_Sub2_34.method5732();
										local424 = Static321.aClass2_Sub24_Sub2_34.method5732();
										local318 = Static321.aClass2_Sub24_Sub2_34.method5732();
										local320 = Static321.aClass2_Sub24_Sub2_34.method5732();
										local326 = Static321.aClass2_Sub24_Sub2_34.method5753();
										if (Static192.method3514(local228)) {
											Static159.aBooleanArray15[local70] = true;
											Static152.anIntArray385[local70] = local424;
											Static354.anIntArray556[local70] = local318;
											Static7.anIntArray15[local70] = local320;
											Static45.anIntArray526[local70] = local326;
										}
										Static178.aClass208_103 = null;
										return true;
									} else if (Static178.aClass208_103 == Static317.aClass208_166) {
										local228 = Static321.aClass2_Sub24_Sub2_34.method5733();
										local70 = Static321.aClass2_Sub24_Sub2_34.method5720();
										if (Static192.method3514(local70)) {
											Static230.anInt4626 = local228;
										}
										Static178.aClass208_103 = null;
										return true;
									} else if (Static224.aClass208_125 == Static178.aClass208_103) {
										local228 = Static321.aClass2_Sub24_Sub2_34.method5760();
										local70 = Static321.aClass2_Sub24_Sub2_34.method5753();
										if (Static192.method3514(local70)) {
											Static376.method5739(-1, local228, 3, -1);
										}
										Static178.aClass208_103 = null;
										return true;
									} else if (Static383.aClass208_203 == Static178.aClass208_103) {
										Static306.anInt5661 = Static321.aClass2_Sub24_Sub2_34.method5733();
										Static192.anInt4019 = Static321.aClass2_Sub24_Sub2_34.method5723();
										Static276.anInt7132 = Static321.aClass2_Sub24_Sub2_34.method5777();
										Static178.aClass208_103 = null;
										return true;
									} else if (Static178.aClass208_103 == Static67.aClass208_32) {
										local228 = Static321.aClass2_Sub24_Sub2_34.method5745();
										local70 = Static321.aClass2_Sub24_Sub2_34.method5714();
										local424 = Static321.aClass2_Sub24_Sub2_34.method5720();
										if (Static192.method3514(local424)) {
											@Pc(3325) Class2_Sub26 local3325 = (Class2_Sub26) Static273.aClass243_20.method5967((long) local228);
											local934 = (Class2_Sub26) Static273.aClass243_20.method5967((long) local70);
											if (local934 != null) {
												Static110.method2010(local934, false, local3325 == null || local934.anInt4145 != local3325.anInt4145);
											}
											if (local3325 != null) {
												local3325.method6130();
												Static273.aClass243_20.method5968((long) local70, local3325);
											}
											@Pc(3369) Class3 local3369 = Static380.method5987(local228);
											if (local3369 != null) {
												Static128.method2229(local3369);
											}
											local3369 = Static380.method5987(local70);
											if (local3369 != null) {
												Static128.method2229(local3369);
												Static378.method4266(local3369, true);
											}
											if (Static388.anInt7080 != -1) {
												Static206.method3765(1, Static388.anInt7080);
											}
										}
										Static178.aClass208_103 = null;
										return true;
									} else if (Static319.aClass208_167 == Static178.aClass208_103) {
										Static364.method5790(false);
										Static178.aClass208_103 = null;
										return true;
									} else {
										@Pc(3643) int local3643;
										@Pc(3440) boolean local3440;
										@Pc(3679) String local3679;
										if (Static248.aClass208_138 == Static178.aClass208_103) {
											local1569 = Static321.aClass2_Sub24_Sub2_34.method5732() == 1;
											local973 = Static321.aClass2_Sub24_Sub2_34.method5744();
											local759 = Static321.aClass2_Sub24_Sub2_34.method5744();
											local318 = Static321.aClass2_Sub24_Sub2_34.method5753();
											local320 = Static321.aClass2_Sub24_Sub2_34.method5732();
											local779 = "";
											local3440 = false;
											if (local318 > 0) {
												local779 = Static321.aClass2_Sub24_Sub2_34.method5744();
												local3440 = Static321.aClass2_Sub24_Sub2_34.method5732() == 1;
											}
											for (local1595 = 0; local1595 < Static139.anInt2976; local1595++) {
												if (local1569) {
													if (local759.equals(Static30.aStringArray6[local1595])) {
														Static30.aStringArray6[local1595] = local973;
														Static288.aStringArray29[local1595] = local759;
														local973 = null;
														break;
													}
												} else if (local973.equals(Static30.aStringArray6[local1595])) {
													if (local318 != Static23.anIntArray42[local1595]) {
														Static23.anIntArray42[local1595] = local318;
														if (local318 > 0) {
															Static383.method6001(5, "", 0, "", local973 + Static119.aClass62_88.method1389(Static200.anInt4144));
														}
														if (local318 == 0) {
															Static383.method6001(5, "", 0, "", local973 + Static28.aClass62_13.method1389(Static200.anInt4144));
														}
													}
													Static288.aStringArray29[local1595] = local759;
													Static73.aStringArray10[local1595] = local779;
													Static299.anIntArray474[local1595] = local320;
													Static289.aBooleanArray23[local1595] = local3440;
													local973 = null;
													break;
												}
											}
											if (local973 != null && Static139.anInt2976 < 200) {
												Static30.aStringArray6[Static139.anInt2976] = local973;
												Static288.aStringArray29[Static139.anInt2976] = local759;
												Static23.anIntArray42[Static139.anInt2976] = local318;
												Static73.aStringArray10[Static139.anInt2976] = local779;
												Static299.anIntArray474[Static139.anInt2976] = local320;
												Static289.aBooleanArray23[Static139.anInt2976] = local3440;
												Static139.anInt2976++;
											}
											Static342.anInt6304 = Static245.anInt4796;
											local2549 = Static139.anInt2976;
											while (local2549 > 0) {
												local2549--;
												@Pc(3610) boolean local3610 = true;
												for (local2553 = 0; local2553 < local2549; local2553++) {
													if (Static23.anIntArray42[local2553] != Static4.anInt134 && Static4.anInt134 == Static23.anIntArray42[local2553 + 1] || Static23.anIntArray42[local2553] == 0 && Static23.anIntArray42[local2553 + 1] != 0) {
														local3643 = Static23.anIntArray42[local2553];
														Static23.anIntArray42[local2553] = Static23.anIntArray42[local2553 + 1];
														Static23.anIntArray42[local2553 + 1] = local3643;
														local1668 = Static73.aStringArray10[local2553];
														Static73.aStringArray10[local2553] = Static73.aStringArray10[local2553 + 1];
														Static73.aStringArray10[local2553 + 1] = local1668;
														local3679 = Static30.aStringArray6[local2553];
														Static30.aStringArray6[local2553] = Static30.aStringArray6[local2553 + 1];
														Static30.aStringArray6[local2553 + 1] = local3679;
														local2613 = Static288.aStringArray29[local2553];
														Static288.aStringArray29[local2553] = Static288.aStringArray29[local2553 + 1];
														Static288.aStringArray29[local2553 + 1] = local2613;
														@Pc(3715) int local3715 = Static299.anIntArray474[local2553];
														Static299.anIntArray474[local2553] = Static299.anIntArray474[local2553 + 1];
														Static299.anIntArray474[local2553 + 1] = local3715;
														@Pc(3733) boolean local3733 = Static289.aBooleanArray23[local2553];
														Static289.aBooleanArray23[local2553] = Static289.aBooleanArray23[local2553 + 1];
														Static289.aBooleanArray23[local2553 + 1] = local3733;
														local3610 = false;
													}
												}
												if (local3610) {
													break;
												}
											}
											Static178.aClass208_103 = null;
											return true;
										} else if (Static178.aClass208_103 == Static386.aClass208_206) {
											local228 = Static321.aClass2_Sub24_Sub2_34.method5760();
											local70 = Static321.aClass2_Sub24_Sub2_34.method5719();
											local424 = Static321.aClass2_Sub24_Sub2_34.method5719();
											if (Static192.method3514(local70)) {
												Static159.method2814(local228, local424);
											}
											Static178.aClass208_103 = null;
											return true;
										} else if (Static247.aClass208_136 == Static178.aClass208_103) {
											local228 = Static321.aClass2_Sub24_Sub2_34.method5776();
											local70 = Static321.aClass2_Sub24_Sub2_34.method5720();
											local424 = Static321.aClass2_Sub24_Sub2_34.method5767();
											local318 = Static321.aClass2_Sub24_Sub2_34.method5720();
											local320 = Static321.aClass2_Sub24_Sub2_34.method5720();
											if (Static192.method3514(local320)) {
												Static336.method5413(local318, local424, local228, local70);
											}
											Static178.aClass208_103 = null;
											return true;
										} else {
											@Pc(3889) Class163 local3889;
											if (Static178.aClass208_103 == Static336.aClass208_181) {
												local2936 = Static321.aClass2_Sub24_Sub2_34.method5744();
												local243 = Static321.aClass2_Sub24_Sub2_34.method5732() == 1;
												if (local243) {
													local973 = Static321.aClass2_Sub24_Sub2_34.method5744();
												} else {
													local973 = local2936;
												}
												local318 = Static321.aClass2_Sub24_Sub2_34.method5753();
												@Pc(3870) byte local3870 = Static321.aClass2_Sub24_Sub2_34.method5759();
												@Pc(3872) boolean local3872 = false;
												if (local3870 == -128) {
													local3872 = true;
												}
												if (local3872) {
													if (Static29.anInt438 == 0) {
														Static178.aClass208_103 = null;
														return true;
													}
													for (local337 = 0; Static29.anInt438 > local337 && (!Static43.aClass163Array2[local337].aString40.equals(local973) || Static43.aClass163Array2[local337].anInt4629 != local318); local337++) {
													}
													if (local337 < Static29.anInt438) {
														while (Static29.anInt438 - 1 > local337) {
															Static43.aClass163Array2[local337] = Static43.aClass163Array2[local337 + 1];
															local337++;
														}
														Static29.anInt438--;
														Static43.aClass163Array2[Static29.anInt438] = null;
													}
												} else {
													@Pc(3885) String local3885 = Static321.aClass2_Sub24_Sub2_34.method5744();
													local3889 = new Class163();
													local3889.aString40 = local973;
													local3889.aString39 = local2936;
													local3889.aString37 = Static287.method4731(local3889.aString40);
													local3889.anInt4629 = local318;
													local3889.aByte34 = local3870;
													local3889.aString38 = local3885;
													for (local1599 = Static29.anInt438 - 1; local1599 >= 0; local1599--) {
														local2549 = Static43.aClass163Array2[local1599].aString37.compareTo(local3889.aString37);
														if (local2549 == 0) {
															Static43.aClass163Array2[local1599].anInt4629 = local318;
															Static43.aClass163Array2[local1599].aByte34 = local3870;
															Static43.aClass163Array2[local1599].aString38 = local3885;
															if (local973.equals(Static182.aClass1_Sub2_Sub1_Sub1_1.aString12)) {
																Static70.aByte22 = local3870;
															}
															Static315.anInt5768 = Static245.anInt4796;
															Static178.aClass208_103 = null;
															return true;
														}
														if (local2549 < 0) {
															break;
														}
													}
													if (Static29.anInt438 >= Static43.aClass163Array2.length) {
														Static178.aClass208_103 = null;
														return true;
													}
													for (local2549 = Static29.anInt438 - 1; local2549 > local1599; local2549--) {
														Static43.aClass163Array2[local2549 + 1] = Static43.aClass163Array2[local2549];
													}
													if (Static29.anInt438 == 0) {
														Static43.aClass163Array2 = new Class163[100];
													}
													Static43.aClass163Array2[local1599 + 1] = local3889;
													Static29.anInt438++;
													if (local973.equals(Static182.aClass1_Sub2_Sub1_Sub1_1.aString12)) {
														Static70.aByte22 = local3870;
													}
												}
												Static315.anInt5768 = Static245.anInt4796;
												Static178.aClass208_103 = null;
												return true;
											} else if (Static178.aClass208_103 == Static64.aClass208_28) {
												Static289.method4749(Static317.aClass213_13);
												Static178.aClass208_103 = null;
												return true;
											} else if (Static58.aClass208_26 == Static178.aClass208_103) {
												Static55.anInt1202 = Static321.aClass2_Sub24_Sub2_34.method5732();
												Static178.aClass208_103 = null;
												return true;
											} else if (Static178.aClass208_103 == Static198.aClass208_114) {
												local228 = Static321.aClass2_Sub24_Sub2_34.method5753();
												local70 = Static321.aClass2_Sub24_Sub2_34.method5723();
												Static179.aClass115_1.method2779(local70, local228);
												Static178.aClass208_103 = null;
												return true;
											} else if (Static160.aClass208_97 == Static178.aClass208_103) {
												Static289.method4749(Static13.aClass213_1);
												Static178.aClass208_103 = null;
												return true;
											} else if (Static240.aClass208_135 == Static178.aClass208_103) {
												local228 = Static321.aClass2_Sub24_Sub2_34.method5732();
												local70 = local228 >> 5;
												local424 = local228 & 0x1F;
												if (local424 == 0) {
													Static16.aClass247Array1[local70] = null;
													Static178.aClass208_103 = null;
													return true;
												}
												@Pc(4185) Class247 local4185 = new Class247();
												local4185.anInt6960 = local424;
												local4185.anInt6956 = Static321.aClass2_Sub24_Sub2_34.method5732();
												if (local4185.anInt6956 >= 0 && Static94.aClass27Array12.length > local4185.anInt6956) {
													if (local4185.anInt6960 == 1 || local4185.anInt6960 == 10) {
														local4185.anInt6955 = Static321.aClass2_Sub24_Sub2_34.method5753();
														Static321.aClass2_Sub24_Sub2_34.anInt6669 += 6;
													} else if (local4185.anInt6960 >= 2 && local4185.anInt6960 <= 6) {
														if (local4185.anInt6960 == 2) {
															local4185.anInt6952 = 64;
															local4185.anInt6959 = 64;
														}
														if (local4185.anInt6960 == 3) {
															local4185.anInt6959 = 0;
															local4185.anInt6952 = 64;
														}
														if (local4185.anInt6960 == 4) {
															local4185.anInt6952 = 64;
															local4185.anInt6959 = 128;
														}
														if (local4185.anInt6960 == 5) {
															local4185.anInt6959 = 64;
															local4185.anInt6952 = 0;
														}
														if (local4185.anInt6960 == 6) {
															local4185.anInt6959 = 64;
															local4185.anInt6952 = 128;
														}
														local4185.anInt6960 = 2;
														local4185.anInt6953 = Static321.aClass2_Sub24_Sub2_34.method5732();
														local4185.anInt6958 = Static321.aClass2_Sub24_Sub2_34.method5753();
														local4185.anInt6957 = Static321.aClass2_Sub24_Sub2_34.method5753();
														local4185.anInt6962 = Static321.aClass2_Sub24_Sub2_34.method5732();
														local4185.anInt6963 = Static321.aClass2_Sub24_Sub2_34.method5753();
													}
													local4185.anInt6954 = Static321.aClass2_Sub24_Sub2_34.method5753();
													if (local4185.anInt6954 == 65535) {
														local4185.anInt6954 = -1;
													}
													Static16.aClass247Array1[local70] = local4185;
												}
												Static178.aClass208_103 = null;
												return true;
											} else if (Static248.aClass208_137 == Static178.aClass208_103) {
												local228 = Static321.aClass2_Sub24_Sub2_34.method5714();
												local70 = Static321.aClass2_Sub24_Sub2_34.method5720();
												local424 = Static321.aClass2_Sub24_Sub2_34.method5753();
												if (Static192.method3514(local70)) {
													Static364.method5779(local424, local228);
												}
												Static178.aClass208_103 = null;
												return true;
											} else if (Static178.aClass208_103 == Static115.aClass208_64) {
												Static315.anInt5768 = Static245.anInt4796;
												if (Static248.anInt4821 == 0) {
													Static29.anInt438 = 0;
													Static251.aString44 = null;
													Static43.aClass163Array2 = null;
													Static178.aClass208_103 = null;
													Static66.aString17 = null;
													return true;
												}
												Static251.aString44 = Static321.aClass2_Sub24_Sub2_34.method5744();
												local1569 = Static321.aClass2_Sub24_Sub2_34.method5732() == 1;
												if (local1569) {
													Static321.aClass2_Sub24_Sub2_34.method5744();
												}
												@Pc(4417) long local4417 = Static321.aClass2_Sub24_Sub2_34.method5740();
												Static66.aString17 = Static7.method71(local4417);
												Static38.aByte11 = Static321.aClass2_Sub24_Sub2_34.method5759();
												local318 = Static321.aClass2_Sub24_Sub2_34.method5732();
												if (local318 == 255) {
													Static178.aClass208_103 = null;
													return true;
												}
												Static29.anInt438 = local318;
												@Pc(4443) Class163[] local4443 = new Class163[100];
												for (local326 = 0; local326 < Static29.anInt438; local326++) {
													local4443[local326] = new Class163();
													local4443[local326].aString39 = Static321.aClass2_Sub24_Sub2_34.method5744();
													local1569 = Static321.aClass2_Sub24_Sub2_34.method5732() == 1;
													if (local1569) {
														local4443[local326].aString40 = Static321.aClass2_Sub24_Sub2_34.method5744();
													} else {
														local4443[local326].aString40 = local4443[local326].aString39;
													}
													local4443[local326].aString37 = Static287.method4731(local4443[local326].aString40);
													local4443[local326].anInt4629 = Static321.aClass2_Sub24_Sub2_34.method5753();
													local4443[local326].aByte34 = Static321.aClass2_Sub24_Sub2_34.method5759();
													local4443[local326].aString38 = Static321.aClass2_Sub24_Sub2_34.method5744();
													if (local4443[local326].aString40.equals(Static182.aClass1_Sub2_Sub1_Sub1_1.aString12)) {
														Static70.aByte22 = local4443[local326].aByte34;
													}
												}
												local1599 = Static29.anInt438;
												while (local1599 > 0) {
													local3440 = true;
													local1599--;
													for (local2549 = 0; local2549 < local1599; local2549++) {
														if (local4443[local2549].aString37.compareTo(local4443[local2549 + 1].aString37) > 0) {
															local3889 = local4443[local2549];
															local4443[local2549] = local4443[local2549 + 1];
															local3440 = false;
															local4443[local2549 + 1] = local3889;
														}
													}
													if (local3440) {
														break;
													}
												}
												Static43.aClass163Array2 = local4443;
												Static178.aClass208_103 = null;
												return true;
											} else if (Static162.aClass208_100 == Static178.aClass208_103) {
												Static179.aClass115_1.method2783();
												Static71.anInt1580 += 32;
												Static178.aClass208_103 = null;
												return true;
											} else if (Static178.aClass208_103 == Static167.aClass208_101) {
												Static82.method1414(false);
												Static178.aClass208_103 = null;
												return false;
											} else if (Static178.aClass208_103 == Static116.aClass208_67) {
												local228 = Static321.aClass2_Sub24_Sub2_34.method5753();
												if (Static192.method3514(local228)) {
													Static89.method1498();
												}
												Static178.aClass208_103 = null;
												return true;
											} else if (Static178.aClass208_103 == Static344.aClass208_188) {
												local228 = Static321.aClass2_Sub24_Sub2_34.method5753();
												local70 = Static321.aClass2_Sub24_Sub2_34.method5776();
												if (Static192.method3514(local228)) {
													@Pc(4681) Class2_Sub26 local4681 = (Class2_Sub26) Static273.aClass243_20.method5967((long) local70);
													if (local4681 != null) {
														Static110.method2010(local4681, false, true);
													}
													if (Static392.aClass3_19 != null) {
														Static128.method2229(Static392.aClass3_19);
														Static392.aClass3_19 = null;
													}
												}
												Static178.aClass208_103 = null;
												return true;
											} else if (Static355.aClass208_193 == Static178.aClass208_103) {
												Static124.anInt4237 = Static321.aClass2_Sub24_Sub2_34.method5732();
												Static178.aClass208_103 = null;
												Static287.anInt5313 = Static245.anInt4796;
												return true;
											} else if (Static178.aClass208_103 == Static47.aClass208_20) {
												local228 = Static321.aClass2_Sub24_Sub2_34.method5722();
												local70 = Static321.aClass2_Sub24_Sub2_34.method5776();
												local424 = Static321.aClass2_Sub24_Sub2_34.method5732();
												local763 = "";
												local773 = local763;
												if ((local424 & 0x1) != 0) {
													local763 = Static321.aClass2_Sub24_Sub2_34.method5744();
													if ((local424 & 0x2) == 0) {
														local773 = local763;
													} else {
														local773 = Static321.aClass2_Sub24_Sub2_34.method5744();
													}
												}
												local779 = Static321.aClass2_Sub24_Sub2_34.method5744();
												if (local228 == 99) {
													Static375.method5958(local779);
												} else if (local773.equals("") || !Static14.method170(local773)) {
													Static383.method6001(local228, local773, local70, local763, local779);
												} else {
													Static178.aClass208_103 = null;
													return true;
												}
												Static178.aClass208_103 = null;
												return true;
											} else if (Static57.aClass208_25 == Static178.aClass208_103) {
												@Pc(4800) byte local4800 = Static321.aClass2_Sub24_Sub2_34.method5759();
												local70 = Static321.aClass2_Sub24_Sub2_34.method5753();
												Static179.aClass115_1.method2781(local70, local4800);
												Static178.aClass208_103 = null;
												return true;
											} else if (Static178.aClass208_103 == Static169.aClass208_163) {
												local2936 = Static321.aClass2_Sub24_Sub2_34.method5744();
												local973 = Static252.method4379(Static266.method4525(Static324.method5229(Static321.aClass2_Sub24_Sub2_34)));
												Static383.method6001(6, local2936, 0, local2936, local973);
												Static178.aClass208_103 = null;
												return true;
											} else if (Static347.aClass208_190 == Static178.aClass208_103) {
												local1569 = Static321.aClass2_Sub24_Sub2_34.method5732() == 1;
												local973 = Static321.aClass2_Sub24_Sub2_34.method5744();
												local759 = local973;
												if (local1569) {
													local759 = Static321.aClass2_Sub24_Sub2_34.method5744();
												}
												local1586 = Static321.aClass2_Sub24_Sub2_34.method5753();
												local1591 = Static321.aClass2_Sub24_Sub2_34.method5736();
												local1595 = Static321.aClass2_Sub24_Sub2_34.method5732();
												@Pc(4889) long local4889 = local1591 + (local1586 << 32);
												@Pc(4891) boolean local4891 = false;
												local3643 = 0;
												while (true) {
													if (local3643 >= 100) {
														if (local1595 <= 1) {
															if (Static243.aBoolean352 && !Static184.aBoolean280 || Static142.aBoolean215) {
																local4891 = true;
															} else if (Static14.method170(local759)) {
																local4891 = true;
															}
														}
														break;
													}
													if (local4889 == Static162.aLongArray3[local3643]) {
														local4891 = true;
														break;
													}
													local3643++;
												}
												if (!local4891 && Static350.anInt6468 == 0) {
													Static162.aLongArray3[Static218.anInt4414] = local4889;
													Static218.anInt4414 = (Static218.anInt4414 + 1) % 100;
													@Pc(4963) String local4963 = Static252.method4379(Static266.method4525(Static324.method5229(Static321.aClass2_Sub24_Sub2_34)));
													if (local1595 == 2) {
														Static295.method4840("<img=1>" + local759, -1, local4963, 7, 0, "<img=1>" + local973, null);
													} else if (local1595 == 1) {
														Static295.method4840("<img=0>" + local759, -1, local4963, 7, 0, "<img=0>" + local973, null);
													} else {
														Static295.method4840(local759, -1, local4963, 3, 0, local973, null);
													}
												}
												Static178.aClass208_103 = null;
												return true;
											} else if (Static178.aClass208_103 == Static294.aClass208_161) {
												Static289.method4749(Static265.aClass213_12);
												Static178.aClass208_103 = null;
												return true;
											} else if (Static178.aClass208_103 == Static135.aClass208_81) {
												Static289.method4749(Static18.aClass213_3);
												Static178.aClass208_103 = null;
												return true;
											} else if (Static178.aClass208_103 == Static327.aClass208_175) {
												local1569 = Static321.aClass2_Sub24_Sub2_34.method5732() == 1;
												local973 = Static321.aClass2_Sub24_Sub2_34.method5744();
												local759 = local973;
												if (local1569) {
													local759 = Static321.aClass2_Sub24_Sub2_34.method5744();
												}
												local1586 = Static321.aClass2_Sub24_Sub2_34.method5740();
												local1591 = Static321.aClass2_Sub24_Sub2_34.method5753();
												local2545 = Static321.aClass2_Sub24_Sub2_34.method5736();
												local2549 = Static321.aClass2_Sub24_Sub2_34.method5732();
												@Pc(5100) long local5100 = local2545 + (local1591 << 32);
												@Pc(5102) boolean local5102 = false;
												@Pc(5104) int local5104 = 0;
												while (true) {
													if (local5104 >= 100) {
														if (local2549 <= 1) {
															if (Static243.aBoolean352 && !Static184.aBoolean280 || Static142.aBoolean215) {
																local5102 = true;
															} else if (Static14.method170(local759)) {
																local5102 = true;
															}
														}
														break;
													}
													if (local5100 == Static162.aLongArray3[local5104]) {
														local5102 = true;
														break;
													}
													local5104++;
												}
												if (!local5102 && Static350.anInt6468 == 0) {
													Static162.aLongArray3[Static218.anInt4414] = local5100;
													Static218.anInt4414 = (Static218.anInt4414 + 1) % 100;
													local3679 = Static252.method4379(Static266.method4525(Static324.method5229(Static321.aClass2_Sub24_Sub2_34)));
													if (local2549 == 2 || local2549 == 3) {
														Static295.method4840("<img=1>" + local759, -1, local3679, 9, 0, "<img=1>" + local973, Static94.method1601(local1586));
													} else if (local2549 == 1) {
														Static295.method4840("<img=0>" + local759, -1, local3679, 9, 0, "<img=0>" + local973, Static94.method1601(local1586));
													} else {
														Static295.method4840(local759, -1, local3679, 9, 0, local973, Static94.method1601(local1586));
													}
												}
												Static178.aClass208_103 = null;
												return true;
											} else if (Static31.aClass208_9 == Static178.aClass208_103) {
												if (Static33.aFrame2 != null) {
													Static314.method5081(-1, Static202.anInt4200, false, -1);
												}
												@Pc(5264) byte[] local5264 = new byte[Static248.anInt4821];
												Static321.aClass2_Sub24_Sub2_34.method5780(local5264, Static248.anInt4821);
												local973 = Static378.method4271(Static248.anInt4821, local5264, 0);
												Static171.method3041(Static36.anInt2910 == 1, local973, Static154.aClass123_2, true);
												Static178.aClass208_103 = null;
												return true;
											} else if (Static51.aClass208_24 == Static178.aClass208_103) {
												local228 = Static321.aClass2_Sub24_Sub2_34.method5720();
												local70 = Static321.aClass2_Sub24_Sub2_34.method5767();
												local424 = Static321.aClass2_Sub24_Sub2_34.method5720();
												local318 = Static321.aClass2_Sub24_Sub2_34.method5745();
												if (local318 >> 30 == 0) {
													@Pc(5516) Class102 local5516;
													@Pc(5442) Class182 local5442;
													@Pc(5492) Class182 local5492;
													@Pc(5455) Class102 local5455;
													@Pc(5510) Class102 local5510;
													if (local318 >> 29 != 0) {
														local320 = local318 & 0xFFFF;
														@Pc(5414) Class1_Sub2_Sub1_Sub2 local5414 = Static223.aClass1_Sub2_Sub1_Sub2Array1[local320];
														if (local5414 != null) {
															if (local228 == 65535) {
																local228 = -1;
															}
															local3440 = true;
															if (local228 != -1 && local5414.anInt5396 != -1) {
																if (local5414.anInt5396 == local228) {
																	local5442 = Static153.aClass116_1.method2791(local228);
																	if (local5442.aBoolean374 && local5442.anInt5101 != -1) {
																		local5455 = Static333.aClass50_2.method1175(local5442.anInt5101);
																		local2549 = local5455.anInt2985;
																		if (local2549 == 0 || local2549 == 2) {
																			local3440 = false;
																		} else if (local2549 == 1) {
																			local3440 = true;
																		}
																	}
																} else {
																	local5442 = Static153.aClass116_1.method2791(local228);
																	local5492 = Static153.aClass116_1.method2791(local5414.anInt5396);
																	if (local5442.anInt5101 != -1 && local5492.anInt5101 != -1) {
																		local5510 = Static333.aClass50_2.method1175(local5442.anInt5101);
																		local5516 = Static333.aClass50_2.method1175(local5492.anInt5101);
																		if (local5516.anInt2992 > local5510.anInt2992) {
																			local3440 = false;
																		}
																	}
																}
															}
															if (local3440) {
																local5414.anInt5423 = local424;
																local5414.anInt5391 = 0;
																local5414.anInt5404 = 0;
																local5414.anInt5390 = local70 + Static339.anInt6265;
																local5414.anInt5364 = 1;
																local5414.anInt5396 = local228;
																if (local5414.anInt5390 > Static339.anInt6265) {
																	local5414.anInt5404 = -1;
																}
																if (local5414.anInt5396 != -1 && local5414.anInt5390 == Static339.anInt6265) {
																	local1595 = Static153.aClass116_1.method2791(local5414.anInt5396).anInt5101;
																	if (local1595 != -1) {
																		local5455 = Static333.aClass50_2.method1175(local1595);
																		if (local5455 != null && local5455.anIntArray231 != null) {
																			Static343.method5495(local5455, false, local5414.anInt6800, 0, local5414.anInt6798, local5414.aByte73);
																		}
																	}
																}
															}
														}
													} else if (local318 >> 28 != 0) {
														local320 = local318 & 0xFFFF;
														@Pc(5628) Class1_Sub2_Sub1_Sub1 local5628;
														if (Static93.anInt1976 == local320) {
															local5628 = Static182.aClass1_Sub2_Sub1_Sub1_1;
														} else {
															local5628 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local320];
														}
														if (local5628 != null) {
															if (local228 == 65535) {
																local228 = -1;
															}
															local3440 = true;
															if (local228 != -1 && local5628.anInt5396 != -1) {
																if (local5628.anInt5396 == local228) {
																	local5442 = Static153.aClass116_1.method2791(local228);
																	if (local5442.aBoolean374 && local5442.anInt5101 != -1) {
																		local5455 = Static333.aClass50_2.method1175(local5442.anInt5101);
																		local2549 = local5455.anInt2985;
																		if (local2549 == 0 || local2549 == 2) {
																			local3440 = false;
																		} else if (local2549 == 1) {
																			local3440 = true;
																		}
																	}
																} else {
																	local5442 = Static153.aClass116_1.method2791(local228);
																	local5492 = Static153.aClass116_1.method2791(local5628.anInt5396);
																	if (local5442.anInt5101 != -1 && local5492.anInt5101 != -1) {
																		local5510 = Static333.aClass50_2.method1175(local5442.anInt5101);
																		local5516 = Static333.aClass50_2.method1175(local5492.anInt5101);
																		if (local5516.anInt2992 > local5510.anInt2992) {
																			local3440 = false;
																		}
																	}
																}
															}
															if (local3440) {
																local5628.anInt5396 = local228;
																local5628.anInt5423 = local424;
																local5628.anInt5404 = 0;
																local5628.anInt5391 = 0;
																local5628.anInt5390 = local70 + Static339.anInt6265;
																local5628.anInt5364 = 1;
																if (Static339.anInt6265 < local5628.anInt5390) {
																	local5628.anInt5404 = -1;
																}
																if (local5628.anInt5396 == 65535) {
																	local5628.anInt5396 = -1;
																}
																if (local5628.anInt5396 != -1 && local5628.anInt5390 == Static339.anInt6265) {
																	local1595 = Static153.aClass116_1.method2791(local5628.anInt5396).anInt5101;
																	if (local1595 != -1) {
																		local5455 = Static333.aClass50_2.method1175(local1595);
																		if (local5455 != null && local5455.anIntArray231 != null) {
																			Static343.method5495(local5455, Static182.aClass1_Sub2_Sub1_Sub1_1 == local5628, local5628.anInt6800, 0, local5628.anInt6798, local5628.aByte73);
																		}
																	}
																}
															}
														}
													}
												} else {
													local320 = local318 >> 28 & 0x3;
													local326 = (local318 >> 14 & 0x3FFF) - Static279.anInt5198;
													local337 = (local318 & 0x3FFF) - Static350.anInt6470;
													if (local326 >= 0 && local337 >= 0 && local326 < Static89.anInt1891 && local337 < Static85.anInt1839) {
														local1595 = local326 * 128 + 64;
														local1599 = local337 * 128 + 64;
														@Pc(5390) Class1_Sub2_Sub6 local5390 = new Class1_Sub2_Sub6(local228, 0, Static339.anInt6265, local320, local1595, Static36.method2335(local1599, local320, local1595) - local424, local1599, local326, local326, local337, local337);
														Static248.aClass238_25.method5796(new Class2_Sub7_Sub7(local5390));
													}
												}
												Static178.aClass208_103 = null;
												return true;
											} else {
												Static346.method5531(null, "T1 - " + (Static178.aClass208_103 == null ? -1 : Static178.aClass208_103.method5104()) + "," + (Static217.aClass208_121 == null ? -1 : Static217.aClass208_121.method5104()) + "," + (Static198.aClass208_113 == null ? -1 : Static198.aClass208_113.method5104()) + " - " + Static248.anInt4821);
												Static241.method2190();
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

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!g;I)I")
	public static int method584(@OriginalArg(0) Class83 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method1958(Static129.anInt2810)) {
			local5++;
		}
		if (arg0.method1958(Static145.anInt5346)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	public static void method585() {
		Static233.anInt4642 = 0;
		Static262.aClass238_29.method5806();
		Static262.aClass238_29.method5796(Static261.aClass2_Sub43_2);
		Static233.anInt4642++;
	}
}
