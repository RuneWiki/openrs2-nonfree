import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!jc", name = "db", descriptor = "Lclient!dp;")
	public static Class53 aClass53_82;

	@OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
	public static int anInt2603 = 1;

	@OriginalMember(owner = "client!jc", name = "ab", descriptor = "[I")
	private static final int[] anIntArray336 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!jc", name = "eb", descriptor = "[C")
	public static final char[] aCharArray2 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIII)V")
	public static void method2739(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static334.anInt6116 = 0;
		@Pc(179) int local179;
		@Pc(222) int local222;
		@Pc(391) int local391;
		@Pc(503) int local503;
		@Pc(273) int local273;
		@Pc(622) int local622;
		@Pc(443) int local443;
		for (@Pc(9) int local9 = -1; local9 < Static200.anInt3712 + Static149.anInt2759; local9++) {
			@Pc(13) Class18 local13 = null;
			@Pc(28) Class44_Sub4_Sub4 local28;
			if (local9 < 0) {
				local28 = Static253.aClass44_Sub4_Sub4_Sub1_1;
			} else if (local9 < Static200.anInt3712) {
				local28 = Static343.aClass44_Sub4_Sub4_Sub1Array1[Static183.anIntArray400[local9]];
			} else {
				local28 = Static239.aClass44_Sub4_Sub4_Sub2Array8[Static191.anIntArray428[local9 - Static200.anInt3712]];
				local13 = ((Class44_Sub4_Sub4_Sub2) local28).aClass18_1;
				if (local13.anIntArray37 != null) {
					local13 = local13.method369();
					if (local13 == null) {
						continue;
					}
				}
			}
			if (local28.anInt5151 >= 0) {
				Static91.method3107(local28.method4713(), arg1 >> 1, arg3 >> 1, local28);
				if (Static158.anIntArray632[0] >= 0) {
					if (local28.aString219 != null && (Static200.anInt3712 <= local9 || Static52.anInt1004 == 0 || Static52.anInt1004 == 3 || Static52.anInt1004 == 1 && Static61.method995(((Class44_Sub4_Sub4_Sub1) local28).aString207)) && Static334.anInt6116 < Static39.anInt756) {
						Static39.anIntArray93[Static334.anInt6116] = Static220.aClass26_6.method508(local28.aString219) / 2;
						Static39.anIntArray95[Static334.anInt6116] = Static158.anIntArray632[0];
						Static39.anIntArray90[Static334.anInt6116] = Static158.anIntArray632[1];
						Static39.anIntArray91[Static334.anInt6116] = local28.anInt5123;
						Static39.anIntArray92[Static334.anInt6116] = local28.anInt5125;
						Static39.anIntArray96[Static334.anInt6116] = local28.anInt5106;
						Static39.aStringArray4[Static334.anInt6116] = local28.aString219;
						Static334.anInt6116++;
					}
					@Pc(167) Class40 local167 = Static77.aClass40Array14[0];
					local179 = Static158.anIntArray632[1] + arg0 - Math.max(Static220.aClass26_6.anInt604, local167.method5075());
					@Pc(190) Class40 local190;
					@Pc(285) int local285;
					if (!local28.aBoolean359 && Static76.anInt2853 < local28.anInt5136) {
						local190 = Static77.aClass40Array14[1];
						if (local28 instanceof Class44_Sub4_Sub4_Sub2) {
							@Pc(196) Class44_Sub4_Sub4_Sub2 local196 = (Class44_Sub4_Sub4_Sub2) local28;
							@Pc(205) Class40[] local205 = (Class40[]) Static132.aClass70_43.method1396((long) local196.aClass18_1.anInt391);
							if (local205 == null) {
								@Pc(214) Class88[] local214 = Static363.method2249(Static269.aClass53_124, local196.aClass18_1.anInt391);
								if (local214 != null) {
									local205 = new Class40[local214.length];
									for (local222 = 0; local222 < local214.length; local222++) {
										local205[local222] = Static289.aClass81_7.method3015(local214[local222]);
									}
									Static132.aClass70_43.method1406(local205, (long) local196.aClass18_1.anInt391);
								}
							}
							if (local205 != null && local205.length == 2) {
								local190 = local205[1];
								local167 = local205[0];
							}
						}
						local273 = arg2 + Static158.anIntArray632[0] - (local167.method5071() >> 1);
						local167.method5077(local273, local179);
						local285 = local167.method5071() * local28.anInt5137 / 255;
						Static289.aClass81_7.method2953(local273, local179, local285 + local273, local167.method5075() + local179);
						local190.method5077(local273, local179);
						Static289.aClass81_7.method3033(arg2, arg0, arg2 + arg1, arg3 + arg0);
					}
					local179 -= 2;
					if (!local28.aBoolean359) {
						if (Static76.anInt2853 < local28.anInt5093) {
							local190 = Static352.aClass40Array44[local28.aBoolean356 ? 2 : 0];
							@Pc(341) Class40 local341 = Static352.aClass40Array44[local28.aBoolean356 ? 3 : 1];
							if (local28 instanceof Class44_Sub4_Sub4_Sub2) {
								local285 = local13.anInt424;
								if (local285 == -1) {
									local285 = local28.method4716().anInt3407;
								}
							} else {
								local285 = local28.method4716().anInt3407;
							}
							if (local285 != -1) {
								@Pc(376) Class40[] local376 = (Class40[]) Static226.aClass70_75.method1396((long) local285);
								if (local376 == null) {
									@Pc(383) Class88[] local383 = Static363.method2249(Static269.aClass53_124, local285);
									if (local383 != null) {
										local376 = new Class40[local383.length];
										for (local391 = 0; local391 < local383.length; local391++) {
											local376[local391] = Static289.aClass81_7.method3015(local383[local391]);
										}
										Static226.aClass70_75.method1406(local376, (long) local285);
									}
								}
								if (local376 != null && local376.length == 4) {
									local190 = local376[local28.aBoolean356 ? 2 : 0];
									local341 = local376[local28.aBoolean356 ? 3 : 1];
								}
							}
							local443 = local28.anInt5093 - Static76.anInt2853;
							if (local28.anInt5113 < local443) {
								local443 -= local28.anInt5113;
								local391 = local28.anInt5124 == 0 ? 0 : (local28.anInt5085 - local443) / local28.anInt5124 * local28.anInt5124;
								local222 = local190.method5071() * local391 / local28.anInt5085;
							} else {
								local222 = local190.method5071();
							}
							local391 = local190.method5075();
							local179 -= local391;
							local503 = Static158.anIntArray632[0] + arg2 - (local190.method5071() >> 1);
							local190.method5077(local503, local179);
							Static289.aClass81_7.method2953(local503, local179, local222 + local503, local391 + local179);
							local341.method5077(local503, local179);
							Static289.aClass81_7.method3033(arg2, arg0, arg1 + arg2, arg0 - -arg3);
							local179 -= 2;
						}
						if (Static200.anInt3712 > local9) {
							@Pc(539) Class44_Sub4_Sub4_Sub1 local539 = (Class44_Sub4_Sub4_Sub1) local28;
							if (local539.anInt4892 != -1) {
								local179 -= 25;
								Static85.aClass40Array15[local539.anInt4892].method5077(arg2 + Static158.anIntArray632[0] - 12, local179);
								local179 -= 2;
							}
							if (local539.anInt4897 != -1) {
								local179 -= 25;
								Static33.aClass40Array5[local539.anInt4897].method5077(Static158.anIntArray632[0] + arg2 - 12, local179);
								local179 -= 2;
							}
						} else if (local13.anInt403 >= 0 && local13.anInt403 < Static33.aClass40Array5.length) {
							local190 = Static33.aClass40Array5[local13.anInt403];
							local179 -= 25;
							local190.method5077(Static158.anIntArray632[0] + arg2 - (local190.method5071() >> 1), local179);
							local179 -= 2;
						}
					}
					@Pc(624) Class154[] local624;
					@Pc(632) Class154 local632;
					@Pc(651) Class40 local651;
					if (!(local28 instanceof Class44_Sub4_Sub4_Sub1)) {
						local622 = 0;
						local624 = Static330.aClass154Array1;
						for (local285 = 0; local285 < local624.length; local285++) {
							local632 = local624[local285];
							if (local632 != null && local632.anInt4211 == 1 && Static191.anIntArray428[local9 - Static200.anInt3712] == local632.anInt4206) {
								local651 = Static94.aClass40Array16[local632.anInt4219];
								if (local622 < local651.method5075()) {
									local622 = local651.method5075();
								}
								if (Static76.anInt2853 % 20 < 10) {
									local651.method5077(Static158.anIntArray632[0] + arg2 - 12, local179 - local651.method5075());
								}
							}
						}
						if (local622 > 0) {
						}
					} else if (local9 >= 0) {
						local622 = 0;
						local624 = Static330.aClass154Array1;
						for (local285 = 0; local285 < local624.length; local285++) {
							local632 = local624[local285];
							if (local632 != null && local632.anInt4211 == 10 && local632.anInt4206 == Static183.anIntArray400[local9]) {
								local651 = Static94.aClass40Array16[local632.anInt4219];
								if (local651.method5075() > local622) {
									local622 = local651.method5075();
								}
								local651.method5077(arg2 + Static158.anIntArray632[0] - 12, local179 - local651.method5075());
							}
						}
						if (local622 > 0) {
						}
					}
					for (local622 = 0; local622 < 4; local622++) {
						if (local28.anIntArray557[local622] > Static76.anInt2853) {
							local273 = local28.method4713() / 2;
							Static91.method3107(local273, arg1 >> 1, arg3 >> 1, local28);
							if (Static158.anIntArray632[0] > -1) {
								if (local622 == 1) {
									Static158.anIntArray632[1] -= 20;
								}
								if (local622 == 2) {
									Static158.anIntArray632[1] -= 10;
									Static158.anIntArray632[0] -= 15;
								}
								if (local622 == 3) {
									Static158.anIntArray632[0] += 15;
									Static158.anIntArray632[1] -= 10;
								}
								Static204.aClass40Array27[local28.anIntArray558[local622]].method5077(Static158.anIntArray632[0] + arg2 - 12, arg0 + -12 - -Static158.anIntArray632[1]);
								Static350.aClass30_6.method5333(-1, arg2 + Static158.anIntArray632[0] - 1, Integer.toString(local28.anIntArray559[local622]), 0, arg0 + Static158.anIntArray632[1] + 3);
							}
						}
					}
				}
			}
		}
		@Pc(921) int local921;
		for (@Pc(915) int local915 = 0; local915 < Static40.anInt760; local915++) {
			local921 = Static215.anIntArray461[local915];
			@Pc(930) Class44_Sub4_Sub4 local930;
			if (local921 < 2048) {
				local930 = Static343.aClass44_Sub4_Sub4_Sub1Array1[local921];
			} else {
				local930 = Static239.aClass44_Sub4_Sub4_Sub2Array8[local921 - 2048];
			}
			local179 = Static14.anIntArray25[local915];
			@Pc(951) Class44_Sub4_Sub4 local951;
			if (local179 >= 2048) {
				local951 = Static239.aClass44_Sub4_Sub4_Sub2Array8[local179 - 2048];
			} else {
				local951 = Static343.aClass44_Sub4_Sub4_Sub1Array1[local179];
			}
			Static249.method4315(arg1, arg2, arg3, local930, --local930.anInt5132, arg0, local951);
		}
		local921 = Static220.aClass26_6.anInt608 + Static220.aClass26_6.anInt604 + 2;
		for (@Pc(992) int local992 = 0; local992 < Static334.anInt6116; local992++) {
			local179 = Static39.anIntArray95[local992];
			local622 = Static39.anIntArray90[local992];
			local273 = Static39.anIntArray93[local992];
			@Pc(1008) boolean local1008 = true;
			while (local1008) {
				local1008 = false;
				for (local443 = 0; local443 < local992; local443++) {
					if (local622 + 2 > -local921 + Static39.anIntArray90[local443] && Static39.anIntArray90[local443] + 2 > -local921 + local622 && local179 - local273 < Static39.anIntArray93[local443] + Static39.anIntArray95[local443] && local273 + local179 > Static39.anIntArray95[local443] + -Static39.anIntArray93[local443] && local622 > Static39.anIntArray90[local443] - local921) {
						local622 = Static39.anIntArray90[local443] - local921;
						local1008 = true;
					}
				}
			}
			Static39.anIntArray90[local992] = local622;
			@Pc(1098) String local1098 = Static39.aStringArray4[local992];
			if (Static133.anInt2444 == 0) {
				local222 = 16776960;
				if (Static39.anIntArray91[local992] < 6) {
					local222 = anIntArray336[Static39.anIntArray91[local992]];
				}
				if (Static39.anIntArray91[local992] == 6) {
					local222 = Static138.anInt4577 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static39.anIntArray91[local992] == 7) {
					local222 = Static138.anInt4577 % 20 >= 10 ? 65535 : 255;
				}
				if (Static39.anIntArray91[local992] == 8) {
					local222 = Static138.anInt4577 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static39.anIntArray91[local992] == 9) {
					local391 = 150 - Static39.anIntArray96[local992];
					if (local391 < 50) {
						local222 = local391 * 1280 + 16711680;
					} else if (local391 < 100) {
						local222 = 16776960 - (local391 - 50) * 327680;
					} else if (local391 < 150) {
						local222 = local391 * 5 + 64780;
					}
				}
				if (Static39.anIntArray91[local992] == 10) {
					local391 = 150 - Static39.anIntArray96[local992];
					if (local391 < 50) {
						local222 = local391 * 5 + 16711680;
					} else if (local391 < 100) {
						local222 = 16711935 - (local391 - 50) * 327680;
					} else if (local391 < 150) {
						local222 = (local391 - 100) * 327680 + 255 - (local391 - 100) * 5;
					}
				}
				if (Static39.anIntArray91[local992] == 11) {
					local391 = 150 - Static39.anIntArray96[local992];
					if (local391 < 50) {
						local222 = 16777215 - local391 * 327685;
					} else if (local391 < 100) {
						local222 = (local391 - 50) * 327685 + 65280;
					} else if (local391 < 150) {
						local222 = 16777215 - (local391 - 100) * 327680;
					}
				}
				local391 = local222 | 0xFF000000;
				if (Static39.anIntArray92[local992] == 0) {
					Static309.aClass30_5.method5333(local391, arg2 + local179, local1098, -16777216, local622 + arg0);
				}
				if (Static39.anIntArray92[local992] == 1) {
					Static309.aClass30_5.method5329(local1098, Static138.anInt4577, arg0 + local622, arg2 + local179, local391);
				}
				if (Static39.anIntArray92[local992] == 2) {
					Static309.aClass30_5.method5334(local391, local1098, local622 + arg0, local179 + arg2, Static138.anInt4577);
				}
				if (Static39.anIntArray92[local992] == 3) {
					Static309.aClass30_5.method5332(local391, arg2 + local179, Static138.anInt4577, local1098, 150 - Static39.anIntArray96[local992], arg0 + local622);
				}
				if (Static39.anIntArray92[local992] == 4) {
					local503 = (150 - Static39.anIntArray96[local992]) * (Static220.aClass26_6.method508(local1098) + 100) / 150;
					Static289.aClass81_7.method2953(local179 + arg2 - 50, arg0, local179 + arg2 + 50, arg0 + arg3);
					Static309.aClass30_5.method5340(local622 + arg0, local391, -16777216, local1098, local179 + arg2 + 50 - local503);
					Static289.aClass81_7.method3033(arg2, arg0, arg2 + arg1, arg3 + arg0);
				}
				if (Static39.anIntArray92[local992] == 5) {
					local503 = 150 - Static39.anIntArray96[local992];
					@Pc(1502) int local1502 = 0;
					if (local503 < 25) {
						local1502 = local503 - 25;
					} else if (local503 > 125) {
						local1502 = local503 - 125;
					}
					@Pc(1526) int local1526 = Static220.aClass26_6.anInt608 + Static220.aClass26_6.anInt604;
					Static289.aClass81_7.method2953(arg2, local622 + arg0 - local1526 - 1, arg1 + arg2, local622 + arg0 + 5);
					Static309.aClass30_5.method5333(local391, arg2 + local179, local1098, -16777216, arg0 + local622 + local1502);
					Static289.aClass81_7.method3033(arg2, arg0, arg2 + arg1, arg0 - -arg3);
				}
			} else {
				Static309.aClass30_5.method5333(-256, arg2 + local179, local1098, -16777216, arg0 + local622);
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(II)V")
	public static void method2740(@OriginalArg(1) int arg0) {
		Static203.method3670();
		Static200.method3639();
		@Pc(12) int local12 = Static324.method5381(arg0).anInt2267;
		if (local12 == 0) {
			return;
		}
		@Pc(25) int local25 = Static41.anIntArray721[arg0];
		if (local12 == 5) {
			Static118.anInt2251 = local25;
		}
		if (local12 == 6) {
			Static133.anInt2444 = local25;
		}
		if (local12 == 9) {
			Static219.anInt4049 = local25;
		}
	}
}
