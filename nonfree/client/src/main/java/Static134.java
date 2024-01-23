import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "F")
	public static float aFloat28;

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "Lclient!lg;")
	public static Class102 aClass102_2;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
	public static int anInt2700 = 0;

	@OriginalMember(owner = "client!kc", name = "r", descriptor = "[Z")
	public static boolean[] aBooleanArray8 = new boolean[5];

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZII[Lclient!mf;I[B)V")
	public static void method2180(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class112[] arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) int local7 = -1;
		@Pc(12) Class8_Sub2 local12 = new Class8_Sub2(arg4);
		while (true) {
			@Pc(21) int local21 = local12.method2320();
			if (local21 == 0) {
				return;
			}
			local7 += local21;
			@Pc(30) int local30 = 0;
			while (true) {
				@Pc(36) int local36 = local12.method2382();
				if (local36 == 0) {
					break;
				}
				local30 += local36 - 1;
				@Pc(51) int local51 = local30 & 0x3F;
				@Pc(55) int local55 = local30 >> 12;
				@Pc(59) int local59 = local12.method2334();
				@Pc(65) int local65 = local30 >> 6 & 0x3F;
				@Pc(69) int local69 = local59 >> 2;
				@Pc(73) int local73 = local59 & 0x3;
				@Pc(77) int local77 = local65 + arg2;
				@Pc(81) int local81 = local51 + arg1;
				if (local77 > 0 && local81 > 0 && local77 < 103 && local81 < 103) {
					@Pc(103) Class112 local103 = null;
					if (!arg0) {
						@Pc(108) int local108 = local55;
						if ((Static170.aByteArrayArrayArray9[1][local77][local81] & 0x2) == 2) {
							local108 = local55 - 1;
						}
						if (local108 >= 0) {
							local103 = arg3[local108];
						}
					}
					Static127.method2066(local7, local73, local55, arg0, local55, local103, !arg0, local69, local77, local81);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIII)V")
	public static void method2181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static159.anInt3250 = 0;
		@Pc(5) int local5;
		@Pc(640) int local640;
		@Pc(243) int local243;
		@Pc(108) int local108;
		@Pc(150) int local150;
		@Pc(195) int local195;
		@Pc(637) int local637;
		for (local5 = -1; local5 < Static135.anInt2729 + Static61.anInt1336; local5++) {
			@Pc(25) Class36_Sub3 local25;
			if (local5 == -1) {
				local25 = Static21.aClass36_Sub3_Sub1_1;
			} else if (local5 >= Static61.anInt1336) {
				local25 = Static48.aClass36_Sub3_Sub2Array1[Static191.anIntArray285[local5 - Static61.anInt1336]];
			} else {
				local25 = Static230.aClass36_Sub3_Sub1Array1[Static85.anIntArray123[local5]];
			}
			if (local25 != null && local25.method3112()) {
				@Pc(51) Class173 local51;
				if (local25 instanceof Class36_Sub3_Sub2) {
					local51 = ((Class36_Sub3_Sub2) local25).aClass173_1;
					if (local51.anIntArray491 != null) {
						local51 = local51.method4245();
					}
					if (local51 == null) {
						continue;
					}
				}
				@Pc(327) int local327;
				if (local5 >= Static61.anInt1336) {
					local51 = ((Class36_Sub3_Sub2) local25).aClass173_1;
					if (local51.anIntArray491 != null) {
						local51 = local51.method4245();
					}
					if (local51.anInt5601 >= 0 && local51.anInt5601 < Static184.aClass8_Sub1_Sub7Array80.length) {
						if (local51.anInt5617 == -1) {
							local108 = local25.method3111() + 15;
						} else {
							local108 = local51.anInt5617 + 15;
						}
						Static144.method2280(arg5 >> 1, local25, arg0, arg2 >> 1, local108, arg1);
						if (Static292.anInt5663 > -1) {
							Static184.aClass8_Sub1_Sub7Array80[local51.anInt5601].method2811(arg3 + Static292.anInt5663 - 12, arg4 + Static246.anInt4896 - 30);
						}
					}
					@Pc(148) Class18[] local148 = Static245.aClass18Array1;
					for (local150 = 0; local150 < local148.length; local150++) {
						@Pc(162) Class18 local162 = local148[local150];
						if (local162 != null && local162.anInt668 == 1 && local162.anInt671 == Static191.anIntArray285[local5 - Static61.anInt1336] && Static183.anInt3590 % 20 < 10) {
							if (local51.anInt5617 == -1) {
								local195 = local25.method3111() + 15;
							} else {
								local195 = local51.anInt5617 + 15;
							}
							Static144.method2280(arg5 >> 1, local25, arg0, arg2 >> 1, local195, arg1);
							if (Static292.anInt5663 > -1) {
								Static198.aClass8_Sub1_Sub7Array85[local162.anInt674].method2811(Static292.anInt5663 + arg3 - 12, Static246.anInt4896 + -28 + arg4);
							}
						}
					}
				} else {
					local243 = 30;
					@Pc(246) Class36_Sub3_Sub1 local246 = (Class36_Sub3_Sub1) local25;
					if (local246.anInt4022 != -1 || local246.anInt4026 != -1) {
						Static144.method2280(arg5 >> 1, local25, arg0, arg2 >> 1, local25.method3111() + 15, arg1);
						if (Static292.anInt5663 > -1) {
							if (local246.anInt4022 != -1) {
								Static160.aClass8_Sub1_Sub7Array69[local246.anInt4022].method2811(Static292.anInt5663 + arg3 - 12, arg4 - -Static246.anInt4896 + -30);
								local243 += 25;
							}
							if (local246.anInt4026 != -1) {
								Static184.aClass8_Sub1_Sub7Array80[local246.anInt4026].method2811(Static292.anInt5663 + arg3 - 12, arg4 + Static246.anInt4896 + -local243);
								local243 += 25;
							}
						}
					}
					if (local5 >= 0) {
						@Pc(325) Class18[] local325 = Static245.aClass18Array1;
						for (local327 = 0; local327 < local325.length; local327++) {
							@Pc(335) Class18 local335 = local325[local327];
							if (local335 != null && local335.anInt668 == 10 && Static85.anIntArray123[local5] == local335.anInt671) {
								Static144.method2280(arg5 >> 1, local25, arg0, arg2 >> 1, local25.method3111() + 15, arg1);
								if (Static292.anInt5663 > -1) {
									Static198.aClass8_Sub1_Sub7Array85[local335.anInt674].method2811(Static292.anInt5663 + arg3 - 12, -local243 + Static246.anInt4896 + arg4);
								}
							}
						}
					}
				}
				if (local25.aString146 != null && (Static61.anInt1336 <= local5 || anInt2700 == 0 || anInt2700 == 3 || anInt2700 == 1 && Static248.method3686(((Class36_Sub3_Sub1) local25).aString144))) {
					Static144.method2280(arg5 >> 1, local25, arg0, arg2 >> 1, local25.method3111(), arg1);
					if (Static292.anInt5663 > -1 && Static270.anInt5340 > Static159.anInt3250) {
						Static270.anIntArray464[Static159.anInt3250] = Static229.aClass8_Sub1_Sub5_3.method2014(local25.aString146) / 2;
						Static270.anIntArray466[Static159.anInt3250] = Static229.aClass8_Sub1_Sub5_3.anInt2515;
						Static270.anIntArray469[Static159.anInt3250] = Static292.anInt5663;
						Static270.anIntArray468[Static159.anInt3250] = Static246.anInt4896;
						Static270.anIntArray465[Static159.anInt3250] = local25.anInt4087;
						Static270.anIntArray470[Static159.anInt3250] = local25.anInt4130;
						Static270.anIntArray467[Static159.anInt3250] = local25.anInt4115;
						Static270.aStringArray77[Static159.anInt3250] = local25.aString146;
						Static159.anInt3250++;
					}
				}
				if (local25.anInt4145 > Static183.anInt3590) {
					@Pc(501) Class8_Sub1_Sub7 local501 = Static293.aClass8_Sub1_Sub7Array122[0];
					@Pc(505) Class8_Sub1_Sub7 local505 = Static293.aClass8_Sub1_Sub7Array122[1];
					if (local25 instanceof Class36_Sub3_Sub2) {
						@Pc(519) Class36_Sub3_Sub2 local519 = (Class36_Sub3_Sub2) local25;
						@Pc(529) Class8_Sub1_Sub7[] local529 = (Class8_Sub1_Sub7[]) Static66.aClass61_39.method1384((long) local519.aClass173_1.anInt5608);
						if (local529 == null) {
							local529 = Static269.method3757(local519.aClass173_1.anInt5608, Static145.aClass132_55);
							if (local529 != null) {
								Static66.aClass61_39.method1377((long) local519.aClass173_1.anInt5608, local529);
							}
						}
						if (local529 != null && local529.length == 2) {
							local505 = local529[1];
							local501 = local529[0];
						}
						@Pc(572) Class173 local572 = local519.aClass173_1;
						if (local572.anInt5617 == -1) {
							local150 = local25.method3111();
						} else {
							local150 = local572.anInt5617;
						}
					} else {
						local150 = local25.method3111();
					}
					Static144.method2280(arg5 >> 1, local25, arg0, arg2 >> 1, local501.anInt3603 + local150 + 10, arg1);
					if (Static292.anInt5663 > -1) {
						local327 = arg3 + Static292.anInt5663 - (local501.anInt3602 >> 1);
						local195 = arg4 + Static246.anInt4896 - 3;
						local501.method2811(local327, local195);
						local637 = local25.anInt4068 * local501.anInt3602 / 255;
						local640 = local501.anInt3603;
						if (Static116.aBoolean188) {
							Static126.method2001(local327, local195, local327 + local637, local195 - -local640);
						} else {
							Static103.method1673(local327, local195, local327 + local637, local195 - -local640);
						}
						local505.method2811(local327, local195);
						if (Static116.aBoolean188) {
							Static126.method1993(arg3, arg4, arg5 + arg3, arg2 + arg4);
						} else {
							Static103.method1680(arg3, arg4, arg3 + arg5, arg2 + arg4);
						}
					}
				}
				for (local243 = 0; local243 < 4; local243++) {
					if (local25.anIntArray309[local243] > Static183.anInt3590) {
						if (local25 instanceof Class36_Sub3_Sub2) {
							@Pc(711) Class36_Sub3_Sub2 local711 = (Class36_Sub3_Sub2) local25;
							@Pc(714) Class173 local714 = local711.aClass173_1;
							if (local714.anInt5617 == -1) {
								local108 = local25.method3111() / 2;
							} else {
								local108 = local714.anInt5617 / 2;
							}
						} else {
							local108 = local25.method3111() / 2;
						}
						Static144.method2280(arg5 >> 1, local25, arg0, arg2 >> 1, local108, arg1);
						if (Static292.anInt5663 > -1) {
							if (local243 == 1) {
								Static246.anInt4896 -= 20;
							}
							if (local243 == 2) {
								Static292.anInt5663 -= 15;
								Static246.anInt4896 -= 10;
							}
							if (local243 == 3) {
								Static292.anInt5663 += 15;
								Static246.anInt4896 -= 10;
							}
							Static15.aClass8_Sub1_Sub7Array10[local25.anIntArray312[local243]].method2811(arg3 + Static292.anInt5663 - 12, arg4 + -12 + Static246.anInt4896);
							Static276.aClass8_Sub1_Sub5_4.method2040(Integer.toString(local25.anIntArray311[local243]), arg3 + Static292.anInt5663 - 1, arg4 - -Static246.anInt4896 - -3, 16777215, 0);
						}
					}
				}
			}
		}
		for (local5 = 0; local5 < Static159.anInt3250; local5++) {
			local243 = Static270.anIntArray468[local5];
			local108 = Static270.anIntArray464[local5];
			@Pc(861) int local861 = Static270.anIntArray469[local5];
			local150 = Static270.anIntArray466[local5];
			@Pc(867) boolean local867 = true;
			while (local867) {
				local867 = false;
				for (local195 = 0; local195 < local5; local195++) {
					if (Static270.anIntArray468[local195] - Static270.anIntArray466[local195] < local243 - -2 && Static270.anIntArray468[local195] + 2 > local243 - local150 && local861 - local108 < Static270.anIntArray469[local195] - -Static270.anIntArray464[local195] && local861 + local108 > Static270.anIntArray469[local195] - Static270.anIntArray464[local195] && Static270.anIntArray468[local195] - Static270.anIntArray466[local195] < local243) {
						local243 = Static270.anIntArray468[local195] - Static270.anIntArray466[local195];
						local867 = true;
					}
				}
			}
			Static292.anInt5663 = Static270.anIntArray469[local5];
			Static246.anInt4896 = Static270.anIntArray468[local5] = local243;
			@Pc(974) String local974 = Static270.aStringArray77[local5];
			if (Static178.anInt3503 == 0) {
				local637 = 16776960;
				if (Static270.anIntArray465[local5] < 6) {
					local637 = Static204.anIntArray318[Static270.anIntArray465[local5]];
				}
				if (Static270.anIntArray465[local5] == 6) {
					local637 = Static207.anInt4304 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static270.anIntArray465[local5] == 7) {
					local637 = Static207.anInt4304 % 20 >= 10 ? 65535 : 255;
				}
				if (Static270.anIntArray465[local5] == 8) {
					local637 = Static207.anInt4304 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static270.anIntArray465[local5] == 9) {
					local640 = 150 - Static270.anIntArray467[local5];
					if (local640 < 50) {
						local637 = local640 * 1280 + 16711680;
					} else if (local640 < 100) {
						local637 = 16384000 + 16776960 - local640 * 327680;
					} else if (local640 < 150) {
						local637 = (local640 - 100) * 5 + 65280;
					}
				}
				if (Static270.anIntArray465[local5] == 10) {
					local640 = 150 - Static270.anIntArray467[local5];
					if (local640 < 50) {
						local637 = local640 * 5 + 16711680;
					} else if (local640 < 100) {
						local637 = 16711935 - (local640 - 50) * 327680;
					} else if (local640 < 150) {
						local637 = local640 * 327680 + 255 - (local640 - 100) * 5 - 32768000;
					}
				}
				if (Static270.anIntArray465[local5] == 11) {
					local640 = 150 - Static270.anIntArray467[local5];
					if (local640 < 50) {
						local637 = 16777215 - local640 * 327685;
					} else if (local640 < 100) {
						local637 = local640 * 327685 + 65280 - 16384250;
					} else if (local640 < 150) {
						local637 = 32768000 + 16777215 - local640 * 327680;
					}
				}
				if (Static270.anIntArray470[local5] == 0) {
					Static229.aClass8_Sub1_Sub5_3.method2040(local974, Static292.anInt5663 + arg3, Static246.anInt4896 + arg4, local637, 0);
				}
				if (Static270.anIntArray470[local5] == 1) {
					Static229.aClass8_Sub1_Sub5_3.method2033(local974, arg3 + Static292.anInt5663, Static246.anInt4896 + arg4, local637, Static207.anInt4304);
				}
				if (Static270.anIntArray470[local5] == 2) {
					Static229.aClass8_Sub1_Sub5_3.method2039(local974, arg3 + Static292.anInt5663, Static246.anInt4896 + arg4, local637, Static207.anInt4304);
				}
				if (Static270.anIntArray470[local5] == 3) {
					Static229.aClass8_Sub1_Sub5_3.method2029(local974, Static292.anInt5663 + arg3, Static246.anInt4896 + arg4, local637, Static207.anInt4304, 150 - Static270.anIntArray467[local5]);
				}
				if (Static270.anIntArray470[local5] == 4) {
					local640 = (150 - Static270.anIntArray467[local5]) * (Static229.aClass8_Sub1_Sub5_3.method2014(local974) + 100) / 150;
					if (Static116.aBoolean188) {
						Static126.method2001(Static292.anInt5663 + arg3 - 50, arg4, Static292.anInt5663 + arg3 + 50, arg2 + arg4);
					} else {
						Static103.method1673(Static292.anInt5663 + arg3 - 50, arg4, Static292.anInt5663 + arg3 + 50, arg2 + arg4);
					}
					Static229.aClass8_Sub1_Sub5_3.method2027(local974, arg3 + Static292.anInt5663 + 50 - local640, Static246.anInt4896 + arg4, local637, 0);
					if (Static116.aBoolean188) {
						Static126.method1993(arg3, arg4, arg3 + arg5, arg4 - -arg2);
					} else {
						Static103.method1680(arg3, arg4, arg3 + arg5, arg4 - -arg2);
					}
				}
				if (Static270.anIntArray470[local5] == 5) {
					local640 = 150 - Static270.anIntArray467[local5];
					if (Static116.aBoolean188) {
						Static126.method2001(arg3, Static246.anInt4896 + arg4 - Static229.aClass8_Sub1_Sub5_3.anInt2515 - 1, arg3 + arg5, Static246.anInt4896 + arg4 + 5);
					} else {
						Static103.method1673(arg3, arg4 + Static246.anInt4896 - Static229.aClass8_Sub1_Sub5_3.anInt2515 - 1, arg5 + arg3, arg4 + Static246.anInt4896 + 5);
					}
					@Pc(1463) int local1463 = 0;
					if (local640 < 25) {
						local1463 = local640 - 25;
					} else if (local640 > 125) {
						local1463 = local640 - 125;
					}
					Static229.aClass8_Sub1_Sub5_3.method2040(local974, Static292.anInt5663 + arg3, local1463 + arg4 + Static246.anInt4896, local637, 0);
					if (Static116.aBoolean188) {
						Static126.method1993(arg3, arg4, arg5 + arg3, arg2 + arg4);
					} else {
						Static103.method1680(arg3, arg4, arg3 + arg5, arg4 + arg2);
					}
				}
			} else {
				Static229.aClass8_Sub1_Sub5_3.method2040(local974, Static292.anInt5663 + arg3, Static246.anInt4896 + arg4, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
	public static void method2184() {
		if (Static137.anInt1765 > 0) {
			Static206.method3267();
		} else {
			Static256.aClass92_8 = Static95.aClass92_4;
			Static95.aClass92_4 = null;
			Static49.method774(40);
		}
	}
}
