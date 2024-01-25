import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!eo", name = "Fb", descriptor = "I")
	public static int anInt2794;

	@OriginalMember(owner = "client!eo", name = "Eb", descriptor = "S")
	public static short aShort42 = 32767;

	@OriginalMember(owner = "client!eo", name = "x", descriptor = "(I)Z")
	public static boolean method2613() throws IOException {
		if (Static453.aClass154_1 == null) {
			return false;
		}
		@Pc(71) int local71;
		if (Static304.aClass6_92 == null) {
			if (Static449.aBoolean499) {
				if (!Static453.aClass154_1.method4019(1)) {
					return false;
				}
				Static453.aClass154_1.method4022(1, Static255.aClass1_Sub13_Sub2_2.aByteArray45, 0);
				Static215.anInt4441 = 0;
				Static449.aBoolean499 = false;
				Static543.anInt9404++;
			}
			Static255.aClass1_Sub13_Sub2_2.anInt3400 = 0;
			if (Static255.aClass1_Sub13_Sub2_2.method3085()) {
				if (!Static453.aClass154_1.method4019(1)) {
					return false;
				}
				Static453.aClass154_1.method4022(1, Static255.aClass1_Sub13_Sub2_2.aByteArray45, 1);
				Static215.anInt4441 = 0;
				Static543.anInt9404++;
			}
			Static449.aBoolean499 = true;
			@Pc(67) Class6[] local67 = Static33.method1302();
			local71 = Static255.aClass1_Sub13_Sub2_2.method3092();
			if (local71 < 0 || local71 >= local67.length) {
				throw new IOException("invo:" + local71 + " ip:" + Static255.aClass1_Sub13_Sub2_2.anInt3400);
			}
			Static304.aClass6_92 = local67[local71];
			Static45.anInt1403 = Static304.aClass6_92.anInt116;
		}
		if (Static45.anInt1403 == -1) {
			if (!Static453.aClass154_1.method4019(1)) {
				return false;
			}
			Static453.aClass154_1.method4022(1, Static255.aClass1_Sub13_Sub2_2.aByteArray45, 0);
			Static543.anInt9404++;
			Static45.anInt1403 = Static255.aClass1_Sub13_Sub2_2.aByteArray45[0] & 0xFF;
			Static215.anInt4441 = 0;
		}
		if (Static45.anInt1403 == -2) {
			if (!Static453.aClass154_1.method4019(2)) {
				return false;
			}
			Static453.aClass154_1.method4022(2, Static255.aClass1_Sub13_Sub2_2.aByteArray45, 0);
			Static255.aClass1_Sub13_Sub2_2.anInt3400 = 0;
			Static45.anInt1403 = Static255.aClass1_Sub13_Sub2_2.method3056();
			Static543.anInt9404 += 2;
			Static215.anInt4441 = 0;
		}
		if (Static45.anInt1403 > 0) {
			if (!Static453.aClass154_1.method4019(Static45.anInt1403)) {
				return false;
			}
			Static255.aClass1_Sub13_Sub2_2.anInt3400 = 0;
			Static453.aClass154_1.method4022(Static45.anInt1403, Static255.aClass1_Sub13_Sub2_2.aByteArray45, 0);
			Static215.anInt4441 = 0;
			Static543.anInt9404 += Static45.anInt1403;
		}
		Static388.aClass6_117 = Static136.aClass6_48;
		Static136.aClass6_48 = Static487.aClass6_129;
		Static487.aClass6_129 = Static304.aClass6_92;
		if (Static304.aClass6_92 == Static292.aClass6_87) {
			Static360.anInt9307 = 1;
			Static304.aClass6_92 = null;
			Static340.anInt6357 = Static418.anInt7279;
			return true;
		}
		@Pc(228) int local228;
		@Pc(212) int local212;
		@Pc(224) int local224;
		@Pc(220) int local220;
		if (Static494.aClass6_133 == Static304.aClass6_92) {
			local212 = Static255.aClass1_Sub13_Sub2_2.method3035();
			local71 = Static255.aClass1_Sub13_Sub2_2.method3056();
			local220 = Static255.aClass1_Sub13_Sub2_2.method3027();
			local224 = Static255.aClass1_Sub13_Sub2_2.method3049();
			local228 = Static255.aClass1_Sub13_Sub2_2.method3035();
			if (Static383.method7638(local220)) {
				Static112.method2462(local212, local71, local228, local224);
			}
			Static304.aClass6_92 = null;
			return true;
		}
		@Pc(260) String local260;
		@Pc(270) long local270;
		@Pc(275) long local275;
		@Pc(280) long local280;
		@Pc(284) int local284;
		@Pc(254) boolean local254;
		@Pc(258) String local258;
		@Pc(288) int local288;
		if (Static111.aClass6_42 == Static304.aClass6_92) {
			local254 = Static255.aClass1_Sub13_Sub2_2.method3043() == 1;
			local258 = Static255.aClass1_Sub13_Sub2_2.method3034();
			local260 = local258;
			if (local254) {
				local260 = Static255.aClass1_Sub13_Sub2_2.method3034();
			}
			local270 = Static255.aClass1_Sub13_Sub2_2.method3015();
			local275 = Static255.aClass1_Sub13_Sub2_2.method3056();
			local280 = Static255.aClass1_Sub13_Sub2_2.method3039();
			local284 = Static255.aClass1_Sub13_Sub2_2.method3043();
			local288 = Static255.aClass1_Sub13_Sub2_2.method3056();
			@Pc(294) long local294 = local280 + (local275 << 32);
			@Pc(296) boolean local296 = false;
			@Pc(298) int local298 = 0;
			while (true) {
				if (local298 >= 100) {
					if (local284 <= 1 && Static32.method1279(local260)) {
						local296 = true;
					}
					break;
				}
				if (Static426.aLongArray13[local298] == local294) {
					local296 = true;
					break;
				}
				local298++;
			}
			if (!local296 && Static423.anInt8969 == 0) {
				Static426.aLongArray13[Static103.anInt2464] = local294;
				Static103.anInt2464 = (Static103.anInt2464 + 1) % 100;
				@Pc(349) String local349 = Static111.aClass109_1.method3268(local288).method5816(Static255.aClass1_Sub13_Sub2_2);
				if (local284 == 2) {
					Static49.method1492("<img=1>" + local260, Static292.method4927(local270), local349, "<img=1>" + local258, 0, 20, local288);
				} else if (local284 == 1) {
					Static49.method1492("<img=0>" + local260, Static292.method4927(local270), local349, "<img=0>" + local258, 0, 20, local288);
				} else {
					Static49.method1492(local260, Static292.method4927(local270), local349, local258, 0, 20, local288);
				}
			}
			Static304.aClass6_92 = null;
			return true;
		}
		@Pc(452) int local452;
		if (Static217.aClass6_65 == Static304.aClass6_92) {
			local212 = Static255.aClass1_Sub13_Sub2_2.method3056();
			local71 = Static255.aClass1_Sub13_Sub2_2.method3056();
			local220 = Static255.aClass1_Sub13_Sub2_2.method3056();
			local224 = Static255.aClass1_Sub13_Sub2_2.method3056();
			if (Static383.method7638(local212) && Static352.aClass309ArrayArray2[local71] != null) {
				for (local228 = local220; local228 < local224; local228++) {
					local452 = Static255.aClass1_Sub13_Sub2_2.method3039();
					if (Static352.aClass309ArrayArray2[local71].length > local228 && Static352.aClass309ArrayArray2[local71][local228] != null) {
						Static352.aClass309ArrayArray2[local71][local228].anInt8736 = local452;
					}
				}
			}
			Static304.aClass6_92 = null;
			return true;
		}
		@Pc(494) String local494;
		if (Static304.aClass6_92 == Static453.aClass6_125) {
			local494 = Static255.aClass1_Sub13_Sub2_2.method3034();
			local71 = Static255.aClass1_Sub13_Sub2_2.method3056();
			local260 = Static111.aClass109_1.method3268(local71).method5816(Static255.aClass1_Sub13_Sub2_2);
			Static49.method1492(local494, null, local260, local494, 0, 19, local71);
			Static304.aClass6_92 = null;
			return true;
		} else if (Static304.aClass6_92 == Static256.aClass6_78) {
			Static280.anInt5513 = Static255.aClass1_Sub13_Sub2_2.method3044() << 3;
			Static501.anInt8506 = Static255.aClass1_Sub13_Sub2_2.method3063() << 3;
			Static185.anInt3937 = Static255.aClass1_Sub13_Sub2_2.method3072();
			while (Static255.aClass1_Sub13_Sub2_2.anInt3400 < Static45.anInt1403) {
				@Pc(546) Class33 local546 = Static468.method6834()[Static255.aClass1_Sub13_Sub2_2.method3043()];
				Static307.method5102(local546);
			}
			Static304.aClass6_92 = null;
			return true;
		} else if (Static304.aClass6_92 == Static483.aClass6_128) {
			Static291.anInt5669 = Static255.aClass1_Sub13_Sub2_2.method3016();
			Static62.anInt1821 = Static255.aClass1_Sub13_Sub2_2.method3043();
			Static304.aClass6_92 = null;
			return true;
		} else if (Static304.aClass6_92 == Static195.aClass6_63) {
			Static307.method5102(Static437.aClass33_20);
			Static304.aClass6_92 = null;
			return true;
		} else if (Static130.aClass6_45 == Static304.aClass6_92) {
			local212 = Static255.aClass1_Sub13_Sub2_2.method3056();
			if (Static383.method7638(local212)) {
				Static438.method2400();
			}
			Static304.aClass6_92 = null;
			return true;
		} else if (Static304.aClass6_92 == Static462.aClass6_126) {
			local212 = Static255.aClass1_Sub13_Sub2_2.method3035();
			local71 = Static255.aClass1_Sub13_Sub2_2.method3049();
			local220 = Static255.aClass1_Sub13_Sub2_2.method3027();
			if (Static383.method7638(local212)) {
				Static33.method1301(local220, local71);
			}
			Static304.aClass6_92 = null;
			return true;
		} else if (Static304.aClass6_92 == Static368.aClass6_113) {
			Static248.aClass91_17 = Static381.method7909(Static255.aClass1_Sub13_Sub2_2.method3043());
			Static304.aClass6_92 = null;
			return true;
		} else if (Static531.aClass6_141 == Static304.aClass6_92) {
			Static307.method5102(Static325.aClass33_15);
			Static304.aClass6_92 = null;
			return true;
		} else if (Static304.aClass6_92 == Static344.aClass6_104) {
			Static307.method5102(Static60.aClass33_3);
			Static304.aClass6_92 = null;
			return true;
		} else {
			@Pc(1324) int local1324;
			@Pc(1125) int local1125;
			@Pc(690) boolean local690;
			@Pc(709) int local709;
			@Pc(1317) int local1317;
			@Pc(734) boolean local734;
			@Pc(1200) int local1200;
			@Pc(778) int local778;
			if (Static304.aClass6_92 == Static12.aClass6_8) {
				local212 = Static255.aClass1_Sub13_Sub2_2.method3029();
				local71 = Static255.aClass1_Sub13_Sub2_2.method3053();
				local220 = Static255.aClass1_Sub13_Sub2_2.method3043();
				local224 = Static255.aClass1_Sub13_Sub2_2.method3027();
				local228 = Static255.aClass1_Sub13_Sub2_2.method3035();
				local690 = (local220 & 0x80) != 0;
				if (local212 >> 30 == 0) {
					@Pc(802) Class112 local802;
					@Pc(824) Class280 local824;
					@Pc(818) Class280 local818;
					if (local212 >> 29 != 0) {
						local709 = local212 & 0xFFFF;
						@Pc(1027) Class1_Sub10 local1027 = (Class1_Sub10) Static258.aClass174_15.method4422((long) local709);
						if (local1027 != null) {
							@Pc(1032) Class47_Sub2_Sub3_Sub1 local1032 = local1027.aClass47_Sub2_Sub3_Sub1_2;
							if (local224 == 65535) {
								local224 = -1;
							}
							@Pc(1041) boolean local1041 = true;
							local288 = local690 ? local1032.anInt5070 : local1032.anInt5052;
							if (local224 != -1 && local288 != -1) {
								if (local288 == local224) {
									local802 = Static529.aClass90_2.method2963(local224);
									if (local802.aBoolean233 && local802.anInt3703 != -1) {
										local818 = Static6.aClass126_1.method3574(local802.anInt3703);
										local1125 = local818.anInt8110;
										if (local1125 == 0 || local1125 == 2) {
											local1041 = false;
										} else if (local1125 == 1) {
											local1041 = true;
										}
									}
								} else {
									local802 = Static529.aClass90_2.method2963(local224);
									@Pc(1069) Class112 local1069 = Static529.aClass90_2.method2963(local288);
									if (local802.anInt3703 != -1 && local1069.anInt3703 != -1) {
										local824 = Static6.aClass126_1.method3574(local802.anInt3703);
										@Pc(1091) Class280 local1091 = Static6.aClass126_1.method3574(local1069.anInt3703);
										if (local1091.anInt8103 > local824.anInt8103) {
											local1041 = false;
										}
									}
								}
							}
							if (local1041) {
								if (local690) {
									local1032.anInt5022 = 0;
									local1032.anInt5019 = local228;
									local1032.anInt5070 = local224;
									local1032.anInt5071 = local220 & 0x7;
									local1032.anInt5044 = 1;
									local1032.anInt5009 = 0;
									local1032.anInt5065 = local71 + Static416.anInt7252;
									if (Static416.anInt7252 < local1032.anInt5065) {
										local1032.anInt5022 = -1;
									}
									if (local1032.anInt5070 != -1 && local1032.anInt5065 == Static416.anInt7252) {
										local1200 = Static529.aClass90_2.method2963(local1032.anInt5070).anInt3703;
										if (local1200 != -1) {
											local818 = Static6.aClass126_1.method3574(local1200);
											if (local818 != null && local818.anIntArray629 != null) {
												Static351.method5589(local1032.anInt8189, local818, false, local1032.aByte94, local1032.anInt8191, 0);
											}
										}
									}
								} else {
									local1032.anInt5010 = 0;
									local1032.anInt5052 = local224;
									local1032.anInt5076 = local228;
									local1032.anInt5028 = local220 & 0x7;
									local1032.anInt5004 = 1;
									local1032.anInt5032 = local71 + Static416.anInt7252;
									local1032.anInt5012 = 0;
									if (local1032.anInt5032 > Static416.anInt7252) {
										local1032.anInt5012 = -1;
									}
									if (local1032.anInt5052 != -1 && Static416.anInt7252 == local1032.anInt5032) {
										local1200 = Static529.aClass90_2.method2963(local1032.anInt5052).anInt3703;
										if (local1200 != -1) {
											local818 = Static6.aClass126_1.method3574(local1200);
											if (local818 != null && local818.anIntArray629 != null) {
												Static351.method5589(local1032.anInt8189, local818, false, local1032.aByte94, local1032.anInt8191, 0);
											}
										}
									}
								}
							}
						}
					} else if (local212 >> 28 != 0) {
						local709 = local212 & 0xFFFF;
						@Pc(720) Class47_Sub2_Sub3_Sub2 local720;
						if (Static150.anInt3353 == local709) {
							local720 = Static16.aClass47_Sub2_Sub3_Sub2_1;
						} else {
							local720 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local709];
						}
						if (local720 != null) {
							if (local224 == 65535) {
								local224 = -1;
							}
							local734 = true;
							local284 = local690 ? local720.anInt5070 : local720.anInt5052;
							@Pc(775) Class280 local775;
							if (local224 != -1 && local284 != -1) {
								@Pc(762) Class112 local762;
								if (local224 == local284) {
									local762 = Static529.aClass90_2.method2963(local224);
									if (local762.aBoolean233 && local762.anInt3703 != -1) {
										local775 = Static6.aClass126_1.method3574(local762.anInt3703);
										local778 = local775.anInt8110;
										if (local778 == 0 || local778 == 2) {
											local734 = false;
										} else if (local778 == 1) {
											local734 = true;
										}
									}
								} else {
									local762 = Static529.aClass90_2.method2963(local224);
									local802 = Static529.aClass90_2.method2963(local284);
									if (local762.anInt3703 != -1 && local802.anInt3703 != -1) {
										local818 = Static6.aClass126_1.method3574(local762.anInt3703);
										local824 = Static6.aClass126_1.method3574(local802.anInt3703);
										if (local818.anInt8103 < local824.anInt8103) {
											local734 = false;
										}
									}
								}
							}
							if (local734) {
								if (local690) {
									local720.anInt5022 = 0;
									local720.anInt5071 = local220 & 0x7;
									local720.anInt5070 = local224;
									local720.anInt5044 = 1;
									local720.anInt5019 = local228;
									local720.anInt5009 = 0;
									local720.anInt5065 = local71 + Static416.anInt7252;
									if (local720.anInt5070 == 65535) {
										local720.anInt5070 = -1;
									}
									if (local720.anInt5065 > Static416.anInt7252) {
										local720.anInt5022 = -1;
									}
									if (local720.anInt5070 != -1 && local720.anInt5065 == Static416.anInt7252) {
										local288 = Static529.aClass90_2.method2963(local720.anInt5070).anInt3703;
										if (local288 != -1) {
											local775 = Static6.aClass126_1.method3574(local288);
											if (local775 != null && local775.anIntArray629 != null) {
												Static351.method5589(local720.anInt8189, local775, Static16.aClass47_Sub2_Sub3_Sub2_1 == local720, local720.aByte94, local720.anInt8191, 0);
											}
										}
									}
								} else {
									local720.anInt5010 = 0;
									local720.anInt5052 = local224;
									local720.anInt5012 = 0;
									local720.anInt5076 = local228;
									local720.anInt5004 = 1;
									local720.anInt5032 = Static416.anInt7252 + local71;
									local720.anInt5028 = local220 & 0x7;
									if (local720.anInt5052 == 65535) {
										local720.anInt5052 = -1;
									}
									if (local720.anInt5032 > Static416.anInt7252) {
										local720.anInt5012 = -1;
									}
									if (local720.anInt5052 != -1 && local720.anInt5032 == Static416.anInt7252) {
										local288 = Static529.aClass90_2.method2963(local720.anInt5052).anInt3703;
										if (local288 != -1) {
											local775 = Static6.aClass126_1.method3574(local288);
											if (local775 != null && local775.anIntArray629 != null) {
												Static351.method5589(local720.anInt8189, local775, local720 == Static16.aClass47_Sub2_Sub3_Sub2_1, local720.aByte94, local720.anInt8191, 0);
											}
										}
									}
								}
							}
						}
					}
				} else {
					local709 = local212 >> 28 & 0x3;
					local1317 = (local212 >> 14 & 0x3FFF) - Static324.anInt6132;
					local1324 = (local212 & 0x3FFF) - Static517.anInt8716;
					if (local1317 >= 0 && local1324 >= 0 && local1317 < Static542.anInt9387 && Static36.anInt1324 > local1324) {
						local284 = local1317 * 128 + 64;
						local288 = local1324 * 128 + 64;
						local1200 = local709;
						if (local709 < 3 && Static180.method3467(local1317, local1324)) {
							local1200 = local709 + 1;
						}
						@Pc(1391) Class47_Sub2_Sub2 local1391 = new Class47_Sub2_Sub2(local224, 0, Static416.anInt7252, local709, local1200, local284, Static74.method1954(local709, local288, local284) - local228, local288, local1317, local1317, local1324, local1324, local220);
						Static35.aClass38_14.method1426(new Class1_Sub1_Sub6(local1391));
					}
				}
				Static304.aClass6_92 = null;
				return true;
			}
			@Pc(1452) long local1452;
			@Pc(1458) Class1_Sub51 local1458;
			@Pc(1469) Class1_Sub51 local1469;
			if (Static304.aClass6_92 == Static258.aClass6_79) {
				local212 = Static255.aClass1_Sub13_Sub2_2.method3027();
				if (local212 == 65535) {
					local212 = -1;
				}
				local71 = Static255.aClass1_Sub13_Sub2_2.method3049();
				local220 = Static255.aClass1_Sub13_Sub2_2.method3053();
				if (local220 == 65535) {
					local220 = -1;
				}
				local224 = Static255.aClass1_Sub13_Sub2_2.method3027();
				local228 = Static255.aClass1_Sub13_Sub2_2.method3026();
				if (Static383.method7638(local224)) {
					for (local452 = local220; local452 <= local212; local452++) {
						local1452 = (long) local452 + ((long) local71 << 32);
						local1458 = (Class1_Sub51) Static494.aClass174_36.method4422(local1452);
						if (local1458 != null) {
							local1469 = new Class1_Sub51(local228, local1458.anInt9473);
							local1458.method7983();
						} else if (local452 == -1) {
							local1469 = new Class1_Sub51(local228, Static80.method2005(local71).aClass1_Sub51_2.anInt9473);
						} else {
							local1469 = new Class1_Sub51(local228, -1);
						}
						Static494.aClass174_36.method4420(local1469, local1452);
					}
				}
				Static304.aClass6_92 = null;
				return true;
			} else if (Static304.aClass6_92 == Static135.aClass6_47) {
				Static343.aClass286_1.method6997();
				Static267.anInt5165 += 32;
				Static304.aClass6_92 = null;
				return true;
			} else if (Static304.aClass6_92 == Static189.aClass6_60) {
				local212 = Static255.aClass1_Sub13_Sub2_2.method3057();
				local71 = Static255.aClass1_Sub13_Sub2_2.method3016();
				local220 = Static255.aClass1_Sub13_Sub2_2.method3053();
				if (local220 == 65535) {
					local220 = -1;
				}
				Static77.method1977(local220, local212, local71);
				Static304.aClass6_92 = null;
				return true;
			} else if (Static358.aClass6_35 == Static304.aClass6_92) {
				local212 = Static255.aClass1_Sub13_Sub2_2.method3053();
				if (local212 == 65535) {
					local212 = -1;
				}
				local71 = Static255.aClass1_Sub13_Sub2_2.method3057();
				local220 = Static255.aClass1_Sub13_Sub2_2.method3076();
				Static98.method6251(local71, local212, local220);
				Static304.aClass6_92 = null;
				return true;
			} else if (Static304.aClass6_92 == Static71.aClass6_24) {
				local254 = Static255.aClass1_Sub13_Sub2_2.method3043() == 1;
				local258 = Static255.aClass1_Sub13_Sub2_2.method3034();
				local260 = local258;
				if (local254) {
					local260 = Static255.aClass1_Sub13_Sub2_2.method3034();
				}
				local270 = Static255.aClass1_Sub13_Sub2_2.method3056();
				local275 = Static255.aClass1_Sub13_Sub2_2.method3039();
				local1317 = Static255.aClass1_Sub13_Sub2_2.method3043();
				@Pc(1624) long local1624 = local275 + (local270 << 32);
				@Pc(1626) boolean local1626 = false;
				local1200 = 0;
				while (true) {
					if (local1200 >= 100) {
						if (local1317 <= 1) {
							if (Static320.aBoolean413 && !Static258.aBoolean339 || Static231.aBoolean483) {
								local1626 = true;
							} else if (Static32.method1279(local260)) {
								local1626 = true;
							}
						}
						break;
					}
					if (local1624 == Static426.aLongArray13[local1200]) {
						local1626 = true;
						break;
					}
					local1200++;
				}
				if (!local1626 && Static423.anInt8969 == 0) {
					Static426.aLongArray13[Static103.anInt2464] = local1624;
					Static103.anInt2464 = (Static103.anInt2464 + 1) % 100;
					@Pc(1691) String local1691 = Static236.method4026(Static398.method5999(Static255.aClass1_Sub13_Sub2_2));
					if (local1317 == 2) {
						Static49.method1492("<img=1>" + local260, null, local1691, "<img=1>" + local258, 0, 7, -1);
					} else if (local1317 == 1) {
						Static49.method1492("<img=0>" + local260, null, local1691, "<img=0>" + local258, 0, 7, -1);
					} else {
						Static49.method1492(local260, null, local1691, local258, 0, 3, -1);
					}
				}
				Static304.aClass6_92 = null;
				return true;
			} else {
				@Pc(1802) String local1802;
				@Pc(1770) boolean local1770;
				@Pc(1806) Class169 local1806;
				if (Static304.aClass6_92 == Static185.aClass6_59) {
					local494 = Static255.aClass1_Sub13_Sub2_2.method3034();
					local1770 = Static255.aClass1_Sub13_Sub2_2.method3043() == 1;
					if (local1770) {
						local258 = Static255.aClass1_Sub13_Sub2_2.method3034();
					} else {
						local258 = local494;
					}
					local224 = Static255.aClass1_Sub13_Sub2_2.method3056();
					@Pc(1787) byte local1787 = Static255.aClass1_Sub13_Sub2_2.method3073();
					local690 = false;
					if (local1787 == -128) {
						local690 = true;
					}
					if (local690) {
						if (Static308.anInt5922 == 0) {
							Static304.aClass6_92 = null;
							return true;
						}
						for (local709 = 0; local709 < Static308.anInt5922 && (!Static83.aClass169Array1[local709].aString41.equals(local258) || Static83.aClass169Array1[local709].anInt5123 != local224); local709++) {
						}
						if (local709 < Static308.anInt5922) {
							while (local709 < Static308.anInt5922 - 1) {
								Static83.aClass169Array1[local709] = Static83.aClass169Array1[local709 + 1];
								local709++;
							}
							Static308.anInt5922--;
							Static83.aClass169Array1[Static308.anInt5922] = null;
						}
					} else {
						local1802 = Static255.aClass1_Sub13_Sub2_2.method3034();
						local1806 = new Class169();
						local1806.aString41 = local258;
						local1806.aString39 = local494;
						local1806.aString40 = Static361.method5639(local1806.aString41);
						local1806.aString38 = local1802;
						local1806.aByte53 = local1787;
						local1806.anInt5123 = local224;
						for (local1324 = Static308.anInt5922 - 1; local1324 >= 0; local1324--) {
							local284 = Static83.aClass169Array1[local1324].aString40.compareTo(local1806.aString40);
							if (local284 == 0) {
								Static83.aClass169Array1[local1324].anInt5123 = local224;
								Static83.aClass169Array1[local1324].aByte53 = local1787;
								Static83.aClass169Array1[local1324].aString38 = local1802;
								if (local258.equals(Static16.aClass47_Sub2_Sub3_Sub2_1.aString36)) {
									Static87.aByte75 = local1787;
								}
								Static304.aClass6_92 = null;
								Static184.anInt3933 = Static418.anInt7279;
								return true;
							}
							if (local284 < 0) {
								break;
							}
						}
						if (Static83.aClass169Array1.length <= Static308.anInt5922) {
							Static304.aClass6_92 = null;
							return true;
						}
						for (local284 = Static308.anInt5922 - 1; local284 > local1324; local284--) {
							Static83.aClass169Array1[local284 + 1] = Static83.aClass169Array1[local284];
						}
						if (Static308.anInt5922 == 0) {
							Static83.aClass169Array1 = new Class169[100];
						}
						Static83.aClass169Array1[local1324 + 1] = local1806;
						Static308.anInt5922++;
						if (local258.equals(Static16.aClass47_Sub2_Sub3_Sub2_1.aString36)) {
							Static87.aByte75 = local1787;
						}
					}
					Static184.anInt3933 = Static418.anInt7279;
					Static304.aClass6_92 = null;
					return true;
				} else if (Static73.aClass6_25 == Static304.aClass6_92) {
					local212 = Static255.aClass1_Sub13_Sub2_2.method3026();
					local71 = Static255.aClass1_Sub13_Sub2_2.method3056();
					if (local71 == 65535) {
						local71 = -1;
					}
					local220 = Static255.aClass1_Sub13_Sub2_2.method3056();
					local224 = Static255.aClass1_Sub13_Sub2_2.method3053();
					if (local224 == 65535) {
						local224 = -1;
					}
					local228 = Static255.aClass1_Sub13_Sub2_2.method3053();
					if (Static383.method7638(local228)) {
						for (local452 = local224; local452 <= local71; local452++) {
							local1452 = (long) local452 + ((long) local212 << 32);
							local1458 = (Class1_Sub51) Static494.aClass174_36.method4422(local1452);
							if (local1458 != null) {
								local1469 = new Class1_Sub51(local1458.anInt9474, local220);
								local1458.method7983();
							} else if (local452 == -1) {
								local1469 = new Class1_Sub51(Static80.method2005(local212).aClass1_Sub51_2.anInt9474, local220);
							} else {
								local1469 = new Class1_Sub51(0, local220);
							}
							Static494.aClass174_36.method4420(local1469, local1452);
						}
					}
					Static304.aClass6_92 = null;
					return true;
				} else if (Static304.aClass6_92 == Static87.aClass6_101) {
					Static307.method5102(Static365.aClass33_24);
					Static304.aClass6_92 = null;
					return true;
				} else if (Static304.aClass6_92 == Static335.aClass6_102) {
					Static35.anInt1297 = Static255.aClass1_Sub13_Sub2_2.method3043();
					for (local212 = 0; local212 < Static35.anInt1297; local212++) {
						Static159.aStringArray13[local212] = Static255.aClass1_Sub13_Sub2_2.method3034();
						Static401.aStringArray38[local212] = Static255.aClass1_Sub13_Sub2_2.method3034();
						if (Static401.aStringArray38[local212].equals("")) {
							Static401.aStringArray38[local212] = Static159.aStringArray13[local212];
						}
						Static529.aStringArray47[local212] = Static255.aClass1_Sub13_Sub2_2.method3034();
						Static472.aStringArray44[local212] = Static255.aClass1_Sub13_Sub2_2.method3034();
						if (Static472.aStringArray44[local212].equals("")) {
							Static472.aStringArray44[local212] = Static529.aStringArray47[local212];
						}
						Static449.aBooleanArray30[local212] = false;
					}
					Static340.anInt6357 = Static418.anInt7279;
					Static304.aClass6_92 = null;
					return true;
				} else if (Static304.aClass6_92 == Static373.aClass6_115) {
					local212 = Static255.aClass1_Sub13_Sub2_2.method3056();
					local71 = Static255.aClass1_Sub13_Sub2_2.method3043();
					local1770 = (local71 & 0x1) == 1;
					while (Static255.aClass1_Sub13_Sub2_2.anInt3400 < Static45.anInt1403) {
						local224 = Static255.aClass1_Sub13_Sub2_2.method3066();
						local228 = Static255.aClass1_Sub13_Sub2_2.method3056();
						local452 = 0;
						if (local228 != 0) {
							local452 = Static255.aClass1_Sub13_Sub2_2.method3043();
							if (local452 == 255) {
								local452 = Static255.aClass1_Sub13_Sub2_2.method3037();
							}
						}
						Static538.method7876(local452, local1770, local212, local224, local228 - 1);
					}
					Static350.anIntArray480[Static365.anInt8921++ & 0x1F] = local212;
					Static304.aClass6_92 = null;
					return true;
				} else if (Static304.aClass6_92 == Static2.aClass6_83) {
					Static140.method2961(Static152.aBoolean209);
					Static304.aClass6_92 = null;
					return false;
				} else if (Static304.aClass6_92 == Static494.aClass6_132) {
					for (local212 = 0; local212 < Static473.aClass47_Sub2_Sub3_Sub2Array1.length; local212++) {
						if (Static473.aClass47_Sub2_Sub3_Sub2Array1[local212] != null) {
							Static473.aClass47_Sub2_Sub3_Sub2Array1[local212].anInt5018 = -1;
						}
					}
					for (local71 = 0; local71 < Static198.anInt4112; local71++) {
						Static395.aClass1_Sub10Array1[local71].aClass47_Sub2_Sub3_Sub1_2.anInt5018 = -1;
					}
					Static304.aClass6_92 = null;
					return true;
				} else if (Static304.aClass6_92 == Static346.aClass6_107) {
					Static307.method5102(Static402.aClass33_25);
					Static304.aClass6_92 = null;
					return true;
				} else {
					@Pc(2335) String local2335;
					@Pc(2366) String local2366;
					@Pc(2337) String local2337;
					if (Static304.aClass6_92 == Static219.aClass6_67) {
						local212 = Static255.aClass1_Sub13_Sub2_2.method3066();
						local71 = Static255.aClass1_Sub13_Sub2_2.method3037();
						local220 = Static255.aClass1_Sub13_Sub2_2.method3043();
						local2335 = "";
						local2337 = local2335;
						if ((local220 & 0x1) != 0) {
							local2335 = Static255.aClass1_Sub13_Sub2_2.method3034();
							if ((local220 & 0x2) == 0) {
								local2337 = local2335;
							} else {
								local2337 = Static255.aClass1_Sub13_Sub2_2.method3034();
							}
						}
						local2366 = Static255.aClass1_Sub13_Sub2_2.method3034();
						if (local212 == 99) {
							Static327.method5346(local2366);
						} else if (local2337.equals("") || !Static32.method1279(local2337)) {
							Static310.method5136(local2335, local2337, local212, local71, local2366);
						} else {
							Static304.aClass6_92 = null;
							return true;
						}
						Static304.aClass6_92 = null;
						return true;
					} else if (Static304.aClass6_92 == Static357.aClass6_111) {
						local212 = Static255.aClass1_Sub13_Sub2_2.method3027();
						local71 = Static255.aClass1_Sub13_Sub2_2.method3027();
						local220 = Static255.aClass1_Sub13_Sub2_2.method3037();
						if (Static383.method7638(local212)) {
							Static112.method2464(local71, local220);
						}
						Static304.aClass6_92 = null;
						return true;
					} else if (Static304.aClass6_92 == Static38.aClass6_17) {
						local212 = Static255.aClass1_Sub13_Sub2_2.method3043();
						local71 = Static255.aClass1_Sub13_Sub2_2.method3043();
						local220 = Static255.aClass1_Sub13_Sub2_2.method3026();
						Static187.anIntArray303[local212] = local220;
						Static361.anIntArray488[local212] = local71;
						Static507.anIntArray734[local212] = 1;
						local224 = Static416.anIntArray571[local212] - 1;
						for (local228 = 0; local228 < local224; local228++) {
							if (Class203.anIntArray422[local228] <= local220) {
								Static507.anIntArray734[local212] = local228 + 2;
							}
						}
						Static161.anIntArray281[Static499.anInt8464++ & 0x1F] = local212;
						Static304.aClass6_92 = null;
						return true;
					} else {
						@Pc(2666) boolean local2666;
						if (Static150.aClass6_52 == Static304.aClass6_92) {
							Static184.anInt3933 = Static418.anInt7279;
							if (Static45.anInt1403 == 0) {
								Static190.aString25 = null;
								Static152.aString24 = null;
								Static304.aClass6_92 = null;
								Static83.aClass169Array1 = null;
								Static308.anInt5922 = 0;
								return true;
							}
							Static152.aString24 = Static255.aClass1_Sub13_Sub2_2.method3034();
							local254 = Static255.aClass1_Sub13_Sub2_2.method3043() == 1;
							if (local254) {
								Static255.aClass1_Sub13_Sub2_2.method3034();
							}
							@Pc(2542) long local2542 = Static255.aClass1_Sub13_Sub2_2.method3015();
							Static190.aString25 = Static433.method6988(local2542);
							Static351.aByte76 = Static255.aClass1_Sub13_Sub2_2.method3073();
							local224 = Static255.aClass1_Sub13_Sub2_2.method3043();
							if (local224 == 255) {
								Static304.aClass6_92 = null;
								return true;
							}
							Static308.anInt5922 = local224;
							@Pc(2566) Class169[] local2566 = new Class169[100];
							for (local452 = 0; local452 < Static308.anInt5922; local452++) {
								local2566[local452] = new Class169();
								local2566[local452].aString39 = Static255.aClass1_Sub13_Sub2_2.method3034();
								local254 = Static255.aClass1_Sub13_Sub2_2.method3043() == 1;
								if (local254) {
									local2566[local452].aString41 = Static255.aClass1_Sub13_Sub2_2.method3034();
								} else {
									local2566[local452].aString41 = local2566[local452].aString39;
								}
								local2566[local452].aString40 = Static361.method5639(local2566[local452].aString41);
								local2566[local452].anInt5123 = Static255.aClass1_Sub13_Sub2_2.method3056();
								local2566[local452].aByte53 = Static255.aClass1_Sub13_Sub2_2.method3073();
								local2566[local452].aString38 = Static255.aClass1_Sub13_Sub2_2.method3034();
								if (local2566[local452].aString41.equals(Static16.aClass47_Sub2_Sub3_Sub2_1.aString36)) {
									Static87.aByte75 = local2566[local452].aByte53;
								}
							}
							local1324 = Static308.anInt5922;
							while (local1324 > 0) {
								local2666 = true;
								local1324--;
								for (local284 = 0; local284 < local1324; local284++) {
									if (local2566[local284].aString40.compareTo(local2566[local284 + 1].aString40) > 0) {
										local1806 = local2566[local284];
										local2566[local284] = local2566[local284 + 1];
										local2666 = false;
										local2566[local284 + 1] = local1806;
									}
								}
								if (local2666) {
									break;
								}
							}
							Static304.aClass6_92 = null;
							Static83.aClass169Array1 = local2566;
							return true;
						} else if (Static96.aClass6_32 == Static304.aClass6_92) {
							local212 = Static255.aClass1_Sub13_Sub2_2.method3058();
							local71 = Static255.aClass1_Sub13_Sub2_2.method3037();
							local220 = Static255.aClass1_Sub13_Sub2_2.method3053();
							local224 = Static255.aClass1_Sub13_Sub2_2.method3022();
							if (Static383.method7638(local220)) {
								Static69.method7889(local212, local224, local71);
							}
							Static304.aClass6_92 = null;
							return true;
						} else if (Static507.aClass6_137 == Static304.aClass6_92) {
							local212 = Static255.aClass1_Sub13_Sub2_2.method3029();
							local71 = Static255.aClass1_Sub13_Sub2_2.method3027();
							local260 = Static255.aClass1_Sub13_Sub2_2.method3034();
							if (Static383.method7638(local71)) {
								Static449.method6461(local212, local260);
							}
							Static304.aClass6_92 = null;
							return true;
						} else if (Static304.aClass6_92 == Static40.aClass6_18) {
							local254 = Static255.aClass1_Sub13_Sub2_2.method3043() == 1;
							@Pc(2800) byte[] local2800 = new byte[Static45.anInt1403 - 1];
							Static255.aClass1_Sub13_Sub2_2.method3071(local2800, Static45.anInt1403 - 1);
							Static243.method4102(local2800, local254);
							Static304.aClass6_92 = null;
							return true;
						} else if (Static304.aClass6_92 == Static126.aClass6_44) {
							local212 = Static255.aClass1_Sub13_Sub2_2.method3035();
							local71 = Static255.aClass1_Sub13_Sub2_2.method3072();
							Static343.aClass286_1.method6994(local71, local212);
							Static304.aClass6_92 = null;
							return true;
						} else if (Static307.aClass6_93 == Static304.aClass6_92) {
							local212 = Static255.aClass1_Sub13_Sub2_2.method3056();
							local71 = Static255.aClass1_Sub13_Sub2_2.method3049();
							local220 = Static255.aClass1_Sub13_Sub2_2.method3035();
							if (Static383.method7638(local212)) {
								Static309.method5131(local71, local220);
							}
							Static304.aClass6_92 = null;
							return true;
						} else if (Static304.aClass6_92 == Static317.aClass6_95) {
							local212 = Static255.aClass1_Sub13_Sub2_2.method3053();
							local71 = Static255.aClass1_Sub13_Sub2_2.method3027();
							local220 = Static255.aClass1_Sub13_Sub2_2.method3035();
							if (Static383.method7638(local220)) {
								Static170.method3312(local71, local212);
							}
							Static304.aClass6_92 = null;
							return true;
						} else if (Static132.aClass6_46 == Static304.aClass6_92) {
							Static147.method2994(Static255.aClass1_Sub13_Sub2_2.method3034());
							Static304.aClass6_92 = null;
							return true;
						} else if (Static304.aClass6_92 == Static324.aClass6_97) {
							local212 = Static255.aClass1_Sub13_Sub2_2.method3043();
							if (Static255.aClass1_Sub13_Sub2_2.method3043() == 0) {
								Static317.aClass306Array1[local212] = new Class306();
							} else {
								Static255.aClass1_Sub13_Sub2_2.anInt3400--;
								Static317.aClass306Array1[local212] = new Class306(Static255.aClass1_Sub13_Sub2_2);
							}
							Static304.aClass6_92 = null;
							Static296.anInt5734 = Static418.anInt7279;
							return true;
						} else if (Static304.aClass6_92 == Static379.aClass6_116) {
							local212 = Static255.aClass1_Sub13_Sub2_2.method3027();
							local71 = Static255.aClass1_Sub13_Sub2_2.method3017();
							local220 = Static255.aClass1_Sub13_Sub2_2.method3049();
							if (Static383.method7638(local212)) {
								Static65.method7164(local220, local71);
							}
							Static304.aClass6_92 = null;
							return true;
						} else if (Static304.aClass6_92 == Static354.aClass6_110) {
							local212 = Static255.aClass1_Sub13_Sub2_2.method3043();
							@Pc(2988) boolean local2988 = (local212 & 0x1) == 1;
							local260 = Static255.aClass1_Sub13_Sub2_2.method3034();
							local2335 = Static255.aClass1_Sub13_Sub2_2.method3034();
							if (local2335.equals("")) {
								local2335 = local260;
							}
							local2337 = Static255.aClass1_Sub13_Sub2_2.method3034();
							local2366 = Static255.aClass1_Sub13_Sub2_2.method3034();
							if (local2366.equals("")) {
								local2366 = local2337;
							}
							if (local2988) {
								for (local709 = 0; local709 < Static35.anInt1297; local709++) {
									if (Static401.aStringArray38[local709].equals(local2366)) {
										Static159.aStringArray13[local709] = local260;
										Static401.aStringArray38[local709] = local2335;
										Static529.aStringArray47[local709] = local2337;
										Static472.aStringArray44[local709] = local2366;
										break;
									}
								}
							} else {
								Static159.aStringArray13[Static35.anInt1297] = local260;
								Static401.aStringArray38[Static35.anInt1297] = local2335;
								Static529.aStringArray47[Static35.anInt1297] = local2337;
								Static472.aStringArray44[Static35.anInt1297] = local2366;
								Static449.aBooleanArray30[Static35.anInt1297] = (local212 & 0x2) == 2;
								Static35.anInt1297++;
							}
							Static304.aClass6_92 = null;
							Static340.anInt6357 = Static418.anInt7279;
							return true;
						} else if (Static500.aClass6_134 == Static304.aClass6_92) {
							Static274.method4673(Static45.anInt1403, Static91.aClass182_2, Static255.aClass1_Sub13_Sub2_2);
							Static304.aClass6_92 = null;
							return true;
						} else if (Static446.aClass6_123 == Static304.aClass6_92) {
							@Pc(3107) byte local3107 = Static255.aClass1_Sub13_Sub2_2.method3044();
							local71 = Static255.aClass1_Sub13_Sub2_2.method3027();
							Static343.aClass286_1.method6993(local71, local3107);
							Static304.aClass6_92 = null;
							return true;
						} else if (Static493.aClass6_131 == Static304.aClass6_92) {
							local212 = Static255.aClass1_Sub13_Sub2_2.method3053();
							local71 = Static255.aClass1_Sub13_Sub2_2.method3026();
							if (Static383.method7638(local212)) {
								Static106.method2294(3, -1, -1, local71);
							}
							Static304.aClass6_92 = null;
							return true;
						} else if (Static304.aClass6_92 == Static8.aClass6_4) {
							local212 = Static255.aClass1_Sub13_Sub2_2.method3026();
							local71 = Static255.aClass1_Sub13_Sub2_2.method3037();
							local220 = Static255.aClass1_Sub13_Sub2_2.method3053();
							local224 = Static255.aClass1_Sub13_Sub2_2.method3035();
							if (local224 == 65535) {
								local224 = -1;
							}
							if (Static383.method7638(local220)) {
								Static340.method5510(local212, local71, local224);
								@Pc(3185) Class192 local3185 = Static454.aClass153_2.method4007(local224);
								Static112.method2462(local3185.anInt5766, local3185.anInt5818, local3185.anInt5805, local71);
								Static189.method3549(local3185.anInt5772, local71, local3185.anInt5819, local3185.anInt5816);
							}
							Static304.aClass6_92 = null;
							return true;
						} else if (Static202.aClass6_98 == Static304.aClass6_92) {
							local212 = Static255.aClass1_Sub13_Sub2_2.method3056();
							if (Static383.method7638(local212)) {
								Static166.method3272();
							}
							Static304.aClass6_92 = null;
							return true;
						} else if (Static143.aClass6_49 == Static304.aClass6_92) {
							local254 = Static255.aClass1_Sub13_Sub2_2.method3043() == 1;
							local258 = Static255.aClass1_Sub13_Sub2_2.method3034();
							local260 = local258;
							if (local254) {
								local260 = Static255.aClass1_Sub13_Sub2_2.method3034();
							}
							local270 = Static255.aClass1_Sub13_Sub2_2.method3056();
							local275 = Static255.aClass1_Sub13_Sub2_2.method3039();
							local1317 = Static255.aClass1_Sub13_Sub2_2.method3043();
							local1324 = Static255.aClass1_Sub13_Sub2_2.method3056();
							@Pc(3274) long local3274 = (local270 << 32) + local275;
							@Pc(3276) boolean local3276 = false;
							local778 = 0;
							while (true) {
								if (local778 >= 100) {
									if (local1317 <= 1 && Static32.method1279(local260)) {
										local3276 = true;
									}
									break;
								}
								if (local3274 == Static426.aLongArray13[local778]) {
									local3276 = true;
									break;
								}
								local778++;
							}
							if (!local3276 && Static423.anInt8969 == 0) {
								Static426.aLongArray13[Static103.anInt2464] = local3274;
								Static103.anInt2464 = (Static103.anInt2464 + 1) % 100;
								@Pc(3323) String local3323 = Static111.aClass109_1.method3268(local1324).method5816(Static255.aClass1_Sub13_Sub2_2);
								if (local1317 == 2) {
									Static49.method1492("<img=1>" + local260, null, local3323, "<img=1>" + local258, 0, 18, local1324);
								} else if (local1317 == 1) {
									Static49.method1492("<img=0>" + local260, null, local3323, "<img=0>" + local258, 0, 18, local1324);
								} else {
									Static49.method1492(local260, null, local3323, local258, 0, 18, local1324);
								}
							}
							Static304.aClass6_92 = null;
							return true;
						} else if (Static304.aClass6_92 == Static425.aClass6_121) {
							Static185.anInt3937 = Static255.aClass1_Sub13_Sub2_2.method3043();
							Static501.anInt8506 = Static255.aClass1_Sub13_Sub2_2.method3063() << 3;
							Static280.anInt5513 = Static255.aClass1_Sub13_Sub2_2.method3073() << 3;
							Static304.aClass6_92 = null;
							return true;
						} else if (Static447.aClass6_124 == Static304.aClass6_92) {
							Static302.method5055();
							Static304.aClass6_92 = null;
							return true;
						} else if (Static262.aClass6_80 == Static304.aClass6_92) {
							Static222.anInt4501 = Static255.aClass1_Sub13_Sub2_2.method3043();
							Static304.aClass6_92 = null;
							return true;
						} else if (Static47.aClass6_19 == Static304.aClass6_92) {
							Static307.method5102(Static430.aClass33_19);
							Static304.aClass6_92 = null;
							return true;
						} else if (Static440.aClass6_39 == Static304.aClass6_92) {
							Static280.anInt5513 = Static255.aClass1_Sub13_Sub2_2.method3044() << 3;
							Static185.anInt3937 = Static255.aClass1_Sub13_Sub2_2.method3043();
							Static501.anInt8506 = Static255.aClass1_Sub13_Sub2_2.method3079() << 3;
							for (@Pc(3465) Class1_Sub11 local3465 = (Class1_Sub11) Static528.aClass174_40.method4421(); local3465 != null; local3465 = (Class1_Sub11) Static528.aClass174_40.method4429()) {
								local71 = (int) (local3465.aLong244 >> 28 & 0x3L);
								local220 = (int) (local3465.aLong244 & 0x3FFFL);
								local224 = local220 - Static324.anInt6132;
								local228 = (int) (local3465.aLong244 >> 14 & 0x3FFFL);
								local452 = local228 - Static517.anInt8716;
								if (Static185.anInt3937 == local71 && Static501.anInt8506 <= local224 && local224 < Static501.anInt8506 + 8 && local452 >= Static280.anInt5513 && Static280.anInt5513 + 8 > local452) {
									local3465.method7983();
									if (local224 >= 0 && local452 >= 0 && Static542.anInt9387 > local224 && local452 < Static36.anInt1324) {
										Static218.method3888(Static185.anInt3937, local224, local452);
									}
								}
							}
							for (@Pc(3568) Class1_Sub37 local3568 = (Class1_Sub37) Static500.aClass38_71.method1419(); local3568 != null; local3568 = (Class1_Sub37) Static500.aClass38_71.method1415()) {
								if (local3568.anInt6624 >= Static501.anInt8506 && local3568.anInt6624 < Static501.anInt8506 + 8 && Static280.anInt5513 <= local3568.anInt6615 && Static280.anInt5513 + 8 > local3568.anInt6615 && Static185.anInt3937 == local3568.anInt6619) {
									local3568.anInt6620 = 0;
								}
							}
							Static304.aClass6_92 = null;
							return true;
						} else if (Static304.aClass6_92 == Static80.aClass6_27) {
							local212 = Static255.aClass1_Sub13_Sub2_2.method3057();
							local71 = Static255.aClass1_Sub13_Sub2_2.method3053();
							if (Static383.method7638(local71)) {
								Static124.anInt5008 = local212;
							}
							Static304.aClass6_92 = null;
							return true;
						} else if (Static304.aClass6_92 == Static394.aClass6_118) {
							while (Static45.anInt1403 > Static255.aClass1_Sub13_Sub2_2.anInt3400) {
								local254 = Static255.aClass1_Sub13_Sub2_2.method3043() == 1;
								local258 = Static255.aClass1_Sub13_Sub2_2.method3034();
								local260 = Static255.aClass1_Sub13_Sub2_2.method3034();
								local224 = Static255.aClass1_Sub13_Sub2_2.method3056();
								local228 = Static255.aClass1_Sub13_Sub2_2.method3043();
								local2366 = "";
								local2666 = false;
								if (local224 > 0) {
									local2366 = Static255.aClass1_Sub13_Sub2_2.method3034();
									local2666 = Static255.aClass1_Sub13_Sub2_2.method3043() == 1;
								}
								for (local1317 = 0; local1317 < Static108.anInt2509; local1317++) {
									if (local254) {
										if (local260.equals(Static366.aStringArray40[local1317])) {
											Static366.aStringArray40[local1317] = local258;
											Static417.aStringArray28[local1317] = local260;
											local258 = null;
											break;
										}
									} else if (local258.equals(Static366.aStringArray40[local1317])) {
										if (local224 != Static210.anIntArray326[local1317]) {
											local734 = true;
											for (@Pc(3716) Class2_Sub4_Sub2 local3716 = (Class2_Sub4_Sub2) Static201.aClass145_4.method3919(); local3716 != null; local3716 = (Class2_Sub4_Sub2) Static201.aClass145_4.method3926()) {
												if (local3716.aString60.equals(local258)) {
													if (local224 != 0 && local3716.aShort98 == 0) {
														local734 = false;
														local3716.method7890();
													} else if (local224 == 0 && local3716.aShort98 != 0) {
														local734 = false;
														local3716.method7890();
													}
												}
											}
											if (local734) {
												Static201.aClass145_4.method3927(new Class2_Sub4_Sub2(local258, local224));
											}
											Static210.anIntArray326[local1317] = local224;
										}
										Static417.aStringArray28[local1317] = local260;
										Static19.aStringArray1[local1317] = local2366;
										Static226.anIntArray333[local1317] = local228;
										Static372.aBooleanArray24[local1317] = local2666;
										local258 = null;
										break;
									}
								}
								if (local258 != null && Static108.anInt2509 < 200) {
									Static366.aStringArray40[Static108.anInt2509] = local258;
									Static417.aStringArray28[Static108.anInt2509] = local260;
									Static210.anIntArray326[Static108.anInt2509] = local224;
									Static19.aStringArray1[Static108.anInt2509] = local2366;
									Static226.anIntArray333[Static108.anInt2509] = local228;
									Static372.aBooleanArray24[Static108.anInt2509] = local2666;
									Static108.anInt2509++;
								}
							}
							Static340.anInt6357 = Static418.anInt7279;
							Static360.anInt9307 = 2;
							local71 = Static108.anInt2509;
							while (local71 > 0) {
								local254 = true;
								local71--;
								for (local220 = 0; local220 < local71; local220++) {
									if (Static210.anIntArray326[local220] != Static153.aClass130_5.anInt4072 && Static153.aClass130_5.anInt4072 == Static210.anIntArray326[local220 + 1] || Static210.anIntArray326[local220] == 0 && Static210.anIntArray326[local220 + 1] != 0) {
										local224 = Static210.anIntArray326[local220];
										Static210.anIntArray326[local220] = Static210.anIntArray326[local220 + 1];
										Static210.anIntArray326[local220 + 1] = local224;
										local2337 = Static19.aStringArray1[local220];
										Static19.aStringArray1[local220] = Static19.aStringArray1[local220 + 1];
										Static19.aStringArray1[local220 + 1] = local2337;
										local2366 = Static366.aStringArray40[local220];
										Static366.aStringArray40[local220] = Static366.aStringArray40[local220 + 1];
										Static366.aStringArray40[local220 + 1] = local2366;
										local1802 = Static417.aStringArray28[local220];
										Static417.aStringArray28[local220] = Static417.aStringArray28[local220 + 1];
										Static417.aStringArray28[local220 + 1] = local1802;
										local1317 = Static226.anIntArray333[local220];
										Static226.anIntArray333[local220] = Static226.anIntArray333[local220 + 1];
										Static226.anIntArray333[local220 + 1] = local1317;
										local734 = Static372.aBooleanArray24[local220];
										Static372.aBooleanArray24[local220] = Static372.aBooleanArray24[local220 + 1];
										local254 = false;
										Static372.aBooleanArray24[local220 + 1] = local734;
									}
								}
								if (local254) {
									break;
								}
							}
							Static304.aClass6_92 = null;
							return true;
						} else if (Static304.aClass6_92 == Static169.aClass6_55) {
							Static307.method5102(Static424.aClass33_18);
							Static304.aClass6_92 = null;
							return true;
						} else if (Static304.aClass6_92 == Static81.aClass6_28) {
							local212 = Static255.aClass1_Sub13_Sub2_2.method3035();
							if (local212 == 65535) {
								local212 = -1;
							}
							local71 = Static255.aClass1_Sub13_Sub2_2.method3043();
							local220 = local71 >> 2;
							local224 = local71 & 0x3;
							local228 = Static438.anIntArray201[local220];
							local452 = Static255.aClass1_Sub13_Sub2_2.method3049();
							local709 = local452 >> 28 & 0x3;
							local1317 = local452 >> 14 & 0x3FFF;
							local1324 = local452 & 0x3FFF;
							@Pc(4072) int local4072 = local1317 - Static324.anInt6132;
							@Pc(4076) int local4076 = local1324 - Static517.anInt8716;
							Static247.method4187(local212, local4076, local228, local709, local220, local224, local4072);
							Static304.aClass6_92 = null;
							return true;
						} else if (Static304.aClass6_92 == Static350.aClass6_109) {
							Static154.anInt3465 = Static255.aClass1_Sub13_Sub2_2.method3040();
							Static320.aBoolean413 = Static255.aClass1_Sub13_Sub2_2.method3043() == 1;
							Static304.aClass6_92 = null;
							return true;
						} else if (Static517.aClass6_138 == Static304.aClass6_92) {
							local212 = Static255.aClass1_Sub13_Sub2_2.method3056();
							if (local212 == 65535) {
								local212 = -1;
							}
							local71 = Static255.aClass1_Sub13_Sub2_2.method3043();
							local220 = Static255.aClass1_Sub13_Sub2_2.method3056();
							local224 = Static255.aClass1_Sub13_Sub2_2.method3043();
							Static470.method5653(local212, local224, local220, local71);
							Static304.aClass6_92 = null;
							return true;
						} else if (Static469.aClass6_127 == Static304.aClass6_92) {
							local212 = Static255.aClass1_Sub13_Sub2_2.method3056();
							local71 = Static255.aClass1_Sub13_Sub2_2.method3043();
							local220 = Static255.aClass1_Sub13_Sub2_2.method3043();
							local224 = Static255.aClass1_Sub13_Sub2_2.method3056() << 0;
							local228 = Static255.aClass1_Sub13_Sub2_2.method3043();
							local452 = Static255.aClass1_Sub13_Sub2_2.method3043();
							if (Static383.method7638(local212)) {
								Static75.method1963(local220, local71, local452, local224, local228);
							}
							Static304.aClass6_92 = null;
							return true;
						} else if (Static488.aClass6_130 == Static304.aClass6_92) {
							Static307.method5102(Static103.aClass33_7);
							Static304.aClass6_92 = null;
							return true;
						} else {
							@Pc(4230) Class1_Sub5 local4230;
							if (Static88.aClass6_30 == Static304.aClass6_92) {
								local212 = Static255.aClass1_Sub13_Sub2_2.method3026();
								local71 = Static255.aClass1_Sub13_Sub2_2.method3037();
								local220 = Static255.aClass1_Sub13_Sub2_2.method3035();
								if (Static383.method7638(local220)) {
									@Pc(4223) Class1_Sub5 local4223 = (Class1_Sub5) Static484.aClass174_32.method4422((long) local71);
									local4230 = (Class1_Sub5) Static484.aClass174_32.method4422((long) local212);
									if (local4230 != null) {
										Static82.method2049(false, local4230, local4223 == null || local4223.anInt1389 != local4230.anInt1389);
									}
									if (local4223 != null) {
										local4223.method7983();
										Static484.aClass174_32.method4420(local4223, (long) local212);
									}
									@Pc(4261) Class309 local4261 = Static80.method2005(local71);
									if (local4261 != null) {
										Static291.method4908(local4261);
									}
									local4261 = Static80.method2005(local212);
									if (local4261 != null) {
										Static291.method4908(local4261);
										Static341.method5527(local4261, true);
									}
									if (Static85.anInt2201 != -1) {
										Static16.method808(1, Static85.anInt2201);
									}
								}
								Static304.aClass6_92 = null;
								return true;
							} else if (Static304.aClass6_92 == Static182.aClass6_58) {
								Static531.anInt9007 = Static255.aClass1_Sub13_Sub2_2.method3058();
								Static136.anInt3211 = Static418.anInt7279;
								Static304.aClass6_92 = null;
								return true;
							} else if (Static304.aClass6_92 == Static170.aClass6_56) {
								Static304.aClass6_92 = null;
								return false;
							} else if (Static304.aClass6_92 == Static301.aClass6_90) {
								if (Static478.aFrame1 != null) {
									Static63.method1764(false, Static89.aClass1_Sub28_Sub1_1.anInt4904, -1, -1);
								}
								@Pc(4325) byte[] local4325 = new byte[Static45.anInt1403];
								Static255.aClass1_Sub13_Sub2_2.method3088(local4325, Static45.anInt1403);
								local258 = Static475.method6888(0, local4325, Static45.anInt1403);
								Static101.method2271(local258, Static91.aClass182_2, true, Static526.anInt8926 == 1);
								Static304.aClass6_92 = null;
								return true;
							} else if (Static291.aClass6_86 == Static304.aClass6_92) {
								local212 = Static255.aClass1_Sub13_Sub2_2.method3016();
								local71 = Static255.aClass1_Sub13_Sub2_2.method3056();
								local220 = Static255.aClass1_Sub13_Sub2_2.method3026();
								if (Static383.method7638(local71)) {
									Static258.method4323(local220, local212);
								}
								Static304.aClass6_92 = null;
								return true;
							} else if (Static2.aClass6_82 == Static304.aClass6_92) {
								Static255.aClass1_Sub13_Sub2_2.anInt3400 += 28;
								if (Static255.aClass1_Sub13_Sub2_2.method3025()) {
									Static377.method5728(Static255.aClass1_Sub13_Sub2_2.anInt3400 - 28, Static255.aClass1_Sub13_Sub2_2);
								}
								Static304.aClass6_92 = null;
								return true;
							} else if (Static222.aClass6_69 == Static304.aClass6_92) {
								local254 = Static255.aClass1_Sub13_Sub2_2.method3043() == 1;
								local258 = Static255.aClass1_Sub13_Sub2_2.method3034();
								local260 = local258;
								if (local254) {
									local260 = Static255.aClass1_Sub13_Sub2_2.method3034();
								}
								local224 = Static255.aClass1_Sub13_Sub2_2.method3043();
								@Pc(4437) boolean local4437 = false;
								if (local224 <= 1) {
									if (Static320.aBoolean413 && !Static258.aBoolean339 || Static231.aBoolean483) {
										local4437 = true;
									} else if (local224 <= 1 && Static32.method1279(local260)) {
										local4437 = true;
									}
								}
								if (!local4437 && Static423.anInt8969 == 0) {
									local2366 = Static236.method4026(Static398.method5999(Static255.aClass1_Sub13_Sub2_2));
									if (local224 == 2) {
										Static49.method1492("<img=1>" + local260, null, local2366, "<img=1>" + local258, 0, 24, -1);
									} else if (local224 == 1) {
										Static49.method1492("<img=0>" + local260, null, local2366, "<img=0>" + local258, 0, 24, -1);
									} else {
										Static49.method1492(local260, null, local2366, local258, 0, 24, -1);
									}
								}
								Static304.aClass6_92 = null;
								return true;
							} else if (Static345.aClass6_105 == Static304.aClass6_92) {
								Static318.anInt6036 = Static255.aClass1_Sub13_Sub2_2.method3043();
								Static136.anInt3211 = Static418.anInt7279;
								Static304.aClass6_92 = null;
								return true;
							} else if (Static304.aClass6_92 == Static29.aClass6_14) {
								if (Static124.method4352(Static51.anInt7926)) {
									Static228.anInt8958 = (int) ((float) Static255.aClass1_Sub13_Sub2_2.method3056() * 2.5F);
								} else {
									Static228.anInt8958 = Static255.aClass1_Sub13_Sub2_2.method3056() * 30;
								}
								Static304.aClass6_92 = null;
								Static136.anInt3211 = Static418.anInt7279;
								return true;
							} else if (Static304.aClass6_92 == Static12.aClass6_7) {
								local212 = Static255.aClass1_Sub13_Sub2_2.method3056();
								local71 = Static255.aClass1_Sub13_Sub2_2.method3037();
								if (Static383.method7638(local212)) {
									@Pc(4601) Class1_Sub5 local4601 = (Class1_Sub5) Static484.aClass174_32.method4422((long) local71);
									if (local4601 != null) {
										Static82.method2049(false, local4601, true);
									}
									if (Static531.aClass309_14 != null) {
										Static291.method4908(Static531.aClass309_14);
										Static531.aClass309_14 = null;
									}
								}
								Static304.aClass6_92 = null;
								return true;
							} else if (Static300.aClass6_88 == Static304.aClass6_92) {
								local212 = Static255.aClass1_Sub13_Sub2_2.method3056();
								local71 = Static255.aClass1_Sub13_Sub2_2.method3043();
								local1770 = (local71 & 0x1) == 1;
								Static481.method6973(local212, local1770);
								local224 = Static255.aClass1_Sub13_Sub2_2.method3056();
								for (local228 = 0; local228 < local224; local228++) {
									local452 = Static255.aClass1_Sub13_Sub2_2.method3016();
									if (local452 == 255) {
										local452 = Static255.aClass1_Sub13_Sub2_2.method3029();
									}
									local709 = Static255.aClass1_Sub13_Sub2_2.method3035();
									Static538.method7876(local452, local1770, local212, local228, local709 - 1);
								}
								Static350.anIntArray480[Static365.anInt8921++ & 0x1F] = local212;
								Static304.aClass6_92 = null;
								return true;
							} else if (Static347.aClass6_108 == Static304.aClass6_92) {
								local212 = Static255.aClass1_Sub13_Sub2_2.method3056();
								@Pc(4705) byte local4705 = Static255.aClass1_Sub13_Sub2_2.method3079();
								local220 = Static255.aClass1_Sub13_Sub2_2.method3056();
								if (Static383.method7638(local220)) {
									Static112.method2464(local212, local4705);
								}
								Static304.aClass6_92 = null;
								return true;
							} else if (Static304.aClass6_92 == Static61.aClass6_20) {
								local212 = Static255.aClass1_Sub13_Sub2_2.method3056();
								local71 = Static255.aClass1_Sub13_Sub2_2.method3035();
								local260 = Static255.aClass1_Sub13_Sub2_2.method3034();
								if (Static383.method7638(local71)) {
									Static505.method7293(local212, local260);
								}
								Static304.aClass6_92 = null;
								return true;
							} else if (Static518.aClass6_139 == Static304.aClass6_92) {
								Static140.method2961(false);
								Static304.aClass6_92 = null;
								return false;
							} else if (Static304.aClass6_92 == Static244.aClass6_74) {
								local212 = Static255.aClass1_Sub13_Sub2_2.method3057();
								local71 = Static255.aClass1_Sub13_Sub2_2.method3053();
								local220 = Static255.aClass1_Sub13_Sub2_2.method3053();
								if (Static383.method7638(local71)) {
									if (local212 == 2) {
										Static265.method4399();
									}
									Static85.anInt2201 = local220;
									Static68.method1869(local220);
									Static204.method3768(false);
									Static387.method5827(Static85.anInt2201);
									for (local224 = 0; local224 < 100; local224++) {
										Static145.aBooleanArray14[local224] = true;
									}
								}
								Static304.aClass6_92 = null;
								return true;
							} else if (Static304.aClass6_92 == Static32.aClass6_15) {
								local254 = Static255.aClass1_Sub13_Sub2_2.method3043() == 1;
								local258 = Static255.aClass1_Sub13_Sub2_2.method3034();
								local260 = local258;
								if (local254) {
									local260 = Static255.aClass1_Sub13_Sub2_2.method3034();
								}
								local224 = Static255.aClass1_Sub13_Sub2_2.method3043();
								local228 = Static255.aClass1_Sub13_Sub2_2.method3056();
								local690 = false;
								if (local224 <= 1 && Static32.method1279(local260)) {
									local690 = true;
								}
								if (!local690 && Static423.anInt8969 == 0) {
									local1802 = Static111.aClass109_1.method3268(local228).method5816(Static255.aClass1_Sub13_Sub2_2);
									if (local224 == 2) {
										Static49.method1492("<img=1>" + local260, null, local1802, "<img=1>" + local258, 0, 25, local228);
									} else if (local224 == 1) {
										Static49.method1492("<img=0>" + local260, null, local1802, "<img=0>" + local258, 0, 25, local228);
									} else {
										Static49.method1492(local260, null, local1802, local258, 0, 25, local228);
									}
								}
								Static304.aClass6_92 = null;
								return true;
							} else if (Static304.aClass6_92 == Static254.aClass6_77) {
								Static538.aString84 = Static45.anInt1403 > 2 ? Static255.aClass1_Sub13_Sub2_2.method3034() : Static398.aClass114_136.method3330(Static315.anInt5993);
								Static325.anInt6335 = Static45.anInt1403 > 0 ? Static255.aClass1_Sub13_Sub2_2.method3056() : -1;
								if (Static325.anInt6335 == 65535) {
									Static325.anInt6335 = -1;
								}
								Static304.aClass6_92 = null;
								return true;
							} else if (Static345.aClass6_106 == Static304.aClass6_92) {
								local212 = Static255.aClass1_Sub13_Sub2_2.method3056();
								local71 = Static255.aClass1_Sub13_Sub2_2.method3056();
								local220 = Static255.aClass1_Sub13_Sub2_2.method3056();
								local224 = Static255.aClass1_Sub13_Sub2_2.method3037();
								if (Static383.method7638(local220)) {
									Static181.method3473(local212 + (local71 << 16), local224);
								}
								Static304.aClass6_92 = null;
								return true;
							} else if (Static435.aClass6_122 == Static304.aClass6_92) {
								local212 = Static255.aClass1_Sub13_Sub2_2.method3027();
								local71 = Static255.aClass1_Sub13_Sub2_2.method3037();
								local220 = Static255.aClass1_Sub13_Sub2_2.method3056();
								if (Static383.method7638(local220)) {
									Static377.method5729(local212, local71);
								}
								Static304.aClass6_92 = null;
								return true;
							} else if (Static111.aClass6_43 == Static304.aClass6_92) {
								local212 = Static255.aClass1_Sub13_Sub2_2.method3049();
								local71 = Static255.aClass1_Sub13_Sub2_2.method3043();
								local220 = Static255.aClass1_Sub13_Sub2_2.method3056();
								local224 = Static255.aClass1_Sub13_Sub2_2.method3056();
								if (Static383.method7638(local220)) {
									local4230 = (Class1_Sub5) Static484.aClass174_32.method4422((long) local212);
									if (local4230 != null) {
										Static82.method2049(false, local4230, local4230.anInt1389 != local224);
									}
									Static250.method4234(local212, local71, local224, false);
								}
								Static304.aClass6_92 = null;
								return true;
							} else if (Static304.aClass6_92 == Static9.aClass6_5) {
								local212 = Static255.aClass1_Sub13_Sub2_2.method3043();
								local71 = local212 >> 5;
								local220 = local212 & 0x1F;
								if (local220 == 0) {
									Static484.aClass28Array1[local71] = null;
									Static304.aClass6_92 = null;
									return true;
								}
								@Pc(5124) Class28 local5124 = new Class28();
								local5124.anInt1262 = local220;
								local5124.anInt1264 = Static255.aClass1_Sub13_Sub2_2.method3043();
								if (local5124.anInt1264 >= 0 && Static81.aClass12Array8.length > local5124.anInt1264) {
									if (local5124.anInt1262 == 1 || local5124.anInt1262 == 10) {
										local5124.anInt1265 = Static255.aClass1_Sub13_Sub2_2.method3056();
										Static255.aClass1_Sub13_Sub2_2.anInt3400 += 6;
									} else if (local5124.anInt1262 >= 2 && local5124.anInt1262 <= 6) {
										if (local5124.anInt1262 == 2) {
											local5124.anInt1260 = 64;
											local5124.anInt1263 = 64;
										}
										if (local5124.anInt1262 == 3) {
											local5124.anInt1260 = 0;
											local5124.anInt1263 = 64;
										}
										if (local5124.anInt1262 == 4) {
											local5124.anInt1263 = 64;
											local5124.anInt1260 = 128;
										}
										if (local5124.anInt1262 == 5) {
											local5124.anInt1260 = 64;
											local5124.anInt1263 = 0;
										}
										if (local5124.anInt1262 == 6) {
											local5124.anInt1260 = 64;
											local5124.anInt1263 = 128;
										}
										local5124.anInt1262 = 2;
										local5124.anInt1268 = Static255.aClass1_Sub13_Sub2_2.method3043();
										local5124.anInt1260 += Static255.aClass1_Sub13_Sub2_2.method3056() - Static324.anInt6132 << 7;
										local5124.anInt1263 += Static255.aClass1_Sub13_Sub2_2.method3056() - Static517.anInt8716 << 7;
										local5124.anInt1258 = Static255.aClass1_Sub13_Sub2_2.method3043() << 0;
										local5124.anInt1259 = Static255.aClass1_Sub13_Sub2_2.method3056();
									}
									local5124.anInt1266 = Static255.aClass1_Sub13_Sub2_2.method3056();
									if (local5124.anInt1266 == 65535) {
										local5124.anInt1266 = -1;
									}
									Static484.aClass28Array1[local71] = local5124;
								}
								Static304.aClass6_92 = null;
								return true;
							} else if (Static304.aClass6_92 == Static358.aClass6_36) {
								local212 = Static255.aClass1_Sub13_Sub2_2.method3056();
								if (local212 == 65535) {
									local212 = -1;
								}
								local71 = Static255.aClass1_Sub13_Sub2_2.method3043();
								local220 = Static255.aClass1_Sub13_Sub2_2.method3056();
								local224 = Static255.aClass1_Sub13_Sub2_2.method3043();
								Static400.method6032(local71, local224, local212, local220);
								Static304.aClass6_92 = null;
								return true;
							} else if (Static304.aClass6_92 == Static501.aClass6_135) {
								local212 = Static255.aClass1_Sub13_Sub2_2.method3035();
								local71 = Static255.aClass1_Sub13_Sub2_2.method3053();
								local220 = Static255.aClass1_Sub13_Sub2_2.method3053();
								local224 = Static255.aClass1_Sub13_Sub2_2.method3053();
								local228 = Static255.aClass1_Sub13_Sub2_2.method3049();
								if (Static383.method7638(local71)) {
									Static106.method2294(7, local224 << 16 | local220, local212, local228);
								}
								Static304.aClass6_92 = null;
								return true;
							} else if (Static372.aClass6_114 == Static304.aClass6_92) {
								local212 = Static255.aClass1_Sub13_Sub2_2.method3056();
								local71 = Static255.aClass1_Sub13_Sub2_2.method3049();
								Static343.aClass286_1.method6994(local71, local212);
								Static304.aClass6_92 = null;
								return true;
							} else if (Static304.aClass6_92 == Static440.aClass6_40) {
								Static307.method5102(Static253.aClass33_22);
								Static304.aClass6_92 = null;
								return true;
							} else if (Static304.aClass6_92 == Static301.aClass6_91) {
								Static224.method3952(true);
								Static304.aClass6_92 = null;
								return true;
							} else if (Static293.aClass6_54 == Static304.aClass6_92) {
								Static307.method5102(Static110.aClass33_9);
								Static304.aClass6_92 = null;
								return true;
							} else if (Static304.aClass6_92 == Static328.aClass6_100) {
								if (Static85.anInt2201 != -1) {
									Static16.method808(0, Static85.anInt2201);
								}
								Static304.aClass6_92 = null;
								return true;
							} else if (Static304.aClass6_92 == Static343.aClass6_103) {
								Static307.method5102(Static460.aClass33_21);
								Static304.aClass6_92 = null;
								return true;
							} else if (Static254.aClass6_76 == Static304.aClass6_92) {
								local212 = Static255.aClass1_Sub13_Sub2_2.method3056();
								local258 = Static255.aClass1_Sub13_Sub2_2.method3034();
								@Pc(5460) Object[] local5460 = new Object[local258.length() + 1];
								for (local224 = local258.length() - 1; local224 >= 0; local224--) {
									if (local258.charAt(local224) == 's') {
										local5460[local224 + 1] = Static255.aClass1_Sub13_Sub2_2.method3034();
									} else {
										local5460[local224 + 1] = Integer.valueOf(Static255.aClass1_Sub13_Sub2_2.method3037());
									}
								}
								local5460[0] = Integer.valueOf(Static255.aClass1_Sub13_Sub2_2.method3037());
								if (Static383.method7638(local212)) {
									@Pc(5516) Class1_Sub40 local5516 = new Class1_Sub40();
									local5516.anObjectArray5 = local5460;
									Static387.method5838(local5516);
								}
								Static304.aClass6_92 = null;
								return true;
							} else if (Static221.aClass6_68 == Static304.aClass6_92) {
								Static307.method5102(Static114.aClass33_17);
								Static304.aClass6_92 = null;
								return true;
							} else if (Static212.aClass6_64 == Static304.aClass6_92) {
								Static125.method2767();
								Static304.aClass6_92 = null;
								return false;
							} else if (Static223.aClass6_70 == Static304.aClass6_92) {
								local212 = Static255.aClass1_Sub13_Sub2_2.method3027();
								local71 = Static255.aClass1_Sub13_Sub2_2.method3027();
								local220 = Static255.aClass1_Sub13_Sub2_2.method3072();
								@Pc(5566) Class1_Sub10 local5566 = (Class1_Sub10) Static258.aClass174_15.method4422((long) local212);
								if (local5566 != null) {
									Static137.method2919(local220, local71, local5566.aClass47_Sub2_Sub3_Sub1_2);
								}
								Static304.aClass6_92 = null;
								return true;
							} else if (Static304.aClass6_92 == Static364.aClass6_112) {
								local212 = Static255.aClass1_Sub13_Sub2_2.method3037();
								local71 = Static255.aClass1_Sub13_Sub2_2.method3027();
								local220 = Static255.aClass1_Sub13_Sub2_2.method3029();
								local224 = Static255.aClass1_Sub13_Sub2_2.method3056();
								if (Static383.method7638(local71)) {
									Static106.method2294(5, local224, local220, local212);
								}
								Static304.aClass6_92 = null;
								return true;
							} else if (Static35.aClass6_16 == Static304.aClass6_92) {
								local494 = Static255.aClass1_Sub13_Sub2_2.method3034();
								local258 = Static236.method4026(Static398.method5999(Static255.aClass1_Sub13_Sub2_2));
								Static310.method5136(local494, local494, 6, 0, local258);
								Static304.aClass6_92 = null;
								return true;
							} else if (Static304.aClass6_92 == Static76.aClass6_26) {
								local212 = Static255.aClass1_Sub13_Sub2_2.method3072();
								local71 = Static255.aClass1_Sub13_Sub2_2.method3043();
								local220 = Static255.aClass1_Sub13_Sub2_2.method3053();
								if (local220 == 65535) {
									local220 = -1;
								}
								local2335 = Static255.aClass1_Sub13_Sub2_2.method3034();
								if (local71 >= 1 && local71 <= 8) {
									if (local2335.equalsIgnoreCase("null")) {
										local2335 = null;
									}
									Static231.aStringArray43[local71 - 1] = local2335;
									Static510.anIntArray736[local71 - 1] = local220;
									Static156.aBooleanArray15[local71 - 1] = local212 == 0;
								}
								Static304.aClass6_92 = null;
								return true;
							} else if (Static304.aClass6_92 == Static12.aClass6_6) {
								Static307.method5102(Static75.aClass33_4);
								Static304.aClass6_92 = null;
								return true;
							} else if (Static246.aClass6_75 == Static304.aClass6_92) {
								Static307.method5102(Static103.aClass33_8);
								Static304.aClass6_92 = null;
								return true;
							} else if (Static304.aClass6_92 == Static101.aClass6_41) {
								local212 = Static255.aClass1_Sub13_Sub2_2.method3037();
								Static410.aClass243_7 = Static91.aClass182_2.method4819(local212);
								Static304.aClass6_92 = null;
								return true;
							} else if (Static217.aClass6_66 == Static304.aClass6_92) {
								local212 = Static255.aClass1_Sub13_Sub2_2.method3027();
								if (local212 == 65535) {
									local212 = -1;
								}
								local71 = Static255.aClass1_Sub13_Sub2_2.method3027();
								local220 = Static255.aClass1_Sub13_Sub2_2.method3037();
								if (Static383.method7638(local71)) {
									Static106.method2294(1, local212, -1, local220);
								}
								Static304.aClass6_92 = null;
								return true;
							} else if (Static304.aClass6_92 == Static328.aClass6_99) {
								local212 = Static255.aClass1_Sub13_Sub2_2.method3053();
								if (local212 == 65535) {
									local212 = -1;
								}
								local71 = Static255.aClass1_Sub13_Sub2_2.method3026();
								local220 = Static255.aClass1_Sub13_Sub2_2.method3027();
								if (Static383.method7638(local220)) {
									Static83.method2058(local71, local212);
								}
								Static304.aClass6_92 = null;
								return true;
							} else if (Static92.aClass6_31 == Static304.aClass6_92) {
								Static305.method5088(Static255.aClass1_Sub13_Sub2_2, Static45.anInt1403);
								Static304.aClass6_92 = null;
								return true;
							} else if (Static91.aClass6_10 == Static304.aClass6_92) {
								local212 = Static255.aClass1_Sub13_Sub2_2.method3057();
								local71 = Static255.aClass1_Sub13_Sub2_2.method3072();
								if (local212 == 255) {
									local212 = -1;
									local71 = -1;
								}
								Static163.method3246(local212, local71);
								Static304.aClass6_92 = null;
								return true;
							} else if (Static397.aClass6_119 == Static304.aClass6_92) {
								local494 = Static255.aClass1_Sub13_Sub2_2.method3034();
								local71 = Static255.aClass1_Sub13_Sub2_2.method3056();
								local220 = Static255.aClass1_Sub13_Sub2_2.method3027();
								if (Static383.method7638(local71)) {
									Static505.method7293(local220, local494);
								}
								Static304.aClass6_92 = null;
								return true;
							} else if (Static526.aClass6_140 == Static304.aClass6_92) {
								Static307.method5102(Static281.aClass33_14);
								Static304.aClass6_92 = null;
								return true;
							} else if (Static304.aClass6_92 == Static370.aClass6_73) {
								Static17.method814();
								Static304.aClass6_92 = null;
								return false;
							} else if (Static304.aClass6_92 == Static308.aClass6_94) {
								local212 = Static255.aClass1_Sub13_Sub2_2.method3053();
								local71 = Static255.aClass1_Sub13_Sub2_2.method3056();
								if (local71 == 65535) {
									local71 = -1;
								}
								local220 = Static255.aClass1_Sub13_Sub2_2.method3037();
								if (Static383.method7638(local212)) {
									Static106.method2294(2, local71, -1, local220);
								}
								Static304.aClass6_92 = null;
								return true;
							} else if (Static320.aClass6_96 == Static304.aClass6_92) {
								local212 = Static255.aClass1_Sub13_Sub2_2.method3037();
								local71 = Static255.aClass1_Sub13_Sub2_2.method3053();
								if (Static383.method7638(local71)) {
									Static106.method2294(5, Static150.anInt3353, 0, local212);
								}
								Static304.aClass6_92 = null;
								return true;
							} else if (Static304.aClass6_92 == Static2.aClass6_84) {
								local212 = Static255.aClass1_Sub13_Sub2_2.method3027();
								local71 = Static255.aClass1_Sub13_Sub2_2.method3037();
								Static343.aClass286_1.method6993(local212, local71);
								Static304.aClass6_92 = null;
								return true;
							} else if (Static146.aClass6_51 == Static304.aClass6_92) {
								local212 = Static255.aClass1_Sub13_Sub2_2.method3056();
								local71 = Static255.aClass1_Sub13_Sub2_2.method3043();
								local220 = Static255.aClass1_Sub13_Sub2_2.method3043();
								local224 = Static255.aClass1_Sub13_Sub2_2.method3043();
								local228 = Static255.aClass1_Sub13_Sub2_2.method3043();
								local452 = Static255.aClass1_Sub13_Sub2_2.method3056();
								if (Static383.method7638(local212)) {
									Static385.aBooleanArray27[local71] = true;
									Static294.anIntArray404[local71] = local220;
									Static282.anIntArray398[local71] = local224;
									Static178.anIntArray292[local71] = local228;
									Static480.anIntArray637[local71] = local452;
								}
								Static304.aClass6_92 = null;
								return true;
							} else if (Static178.aClass6_57 == Static304.aClass6_92) {
								local212 = Static255.aClass1_Sub13_Sub2_2.method3035();
								local71 = Static255.aClass1_Sub13_Sub2_2.method3043();
								local1770 = (local71 & 0x1) == 1;
								Static235.method4024(local212, local1770);
								Static350.anIntArray480[Static365.anInt8921++ & 0x1F] = local212;
								Static304.aClass6_92 = null;
								return true;
							} else if (Static304.aClass6_92 == Static403.aClass6_136) {
								Static224.method3952(false);
								Static304.aClass6_92 = null;
								return true;
							} else if (Static304.aClass6_92 == Static301.aClass6_89) {
								local212 = Static255.aClass1_Sub13_Sub2_2.method3056();
								local71 = Static255.aClass1_Sub13_Sub2_2.method3043();
								local220 = Static255.aClass1_Sub13_Sub2_2.method3043();
								local224 = Static255.aClass1_Sub13_Sub2_2.method3056() << 0;
								local228 = Static255.aClass1_Sub13_Sub2_2.method3043();
								local452 = Static255.aClass1_Sub13_Sub2_2.method3043();
								if (Static383.method7638(local212)) {
									Static313.method5164(local71, local220, local228, local452, local224, true);
								}
								Static304.aClass6_92 = null;
								return true;
							} else if (Static304.aClass6_92 == Static225.aClass6_71) {
								local254 = Static255.aClass1_Sub13_Sub2_2.method3043() == 1;
								local258 = Static255.aClass1_Sub13_Sub2_2.method3034();
								local260 = local258;
								if (local254) {
									local260 = Static255.aClass1_Sub13_Sub2_2.method3034();
								}
								local270 = Static255.aClass1_Sub13_Sub2_2.method3015();
								local275 = Static255.aClass1_Sub13_Sub2_2.method3056();
								local280 = Static255.aClass1_Sub13_Sub2_2.method3039();
								local284 = Static255.aClass1_Sub13_Sub2_2.method3043();
								@Pc(6170) long local6170 = local280 + (local275 << 32);
								@Pc(6172) boolean local6172 = false;
								local1125 = 0;
								while (true) {
									if (local1125 >= 100) {
										if (local284 <= 1) {
											if (Static320.aBoolean413 && !Static258.aBoolean339 || Static231.aBoolean483) {
												local6172 = true;
											} else if (Static32.method1279(local260)) {
												local6172 = true;
											}
										}
										break;
									}
									if (Static426.aLongArray13[local1125] == local6170) {
										local6172 = true;
										break;
									}
									local1125++;
								}
								if (!local6172 && Static423.anInt8969 == 0) {
									Static426.aLongArray13[Static103.anInt2464] = local6170;
									Static103.anInt2464 = (Static103.anInt2464 + 1) % 100;
									@Pc(6229) String local6229 = Static236.method4026(Static398.method5999(Static255.aClass1_Sub13_Sub2_2));
									if (local284 == 2 || local284 == 3) {
										Static49.method1492("<img=1>" + local260, Static292.method4927(local270), local6229, "<img=1>" + local258, 0, 9, -1);
									} else if (local284 == 1) {
										Static49.method1492("<img=0>" + local260, Static292.method4927(local270), local6229, "<img=0>" + local258, 0, 9, -1);
									} else {
										Static49.method1492(local260, Static292.method4927(local270), local6229, local258, 0, 9, -1);
									}
								}
								Static304.aClass6_92 = null;
								return true;
							} else {
								Static41.method1359(null, "T1 - " + (Static304.aClass6_92 == null ? -1 : Static304.aClass6_92.method233()) + "," + (Static136.aClass6_48 == null ? -1 : Static136.aClass6_48.method233()) + "," + (Static388.aClass6_117 == null ? -1 : Static388.aClass6_117.method233()) + " - " + Static45.anInt1403);
								Static140.method2961(false);
								return true;
							}
						}
					}
				}
			}
		}
	}
}
