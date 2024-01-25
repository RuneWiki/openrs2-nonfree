import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)Z")
	public static boolean method4648() throws IOException {
		if (Static7.aClass148_1 == null) {
			return false;
		}
		@Pc(13) int local13 = Static7.aClass148_1.method4125();
		if (local13 == 0) {
			return false;
		}
		if (Static74.anInt1958 == -1) {
			Static7.aClass148_1.method4124(0, 1, Static311.aClass1_Sub8_Sub1_8.aByteArray81);
			Static311.aClass1_Sub8_Sub1_8.anInt5182 = 0;
			Static74.anInt1958 = Static311.aClass1_Sub8_Sub1_8.method3233();
			Static85.anInt5393 = Static3.anIntArray18[Static74.anInt1958];
			local13--;
		}
		if (Static85.anInt5393 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static7.aClass148_1.method4124(0, 1, Static311.aClass1_Sub8_Sub1_8.aByteArray81);
			local13--;
			Static85.anInt5393 = Static311.aClass1_Sub8_Sub1_8.aByteArray81[0] & 0xFF;
		}
		if (Static85.anInt5393 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static7.aClass148_1.method4124(0, 2, Static311.aClass1_Sub8_Sub1_8.aByteArray81);
			Static311.aClass1_Sub8_Sub1_8.anInt5182 = 0;
			Static85.anInt5393 = Static311.aClass1_Sub8_Sub1_8.method4556();
			local13 -= 2;
		}
		if (Static85.anInt5393 > local13) {
			return false;
		}
		Static311.aClass1_Sub8_Sub1_8.anInt5182 = 0;
		Static7.aClass148_1.method4124(0, Static85.anInt5393, Static311.aClass1_Sub8_Sub1_8.aByteArray81);
		Static314.anInt6117 = 0;
		Static5.anInt197 = Static53.anInt1593;
		Static53.anInt1593 = Static107.anInt2548;
		Static107.anInt2548 = Static74.anInt1958;
		@Pc(124) int local124;
		@Pc(128) int local128;
		@Pc(132) int local132;
		if (Static74.anInt1958 == 104) {
			local124 = Static311.aClass1_Sub8_Sub1_8.method4545();
			local128 = Static311.aClass1_Sub8_Sub1_8.method4520();
			local132 = Static311.aClass1_Sub8_Sub1_8.method4547();
			if (Static292.method4180(local128)) {
				Static85.method4675(local124, local132);
			}
			Static74.anInt1958 = -1;
			return true;
		}
		@Pc(169) String local169;
		@Pc(167) String local167;
		@Pc(195) String local195;
		if (Static74.anInt1958 == 248) {
			local124 = Static311.aClass1_Sub8_Sub1_8.method4528();
			local128 = Static311.aClass1_Sub8_Sub1_8.method4545();
			local132 = Static311.aClass1_Sub8_Sub1_8.method4532();
			local167 = "";
			local169 = local167;
			if ((local132 & 0x1) != 0) {
				local167 = Static311.aClass1_Sub8_Sub1_8.method4534();
				if ((local132 & 0x2) == 0) {
					local169 = local167;
				} else {
					local169 = Static311.aClass1_Sub8_Sub1_8.method4534();
				}
			}
			local195 = Static311.aClass1_Sub8_Sub1_8.method4534();
			if (local124 == 99) {
				Static344.method5517(local195);
			} else if (local169.equals("") || !Static110.method5414(local169)) {
				Static114.method3916(local169, local167, local124, local128, local195);
			} else {
				Static74.anInt1958 = -1;
				return true;
			}
			Static74.anInt1958 = -1;
			return true;
		} else if (Static74.anInt1958 == 140) {
			local124 = Static311.aClass1_Sub8_Sub1_8.method4541();
			local128 = Static311.aClass1_Sub8_Sub1_8.method4541();
			local132 = Static311.aClass1_Sub8_Sub1_8.method4541();
			Static242.anInt6745 = local132 >> 1;
			Static198.aClass17_Sub1_Sub1_Sub1_3.method560((local132 & 0x1) == 1, local124, Static242.anInt6745, local128);
			Static74.anInt1958 = -1;
			return true;
		} else if (Static74.anInt1958 == 130) {
			local124 = Static311.aClass1_Sub8_Sub1_8.method4518();
			local128 = Static311.aClass1_Sub8_Sub1_8.method4520();
			Static173.method3435(local128, local124);
			Static74.anInt1958 = -1;
			return true;
		} else if (Static74.anInt1958 == 19) {
			Static309.anInt6063 = Static311.aClass1_Sub8_Sub1_8.method4532();
			Static74.anInt1958 = -1;
			Static88.anInt2213 = Static314.anInt6116;
			return true;
		} else {
			@Pc(355) int local355;
			@Pc(424) String local424;
			@Pc(329) String local329;
			@Pc(341) long local341;
			@Pc(331) String local331;
			@Pc(323) boolean local323;
			@Pc(346) long local346;
			@Pc(351) long local351;
			@Pc(359) int local359;
			if (Static74.anInt1958 == 251) {
				local323 = Static311.aClass1_Sub8_Sub1_8.method4532() == 1;
				local329 = Static311.aClass1_Sub8_Sub1_8.method4534();
				local331 = local329;
				if (local323) {
					local331 = Static311.aClass1_Sub8_Sub1_8.method4534();
				}
				local341 = Static311.aClass1_Sub8_Sub1_8.method4511();
				local346 = Static311.aClass1_Sub8_Sub1_8.method4556();
				local351 = Static311.aClass1_Sub8_Sub1_8.method4514();
				local355 = Static311.aClass1_Sub8_Sub1_8.method4532();
				local359 = Static311.aClass1_Sub8_Sub1_8.method4556();
				@Pc(365) long local365 = local351 + (local346 << 32);
				@Pc(367) boolean local367 = false;
				@Pc(369) int local369 = 0;
				while (true) {
					if (local369 >= 100) {
						if (local355 <= 1 && Static110.method5414(local331)) {
							local367 = true;
						}
						break;
					}
					if (Static52.aLongArray2[local369] == local365) {
						local367 = true;
						break;
					}
					local369++;
				}
				if (!local367 && Static1.anInt36 == 0) {
					Static52.aLongArray2[Static329.anInt6320] = local365;
					Static329.anInt6320 = (Static329.anInt6320 + 1) % 100;
					local424 = Static8.method5022(local359).method2089(Static311.aClass1_Sub8_Sub1_8);
					if (local355 == 2) {
						Static158.method3155(local359, local424, Static93.method2020(local341), "<img=1>" + local331, 20, "<img=1>" + local329, 0);
					} else if (local355 == 1) {
						Static158.method3155(local359, local424, Static93.method2020(local341), "<img=0>" + local331, 20, "<img=0>" + local329, 0);
					} else {
						Static158.method3155(local359, local424, Static93.method2020(local341), local331, 20, local329, 0);
					}
				}
				Static74.anInt1958 = -1;
				return true;
			}
			@Pc(531) int local531;
			@Pc(523) boolean local523;
			@Pc(533) int local533;
			@Pc(543) int local543;
			@Pc(539) int local539;
			if (Static74.anInt1958 == 37) {
				local124 = Static311.aClass1_Sub8_Sub1_8.method4556();
				local128 = Static311.aClass1_Sub8_Sub1_8.method4532();
				local523 = (local128 & 0x1) == 1;
				Static74.method1705(local124, local523);
				local531 = Static311.aClass1_Sub8_Sub1_8.method4556();
				for (local533 = 0; local533 < local531; local533++) {
					local539 = Static311.aClass1_Sub8_Sub1_8.method4547();
					local543 = Static311.aClass1_Sub8_Sub1_8.method4541();
					if (local543 == 255) {
						local543 = Static311.aClass1_Sub8_Sub1_8.method4554();
					}
					Static78.method1765(local523, local539 - 1, local124, local533, local543);
				}
				Static345.anIntArray526[Static111.anInt2597++ & 0x1F] = local124;
				Static74.anInt1958 = -1;
				return true;
			} else if (Static74.anInt1958 == 217) {
				local124 = Static311.aClass1_Sub8_Sub1_8.method4556();
				local128 = Static311.aClass1_Sub8_Sub1_8.method4520();
				local331 = Static311.aClass1_Sub8_Sub1_8.method4534();
				if (Static292.method4180(local124)) {
					Static115.method2442(local331, local128);
				}
				Static74.anInt1958 = -1;
				return true;
			} else {
				@Pc(805) Class215 local805;
				@Pc(780) int local780;
				@Pc(785) boolean local785;
				if (Static74.anInt1958 == 48) {
					Static128.anInt6687 = Static314.anInt6116;
					if (Static85.anInt5393 == 0) {
						Static74.anInt1958 = -1;
						Static156.aClass215Array1 = null;
						Static309.aString60 = null;
						Static56.aString19 = null;
						Static353.anInt6722 = 0;
						return true;
					}
					Static309.aString60 = Static311.aClass1_Sub8_Sub1_8.method4534();
					local323 = Static311.aClass1_Sub8_Sub1_8.method4532() == 1;
					if (local323) {
						Static311.aClass1_Sub8_Sub1_8.method4534();
					}
					@Pc(657) long local657 = Static311.aClass1_Sub8_Sub1_8.method4511();
					Static56.aString19 = Static87.method1890(local657);
					Static316.aByte77 = Static311.aClass1_Sub8_Sub1_8.method4558();
					local531 = Static311.aClass1_Sub8_Sub1_8.method4532();
					if (local531 == 255) {
						Static74.anInt1958 = -1;
						return true;
					}
					Static353.anInt6722 = local531;
					@Pc(681) Class215[] local681 = new Class215[100];
					for (local539 = 0; local539 < Static353.anInt6722; local539++) {
						local681[local539] = new Class215();
						local681[local539].aString67 = Static311.aClass1_Sub8_Sub1_8.method4534();
						local323 = Static311.aClass1_Sub8_Sub1_8.method4532() == 1;
						if (local323) {
							local681[local539].aString65 = Static311.aClass1_Sub8_Sub1_8.method4534();
						} else {
							local681[local539].aString65 = local681[local539].aString67;
						}
						local681[local539].aString66 = Static293.method4939(local681[local539].aString65);
						local681[local539].anInt6710 = Static311.aClass1_Sub8_Sub1_8.method4556();
						local681[local539].aByte78 = Static311.aClass1_Sub8_Sub1_8.method4558();
						local681[local539].aString64 = Static311.aClass1_Sub8_Sub1_8.method4534();
						if (local681[local539].aString65.equals(Static198.aClass17_Sub1_Sub1_Sub1_3.aString13)) {
							Static306.aByte71 = local681[local539].aByte78;
						}
					}
					local780 = Static353.anInt6722;
					while (local780 > 0) {
						local780--;
						local785 = true;
						for (local355 = 0; local355 < local780; local355++) {
							if (local681[local355].aString66.compareTo(local681[local355 + 1].aString66) > 0) {
								local805 = local681[local355];
								local681[local355] = local681[local355 + 1];
								local681[local355 + 1] = local805;
								local785 = false;
							}
						}
						if (local785) {
							break;
						}
					}
					Static74.anInt1958 = -1;
					Static156.aClass215Array1 = local681;
					return true;
				} else if (Static74.anInt1958 == 173) {
					Static54.anInt1635 = Static311.aClass1_Sub8_Sub1_8.method4532();
					Static260.anInt5590 = Static314.anInt6116;
					Static74.anInt1958 = -1;
					return true;
				} else if (Static74.anInt1958 == 62) {
					local124 = Static311.aClass1_Sub8_Sub1_8.method4556();
					local128 = Static311.aClass1_Sub8_Sub1_8.method4532();
					local132 = Static311.aClass1_Sub8_Sub1_8.method4532();
					local531 = Static311.aClass1_Sub8_Sub1_8.method4532();
					local533 = Static311.aClass1_Sub8_Sub1_8.method4532();
					local539 = Static311.aClass1_Sub8_Sub1_8.method4556();
					if (Static292.method4180(local124)) {
						Static72.aBooleanArray9[local128] = true;
						Static330.anIntArray512[local128] = local132;
						Static187.anIntArray369[local128] = local531;
						Static26.anIntArray87[local128] = local533;
						Static238.anIntArray442[local128] = local539;
					}
					Static74.anInt1958 = -1;
					return true;
				} else if (Static74.anInt1958 == 149) {
					local124 = Static311.aClass1_Sub8_Sub1_8.method4556();
					if (Static292.method4180(local124)) {
						Static218.method4140();
					}
					Static74.anInt1958 = -1;
					return true;
				} else if (Static74.anInt1958 == 227) {
					local124 = Static311.aClass1_Sub8_Sub1_8.method4556();
					local128 = Static311.aClass1_Sub8_Sub1_8.method4532();
					local523 = (local128 & 0x1) == 1;
					while (Static85.anInt5393 > Static311.aClass1_Sub8_Sub1_8.anInt5182) {
						local531 = Static311.aClass1_Sub8_Sub1_8.method4528();
						local533 = Static311.aClass1_Sub8_Sub1_8.method4556();
						local539 = 0;
						if (local533 != 0) {
							local539 = Static311.aClass1_Sub8_Sub1_8.method4532();
							if (local539 == 255) {
								local539 = Static311.aClass1_Sub8_Sub1_8.method4545();
							}
						}
						Static78.method1765(local523, local533 - 1, local124, local531, local539);
					}
					Static345.anIntArray526[Static111.anInt2597++ & 0x1F] = local124;
					Static74.anInt1958 = -1;
					return true;
				} else {
					@Pc(1057) int local1057;
					if (Static74.anInt1958 == 118) {
						local124 = Static311.aClass1_Sub8_Sub1_8.method4554();
						local128 = local124 >> 28 & 0x3;
						local132 = local124 >> 14 & 0x3FFF;
						local531 = local124 & 0x3FFF;
						local533 = Static311.aClass1_Sub8_Sub1_8.method4547();
						if (local533 == 65535) {
							local533 = -1;
						}
						local539 = Static311.aClass1_Sub8_Sub1_8.method4541();
						local543 = local539 >> 2;
						local1057 = local539 & 0x3;
						local780 = Static67.anIntArray182[local543];
						local531 -= Static32.anInt2224;
						local132 -= Static234.anInt4783;
						Static120.method2551(local132, local531, local533, local543, local1057, local780, local128);
						Static74.anInt1958 = -1;
						return true;
					} else if (Static74.anInt1958 == 24) {
						if (Static197.aFrame2 != null) {
							Static30.method888(-1, -1, Static168.anInt3612, false);
						}
						@Pc(1098) byte[] local1098 = new byte[Static85.anInt5393];
						Static311.aClass1_Sub8_Sub1_8.method3239(local1098, Static85.anInt5393);
						local329 = Static31.method799(local1098, Static85.anInt5393, 0);
						Static305.method5135(local329, Static306.anInt6046 == 1, Static15.aClass143_1, true);
						Static74.anInt1958 = -1;
						return true;
					} else if (Static74.anInt1958 == 246) {
						Static324.anInt6225 = Static311.aClass1_Sub8_Sub1_8.method4520() * 30;
						Static260.anInt5590 = Static314.anInt6116;
						Static74.anInt1958 = -1;
						return true;
					} else if (Static74.anInt1958 == 21) {
						Static294.method4960(false);
						Static74.anInt1958 = -1;
						return true;
					} else if (Static74.anInt1958 == 74) {
						local124 = Static311.aClass1_Sub8_Sub1_8.method4541();
						local128 = Static311.aClass1_Sub8_Sub1_8.method4552();
						local132 = Static311.aClass1_Sub8_Sub1_8.method4518();
						Static120.anIntArray249[local128] = local132;
						Static122.anIntArray252[local128] = local124;
						Static20.anIntArray76[local128] = 1;
						local531 = Static269.anIntArray460[local128] - 1;
						for (local533 = 0; local533 < local531; local533++) {
							if (local132 >= Class1_Sub3_Sub4.anIntArray102[local533]) {
								Static20.anIntArray76[local128] = local533 + 2;
							}
						}
						Static4.anIntArray19[Static356.anInt6802++ & 0x1F] = local128;
						Static74.anInt1958 = -1;
						return true;
					} else {
						@Pc(1235) String local1235;
						if (Static74.anInt1958 == 129) {
							local1235 = Static311.aClass1_Sub8_Sub1_8.method4534();
							local128 = Static311.aClass1_Sub8_Sub1_8.method4547();
							local132 = Static311.aClass1_Sub8_Sub1_8.method4556();
							if (Static292.method4180(local128)) {
								Static115.method2442(local1235, local132);
							}
							Static74.anInt1958 = -1;
							return true;
						}
						@Pc(1295) Class1_Sub37 local1295;
						if (Static74.anInt1958 == 249) {
							local124 = Static311.aClass1_Sub8_Sub1_8.method4556();
							local128 = Static311.aClass1_Sub8_Sub1_8.method4552();
							local132 = Static311.aClass1_Sub8_Sub1_8.method4554();
							local531 = Static311.aClass1_Sub8_Sub1_8.method4520();
							if (Static292.method4180(local124)) {
								local1295 = (Class1_Sub37) Static351.aClass197_33.method5157((long) local132);
								if (local1295 != null) {
									Static107.method2331(local531 != local1295.anInt6281, false, local1295);
								}
								Static97.method4762(local531, local132, false, local128);
							}
							Static74.anInt1958 = -1;
							return true;
						} else if (Static74.anInt1958 == 52) {
							local124 = Static311.aClass1_Sub8_Sub1_8.method4532();
							local128 = Static311.aClass1_Sub8_Sub1_8.method4556();
							if (Static292.method4180(local128)) {
								Static154.anInt3394 = local124;
							}
							Static74.anInt1958 = -1;
							return true;
						} else if (Static74.anInt1958 == 243) {
							Static311.aClass1_Sub8_Sub1_8.anInt5182 += 28;
							if (Static311.aClass1_Sub8_Sub1_8.method4544()) {
								Static98.method2065(Static311.aClass1_Sub8_Sub1_8, Static311.aClass1_Sub8_Sub1_8.anInt5182 - 28);
							}
							Static74.anInt1958 = -1;
							return true;
						} else if (Static74.anInt1958 == 11) {
							local124 = Static311.aClass1_Sub8_Sub1_8.method4520();
							local128 = Static311.aClass1_Sub8_Sub1_8.method4539();
							if (Static292.method4180(local124)) {
								Static41.method969(2047, 5, local128, 0);
							}
							Static74.anInt1958 = -1;
							return true;
						} else if (Static74.anInt1958 == 171) {
							local124 = Static311.aClass1_Sub8_Sub1_8.method4552();
							local128 = Static311.aClass1_Sub8_Sub1_8.method4520();
							Static238.method4345(local124, local128);
							Static74.anInt1958 = -1;
							return true;
						} else if (Static74.anInt1958 == 85) {
							local1235 = Static311.aClass1_Sub8_Sub1_8.method4534();
							local128 = Static311.aClass1_Sub8_Sub1_8.method4556();
							local331 = Static8.method5022(local128).method2089(Static311.aClass1_Sub8_Sub1_8);
							Static158.method3155(local128, local331, null, local1235, 19, local1235, 0);
							Static74.anInt1958 = -1;
							return true;
						} else if (Static74.anInt1958 == 214) {
							Static144.anInt3144 = Static311.aClass1_Sub8_Sub1_8.method4532();
							Static74.anInt1958 = -1;
							return true;
						} else if (Static74.anInt1958 == 177) {
							local124 = Static311.aClass1_Sub8_Sub1_8.method4556();
							local128 = Static311.aClass1_Sub8_Sub1_8.method4545();
							local132 = Static311.aClass1_Sub8_Sub1_8.method4552();
							if (Static292.method4180(local124)) {
								Static46.method1284(local128, local132);
							}
							Static74.anInt1958 = -1;
							return true;
						} else if (Static74.anInt1958 == 30 || Static74.anInt1958 == 27 || Static74.anInt1958 == 79 || Static74.anInt1958 == 83 || Static74.anInt1958 == 44 || Static74.anInt1958 == 2 || Static74.anInt1958 == 162 || Static74.anInt1958 == 119 || Static74.anInt1958 == 35 || Static74.anInt1958 == 165 || Static74.anInt1958 == 226 || Static74.anInt1958 == 84 || Static74.anInt1958 == 98 || Static74.anInt1958 == 133 || Static74.anInt1958 == 175) {
							Static277.method4846();
							Static74.anInt1958 = -1;
							return true;
						} else if (Static74.anInt1958 == 25) {
							@Pc(1577) byte local1577 = Static311.aClass1_Sub8_Sub1_8.method4558();
							local128 = Static311.aClass1_Sub8_Sub1_8.method4547();
							Static173.method3435(local128, local1577);
							Static74.anInt1958 = -1;
							return true;
						} else if (Static74.anInt1958 == 66) {
							local124 = Static311.aClass1_Sub8_Sub1_8.method4532();
							local128 = local124 >> 5;
							local132 = local124 & 0x1F;
							if (local132 == 0) {
								Static340.aClass105Array1[local128] = null;
								Static74.anInt1958 = -1;
								return true;
							}
							@Pc(1620) Class105 local1620 = new Class105();
							local1620.anInt3081 = local132;
							local1620.anInt3080 = Static311.aClass1_Sub8_Sub1_8.method4532();
							if (local1620.anInt3080 >= 0 && local1620.anInt3080 < Static228.aClass5Array17.length) {
								if (local1620.anInt3081 == 1 || local1620.anInt3081 == 10) {
									local1620.anInt3076 = Static311.aClass1_Sub8_Sub1_8.method4556();
									Static311.aClass1_Sub8_Sub1_8.anInt5182 += 5;
								} else if (local1620.anInt3081 >= 2 && local1620.anInt3081 <= 6) {
									if (local1620.anInt3081 == 2) {
										local1620.anInt3088 = 64;
										local1620.anInt3077 = 64;
									}
									if (local1620.anInt3081 == 3) {
										local1620.anInt3077 = 64;
										local1620.anInt3088 = 0;
									}
									if (local1620.anInt3081 == 4) {
										local1620.anInt3077 = 64;
										local1620.anInt3088 = 128;
									}
									if (local1620.anInt3081 == 5) {
										local1620.anInt3088 = 64;
										local1620.anInt3077 = 0;
									}
									if (local1620.anInt3081 == 6) {
										local1620.anInt3088 = 64;
										local1620.anInt3077 = 128;
									}
									local1620.anInt3081 = 2;
									local1620.anInt3086 = Static311.aClass1_Sub8_Sub1_8.method4556();
									local1620.anInt3083 = Static311.aClass1_Sub8_Sub1_8.method4556();
									local1620.anInt3079 = Static311.aClass1_Sub8_Sub1_8.method4532();
									local1620.anInt3084 = Static311.aClass1_Sub8_Sub1_8.method4556();
								}
								local1620.anInt3087 = Static311.aClass1_Sub8_Sub1_8.method4556();
								if (local1620.anInt3087 == 65535) {
									local1620.anInt3087 = -1;
								}
								Static340.aClass105Array1[local128] = local1620;
							}
							Static74.anInt1958 = -1;
							return true;
						} else if (Static74.anInt1958 == 158) {
							local124 = Static311.aClass1_Sub8_Sub1_8.method4545();
							Static277.aClass162_9 = Static15.aClass143_1.method3909(local124);
							Static74.anInt1958 = -1;
							return true;
						} else if (Static74.anInt1958 == 125) {
							local124 = Static311.aClass1_Sub8_Sub1_8.method4556();
							local128 = Static311.aClass1_Sub8_Sub1_8.method4545();
							local132 = Static311.aClass1_Sub8_Sub1_8.method4533();
							if (Static292.method4180(local124)) {
								Static80.method1810(local128, local132);
							}
							Static74.anInt1958 = -1;
							return true;
						} else if (Static74.anInt1958 == 46) {
							local1235 = Static311.aClass1_Sub8_Sub1_8.method4534();
							local128 = Static311.aClass1_Sub8_Sub1_8.method4532();
							local132 = Static311.aClass1_Sub8_Sub1_8.method4520();
							if (local132 == 65535) {
								local132 = -1;
							}
							local531 = Static311.aClass1_Sub8_Sub1_8.method4532();
							if (local531 >= 1 && local531 <= 8) {
								if (local1235.equalsIgnoreCase("null")) {
									local1235 = null;
								}
								Static7.aStringArray1[local531 - 1] = local1235;
								Static132.anIntArray258[local531 - 1] = local132;
								Static74.aBooleanArray10[local531 - 1] = local128 == 0;
							}
							Static74.anInt1958 = -1;
							return true;
						} else {
							@Pc(1999) String local1999;
							if (Static74.anInt1958 == 189) {
								local323 = Static311.aClass1_Sub8_Sub1_8.method4532() == 1;
								local329 = Static311.aClass1_Sub8_Sub1_8.method4534();
								local331 = local329;
								if (local323) {
									local331 = Static311.aClass1_Sub8_Sub1_8.method4534();
								}
								local341 = Static311.aClass1_Sub8_Sub1_8.method4511();
								local346 = Static311.aClass1_Sub8_Sub1_8.method4556();
								local351 = Static311.aClass1_Sub8_Sub1_8.method4514();
								local355 = Static311.aClass1_Sub8_Sub1_8.method4532();
								@Pc(1931) long local1931 = local351 + (local346 << 32);
								@Pc(1933) boolean local1933 = false;
								@Pc(1935) int local1935 = 0;
								while (true) {
									if (local1935 >= 100) {
										if (local355 <= 1) {
											if (Static87.aBoolean206 && !Static278.aBoolean548 || Static145.aBoolean302) {
												local1933 = true;
											} else if (Static110.method5414(local331)) {
												local1933 = true;
											}
										}
										break;
									}
									if (local1931 == Static52.aLongArray2[local1935]) {
										local1933 = true;
										break;
									}
									local1935++;
								}
								if (!local1933 && Static1.anInt36 == 0) {
									Static52.aLongArray2[Static329.anInt6320] = local1931;
									Static329.anInt6320 = (Static329.anInt6320 + 1) % 100;
									local1999 = Static331.method5388(Static239.method4370(Static132.method2705(Static311.aClass1_Sub8_Sub1_8)));
									if (local355 == 2 || local355 == 3) {
										Static158.method3155(-1, local1999, Static93.method2020(local341), "<img=1>" + local331, 9, "<img=1>" + local329, 0);
									} else if (local355 == 1) {
										Static158.method3155(-1, local1999, Static93.method2020(local341), "<img=0>" + local331, 9, "<img=0>" + local329, 0);
									} else {
										Static158.method3155(-1, local1999, Static93.method2020(local341), local331, 9, local329, 0);
									}
								}
								Static74.anInt1958 = -1;
								return true;
							} else if (Static74.anInt1958 == 100) {
								local124 = Static311.aClass1_Sub8_Sub1_8.method4538();
								@Pc(2088) byte local2088 = Static311.aClass1_Sub8_Sub1_8.method4537();
								local132 = Static311.aClass1_Sub8_Sub1_8.method4547();
								if (Static292.method4180(local124)) {
									Static85.method4675(local2088, local132);
								}
								Static74.anInt1958 = -1;
								return true;
							} else if (Static74.anInt1958 == 76) {
								local124 = Static311.aClass1_Sub8_Sub1_8.method4547();
								local128 = Static311.aClass1_Sub8_Sub1_8.method4547();
								local132 = Static311.aClass1_Sub8_Sub1_8.method4554();
								if (Static292.method4180(local128)) {
									Static219.method4147(local132, local124);
								}
								Static74.anInt1958 = -1;
								return true;
							} else if (Static74.anInt1958 == 221) {
								Static178.method3528();
								Static74.anInt1958 = -1;
								Static170.anInt3655 += 32;
								return true;
							} else {
								@Pc(2197) long local2197;
								@Pc(2218) Class1_Sub42 local2218;
								@Pc(2203) Class1_Sub42 local2203;
								if (Static74.anInt1958 == 159) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4556();
									if (local124 == 65535) {
										local124 = -1;
									}
									local128 = Static311.aClass1_Sub8_Sub1_8.method4545();
									local132 = Static311.aClass1_Sub8_Sub1_8.method4520();
									local531 = Static311.aClass1_Sub8_Sub1_8.method4538();
									if (local531 == 65535) {
										local531 = -1;
									}
									local533 = Static311.aClass1_Sub8_Sub1_8.method4554();
									if (Static292.method4180(local132)) {
										for (local539 = local124; local539 <= local531; local539++) {
											local2197 = (long) local539 + ((long) local128 << 32);
											local2203 = (Class1_Sub42) Static264.aClass197_32.method5157(local2197);
											if (local2203 != null) {
												local2218 = new Class1_Sub42(local533, local2203.anInt6675);
												local2203.method5628();
											} else if (local539 == -1) {
												local2218 = new Class1_Sub42(local533, Static9.method319(local128).aClass1_Sub42_1.anInt6675);
											} else {
												local2218 = new Class1_Sub42(local533, -1);
											}
											Static264.aClass197_32.method5166(local2218, local2197);
										}
									}
									Static74.anInt1958 = -1;
									return true;
								}
								@Pc(2498) int local2498;
								@Pc(2516) String local2516;
								if (Static74.anInt1958 == 202) {
									local323 = Static311.aClass1_Sub8_Sub1_8.method4532() == 1;
									local329 = Static311.aClass1_Sub8_Sub1_8.method4534();
									local331 = Static311.aClass1_Sub8_Sub1_8.method4534();
									local531 = Static311.aClass1_Sub8_Sub1_8.method4556();
									local533 = Static311.aClass1_Sub8_Sub1_8.method4532();
									local195 = "";
									local785 = false;
									if (local531 > 0) {
										local195 = Static311.aClass1_Sub8_Sub1_8.method4534();
										local785 = Static311.aClass1_Sub8_Sub1_8.method4532() == 1;
									}
									for (local1057 = 0; local1057 < Static191.anInt4095; local1057++) {
										if (local323) {
											if (local331.equals(Static235.aStringArray49[local1057])) {
												Static235.aStringArray49[local1057] = local329;
												local329 = null;
												Static58.aStringArray16[local1057] = local331;
												break;
											}
										} else if (local329.equals(Static235.aStringArray49[local1057])) {
											if (Static202.anIntArray385[local1057] != local531) {
												Static202.anIntArray385[local1057] = local531;
												if (local531 > 0) {
													Static114.method3916("", "", 5, 0, local329 + Static325.aClass34_180.method1285(Static259.anInt2907));
												}
												if (local531 == 0) {
													Static114.method3916("", "", 5, 0, local329 + Static131.aClass34_96.method1285(Static259.anInt2907));
												}
											}
											Static58.aStringArray16[local1057] = local331;
											Static247.aStringArray54[local1057] = local195;
											Static22.anIntArray443[local1057] = local533;
											local329 = null;
											Static148.aBooleanArray13[local1057] = local785;
											break;
										}
									}
									if (local329 != null && Static191.anInt4095 < 200) {
										Static235.aStringArray49[Static191.anInt4095] = local329;
										Static58.aStringArray16[Static191.anInt4095] = local331;
										Static202.anIntArray385[Static191.anInt4095] = local531;
										Static247.aStringArray54[Static191.anInt4095] = local195;
										Static22.anIntArray443[Static191.anInt4095] = local533;
										Static148.aBooleanArray13[Static191.anInt4095] = local785;
										Static191.anInt4095++;
									}
									Static88.anInt2213 = Static314.anInt6116;
									local355 = Static191.anInt4095;
									while (local355 > 0) {
										@Pc(2457) boolean local2457 = true;
										local355--;
										for (local359 = 0; local359 < local355; local359++) {
											if (Static202.anIntArray385[local359] != Static292.anInt4638 && Static202.anIntArray385[local359 + 1] == Static292.anInt4638 || Static202.anIntArray385[local359] == 0 && Static202.anIntArray385[local359 + 1] != 0) {
												local2498 = Static202.anIntArray385[local359];
												Static202.anIntArray385[local359] = Static202.anIntArray385[local359 + 1];
												Static202.anIntArray385[local359 + 1] = local2498;
												local2516 = Static247.aStringArray54[local359];
												Static247.aStringArray54[local359] = Static247.aStringArray54[local359 + 1];
												Static247.aStringArray54[local359 + 1] = local2516;
												local1999 = Static235.aStringArray49[local359];
												Static235.aStringArray49[local359] = Static235.aStringArray49[local359 + 1];
												Static235.aStringArray49[local359 + 1] = local1999;
												local424 = Static58.aStringArray16[local359];
												Static58.aStringArray16[local359] = Static58.aStringArray16[local359 + 1];
												Static58.aStringArray16[local359 + 1] = local424;
												@Pc(2570) int local2570 = Static22.anIntArray443[local359];
												Static22.anIntArray443[local359] = Static22.anIntArray443[local359 + 1];
												Static22.anIntArray443[local359 + 1] = local2570;
												@Pc(2588) boolean local2588 = Static148.aBooleanArray13[local359];
												Static148.aBooleanArray13[local359] = Static148.aBooleanArray13[local359 + 1];
												local2457 = false;
												Static148.aBooleanArray13[local359 + 1] = local2588;
											}
										}
										if (local2457) {
											break;
										}
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 191) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4539();
									local128 = Static311.aClass1_Sub8_Sub1_8.method4554();
									local132 = Static311.aClass1_Sub8_Sub1_8.method4556();
									local531 = Static311.aClass1_Sub8_Sub1_8.method4538();
									if (local531 == 65535) {
										local531 = -1;
									}
									if (Static292.method4180(local132)) {
										Static169.method3379(local124, local128, local531);
										@Pc(2665) Class111 local2665 = Static20.method561(local531);
										Static298.method4996(local2665.anInt3317, local124, local2665.anInt3327, local2665.anInt3337);
										Static83.method1820(local2665.anInt3330, local2665.anInt3283, local124, local2665.anInt3306);
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 107) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4532();
									@Pc(2707) boolean local2707 = (local124 & 0x1) == 1;
									local331 = Static311.aClass1_Sub8_Sub1_8.method4534();
									local167 = Static311.aClass1_Sub8_Sub1_8.method4534();
									if (local167.equals("")) {
										local167 = local331;
									}
									local169 = Static311.aClass1_Sub8_Sub1_8.method4534();
									local195 = Static311.aClass1_Sub8_Sub1_8.method4534();
									if (local195.equals("")) {
										local195 = local169;
									}
									if (local2707) {
										for (local543 = 0; local543 < Static264.anInt6557; local543++) {
											if (Static12.aStringArray5[local543].equals(local195)) {
												Static47.aStringArray15[local543] = local331;
												Static12.aStringArray5[local543] = local167;
												Static172.aStringArray34[local543] = local169;
												Static9.aStringArray2[local543] = local195;
												break;
											}
										}
									} else {
										Static47.aStringArray15[Static264.anInt6557] = local331;
										Static12.aStringArray5[Static264.anInt6557] = local167;
										Static172.aStringArray34[Static264.anInt6557] = local169;
										Static9.aStringArray2[Static264.anInt6557] = local195;
										Static23.aBooleanArray3[Static264.anInt6557] = (local124 & 0x2) == 2;
										Static264.anInt6557++;
									}
									Static88.anInt2213 = Static314.anInt6116;
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 6) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4518();
									local128 = Static311.aClass1_Sub8_Sub1_8.method4520();
									local132 = Static311.aClass1_Sub8_Sub1_8.method4538();
									local531 = Static311.aClass1_Sub8_Sub1_8.method4547();
									if (Static292.method4180(local132)) {
										Static298.method4998(local124, (local531 << 16) + local128);
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 197) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4547();
									local128 = Static311.aClass1_Sub8_Sub1_8.method4547();
									local132 = Static311.aClass1_Sub8_Sub1_8.method4545();
									local531 = Static311.aClass1_Sub8_Sub1_8.method4539();
									if (Static292.method4180(local128)) {
										Static41.method969(local124, 5, local132, local531);
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 201) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4518();
									local128 = Static311.aClass1_Sub8_Sub1_8.method4556();
									local132 = Static311.aClass1_Sub8_Sub1_8.method4538();
									if (local132 == 65535) {
										local132 = -1;
									}
									if (Static292.method4180(local128)) {
										Static41.method969(local132, 1, local124, -1);
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 106) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4556();
									local128 = Static311.aClass1_Sub8_Sub1_8.method4545();
									if (Static292.method4180(local124)) {
										@Pc(2939) Class1_Sub37 local2939 = (Class1_Sub37) Static351.aClass197_33.method5157((long) local128);
										if (local2939 != null) {
											Static107.method2331(true, false, local2939);
										}
										if (Static111.aClass12_7 != null) {
											Static6.method247(Static111.aClass12_7);
											Static111.aClass12_7 = null;
										}
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 112) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4547();
									local128 = Static311.aClass1_Sub8_Sub1_8.method4554();
									local132 = Static311.aClass1_Sub8_Sub1_8.method4556();
									if (Static292.method4180(local132)) {
										Static71.method3161(local128, local124);
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 185) {
									Static122.anInt2773 = Static311.aClass1_Sub8_Sub1_8.method4541();
									Static170.anInt3654 = Static311.aClass1_Sub8_Sub1_8.method4532();
									while (Static311.aClass1_Sub8_Sub1_8.anInt5182 < Static85.anInt5393) {
										Static74.anInt1958 = Static311.aClass1_Sub8_Sub1_8.method4532();
										Static277.method4846();
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 40) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4556();
									local128 = Static311.aClass1_Sub8_Sub1_8.method4556();
									local132 = Static311.aClass1_Sub8_Sub1_8.method4556();
									local531 = Static311.aClass1_Sub8_Sub1_8.method4556();
									if (Static292.method4180(local124) && Static348.aClass12ArrayArray1[local128] != null) {
										for (local533 = local132; local533 < local531; local533++) {
											local539 = Static311.aClass1_Sub8_Sub1_8.method4514();
											if (local533 < Static348.aClass12ArrayArray1[local128].length && Static348.aClass12ArrayArray1[local128][local533] != null) {
												Static348.aClass12ArrayArray1[local128][local533].anInt427 = local539;
											}
										}
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 195) {
									Static157.anInt4885 = Static311.aClass1_Sub8_Sub1_8.method4532();
									Static70.anInt1846 = Static311.aClass1_Sub8_Sub1_8.method4532();
									Static7.anInt309 = Static311.aClass1_Sub8_Sub1_8.method4532();
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 252) {
									Static253.method4592(Static311.aClass1_Sub8_Sub1_8, Static85.anInt5393, Static15.aClass143_1);
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 166) {
									Static24.method667();
									Static74.anInt1958 = -1;
									return false;
								} else if (Static74.anInt1958 == 233) {
									if (Static89.anInt2231 != -1) {
										Static110.method5416(Static89.anInt2231, 0);
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 96) {
									local1235 = Static311.aClass1_Sub8_Sub1_8.method4534();
									local329 = Static331.method5388(Static239.method4370(Static132.method2705(Static311.aClass1_Sub8_Sub1_8)));
									Static114.method3916(local1235, local1235, 6, 0, local329);
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 253) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4538();
									if (local124 == 65535) {
										local124 = -1;
									}
									local128 = Static311.aClass1_Sub8_Sub1_8.method4538();
									if (local128 == 65535) {
										local128 = -1;
									}
									local132 = Static311.aClass1_Sub8_Sub1_8.method4556();
									local531 = Static311.aClass1_Sub8_Sub1_8.method4539();
									local533 = Static311.aClass1_Sub8_Sub1_8.method4556();
									if (Static292.method4180(local533)) {
										for (local539 = local128; local539 <= local124; local539++) {
											local2197 = ((long) local531 << 32) + ((long) local539);
											local2203 = (Class1_Sub42) Static264.aClass197_32.method5157(local2197);
											if (local2203 != null) {
												local2218 = new Class1_Sub42(local2203.anInt6683, local132);
												local2203.method5628();
											} else if (local539 == -1) {
												local2218 = new Class1_Sub42(Static9.method319(local531).aClass1_Sub42_1.anInt6683, local132);
											} else {
												local2218 = new Class1_Sub42(0, local132);
											}
											Static264.aClass197_32.method5166(local2218, local2197);
										}
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 153) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4556();
									local128 = Static311.aClass1_Sub8_Sub1_8.method4532();
									local132 = Static311.aClass1_Sub8_Sub1_8.method4532();
									local531 = Static311.aClass1_Sub8_Sub1_8.method4556();
									local533 = Static311.aClass1_Sub8_Sub1_8.method4532();
									local539 = Static311.aClass1_Sub8_Sub1_8.method4532();
									if (Static292.method4180(local124)) {
										Static71.method3164(local539, local533, local128, local132, local531, true);
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 141) {
									local323 = Static311.aClass1_Sub8_Sub1_8.method4532() == 1;
									local329 = Static311.aClass1_Sub8_Sub1_8.method4534();
									local331 = local329;
									if (local323) {
										local331 = Static311.aClass1_Sub8_Sub1_8.method4534();
									}
									local341 = Static311.aClass1_Sub8_Sub1_8.method4556();
									local346 = Static311.aClass1_Sub8_Sub1_8.method4514();
									local1057 = Static311.aClass1_Sub8_Sub1_8.method4532();
									@Pc(3376) long local3376 = local346 + (local341 << 32);
									@Pc(3378) boolean local3378 = false;
									local2498 = 0;
									while (true) {
										if (local2498 >= 100) {
											if (local1057 <= 1) {
												if (Static87.aBoolean206 && !Static278.aBoolean548 || Static145.aBoolean302) {
													local3378 = true;
												} else if (Static110.method5414(local331)) {
													local3378 = true;
												}
											}
											break;
										}
										if (local3376 == Static52.aLongArray2[local2498]) {
											local3378 = true;
											break;
										}
										local2498++;
									}
									if (!local3378 && Static1.anInt36 == 0) {
										Static52.aLongArray2[Static329.anInt6320] = local3376;
										Static329.anInt6320 = (Static329.anInt6320 + 1) % 100;
										@Pc(3446) String local3446 = Static331.method5388(Static239.method4370(Static132.method2705(Static311.aClass1_Sub8_Sub1_8)));
										if (local1057 == 2) {
											Static158.method3155(-1, local3446, null, "<img=1>" + local331, 7, "<img=1>" + local329, 0);
										} else if (local1057 == 1) {
											Static158.method3155(-1, local3446, null, "<img=0>" + local331, 7, "<img=0>" + local329, 0);
										} else {
											Static158.method3155(-1, local3446, null, local331, 3, local329, 0);
										}
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 36) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4532();
									local128 = Static311.aClass1_Sub8_Sub1_8.method4538();
									if (local128 == 65535) {
										local128 = -1;
									}
									Static4.method71(local128, local124);
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 205) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4536();
									local128 = Static311.aClass1_Sub8_Sub1_8.method4520();
									if (local128 == 65535) {
										local128 = -1;
									}
									local132 = Static311.aClass1_Sub8_Sub1_8.method4526();
									Static92.method3294(local132, local128, local124);
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 190) {
									Static122.anInt2773 = Static311.aClass1_Sub8_Sub1_8.method4541();
									Static170.anInt3654 = Static311.aClass1_Sub8_Sub1_8.method4532();
									for (@Pc(3594) Class1_Sub7 local3594 = (Class1_Sub7) Static339.aClass197_30.method5161(); local3594 != null; local3594 = (Class1_Sub7) Static339.aClass197_30.method5154()) {
										local128 = (int) (local3594.aLong213 & 0x3FFFL);
										local132 = (int) (local3594.aLong213 >> 14 & 0x3FFFL);
										local531 = (int) (local3594.aLong213 >> 28 & 0x3L);
										if (Static242.anInt6745 == local531 && Static122.anInt2773 <= local128 && local128 < Static122.anInt2773 + 8 && local132 >= Static170.anInt3654 && Static170.anInt3654 + 8 > local132) {
											local3594.method5628();
											Static293.method4938(Static242.anInt6745, local128, local132);
										}
									}
									for (@Pc(3669) Class1_Sub25 local3669 = (Class1_Sub25) Static290.aClass16_35.method410(); local3669 != null; local3669 = (Class1_Sub25) Static290.aClass16_35.method419()) {
										if (local3669.anInt3971 >= Static122.anInt2773 && local3669.anInt3971 < Static122.anInt2773 + 8 && Static170.anInt3654 <= local3669.anInt3977 && local3669.anInt3977 < Static170.anInt3654 + 8 && local3669.anInt3976 == Static242.anInt6745) {
											local3669.anInt3972 = 0;
										}
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 50) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4538();
									local128 = Static311.aClass1_Sub8_Sub1_8.method4547();
									local132 = Static311.aClass1_Sub8_Sub1_8.method4554();
									if (Static292.method4180(local124)) {
										Static146.method2931(local128, local132);
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 32) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4520();
									local128 = Static311.aClass1_Sub8_Sub1_8.method4538();
									local132 = Static311.aClass1_Sub8_Sub1_8.method4518();
									local531 = Static311.aClass1_Sub8_Sub1_8.method4556();
									local533 = Static311.aClass1_Sub8_Sub1_8.method4547();
									if (Static292.method4180(local533)) {
										Static298.method4996(local531, local132, local128, local124);
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 77) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4556();
									local329 = Static311.aClass1_Sub8_Sub1_8.method4534();
									@Pc(3810) Object[] local3810 = new Object[local329.length() + 1];
									for (local531 = local329.length() - 1; local531 >= 0; local531--) {
										if (local329.charAt(local531) == 's') {
											local3810[local531 + 1] = Static311.aClass1_Sub8_Sub1_8.method4534();
										} else {
											local3810[local531 + 1] = Integer.valueOf(Static311.aClass1_Sub8_Sub1_8.method4545());
										}
									}
									local3810[0] = Integer.valueOf(Static311.aClass1_Sub8_Sub1_8.method4545());
									if (Static292.method4180(local124)) {
										@Pc(3868) Class1_Sub16 local3868 = new Class1_Sub16();
										local3868.anObjectArray34 = local3810;
										Static196.method3777(local3868);
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 8) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4547();
									local128 = Static311.aClass1_Sub8_Sub1_8.method4538();
									local132 = Static311.aClass1_Sub8_Sub1_8.method4547();
									if (Static292.method4180(local128)) {
										Static36.method875(local132, local124);
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 210) {
									Static68.method1616();
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 143) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4547();
									local128 = Static311.aClass1_Sub8_Sub1_8.method4545();
									Static238.method4345(local128, local124);
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 33) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4532();
									if (Static311.aClass1_Sub8_Sub1_8.method4532() == 0) {
										Static336.aClass125Array1[local124] = new Class125();
									} else {
										Static311.aClass1_Sub8_Sub1_8.anInt5182--;
										Static336.aClass125Array1[local124] = new Class125(Static311.aClass1_Sub8_Sub1_8);
									}
									Static74.anInt1958 = -1;
									Static27.anInt1010 = Static314.anInt6116;
									return true;
								} else if (Static74.anInt1958 == 90) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4556();
									local128 = Static311.aClass1_Sub8_Sub1_8.method4532();
									local132 = Static311.aClass1_Sub8_Sub1_8.method4532();
									local531 = Static311.aClass1_Sub8_Sub1_8.method4556();
									local533 = Static311.aClass1_Sub8_Sub1_8.method4532();
									local539 = Static311.aClass1_Sub8_Sub1_8.method4532();
									if (Static292.method4180(local124)) {
										Static88.method1919(local132, local533, local128, local531, local539);
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 14) {
									local323 = Static311.aClass1_Sub8_Sub1_8.method4532() == 1;
									local329 = Static311.aClass1_Sub8_Sub1_8.method4534();
									local331 = local329;
									if (local323) {
										local331 = Static311.aClass1_Sub8_Sub1_8.method4534();
									}
									local341 = Static311.aClass1_Sub8_Sub1_8.method4556();
									local346 = Static311.aClass1_Sub8_Sub1_8.method4514();
									local1057 = Static311.aClass1_Sub8_Sub1_8.method4532();
									local780 = Static311.aClass1_Sub8_Sub1_8.method4556();
									@Pc(4075) long local4075 = (local341 << 32) + local346;
									@Pc(4077) boolean local4077 = false;
									@Pc(4079) int local4079 = 0;
									while (true) {
										if (local4079 >= 100) {
											if (local1057 <= 1 && Static110.method5414(local331)) {
												local4077 = true;
											}
											break;
										}
										if (local4075 == Static52.aLongArray2[local4079]) {
											local4077 = true;
											break;
										}
										local4079++;
									}
									if (!local4077 && Static1.anInt36 == 0) {
										Static52.aLongArray2[Static329.anInt6320] = local4075;
										Static329.anInt6320 = (Static329.anInt6320 + 1) % 100;
										local2516 = Static8.method5022(local780).method2089(Static311.aClass1_Sub8_Sub1_8);
										if (local1057 == 2) {
											Static158.method3155(local780, local2516, null, "<img=1>" + local331, 18, "<img=1>" + local329, 0);
										} else if (local1057 == 1) {
											Static158.method3155(local780, local2516, null, "<img=0>" + local331, 18, "<img=0>" + local329, 0);
										} else {
											Static158.method3155(local780, local2516, null, local331, 18, local329, 0);
										}
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 216) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4556();
									if (Static292.method4180(local124)) {
										Static319.method5224();
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 9) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4556();
									local128 = Static311.aClass1_Sub8_Sub1_8.method4518();
									local132 = Static311.aClass1_Sub8_Sub1_8.method4547();
									local531 = Static311.aClass1_Sub8_Sub1_8.method4547();
									if (local128 >> 30 == 0) {
										@Pc(4353) Class24 local4353;
										@Pc(4288) Class67 local4288;
										@Pc(4334) Class67 local4334;
										@Pc(4301) Class24 local4301;
										@Pc(4348) Class24 local4348;
										if (local128 >> 29 != 0) {
											local533 = local128 & 0xFFFF;
											@Pc(4261) Class17_Sub1_Sub1_Sub2 local4261 = Static140.aClass17_Sub1_Sub1_Sub2Array1[local533];
											if (local4261 != null) {
												if (local132 == 65535) {
													local132 = -1;
												}
												local785 = true;
												if (local132 != -1 && local4261.anInt4884 != -1) {
													if (local132 == local4261.anInt4884) {
														local4288 = Static265.method5633(local132);
														if (local4288.aBoolean193 && local4288.anInt2088 != -1) {
															local4301 = Static110.method5411(local4288.anInt2088);
															local355 = local4301.anInt1037;
															if (local355 == 0 || local355 == 2) {
																local785 = false;
															} else if (local355 == 1) {
																local785 = true;
															}
														}
													} else {
														local4288 = Static265.method5633(local132);
														local4334 = Static265.method5633(local4261.anInt4884);
														if (local4288.anInt2088 != -1 && local4334.anInt2088 != -1) {
															local4348 = Static110.method5411(local4288.anInt2088);
															local4353 = Static110.method5411(local4334.anInt2088);
															if (local4353.anInt1051 > local4348.anInt1051) {
																local785 = false;
															}
														}
													}
												}
												if (local785) {
													local4261.anInt4855 = 0;
													local4261.anInt4884 = local132;
													local4261.anInt4833 = 1;
													local4261.anInt4845 = Static5.anInt208 + local531;
													local4261.anInt4881 = 0;
													local4261.anInt4844 = local124;
													if (local4261.anInt4845 > Static5.anInt208) {
														local4261.anInt4881 = -1;
													}
													if (local4261.anInt4884 != -1 && local4261.anInt4845 == Static5.anInt208) {
														local1057 = Static265.method5633(local4261.anInt4884).anInt2088;
														if (local1057 != -1) {
															local4301 = Static110.method5411(local1057);
															if (local4301 != null && local4301.anIntArray90 != null) {
																Static318.method5216(local4261.anInt5109, local4261.anInt5108, false, local4301, 0);
															}
														}
													}
												}
											}
										} else if (local128 >> 28 != 0) {
											local533 = local128 & 0xFFFF;
											@Pc(4446) Class17_Sub1_Sub1_Sub1 local4446;
											if (Static16.anInt527 == local533) {
												local4446 = Static198.aClass17_Sub1_Sub1_Sub1_3;
											} else {
												local4446 = Static102.aClass17_Sub1_Sub1_Sub1Array1[local533];
											}
											if (local4446 != null) {
												if (local132 == 65535) {
													local132 = -1;
												}
												local785 = true;
												if (local132 != -1 && local4446.anInt4884 != -1) {
													if (local4446.anInt4884 == local132) {
														local4288 = Static265.method5633(local132);
														if (local4288.aBoolean193 && local4288.anInt2088 != -1) {
															local4301 = Static110.method5411(local4288.anInt2088);
															local355 = local4301.anInt1037;
															if (local355 == 0 || local355 == 2) {
																local785 = false;
															} else if (local355 == 1) {
																local785 = true;
															}
														}
													} else {
														local4288 = Static265.method5633(local132);
														local4334 = Static265.method5633(local4446.anInt4884);
														if (local4288.anInt2088 != -1 && local4334.anInt2088 != -1) {
															local4348 = Static110.method5411(local4288.anInt2088);
															local4353 = Static110.method5411(local4334.anInt2088);
															if (local4353.anInt1051 > local4348.anInt1051) {
																local785 = false;
															}
														}
													}
												}
												if (local785) {
													local4446.anInt4884 = local132;
													local4446.anInt4833 = 1;
													local4446.anInt4855 = 0;
													local4446.anInt4881 = 0;
													local4446.anInt4844 = local124;
													local4446.anInt4845 = Static5.anInt208 + local531;
													if (local4446.anInt4884 == 65535) {
														local4446.anInt4884 = -1;
													}
													if (local4446.anInt4845 > Static5.anInt208) {
														local4446.anInt4881 = -1;
													}
													if (local4446.anInt4884 != -1 && Static5.anInt208 == local4446.anInt4845) {
														local1057 = Static265.method5633(local4446.anInt4884).anInt2088;
														if (local1057 != -1) {
															local4301 = Static110.method5411(local1057);
															if (local4301 != null && local4301.anIntArray90 != null) {
																Static318.method5216(local4446.anInt5109, local4446.anInt5108, local4446 == Static198.aClass17_Sub1_Sub1_Sub1_3, local4301, 0);
															}
														}
													}
												}
											}
										}
									} else {
										local533 = local128 >> 28 & 0x3;
										local539 = (local128 >> 14 & 0x3FFF) - Static234.anInt4783;
										local543 = (local128 & 0x3FFF) - Static32.anInt2224;
										if (local539 >= 0 && local543 >= 0 && Static233.anInt5573 > local539 && local543 < Static134.anInt2971) {
											local1057 = local539 * 128 + 64;
											local780 = local543 * 128 + 64;
											@Pc(4703) Class17_Sub1_Sub4 local4703 = new Class17_Sub1_Sub4(local132, 0, Static5.anInt208, local533, local1057, Static94.method2022(local780, local1057, local533) - local124, local780, local539, local539, local543, local543);
											Static34.aClass16_3.method416(new Class1_Sub4_Sub2(local4703));
										}
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 113) {
									if (Static85.anInt5393 == 0) {
										Static328.aString61 = Static59.aClass34_47.method1285(Static259.anInt2907);
									} else {
										Static328.aString61 = Static311.aClass1_Sub8_Sub1_8.method4534();
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 55) {
									Static294.method4960(true);
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 131) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4556();
									local128 = Static311.aClass1_Sub8_Sub1_8.method4518();
									local132 = Static311.aClass1_Sub8_Sub1_8.method4538();
									if (local132 == 65535) {
										local132 = -1;
									}
									if (Static292.method4180(local124)) {
										Static113.method2451(local132, local128);
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 56) {
									Static240.anInt1899 = Static311.aClass1_Sub8_Sub1_8.method4551();
									Static74.anInt1958 = -1;
									Static260.anInt5590 = Static314.anInt6116;
									return true;
								} else if (Static74.anInt1958 == 215) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4520();
									local128 = Static311.aClass1_Sub8_Sub1_8.method4547();
									if (local128 == 65535) {
										local128 = -1;
									}
									local132 = Static311.aClass1_Sub8_Sub1_8.method4539();
									if (Static292.method4180(local124)) {
										Static41.method969(local128, 2, local132, -1);
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 102) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4547();
									local128 = Static311.aClass1_Sub8_Sub1_8.method4536();
									local523 = (local128 & 0x1) == 1;
									Static299.method1004(local523, local124);
									Static345.anIntArray526[Static111.anInt2597++ & 0x1F] = local124;
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 231) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4545();
									local128 = Static311.aClass1_Sub8_Sub1_8.method4551();
									local132 = Static311.aClass1_Sub8_Sub1_8.method4533();
									local531 = Static311.aClass1_Sub8_Sub1_8.method4520();
									if (Static292.method4180(local531)) {
										Static192.method3718(local132, local124, local128);
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 188) {
									for (local124 = 0; local124 < Static102.aClass17_Sub1_Sub1_Sub1Array1.length; local124++) {
										if (Static102.aClass17_Sub1_Sub1_Sub1Array1[local124] != null) {
											Static102.aClass17_Sub1_Sub1_Sub1Array1[local124].anInt4830 = -1;
										}
									}
									for (local128 = 0; local128 < Static140.aClass17_Sub1_Sub1_Sub2Array1.length; local128++) {
										if (Static140.aClass17_Sub1_Sub1_Sub2Array1[local128] != null) {
											Static140.aClass17_Sub1_Sub1_Sub2Array1[local128].anInt4830 = -1;
										}
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 89) {
									local1235 = Static311.aClass1_Sub8_Sub1_8.method4534();
									local523 = Static311.aClass1_Sub8_Sub1_8.method4532() == 1;
									if (local523) {
										local329 = Static311.aClass1_Sub8_Sub1_8.method4534();
									} else {
										local329 = local1235;
									}
									local531 = Static311.aClass1_Sub8_Sub1_8.method4556();
									@Pc(5006) byte local5006 = Static311.aClass1_Sub8_Sub1_8.method4558();
									@Pc(5008) boolean local5008 = false;
									if (local5006 == -128) {
										local5008 = true;
									}
									if (local5008) {
										if (Static353.anInt6722 == 0) {
											Static74.anInt1958 = -1;
											return true;
										}
										for (local543 = 0; local543 < Static353.anInt6722 && (!Static156.aClass215Array1[local543].aString65.equals(local329) || Static156.aClass215Array1[local543].anInt6710 != local531); local543++) {
										}
										if (Static353.anInt6722 > local543) {
											while (local543 < Static353.anInt6722 - 1) {
												Static156.aClass215Array1[local543] = Static156.aClass215Array1[local543 + 1];
												local543++;
											}
											Static353.anInt6722--;
											Static156.aClass215Array1[Static353.anInt6722] = null;
										}
									} else {
										@Pc(5021) String local5021 = Static311.aClass1_Sub8_Sub1_8.method4534();
										local805 = new Class215();
										local805.aString65 = local329;
										local805.aString67 = local1235;
										local805.aString66 = Static293.method4939(local805.aString65);
										local805.aString64 = local5021;
										local805.aByte78 = local5006;
										local805.anInt6710 = local531;
										for (local780 = Static353.anInt6722 - 1; local780 >= 0; local780--) {
											local355 = Static156.aClass215Array1[local780].aString66.compareTo(local805.aString66);
											if (local355 == 0) {
												Static156.aClass215Array1[local780].anInt6710 = local531;
												Static156.aClass215Array1[local780].aByte78 = local5006;
												Static156.aClass215Array1[local780].aString64 = local5021;
												if (local329.equals(Static198.aClass17_Sub1_Sub1_Sub1_3.aString13)) {
													Static306.aByte71 = local5006;
												}
												Static74.anInt1958 = -1;
												Static128.anInt6687 = Static314.anInt6116;
												return true;
											}
											if (local355 < 0) {
												break;
											}
										}
										if (Static156.aClass215Array1.length <= Static353.anInt6722) {
											Static74.anInt1958 = -1;
											return true;
										}
										for (local355 = Static353.anInt6722 - 1; local355 > local780; local355--) {
											Static156.aClass215Array1[local355 + 1] = Static156.aClass215Array1[local355];
										}
										if (Static353.anInt6722 == 0) {
											Static156.aClass215Array1 = new Class215[100];
										}
										Static156.aClass215Array1[local780 + 1] = local805;
										Static353.anInt6722++;
										if (local329.equals(Static198.aClass17_Sub1_Sub1_Sub1_3.aString13)) {
											Static306.aByte71 = local5006;
										}
									}
									Static128.anInt6687 = Static314.anInt6116;
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 157) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4547();
									local128 = Static311.aClass1_Sub8_Sub1_8.method4556();
									local132 = Static311.aClass1_Sub8_Sub1_8.method4532();
									if (Static292.method4180(local128)) {
										if (local132 == 2) {
											Static118.method2491();
										}
										Static89.anInt2231 = local124;
										Static120.method2553(local124);
										Static267.method4700(false);
										Static196.method3781(Static89.anInt2231);
										for (local531 = 0; local531 < 100; local531++) {
											Static223.aBooleanArray28[local531] = true;
										}
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 95) {
									local1235 = Static311.aClass1_Sub8_Sub1_8.method4534();
									local128 = Static311.aClass1_Sub8_Sub1_8.method4520();
									local132 = Static311.aClass1_Sub8_Sub1_8.method4539();
									if (Static292.method4180(local128)) {
										Static228.method4250(local132, local1235);
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 139) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4554();
									local128 = Static311.aClass1_Sub8_Sub1_8.method4520();
									if (Static292.method4180(local128)) {
										Static41.method969(-1, 3, local124, -1);
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 103) {
									Static170.anInt3654 = Static311.aClass1_Sub8_Sub1_8.method4541();
									Static122.anInt2773 = Static311.aClass1_Sub8_Sub1_8.method4541();
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 167) {
									Static70.method1627();
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 39) {
									for (local124 = 0; local124 < Static30.anIntArray104.length; local124++) {
										if (Static91.anIntArray217[local124] != Static30.anIntArray104[local124]) {
											Static30.anIntArray104[local124] = Static91.anIntArray217[local124];
											Static166.method3354(local124);
											Static157.anIntArray437[Static170.anInt3655++ & 0x1F] = local124;
										}
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 200) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4532();
									local128 = Static311.aClass1_Sub8_Sub1_8.method4532();
									if (local124 == 255) {
										local124 = -1;
										local128 = -1;
									}
									Static75.method1711(local128, local124);
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 183) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4547();
									local128 = Static311.aClass1_Sub8_Sub1_8.method4547();
									local132 = Static311.aClass1_Sub8_Sub1_8.method4539();
									local531 = Static311.aClass1_Sub8_Sub1_8.method4547();
									local533 = Static311.aClass1_Sub8_Sub1_8.method4547();
									if (Static292.method4180(local124)) {
										Static41.method969(local531 | local128 << 16, 7, local132, local533);
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 150) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4520();
									local128 = Static311.aClass1_Sub8_Sub1_8.method4554();
									local132 = Static311.aClass1_Sub8_Sub1_8.method4518();
									if (Static292.method4180(local124)) {
										@Pc(5537) Class1_Sub37 local5537 = (Class1_Sub37) Static351.aClass197_33.method5157((long) local132);
										local1295 = (Class1_Sub37) Static351.aClass197_33.method5157((long) local128);
										if (local1295 != null) {
											Static107.method2331(local5537 == null || local1295.anInt6281 != local5537.anInt6281, false, local1295);
										}
										if (local5537 != null) {
											local5537.method5628();
											Static351.aClass197_33.method5166(local5537, (long) local128);
										}
										@Pc(5575) Class12 local5575 = Static9.method319(local132);
										if (local5575 != null) {
											Static6.method247(local5575);
										}
										local5575 = Static9.method319(local128);
										if (local5575 != null) {
											Static6.method247(local5575);
											Static50.method1306(true, local5575);
										}
										if (Static89.anInt2231 != -1) {
											Static110.method5416(Static89.anInt2231, 1);
										}
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 224) {
									Static264.anInt6557 = Static311.aClass1_Sub8_Sub1_8.method4532();
									for (local124 = 0; local124 < Static264.anInt6557; local124++) {
										Static47.aStringArray15[local124] = Static311.aClass1_Sub8_Sub1_8.method4534();
										Static12.aStringArray5[local124] = Static311.aClass1_Sub8_Sub1_8.method4534();
										if (Static12.aStringArray5[local124].equals("")) {
											Static12.aStringArray5[local124] = Static47.aStringArray15[local124];
										}
										Static172.aStringArray34[local124] = Static311.aClass1_Sub8_Sub1_8.method4534();
										Static9.aStringArray2[local124] = Static311.aClass1_Sub8_Sub1_8.method4534();
										if (Static9.aStringArray2[local124].equals("")) {
											Static9.aStringArray2[local124] = Static172.aStringArray34[local124];
										}
										Static23.aBooleanArray3[local124] = false;
									}
									Static88.anInt2213 = Static314.anInt6116;
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 82) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4556();
									if (local124 == 65535) {
										local124 = -1;
									}
									local128 = Static311.aClass1_Sub8_Sub1_8.method4532();
									local132 = Static311.aClass1_Sub8_Sub1_8.method4556();
									local531 = Static311.aClass1_Sub8_Sub1_8.method4532();
									Static139.method4229(local128, local124, local531, local132);
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 238) {
									local124 = Static311.aClass1_Sub8_Sub1_8.method4520();
									local128 = Static311.aClass1_Sub8_Sub1_8.method4556();
									local132 = Static311.aClass1_Sub8_Sub1_8.method4541();
									@Pc(5750) Class17_Sub1_Sub1_Sub2 local5750 = Static140.aClass17_Sub1_Sub1_Sub2Array1[local128];
									if (local5750 != null) {
										Static109.method2357(local124, local132, local5750);
									}
									Static74.anInt1958 = -1;
									return true;
								} else if (Static74.anInt1958 == 174) {
									Static81.method4493(Static311.aClass1_Sub8_Sub1_8.method4534());
									Static74.anInt1958 = -1;
									return true;
								} else {
									Static109.method2355("T1 - " + Static74.anInt1958 + "," + Static53.anInt1593 + "," + Static5.anInt197 + " - " + Static85.anInt5393, null);
									Static24.method667();
									return true;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!fe;")
	public static Class17_Sub1 method4649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class194 local7 = Static77.aClass194ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class126 local14 = local7.aClass126_2; local14 != null; local14 = local14.aClass126_1) {
			@Pc(18) Class17_Sub1 local18 = local14.aClass17_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort75 == arg1 && local18.aShort77 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BI)I")
	public static int method4650(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = arg0 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 1;
		@Pc(27) int local27 = local21 | local21 >>> 2;
		@Pc(33) int local33 = local27 | local27 >>> 4;
		@Pc(39) int local39 = local33 | local33 >>> 8;
		@Pc(45) int local45 = local39 | local39 >>> 16;
		return arg0 & ~local45;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(JZLclient!uo;)V")
	public static void method4651(@OriginalArg(0) long arg0, @OriginalArg(2) Class32 arg1) {
		Static271.anInt5532 = 0;
		Static74.anInt1952 = Static355.anInt6768;
		Static355.anInt6768 = 0;
		@Pc(21) long local21 = Static162.method3252();
		for (@Pc(26) Class8_Sub6 local26 = (Class8_Sub6) Static140.aClass217_5.method5683(); local26 != null; local26 = (Class8_Sub6) Static140.aClass217_5.method5679()) {
			if (local26.method3276(arg1, arg0)) {
				Static271.anInt5532++;
			}
		}
		if (Static233.aBoolean541 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static140.aClass217_5.method5687() + ", running: " + Static271.anInt5532 + ". Particles: " + Static355.anInt6768 + ". Time taken: " + (Static162.method3252() - local21) + "ms");
		}
	}
}
