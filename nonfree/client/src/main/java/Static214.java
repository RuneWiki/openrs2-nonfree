import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "Lclient!ff;")
	public static Class99 aClass99_1;

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString45;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)Z")
	public static boolean method3735() throws IOException {
		if (Static393.aClass8_2 == null) {
			return false;
		}
		@Pc(71) int local71;
		if (Static576.aClass276_150 == null) {
			if (Static360.aBoolean136) {
				if (!Static393.aClass8_2.method359(1)) {
					return false;
				}
				Static393.aClass8_2.method360(Static89.aClass3_Sub7_Sub1_2.aByteArray86, 0, 1);
				Static360.aBoolean136 = false;
				Static63.anInt1626++;
				Static434.anInt8349 = 0;
			}
			Static89.aClass3_Sub7_Sub1_2.anInt7869 = 0;
			if (Static89.aClass3_Sub7_Sub1_2.method1493()) {
				if (!Static393.aClass8_2.method359(1)) {
					return false;
				}
				Static393.aClass8_2.method360(Static89.aClass3_Sub7_Sub1_2.aByteArray86, 1, 1);
				Static63.anInt1626++;
				Static434.anInt8349 = 0;
			}
			Static360.aBoolean136 = true;
			@Pc(67) Class276[] local67 = Static46.method1200();
			local71 = Static89.aClass3_Sub7_Sub1_2.method1494();
			if (local71 < 0 || local71 >= local67.length) {
				throw new IOException("invo:" + local71 + " ip:" + Static89.aClass3_Sub7_Sub1_2.anInt7869);
			}
			Static576.aClass276_150 = local67[local71];
			Static79.anInt10464 = Static576.aClass276_150.anInt8403;
		}
		if (Static79.anInt10464 == -1) {
			if (!Static393.aClass8_2.method359(1)) {
				return false;
			}
			Static393.aClass8_2.method360(Static89.aClass3_Sub7_Sub1_2.aByteArray86, 0, 1);
			Static434.anInt8349 = 0;
			Static79.anInt10464 = Static89.aClass3_Sub7_Sub1_2.aByteArray86[0] & 0xFF;
			Static63.anInt1626++;
		}
		if (Static79.anInt10464 == -2) {
			if (!Static393.aClass8_2.method359(2)) {
				return false;
			}
			Static393.aClass8_2.method360(Static89.aClass3_Sub7_Sub1_2.aByteArray86, 0, 2);
			Static89.aClass3_Sub7_Sub1_2.anInt7869 = 0;
			Static79.anInt10464 = Static89.aClass3_Sub7_Sub1_2.method6535();
			Static63.anInt1626 += 2;
			Static434.anInt8349 = 0;
		}
		if (Static79.anInt10464 > 0) {
			if (!Static393.aClass8_2.method359(Static79.anInt10464)) {
				return false;
			}
			Static89.aClass3_Sub7_Sub1_2.anInt7869 = 0;
			Static393.aClass8_2.method360(Static89.aClass3_Sub7_Sub1_2.aByteArray86, 0, Static79.anInt10464);
			Static434.anInt8349 = 0;
			Static63.anInt1626 += Static79.anInt10464;
		}
		Static403.aClass276_102 = Static91.aClass276_28;
		Static91.aClass276_28 = Static467.aClass276_124;
		Static467.aClass276_124 = Static576.aClass276_150;
		if (Static576.aClass276_150 == Static437.aClass276_116) {
			Static126.method2518();
			Static576.aClass276_150 = null;
			return false;
		}
		@Pc(222) int local222;
		if (Static270.aClass276_58 == Static576.aClass276_150) {
			local222 = Static89.aClass3_Sub7_Sub1_2.method6535();
			local71 = Static89.aClass3_Sub7_Sub1_2.method6554();
			if (Static311.method5197(local222)) {
				Static82.method1138(-1, 3, -1, local71);
			}
			Static576.aClass276_150 = null;
			return true;
		}
		@Pc(257) int local257;
		if (Static327.aClass276_86 == Static576.aClass276_150) {
			local222 = Static89.aClass3_Sub7_Sub1_2.method6497();
			local71 = Static89.aClass3_Sub7_Sub1_2.method6535();
			local257 = Static89.aClass3_Sub7_Sub1_2.method6532();
			if (local257 == 65535) {
				local257 = -1;
			}
			if (Static311.method5197(local71)) {
				Static274.method4780(local257, local222);
			}
			Static576.aClass276_150 = null;
			return true;
		}
		@Pc(293) String local293;
		@Pc(295) String local295;
		@Pc(326) String local326;
		if (Static576.aClass276_150 == Static375.aClass276_96) {
			local222 = Static89.aClass3_Sub7_Sub1_2.method6542();
			local71 = Static89.aClass3_Sub7_Sub1_2.method6497();
			local257 = Static89.aClass3_Sub7_Sub1_2.method6538();
			local293 = "";
			local295 = local293;
			if ((local257 & 0x1) != 0) {
				local293 = Static89.aClass3_Sub7_Sub1_2.method6536();
				if ((local257 & 0x2) == 0) {
					local295 = local293;
				} else {
					local295 = Static89.aClass3_Sub7_Sub1_2.method6536();
				}
			}
			local326 = Static89.aClass3_Sub7_Sub1_2.method6536();
			if (local222 == 99) {
				Static454.method7045(local326);
			} else if (local295.equals("") || !Static502.method7569(local295)) {
				Static348.method2212(local71, local295, local222, local293, local326, local293);
			} else {
				Static576.aClass276_150 = null;
				return true;
			}
			Static576.aClass276_150 = null;
			return true;
		} else if (Static591.aClass276_155 == Static576.aClass276_150) {
			Static39.method1143(Static107.aClass110_14);
			Static576.aClass276_150 = null;
			return true;
		} else {
			@Pc(394) int local394;
			@Pc(398) int local398;
			@Pc(400) int local400;
			@Pc(389) boolean local389;
			if (Static519.aClass276_140 == Static576.aClass276_150) {
				local222 = Static89.aClass3_Sub7_Sub1_2.method6535();
				local71 = Static89.aClass3_Sub7_Sub1_2.method6538();
				local389 = (local71 & 0x1) == 1;
				while (Static79.anInt10464 > Static89.aClass3_Sub7_Sub1_2.anInt7869) {
					local394 = Static89.aClass3_Sub7_Sub1_2.method6542();
					local398 = Static89.aClass3_Sub7_Sub1_2.method6535();
					local400 = 0;
					if (local398 != 0) {
						local400 = Static89.aClass3_Sub7_Sub1_2.method6538();
						if (local400 == 255) {
							local400 = Static89.aClass3_Sub7_Sub1_2.method6497();
						}
					}
					Static115.method2336(local400, local398 - 1, local389, local394, local222);
				}
				Static312.anIntArray430[Static140.anInt9492++ & 0x1F] = local222;
				Static576.aClass276_150 = null;
				return true;
			} else if (Static576.aClass276_150 == Static455.aClass276_121) {
				if (Static25.anInt779 != -1) {
					Static474.method7273(0, Static25.anInt779);
				}
				Static576.aClass276_150 = null;
				return true;
			} else {
				@Pc(474) String local474;
				@Pc(462) String local462;
				if (Static65.aClass276_23 == Static576.aClass276_150) {
					local462 = Static89.aClass3_Sub7_Sub1_2.method6536();
					local71 = Static89.aClass3_Sub7_Sub1_2.method6535();
					local474 = Static25.aClass189_1.method4916(local71).method6946(Static89.aClass3_Sub7_Sub1_2);
					Static209.method3675(0, null, local474, local71, local462, local462, 19, local462);
					Static576.aClass276_150 = null;
					return true;
				} else if (Static438.aClass276_117 == Static576.aClass276_150) {
					local222 = Static89.aClass3_Sub7_Sub1_2.method6541();
					local71 = Static89.aClass3_Sub7_Sub1_2.method6521();
					local474 = Static89.aClass3_Sub7_Sub1_2.method6536();
					if (Static311.method5197(local71)) {
						Static193.method2190(local474, local222);
					}
					Static576.aClass276_150 = null;
					return true;
				} else if (Static327.aClass276_87 == Static576.aClass276_150) {
					Static581.anInt10231 = Static89.aClass3_Sub7_Sub1_2.method6507();
					Static397.aBoolean649 = Static89.aClass3_Sub7_Sub1_2.method6538() == 1;
					Static576.aClass276_150 = null;
					return true;
				} else if (Static576.aClass276_150 == Static298.aClass276_76) {
					local222 = Static89.aClass3_Sub7_Sub1_2.method6541();
					local71 = Static89.aClass3_Sub7_Sub1_2.method6547();
					local389 = (local71 & 0x1) == 1;
					Static164.method3083(local389, local222);
					Static312.anIntArray430[Static140.anInt9492++ & 0x1F] = local222;
					Static576.aClass276_150 = null;
					return true;
				} else if (Static576.aClass276_150 == Static393.aClass276_99) {
					Static233.method4046(false);
					Static576.aClass276_150 = null;
					return false;
				} else if (Static493.aClass276_134 == Static576.aClass276_150) {
					local222 = Static89.aClass3_Sub7_Sub1_2.method6548();
					local71 = Static89.aClass3_Sub7_Sub1_2.method6535();
					local257 = Static89.aClass3_Sub7_Sub1_2.method6521();
					if (local257 == 65535) {
						local257 = -1;
					}
					local394 = Static89.aClass3_Sub7_Sub1_2.method6548();
					if (Static311.method5197(local71)) {
						Static53.method1293(local222, local394, local257);
						@Pc(627) Class18 local627 = Static517.aClass23_2.method901(local257);
						Static329.method5693(local627.anInt660, local222, local627.anInt640, local627.anInt623);
						Static253.method4545(local627.anInt635, local627.anInt642, local222, local627.anInt673);
					}
					Static576.aClass276_150 = null;
					return true;
				} else if (Static576.aClass276_150 == Static1.aClass276_1) {
					local222 = Static89.aClass3_Sub7_Sub1_2.method6535();
					if (Static311.method5197(local222)) {
						Static181.method3223();
					}
					Static576.aClass276_150 = null;
					return true;
				} else if (Static259.aClass276_65 == Static576.aClass276_150) {
					Static593.method8374(false);
					Static576.aClass276_150 = null;
					return true;
				} else if (Static576.aClass276_150 == Static404.aClass276_103) {
					local222 = Static89.aClass3_Sub7_Sub1_2.method6535();
					if (local222 == 65535) {
						local222 = -1;
					}
					local71 = Static89.aClass3_Sub7_Sub1_2.method6538();
					local257 = Static89.aClass3_Sub7_Sub1_2.method6535();
					local394 = Static89.aClass3_Sub7_Sub1_2.method6538();
					Static546.method7996(local394, local222, local71, local257);
					Static576.aClass276_150 = null;
					return true;
				} else if (Static576.aClass276_150 == Static518.aClass276_139) {
					local222 = Static89.aClass3_Sub7_Sub1_2.method6538();
					local71 = local222 >> 5;
					local257 = local222 & 0x1F;
					if (local257 == 0) {
						Static516.aClass357Array3[local71] = null;
						Static576.aClass276_150 = null;
						return true;
					}
					@Pc(751) Class357 local751 = new Class357();
					local751.anInt10299 = local257;
					local751.anInt10304 = Static89.aClass3_Sub7_Sub1_2.method6538();
					if (local751.anInt10304 >= 0 && local751.anInt10304 < Static78.aClass37Array3.length) {
						if (local751.anInt10299 == 1 || local751.anInt10299 == 10) {
							local751.anInt10302 = Static89.aClass3_Sub7_Sub1_2.method6535();
							Static89.aClass3_Sub7_Sub1_2.anInt7869 += 6;
						} else if (local751.anInt10299 >= 2 && local751.anInt10299 <= 6) {
							if (local751.anInt10299 == 2) {
								local751.anInt10303 = 256;
								local751.anInt10300 = 256;
							}
							if (local751.anInt10299 == 3) {
								local751.anInt10303 = 256;
								local751.anInt10300 = 0;
							}
							if (local751.anInt10299 == 4) {
								local751.anInt10303 = 256;
								local751.anInt10300 = 512;
							}
							if (local751.anInt10299 == 5) {
								local751.anInt10300 = 256;
								local751.anInt10303 = 0;
							}
							if (local751.anInt10299 == 6) {
								local751.anInt10303 = 512;
								local751.anInt10300 = 256;
							}
							local751.anInt10299 = 2;
							local751.anInt10298 = Static89.aClass3_Sub7_Sub1_2.method6538();
							local751.anInt10300 += Static89.aClass3_Sub7_Sub1_2.method6535() - Static230.anInt4667 << 9;
							local751.anInt10303 += Static89.aClass3_Sub7_Sub1_2.method6535() - Static563.anInt10006 << 9;
							local751.anInt10301 = Static89.aClass3_Sub7_Sub1_2.method6538() << 2;
							local751.anInt10305 = Static89.aClass3_Sub7_Sub1_2.method6535();
						}
						local751.anInt10308 = Static89.aClass3_Sub7_Sub1_2.method6535();
						if (local751.anInt10308 == 65535) {
							local751.anInt10308 = -1;
						}
						Static516.aClass357Array3[local71] = local751;
					}
					Static576.aClass276_150 = null;
					return true;
				} else if (Static576.aClass276_150 == Static368.aClass276_94) {
					Static39.method1143(Static237.aClass110_23);
					Static576.aClass276_150 = null;
					return true;
				} else if (Static110.aClass276_34 == Static576.aClass276_150) {
					local222 = Static89.aClass3_Sub7_Sub1_2.method6544();
					local71 = Static89.aClass3_Sub7_Sub1_2.method6521();
					if (local71 == 65535) {
						local71 = -1;
					}
					local257 = Static89.aClass3_Sub7_Sub1_2.method6532();
					if (Static311.method5197(local257)) {
						Static82.method1138(-1, 1, local71, local222);
					}
					Static576.aClass276_150 = null;
					return true;
				} else {
					@Pc(990) String local990;
					if (Static474.aClass276_128 == Static576.aClass276_150) {
						local222 = Static89.aClass3_Sub7_Sub1_2.method6535();
						local990 = Static89.aClass3_Sub7_Sub1_2.method6536();
						@Pc(996) Object[] local996 = new Object[local990.length() + 1];
						for (local394 = local990.length() - 1; local394 >= 0; local394--) {
							if (local990.charAt(local394) == 's') {
								local996[local394 + 1] = Static89.aClass3_Sub7_Sub1_2.method6536();
							} else {
								local996[local394 + 1] = Integer.valueOf(Static89.aClass3_Sub7_Sub1_2.method6497());
							}
						}
						local996[0] = Integer.valueOf(Static89.aClass3_Sub7_Sub1_2.method6497());
						if (Static311.method5197(local222)) {
							@Pc(1049) Class3_Sub38 local1049 = new Class3_Sub38();
							local1049.anObjectArray4 = local996;
							Static597.method8423(local1049);
						}
						Static576.aClass276_150 = null;
						return true;
					} else if (Static323.aClass276_85 == Static576.aClass276_150) {
						local222 = Static89.aClass3_Sub7_Sub1_2.method6535();
						if (Static311.method5197(local222)) {
							Static33.method1058();
						}
						Static576.aClass276_150 = null;
						return true;
					} else if (Static272.aClass276_68 == Static576.aClass276_150) {
						local222 = Static89.aClass3_Sub7_Sub1_2.method6497();
						local71 = Static89.aClass3_Sub7_Sub1_2.method6541();
						local257 = Static89.aClass3_Sub7_Sub1_2.method6501();
						local394 = Static89.aClass3_Sub7_Sub1_2.method6525();
						if (Static311.method5197(local71)) {
							Static242.method4282(local257, local394, local222);
						}
						Static576.aClass276_150 = null;
						return true;
					} else if (Static576.aClass276_150 == Static591.aClass276_154) {
						Static215.anInt6071 = Static89.aClass3_Sub7_Sub1_2.method6525();
						Static576.aClass276_150 = null;
						Static596.anInt10437 = Static509.anInt9418;
						return true;
					} else if (Static132.aClass276_81 == Static576.aClass276_150) {
						Static94.anInt2306 = Static89.aClass3_Sub7_Sub1_2.method6538();
						Static596.anInt10437 = Static509.anInt9418;
						Static576.aClass276_150 = null;
						return true;
					} else if (Static576.aClass276_150 == Static397.aClass276_100) {
						local462 = Static89.aClass3_Sub7_Sub1_2.method6536();
						local71 = Static89.aClass3_Sub7_Sub1_2.method6535();
						local257 = Static89.aClass3_Sub7_Sub1_2.method6497();
						if (Static311.method5197(local71)) {
							Static64.method1601(local462, local257);
						}
						Static576.aClass276_150 = null;
						return true;
					} else if (Static576.aClass276_150 == Static57.aClass276_19) {
						local222 = Static89.aClass3_Sub7_Sub1_2.method6538();
						local71 = Static89.aClass3_Sub7_Sub1_2.method6538();
						local257 = Static89.aClass3_Sub7_Sub1_2.method6497();
						Static408.anIntArray493[local222] = local257;
						Static456.anIntArray526[local222] = local71;
						Static457.anIntArray625[local222] = 1;
						local394 = Static257.anIntArray332[local222] - 1;
						for (local398 = 0; local398 < local394; local398++) {
							if (local257 >= Class15_Sub3.anIntArray314[local398]) {
								Static457.anIntArray625[local222] = local398 + 2;
							}
						}
						Static48.anIntArray71[Static19.anInt609++ & 0x1F] = local222;
						Static576.aClass276_150 = null;
						return true;
					} else if (Static493.aClass276_133 == Static576.aClass276_150) {
						local222 = Static89.aClass3_Sub7_Sub1_2.method6535();
						local71 = Static89.aClass3_Sub7_Sub1_2.method6554();
						local257 = Static89.aClass3_Sub7_Sub1_2.method6541();
						if (Static311.method5197(local257)) {
							Static120.method2387(local71, local222);
						}
						Static576.aClass276_150 = null;
						return true;
					} else if (Static82.aClass276_11 == Static576.aClass276_150) {
						local222 = Static89.aClass3_Sub7_Sub1_2.method6521();
						local71 = Static89.aClass3_Sub7_Sub1_2.method6541();
						local257 = Static89.aClass3_Sub7_Sub1_2.method6532();
						if (Static311.method5197(local257)) {
							Static410.method6644(local71, local222);
						}
						Static576.aClass276_150 = null;
						return true;
					} else if (Static576.aClass276_150 == Static280.aClass276_145) {
						local222 = Static89.aClass3_Sub7_Sub1_2.method6535();
						local71 = Static89.aClass3_Sub7_Sub1_2.method6497();
						if (Static311.method5197(local222)) {
							@Pc(1314) Class3_Sub18 local1314 = (Class3_Sub18) Static283.aClass25_23.method946((long) local71);
							if (local1314 != null) {
								Static146.method8079(false, true, local1314);
							}
							if (Static321.aClass305_8 != null) {
								Static282.method4860(Static321.aClass305_8);
								Static321.aClass305_8 = null;
							}
						}
						Static576.aClass276_150 = null;
						return true;
					} else if (Static453.aClass276_120 == Static576.aClass276_150) {
						Static86.method1924();
						Static576.aClass276_150 = null;
						return true;
					} else if (Static572.aClass276_149 == Static576.aClass276_150) {
						Static39.method1143(Static570.aClass110_31);
						Static576.aClass276_150 = null;
						return true;
					} else if (Static576.aClass276_150 == Static538.aClass276_142) {
						Static39.method1143(Static497.aClass110_37);
						Static576.aClass276_150 = null;
						return true;
					} else if (Static384.aClass276_98 == Static576.aClass276_150) {
						local222 = Static89.aClass3_Sub7_Sub1_2.method6535();
						local71 = Static89.aClass3_Sub7_Sub1_2.method6535();
						local257 = Static89.aClass3_Sub7_Sub1_2.method6535();
						local394 = Static89.aClass3_Sub7_Sub1_2.method6535();
						if (Static311.method5197(local222) && Static108.aClass305ArrayArray1[local71] != null) {
							for (local398 = local257; local398 < local394; local398++) {
								local400 = Static89.aClass3_Sub7_Sub1_2.method6506();
								if (Static108.aClass305ArrayArray1[local71].length > local398 && Static108.aClass305ArrayArray1[local71][local398] != null) {
									Static108.aClass305ArrayArray1[local71][local398].anInt9241 = local400;
								}
							}
						}
						Static576.aClass276_150 = null;
						return true;
					} else if (Static576.aClass276_150 == Static288.aClass276_73) {
						Static452.aClass87_5 = Static553.method8063(Static89.aClass3_Sub7_Sub1_2.method6538());
						Static576.aClass276_150 = null;
						return true;
					} else if (Static576.aClass276_150 == Static47.aClass276_14) {
						Static591.aString134 = Static79.anInt10464 > 2 ? Static89.aClass3_Sub7_Sub1_2.method6536() : Static139.aClass101_25.method2841(Static126.anInt2904);
						Static446.anInt8510 = Static79.anInt10464 <= 0 ? -1 : Static89.aClass3_Sub7_Sub1_2.method6535();
						Static576.aClass276_150 = null;
						if (Static446.anInt8510 == 65535) {
							Static446.anInt8510 = -1;
						}
						return true;
					} else {
						@Pc(1670) int local1670;
						@Pc(1561) int local1561;
						@Pc(1532) String local1532;
						@Pc(1521) boolean local1521;
						@Pc(1570) int local1570;
						@Pc(1536) Class34 local1536;
						if (Static576.aClass276_150 == Static549.aClass276_146) {
							local462 = Static89.aClass3_Sub7_Sub1_2.method6536();
							local389 = Static89.aClass3_Sub7_Sub1_2.method6538() == 1;
							if (local389) {
								local990 = Static89.aClass3_Sub7_Sub1_2.method6536();
							} else {
								local990 = local462;
							}
							local394 = Static89.aClass3_Sub7_Sub1_2.method6535();
							@Pc(1519) byte local1519 = Static89.aClass3_Sub7_Sub1_2.method6529();
							local1521 = false;
							if (local1519 == -128) {
								local1521 = true;
							}
							if (local1521) {
								if (Static447.anInt8540 == 0) {
									Static576.aClass276_150 = null;
									return true;
								}
								for (local1670 = 0; local1670 < Static447.anInt8540 && (!Static535.aClass34Array1[local1670].aString9.equals(local990) || Static535.aClass34Array1[local1670].anInt1106 != local394); local1670++) {
								}
								if (Static447.anInt8540 > local1670) {
									while (Static447.anInt8540 - 1 > local1670) {
										Static535.aClass34Array1[local1670] = Static535.aClass34Array1[local1670 + 1];
										local1670++;
									}
									Static447.anInt8540--;
									Static535.aClass34Array1[Static447.anInt8540] = null;
								}
							} else {
								local1532 = Static89.aClass3_Sub7_Sub1_2.method6536();
								local1536 = new Class34();
								local1536.aString9 = local990;
								local1536.aString8 = local462;
								local1536.aString10 = Static67.method8230(local1536.aString9);
								local1536.aByte4 = local1519;
								local1536.aString11 = local1532;
								local1536.anInt1106 = local394;
								for (local1561 = Static447.anInt8540 - 1; local1561 >= 0; local1561--) {
									local1570 = Static535.aClass34Array1[local1561].aString10.compareTo(local1536.aString10);
									if (local1570 == 0) {
										Static535.aClass34Array1[local1561].anInt1106 = local394;
										Static535.aClass34Array1[local1561].aByte4 = local1519;
										Static535.aClass34Array1[local1561].aString11 = local1532;
										if (local990.equals(Static443.aClass2_Sub2_Sub1_Sub1_2.aString23)) {
											Static95.aByte23 = local1519;
										}
										Static576.aClass276_150 = null;
										Static188.anInt3750 = Static509.anInt9418;
										return true;
									}
									if (local1570 < 0) {
										break;
									}
								}
								if (Static447.anInt8540 >= Static535.aClass34Array1.length) {
									Static576.aClass276_150 = null;
									return true;
								}
								for (local1570 = Static447.anInt8540 - 1; local1570 > local1561; local1570--) {
									Static535.aClass34Array1[local1570 + 1] = Static535.aClass34Array1[local1570];
								}
								if (Static447.anInt8540 == 0) {
									Static535.aClass34Array1 = new Class34[100];
								}
								Static535.aClass34Array1[local1561 + 1] = local1536;
								Static447.anInt8540++;
								if (local990.equals(Static443.aClass2_Sub2_Sub1_Sub1_2.aString23)) {
									Static95.aByte23 = local1519;
								}
							}
							Static576.aClass276_150 = null;
							Static188.anInt3750 = Static509.anInt9418;
							return true;
						} else if (Static296.aClass276_75 == Static576.aClass276_150) {
							Static397.method6330();
							Static576.aClass276_150 = null;
							return false;
						} else if (Static144.aClass276_41 == Static576.aClass276_150) {
							Static588.aClass322_1.method7759();
							Static141.anInt3259 += 32;
							Static576.aClass276_150 = null;
							return true;
						} else if (Static65.aClass276_22 == Static576.aClass276_150) {
							Static233.method4046(Static452.aBoolean253);
							Static576.aClass276_150 = null;
							return false;
						} else if (Static188.aClass276_51 == Static576.aClass276_150) {
							local222 = Static89.aClass3_Sub7_Sub1_2.method6547();
							local71 = Static89.aClass3_Sub7_Sub1_2.method6541();
							if (Static311.method5197(local71)) {
								Static427.anInt9470 = local222;
							}
							Static576.aClass276_150 = null;
							return true;
						} else if (Static576.aClass276_150 == Static420.aClass276_112) {
							local222 = Static89.aClass3_Sub7_Sub1_2.method6521();
							local71 = Static89.aClass3_Sub7_Sub1_2.method6497();
							local257 = Static89.aClass3_Sub7_Sub1_2.method6535();
							if (Static311.method5197(local257)) {
								Static300.method6048(local71, local222);
							}
							Static576.aClass276_150 = null;
							return true;
						} else if (Static576.aClass276_150 == Static163.aClass276_46) {
							local222 = Static89.aClass3_Sub7_Sub1_2.method6532();
							local71 = Static89.aClass3_Sub7_Sub1_2.method6544();
							local257 = Static89.aClass3_Sub7_Sub1_2.method6497();
							local394 = Static89.aClass3_Sub7_Sub1_2.method6521();
							if (Static311.method5197(local222)) {
								Static82.method1138(local71, 5, local394, local257);
							}
							Static576.aClass276_150 = null;
							return true;
						} else if (Static576.aClass276_150 == Static117.aClass276_36) {
							Static327.anInt6815 = Static89.aClass3_Sub7_Sub1_2.method6538();
							Static576.aClass276_150 = null;
							return true;
						} else {
							@Pc(1933) int local1933;
							@Pc(1896) boolean local1896;
							if (Static68.aClass276_24 == Static576.aClass276_150) {
								local222 = Static89.aClass3_Sub7_Sub1_2.method6535();
								@Pc(1868) Class2_Sub2_Sub1_Sub1 local1868;
								if (Static381.anInt1560 == local222) {
									local1868 = Static443.aClass2_Sub2_Sub1_Sub1_2;
								} else {
									local1868 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local222];
								}
								if (local1868 == null) {
									Static576.aClass276_150 = null;
									return true;
								}
								local257 = Static89.aClass3_Sub7_Sub1_2.method6535();
								local394 = Static89.aClass3_Sub7_Sub1_2.method6538();
								local1896 = (local257 & 0x8000) != 0;
								if (local1868.aString23 != null && local1868.aClass314_1 != null) {
									local1521 = false;
									if (local394 <= 1) {
										if (!local1896 && (Static397.aBoolean649 && !Static438.aBoolean691 || Static491.aBoolean666)) {
											local1521 = true;
										} else if (Static502.method7569(local1868.aString23)) {
											local1521 = true;
										}
									}
									if (!local1521 && Static472.anInt8855 == 0) {
										local1933 = -1;
										if (local1896) {
											local257 &= 0x7FFF;
											@Pc(1943) Class288 local1943 = Static149.method2488(Static89.aClass3_Sub7_Sub1_2);
											local1933 = local1943.anInt8665;
											local1532 = local1943.aClass3_Sub4_Sub16_1.method6946(Static89.aClass3_Sub7_Sub1_2);
										} else {
											local1532 = Static168.method3103(Static231.method3970(Static89.aClass3_Sub7_Sub1_2));
										}
										local1868.aString92 = local1532.trim();
										local1868.anInt7610 = local257 >> 8;
										local1868.anInt7632 = 150;
										local1868.anInt7600 = local257 & 0xFF;
										if (local394 == 1 || local394 == 2) {
											local1561 = local1896 ? 17 : 1;
										} else {
											local1561 = local1896 ? 17 : 2;
										}
										if (local394 == 2) {
											Static209.method3675(0, null, local1532, local1933, "<img=1>" + local1868.method2038(), "<img=1>" + local1868.method2042(), local1561, local1868.aString22);
										} else if (local394 == 1) {
											Static209.method3675(0, null, local1532, local1933, "<img=0>" + local1868.method2038(), "<img=0>" + local1868.method2042(), local1561, local1868.aString22);
										} else {
											Static209.method3675(0, null, local1532, local1933, local1868.method2038(), local1868.method2042(), local1561, local1868.aString22);
										}
									}
								}
								Static576.aClass276_150 = null;
								return true;
							} else if (Static576.aClass276_150 == Static496.aClass276_135) {
								local222 = Static89.aClass3_Sub7_Sub1_2.method6521();
								local71 = Static89.aClass3_Sub7_Sub1_2.method6535();
								local257 = Static89.aClass3_Sub7_Sub1_2.method6521();
								local394 = Static89.aClass3_Sub7_Sub1_2.method6554();
								local398 = Static89.aClass3_Sub7_Sub1_2.method6532();
								if (Static311.method5197(local398)) {
									Static329.method5693(local71, local394, local222, local257);
								}
								Static576.aClass276_150 = null;
								return true;
							} else if (Static576.aClass276_150 == Static264.aClass276_119) {
								local222 = Static89.aClass3_Sub7_Sub1_2.method6521();
								local990 = Static89.aClass3_Sub7_Sub1_2.method6536();
								local257 = Static89.aClass3_Sub7_Sub1_2.method6535();
								if (Static311.method5197(local222)) {
									Static193.method2190(local990, local257);
								}
								Static576.aClass276_150 = null;
								return true;
							} else {
								@Pc(2177) boolean local2177;
								@Pc(2197) boolean local2197;
								@Pc(2236) boolean local2236;
								if (Static576.aClass276_150 == Static486.aClass276_131) {
									while (Static79.anInt10464 > Static89.aClass3_Sub7_Sub1_2.anInt7869) {
										local2177 = Static89.aClass3_Sub7_Sub1_2.method6538() == 1;
										local990 = Static89.aClass3_Sub7_Sub1_2.method6536();
										local474 = Static89.aClass3_Sub7_Sub1_2.method6536();
										local394 = Static89.aClass3_Sub7_Sub1_2.method6535();
										local398 = Static89.aClass3_Sub7_Sub1_2.method6538();
										local326 = "";
										local2197 = false;
										if (local394 > 0) {
											local326 = Static89.aClass3_Sub7_Sub1_2.method6536();
											local2197 = Static89.aClass3_Sub7_Sub1_2.method6538() == 1;
										}
										for (local1933 = 0; local1933 < Static346.anInt7032; local1933++) {
											if (local2177) {
												if (local474.equals(Static520.aStringArray34[local1933])) {
													Static520.aStringArray34[local1933] = local990;
													local990 = null;
													Static199.aStringArray17[local1933] = local474;
													break;
												}
											} else if (local990.equals(Static520.aStringArray34[local1933])) {
												if (Static585.anIntArray666[local1933] != local394) {
													local2236 = true;
													for (@Pc(2241) Class55_Sub2_Sub2 local2241 = (Class55_Sub2_Sub2) Static472.aClass134_11.method3233(); local2241 != null; local2241 = (Class55_Sub2_Sub2) Static472.aClass134_11.method3230()) {
														if (local2241.aString58.equals(local990)) {
															if (local394 != 0 && local2241.aShort53 == 0) {
																local2236 = false;
																local2241.method7112();
															} else if (local394 == 0 && local2241.aShort53 != 0) {
																local2236 = false;
																local2241.method7112();
															}
														}
													}
													if (local2236) {
														Static472.aClass134_11.method3236(new Class55_Sub2_Sub2(local990, local394));
													}
													Static585.anIntArray666[local1933] = local394;
												}
												Static199.aStringArray17[local1933] = local474;
												Static92.aStringArray7[local1933] = local326;
												Static166.anIntArray232[local1933] = local398;
												local990 = null;
												Static410.aBooleanArray30[local1933] = local2197;
												break;
											}
										}
										if (local990 != null && Static346.anInt7032 < 200) {
											Static520.aStringArray34[Static346.anInt7032] = local990;
											Static199.aStringArray17[Static346.anInt7032] = local474;
											Static585.anIntArray666[Static346.anInt7032] = local394;
											Static92.aStringArray7[Static346.anInt7032] = local326;
											Static166.anIntArray232[Static346.anInt7032] = local398;
											Static410.aBooleanArray30[Static346.anInt7032] = local2197;
											Static346.anInt7032++;
										}
									}
									Static396.anInt7675 = 2;
									Static257.anInt5521 = Static509.anInt9418;
									local71 = Static346.anInt7032;
									while (local71 > 0) {
										local2177 = true;
										local71--;
										for (local257 = 0; local257 < local71; local257++) {
											if (Static461.aClass329_6.anInt9698 != Static585.anIntArray666[local257] && Static461.aClass329_6.anInt9698 == Static585.anIntArray666[local257 + 1] || Static585.anIntArray666[local257] == 0 && Static585.anIntArray666[local257 + 1] != 0) {
												local394 = Static585.anIntArray666[local257];
												Static585.anIntArray666[local257] = Static585.anIntArray666[local257 + 1];
												Static585.anIntArray666[local257 + 1] = local394;
												local295 = Static92.aStringArray7[local257];
												Static92.aStringArray7[local257] = Static92.aStringArray7[local257 + 1];
												Static92.aStringArray7[local257 + 1] = local295;
												local326 = Static520.aStringArray34[local257];
												Static520.aStringArray34[local257] = Static520.aStringArray34[local257 + 1];
												Static520.aStringArray34[local257 + 1] = local326;
												local1532 = Static199.aStringArray17[local257];
												Static199.aStringArray17[local257] = Static199.aStringArray17[local257 + 1];
												Static199.aStringArray17[local257 + 1] = local1532;
												local1933 = Static166.anIntArray232[local257];
												Static166.anIntArray232[local257] = Static166.anIntArray232[local257 + 1];
												Static166.anIntArray232[local257 + 1] = local1933;
												local2236 = Static410.aBooleanArray30[local257];
												Static410.aBooleanArray30[local257] = Static410.aBooleanArray30[local257 + 1];
												local2177 = false;
												Static410.aBooleanArray30[local257 + 1] = local2236;
											}
										}
										if (local2177) {
											break;
										}
									}
									Static576.aClass276_150 = null;
									return true;
								} else if (Static576.aClass276_150 == Static254.aClass276_104) {
									Static39.method1143(Static5.aClass110_3);
									Static576.aClass276_150 = null;
									return true;
								} else {
									@Pc(2604) long local2604;
									@Pc(2592) long local2592;
									@Pc(2597) long local2597;
									@Pc(2612) int local2612;
									if (Static555.aClass276_147 == Static576.aClass276_150) {
										local2177 = Static89.aClass3_Sub7_Sub1_2.method6538() == 1;
										local990 = Static89.aClass3_Sub7_Sub1_2.method6536();
										local474 = local990;
										if (local2177) {
											local474 = Static89.aClass3_Sub7_Sub1_2.method6536();
										}
										local2592 = Static89.aClass3_Sub7_Sub1_2.method6519();
										local2597 = Static89.aClass3_Sub7_Sub1_2.method6535();
										local2604 = Static89.aClass3_Sub7_Sub1_2.method6506();
										local1570 = Static89.aClass3_Sub7_Sub1_2.method6538();
										local2612 = Static89.aClass3_Sub7_Sub1_2.method6535();
										@Pc(2618) long local2618 = local2604 + (local2597 << 32);
										@Pc(2620) boolean local2620 = false;
										@Pc(2622) int local2622 = 0;
										while (true) {
											if (local2622 >= 100) {
												if (local1570 <= 1 && Static502.method7569(local474)) {
													local2620 = true;
												}
												break;
											}
											if (local2618 == Static446.aLongArray16[local2622]) {
												local2620 = true;
												break;
											}
											local2622++;
										}
										if (!local2620 && Static472.anInt8855 == 0) {
											Static446.aLongArray16[Static292.anInt7687] = local2618;
											Static292.anInt7687 = (Static292.anInt7687 + 1) % 100;
											@Pc(2673) String local2673 = Static25.aClass189_1.method4916(local2612).method6946(Static89.aClass3_Sub7_Sub1_2);
											if (local1570 == 2) {
												Static209.method3675(0, Static272.method4722(local2592), local2673, local2612, "<img=1>" + local990, "<img=1>" + local474, 20, local990);
											} else if (local1570 == 1) {
												Static209.method3675(0, Static272.method4722(local2592), local2673, local2612, "<img=0>" + local990, "<img=0>" + local474, 20, local990);
											} else {
												Static209.method3675(0, Static272.method4722(local2592), local2673, local2612, local990, local474, 20, local990);
											}
										}
										Static576.aClass276_150 = null;
										return true;
									} else if (Static576.aClass276_150 == Static475.aClass276_129) {
										local222 = Static89.aClass3_Sub7_Sub1_2.method6535();
										if (local222 == 65535) {
											local222 = -1;
										}
										local71 = Static89.aClass3_Sub7_Sub1_2.method6538();
										local257 = Static89.aClass3_Sub7_Sub1_2.method6535();
										local394 = Static89.aClass3_Sub7_Sub1_2.method6538();
										Static148.method2905(local71, local222, local257, true, local394);
										Static576.aClass276_150 = null;
										return true;
									} else if (Static576.aClass276_150 == Static441.aClass276_118) {
										Static39.method1143(Static553.aClass110_38);
										Static576.aClass276_150 = null;
										return true;
									} else if (Static320.aClass276_82 == Static576.aClass276_150) {
										Static188.anInt3750 = Static509.anInt9418;
										if (Static79.anInt10464 == 0) {
											Static535.aClass34Array1 = null;
											Static576.aClass276_150 = null;
											Static372.aString84 = null;
											Static432.aString62 = null;
											Static447.anInt8540 = 0;
											return true;
										}
										Static432.aString62 = Static89.aClass3_Sub7_Sub1_2.method6536();
										local2177 = Static89.aClass3_Sub7_Sub1_2.method6538() == 1;
										if (local2177) {
											Static89.aClass3_Sub7_Sub1_2.method6536();
										}
										@Pc(2839) long local2839 = Static89.aClass3_Sub7_Sub1_2.method6519();
										Static372.aString84 = Static482.method7394(local2839);
										Static227.aByte38 = Static89.aClass3_Sub7_Sub1_2.method6529();
										local394 = Static89.aClass3_Sub7_Sub1_2.method6538();
										if (local394 == 255) {
											Static576.aClass276_150 = null;
											return true;
										}
										Static447.anInt8540 = local394;
										@Pc(2869) Class34[] local2869 = new Class34[100];
										for (local400 = 0; local400 < Static447.anInt8540; local400++) {
											local2869[local400] = new Class34();
											local2869[local400].aString8 = Static89.aClass3_Sub7_Sub1_2.method6536();
											local2177 = Static89.aClass3_Sub7_Sub1_2.method6538() == 1;
											if (local2177) {
												local2869[local400].aString9 = Static89.aClass3_Sub7_Sub1_2.method6536();
											} else {
												local2869[local400].aString9 = local2869[local400].aString8;
											}
											local2869[local400].aString10 = Static67.method8230(local2869[local400].aString9);
											local2869[local400].anInt1106 = Static89.aClass3_Sub7_Sub1_2.method6535();
											local2869[local400].aByte4 = Static89.aClass3_Sub7_Sub1_2.method6529();
											local2869[local400].aString11 = Static89.aClass3_Sub7_Sub1_2.method6536();
											if (local2869[local400].aString9.equals(Static443.aClass2_Sub2_Sub1_Sub1_2.aString23)) {
												Static95.aByte23 = local2869[local400].aByte4;
											}
										}
										local1561 = Static447.anInt8540;
										while (local1561 > 0) {
											local1561--;
											local2197 = true;
											for (local1570 = 0; local1570 < local1561; local1570++) {
												if (local2869[local1570].aString10.compareTo(local2869[local1570 + 1].aString10) > 0) {
													local1536 = local2869[local1570];
													local2869[local1570] = local2869[local1570 + 1];
													local2869[local1570 + 1] = local1536;
													local2197 = false;
												}
											}
											if (local2197) {
												break;
											}
										}
										Static535.aClass34Array1 = local2869;
										Static576.aClass276_150 = null;
										return true;
									} else if (Static576.aClass276_150 == Static240.aClass276_61) {
										Static39.method1143(Static239.aClass110_24);
										Static576.aClass276_150 = null;
										return true;
									} else if (Static558.aClass276_108 == Static576.aClass276_150) {
										local222 = Static89.aClass3_Sub7_Sub1_2.method6521();
										local71 = Static89.aClass3_Sub7_Sub1_2.method6497();
										local257 = Static89.aClass3_Sub7_Sub1_2.method6535();
										if (Static311.method5197(local257)) {
											Static401.method6481(local222, local71);
										}
										Static576.aClass276_150 = null;
										return true;
									} else {
										@Pc(3119) int local3119;
										if (Static576.aClass276_150 == Static382.aClass276_97) {
											local2177 = Static89.aClass3_Sub7_Sub1_2.method6538() == 1;
											local990 = Static89.aClass3_Sub7_Sub1_2.method6536();
											local474 = local990;
											if (local2177) {
												local474 = Static89.aClass3_Sub7_Sub1_2.method6536();
											}
											local2592 = Static89.aClass3_Sub7_Sub1_2.method6535();
											local2597 = Static89.aClass3_Sub7_Sub1_2.method6506();
											local1933 = Static89.aClass3_Sub7_Sub1_2.method6538();
											local1561 = Static89.aClass3_Sub7_Sub1_2.method6535();
											@Pc(3115) long local3115 = local2597 + (local2592 << 32);
											@Pc(3117) boolean local3117 = false;
											local3119 = 0;
											while (true) {
												if (local3119 >= 100) {
													if (local1933 <= 1 && Static502.method7569(local474)) {
														local3117 = true;
													}
													break;
												}
												if (local3115 == Static446.aLongArray16[local3119]) {
													local3117 = true;
													break;
												}
												local3119++;
											}
											if (!local3117 && Static472.anInt8855 == 0) {
												Static446.aLongArray16[Static292.anInt7687] = local3115;
												Static292.anInt7687 = (Static292.anInt7687 + 1) % 100;
												@Pc(3166) String local3166 = Static25.aClass189_1.method4916(local1561).method6946(Static89.aClass3_Sub7_Sub1_2);
												if (local1933 == 2) {
													Static209.method3675(0, null, local3166, local1561, "<img=1>" + local990, "<img=1>" + local474, 18, local990);
												} else if (local1933 == 1) {
													Static209.method3675(0, null, local3166, local1561, "<img=0>" + local990, "<img=0>" + local474, 18, local990);
												} else {
													Static209.method3675(0, null, local3166, local1561, local990, local474, 18, local990);
												}
											}
											Static576.aClass276_150 = null;
											return true;
										} else if (Static576.aClass276_150 == Static74.aClass276_25) {
											local2177 = Static89.aClass3_Sub7_Sub1_2.method6538() == 1;
											@Pc(3255) byte[] local3255 = new byte[Static79.anInt10464 - 1];
											Static89.aClass3_Sub7_Sub1_2.method6540(local3255, Static79.anInt10464 - 1);
											Static365.method6012(local3255, local2177);
											Static576.aClass276_150 = null;
											return true;
										} else if (Static455.aClass276_123 == Static576.aClass276_150) {
											local222 = Static89.aClass3_Sub7_Sub1_2.method6521();
											local71 = Static89.aClass3_Sub7_Sub1_2.method6548();
											Static588.aClass322_1.method7765(local222, local71);
											Static576.aClass276_150 = null;
											return true;
										} else if (Static576.aClass276_150 == Static45.aClass276_13) {
											Static576.aClass276_150 = null;
											return false;
										} else if (Static576.aClass276_150 == Static277.aClass276_71) {
											local222 = Static89.aClass3_Sub7_Sub1_2.method6535();
											local71 = Static89.aClass3_Sub7_Sub1_2.method6538();
											local257 = Static89.aClass3_Sub7_Sub1_2.method6538();
											local394 = Static89.aClass3_Sub7_Sub1_2.method6535() << 2;
											local398 = Static89.aClass3_Sub7_Sub1_2.method6538();
											local400 = Static89.aClass3_Sub7_Sub1_2.method6538();
											if (Static311.method5197(local222)) {
												Static115.method2337(true, local394, local400, local71, local398, local257);
											}
											Static576.aClass276_150 = null;
											return true;
										} else if (Static576.aClass276_150 == Static36.aClass276_9) {
											local222 = Static89.aClass3_Sub7_Sub1_2.method6521();
											local71 = Static89.aClass3_Sub7_Sub1_2.method6497();
											if (Static311.method5197(local222)) {
												Static82.method1138(0, 5, Static381.anInt1560, local71);
											}
											Static576.aClass276_150 = null;
											return true;
										} else if (Static576.aClass276_150 == Static113.aClass276_35) {
											if (Static578.aFrame2 != null) {
												Static342.method5819(Static455.aClass3_Sub27_Sub1_1.anInt4801, -1, -1, false);
											}
											@Pc(3387) byte[] local3387 = new byte[Static79.anInt10464];
											Static89.aClass3_Sub7_Sub1_2.method1490(local3387, Static79.anInt10464);
											local990 = Static456.method7058(local3387, Static79.anInt10464, 0);
											Static361.method5979(local990, true, Static275.anInt5823 == 1, Static480.aClass326_3);
											Static576.aClass276_150 = null;
											return true;
										} else if (Static232.aClass276_60 == Static576.aClass276_150) {
											Static39.method1143(Static167.aClass110_19);
											Static576.aClass276_150 = null;
											return true;
										} else if (Static400.aClass276_101 == Static576.aClass276_150) {
											Static444.method6925(Static79.anInt10464, Static89.aClass3_Sub7_Sub1_2);
											Static576.aClass276_150 = null;
											return true;
										} else if (Static53.aClass276_16 == Static576.aClass276_150) {
											Static39.method1143(Static399.aClass110_32);
											Static576.aClass276_150 = null;
											return true;
										} else if (Static351.aClass276_92 == Static576.aClass276_150) {
											local462 = Static89.aClass3_Sub7_Sub1_2.method6536();
											local990 = Static168.method3103(Static231.method3970(Static89.aClass3_Sub7_Sub1_2));
											Static348.method2212(0, local462, 6, local462, local990, local462);
											Static576.aClass276_150 = null;
											return true;
										} else if (Static488.aClass276_27 == Static576.aClass276_150) {
											Static215.anInt6070 = Static89.aClass3_Sub7_Sub1_2.method6517() << 3;
											Static112.anInt2616 = Static89.aClass3_Sub7_Sub1_2.method6517() << 3;
											Static292.anInt7686 = Static89.aClass3_Sub7_Sub1_2.method6505();
											Static576.aClass276_150 = null;
											return true;
										} else if (Static576.aClass276_150 == Static478.aClass276_130) {
											@Pc(3510) byte local3510 = Static89.aClass3_Sub7_Sub1_2.method6529();
											local71 = Static89.aClass3_Sub7_Sub1_2.method6532();
											Static588.aClass322_1.method7764(local71, local3510);
											Static576.aClass276_150 = null;
											return true;
										} else if (Static576.aClass276_150 == Static557.aClass276_21) {
											local222 = Static89.aClass3_Sub7_Sub1_2.method6535();
											if (local222 == 65535) {
												local222 = -1;
											}
											local71 = Static89.aClass3_Sub7_Sub1_2.method6555();
											local257 = Static89.aClass3_Sub7_Sub1_2.method6538();
											Static154.method2981(local71, local257, local222);
											Static576.aClass276_150 = null;
											return true;
										} else if (Static576.aClass276_150 == Static15.aClass276_2) {
											local222 = Static89.aClass3_Sub7_Sub1_2.method6505();
											local71 = Static89.aClass3_Sub7_Sub1_2.method6506();
											local257 = Static89.aClass3_Sub7_Sub1_2.method6521();
											if (local257 == 65535) {
												local257 = -1;
											}
											Static8.method305(local71, local222, local257);
											Static576.aClass276_150 = null;
											return true;
										} else if (Static269.aClass276_67 == Static576.aClass276_150) {
											local2177 = Static89.aClass3_Sub7_Sub1_2.method6538() == 1;
											local990 = Static89.aClass3_Sub7_Sub1_2.method6536();
											local474 = local990;
											if (local2177) {
												local474 = Static89.aClass3_Sub7_Sub1_2.method6536();
											}
											local394 = Static89.aClass3_Sub7_Sub1_2.method6538();
											local1896 = false;
											if (local394 <= 1) {
												if (Static397.aBoolean649 && !Static438.aBoolean691 || Static491.aBoolean666) {
													local1896 = true;
												} else if (local394 <= 1 && Static502.method7569(local474)) {
													local1896 = true;
												}
											}
											if (!local1896 && Static472.anInt8855 == 0) {
												local326 = Static168.method3103(Static231.method3970(Static89.aClass3_Sub7_Sub1_2));
												if (local394 == 2) {
													Static209.method3675(0, null, local326, -1, "<img=1>" + local990, "<img=1>" + local474, 24, local990);
												} else if (local394 == 1) {
													Static209.method3675(0, null, local326, -1, "<img=0>" + local990, "<img=0>" + local474, 24, local990);
												} else {
													Static209.method3675(0, null, local326, -1, local990, local474, 24, local990);
												}
											}
											Static576.aClass276_150 = null;
											return true;
										} else if (Static313.aClass276_80 == Static576.aClass276_150) {
											Static374.method6082(Static89.aClass3_Sub7_Sub1_2.method6536());
											Static576.aClass276_150 = null;
											return true;
										} else if (Static303.aClass276_78 == Static576.aClass276_150) {
											Static39.method1143(Static391.aClass110_30);
											Static576.aClass276_150 = null;
											return true;
										} else if (Static558.aClass276_107 == Static576.aClass276_150) {
											local222 = Static89.aClass3_Sub7_Sub1_2.method6535();
											local71 = Static89.aClass3_Sub7_Sub1_2.method6538();
											local257 = Static89.aClass3_Sub7_Sub1_2.method6538();
											local394 = Static89.aClass3_Sub7_Sub1_2.method6535() << 2;
											local398 = Static89.aClass3_Sub7_Sub1_2.method6538();
											local400 = Static89.aClass3_Sub7_Sub1_2.method6538();
											if (Static311.method5197(local222)) {
												Static276.method4821(local400, local71, local394, local257, local398);
											}
											Static576.aClass276_150 = null;
											return true;
										} else {
											@Pc(3875) int local3875;
											@Pc(3987) int local3987;
											if (Static576.aClass276_150 == Static320.aClass276_83) {
												local222 = Static89.aClass3_Sub7_Sub1_2.method6548();
												local71 = Static89.aClass3_Sub7_Sub1_2.method6547();
												local257 = Static89.aClass3_Sub7_Sub1_2.method6541();
												local394 = Static89.aClass3_Sub7_Sub1_2.method6535();
												local398 = Static89.aClass3_Sub7_Sub1_2.method6541();
												local1521 = (local71 & 0x80) != 0;
												if (local222 >> 30 == 0) {
													@Pc(3971) Class77 local3971;
													@Pc(4032) Class174 local4032;
													@Pc(3984) Class174 local3984;
													if (local222 >> 29 != 0) {
														local1670 = local222 & 0xFFFF;
														@Pc(3935) Class3_Sub46 local3935 = (Class3_Sub46) Static331.aClass25_25.method946((long) local1670);
														if (local3935 != null) {
															if (local394 == 65535) {
																local394 = -1;
															}
															@Pc(3945) Class2_Sub2_Sub1_Sub2 local3945 = local3935.aClass2_Sub2_Sub1_Sub2_2;
															@Pc(3947) boolean local3947 = true;
															local2612 = local1521 ? local3945.anInt7638 : local3945.anInt7621;
															if (local394 != -1 && local2612 != -1) {
																if (local394 == local2612) {
																	local3971 = Static107.aClass303_1.method7476(local394);
																	if (local3971.aBoolean197 && local3971.anInt2573 != -1) {
																		local3984 = Static532.aClass157_2.method3734(local3971.anInt2573);
																		local3987 = local3984.anInt5488;
																		if (local3987 == 0 || local3987 == 2) {
																			local3947 = false;
																		} else if (local3987 == 1) {
																			local3947 = true;
																		}
																	}
																} else {
																	local3971 = Static107.aClass303_1.method7476(local394);
																	@Pc(4016) Class77 local4016 = Static107.aClass303_1.method7476(local2612);
																	if (local3971.anInt2573 != -1 && local4016.anInt2573 != -1) {
																		local4032 = Static532.aClass157_2.method3734(local3971.anInt2573);
																		@Pc(4038) Class174 local4038 = Static532.aClass157_2.method3734(local4016.anInt2573);
																		if (local4038.anInt5497 > local4032.anInt5497) {
																			local3947 = false;
																		}
																	}
																}
															}
															if (local3947) {
																if (local1521) {
																	local3945.anInt7653 = 1;
																	local3945.anInt7612 = 0;
																	local3945.lb = local257;
																	local3945.anInt7656 = 0;
																	local3945.anInt7652 = local71 & 0x7;
																	local3945.anInt7638 = local394;
																	local3945.anInt7649 = Static129.anInt10429 + local398;
																	if (Static129.anInt10429 < local3945.anInt7649) {
																		local3945.anInt7656 = -1;
																	}
																	if (local3945.anInt7638 != -1 && Static129.anInt10429 == local3945.anInt7649) {
																		local3875 = Static107.aClass303_1.method7476(local3945.anInt7638).anInt2573;
																		if (local3875 != -1) {
																			local3984 = Static532.aClass157_2.method3734(local3875);
																			if (local3984 != null && local3984.anIntArray326 != null) {
																				Static28.method957(local3984, local3945.aByte103, local3945.anInt9396, local3945.anInt9398, false, 0);
																			}
																		}
																	}
																} else {
																	local3945.anInt7621 = local394;
																	local3945.anInt7611 = local257;
																	local3945.anInt7594 = 0;
																	local3945.anInt7596 = 0;
																	local3945.anInt7614 = local71 & 0x7;
																	local3945.anInt7618 = local398 + Static129.anInt10429;
																	local3945.anInt7623 = 1;
																	if (Static129.anInt10429 < local3945.anInt7618) {
																		local3945.anInt7594 = -1;
																	}
																	if (local3945.anInt7621 != -1 && local3945.anInt7618 == Static129.anInt10429) {
																		local3875 = Static107.aClass303_1.method7476(local3945.anInt7621).anInt2573;
																		if (local3875 != -1) {
																			local3984 = Static532.aClass157_2.method3734(local3875);
																			if (local3984 != null && local3984.anIntArray326 != null) {
																				Static28.method957(local3984, local3945.aByte103, local3945.anInt9396, local3945.anInt9398, false, 0);
																			}
																		}
																	}
																}
															}
														}
													} else if (local222 >> 28 != 0) {
														local1670 = local222 & 0xFFFF;
														@Pc(4224) Class2_Sub2_Sub1_Sub1 local4224;
														if (Static381.anInt1560 == local1670) {
															local4224 = Static443.aClass2_Sub2_Sub1_Sub1_2;
														} else {
															local4224 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local1670];
														}
														if (local4224 != null) {
															if (local394 == 65535) {
																local394 = -1;
															}
															local2236 = true;
															local1570 = local1521 ? local4224.anInt7638 : local4224.anInt7621;
															@Pc(4321) Class174 local4321;
															if (local394 != -1 && local1570 != -1) {
																@Pc(4267) Class77 local4267;
																if (local394 == local1570) {
																	local4267 = Static107.aClass303_1.method7476(local394);
																	if (local4267.aBoolean197 && local4267.anInt2573 != -1) {
																		local4321 = Static532.aClass157_2.method3734(local4267.anInt2573);
																		local3119 = local4321.anInt5488;
																		if (local3119 == 0 || local3119 == 2) {
																			local2236 = false;
																		} else if (local3119 == 1) {
																			local2236 = true;
																		}
																	}
																} else {
																	local4267 = Static107.aClass303_1.method7476(local394);
																	local3971 = Static107.aClass303_1.method7476(local1570);
																	if (local4267.anInt2573 != -1 && local3971.anInt2573 != -1) {
																		local3984 = Static532.aClass157_2.method3734(local4267.anInt2573);
																		local4032 = Static532.aClass157_2.method3734(local3971.anInt2573);
																		if (local4032.anInt5497 > local3984.anInt5497) {
																			local2236 = false;
																		}
																	}
																}
															}
															if (local2236) {
																if (local1521) {
																	local4224.anInt7612 = 0;
																	local4224.anInt7652 = local71 & 0x7;
																	local4224.lb = local257;
																	local4224.anInt7656 = 0;
																	local4224.anInt7649 = local398 + Static129.anInt10429;
																	local4224.anInt7638 = local394;
																	local4224.anInt7653 = 1;
																	if (local4224.anInt7649 > Static129.anInt10429) {
																		local4224.anInt7656 = -1;
																	}
																	if (local4224.anInt7638 == 65535) {
																		local4224.anInt7638 = -1;
																	}
																	if (local4224.anInt7638 != -1 && Static129.anInt10429 == local4224.anInt7649) {
																		local2612 = Static107.aClass303_1.method7476(local4224.anInt7638).anInt2573;
																		if (local2612 != -1) {
																			local4321 = Static532.aClass157_2.method3734(local2612);
																			if (local4321 != null && local4321.anIntArray326 != null) {
																				Static28.method957(local4321, local4224.aByte103, local4224.anInt9396, local4224.anInt9398, Static443.aClass2_Sub2_Sub1_Sub1_2 == local4224, 0);
																			}
																		}
																	}
																} else {
																	local4224.anInt7596 = 0;
																	local4224.anInt7614 = local71 & 0x7;
																	local4224.anInt7618 = local398 + Static129.anInt10429;
																	local4224.anInt7611 = local257;
																	local4224.anInt7621 = local394;
																	local4224.anInt7594 = 0;
																	local4224.anInt7623 = 1;
																	if (local4224.anInt7621 == 65535) {
																		local4224.anInt7621 = -1;
																	}
																	if (Static129.anInt10429 < local4224.anInt7618) {
																		local4224.anInt7594 = -1;
																	}
																	if (local4224.anInt7621 != -1 && local4224.anInt7618 == Static129.anInt10429) {
																		local2612 = Static107.aClass303_1.method7476(local4224.anInt7621).anInt2573;
																		if (local2612 != -1) {
																			local4321 = Static532.aClass157_2.method3734(local2612);
																			if (local4321 != null && local4321.anIntArray326 != null) {
																				Static28.method957(local4321, local4224.aByte103, local4224.anInt9396, local4224.anInt9398, Static443.aClass2_Sub2_Sub1_Sub1_2 == local4224, 0);
																			}
																		}
																	}
																}
															}
														}
													}
												} else {
													local1670 = local222 >> 28 & 0x3;
													local1933 = (local222 >> 14 & 0x3FFF) - Static230.anInt4667;
													local1561 = (local222 & 0x3FFF) - Static563.anInt10006;
													if (local1933 >= 0 && local1561 >= 0 && Static460.anInt8640 > local1933 && Static292.anInt7682 > local1561) {
														local1570 = local1933 * 512 + 256;
														local2612 = local1561 * 512 + 256;
														local3875 = local1670;
														if (local1670 < 3 && Static503.method7578(local1933, local1561)) {
															local3875 = local1670 + 1;
														}
														@Pc(3912) Class2_Sub2_Sub3 local3912 = new Class2_Sub2_Sub3(local394, 0, Static129.anInt10429, local1670, local3875, local1570, Static274.method4782(local2612, local1670, local1570) - local257, local2612, local1933, local1933, local1561, local1561, local71 & 0x7);
														Static542.aClass183_60.method4792(new Class3_Sub4_Sub17(local3912));
													}
												}
												Static576.aClass276_150 = null;
												return true;
											} else if (Static576.aClass276_150 == Static40.aClass276_12) {
												Static89.aClass3_Sub7_Sub1_2.anInt7869 += 28;
												if (Static89.aClass3_Sub7_Sub1_2.method6520()) {
													Static38.method1122(Static89.aClass3_Sub7_Sub1_2.anInt7869 - 28, Static89.aClass3_Sub7_Sub1_2);
												}
												Static576.aClass276_150 = null;
												return true;
											} else if (Static22.aClass276_5 == Static576.aClass276_150) {
												local222 = Static89.aClass3_Sub7_Sub1_2.method6538();
												local71 = Static89.aClass3_Sub7_Sub1_2.method6532();
												Static588.aClass322_1.method7765(local71, local222);
												Static576.aClass276_150 = null;
												return true;
											} else if (Static576.aClass276_150 == Static336.aClass276_88) {
												Static39.method1143(Static172.aClass110_35);
												Static576.aClass276_150 = null;
												return true;
											} else if (Static543.aClass276_144 == Static576.aClass276_150) {
												local222 = Static89.aClass3_Sub7_Sub1_2.method6541();
												local71 = Static89.aClass3_Sub7_Sub1_2.method6497();
												local257 = Static89.aClass3_Sub7_Sub1_2.method6538();
												if (Static311.method5197(local222)) {
													Static578.method8267(local71, local257);
												}
												Static576.aClass276_150 = null;
												return true;
											} else if (Static576.aClass276_150 == Static218.aClass276_59) {
												Static215.anInt6070 = Static89.aClass3_Sub7_Sub1_2.method6526() << 3;
												Static292.anInt7686 = Static89.aClass3_Sub7_Sub1_2.method6547();
												Static112.anInt2616 = Static89.aClass3_Sub7_Sub1_2.method6523() << 3;
												for (@Pc(4648) Class3_Sub30 local4648 = (Class3_Sub30) Static30.aClass25_5.method949(); local4648 != null; local4648 = (Class3_Sub30) Static30.aClass25_5.method947()) {
													local71 = (int) (local4648.aLong262 >> 28 & 0x3L);
													local257 = (int) (local4648.aLong262 & 0x3FFFL);
													local394 = local257 - Static230.anInt4667;
													local398 = (int) (local4648.aLong262 >> 14 & 0x3FFFL);
													local400 = local398 - Static563.anInt10006;
													if (local71 == Static292.anInt7686 && local394 >= Static112.anInt2616 && Static112.anInt2616 + 8 > local394 && Static215.anInt6070 <= local400 && local400 < Static215.anInt6070 + 8) {
														local4648.method8412();
														if (local394 >= 0 && local400 >= 0 && local394 < Static460.anInt8640 && local400 < Static292.anInt7682) {
															Static510.method7653(local400, local394, Static292.anInt7686);
														}
													}
												}
												for (@Pc(4753) Class3_Sub45 local4753 = (Class3_Sub45) Static364.aClass183_46.method4795(); local4753 != null; local4753 = (Class3_Sub45) Static364.aClass183_46.method4793()) {
													if (Static112.anInt2616 <= local4753.anInt9258 && local4753.anInt9258 < Static112.anInt2616 + 8 && local4753.anInt9267 >= Static215.anInt6070 && local4753.anInt9267 < Static215.anInt6070 + 8 && local4753.anInt9265 == Static292.anInt7686) {
														local4753.anInt9263 = 0;
													}
												}
												Static576.aClass276_150 = null;
												return true;
											} else if (Static425.aClass276_113 == Static576.aClass276_150) {
												local222 = Static89.aClass3_Sub7_Sub1_2.method6532();
												local71 = Static89.aClass3_Sub7_Sub1_2.method6532();
												@Pc(4819) byte local4819 = Static89.aClass3_Sub7_Sub1_2.method6523();
												if (Static311.method5197(local71)) {
													Static300.method6048(local4819, local222);
												}
												Static576.aClass276_150 = null;
												return true;
											} else if (Static293.aClass276_74 == Static576.aClass276_150) {
												local222 = Static89.aClass3_Sub7_Sub1_2.method6535();
												local71 = Static89.aClass3_Sub7_Sub1_2.method6535();
												local257 = Static89.aClass3_Sub7_Sub1_2.method6532();
												local394 = Static89.aClass3_Sub7_Sub1_2.method6497();
												local398 = Static89.aClass3_Sub7_Sub1_2.method6541();
												if (Static311.method5197(local257)) {
													Static82.method1138(local71, 7, local398 | local222 << 16, local394);
												}
												Static576.aClass276_150 = null;
												return true;
											} else if (Static310.aClass276_79 == Static576.aClass276_150) {
												Static275.anInt5826 = Static89.aClass3_Sub7_Sub1_2.method6555();
												Static14.anInt438 = Static89.aClass3_Sub7_Sub1_2.method6555();
												Static576.aClass276_150 = null;
												return true;
											} else if (Static38.aClass276_10 == Static576.aClass276_150) {
												local222 = Static89.aClass3_Sub7_Sub1_2.method6538();
												local71 = Static89.aClass3_Sub7_Sub1_2.method6538();
												local257 = Static89.aClass3_Sub7_Sub1_2.method6541();
												if (local257 == 65535) {
													local257 = -1;
												}
												local293 = Static89.aClass3_Sub7_Sub1_2.method6536();
												if (local71 >= 1 && local71 <= 8) {
													if (local293.equalsIgnoreCase("null")) {
														local293 = null;
													}
													Static372.aStringArray27[local71 - 1] = local293;
													Static267.anIntArray342[local71 - 1] = local257;
													Static248.aBooleanArray17[local71 - 1] = local222 == 0;
												}
												Static576.aClass276_150 = null;
												return true;
											} else if (Static256.aClass276_64 == Static576.aClass276_150) {
												local222 = Static89.aClass3_Sub7_Sub1_2.method6535();
												local71 = Static89.aClass3_Sub7_Sub1_2.method6538();
												local389 = (local71 & 0x1) == 1;
												Static353.method5874(local222, local389);
												local394 = Static89.aClass3_Sub7_Sub1_2.method6535();
												for (local398 = 0; local398 < local394; local398++) {
													local400 = Static89.aClass3_Sub7_Sub1_2.method6505();
													if (local400 == 255) {
														local400 = Static89.aClass3_Sub7_Sub1_2.method6554();
													}
													local1670 = Static89.aClass3_Sub7_Sub1_2.method6521();
													Static115.method2336(local400, local1670 - 1, local389, local398, local222);
												}
												Static312.anIntArray430[Static140.anInt9492++ & 0x1F] = local222;
												Static576.aClass276_150 = null;
												return true;
											} else if (Static145.aClass276_45 == Static576.aClass276_150) {
												Static39.method1143(Static251.aClass110_26);
												Static576.aClass276_150 = null;
												return true;
											} else if (Static272.aClass276_69 == Static576.aClass276_150) {
												local222 = Static89.aClass3_Sub7_Sub1_2.method6532();
												if (local222 == 65535) {
													local222 = -1;
												}
												local71 = Static89.aClass3_Sub7_Sub1_2.method6541();
												local257 = Static89.aClass3_Sub7_Sub1_2.method6497();
												if (Static311.method5197(local71)) {
													Static82.method1138(-1, 2, local222, local257);
												}
												Static576.aClass276_150 = null;
												return true;
											} else if (Static106.aClass276_33 == Static576.aClass276_150) {
												Static39.method1143(Static146.aClass110_39);
												Static576.aClass276_150 = null;
												return true;
											} else if (Static576.aClass276_150 == Static48.aClass276_15) {
												local2177 = Static89.aClass3_Sub7_Sub1_2.method6538() == 1;
												local990 = Static89.aClass3_Sub7_Sub1_2.method6536();
												local474 = local990;
												if (local2177) {
													local474 = Static89.aClass3_Sub7_Sub1_2.method6536();
												}
												local394 = Static89.aClass3_Sub7_Sub1_2.method6538();
												local398 = Static89.aClass3_Sub7_Sub1_2.method6535();
												local1521 = false;
												if (local394 <= 1 && Static502.method7569(local474)) {
													local1521 = true;
												}
												if (!local1521 && Static472.anInt8855 == 0) {
													local1532 = Static25.aClass189_1.method4916(local398).method6946(Static89.aClass3_Sub7_Sub1_2);
													if (local394 == 2) {
														Static209.method3675(0, null, local1532, local398, "<img=1>" + local990, "<img=1>" + local474, 25, local990);
													} else if (local394 == 1) {
														Static209.method3675(0, null, local1532, local398, "<img=0>" + local990, "<img=0>" + local474, 25, local990);
													} else {
														Static209.method3675(0, null, local1532, local398, local990, local474, 25, local990);
													}
												}
												Static576.aClass276_150 = null;
												return true;
											} else if (Static550.aClass276_126 == Static576.aClass276_150) {
												Static39.method1143(Static550.aClass110_36);
												Static576.aClass276_150 = null;
												return true;
											} else if (Static576.aClass276_150 == Static591.aClass276_153) {
												local222 = Static89.aClass3_Sub7_Sub1_2.method6497();
												Static230.aClass66_4 = Static480.aClass326_3.method7787(local222);
												Static576.aClass276_150 = null;
												return true;
											} else if (Static342.aClass276_89 == Static576.aClass276_150) {
												local2177 = Static89.aClass3_Sub7_Sub1_2.method6538() == 1;
												local990 = Static89.aClass3_Sub7_Sub1_2.method6536();
												local474 = local990;
												if (local2177) {
													local474 = Static89.aClass3_Sub7_Sub1_2.method6536();
												}
												local2592 = Static89.aClass3_Sub7_Sub1_2.method6535();
												local2597 = Static89.aClass3_Sub7_Sub1_2.method6506();
												local1933 = Static89.aClass3_Sub7_Sub1_2.method6538();
												@Pc(5294) long local5294 = local2597 + (local2592 << 32);
												@Pc(5296) boolean local5296 = false;
												local3875 = 0;
												while (true) {
													if (local3875 >= 100) {
														if (local1933 <= 1) {
															if (Static397.aBoolean649 && !Static438.aBoolean691 || Static491.aBoolean666) {
																local5296 = true;
															} else if (Static502.method7569(local474)) {
																local5296 = true;
															}
														}
														break;
													}
													if (Static446.aLongArray16[local3875] == local5294) {
														local5296 = true;
														break;
													}
													local3875++;
												}
												if (!local5296 && Static472.anInt8855 == 0) {
													Static446.aLongArray16[Static292.anInt7687] = local5294;
													Static292.anInt7687 = (Static292.anInt7687 + 1) % 100;
													@Pc(5357) String local5357 = Static168.method3103(Static231.method3970(Static89.aClass3_Sub7_Sub1_2));
													if (local1933 == 2) {
														Static209.method3675(0, null, local5357, -1, "<img=1>" + local990, "<img=1>" + local474, 7, local990);
													} else if (local1933 == 1) {
														Static209.method3675(0, null, local5357, -1, "<img=0>" + local990, "<img=0>" + local474, 7, local990);
													} else {
														Static209.method3675(0, null, local5357, -1, local990, local474, 3, local990);
													}
												}
												Static576.aClass276_150 = null;
												return true;
											} else if (Static487.aClass276_132 == Static576.aClass276_150) {
												local222 = Static89.aClass3_Sub7_Sub1_2.method6521();
												local71 = Static89.aClass3_Sub7_Sub1_2.method6544();
												local257 = Static89.aClass3_Sub7_Sub1_2.method6532();
												local394 = Static89.aClass3_Sub7_Sub1_2.method6535();
												if (Static311.method5197(local394)) {
													Static196.method3331(local71, (local222 << 16) + local257);
												}
												Static576.aClass276_150 = null;
												return true;
											} else if (Static533.aClass276_141 == Static576.aClass276_150) {
												local222 = Static89.aClass3_Sub7_Sub1_2.method6535();
												local71 = Static89.aClass3_Sub7_Sub1_2.method6522();
												local257 = Static89.aClass3_Sub7_Sub1_2.method6554();
												if (Static311.method5197(local222)) {
													Static227.method3886(local71, local257);
												}
												Static576.aClass276_150 = null;
												return true;
											} else if (Static576.aClass276_150 == Static178.aClass276_47) {
												Static403.anInt7927 = Static89.aClass3_Sub7_Sub1_2.method6538();
												for (local222 = 0; local222 < Static403.anInt7927; local222++) {
													Class21_Sub3.lb[local222] = Static89.aClass3_Sub7_Sub1_2.method6536();
													Static197.aStringArray16[local222] = Static89.aClass3_Sub7_Sub1_2.method6536();
													if (Static197.aStringArray16[local222].equals("")) {
														Static197.aStringArray16[local222] = Class21_Sub3.lb[local222];
													}
													Static406.aStringArray28[local222] = Static89.aClass3_Sub7_Sub1_2.method6536();
													Static199.aStringArray18[local222] = Static89.aClass3_Sub7_Sub1_2.method6536();
													if (Static199.aStringArray18[local222].equals("")) {
														Static199.aStringArray18[local222] = Static406.aStringArray28[local222];
													}
													Static420.aBooleanArray31[local222] = false;
												}
												Static576.aClass276_150 = null;
												Static257.anInt5521 = Static509.anInt9418;
												return true;
											} else {
												@Pc(5600) Class3_Sub18 local5600;
												if (Static576.aClass276_150 == Static580.aClass276_152) {
													local222 = Static89.aClass3_Sub7_Sub1_2.method6544();
													local71 = Static89.aClass3_Sub7_Sub1_2.method6497();
													local257 = Static89.aClass3_Sub7_Sub1_2.method6541();
													if (Static311.method5197(local257)) {
														@Pc(5591) Class3_Sub18 local5591 = (Class3_Sub18) Static283.aClass25_23.method946((long) local222);
														local5600 = (Class3_Sub18) Static283.aClass25_23.method946((long) local71);
														if (local5600 != null) {
															Static146.method8079(false, local5591 == null || local5591.anInt3962 != local5600.anInt3962, local5600);
														}
														if (local5591 != null) {
															local5591.method8412();
															Static283.aClass25_23.method945(local5591, (long) local71);
														}
														@Pc(5637) Class305 local5637 = Static220.method3786(local222);
														if (local5637 != null) {
															Static282.method4860(local5637);
														}
														local5637 = Static220.method3786(local71);
														if (local5637 != null) {
															Static282.method4860(local5637);
															Static194.method3313(true, local5637);
														}
														if (Static25.anInt779 != -1) {
															Static474.method7273(1, Static25.anInt779);
														}
													}
													Static576.aClass276_150 = null;
													return true;
												} else if (Static556.aClass276_148 == Static576.aClass276_150) {
													local2177 = Static89.aClass3_Sub7_Sub1_2.method6538() == 1;
													local990 = Static89.aClass3_Sub7_Sub1_2.method6536();
													local474 = local990;
													if (local2177) {
														local474 = Static89.aClass3_Sub7_Sub1_2.method6536();
													}
													local2592 = Static89.aClass3_Sub7_Sub1_2.method6519();
													local2597 = Static89.aClass3_Sub7_Sub1_2.method6535();
													local2604 = Static89.aClass3_Sub7_Sub1_2.method6506();
													local1570 = Static89.aClass3_Sub7_Sub1_2.method6538();
													@Pc(5736) long local5736 = (local2597 << 32) + local2604;
													@Pc(5738) boolean local5738 = false;
													local3987 = 0;
													while (true) {
														if (local3987 >= 100) {
															if (local1570 <= 1) {
																if (Static397.aBoolean649 && !Static438.aBoolean691 || Static491.aBoolean666) {
																	local5738 = true;
																} else if (Static502.method7569(local474)) {
																	local5738 = true;
																}
															}
															break;
														}
														if (local5736 == Static446.aLongArray16[local3987]) {
															local5738 = true;
															break;
														}
														local3987++;
													}
													if (!local5738 && Static472.anInt8855 == 0) {
														Static446.aLongArray16[Static292.anInt7687] = local5736;
														Static292.anInt7687 = (Static292.anInt7687 + 1) % 100;
														@Pc(5801) String local5801 = Static168.method3103(Static231.method3970(Static89.aClass3_Sub7_Sub1_2));
														if (local1570 == 2 || local1570 == 3) {
															Static209.method3675(0, Static272.method4722(local2592), local5801, -1, "<img=1>" + local990, "<img=1>" + local474, 9, local990);
														} else if (local1570 == 1) {
															Static209.method3675(0, Static272.method4722(local2592), local5801, -1, "<img=0>" + local990, "<img=0>" + local474, 9, local990);
														} else {
															Static209.method3675(0, Static272.method4722(local2592), local5801, -1, local990, local474, 9, local990);
														}
													}
													Static576.aClass276_150 = null;
													return true;
												} else {
													@Pc(5941) Class3_Sub11 local5941;
													@Pc(5935) long local5935;
													@Pc(5950) Class3_Sub11 local5950;
													if (Static455.aClass276_122 == Static576.aClass276_150) {
														local222 = Static89.aClass3_Sub7_Sub1_2.method6521();
														if (local222 == 65535) {
															local222 = -1;
														}
														local71 = Static89.aClass3_Sub7_Sub1_2.method6535();
														local257 = Static89.aClass3_Sub7_Sub1_2.method6535();
														if (local257 == 65535) {
															local257 = -1;
														}
														local394 = Static89.aClass3_Sub7_Sub1_2.method6497();
														local398 = Static89.aClass3_Sub7_Sub1_2.method6544();
														if (Static311.method5197(local71)) {
															for (local400 = local257; local400 <= local222; local400++) {
																local5935 = ((long) local398 << 32) + ((long) local400);
																local5941 = (Class3_Sub11) Static258.aClass25_22.method946(local5935);
																if (local5941 != null) {
																	local5950 = new Class3_Sub11(local394, local5941.anInt1876);
																	local5941.method8412();
																} else if (local400 == -1) {
																	local5950 = new Class3_Sub11(local394, Static220.method3786(local398).aClass3_Sub11_2.anInt1876);
																} else {
																	local5950 = new Class3_Sub11(local394, -1);
																}
																Static258.aClass25_22.method945(local5950, local5935);
															}
														}
														Static576.aClass276_150 = null;
														return true;
													} else if (Static576.aClass276_150 == Static183.aClass276_49) {
														local222 = Static89.aClass3_Sub7_Sub1_2.method6505();
														local71 = Static89.aClass3_Sub7_Sub1_2.method6532();
														local257 = Static89.aClass3_Sub7_Sub1_2.method6535();
														if (Static311.method5197(local71)) {
															if (local222 == 2) {
																Static423.method6764();
															}
															Static25.anInt779 = local257;
															Static380.method6131(local257);
															Static48.method1238(false);
															Static597.method8428(Static25.anInt779);
															for (local394 = 0; local394 < 100; local394++) {
																Static518.aBooleanArray37[local394] = true;
															}
														}
														Static576.aClass276_150 = null;
														return true;
													} else if (Static576.aClass276_150 == Static427.aClass276_138) {
														local222 = Static89.aClass3_Sub7_Sub1_2.method6535();
														local71 = Static89.aClass3_Sub7_Sub1_2.method6505();
														local257 = Static89.aClass3_Sub7_Sub1_2.method6554();
														local394 = Static89.aClass3_Sub7_Sub1_2.method6541();
														if (Static311.method5197(local222)) {
															local5600 = (Class3_Sub18) Static283.aClass25_23.method946((long) local257);
															if (local5600 != null) {
																Static146.method8079(false, local394 != local5600.anInt3962, local5600);
															}
															Static59.method1502(local257, local394, false, local71);
														}
														Static576.aClass276_150 = null;
														return true;
													} else if (Static576.aClass276_150 == Static29.aClass276_8) {
														Static292.anInt7686 = Static89.aClass3_Sub7_Sub1_2.method6547();
														Static215.anInt6070 = Static89.aClass3_Sub7_Sub1_2.method6526() << 3;
														Static112.anInt2616 = Static89.aClass3_Sub7_Sub1_2.method6523() << 3;
														while (Static79.anInt10464 > Static89.aClass3_Sub7_Sub1_2.anInt7869) {
															@Pc(6136) Class110 local6136 = Static71.method1745()[Static89.aClass3_Sub7_Sub1_2.method6538()];
															Static39.method1143(local6136);
														}
														Static576.aClass276_150 = null;
														return true;
													} else if (Static276.aClass276_70 == Static576.aClass276_150) {
														Static39.method1143(Static488.aClass110_9);
														Static576.aClass276_150 = null;
														return true;
													} else if (Static185.aClass276_50 == Static576.aClass276_150) {
														for (local222 = 0; local222 < Static378.aClass2_Sub2_Sub1_Sub1Array10.length; local222++) {
															if (Static378.aClass2_Sub2_Sub1_Sub1Array10[local222] != null) {
																Static378.aClass2_Sub2_Sub1_Sub1Array10[local222].anIntArray484 = null;
																Static378.aClass2_Sub2_Sub1_Sub1Array10[local222].anInt7651 = -1;
															}
														}
														for (local71 = 0; local71 < Static17.anInt6046; local71++) {
															Static60.aClass3_Sub46Array1[local71].aClass2_Sub2_Sub1_Sub2_2.anIntArray484 = null;
															Static60.aClass3_Sub46Array1[local71].aClass2_Sub2_Sub1_Sub2_2.anInt7651 = -1;
														}
														Static576.aClass276_150 = null;
														return true;
													} else if (Static576.aClass276_150 == Static294.aClass276_151) {
														local222 = Static89.aClass3_Sub7_Sub1_2.method6497();
														local71 = Static89.aClass3_Sub7_Sub1_2.method6521();
														local257 = Static89.aClass3_Sub7_Sub1_2.method6535();
														if (local257 == 65535) {
															local257 = -1;
														}
														local394 = Static89.aClass3_Sub7_Sub1_2.method6541();
														local398 = Static89.aClass3_Sub7_Sub1_2.method6535();
														if (local398 == 65535) {
															local398 = -1;
														}
														if (Static311.method5197(local394)) {
															for (local400 = local257; local400 <= local398; local400++) {
																local5935 = (long) local400 + ((long) local222 << 32);
																local5941 = (Class3_Sub11) Static258.aClass25_22.method946(local5935);
																if (local5941 != null) {
																	local5950 = new Class3_Sub11(local5941.anInt1877, local71);
																	local5941.method8412();
																} else if (local400 == -1) {
																	local5950 = new Class3_Sub11(Static220.method3786(local222).aClass3_Sub11_2.anInt1877, local71);
																} else {
																	local5950 = new Class3_Sub11(0, local71);
																}
																Static258.aClass25_22.method945(local5950, local5935);
															}
														}
														Static576.aClass276_150 = null;
														return true;
													} else if (Static576.aClass276_150 == Static20.aClass276_4) {
														local222 = Static89.aClass3_Sub7_Sub1_2.method6538();
														if (Static89.aClass3_Sub7_Sub1_2.method6538() == 0) {
															Static105.aClass348Array1[local222] = new Class348();
														} else {
															Static89.aClass3_Sub7_Sub1_2.anInt7869--;
															Static105.aClass348Array1[local222] = new Class348(Static89.aClass3_Sub7_Sub1_2);
														}
														Static155.anInt3389 = Static509.anInt9418;
														Static576.aClass276_150 = null;
														return true;
													} else if (Static576.aClass276_150 == Static509.aClass276_137) {
														local222 = Static89.aClass3_Sub7_Sub1_2.method6505();
														local71 = Static89.aClass3_Sub7_Sub1_2.method6547();
														if (local71 == 255) {
															local222 = -1;
															local71 = -1;
														}
														Static281.method4846(local222, local71);
														Static576.aClass276_150 = null;
														return true;
													} else if (Static576.aClass276_150 == Static346.aClass276_90) {
														local222 = Static89.aClass3_Sub7_Sub1_2.method6497();
														local71 = Static89.aClass3_Sub7_Sub1_2.method6541();
														local257 = Static89.aClass3_Sub7_Sub1_2.method6535();
														if (Static311.method5197(local71)) {
															Static258.method4581(local257, local222);
														}
														Static576.aClass276_150 = null;
														return true;
													} else if (Static323.aClass276_84 == Static576.aClass276_150) {
														local222 = Static89.aClass3_Sub7_Sub1_2.method6547();
														local71 = Static89.aClass3_Sub7_Sub1_2.method6535();
														@Pc(6431) int[] local6431 = new int[4];
														for (local394 = 0; local394 < 4; local394++) {
															local6431[local394] = Static89.aClass3_Sub7_Sub1_2.method6535();
														}
														@Pc(6453) Class3_Sub46 local6453 = (Class3_Sub46) Static331.aClass25_25.method946((long) local71);
														if (local6453 != null) {
															Static517.method7683(local6431, local6453.aClass2_Sub2_Sub1_Sub2_2, local222);
														}
														Static576.aClass276_150 = null;
														return true;
													} else if (Static179.aClass276_48 == Static576.aClass276_150) {
														local222 = Static89.aClass3_Sub7_Sub1_2.method6535();
														local71 = Static89.aClass3_Sub7_Sub1_2.method6538();
														local257 = Static89.aClass3_Sub7_Sub1_2.method6538();
														local394 = Static89.aClass3_Sub7_Sub1_2.method6538();
														local398 = Static89.aClass3_Sub7_Sub1_2.method6538();
														local400 = Static89.aClass3_Sub7_Sub1_2.method6535();
														if (Static311.method5197(local222)) {
															Static525.aBooleanArray38[local71] = true;
															Static311.anIntArray428[local71] = local257;
															Static254.anIntArray491[local71] = local394;
															Static380.anIntArray473[local71] = local398;
															Static477.anIntArray582[local71] = local400;
														}
														Static576.aClass276_150 = null;
														return true;
													} else if (Static133.aClass276_40 == Static576.aClass276_150) {
														local222 = Static89.aClass3_Sub7_Sub1_2.method6538();
														@Pc(6544) boolean local6544 = (local222 & 0x1) == 1;
														local474 = Static89.aClass3_Sub7_Sub1_2.method6536();
														local293 = Static89.aClass3_Sub7_Sub1_2.method6536();
														if (local293.equals("")) {
															local293 = local474;
														}
														local295 = Static89.aClass3_Sub7_Sub1_2.method6536();
														local326 = Static89.aClass3_Sub7_Sub1_2.method6536();
														if (local326.equals("")) {
															local326 = local295;
														}
														if (local6544) {
															for (local1670 = 0; local1670 < Static403.anInt7927; local1670++) {
																if (Static197.aStringArray16[local1670].equals(local326)) {
																	Class21_Sub3.lb[local1670] = local474;
																	Static197.aStringArray16[local1670] = local293;
																	Static406.aStringArray28[local1670] = local295;
																	Static199.aStringArray18[local1670] = local326;
																	break;
																}
															}
														} else {
															Class21_Sub3.lb[Static403.anInt7927] = local474;
															Static197.aStringArray16[Static403.anInt7927] = local293;
															Static406.aStringArray28[Static403.anInt7927] = local295;
															Static199.aStringArray18[Static403.anInt7927] = local326;
															Static420.aBooleanArray31[Static403.anInt7927] = (local222 & 0x2) == 2;
															Static403.anInt7927++;
														}
														Static257.anInt5521 = Static509.anInt9418;
														Static576.aClass276_150 = null;
														return true;
													} else if (Static370.aClass276_95 == Static576.aClass276_150) {
														Static593.method8374(true);
														Static576.aClass276_150 = null;
														return true;
													} else if (Static191.aClass276_53 == Static576.aClass276_150) {
														Static469.method7212(Static89.aClass3_Sub7_Sub1_2, Static480.aClass326_3, Static79.anInt10464);
														Static576.aClass276_150 = null;
														return true;
													} else if (Static576.aClass276_150 == Static471.aClass276_127) {
														local222 = Static89.aClass3_Sub7_Sub1_2.method6535();
														if (local222 == 65535) {
															local222 = -1;
														}
														local71 = Static89.aClass3_Sub7_Sub1_2.method6538();
														local257 = Static89.aClass3_Sub7_Sub1_2.method6535();
														local394 = Static89.aClass3_Sub7_Sub1_2.method6538();
														Static148.method2905(local71, local222, local257, false, local394);
														Static576.aClass276_150 = null;
														return true;
													} else if (Static576.aClass276_150 == Static469.aClass276_125) {
														Static576.aClass276_150 = null;
														Static396.anInt7675 = 1;
														Static257.anInt5521 = Static509.anInt9418;
														return true;
													} else if (Static346.aClass276_91 == Static576.aClass276_150) {
														Static39.method1143(Static375.aClass110_29);
														Static576.aClass276_150 = null;
														return true;
													} else if (Static191.aClass276_52 == Static576.aClass276_150) {
														local222 = Static89.aClass3_Sub7_Sub1_2.method6548();
														local71 = Static89.aClass3_Sub7_Sub1_2.method6521();
														Static588.aClass322_1.method7764(local71, local222);
														Static576.aClass276_150 = null;
														return true;
													} else if (Static265.aClass276_66 == Static576.aClass276_150) {
														if (Static159.method3027(Static75.anInt1880)) {
															Static101.anInt2408 = (int) ((float) Static89.aClass3_Sub7_Sub1_2.method6535() * 2.5F);
														} else {
															Static101.anInt2408 = Static89.aClass3_Sub7_Sub1_2.method6535() * 30;
														}
														Static596.anInt10437 = Static509.anInt9418;
														Static576.aClass276_150 = null;
														return true;
													} else if (Static17.aClass276_77 == Static576.aClass276_150) {
														local222 = Static89.aClass3_Sub7_Sub1_2.method6532();
														if (local222 == 65535) {
															local222 = -1;
														}
														local71 = Static89.aClass3_Sub7_Sub1_2.method6548();
														local257 = local71 >> 28 & 0x3;
														local394 = local71 >> 14 & 0x3FFF;
														local398 = local71 & 0x3FFF;
														local400 = Static89.aClass3_Sub7_Sub1_2.method6555();
														local1670 = local400 >> 2;
														local1933 = local400 & 0x3;
														@Pc(6822) int local6822 = local394 - Static230.anInt4667;
														local1561 = Static85.anIntArray92[local1670];
														@Pc(6830) int local6830 = local398 - Static563.anInt10006;
														Static269.method4714(local6822, local257, local1670, local1933, local222, local1561, local6830);
														Static576.aClass276_150 = null;
														return true;
													} else {
														Static468.method7192("T1 - " + (Static576.aClass276_150 == null ? -1 : Static576.aClass276_150.method6903()) + "," + (Static91.aClass276_28 == null ? -1 : Static91.aClass276_28.method6903()) + "," + (Static403.aClass276_102 == null ? -1 : Static403.aClass276_102.method6903()) + " - " + Static79.anInt10464, null);
														Static233.method4046(false);
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

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIII)Lclient!wk;")
	public static Class2_Sub2_Sub1 method3736(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class125 local11 = Static580.aClass125ArrayArrayArray3[arg0][arg1][arg2];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class2_Sub2_Sub1 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(22) Class302 local22 = local11.aClass302_1; local22 != null; local22 = local22.aClass302_2) {
			@Pc(31) Class2_Sub2 local31 = local22.aClass2_Sub2_1;
			if (local31 instanceof Class2_Sub2_Sub1) {
				@Pc(37) Class2_Sub2_Sub1 local37 = (Class2_Sub2_Sub1) local31;
				@Pc(49) int local49 = (local37.method6311() - 1) * 256 + 252;
				@Pc(57) int local57 = local37.anInt9398 - local49 >> 9;
				@Pc(65) int local65 = local37.anInt9396 - local49 >> 9;
				@Pc(73) int local73 = local37.anInt9398 + local49 >> 9;
				@Pc(80) int local80 = local49 + local37.anInt9396 >> 9;
				if (local57 <= arg1 && local65 <= arg2 && arg1 <= local73 && local80 >= arg2) {
					@Pc(110) int local110 = (local73 + 1 - arg1) * (local80 + 1 + -arg2);
					if (local19 < local110) {
						local17 = local37;
						local19 = local110;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!w;III[Z)V")
	public static void method3738(@OriginalArg(0) Class3_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static224.aClass4Array3 == Static495.aClass4Array4) {
			return;
		}
		@Pc(9) int local9 = Static381.aClass4Array2[arg1].sa(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class4 local22 = Static381.aClass4Array2[local11];
				if (local22 != null) {
					local22.FA(arg0, arg2, local9 - local22.sa(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
