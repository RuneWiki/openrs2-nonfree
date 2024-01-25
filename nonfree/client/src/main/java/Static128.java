import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "I")
	public static int anInt2716 = 0;

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_53 = new Class93("K", "T", "K", "K");

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIIIII)V")
	public static void method2623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		Static17.anInt391 = 0;
		@Pc(182) int local182;
		@Pc(225) int local225;
		@Pc(402) int local402;
		@Pc(514) int local514;
		@Pc(281) int local281;
		@Pc(293) int local293;
		@Pc(639) int local639;
		for (@Pc(9) int local9 = -1; local9 < Static169.anInt3463 + Static214.anInt4133; local9++) {
			@Pc(13) Class186 local13 = null;
			@Pc(20) Class62_Sub1_Sub2 local20;
			if (local9 < 0) {
				local20 = Static41.aClass62_Sub1_Sub2_Sub2_2;
			} else if (Static214.anInt4133 > local9) {
				local20 = Static129.aClass62_Sub1_Sub2_Sub2Array1[Static103.anIntArray218[local9]];
			} else {
				local20 = Static37.aClass62_Sub1_Sub2_Sub1Array1[Static98.anIntArray215[local9 - Static214.anInt4133]];
				local13 = ((Class62_Sub1_Sub2_Sub1) local20).aClass186_1;
				if (local13.anIntArray432 != null) {
					local13 = local13.method5206();
					if (local13 == null) {
						continue;
					}
				}
			}
			if (local20.anInt5330 >= 0) {
				Static146.method2864(local20.method4766(), arg3 >> 1, local20, arg1 >> 1);
				if (Static239.anIntArray366[0] >= 0) {
					if (local20.aString46 != null && (Static214.anInt4133 <= local9 || Static5.anInt4680 == 0 || Static5.anInt4680 == 3 || Static5.anInt4680 == 1 && Static340.method5862(((Class62_Sub1_Sub2_Sub2) local20).aString48)) && Static239.anInt4610 > Static17.anInt391) {
						Static239.anIntArray360[Static17.anInt391] = Static289.aClass188_8.method5318(local20.aString46) / 2;
						Static239.anIntArray363[Static17.anInt391] = Static239.anIntArray366[0];
						Static239.anIntArray358[Static17.anInt391] = Static239.anIntArray366[1];
						Static239.anIntArray362[Static17.anInt391] = local20.anInt5342;
						Static239.anIntArray361[Static17.anInt391] = local20.anInt5354;
						Static239.anIntArray359[Static17.anInt391] = local20.anInt5340;
						Static239.aStringArray40[Static17.anInt391] = local20.aString46;
						Static17.anInt391++;
					}
					@Pc(169) Class31 local169 = Static338.aClass31Array18[0];
					local182 = arg2 + Static239.anIntArray366[1] - Math.max(Static289.aClass188_8.anInt6075, local169.method4393());
					@Pc(193) Class31 local193;
					if (!local20.aBoolean482 && Static212.anInt4090 < local20.anInt5301) {
						local193 = Static338.aClass31Array18[1];
						if (local20 instanceof Class62_Sub1_Sub2_Sub1) {
							@Pc(199) Class62_Sub1_Sub2_Sub1 local199 = (Class62_Sub1_Sub2_Sub1) local20;
							@Pc(208) Class31[] local208 = (Class31[]) Static112.aClass119_75.method3311((long) local199.aClass186_1.anInt5960);
							if (local208 == null) {
								@Pc(217) Class76[] local217 = Static361.method2367(Static59.aClass191_35, local199.aClass186_1.anInt5960);
								if (local217 != null) {
									local208 = new Class31[local217.length];
									for (local225 = 0; local225 < local217.length; local225++) {
										local208[local225] = Static147.aClass4_2.method4214(local217[local225]);
									}
									Static112.aClass119_75.method3308(local208, (long) local199.aClass186_1.anInt5960);
								}
							}
							if (local208 != null && local208.length == 2) {
								local193 = local208[1];
								local169 = local208[0];
							}
						}
						local281 = arg0 + Static239.anIntArray366[0] - (local169.method4392() >> 1);
						local169.method4377(local281, local182);
						local293 = local169.method4392() * local20.anInt5334 / 255;
						if (local20.anInt5334 > 0 && local293 < 2) {
							local293 = 2;
						}
						Static147.aClass4_2.method4210(local281, local182, local293 + local281, local169.method4393() + local182);
						local193.method4377(local281, local182);
						Static147.aClass4_2.method4252(arg0, arg2, arg0 + arg1, arg2 + arg3);
					}
					local182 -= 2;
					if (!local20.aBoolean482) {
						if (local20.anInt5314 > Static212.anInt4090) {
							local193 = Static209.aClass31Array15[local20.aBoolean481 ? 2 : 0];
							@Pc(353) Class31 local353 = Static209.aClass31Array15[local20.aBoolean481 ? 3 : 1];
							if (local20 instanceof Class62_Sub1_Sub2_Sub1) {
								local293 = local13.anInt5978;
								if (local293 == -1) {
									local293 = local20.method4775().anInt5764;
								}
							} else {
								local293 = local20.method4775().anInt5764;
							}
							if (local293 != -1) {
								@Pc(387) Class31[] local387 = (Class31[]) Static50.aClass119_31.method3311((long) local293);
								if (local387 == null) {
									@Pc(394) Class76[] local394 = Static361.method2367(Static59.aClass191_35, local293);
									if (local394 != null) {
										local387 = new Class31[local394.length];
										for (local402 = 0; local402 < local394.length; local402++) {
											local387[local402] = Static147.aClass4_2.method4214(local394[local402]);
										}
										Static50.aClass119_31.method3308(local387, (long) local293);
									}
								}
								if (local387 != null && local387.length == 4) {
									local353 = local387[local20.aBoolean481 ? 3 : 1];
									local193 = local387[local20.aBoolean481 ? 2 : 0];
								}
							}
							@Pc(456) int local456 = local20.anInt5314 - Static212.anInt4090;
							if (local456 <= local20.anInt5335) {
								local225 = local193.method4392();
							} else {
								local456 -= local20.anInt5335;
								local402 = local20.anInt5359 == 0 ? 0 : local20.anInt5359 * ((local20.anInt5312 - local456) / local20.anInt5359);
								local225 = local193.method4392() * local402 / local20.anInt5312;
							}
							local402 = local193.method4393();
							local182 -= local402;
							local514 = arg0 + Static239.anIntArray366[0] - (local193.method4392() >> 1);
							local193.method4377(local514, local182);
							Static147.aClass4_2.method4210(local514, local182, local225 + local514, local402 + local182);
							local353.method4377(local514, local182);
							Static147.aClass4_2.method4252(arg0, arg2, arg0 + arg1, arg3 + arg2);
							local182 -= 2;
						}
						if (Static214.anInt4133 > local9) {
							@Pc(589) Class62_Sub1_Sub2_Sub2 local589 = (Class62_Sub1_Sub2_Sub2) local20;
							if (local589.anInt5376 != -1) {
								local182 -= 25;
								Static105.aClass31Array5[local589.anInt5376].method4377(Static239.anIntArray366[0] + arg0 - 12, local182);
								local182 -= 2;
							}
							if (local589.anInt5375 != -1) {
								local182 -= 25;
								Static144.aClass31Array9[local589.anInt5375].method4377(arg0 + Static239.anIntArray366[0] - 12, local182);
								local182 -= 2;
							}
						} else if (local13.anInt5941 >= 0 && Static144.aClass31Array9.length > local13.anInt5941) {
							local182 -= 25;
							local193 = Static144.aClass31Array9[local13.anInt5941];
							local193.method4377(arg0 + Static239.anIntArray366[0] - (local193.method4392() >> 1), local182);
							local182 -= 2;
						}
					}
					@Pc(641) Class189[] local641;
					@Pc(649) Class189 local649;
					@Pc(666) Class31 local666;
					if (!(local20 instanceof Class62_Sub1_Sub2_Sub2)) {
						local639 = 0;
						local641 = Static264.aClass189Array1;
						for (local293 = 0; local293 < local641.length; local293++) {
							local649 = local641[local293];
							if (local649 != null && local649.anInt6225 == 1 && Static98.anIntArray215[local9 - Static214.anInt4133] == local649.anInt6219) {
								local666 = Static170.aClass31Array11[local649.anInt6215];
								if (local639 < local666.method4393()) {
									local639 = local666.method4393();
								}
								if (Static212.anInt4090 % 20 < 10) {
									local666.method4377(Static239.anIntArray366[0] + arg0 - 12, local182 + -local666.method4393());
								}
							}
						}
						if (local639 > 0) {
						}
					} else if (local9 >= 0) {
						local639 = 0;
						local641 = Static264.aClass189Array1;
						for (local293 = 0; local293 < local641.length; local293++) {
							local649 = local641[local293];
							if (local649 != null && local649.anInt6225 == 10 && local649.anInt6219 == Static103.anIntArray218[local9]) {
								local666 = Static170.aClass31Array11[local649.anInt6215];
								if (local639 < local666.method4393()) {
									local639 = local666.method4393();
								}
								local666.method4377(arg0 + Static239.anIntArray366[0] - 12, -local666.method4393() + local182);
							}
						}
						if (local639 > 0) {
						}
					}
					for (local639 = 0; local639 < 4; local639++) {
						if (local20.anIntArray393[local639] > Static212.anInt4090) {
							local281 = local20.method4766() / 2;
							Static146.method2864(local281, arg3 >> 1, local20, arg1 >> 1);
							if (Static239.anIntArray366[0] > -1) {
								if (local639 == 1) {
									Static239.anIntArray366[1] -= 20;
								}
								if (local639 == 2) {
									Static239.anIntArray366[1] -= 10;
									Static239.anIntArray366[0] -= 15;
								}
								if (local639 == 3) {
									Static239.anIntArray366[0] += 15;
									Static239.anIntArray366[1] -= 10;
								}
								Static65.aClass31Array3[local20.anIntArray395[local639]].method4377(Static239.anIntArray366[0] + arg0 - 12, arg2 + Static239.anIntArray366[1] + -12);
								Static299.aClass37_5.method5263(arg2 + Static239.anIntArray366[1] + 3, -1, Integer.toString(local20.anIntArray394[local639]), arg0 + Static239.anIntArray366[0] - 1, 0);
							}
						}
					}
				}
			}
		}
		@Pc(947) int local947;
		for (@Pc(941) int local941 = 0; local941 < Static32.anInt589; local941++) {
			local947 = Static161.anIntArray276[local941];
			@Pc(954) Class62_Sub1_Sub2 local954;
			if (local947 < 2048) {
				local954 = Static129.aClass62_Sub1_Sub2_Sub2Array1[local947];
			} else {
				local954 = Static37.aClass62_Sub1_Sub2_Sub1Array1[local947 - 2048];
			}
			local639 = Static167.anIntArray286[local941];
			@Pc(975) Class62_Sub1_Sub2 local975;
			if (local639 >= 2048) {
				local975 = Static37.aClass62_Sub1_Sub2_Sub1Array1[local639 - 2048];
			} else {
				local975 = Static129.aClass62_Sub1_Sub2_Sub2Array1[local639];
			}
			Static46.method1096(arg2, local954, arg0, --local954.anInt5302, local975, arg1, arg3);
		}
		local947 = Static289.aClass188_8.anInt6080 + Static289.aClass188_8.anInt6075 + 2;
		for (local182 = 0; local182 < Static17.anInt391; local182++) {
			local639 = Static239.anIntArray363[local182];
			local281 = Static239.anIntArray358[local182];
			local293 = Static239.anIntArray360[local182];
			@Pc(1028) boolean local1028 = true;
			while (local1028) {
				local1028 = false;
				for (local225 = 0; local225 < local182; local225++) {
					if (local281 + 2 > Static239.anIntArray358[local225] - local947 && Static239.anIntArray358[local225] + 2 > -local947 + local281 && local639 - local293 < Static239.anIntArray363[local225] + Static239.anIntArray360[local225] && Static239.anIntArray363[local225] - Static239.anIntArray360[local225] < local293 + local639 && local281 > Static239.anIntArray358[local225] - local947) {
						local1028 = true;
						local281 = Static239.anIntArray358[local225] - local947;
					}
				}
			}
			Static239.anIntArray358[local182] = local281;
			@Pc(1125) String local1125 = Static239.aStringArray40[local182];
			if (Static302.anInt6072 == 0) {
				local402 = 16776960;
				if (Static239.anIntArray362[local182] < 6) {
					local402 = Static192.anIntArray302[Static239.anIntArray362[local182]];
				}
				if (Static239.anIntArray362[local182] == 6) {
					local402 = Static241.anInt4651 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static239.anIntArray362[local182] == 7) {
					local402 = Static241.anInt4651 % 20 >= 10 ? 65535 : 255;
				}
				if (Static239.anIntArray362[local182] == 8) {
					local402 = Static241.anInt4651 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static239.anIntArray362[local182] == 9) {
					local514 = 150 - Static239.anIntArray359[local182];
					if (local514 < 50) {
						local402 = local514 * 1280 + 16711680;
					} else if (local514 < 100) {
						local402 = 33160960 - local514 * 327680;
					} else if (local514 < 150) {
						local402 = local514 * 5 + 64780;
					}
				}
				if (Static239.anIntArray362[local182] == 10) {
					local514 = 150 - Static239.anIntArray359[local182];
					if (local514 < 50) {
						local402 = local514 * 5 + 16711680;
					} else if (local514 < 100) {
						local402 = 16384000 + 16711935 - local514 * 327680;
					} else if (local514 < 150) {
						local402 = local514 * 327680 - (local514 - 100) * 5 - 32767745;
					}
				}
				if (Static239.anIntArray362[local182] == 11) {
					local514 = 150 - Static239.anIntArray359[local182];
					if (local514 < 50) {
						local402 = 16777215 - local514 * 327685;
					} else if (local514 < 100) {
						local402 = local514 * 327685 - 16318970;
					} else if (local514 < 150) {
						local402 = 16777215 - (local514 - 100) * 327680;
					}
				}
				local514 = local402 | 0xFF000000;
				if (Static239.anIntArray361[local182] == 0) {
					Static56.aClass37_1.method5263(arg2 + local281, local514, local1125, local639 + arg0, -16777216);
				}
				if (Static239.anIntArray361[local182] == 1) {
					Static56.aClass37_1.method5264(arg2 + local281, Static241.anInt4651, local514, local1125, local639 + arg0);
				}
				if (Static239.anIntArray361[local182] == 2) {
					Static56.aClass37_1.method5246(local1125, local514, local639 + arg0, Static241.anInt4651, arg2 + local281);
				}
				if (Static239.anIntArray361[local182] == 3) {
					Static56.aClass37_1.method5249(local1125, 150 - Static239.anIntArray359[local182], local514, arg2 + local281, local639 + arg0, Static241.anInt4651);
				}
				@Pc(1454) int local1454;
				if (Static239.anIntArray361[local182] == 4) {
					local1454 = (150 - Static239.anIntArray359[local182]) * (Static289.aClass188_8.method5318(local1125) + 100) / 150;
					Static147.aClass4_2.method4210(arg0 + local639 - 50, arg2, local639 + arg0 + 50, arg3 + arg2);
					Static56.aClass37_1.method5254(-16777216, local639 + arg0 + 50 - local1454, local514, local1125, local281 + arg2);
					Static147.aClass4_2.method4252(arg0, arg2, arg0 + arg1, arg3 + arg2);
				}
				if (Static239.anIntArray361[local182] == 5) {
					local1454 = 150 - Static239.anIntArray359[local182];
					@Pc(1512) int local1512 = 0;
					if (local1454 < 25) {
						local1512 = local1454 - 25;
					} else if (local1454 > 125) {
						local1512 = local1454 - 125;
					}
					@Pc(1535) int local1535 = Static289.aClass188_8.anInt6075 + Static289.aClass188_8.anInt6080;
					Static147.aClass4_2.method4210(arg0, local281 + arg2 - local1535 - 1, arg0 - -arg1, arg2 + local281 + 5);
					Static56.aClass37_1.method5263(arg2 + local281 + local1512, local514, local1125, arg0 + local639, -16777216);
					Static147.aClass4_2.method4252(arg0, arg2, arg1 + arg0, arg3 + arg2);
				}
			} else {
				Static56.aClass37_1.method5263(arg2 + local281, -256, local1125, arg0 + local639, -16777216);
			}
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)V")
	public static void method2625() {
		if (Static27.anInt6651 != -1) {
			Static170.method2883(Static27.anInt6651, -1, -1, false);
			Static27.anInt6651 = -1;
		}
	}
}
