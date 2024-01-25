import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!tfa", name = "R", descriptor = "I")
	public static int anInt8854;

	@OriginalMember(owner = "client!tfa", name = "T", descriptor = "[Lclient!jr;")
	public static Class164[] aClass164Array1;

	@OriginalMember(owner = "client!tfa", name = "N", descriptor = "Lclient!ac;")
	public static final Class5 aClass5_9 = new Class5("LOCAL", 4);

	@OriginalMember(owner = "client!tfa", name = "Q", descriptor = "I")
	public static final int anInt8853 = 1405;

	@OriginalMember(owner = "client!tfa", name = "U", descriptor = "[I")
	public static final int[] anIntArray528 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!tfa", name = "h", descriptor = "(I)Z")
	public static boolean method6920() {
		return Static298.method4529("jaclib") ? Static298.method4529("hw3d") : false;
	}

	@OriginalMember(owner = "client!tfa", name = "i", descriptor = "(I)V")
	public static void method6921() {
		Static427.method5898(false);
		if (Static91.anInt2333 >= 0 && Static91.anInt2333 != 0) {
			Static47.method1180(Static91.anInt2333);
			Static91.anInt2333 = -1;
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IIIIIII)V")
	public static void method6923(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(13) int local13 = Static31.anInt499;
		@Pc(15) int[] local15 = Static315.anIntArray279;
		Static183.anInt4009 = 0;
		@Pc(194) int local194;
		@Pc(237) int local237;
		@Pc(284) int local284;
		@Pc(356) int local356;
		@Pc(433) int local433;
		@Pc(896) int local896;
		@Pc(542) int local542;
		for (@Pc(19) int local19 = 0; local19 < local13 + Static60.anInt1599; local19++) {
			@Pc(23) Class213 local23 = null;
			@Pc(36) Class25_Sub2_Sub2_Sub5 local36;
			if (local13 > local19) {
				local36 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local15[local19]];
			} else {
				local36 = ((Class3_Sub39) Static581.aClass297_39.method6531((long) Static529.anIntArray535[local19 - local13])).aClass25_Sub2_Sub2_Sub5_Sub2_2;
				local23 = ((Class25_Sub2_Sub2_Sub5_Sub2) local36).aClass213_1;
				if (local23.anIntArray345 != null) {
					local23 = local23.method4998(Static206.aClass143_3);
					if (local23 == null) {
						continue;
					}
				}
			}
			if (local36.anInt8520 >= 0 && (local36.anInt8564 == Static335.anInt6052 || Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117 == local36.aByte117)) {
				Static532.method7294(arg0 >> 1, local36.method6675(), local36, arg1 >> 1);
				if (Static468.anIntArray481[0] >= 0) {
					if (local36.aString229 != null && (local13 <= local19 || Static392.anInt6961 == 0 || Static392.anInt6961 == 3 || Static392.anInt6961 == 1 && Static299.method4549(((Class25_Sub2_Sub2_Sub5_Sub1) local36).aString183)) && Static161.anInt3612 > Static183.anInt4009) {
						Static161.anIntArray146[Static183.anInt4009] = Static35.aClass328_1.method7371(local36.aString229) / 2;
						Static161.anIntArray144[Static183.anInt4009] = Static468.anIntArray481[0];
						Static161.anIntArray148[Static183.anInt4009] = Static468.anIntArray481[1];
						Static161.anIntArray143[Static183.anInt4009] = local36.anInt8574;
						Static161.anIntArray149[Static183.anInt4009] = local36.anInt8509;
						Static161.anIntArray145[Static183.anInt4009] = local36.anInt8569;
						Static161.aStringArray12[Static183.anInt4009] = local36.aString229;
						Static183.anInt4009++;
					}
					local194 = Static468.anIntArray481[1] + arg2;
					@Pc(269) Class73[] local269;
					@Pc(276) Class365[] local276;
					@Pc(328) Class73 local328;
					if (local36.aBoolean578 || Static397.anInt6998 >= local36.anInt8523) {
						local194 -= Math.max(Static35.aClass328_1.anInt9395, Static20.aClass73Array2[0].u());
					} else {
						@Pc(217) byte local217 = 1;
						if (local13 > local19) {
							@Pc(230) Class25_Sub2_Sub2_Sub5_Sub1 local230 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local15[local19]];
							local237 = local36.method6683().anInt4189;
							if (local230.aBoolean494) {
								local217 = 2;
							}
						} else {
							local237 = local23.anInt6217;
							if (local237 == -1) {
								local237 = local36.method6683().anInt4189;
							}
						}
						@Pc(258) Class73[] local258 = Static20.aClass73Array2;
						if (local237 != -1) {
							local269 = (Class73[]) Static312.aClass342_121.method7684((long) local237);
							if (local269 == null) {
								local276 = Static607.method8154(Static194.aClass284_60, local237);
								if (local276 != null) {
									local269 = new Class73[local276.length];
									for (local284 = 0; local284 < local276.length; local284++) {
										local269[local284] = Static319.aClass31_11.method8086(local276[local284], true);
									}
									Static312.aClass342_121.method7683(local269, (long) local237);
								}
							}
							if (local269 != null && local269.length >= 2) {
								local258 = local269;
							}
						}
						if (local258.length <= local217) {
							local217 = 1;
						}
						@Pc(324) Class73 local324 = local258[0];
						local328 = local258[local217];
						local194 -= Math.max(Static35.aClass328_1.anInt9395, local324.u());
						local284 = Static468.anIntArray481[0] + arg3 - (local324.E() >> 1);
						local356 = local324.E() * local36.anInt8519 / 255;
						if (local36.anInt8519 > 0 && local356 < 2) {
							local356 = 2;
						}
						local324.method7957(local284, local194);
						Static319.aClass31_11.V(local284, local194, local356 + local284, local194 - -local324.u());
						local328.method7957(local284, local194);
						Static319.aClass31_11.da(arg3, arg2, arg0 + arg3, arg2 + arg1);
					}
					local194 -= 2;
					if (!local36.aBoolean578) {
						@Pc(416) Class73 local416;
						if (local36.anInt8535 > Static397.anInt6998) {
							local416 = Static8.aClass73Array1[local36.aBoolean577 ? 2 : 0];
							@Pc(425) Class73 local425 = Static8.aClass73Array1[local36.aBoolean577 ? 3 : 1];
							if (local36 instanceof Class25_Sub2_Sub2_Sub5_Sub2) {
								local433 = local23.anInt6205;
								if (local433 == -1) {
									local433 = local36.method6683().anInt4219;
								}
							} else {
								local433 = local36.method6683().anInt4219;
							}
							if (local433 != -1) {
								local269 = (Class73[]) Static426.aClass342_146.method7684((long) local433);
								if (local269 == null) {
									local276 = Static607.method8154(Static194.aClass284_60, local433);
									if (local276 != null) {
										local269 = new Class73[local276.length];
										for (local284 = 0; local284 < local276.length; local284++) {
											local269[local284] = Static319.aClass31_11.method8086(local276[local284], true);
										}
										Static426.aClass342_146.method7683(local269, (long) local433);
									}
								}
								if (local269 != null && local269.length == 4) {
									local425 = local269[local36.aBoolean577 ? 3 : 1];
									local416 = local269[local36.aBoolean577 ? 2 : 0];
								}
							}
							@Pc(531) int local531 = local36.anInt8535 - Static397.anInt6998;
							if (local36.anInt8571 >= local531) {
								local542 = local416.E();
							} else {
								local531 -= local36.anInt8571;
								local284 = local36.anInt8563 == 0 ? 0 : local36.anInt8563 * ((local36.anInt8573 - local531) / local36.anInt8563);
								local542 = local416.E() * local284 / local36.anInt8573;
							}
							local284 = local416.u();
							local194 -= local284;
							local356 = Static468.anIntArray481[0] + arg3 - (local416.E() >> 1);
							local416.method7957(local356, local194);
							Static319.aClass31_11.V(local356, local194, local356 + local542, local194 + local284);
							local425.method7957(local356, local194);
							Static319.aClass31_11.da(arg3, arg2, arg0 + arg3, arg2 + arg1);
							local194 -= 2;
						}
						if (local19 < local13) {
							@Pc(666) Class25_Sub2_Sub2_Sub5_Sub1 local666 = (Class25_Sub2_Sub2_Sub5_Sub1) local36;
							if (local666.anInt7152 != -1) {
								local194 -= 25;
								Static132.aClass73Array4[local666.anInt7152].method7957(arg3 + Static468.anIntArray481[0] - 12, local194);
								local194 -= 2;
							}
							if (local666.anInt7157 != -1) {
								local194 -= 25;
								Static286.aClass73Array7[local666.anInt7157].method7957(arg3 + Static468.anIntArray481[0] - 12, local194);
								local194 -= 2;
							}
						} else if (local23.anInt6176 >= 0 && Static286.aClass73Array7.length > local23.anInt6176) {
							local194 -= 25;
							local416 = Static286.aClass73Array7[local23.anInt6176];
							local416.method7957(Static468.anIntArray481[0] + arg3 - (local416.E() >> 1), local194);
							local194 -= 2;
						}
					}
					@Pc(713) Class167[] local713;
					@Pc(721) Class167 local721;
					if (!(local36 instanceof Class25_Sub2_Sub2_Sub5_Sub1)) {
						local237 = 0;
						local713 = Static98.aClass167Array1;
						for (local433 = 0; local433 < local713.length; local433++) {
							local721 = local713[local433];
							if (local721 != null && local721.anInt5096 == 1 && local721.anInt5098 == Static529.anIntArray535[local19 - local13]) {
								local328 = Static308.aClass73Array8[local721.anInt5094];
								if (local237 < local328.u()) {
									local237 = local328.u();
								}
								if (Static397.anInt6998 % 20 < 10) {
									local328.method7957(Static468.anIntArray481[0] + arg3 - 12, local194 + -local328.u());
								}
							}
						}
						if (local237 > 0) {
						}
					} else if (local19 >= 0) {
						local237 = 0;
						local713 = Static98.aClass167Array1;
						for (local433 = 0; local433 < local713.length; local433++) {
							local721 = local713[local433];
							if (local721 != null && local721.anInt5096 == 10 && local15[local19] == local721.anInt5098) {
								local328 = Static308.aClass73Array8[local721.anInt5094];
								if (local237 < local328.u()) {
									local237 = local328.u();
								}
								local328.method7957(Static468.anIntArray481[0] + arg3 - 12, local194 - local328.u());
							}
						}
						if (local237 > 0) {
						}
					}
					for (local237 = 0; local237 < 4; local237++) {
						if (Static397.anInt6998 < local36.anIntArray506[local237]) {
							local896 = local36.method6675() / 2;
							Static532.method7294(arg0 >> 1, local896, local36, arg1 >> 1);
							if (Static468.anIntArray481[0] > -1) {
								local433 = Static516.aClass73Array14[local36.anIntArray507[local237]].E();
								if (local237 == 1) {
									Static468.anIntArray481[1] -= 20;
								}
								if (local237 == 2) {
									Static468.anIntArray481[0] -= local433 - 9;
									Static468.anIntArray481[1] -= 10;
								}
								if (local237 == 3) {
									Static468.anIntArray481[1] -= 10;
									Static468.anIntArray481[0] += local433 - 9;
								}
								Static516.aClass73Array14[local36.anIntArray507[local237]].method7957(Static468.anIntArray481[0] + arg3 - (local433 >> 1), arg2 + -12 + Static468.anIntArray481[1]);
								Static393.aClass63_9.method6878(arg2 + Static468.anIntArray481[1] + 3, 0, -1, Integer.toString(local36.anIntArray511[local237]), Static468.anIntArray481[0] + arg3 - 1);
							}
						}
					}
				}
			}
		}
		@Pc(1044) int local1044;
		for (@Pc(1038) int local1038 = 0; local1038 < Static125.anInt2869; local1038++) {
			local1044 = Static42.anIntArray32[local1038];
			@Pc(1059) Class25_Sub2_Sub2_Sub5 local1059;
			if (local1044 >= 2048) {
				local1059 = ((Class3_Sub39) Static581.aClass297_39.method6531((long) (local1044 - 2048))).aClass25_Sub2_Sub2_Sub5_Sub2_2;
			} else {
				local1059 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local1044];
			}
			local237 = Static374.anIntArray363[local1038];
			@Pc(1078) Class25_Sub2_Sub2_Sub5 local1078;
			if (local237 < 2048) {
				local1078 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local237];
			} else {
				local1078 = ((Class3_Sub39) Static581.aClass297_39.method6531((long) (local237 - 2048))).aClass25_Sub2_Sub2_Sub5_Sub2_2;
			}
			Static246.method3898(local1059, arg1, arg3, arg0, --local1059.anInt8501, arg2, local1078);
		}
		local1044 = Static35.aClass328_1.anInt9397 + Static35.aClass328_1.anInt9395 + 2;
		for (local194 = 0; local194 < Static183.anInt4009; local194++) {
			local237 = Static161.anIntArray144[local194];
			local896 = Static161.anIntArray148[local194];
			local433 = Static161.anIntArray146[local194];
			@Pc(1137) boolean local1137 = true;
			while (local1137) {
				local1137 = false;
				for (local542 = 0; local542 < local194; local542++) {
					if (Static161.anIntArray148[local542] - local1044 < local896 + 2 && local896 - local1044 < Static161.anIntArray148[local542] - -2 && Static161.anIntArray146[local542] + Static161.anIntArray144[local542] > -local433 + local237 && local237 + local433 > -Static161.anIntArray146[local542] + Static161.anIntArray144[local542] && Static161.anIntArray148[local542] - local1044 < local896) {
						local1137 = true;
						local896 = Static161.anIntArray148[local542] - local1044;
					}
				}
			}
			Static161.anIntArray148[local194] = local896;
			@Pc(1233) String local1233 = Static161.aStringArray12[local194];
			if (Static261.anInt5024 == 0) {
				local284 = 16776960;
				if (Static161.anIntArray143[local194] < 6) {
					local284 = Static441.anIntArray465[Static161.anIntArray143[local194]];
				}
				if (Static161.anIntArray143[local194] == 6) {
					local284 = Static335.anInt6052 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static161.anIntArray143[local194] == 7) {
					local284 = Static335.anInt6052 % 20 < 10 ? 255 : 65535;
				}
				if (Static161.anIntArray143[local194] == 8) {
					local284 = Static335.anInt6052 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static161.anIntArray143[local194] == 9) {
					local356 = 150 - Static161.anIntArray145[local194];
					if (local356 < 50) {
						local284 = local356 * 1280 + 16711680;
					} else if (local356 < 100) {
						local284 = 16776960 - (local356 - 50) * 327680;
					} else if (local356 < 150) {
						local284 = (local356 - 100) * 5 + 65280;
					}
				}
				if (Static161.anIntArray143[local194] == 10) {
					local356 = 150 - Static161.anIntArray145[local194];
					if (local356 < 50) {
						local284 = local356 * 5 + 16711680;
					} else if (local356 < 100) {
						local284 = 16711935 + 16384000 - local356 * 327680;
					} else if (local356 < 150) {
						local284 = local356 * 327680 + 255 - (local356 + -100) * 5 - 32768000;
					}
				}
				if (Static161.anIntArray143[local194] == 11) {
					local356 = 150 - Static161.anIntArray145[local194];
					if (local356 < 50) {
						local284 = 16777215 - local356 * 327685;
					} else if (local356 < 100) {
						local284 = (local356 - 50) * 327685 + 65280;
					} else if (local356 < 150) {
						local284 = 16777215 - (local356 - 100) * 327680;
					}
				}
				local356 = local284 | 0xFF000000;
				if (Static161.anIntArray149[local194] == 0) {
					Static465.aClass63_10.method6878(arg2 + local896, -16777216, local356, local1233, local237 + arg3);
				}
				if (Static161.anIntArray149[local194] == 1) {
					Static465.aClass63_10.method6889(arg3 + local237, local356, arg2 + local896, Static335.anInt6052, local1233);
				}
				if (Static161.anIntArray149[local194] == 2) {
					Static465.aClass63_10.method6876(local356, Static335.anInt6052, local237 + arg3, local1233, local896 + arg2);
				}
				if (Static161.anIntArray149[local194] == 3) {
					Static465.aClass63_10.method6886(150 - Static161.anIntArray145[local194], local1233, local356, local237 + arg3, local896 + arg2, Static335.anInt6052);
				}
				@Pc(1560) int local1560;
				if (Static161.anIntArray149[local194] == 4) {
					local1560 = (150 - Static161.anIntArray145[local194]) * (Static35.aClass328_1.method7371(local1233) + 100) / 150;
					Static319.aClass31_11.V(local237 + arg3 - 50, arg2, local237 + arg3 + 50, arg1 + arg2);
					Static465.aClass63_10.method6881(local1233, -16777216, local237 + arg3 + 50 - local1560, local356, local896 + arg2);
					Static319.aClass31_11.da(arg3, arg2, arg3 + arg0, arg2 - -arg1);
				}
				if (Static161.anIntArray149[local194] == 5) {
					local1560 = 150 - Static161.anIntArray145[local194];
					@Pc(1621) int local1621 = 0;
					if (local1560 < 25) {
						local1621 = local1560 - 25;
					} else if (local1560 > 125) {
						local1621 = local1560 - 125;
					}
					@Pc(1643) int local1643 = Static35.aClass328_1.anInt9397 + Static35.aClass328_1.anInt9395;
					Static319.aClass31_11.V(arg3, local896 + arg2 - local1643 - 1, arg0 + arg3, arg2 + local896 + 5);
					Static465.aClass63_10.method6878(local1621 + local896 + arg2, -16777216, local356, local1233, arg3 + local237);
					Static319.aClass31_11.da(arg3, arg2, arg3 + arg0, arg1 + arg2);
				}
			} else {
				Static465.aClass63_10.method6878(local896 + arg2, -16777216, -256, local1233, local237 + arg3);
			}
		}
	}
}
