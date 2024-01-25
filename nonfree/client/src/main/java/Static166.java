import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "Lclient!o;")
	public static Class14_Sub2_Sub14 aClass14_Sub2_Sub14_1;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString124 = "";

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
	public static void method3292() {
		@Pc(1) Class11 local1 = Static277.aClass11_121;
		synchronized (Static277.aClass11_121) {
			Static277.aClass11_121.method213();
		}
		local1 = Static191.aClass11_86;
		synchronized (Static191.aClass11_86) {
			Static191.aClass11_86.method213();
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIIII)V")
	public static void method3293(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		Static135.anInt2874 = 0;
		@Pc(179) int local179;
		@Pc(222) int local222;
		@Pc(389) int local389;
		@Pc(503) int local503;
		@Pc(273) int local273;
		@Pc(615) int local615;
		@Pc(443) int local443;
		for (@Pc(9) int local9 = -1; local9 < Static315.anInt6456 + Static307.anInt2887; local9++) {
			@Pc(13) Class192 local13 = null;
			@Pc(17) Class10_Sub3_Sub3 local17;
			if (local9 < 0) {
				local17 = Static173.aClass10_Sub3_Sub3_Sub2_1;
			} else if (local9 >= Static307.anInt2887) {
				local17 = Static266.aClass10_Sub3_Sub3_Sub1Array1[Static98.anIntArray205[local9 - Static307.anInt2887]];
				local13 = ((Class10_Sub3_Sub3_Sub1) local17).aClass192_1;
				if (local13.anIntArray525 != null) {
					local13 = local13.method5281();
					if (local13 == null) {
						continue;
					}
				}
			} else {
				local17 = Static29.aClass10_Sub3_Sub3_Sub2Array3[Static213.anIntArray380[local9]];
			}
			if (local17.anInt5950 >= 0) {
				Static292.method5001(local17, arg0 >> 1, arg1 >> 1, local17.method5356());
				if (Static316.anIntArray309[0] >= 0) {
					if (local17.aString223 != null && (local9 >= Static307.anInt2887 || Static281.anInt5357 == 0 || Static281.anInt5357 == 3 || Static281.anInt5357 == 1 && Static81.method2017(((Class10_Sub3_Sub3_Sub2) local17).aString224)) && Static345.anInt6586 > Static135.anInt2874) {
						Static345.anIntArray631[Static135.anInt2874] = Static223.aClass76_9.method2256(local17.aString223) / 2;
						Static345.anIntArray636[Static135.anInt2874] = Static316.anIntArray309[0];
						Static345.anIntArray630[Static135.anInt2874] = Static316.anIntArray309[1];
						Static345.anIntArray634[Static135.anInt2874] = local17.anInt5946;
						Static345.anIntArray633[Static135.anInt2874] = local17.anInt5942;
						Static345.anIntArray632[Static135.anInt2874] = local17.anInt5934;
						Static345.aStringArray75[Static135.anInt2874] = local17.aString223;
						Static135.anInt2874++;
					}
					@Pc(166) Class2 local166 = Static134.aClass2Array8[0];
					local179 = arg2 + Static316.anIntArray309[1] - Math.max(Static223.aClass76_9.anInt2285, local166.method2640());
					@Pc(190) Class2 local190;
					@Pc(285) int local285;
					if (!local17.aBoolean413 && Static153.anInt3257 < local17.anInt5949) {
						local190 = Static134.aClass2Array8[1];
						if (local17 instanceof Class10_Sub3_Sub3_Sub1) {
							@Pc(196) Class10_Sub3_Sub3_Sub1 local196 = (Class10_Sub3_Sub3_Sub1) local17;
							@Pc(205) Class2[] local205 = (Class2[]) Static124.aClass11_61.method209((long) local196.aClass192_1.anInt5796);
							if (local205 == null) {
								@Pc(214) Class207[] local214 = Static368.method5805(Static348.aClass143_98, local196.aClass192_1.anInt5796);
								if (local214 != null) {
									local205 = new Class2[local214.length];
									for (local222 = 0; local222 < local214.length; local222++) {
										local205[local222] = Static218.aClass46_5.method5157(local214[local222]);
									}
									Static124.aClass11_61.method219((long) local196.aClass192_1.anInt5796, local205);
								}
							}
							if (local205 != null && local205.length == 2) {
								local190 = local205[1];
								local166 = local205[0];
							}
						}
						local273 = arg3 + Static316.anIntArray309[0] - (local166.method2639() >> 1);
						local166.method2642(local273, local179);
						local285 = local166.method2639() * local17.anInt5967 / 255;
						Static218.aClass46_5.method5107(local273, local179, local273 + local285, local166.method2640() + local179);
						local190.method2642(local273, local179);
						Static218.aClass46_5.method5172(arg3, arg2, arg3 + arg0, arg1 + arg2);
					}
					local179 -= 2;
					if (!local17.aBoolean413) {
						if (local17.anInt5912 > Static153.anInt3257) {
							local190 = Static36.aClass2Array4[local17.aBoolean416 ? 2 : 0];
							@Pc(340) Class2 local340 = Static36.aClass2Array4[local17.aBoolean416 ? 3 : 1];
							if (local17 instanceof Class10_Sub3_Sub3_Sub1) {
								local285 = local13.anInt5788;
								if (local285 == -1) {
									local285 = local17.method5364().anInt3752;
								}
							} else {
								local285 = local17.method5364().anInt3752;
							}
							if (local285 != -1) {
								@Pc(374) Class2[] local374 = (Class2[]) Static321.aClass11_136.method209((long) local285);
								if (local374 == null) {
									@Pc(381) Class207[] local381 = Static368.method5805(Static348.aClass143_98, local285);
									if (local381 != null) {
										local374 = new Class2[local381.length];
										for (local389 = 0; local389 < local381.length; local389++) {
											local374[local389] = Static218.aClass46_5.method5157(local381[local389]);
										}
										Static321.aClass11_136.method219((long) local285, local374);
									}
								}
								if (local374 != null && local374.length == 4) {
									local340 = local374[local17.aBoolean416 ? 3 : 1];
									local190 = local374[local17.aBoolean416 ? 2 : 0];
								}
							}
							local443 = local17.anInt5912 - Static153.anInt3257;
							if (local443 <= local17.anInt5914) {
								local222 = local190.method2639();
							} else {
								local443 -= local17.anInt5914;
								local389 = local17.anInt5943 == 0 ? 0 : local17.anInt5943 * ((local17.anInt5970 - local443) / local17.anInt5943);
								local222 = local190.method2639() * local389 / local17.anInt5970;
							}
							local389 = local190.method2640();
							local179 -= local389;
							local503 = Static316.anIntArray309[0] + arg3 - (local190.method2639() >> 1);
							local190.method2642(local503, local179);
							Static218.aClass46_5.method5107(local503, local179, local503 + local222, local179 - -local389);
							local340.method2642(local503, local179);
							Static218.aClass46_5.method5172(arg3, arg2, arg3 + arg0, arg1 + arg2);
							local179 -= 2;
						}
						if (local9 < Static307.anInt2887) {
							@Pc(539) Class10_Sub3_Sub3_Sub2 local539 = (Class10_Sub3_Sub3_Sub2) local17;
							if (local539.anInt6016 != -1) {
								local179 -= 25;
								Static334.aClass2Array16[local539.anInt6016].method2642(arg3 + Static316.anIntArray309[0] - 12, local179);
								local179 -= 2;
							}
							if (local539.anInt6012 != -1) {
								local179 -= 25;
								Static5.aClass2Array13[local539.anInt6012].method2642(Static316.anIntArray309[0] + arg3 - 12, local179);
								local179 -= 2;
							}
						} else if (local13.anInt5794 >= 0 && Static5.aClass2Array13.length > local13.anInt5794) {
							local190 = Static5.aClass2Array13[local13.anInt5794];
							local179 -= 25;
							local190.method2642(Static316.anIntArray309[0] + arg3 - (local190.method2639() >> 1), local179);
							local179 -= 2;
						}
					}
					@Pc(617) Class113[] local617;
					@Pc(625) Class113 local625;
					@Pc(644) Class2 local644;
					if (!(local17 instanceof Class10_Sub3_Sub3_Sub2)) {
						local615 = 0;
						local617 = Static27.aClass113Array1;
						for (local285 = 0; local285 < local617.length; local285++) {
							local625 = local617[local285];
							if (local625 != null && local625.anInt3406 == 1 && Static98.anIntArray205[local9 - Static307.anInt2887] == local625.anInt3403) {
								local644 = Static257.aClass2Array12[local625.anInt3414];
								if (local615 < local644.method2640()) {
									local615 = local644.method2640();
								}
								if (Static153.anInt3257 % 20 < 10) {
									local644.method2642(Static316.anIntArray309[0] + arg3 - 12, -local644.method2640() + local179);
								}
							}
						}
						if (local615 > 0) {
						}
					} else if (local9 >= 0) {
						local615 = 0;
						local617 = Static27.aClass113Array1;
						for (local285 = 0; local285 < local617.length; local285++) {
							local625 = local617[local285];
							if (local625 != null && local625.anInt3406 == 10 && Static213.anIntArray380[local9] == local625.anInt3403) {
								local644 = Static257.aClass2Array12[local625.anInt3414];
								if (local644.method2640() > local615) {
									local615 = local644.method2640();
								}
								local644.method2642(Static316.anIntArray309[0] + arg3 - 12, local179 + -local644.method2640());
							}
						}
						if (local615 > 0) {
						}
					}
					for (local615 = 0; local615 < 4; local615++) {
						if (local17.lb[local615] > Static153.anInt3257) {
							local273 = local17.method5356() / 2;
							Static292.method5001(local17, arg0 >> 1, arg1 >> 1, local273);
							if (Static316.anIntArray309[0] > -1) {
								if (local615 == 1) {
									Static316.anIntArray309[1] -= 20;
								}
								if (local615 == 2) {
									Static316.anIntArray309[0] -= 15;
									Static316.anIntArray309[1] -= 10;
								}
								if (local615 == 3) {
									Static316.anIntArray309[0] += 15;
									Static316.anIntArray309[1] -= 10;
								}
								Static103.aClass2Array7[local17.anIntArray533[local615]].method2642(arg3 + Static316.anIntArray309[0] - 12, arg2 + Static316.anIntArray309[1] + -12);
								Static170.aClass30_6.method5584(Integer.toString(local17.anIntArray534[local615]), 0, Static316.anIntArray309[1] + arg2 + 3, Static316.anIntArray309[0] + arg3 + -1, -1);
							}
						}
					}
				}
			}
		}
		@Pc(911) int local911;
		for (@Pc(905) int local905 = 0; local905 < Static282.anInt5372; local905++) {
			local911 = Static285.anIntArray493[local905];
			@Pc(920) Class10_Sub3_Sub3 local920;
			if (local911 < 2048) {
				local920 = Static29.aClass10_Sub3_Sub3_Sub2Array3[local911];
			} else {
				local920 = Static266.aClass10_Sub3_Sub3_Sub1Array1[local911 - 2048];
			}
			local179 = Static179.anIntArray318[local905];
			@Pc(941) Class10_Sub3_Sub3 local941;
			if (local179 < 2048) {
				local941 = Static29.aClass10_Sub3_Sub3_Sub2Array3[local179];
			} else {
				local941 = Static266.aClass10_Sub3_Sub3_Sub1Array1[local179 - 2048];
			}
			Static346.method5898(arg0, arg2, --local920.anInt5923, local941, arg3, local920, arg1);
		}
		local911 = Static223.aClass76_9.anInt2285 + Static223.aClass76_9.anInt2286 + 2;
		for (@Pc(984) int local984 = 0; local984 < Static135.anInt2874; local984++) {
			local179 = Static345.anIntArray636[local984];
			local615 = Static345.anIntArray630[local984];
			local273 = Static345.anIntArray631[local984];
			@Pc(1000) boolean local1000 = true;
			while (local1000) {
				local1000 = false;
				for (local443 = 0; local443 < local984; local443++) {
					if (local615 + 2 > -local911 + Static345.anIntArray630[local443] && Static345.anIntArray630[local443] + 2 > -local911 + local615 && local179 - local273 < Static345.anIntArray636[local443] - -Static345.anIntArray631[local443] && local179 + local273 > Static345.anIntArray636[local443] - Static345.anIntArray631[local443] && local615 > Static345.anIntArray630[local443] - local911) {
						local615 = Static345.anIntArray630[local443] - local911;
						local1000 = true;
					}
				}
			}
			Static345.anIntArray630[local984] = local615;
			@Pc(1094) String local1094 = Static345.aStringArray75[local984];
			if (Static270.anInt5160 == 0) {
				local222 = 16776960;
				if (Static345.anIntArray634[local984] < 6) {
					local222 = Static50.anIntArray76[Static345.anIntArray634[local984]];
				}
				if (Static345.anIntArray634[local984] == 6) {
					local222 = Static295.anInt5671 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static345.anIntArray634[local984] == 7) {
					local222 = Static295.anInt5671 % 20 < 10 ? 255 : 65535;
				}
				if (Static345.anIntArray634[local984] == 8) {
					local222 = Static295.anInt5671 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static345.anIntArray634[local984] == 9) {
					local389 = 150 - Static345.anIntArray632[local984];
					if (local389 < 50) {
						local222 = local389 * 1280 + 16711680;
					} else if (local389 < 100) {
						local222 = 16776960 - (local389 - 50) * 327680;
					} else if (local389 < 150) {
						local222 = local389 * 5 + 64780;
					}
				}
				if (Static345.anIntArray634[local984] == 10) {
					local389 = 150 - Static345.anIntArray632[local984];
					if (local389 < 50) {
						local222 = local389 * 5 + 16711680;
					} else if (local389 < 100) {
						local222 = 33095935 - local389 * 327680;
					} else if (local389 < 150) {
						local222 = (local389 - 100) * 327680 + 255 - (local389 - 100) * 5;
					}
				}
				if (Static345.anIntArray634[local984] == 11) {
					local389 = 150 - Static345.anIntArray632[local984];
					if (local389 < 50) {
						local222 = 16777215 - local389 * 327685;
					} else if (local389 < 100) {
						local222 = local389 * 327685 - 16318970;
					} else if (local389 < 150) {
						local222 = 16777215 - (local389 - 100) * 327680;
					}
				}
				local389 = local222 | 0xFF000000;
				if (Static345.anIntArray633[local984] == 0) {
					Static164.aClass30_5.method5584(local1094, -16777216, local615 + arg2, arg3 + local179, local389);
				}
				if (Static345.anIntArray633[local984] == 1) {
					Static164.aClass30_5.method5580(Static295.anInt5671, local1094, local389, local179 + arg3, local615 + arg2);
				}
				if (Static345.anIntArray633[local984] == 2) {
					Static164.aClass30_5.method5588(arg2 + local615, local1094, Static295.anInt5671, arg3 + local179, local389);
				}
				if (Static345.anIntArray633[local984] == 3) {
					Static164.aClass30_5.method5585(local1094, local389, arg2 + local615, Static295.anInt5671, 150 - Static345.anIntArray632[local984], local179 + arg3);
				}
				if (Static345.anIntArray633[local984] == 4) {
					local503 = (150 - Static345.anIntArray632[local984]) * (Static223.aClass76_9.method2256(local1094) + 100) / 150;
					Static218.aClass46_5.method5107(arg3 + local179 - 50, arg2, arg3 + local179 + 50, arg2 + arg1);
					Static164.aClass30_5.method5572(arg3 + local179 + 50 - local503, -16777216, local389, arg2 + local615, local1094);
					Static218.aClass46_5.method5172(arg3, arg2, arg0 + arg3, arg1 + arg2);
				}
				if (Static345.anIntArray633[local984] == 5) {
					local503 = 150 - Static345.anIntArray632[local984];
					@Pc(1483) int local1483 = 0;
					if (local503 < 25) {
						local1483 = local503 - 25;
					} else if (local503 > 125) {
						local1483 = local503 - 125;
					}
					@Pc(1507) int local1507 = Static223.aClass76_9.anInt2286 + Static223.aClass76_9.anInt2285;
					Static218.aClass46_5.method5107(arg3, local615 + arg2 - local1507 - 1, arg3 + arg0, arg2 + local615 + 5);
					Static164.aClass30_5.method5584(local1094, -16777216, arg2 + local615 + local1483, local179 + arg3, local389);
					Static218.aClass46_5.method5172(arg3, arg2, arg3 + arg0, arg1 + arg2);
				}
			} else {
				Static164.aClass30_5.method5584(local1094, -16777216, arg2 + local615, local179 + arg3, -256);
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BLclient!ne;)V")
	public static void method3295(@OriginalArg(1) Class146 arg0) {
		if (arg0.anInt4167 == Static331.anInt6394) {
			Static338.aBooleanArray29[arg0.anInt4171] = true;
		}
	}
}
