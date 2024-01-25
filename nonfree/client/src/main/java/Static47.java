import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!br", name = "l", descriptor = "I")
	public static int anInt873;

	@OriginalMember(owner = "client!br", name = "p", descriptor = "I")
	public static int anInt876;

	@OriginalMember(owner = "client!br", name = "g", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_7 = new Class154(22, 8);

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method842(@OriginalArg(0) Class162 arg0) {
		Static71.aClass37_11 = Static230.method2788(arg0, Static164.anInt2535, true);
		Static125.aClass112_5 = Static525.method6788(arg0, Static164.anInt2535);
		Static322.aClass37_20 = Static230.method2788(arg0, Static9.anInt230, true);
		Static266.aClass112_7 = Static525.method6788(arg0, Static9.anInt230);
		Static81.aClass37_16 = Static230.method2788(arg0, Static160.anInt2499, true);
		Static537.aClass112_11 = Static525.method6788(arg0, Static160.anInt2499);
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(ZI)I")
	public static int method843(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)Z")
	public static boolean method844() {
		if (Static341.aBoolean467) {
			try {
				Static597.method3394("showVideoAd", Static195.anApplet4);
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!br", name = "d", descriptor = "(I)Z")
	public static boolean method845() throws IOException {
		if (Static529.aClass124_2 == null) {
			return false;
		}
		@Pc(73) int local73;
		if (Static149.aClass349_37 == null) {
			if (Static359.aBoolean229) {
				if (!Static529.aClass124_2.method2253(1)) {
					return false;
				}
				Static529.aClass124_2.method2250(0, Static361.aClass2_Sub7_Sub2_1.aByteArray52, 1);
				Static524.anInt8325++;
				Static210.anInt3053 = 0;
				Static359.aBoolean229 = false;
			}
			Static361.aClass2_Sub7_Sub2_1.anInt5186 = 0;
			if (Static361.aClass2_Sub7_Sub2_1.method4526()) {
				if (!Static529.aClass124_2.method2253(1)) {
					return false;
				}
				Static529.aClass124_2.method2250(1, Static361.aClass2_Sub7_Sub2_1.aByteArray52, 1);
				Static524.anInt8325++;
				Static210.anInt3053 = 0;
			}
			Static359.aBoolean229 = true;
			@Pc(69) Class349[] local69 = Static204.method2538();
			local73 = Static361.aClass2_Sub7_Sub2_1.method4527();
			if (local73 < 0 || local73 >= local69.length) {
				throw new IOException("invo:" + local73 + " ip:" + Static361.aClass2_Sub7_Sub2_1.anInt5186);
			}
			Static149.aClass349_37 = local69[local73];
			Static528.anInt8479 = Static149.aClass349_37.anInt9176;
		}
		if (Static528.anInt8479 == -1) {
			if (!Static529.aClass124_2.method2253(1)) {
				return false;
			}
			Static529.aClass124_2.method2250(0, Static361.aClass2_Sub7_Sub2_1.aByteArray52, 1);
			Static528.anInt8479 = Static361.aClass2_Sub7_Sub2_1.aByteArray52[0] & 0xFF;
			Static524.anInt8325++;
			Static210.anInt3053 = 0;
		}
		if (Static528.anInt8479 == -2) {
			if (!Static529.aClass124_2.method2253(2)) {
				return false;
			}
			Static529.aClass124_2.method2250(0, Static361.aClass2_Sub7_Sub2_1.aByteArray52, 2);
			Static361.aClass2_Sub7_Sub2_1.anInt5186 = 0;
			Static528.anInt8479 = Static361.aClass2_Sub7_Sub2_1.method4518();
			Static524.anInt8325 += 2;
			Static210.anInt3053 = 0;
		}
		if (Static528.anInt8479 > 0) {
			if (!Static529.aClass124_2.method2253(Static528.anInt8479)) {
				return false;
			}
			Static361.aClass2_Sub7_Sub2_1.anInt5186 = 0;
			Static529.aClass124_2.method2250(0, Static361.aClass2_Sub7_Sub2_1.aByteArray52, Static528.anInt8479);
			Static210.anInt3053 = 0;
			Static524.anInt8325 += Static528.anInt8479;
		}
		Static511.aClass349_152 = Static577.aClass349_162;
		Static577.aClass349_162 = Static154.aClass349_41;
		Static154.aClass349_41 = Static149.aClass349_37;
		if (Static149.aClass349_37 == Static525.aClass349_139) {
			Static284.method4051(Static426.aClass262_13);
			Static149.aClass349_37 = null;
			return true;
		}
		@Pc(220) int local220;
		if (Static149.aClass349_37 == Static40.aClass349_13) {
			local220 = Static361.aClass2_Sub7_Sub2_1.method4518();
			local73 = Static361.aClass2_Sub7_Sub2_1.method4509();
			if (Static86.method1273(local220)) {
				@Pc(235) Class2_Sub33 local235 = (Class2_Sub33) Static346.aClass90_17.method1685((long) local73);
				if (local235 != null) {
					Static393.method5411(false, local235, true);
				}
				if (Static396.aClass273_10 != null) {
					Static155.method2111(Static396.aClass273_10);
					Static396.aClass273_10 = null;
				}
			}
			Static149.aClass349_37 = null;
			return true;
		} else if (Static149.aClass349_37 == Static439.aClass349_119) {
			Static449.method5858(Static433.aBoolean571);
			Static149.aClass349_37 = null;
			return false;
		} else {
			@Pc(286) int local286;
			@Pc(292) int local292;
			@Pc(302) int local302;
			@Pc(308) int local308;
			if (Static149.aClass349_37 == Static449.aClass349_123) {
				local220 = Static361.aClass2_Sub7_Sub2_1.method4518();
				local73 = Static361.aClass2_Sub7_Sub2_1.method4518();
				local286 = Static361.aClass2_Sub7_Sub2_1.method4518();
				local292 = Static361.aClass2_Sub7_Sub2_1.method4518();
				if (Static86.method1273(local220) && Static509.aClass273ArrayArray2[local73] != null) {
					for (local302 = local286; local302 < local292; local302++) {
						local308 = Static361.aClass2_Sub7_Sub2_1.method4503();
						if (local302 < Static509.aClass273ArrayArray2[local73].length && Static509.aClass273ArrayArray2[local73][local302] != null) {
							Static509.aClass273ArrayArray2[local73][local302].anInt6834 = local308;
						}
					}
				}
				Static149.aClass349_37 = null;
				return true;
			} else if (Static149.aClass349_37 == Static339.aClass349_95) {
				Static30.method399();
				Static149.aClass349_37 = null;
				return true;
			} else if (Static570.aClass349_158 == Static149.aClass349_37) {
				Static284.method4051(Static371.aClass262_11);
				Static149.aClass349_37 = null;
				return true;
			} else if (Static149.aClass349_37 == Static521.aClass349_137) {
				local220 = Static361.aClass2_Sub7_Sub2_1.method4509();
				local73 = Static361.aClass2_Sub7_Sub2_1.method4517();
				if (Static86.method1273(local73)) {
					Static108.method1584(local220, 3, -1, -1);
				}
				Static149.aClass349_37 = null;
				return true;
			} else {
				@Pc(415) Class2_Sub33 local415;
				if (Static341.aClass349_99 == Static149.aClass349_37) {
					local220 = Static361.aClass2_Sub7_Sub2_1.method4464();
					local73 = Static361.aClass2_Sub7_Sub2_1.method4517();
					local286 = Static361.aClass2_Sub7_Sub2_1.method4496();
					local292 = Static361.aClass2_Sub7_Sub2_1.method4517();
					if (Static86.method1273(local292)) {
						local415 = (Class2_Sub33) Static346.aClass90_17.method1685((long) local286);
						if (local415 != null) {
							Static393.method5411(false, local415, local73 != local415.anInt5981);
						}
						Static171.method2239(local286, false, local220, local73);
					}
					Static149.aClass349_37 = null;
					return true;
				} else if (Static366.aClass349_102 == Static149.aClass349_37) {
					Static149.aClass349_37 = null;
					return false;
				} else {
					@Pc(490) int local490;
					@Pc(494) int local494;
					@Pc(470) String local470;
					@Pc(481) long local481;
					@Pc(468) String local468;
					@Pc(464) boolean local464;
					@Pc(486) long local486;
					@Pc(504) int local504;
					if (Static390.aClass349_108 == Static149.aClass349_37) {
						local464 = Static361.aClass2_Sub7_Sub2_1.method4464() == 1;
						local468 = Static361.aClass2_Sub7_Sub2_1.method4494();
						local470 = local468;
						if (local464) {
							local470 = Static361.aClass2_Sub7_Sub2_1.method4494();
						}
						local481 = Static361.aClass2_Sub7_Sub2_1.method4518();
						local486 = Static361.aClass2_Sub7_Sub2_1.method4503();
						local490 = Static361.aClass2_Sub7_Sub2_1.method4464();
						local494 = Static361.aClass2_Sub7_Sub2_1.method4518();
						@Pc(500) long local500 = (local481 << 32) + local486;
						@Pc(502) boolean local502 = false;
						local504 = 0;
						while (true) {
							if (local504 >= 100) {
								if (local490 <= 1 && Static520.method6723(local470)) {
									local502 = true;
								}
								break;
							}
							if (local500 == Static23.aLongArray2[local504]) {
								local502 = true;
								break;
							}
							local504++;
						}
						if (!local502 && Static12.anInt296 == 0) {
							Static23.aLongArray2[Static499.anInt7956] = local500;
							Static499.anInt7956 = (Static499.anInt7956 + 1) % 100;
							@Pc(555) String local555 = Static330.aClass227_2.method4797(local494).method4790(Static361.aClass2_Sub7_Sub2_1);
							if (local490 == 2) {
								Static570.method7435(local468, 0, "<img=1>" + local470, local494, 18, local555, null, "<img=1>" + local468);
							} else if (local490 == 1) {
								Static570.method7435(local468, 0, "<img=0>" + local470, local494, 18, local555, null, "<img=0>" + local468);
							} else {
								Static570.method7435(local468, 0, local470, local494, 18, local555, null, local468);
							}
						}
						Static149.aClass349_37 = null;
						return true;
					} else if (Static149.aClass349_37 == Static504.aClass349_133) {
						local220 = Static361.aClass2_Sub7_Sub2_1.method4465();
						local468 = Static361.aClass2_Sub7_Sub2_1.method4494();
						local286 = Static361.aClass2_Sub7_Sub2_1.method4518();
						if (Static86.method1273(local220)) {
							Static117.method1704(local468, local286);
						}
						Static149.aClass349_37 = null;
						return true;
					} else if (Static355.aClass349_101 == Static149.aClass349_37) {
						local220 = Static361.aClass2_Sub7_Sub2_1.method4496();
						local73 = Static361.aClass2_Sub7_Sub2_1.method4517();
						local286 = Static361.aClass2_Sub7_Sub2_1.method4518();
						if (Static86.method1273(local286)) {
							Static42.method722(local73, local220);
						}
						Static149.aClass349_37 = null;
						return true;
					} else {
						@Pc(999) String local999;
						@Pc(963) String local963;
						@Pc(719) String local719;
						@Pc(721) boolean local721;
						@Pc(761) boolean local761;
						if (Static149.aClass349_37 == Static277.aClass349_78) {
							while (Static361.aClass2_Sub7_Sub2_1.anInt5186 < Static528.anInt8479) {
								local464 = Static361.aClass2_Sub7_Sub2_1.method4464() == 1;
								local468 = Static361.aClass2_Sub7_Sub2_1.method4494();
								local470 = Static361.aClass2_Sub7_Sub2_1.method4494();
								local292 = Static361.aClass2_Sub7_Sub2_1.method4518();
								local302 = Static361.aClass2_Sub7_Sub2_1.method4464();
								local719 = "";
								local721 = false;
								if (local292 > 0) {
									local719 = Static361.aClass2_Sub7_Sub2_1.method4494();
									local721 = Static361.aClass2_Sub7_Sub2_1.method4464() == 1;
								}
								for (local490 = 0; local490 < Static107.anInt1861; local490++) {
									if (local464) {
										if (local470.equals(Static394.aStringArray33[local490])) {
											Static394.aStringArray33[local490] = local468;
											Static197.aStringArray18[local490] = local470;
											local468 = null;
											break;
										}
									} else if (local468.equals(Static394.aStringArray33[local490])) {
										if (Static166.anIntArray213[local490] != local292) {
											local761 = true;
											for (@Pc(766) Class12_Sub1_Sub2 local766 = (Class12_Sub1_Sub2) Static235.aClass220_6.method4661(); local766 != null; local766 = (Class12_Sub1_Sub2) Static235.aClass220_6.method4660()) {
												if (local766.aString93.equals(local468)) {
													if (local292 != 0 && local766.aShort84 == 0) {
														local766.method7630();
														local761 = false;
													} else if (local292 == 0 && local766.aShort84 != 0) {
														local761 = false;
														local766.method7630();
													}
												}
											}
											if (local761) {
												Static235.aClass220_6.method4659(new Class12_Sub1_Sub2(local468, local292));
											}
											Static166.anIntArray213[local490] = local292;
										}
										Static197.aStringArray18[local490] = local470;
										Static74.aStringArray8[local490] = local719;
										Static173.anIntArray219[local490] = local302;
										Static282.aBooleanArray19[local490] = local721;
										local468 = null;
										break;
									}
								}
								if (local468 != null && Static107.anInt1861 < 200) {
									Static394.aStringArray33[Static107.anInt1861] = local468;
									Static197.aStringArray18[Static107.anInt1861] = local470;
									Static166.anIntArray213[Static107.anInt1861] = local292;
									Static74.aStringArray8[Static107.anInt1861] = local719;
									Static173.anIntArray219[Static107.anInt1861] = local302;
									Static282.aBooleanArray19[Static107.anInt1861] = local721;
									Static107.anInt1861++;
								}
							}
							Static196.anInt2849 = 2;
							Static586.anInt9519 = Static390.anInt6454;
							local73 = Static107.anInt1861;
							while (local73 > 0) {
								local464 = true;
								local73--;
								for (local286 = 0; local286 < local73; local286++) {
									if (Static166.anIntArray213[local286] != Static489.aClass292_5.anInt7261 && Static166.anIntArray213[local286 + 1] == Static489.aClass292_5.anInt7261 || Static166.anIntArray213[local286] == 0 && Static166.anIntArray213[local286 + 1] != 0) {
										local292 = Static166.anIntArray213[local286];
										Static166.anIntArray213[local286] = Static166.anIntArray213[local286 + 1];
										Static166.anIntArray213[local286 + 1] = local292;
										local963 = Static74.aStringArray8[local286];
										Static74.aStringArray8[local286] = Static74.aStringArray8[local286 + 1];
										Static74.aStringArray8[local286 + 1] = local963;
										local719 = Static394.aStringArray33[local286];
										Static394.aStringArray33[local286] = Static394.aStringArray33[local286 + 1];
										Static394.aStringArray33[local286 + 1] = local719;
										local999 = Static197.aStringArray18[local286];
										Static197.aStringArray18[local286] = Static197.aStringArray18[local286 + 1];
										Static197.aStringArray18[local286 + 1] = local999;
										local490 = Static173.anIntArray219[local286];
										Static173.anIntArray219[local286] = Static173.anIntArray219[local286 + 1];
										Static173.anIntArray219[local286 + 1] = local490;
										local761 = Static282.aBooleanArray19[local286];
										Static282.aBooleanArray19[local286] = Static282.aBooleanArray19[local286 + 1];
										Static282.aBooleanArray19[local286 + 1] = local761;
										local464 = false;
									}
								}
								if (local464) {
									break;
								}
							}
							Static149.aClass349_37 = null;
							return true;
						} else if (Static149.aClass349_37 == Static378.aClass349_103) {
							Static190.anInt2789 = Static361.aClass2_Sub7_Sub2_1.method4515();
							Static389.anInt6418 = Static361.aClass2_Sub7_Sub2_1.method4466();
							Static149.aClass349_37 = null;
							return true;
						} else if (Static149.aClass349_37 == Static552.aClass349_150) {
							Static284.method4051(Static574.aClass262_15);
							Static149.aClass349_37 = null;
							return true;
						} else if (Static2.aClass349_1 == Static149.aClass349_37) {
							local464 = Static361.aClass2_Sub7_Sub2_1.method4464() == 1;
							@Pc(1119) byte[] local1119 = new byte[Static528.anInt8479 - 1];
							Static361.aClass2_Sub7_Sub2_1.method4504(Static528.anInt8479 - 1, local1119);
							Static296.method4269(local1119, local464);
							Static149.aClass349_37 = null;
							return true;
						} else {
							@Pc(1167) boolean local1167;
							if (Static157.aClass349_42 == Static149.aClass349_37) {
								local464 = Static361.aClass2_Sub7_Sub2_1.method4464() == 1;
								local468 = Static361.aClass2_Sub7_Sub2_1.method4494();
								local470 = local468;
								if (local464) {
									local470 = Static361.aClass2_Sub7_Sub2_1.method4494();
								}
								local292 = Static361.aClass2_Sub7_Sub2_1.method4464();
								local1167 = false;
								if (local292 <= 1) {
									if (Static183.aBoolean193 && !Static438.aBoolean578 || Static395.aBoolean806) {
										local1167 = true;
									} else if (local292 <= 1 && Static520.method6723(local470)) {
										local1167 = true;
									}
								}
								if (!local1167 && Static12.anInt296 == 0) {
									local719 = Static315.method4559(Static208.method2577(Static361.aClass2_Sub7_Sub2_1));
									if (local292 == 2) {
										Static570.method7435(local468, 0, "<img=1>" + local470, -1, 24, local719, null, "<img=1>" + local468);
									} else if (local292 == 1) {
										Static570.method7435(local468, 0, "<img=0>" + local470, -1, 24, local719, null, "<img=0>" + local468);
									} else {
										Static570.method7435(local468, 0, local470, -1, 24, local719, null, local468);
									}
								}
								Static149.aClass349_37 = null;
								return true;
							}
							@Pc(1326) int local1326;
							@Pc(1295) boolean local1295;
							if (Static330.aClass349_5 == Static149.aClass349_37) {
								local220 = Static361.aClass2_Sub7_Sub2_1.method4518();
								local73 = Static361.aClass2_Sub7_Sub2_1.method4464();
								local1295 = (local73 & 0x1) == 1;
								Static176.method2282(local1295, local220);
								local292 = Static361.aClass2_Sub7_Sub2_1.method4518();
								for (local302 = 0; local302 < local292; local302++) {
									local308 = Static361.aClass2_Sub7_Sub2_1.method4515();
									if (local308 == 255) {
										local308 = Static361.aClass2_Sub7_Sub2_1.method4467();
									}
									local1326 = Static361.aClass2_Sub7_Sub2_1.method4517();
									Static366.method5160(local220, local308, local1326 - 1, local302, local1295);
								}
								Static409.anIntArray428[Static375.anInt6283++ & 0x1F] = local220;
								Static149.aClass349_37 = null;
								return true;
							} else if (Static149.aClass349_37 == Static593.aClass349_166) {
								local220 = Static361.aClass2_Sub7_Sub2_1.method4518();
								if (local220 == 65535) {
									local220 = -1;
								}
								local73 = Static361.aClass2_Sub7_Sub2_1.method4464();
								local286 = Static361.aClass2_Sub7_Sub2_1.method4518();
								local292 = Static361.aClass2_Sub7_Sub2_1.method4464();
								local302 = Static361.aClass2_Sub7_Sub2_1.method4518();
								Static351.method5040(false, local73, local286, local302, local220, local292);
								Static149.aClass349_37 = null;
								return true;
							} else if (Static149.aClass349_37 == Static24.aClass349_10) {
								local220 = Static361.aClass2_Sub7_Sub2_1.method4466();
								@Pc(1414) byte local1414 = Static361.aClass2_Sub7_Sub2_1.method4522();
								local286 = Static361.aClass2_Sub7_Sub2_1.method4517();
								if (Static86.method1273(local286)) {
									Static463.method5981(local220, local1414);
								}
								Static149.aClass349_37 = null;
								return true;
							} else if (Static272.aClass349_75 == Static149.aClass349_37) {
								local220 = Static361.aClass2_Sub7_Sub2_1.method4515();
								local73 = Static361.aClass2_Sub7_Sub2_1.method4518();
								Static426.aClass160_1.method2787(local220, local73);
								Static149.aClass349_37 = null;
								return true;
							} else {
								@Pc(1505) long local1505;
								@Pc(1520) Class2_Sub23 local1520;
								@Pc(1511) Class2_Sub23 local1511;
								if (Static149.aClass349_37 == Static556.aClass349_153) {
									local220 = Static361.aClass2_Sub7_Sub2_1.method4521();
									if (local220 == 65535) {
										local220 = -1;
									}
									local73 = Static361.aClass2_Sub7_Sub2_1.method4517();
									local286 = Static361.aClass2_Sub7_Sub2_1.method4467();
									local292 = Static361.aClass2_Sub7_Sub2_1.method4509();
									local302 = Static361.aClass2_Sub7_Sub2_1.method4517();
									if (local302 == 65535) {
										local302 = -1;
									}
									if (Static86.method1273(local73)) {
										for (local308 = local220; local308 <= local302; local308++) {
											local1505 = (long) local308 + ((long) local286 << 32);
											local1511 = (Class2_Sub23) Static323.aClass90_16.method1685(local1505);
											if (local1511 != null) {
												local1520 = new Class2_Sub23(local292, local1511.anInt3327);
												local1511.method7657();
											} else if (local308 == -1) {
												local1520 = new Class2_Sub23(local292, Static594.method7731(local286).aClass2_Sub23_2.anInt3327);
											} else {
												local1520 = new Class2_Sub23(local292, -1);
											}
											Static323.aClass90_16.method1684(local1520, local1505);
										}
									}
									Static149.aClass349_37 = null;
									return true;
								} else if (Static149.aClass349_37 == Static393.aClass349_109) {
									local220 = Static361.aClass2_Sub7_Sub2_1.method4518();
									if (Static86.method1273(local220)) {
										Static513.method6626();
									}
									Static149.aClass349_37 = null;
									return true;
								} else if (Static149.aClass349_37 == Static538.aClass349_145) {
									Static517.method6673(Static528.anInt8479, Static361.aClass2_Sub7_Sub2_1);
									Static149.aClass349_37 = null;
									return true;
								} else if (Static149.aClass349_37 == Static451.aClass349_141) {
									local220 = Static361.aClass2_Sub7_Sub2_1.method4518();
									local73 = Static361.aClass2_Sub7_Sub2_1.method4464();
									local286 = Static361.aClass2_Sub7_Sub2_1.method4464();
									local292 = Static361.aClass2_Sub7_Sub2_1.method4464();
									local302 = Static361.aClass2_Sub7_Sub2_1.method4464();
									local308 = Static361.aClass2_Sub7_Sub2_1.method4518();
									if (Static86.method1273(local220)) {
										Static416.aBooleanArray7[local73] = true;
										Static225.anIntArray271[local73] = local286;
										Static464.anIntArray498[local73] = local292;
										Static489.anIntArray517[local73] = local302;
										Static540.anIntArray581[local73] = local308;
									}
									Static149.aClass349_37 = null;
									return true;
								} else {
									@Pc(1839) int local1839;
									@Pc(1857) Class53 local1857;
									if (Static538.aClass349_144 == Static149.aClass349_37) {
										Static248.anInt4116 = Static390.anInt6454;
										if (Static528.anInt8479 == 0) {
											Static399.anInt6590 = 0;
											Static394.aString92 = null;
											Static502.aClass53Array1 = null;
											Static124.aString144 = null;
											Static149.aClass349_37 = null;
											return true;
										}
										Static394.aString92 = Static361.aClass2_Sub7_Sub2_1.method4494();
										local464 = Static361.aClass2_Sub7_Sub2_1.method4464() == 1;
										if (local464) {
											Static361.aClass2_Sub7_Sub2_1.method4494();
										}
										@Pc(1699) long local1699 = Static361.aClass2_Sub7_Sub2_1.method4514();
										Static124.aString144 = Static100.method1511(local1699);
										Static448.aByte15 = Static361.aClass2_Sub7_Sub2_1.method4477();
										local292 = Static361.aClass2_Sub7_Sub2_1.method4464();
										if (local292 == 255) {
											Static149.aClass349_37 = null;
											return true;
										}
										Static399.anInt6590 = local292;
										@Pc(1727) Class53[] local1727 = new Class53[100];
										for (local308 = 0; local308 < Static399.anInt6590; local308++) {
											local1727[local308] = new Class53();
											local1727[local308].aString15 = Static361.aClass2_Sub7_Sub2_1.method4494();
											local464 = Static361.aClass2_Sub7_Sub2_1.method4464() == 1;
											if (local464) {
												local1727[local308].aString13 = Static361.aClass2_Sub7_Sub2_1.method4494();
											} else {
												local1727[local308].aString13 = local1727[local308].aString15;
											}
											local1727[local308].aString11 = Static273.method3974(local1727[local308].aString13);
											local1727[local308].anInt1144 = Static361.aClass2_Sub7_Sub2_1.method4518();
											local1727[local308].aByte13 = Static361.aClass2_Sub7_Sub2_1.method4477();
											local1727[local308].aString12 = Static361.aClass2_Sub7_Sub2_1.method4494();
											if (local1727[local308].aString13.equals(Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aString75)) {
												Static2.aByte1 = local1727[local308].aByte13;
											}
										}
										local494 = Static399.anInt6590;
										while (local494 > 0) {
											local494--;
											local721 = true;
											for (local1839 = 0; local1839 < local494; local1839++) {
												if (local1727[local1839].aString11.compareTo(local1727[local1839 + 1].aString11) > 0) {
													local1857 = local1727[local1839];
													local1727[local1839] = local1727[local1839 + 1];
													local1727[local1839 + 1] = local1857;
													local721 = false;
												}
											}
											if (local721) {
												break;
											}
										}
										Static502.aClass53Array1 = local1727;
										Static149.aClass349_37 = null;
										return true;
									}
									@Pc(1899) byte local1899;
									if (Static100.aClass349_25 == Static149.aClass349_37) {
										local1899 = Static361.aClass2_Sub7_Sub2_1.method4505();
										local73 = Static361.aClass2_Sub7_Sub2_1.method4517();
										Static426.aClass160_1.method2785(local73, local1899);
										Static149.aClass349_37 = null;
										return true;
									} else if (Static149.aClass349_37 == Static521.aClass349_136) {
										local220 = Static361.aClass2_Sub7_Sub2_1.method4464();
										if (Static361.aClass2_Sub7_Sub2_1.method4464() == 0) {
											Static280.aClass92Array1[local220] = new Class92();
										} else {
											Static361.aClass2_Sub7_Sub2_1.anInt5186--;
											Static280.aClass92Array1[local220] = new Class92(Static361.aClass2_Sub7_Sub2_1);
										}
										Static149.aClass349_37 = null;
										Static290.anInt4888 = Static390.anInt6454;
										return true;
									} else if (Static149.aClass349_37 == Static150.aClass349_38) {
										Static426.aClass160_1.method2784();
										Static134.anInt2158 += 32;
										Static149.aClass349_37 = null;
										return true;
									} else if (Static149.aClass349_37 == Static11.aClass349_7) {
										local220 = Static361.aClass2_Sub7_Sub2_1.method4515();
										local73 = Static361.aClass2_Sub7_Sub2_1.method4509();
										local286 = Static361.aClass2_Sub7_Sub2_1.method4466();
										Static102.anIntArray157[local220] = local73;
										Static452.anIntArray487[local220] = local286;
										Static18.anIntArray300[local220] = 1;
										local292 = Static32.anIntArray54[local220] - 1;
										for (local302 = 0; local302 < local292; local302++) {
											if (Class106_Sub2_Sub1.anIntArray248[local302] <= local73) {
												Static18.anIntArray300[local220] = local302 + 2;
											}
										}
										Static422.anIntArray450[Static539.anInt8860++ & 0x1F] = local220;
										Static149.aClass349_37 = null;
										return true;
									} else if (Static149.aClass349_37 == Static245.aClass349_66) {
										local220 = Static361.aClass2_Sub7_Sub2_1.method4518();
										local73 = Static361.aClass2_Sub7_Sub2_1.method4496();
										local286 = Static361.aClass2_Sub7_Sub2_1.method4465();
										local292 = Static361.aClass2_Sub7_Sub2_1.method4467();
										if (Static86.method1273(local220)) {
											Static108.method1584(local292, 5, local73, local286);
										}
										Static149.aClass349_37 = null;
										return true;
									} else if (Static149.aClass349_37 == Static560.aClass349_156) {
										local220 = Static361.aClass2_Sub7_Sub2_1.method4521();
										local73 = Static361.aClass2_Sub7_Sub2_1.method4521();
										local286 = Static361.aClass2_Sub7_Sub2_1.method4490();
										local292 = Static361.aClass2_Sub7_Sub2_1.method4465();
										if (Static86.method1273(local292)) {
											Static63.method1086(local286, local73 + (local220 << 16));
										}
										Static149.aClass349_37 = null;
										return true;
									} else if (Static149.aClass349_37 == Static69.aClass349_85) {
										local220 = Static361.aClass2_Sub7_Sub2_1.method4521();
										local73 = Static361.aClass2_Sub7_Sub2_1.method4496();
										local286 = Static361.aClass2_Sub7_Sub2_1.method4518();
										if (Static86.method1273(local286)) {
											Static171.method2240(local73, local220);
										}
										Static149.aClass349_37 = null;
										return true;
									} else if (Static149.aClass349_37 == Static106.aClass349_43) {
										local220 = Static361.aClass2_Sub7_Sub2_1.method4515();
										local73 = Static361.aClass2_Sub7_Sub2_1.method4466();
										if (local220 == 255) {
											local73 = -1;
											local220 = -1;
										}
										Static519.method1521(local220, local73);
										Static149.aClass349_37 = null;
										return true;
									} else if (Static149.aClass349_37 == Static455.aClass349_124) {
										local220 = Static361.aClass2_Sub7_Sub2_1.method4496();
										local73 = Static361.aClass2_Sub7_Sub2_1.method4465();
										local286 = Static361.aClass2_Sub7_Sub2_1.method4486();
										local292 = Static361.aClass2_Sub7_Sub2_1.method4486();
										if (Static86.method1273(local73)) {
											Static205.method2543(local220, local292, local286);
										}
										Static149.aClass349_37 = null;
										return true;
									} else if (Static246.aClass349_67 == Static149.aClass349_37) {
										local220 = Static361.aClass2_Sub7_Sub2_1.method4521();
										if (local220 == 65535) {
											local220 = -1;
										}
										local73 = Static361.aClass2_Sub7_Sub2_1.method4467();
										local286 = Static361.aClass2_Sub7_Sub2_1.method4518();
										if (Static86.method1273(local286)) {
											Static452.method5885(local73, local220);
										}
										Static149.aClass349_37 = null;
										return true;
									} else {
										@Pc(2493) int local2493;
										@Pc(2273) boolean local2273;
										@Pc(2782) int local2782;
										@Pc(2707) int local2707;
										if (Static149.aClass349_37 == Static253.aClass349_68) {
											local220 = Static361.aClass2_Sub7_Sub2_1.method4521();
											local73 = Static361.aClass2_Sub7_Sub2_1.method4521();
											local286 = Static361.aClass2_Sub7_Sub2_1.method4518();
											local292 = Static361.aClass2_Sub7_Sub2_1.method4466();
											local302 = Static361.aClass2_Sub7_Sub2_1.method4509();
											local2273 = (local292 & 0x80) != 0;
											if (local302 >> 30 == 0) {
												@Pc(2396) Class82 local2396;
												@Pc(2412) Class148 local2412;
												@Pc(2418) Class148 local2418;
												if (local302 >> 29 != 0) {
													local1326 = local302 & 0xFFFF;
													@Pc(2609) Class2_Sub5 local2609 = (Class2_Sub5) Static436.aClass90_26.method1685((long) local1326);
													if (local2609 != null) {
														@Pc(2614) Class12_Sub2_Sub1_Sub4_Sub2 local2614 = local2609.aClass12_Sub2_Sub1_Sub4_Sub2_1;
														if (local220 == 65535) {
															local220 = -1;
														}
														@Pc(2621) boolean local2621 = true;
														local2493 = local2273 ? local2614.anInt8366 : local2614.anInt8370;
														if (local220 != -1 && local2493 != -1) {
															if (local220 == local2493) {
																local2396 = Static62.aClass49_1.method1021(local220);
																if (local2396.aBoolean116 && local2396.anInt1827 != -1) {
																	local2412 = Static117.aClass18_1.method296(local2396.anInt1827);
																	local2707 = local2412.anInt3043;
																	if (local2707 == 0 || local2707 == 2) {
																		local2621 = false;
																	} else if (local2707 == 1) {
																		local2621 = true;
																	}
																}
															} else {
																local2396 = Static62.aClass49_1.method1021(local220);
																@Pc(2650) Class82 local2650 = Static62.aClass49_1.method1021(local2493);
																if (local2396.anInt1827 != -1 && local2650.anInt1827 != -1) {
																	local2418 = Static117.aClass18_1.method296(local2396.anInt1827);
																	@Pc(2672) Class148 local2672 = Static117.aClass18_1.method296(local2650.anInt1827);
																	if (local2418.anInt3050 < local2672.anInt3050) {
																		local2621 = false;
																	}
																}
															}
														}
														if (local2621) {
															if (local2273) {
																local2614.anInt8398 = 1;
																local2614.anInt8390 = local292 & 0x7;
																local2614.anInt8362 = Static532.anInt8757 + local73;
																local2614.anInt8382 = local286;
																local2614.anInt8349 = 0;
																local2614.anInt8393 = 0;
																local2614.anInt8366 = local220;
																if (Static532.anInt8757 < local2614.anInt8362) {
																	local2614.anInt8393 = -1;
																}
																if (local2614.anInt8366 != -1 && local2614.anInt8362 == Static532.anInt8757) {
																	local2782 = Static62.aClass49_1.method1021(local2614.anInt8366).anInt1827;
																	if (local2782 != -1) {
																		local2412 = Static117.aClass18_1.method296(local2782);
																		if (local2412 != null && local2412.anIntArray254 != null && !local2614.aBoolean709) {
																			Static543.method7102(local2614, 0, local2412);
																		}
																	}
																}
															} else {
																local2614.anInt8404 = Static532.anInt8757 + local73;
																local2614.anInt8408 = 1;
																local2614.lb = 0;
																local2614.anInt8405 = 0;
																local2614.anInt8370 = local220;
																local2614.anInt8386 = local292 & 0x7;
																local2614.anInt8361 = local286;
																if (local2614.anInt8404 > Static532.anInt8757) {
																	local2614.lb = -1;
																}
																if (local2614.anInt8370 != -1 && Static532.anInt8757 == local2614.anInt8404) {
																	local2782 = Static62.aClass49_1.method1021(local2614.anInt8370).anInt1827;
																	if (local2782 != -1) {
																		local2412 = Static117.aClass18_1.method296(local2782);
																		if (local2412 != null && local2412.anIntArray254 != null && !local2614.aBoolean709) {
																			Static543.method7102(local2614, 0, local2412);
																		}
																	}
																}
															}
														}
													}
												} else if (local302 >> 28 != 0) {
													local1326 = local302 & 0xFFFF;
													@Pc(2306) Class12_Sub2_Sub1_Sub4_Sub1 local2306;
													if (local1326 == Static18.anInt4109) {
														local2306 = Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30;
													} else {
														local2306 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local1326];
													}
													if (local2306 != null) {
														if (local220 == 65535) {
															local220 = -1;
														}
														local761 = true;
														local1839 = local2273 ? local2306.anInt8366 : local2306.anInt8370;
														@Pc(2362) Class148 local2362;
														if (local220 != -1 && local1839 != -1) {
															@Pc(2348) Class82 local2348;
															if (local1839 == local220) {
																local2348 = Static62.aClass49_1.method1021(local220);
																if (local2348.aBoolean116 && local2348.anInt1827 != -1) {
																	local2362 = Static117.aClass18_1.method296(local2348.anInt1827);
																	local504 = local2362.anInt3043;
																	if (local504 == 0 || local504 == 2) {
																		local761 = false;
																	} else if (local504 == 1) {
																		local761 = true;
																	}
																}
															} else {
																local2348 = Static62.aClass49_1.method1021(local220);
																local2396 = Static62.aClass49_1.method1021(local1839);
																if (local2348.anInt1827 != -1 && local2396.anInt1827 != -1) {
																	local2412 = Static117.aClass18_1.method296(local2348.anInt1827);
																	local2418 = Static117.aClass18_1.method296(local2396.anInt1827);
																	if (local2418.anInt3050 > local2412.anInt3050) {
																		local761 = false;
																	}
																}
															}
														}
														if (local761) {
															if (local2273) {
																local2306.anInt8382 = local286;
																local2306.anInt8349 = 0;
																local2306.anInt8390 = local292 & 0x7;
																local2306.anInt8362 = Static532.anInt8757 + local73;
																local2306.anInt8366 = local220;
																local2306.anInt8393 = 0;
																local2306.anInt8398 = 1;
																if (local2306.anInt8366 == 65535) {
																	local2306.anInt8366 = -1;
																}
																if (local2306.anInt8362 > Static532.anInt8757) {
																	local2306.anInt8393 = -1;
																}
																if (local2306.anInt8366 != -1 && local2306.anInt8362 == Static532.anInt8757) {
																	local2493 = Static62.aClass49_1.method1021(local2306.anInt8366).anInt1827;
																	if (local2493 != -1) {
																		local2362 = Static117.aClass18_1.method296(local2493);
																		if (local2362 != null && local2362.anIntArray254 != null && !local2306.aBoolean709) {
																			Static543.method7102(local2306, 0, local2362);
																		}
																	}
																}
															} else {
																local2306.anInt8370 = local220;
																local2306.anInt8386 = local292 & 0x7;
																local2306.anInt8404 = Static532.anInt8757 + local73;
																local2306.anInt8405 = 0;
																local2306.anInt8408 = 1;
																local2306.anInt8361 = local286;
																local2306.lb = 0;
																if (local2306.anInt8404 > Static532.anInt8757) {
																	local2306.lb = -1;
																}
																if (local2306.anInt8370 == 65535) {
																	local2306.anInt8370 = -1;
																}
																if (local2306.anInt8370 != -1 && Static532.anInt8757 == local2306.anInt8404) {
																	local2493 = Static62.aClass49_1.method1021(local2306.anInt8370).anInt1827;
																	if (local2493 != -1) {
																		local2362 = Static117.aClass18_1.method296(local2493);
																		if (local2362 != null && local2362.anIntArray254 != null && !local2306.aBoolean709) {
																			Static543.method7102(local2306, 0, local2362);
																		}
																	}
																}
															}
														}
													}
												}
											} else {
												local1326 = local302 >> 28 & 0x3;
												local490 = (local302 >> 14 & 0x3FFF) - Static485.anInt7725;
												local494 = (local302 & 0x3FFF) - Static310.anInt5129;
												if (local490 >= 0 && local494 >= 0 && Static281.anInt4822 > local490 && local494 < Static29.anInt491) {
													local1839 = local490 * 512 + 256;
													local2493 = local494 * 512 + 256;
													local2782 = local1326;
													if (local1326 < 3 && Static562.method7350(local490, local494)) {
														local2782 = local1326 + 1;
													}
													@Pc(2980) Class12_Sub2_Sub1_Sub5 local2980 = new Class12_Sub2_Sub1_Sub5(local220, 0, Static532.anInt8757, local1326, local2782, local1839, Static24.method347(local2493, local1839, local1326) - local286, local2493, local490, local490, local494, local494, local292 & 0x7);
													Static380.aClass70_51.method1269(new Class2_Sub2_Sub5(local2980));
												}
											}
											Static149.aClass349_37 = null;
											return true;
										} else if (Static149.aClass349_37 == Static99.aClass349_23) {
											Static284.method4051(Static422.aClass262_12);
											Static149.aClass349_37 = null;
											return true;
										} else if (Static149.aClass349_37 == Static222.aClass349_58) {
											local220 = Static361.aClass2_Sub7_Sub2_1.method4521();
											local468 = Static361.aClass2_Sub7_Sub2_1.method4494();
											local286 = Static361.aClass2_Sub7_Sub2_1.method4467();
											if (Static86.method1273(local220)) {
												Static59.method1016(local286, local468);
											}
											Static149.aClass349_37 = null;
											return true;
										} else if (Static149.aClass349_37 == Static327.aClass349_94) {
											Static284.method4051(Static308.aClass262_9);
											Static149.aClass349_37 = null;
											return true;
										} else if (Static540.aClass349_146 == Static149.aClass349_37) {
											local220 = Static361.aClass2_Sub7_Sub2_1.method4517();
											local73 = Static361.aClass2_Sub7_Sub2_1.method4467();
											local286 = Static361.aClass2_Sub7_Sub2_1.method4521();
											if (Static86.method1273(local286)) {
												Static14.method242(local73, local220);
											}
											Static149.aClass349_37 = null;
											return true;
										} else {
											@Pc(3111) long local3111;
											if (Static439.aClass349_118 == Static149.aClass349_37) {
												local464 = Static361.aClass2_Sub7_Sub2_1.method4464() == 1;
												local468 = Static361.aClass2_Sub7_Sub2_1.method4494();
												local470 = local468;
												if (local464) {
													local470 = Static361.aClass2_Sub7_Sub2_1.method4494();
												}
												local481 = Static361.aClass2_Sub7_Sub2_1.method4514();
												local486 = Static361.aClass2_Sub7_Sub2_1.method4518();
												local3111 = Static361.aClass2_Sub7_Sub2_1.method4503();
												local1839 = Static361.aClass2_Sub7_Sub2_1.method4464();
												@Pc(3121) long local3121 = local3111 + (local486 << 32);
												@Pc(3123) boolean local3123 = false;
												local2707 = 0;
												while (true) {
													if (local2707 >= 100) {
														if (local1839 <= 1) {
															if (Static183.aBoolean193 && !Static438.aBoolean578 || Static395.aBoolean806) {
																local3123 = true;
															} else if (Static520.method6723(local470)) {
																local3123 = true;
															}
														}
														break;
													}
													if (local3121 == Static23.aLongArray2[local2707]) {
														local3123 = true;
														break;
													}
													local2707++;
												}
												if (!local3123 && Static12.anInt296 == 0) {
													Static23.aLongArray2[Static499.anInt7956] = local3121;
													Static499.anInt7956 = (Static499.anInt7956 + 1) % 100;
													@Pc(3186) String local3186 = Static315.method4559(Static208.method2577(Static361.aClass2_Sub7_Sub2_1));
													if (local1839 == 2 || local1839 == 3) {
														Static570.method7435(local468, 0, "<img=1>" + local470, -1, 9, local3186, Static87.method7703(local481), "<img=1>" + local468);
													} else if (local1839 == 1) {
														Static570.method7435(local468, 0, "<img=0>" + local470, -1, 9, local3186, Static87.method7703(local481), "<img=0>" + local468);
													} else {
														Static570.method7435(local468, 0, local470, -1, 9, local3186, Static87.method7703(local481), local468);
													}
												}
												Static149.aClass349_37 = null;
												return true;
											} else if (Static296.aClass349_83 == Static149.aClass349_37) {
												local220 = Static361.aClass2_Sub7_Sub2_1.method4518();
												@Pc(3287) Class12_Sub2_Sub1_Sub4_Sub1 local3287;
												if (Static18.anInt4109 == local220) {
													local3287 = Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30;
												} else {
													local3287 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local220];
												}
												if (local3287 == null) {
													Static149.aClass349_37 = null;
													return true;
												}
												local286 = Static361.aClass2_Sub7_Sub2_1.method4518();
												local292 = Static361.aClass2_Sub7_Sub2_1.method4464();
												local1167 = (local286 & 0x8000) != 0;
												if (local3287.aString75 != null && local3287.aClass300_1 != null) {
													local2273 = false;
													if (local292 <= 1) {
														if (!local1167 && (Static183.aBoolean193 && !Static438.aBoolean578 || Static395.aBoolean806)) {
															local2273 = true;
														} else if (Static520.method6723(local3287.aString75)) {
															local2273 = true;
														}
													}
													if (!local2273 && Static12.anInt296 == 0) {
														local490 = -1;
														if (local1167) {
															local286 &= 0x7FFF;
															@Pc(3369) Class205 local3369 = Static556.method7282(Static361.aClass2_Sub7_Sub2_1);
															local490 = local3369.anInt5024;
															local999 = local3369.aClass2_Sub2_Sub13_1.method4790(Static361.aClass2_Sub7_Sub2_1);
														} else {
															local999 = Static315.method4559(Static208.method2577(Static361.aClass2_Sub7_Sub2_1));
														}
														local3287.aString126 = local999.trim();
														local3287.anInt8391 = 150;
														local3287.anInt8411 = local286 & 0xFF;
														local3287.anInt8417 = local286 >> 8;
														if (local292 == 1 || local292 == 2) {
															local494 = local1167 ? 17 : 1;
														} else {
															local494 = local1167 ? 17 : 2;
														}
														if (local292 == 2) {
															Static570.method7435(local3287.aString76, 0, "<img=1>" + local3287.method4902(), local490, local494, local999, null, "<img=1>" + local3287.method4906());
														} else if (local292 == 1) {
															Static570.method7435(local3287.aString76, 0, "<img=0>" + local3287.method4902(), local490, local494, local999, null, "<img=0>" + local3287.method4906());
														} else {
															Static570.method7435(local3287.aString76, 0, local3287.method4902(), local490, local494, local999, null, local3287.method4906());
														}
													}
												}
												Static149.aClass349_37 = null;
												return true;
											} else if (Static149.aClass349_37 == Static469.aClass349_127) {
												Static307.anInt5077 = Static361.aClass2_Sub7_Sub2_1.method4515();
												Static199.anInt2913 = Static361.aClass2_Sub7_Sub2_1.method4477() << 3;
												Static262.anInt4306 = Static361.aClass2_Sub7_Sub2_1.method4477() << 3;
												while (Static528.anInt8479 > Static361.aClass2_Sub7_Sub2_1.anInt5186) {
													@Pc(3540) Class262 local3540 = Static263.method3672()[Static361.aClass2_Sub7_Sub2_1.method4464()];
													Static284.method4051(local3540);
												}
												Static149.aClass349_37 = null;
												return true;
											} else if (Static575.aClass349_159 == Static149.aClass349_37) {
												Static523.method6731();
												Static149.aClass349_37 = null;
												return false;
											} else if (Static295.aClass349_82 == Static149.aClass349_37) {
												local220 = Static361.aClass2_Sub7_Sub2_1.method4509();
												Static129.aClass5_3 = Static169.aClass99_2.method1783(local220);
												Static149.aClass349_37 = null;
												return true;
											} else if (Static74.aClass349_20 == Static149.aClass349_37) {
												local220 = Static361.aClass2_Sub7_Sub2_1.method4465();
												local73 = Static361.aClass2_Sub7_Sub2_1.method4517();
												local286 = Static361.aClass2_Sub7_Sub2_1.method4518();
												local292 = Static361.aClass2_Sub7_Sub2_1.method4496();
												local302 = Static361.aClass2_Sub7_Sub2_1.method4521();
												if (Static86.method1273(local286)) {
													Static108.method1584(local292, 7, local73, local302 | local220 << 16);
												}
												Static149.aClass349_37 = null;
												return true;
											} else if (Static149.aClass349_37 == Static229.aClass349_59) {
												local220 = Static361.aClass2_Sub7_Sub2_1.method4465();
												local73 = Static361.aClass2_Sub7_Sub2_1.method4465();
												local286 = Static361.aClass2_Sub7_Sub2_1.method4465();
												local292 = Static361.aClass2_Sub7_Sub2_1.method4509();
												local302 = Static361.aClass2_Sub7_Sub2_1.method4518();
												if (Static86.method1273(local302)) {
													Static12.method220(local73, local286, local292, local220);
												}
												Static149.aClass349_37 = null;
												return true;
											} else {
												@Pc(3686) String local3686;
												if (Static149.aClass349_37 == Static143.aClass349_126) {
													local220 = Static361.aClass2_Sub7_Sub2_1.method4517();
													if (local220 == 65535) {
														local220 = -1;
													}
													local73 = Static361.aClass2_Sub7_Sub2_1.method4515();
													local286 = Static361.aClass2_Sub7_Sub2_1.method4464();
													local3686 = Static361.aClass2_Sub7_Sub2_1.method4494();
													if (local286 >= 1 && local286 <= 8) {
														if (local3686.equalsIgnoreCase("null")) {
															local3686 = null;
														}
														Static14.aStringArray4[local286 - 1] = local3686;
														Static594.anIntArray618[local286 - 1] = local220;
														Static262.aBooleanArray18[local286 - 1] = local73 == 0;
													}
													Static149.aClass349_37 = null;
													return true;
												} else if (Static149.aClass349_37 == Static551.aClass349_149) {
													Static96.method1454(Static169.aClass99_2, Static361.aClass2_Sub7_Sub2_1, Static528.anInt8479);
													Static149.aClass349_37 = null;
													return true;
												} else if (Static213.aClass349_57 == Static149.aClass349_37) {
													local220 = Static361.aClass2_Sub7_Sub2_1.method4458();
													local73 = Static361.aClass2_Sub7_Sub2_1.method4509();
													local286 = Static361.aClass2_Sub7_Sub2_1.method4464();
													local3686 = "";
													local963 = local3686;
													if ((local286 & 0x1) != 0) {
														local3686 = Static361.aClass2_Sub7_Sub2_1.method4494();
														if ((local286 & 0x2) == 0) {
															local963 = local3686;
														} else {
															local963 = Static361.aClass2_Sub7_Sub2_1.method4494();
														}
													}
													local719 = Static361.aClass2_Sub7_Sub2_1.method4494();
													if (local220 == 99) {
														Static144.method1990(local719);
													} else if (local963.equals("") || !Static520.method6723(local963)) {
														Static316.method4596(local963, local220, local719, local3686, local3686, local73);
													} else {
														Static149.aClass349_37 = null;
														return true;
													}
													Static149.aClass349_37 = null;
													return true;
												} else if (Static149.aClass349_37 == Static169.aClass349_44) {
													Static149.aClass349_37 = null;
													Static586.anInt9519 = Static390.anInt6454;
													Static196.anInt2849 = 1;
													return true;
												} else if (Static149.aClass349_37 == Static210.aClass349_55) {
													Static284.method4051(Static235.aClass262_6);
													Static149.aClass349_37 = null;
													return true;
												} else if (Static149.aClass349_37 == Static558.aClass349_155) {
													local220 = Static361.aClass2_Sub7_Sub2_1.method4521();
													local73 = Static361.aClass2_Sub7_Sub2_1.method4509();
													if (Static86.method1273(local220)) {
														if (local73 == -1) {
															Static148.anInt2359 = -1;
															Static203.anInt2978 = -1;
														} else {
															local286 = local73 >> 14 & 0x3FFF;
															local292 = local73 & 0x3FFF;
															local286 -= Static485.anInt7725;
															local292 -= Static310.anInt5129;
															if (local286 < 0) {
																local286 = 0;
															} else if (Static281.anInt4822 <= local286) {
																local286 = Static281.anInt4822;
															}
															Static148.anInt2359 = (local286 << 9) + 256;
															if (local292 < 0) {
																local292 = 0;
															} else if (local292 >= Static29.anInt491) {
																local292 = Static29.anInt491;
															}
															Static203.anInt2978 = (local292 << 9) + 256;
														}
													}
													Static149.aClass349_37 = null;
													return true;
												} else if (Static149.aClass349_37 == Static474.aClass349_129) {
													local220 = Static361.aClass2_Sub7_Sub2_1.method4490();
													local73 = Static361.aClass2_Sub7_Sub2_1.method4465();
													if (Static86.method1273(local73)) {
														Static108.method1584(local220, 5, 0, Static18.anInt4109);
													}
													Static149.aClass349_37 = null;
													return true;
												} else if (Static435.aClass349_116 == Static149.aClass349_37) {
													local464 = Static361.aClass2_Sub7_Sub2_1.method4464() == 1;
													local468 = Static361.aClass2_Sub7_Sub2_1.method4494();
													local470 = local468;
													if (local464) {
														local470 = Static361.aClass2_Sub7_Sub2_1.method4494();
													}
													local481 = Static361.aClass2_Sub7_Sub2_1.method4518();
													local486 = Static361.aClass2_Sub7_Sub2_1.method4503();
													local490 = Static361.aClass2_Sub7_Sub2_1.method4464();
													@Pc(3998) long local3998 = (local481 << 32) + local486;
													@Pc(4000) boolean local4000 = false;
													local2782 = 0;
													while (true) {
														if (local2782 >= 100) {
															if (local490 <= 1) {
																if (Static183.aBoolean193 && !Static438.aBoolean578 || Static395.aBoolean806) {
																	local4000 = true;
																} else if (Static520.method6723(local470)) {
																	local4000 = true;
																}
															}
															break;
														}
														if (local3998 == Static23.aLongArray2[local2782]) {
															local4000 = true;
															break;
														}
														local2782++;
													}
													if (!local4000 && Static12.anInt296 == 0) {
														Static23.aLongArray2[Static499.anInt7956] = local3998;
														Static499.anInt7956 = (Static499.anInt7956 + 1) % 100;
														@Pc(4063) String local4063 = Static315.method4559(Static208.method2577(Static361.aClass2_Sub7_Sub2_1));
														if (local490 == 2) {
															Static570.method7435(local468, 0, "<img=1>" + local470, -1, 7, local4063, null, "<img=1>" + local468);
														} else if (local490 == 1) {
															Static570.method7435(local468, 0, "<img=0>" + local470, -1, 7, local4063, null, "<img=0>" + local468);
														} else {
															Static570.method7435(local468, 0, local470, -1, 3, local4063, null, local468);
														}
													}
													Static149.aClass349_37 = null;
													return true;
												} else if (Static149.aClass349_37 == Static460.aClass349_125) {
													Static416.anInt2616 = Static361.aClass2_Sub7_Sub2_1.method4478();
													Static149.aClass349_37 = null;
													Static181.anInt2687 = Static390.anInt6454;
													return true;
												} else if (Static149.aClass349_37 == Static45.aClass349_14) {
													Static225.anInt3293 = Static361.aClass2_Sub7_Sub2_1.method4464();
													for (local220 = 0; local220 < Static225.anInt3293; local220++) {
														Static582.aStringArray44[local220] = Static361.aClass2_Sub7_Sub2_1.method4494();
														Static78.aStringArray9[local220] = Static361.aClass2_Sub7_Sub2_1.method4494();
														if (Static78.aStringArray9[local220].equals("")) {
															Static78.aStringArray9[local220] = Static582.aStringArray44[local220];
														}
														Static117.aStringArray13[local220] = Static361.aClass2_Sub7_Sub2_1.method4494();
														Static493.aStringArray36[local220] = Static361.aClass2_Sub7_Sub2_1.method4494();
														if (Static493.aStringArray36[local220].equals("")) {
															Static493.aStringArray36[local220] = Static117.aStringArray13[local220];
														}
														Static429.aBooleanArray24[local220] = false;
													}
													Static586.anInt9519 = Static390.anInt6454;
													Static149.aClass349_37 = null;
													return true;
												} else if (Static149.aClass349_37 == Static99.aClass349_24) {
													local220 = Static361.aClass2_Sub7_Sub2_1.method4509();
													local73 = Static361.aClass2_Sub7_Sub2_1.method4518();
													Static426.aClass160_1.method2787(local220, local73);
													Static149.aClass349_37 = null;
													return true;
												} else if (Static9.aClass349_6 == Static149.aClass349_37) {
													local220 = Static361.aClass2_Sub7_Sub2_1.method4509();
													local73 = Static361.aClass2_Sub7_Sub2_1.method4517();
													Static426.aClass160_1.method2785(local73, local220);
													Static149.aClass349_37 = null;
													return true;
												} else if (Static340.aClass349_97 == Static149.aClass349_37) {
													Static134.aClass68_1 = Static428.method5681(Static361.aClass2_Sub7_Sub2_1.method4464());
													Static149.aClass349_37 = null;
													return true;
												} else if (Static149.aClass349_37 == Static399.aClass349_111) {
													local220 = Static361.aClass2_Sub7_Sub2_1.method4518();
													local468 = Static361.aClass2_Sub7_Sub2_1.method4494();
													@Pc(4291) Object[] local4291 = new Object[local468.length() + 1];
													for (local292 = local468.length() - 1; local292 >= 0; local292--) {
														if (local468.charAt(local292) == 's') {
															local4291[local292 + 1] = Static361.aClass2_Sub7_Sub2_1.method4494();
														} else {
															local4291[local292 + 1] = Integer.valueOf(Static361.aClass2_Sub7_Sub2_1.method4509());
														}
													}
													local4291[0] = Integer.valueOf(Static361.aClass2_Sub7_Sub2_1.method4509());
													if (Static86.method1273(local220)) {
														@Pc(4347) Class2_Sub10 local4347 = new Class2_Sub10();
														local4347.anObjectArray1 = local4291;
														Static566.method7398(local4347);
													}
													Static149.aClass349_37 = null;
													return true;
												} else if (Static149.aClass349_37 == Static172.aClass349_45) {
													local1899 = Static361.aClass2_Sub7_Sub2_1.method4477();
													local73 = Static361.aClass2_Sub7_Sub2_1.method4465();
													local286 = Static361.aClass2_Sub7_Sub2_1.method4518();
													if (Static86.method1273(local73)) {
														Static14.method242(local1899, local286);
													}
													Static149.aClass349_37 = null;
													return true;
												} else if (Static151.aClass349_39 == Static149.aClass349_37) {
													Static262.anInt4306 = Static361.aClass2_Sub7_Sub2_1.method4505() << 3;
													Static307.anInt5077 = Static361.aClass2_Sub7_Sub2_1.method4464();
													Static199.anInt2913 = Static361.aClass2_Sub7_Sub2_1.method4505() << 3;
													Static149.aClass349_37 = null;
													return true;
												} else if (Static304.aClass349_84 == Static149.aClass349_37) {
													Static284.method4051(Static84.aClass262_17);
													Static149.aClass349_37 = null;
													return true;
												} else if (Static149.aClass349_37 == Static194.aClass349_51) {
													if (Static122.anInt2094 != -1) {
														Static134.method1813(0, Static122.anInt2094);
													}
													Static149.aClass349_37 = null;
													return true;
												} else if (Static283.aClass349_148 == Static149.aClass349_37) {
													if (Static43.aFrame1 != null) {
														Static51.method873(-1, false, -1, Static257.aClass2_Sub35_Sub1_1.anInt7491);
													}
													@Pc(4446) byte[] local4446 = new byte[Static528.anInt8479];
													Static361.aClass2_Sub7_Sub2_1.method4533(Static528.anInt8479, local4446);
													local468 = Static72.method1195(0, local4446, Static528.anInt8479);
													Static531.method6989(Static169.aClass99_2, true, local468, Static226.anInt3318 == 1);
													Static149.aClass349_37 = null;
													return true;
												} else if (Static149.aClass349_37 == Static211.aClass349_56) {
													Static199.anInt2913 = Static361.aClass2_Sub7_Sub2_1.method4477() << 3;
													Static262.anInt4306 = Static361.aClass2_Sub7_Sub2_1.method4477() << 3;
													Static307.anInt5077 = Static361.aClass2_Sub7_Sub2_1.method4488();
													for (@Pc(4503) Class2_Sub6 local4503 = (Class2_Sub6) Static531.aClass90_39.method1676(); local4503 != null; local4503 = (Class2_Sub6) Static531.aClass90_39.method1680()) {
														local73 = (int) (local4503.aLong268 >> 28 & 0x3L);
														local286 = (int) (local4503.aLong268 & 0x3FFFL);
														local292 = local286 - Static485.anInt7725;
														local302 = (int) (local4503.aLong268 >> 14 & 0x3FFFL);
														local308 = local302 - Static310.anInt5129;
														if (local73 == Static307.anInt5077 && Static199.anInt2913 <= local292 && local292 < Static199.anInt2913 + 8 && local308 >= Static262.anInt4306 && Static262.anInt4306 + 8 > local308) {
															local4503.method7657();
															if (local292 >= 0 && local308 >= 0 && local292 < Static281.anInt4822 && local308 < Static29.anInt491) {
																Static570.method7436(Static307.anInt5077, local308, local292);
															}
														}
													}
													for (@Pc(4604) Class2_Sub21 local4604 = (Class2_Sub21) Static246.aClass70_25.method1264(); local4604 != null; local4604 = (Class2_Sub21) Static246.aClass70_25.method1261()) {
														if (local4604.anInt3036 >= Static199.anInt2913 && Static199.anInt2913 + 8 > local4604.anInt3036 && Static262.anInt4306 <= local4604.anInt3030 && local4604.anInt3030 < Static262.anInt4306 + 8 && local4604.anInt3031 == Static307.anInt5077) {
															local4604.anInt3026 = 0;
														}
													}
													Static149.aClass349_37 = null;
													return true;
												} else {
													@Pc(4655) String local4655;
													if (Static149.aClass349_37 == Static183.aClass349_47) {
														local4655 = Static361.aClass2_Sub7_Sub2_1.method4494();
														local73 = Static361.aClass2_Sub7_Sub2_1.method4521();
														local286 = Static361.aClass2_Sub7_Sub2_1.method4517();
														if (Static86.method1273(local286)) {
															Static117.method1704(local4655, local73);
														}
														Static149.aClass349_37 = null;
														return true;
													} else if (Static151.aClass349_40 == Static149.aClass349_37) {
														local220 = Static361.aClass2_Sub7_Sub2_1.method4465();
														local73 = Static361.aClass2_Sub7_Sub2_1.method4466();
														local286 = Static361.aClass2_Sub7_Sub2_1.method4521();
														if (Static86.method1273(local286)) {
															if (local73 == 2) {
																Static311.method4448();
															}
															Static122.anInt2094 = local220;
															Static136.method1875(local220);
															Static579.method7524(false);
															Static566.method7401(Static122.anInt2094);
															for (local292 = 0; local292 < 100; local292++) {
																Static255.aBooleanArray17[local292] = true;
															}
														}
														Static149.aClass349_37 = null;
														return true;
													} else if (Static149.aClass349_37 == Static577.aClass349_163) {
														Static80.method1226();
														Static149.aClass349_37 = null;
														return true;
													} else if (Static149.aClass349_37 == Static282.aClass349_80) {
														local464 = Static361.aClass2_Sub7_Sub2_1.method4515() == 1;
														local73 = Static361.aClass2_Sub7_Sub2_1.method4521();
														if (Static86.method1273(local73)) {
															Static209.aBoolean218 = local464;
														}
														Static149.aClass349_37 = null;
														return true;
													} else if (Static149.aClass349_37 == Static553.aClass349_151) {
														local220 = Static361.aClass2_Sub7_Sub2_1.method4521();
														local73 = Static361.aClass2_Sub7_Sub2_1.method4521();
														if (local73 == 65535) {
															local73 = -1;
														}
														local286 = Static361.aClass2_Sub7_Sub2_1.method4465();
														local292 = Static361.aClass2_Sub7_Sub2_1.method4496();
														local302 = Static361.aClass2_Sub7_Sub2_1.method4465();
														if (local302 == 65535) {
															local302 = -1;
														}
														if (Static86.method1273(local220)) {
															for (local308 = local302; local308 <= local73; local308++) {
																local1505 = (long) local308 + ((long) local292 << 32);
																local1511 = (Class2_Sub23) Static323.aClass90_16.method1685(local1505);
																if (local1511 != null) {
																	local1520 = new Class2_Sub23(local1511.anInt3330, local286);
																	local1511.method7657();
																} else if (local308 == -1) {
																	local1520 = new Class2_Sub23(Static594.method7731(local292).aClass2_Sub23_2.anInt3330, local286);
																} else {
																	local1520 = new Class2_Sub23(0, local286);
																}
																Static323.aClass90_16.method1684(local1520, local1505);
															}
														}
														Static149.aClass349_37 = null;
														return true;
													} else if (Static149.aClass349_37 == Static199.aClass349_53) {
														local220 = Static361.aClass2_Sub7_Sub2_1.method4517();
														local73 = Static361.aClass2_Sub7_Sub2_1.method4517();
														local286 = Static361.aClass2_Sub7_Sub2_1.method4521();
														if (Static86.method1273(local220)) {
															Static280.method4042(local73, local286);
														}
														Static149.aClass349_37 = null;
														return true;
													} else if (Static267.aClass349_157 == Static149.aClass349_37) {
														local220 = Static361.aClass2_Sub7_Sub2_1.method4515();
														local73 = Static361.aClass2_Sub7_Sub2_1.method4466();
														local286 = Static361.aClass2_Sub7_Sub2_1.method4517();
														if (local286 == 65535) {
															local286 = -1;
														}
														Static63.method1089(local73, local220, local286);
														Static149.aClass349_37 = null;
														return true;
													} else if (Static60.aClass349_18 == Static149.aClass349_37) {
														local220 = Static361.aClass2_Sub7_Sub2_1.method4483();
														local73 = Static361.aClass2_Sub7_Sub2_1.method4465();
														if (local73 == 65535) {
															local73 = -1;
														}
														local286 = Static361.aClass2_Sub7_Sub2_1.method4464();
														Static248.method3531(local220, local286, local73);
														Static149.aClass349_37 = null;
														return true;
													} else if (Static312.aClass349_91 == Static149.aClass349_37) {
														Static259.anInt4287 = Static361.aClass2_Sub7_Sub2_1.method4464();
														Static181.anInt2687 = Static390.anInt6454;
														Static149.aClass349_37 = null;
														return true;
													} else if (Static149.aClass349_37 == Static385.aClass349_107) {
														Static284.method4051(Static220.aClass262_5);
														Static149.aClass349_37 = null;
														return true;
													} else if (Static20.aClass349_9 == Static149.aClass349_37) {
														local220 = Static361.aClass2_Sub7_Sub2_1.method4518();
														local73 = Static361.aClass2_Sub7_Sub2_1.method4464();
														local286 = Static361.aClass2_Sub7_Sub2_1.method4464();
														local292 = Static361.aClass2_Sub7_Sub2_1.method4518() << 2;
														local302 = Static361.aClass2_Sub7_Sub2_1.method4464();
														local308 = Static361.aClass2_Sub7_Sub2_1.method4464();
														if (Static86.method1273(local220)) {
															Static297.method4279(local292, local302, local73, local286, local308);
														}
														Static149.aClass349_37 = null;
														return true;
													} else if (Static149.aClass349_37 == Static254.aClass349_121) {
														local220 = Static361.aClass2_Sub7_Sub2_1.method4509();
														local73 = Static361.aClass2_Sub7_Sub2_1.method4521();
														local286 = Static361.aClass2_Sub7_Sub2_1.method4518();
														if (Static86.method1273(local73)) {
															Static148.method2025(local220, local286);
														}
														Static149.aClass349_37 = null;
														return true;
													} else if (Static438.aClass349_117 == Static149.aClass349_37) {
														local220 = Static361.aClass2_Sub7_Sub2_1.method4518();
														if (local220 == 65535) {
															local220 = -1;
														}
														local73 = Static361.aClass2_Sub7_Sub2_1.method4490();
														local286 = Static361.aClass2_Sub7_Sub2_1.method4518();
														local292 = Static361.aClass2_Sub7_Sub2_1.method4467();
														if (Static86.method1273(local286)) {
															Static564.method7370(local73, local220, local292);
															@Pc(5110) Class164 local5110 = Static466.aClass130_2.method2311(local220);
															Static12.method220(local5110.anInt3827, local5110.anInt3868, local73, local5110.anInt3881);
															Static45.method806(local5110.anInt3887, local5110.anInt3876, local73, local5110.anInt3828);
														}
														Static149.aClass349_37 = null;
														return true;
													} else if (Static234.aClass349_63 == Static149.aClass349_37) {
														local220 = Static361.aClass2_Sub7_Sub2_1.method4464();
														@Pc(5148) boolean local5148 = (local220 & 0x1) == 1;
														local470 = Static361.aClass2_Sub7_Sub2_1.method4494();
														local3686 = Static361.aClass2_Sub7_Sub2_1.method4494();
														if (local3686.equals("")) {
															local3686 = local470;
														}
														local963 = Static361.aClass2_Sub7_Sub2_1.method4494();
														local719 = Static361.aClass2_Sub7_Sub2_1.method4494();
														if (local719.equals("")) {
															local719 = local963;
														}
														if (local5148) {
															for (local1326 = 0; local1326 < Static225.anInt3293; local1326++) {
																if (Static78.aStringArray9[local1326].equals(local719)) {
																	Static582.aStringArray44[local1326] = local470;
																	Static78.aStringArray9[local1326] = local3686;
																	Static117.aStringArray13[local1326] = local963;
																	Static493.aStringArray36[local1326] = local719;
																	break;
																}
															}
														} else {
															Static582.aStringArray44[Static225.anInt3293] = local470;
															Static78.aStringArray9[Static225.anInt3293] = local3686;
															Static117.aStringArray13[Static225.anInt3293] = local963;
															Static493.aStringArray36[Static225.anInt3293] = local719;
															Static429.aBooleanArray24[Static225.anInt3293] = (local220 & 0x2) == 2;
															Static225.anInt3293++;
														}
														Static586.anInt9519 = Static390.anInt6454;
														Static149.aClass349_37 = null;
														return true;
													} else if (Static322.aClass349_164 == Static149.aClass349_37) {
														Static449.method5858(false);
														Static149.aClass349_37 = null;
														return false;
													} else if (Static16.aClass349_8 == Static149.aClass349_37) {
														local220 = Static361.aClass2_Sub7_Sub2_1.method4509();
														local73 = Static361.aClass2_Sub7_Sub2_1.method4517();
														if (local73 == 65535) {
															local73 = -1;
														}
														local286 = Static361.aClass2_Sub7_Sub2_1.method4518();
														if (Static86.method1273(local286)) {
															Static108.method1584(local220, 2, -1, local73);
														}
														Static149.aClass349_37 = null;
														return true;
													} else if (Static149.aClass349_37 == Static385.aClass349_106) {
														Static284.method4051(Static591.aClass262_18);
														Static149.aClass349_37 = null;
														return true;
													} else if (Static526.aClass349_168 == Static149.aClass349_37) {
														Static284.method4051(Static157.aClass262_4);
														Static149.aClass349_37 = null;
														return true;
													} else if (Static282.aClass349_79 == Static149.aClass349_37) {
														Static284.method4051(Static543.aClass262_14);
														Static149.aClass349_37 = null;
														return true;
													} else if (Static549.aClass349_147 == Static149.aClass349_37) {
														if (Static397.method5446(Static540.anInt8912)) {
															Static593.anInt9634 = (int) ((float) Static361.aClass2_Sub7_Sub2_1.method4518() * 2.5F);
														} else {
															Static593.anInt9634 = Static361.aClass2_Sub7_Sub2_1.method4518() * 30;
														}
														Static181.anInt2687 = Static390.anInt6454;
														Static149.aClass349_37 = null;
														return true;
													} else if (Static209.aClass349_54 == Static149.aClass349_37) {
														local220 = Static361.aClass2_Sub7_Sub2_1.method4521();
														local73 = Static361.aClass2_Sub7_Sub2_1.method4509();
														local286 = Static361.aClass2_Sub7_Sub2_1.method4465();
														if (local286 == 65535) {
															local286 = -1;
														}
														if (Static86.method1273(local220)) {
															Static108.method1584(local73, 1, -1, local286);
														}
														Static149.aClass349_37 = null;
														return true;
													} else if (Static149.aClass349_37 == Static30.aClass349_12) {
														Static245.method3484();
														Static149.aClass349_37 = null;
														return false;
													} else if (Static149.aClass349_37 == Static384.aClass349_105) {
														local220 = Static361.aClass2_Sub7_Sub2_1.method4515();
														local73 = Static361.aClass2_Sub7_Sub2_1.method4518();
														@Pc(5415) int[] local5415 = new int[4];
														for (local292 = 0; local292 < 4; local292++) {
															local5415[local292] = Static361.aClass2_Sub7_Sub2_1.method4465();
														}
														@Pc(5440) Class2_Sub5 local5440 = (Class2_Sub5) Static436.aClass90_26.method1685((long) local73);
														if (local5440 != null) {
															Static369.method7665(local5415, local5440.aClass12_Sub2_Sub1_Sub4_Sub2_1, local220);
														}
														Static149.aClass349_37 = null;
														return true;
													} else if (Static149.aClass349_37 == Static584.aClass349_165) {
														local220 = Static361.aClass2_Sub7_Sub2_1.method4518();
														if (local220 == 65535) {
															local220 = -1;
														}
														local73 = Static361.aClass2_Sub7_Sub2_1.method4464();
														local286 = Static361.aClass2_Sub7_Sub2_1.method4518();
														local292 = Static361.aClass2_Sub7_Sub2_1.method4464();
														local302 = Static361.aClass2_Sub7_Sub2_1.method4518();
														Static86.method1275(local292, local220, local302, local286, local73);
														Static149.aClass349_37 = null;
														return true;
													} else if (Static426.aClass349_115 == Static149.aClass349_37) {
														local464 = Static361.aClass2_Sub7_Sub2_1.method4464() == 1;
														local468 = Static361.aClass2_Sub7_Sub2_1.method4494();
														local470 = local468;
														if (local464) {
															local470 = Static361.aClass2_Sub7_Sub2_1.method4494();
														}
														local292 = Static361.aClass2_Sub7_Sub2_1.method4464();
														local302 = Static361.aClass2_Sub7_Sub2_1.method4518();
														local2273 = false;
														if (local292 <= 1 && Static520.method6723(local470)) {
															local2273 = true;
														}
														if (!local2273 && Static12.anInt296 == 0) {
															local999 = Static330.aClass227_2.method4797(local302).method4790(Static361.aClass2_Sub7_Sub2_1);
															if (local292 == 2) {
																Static570.method7435(local468, 0, "<img=1>" + local470, local302, 25, local999, null, "<img=1>" + local468);
															} else if (local292 == 1) {
																Static570.method7435(local468, 0, "<img=0>" + local470, local302, 25, local999, null, "<img=0>" + local468);
															} else {
																Static570.method7435(local468, 0, local470, local302, 25, local999, null, local468);
															}
														}
														Static149.aClass349_37 = null;
														return true;
													} else if (Static149.aClass349_37 == Static405.aClass349_113) {
														Static172.method2258(Static361.aClass2_Sub7_Sub2_1.method4494());
														Static149.aClass349_37 = null;
														return true;
													} else if (Static524.aClass349_138 == Static149.aClass349_37) {
														local4655 = Static361.aClass2_Sub7_Sub2_1.method4494();
														local1295 = Static361.aClass2_Sub7_Sub2_1.method4464() == 1;
														if (local1295) {
															local468 = Static361.aClass2_Sub7_Sub2_1.method4494();
														} else {
															local468 = local4655;
														}
														local292 = Static361.aClass2_Sub7_Sub2_1.method4518();
														@Pc(5676) byte local5676 = Static361.aClass2_Sub7_Sub2_1.method4477();
														local2273 = false;
														if (local5676 == -128) {
															local2273 = true;
														}
														if (local2273) {
															if (Static399.anInt6590 == 0) {
																Static149.aClass349_37 = null;
																return true;
															}
															for (local1326 = 0; Static399.anInt6590 > local1326 && (!Static502.aClass53Array1[local1326].aString13.equals(local468) || Static502.aClass53Array1[local1326].anInt1144 != local292); local1326++) {
															}
															if (local1326 < Static399.anInt6590) {
																while (Static399.anInt6590 - 1 > local1326) {
																	Static502.aClass53Array1[local1326] = Static502.aClass53Array1[local1326 + 1];
																	local1326++;
																}
																Static399.anInt6590--;
																Static502.aClass53Array1[Static399.anInt6590] = null;
															}
														} else {
															local999 = Static361.aClass2_Sub7_Sub2_1.method4494();
															local1857 = new Class53();
															local1857.aString15 = local4655;
															local1857.aString13 = local468;
															local1857.aString11 = Static273.method3974(local1857.aString13);
															local1857.anInt1144 = local292;
															local1857.aString12 = local999;
															local1857.aByte13 = local5676;
															for (local494 = Static399.anInt6590 - 1; local494 >= 0; local494--) {
																local1839 = Static502.aClass53Array1[local494].aString11.compareTo(local1857.aString11);
																if (local1839 == 0) {
																	Static502.aClass53Array1[local494].anInt1144 = local292;
																	Static502.aClass53Array1[local494].aByte13 = local5676;
																	Static502.aClass53Array1[local494].aString12 = local999;
																	if (local468.equals(Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aString75)) {
																		Static2.aByte1 = local5676;
																	}
																	Static149.aClass349_37 = null;
																	Static248.anInt4116 = Static390.anInt6454;
																	return true;
																}
																if (local1839 < 0) {
																	break;
																}
															}
															if (Static399.anInt6590 >= Static502.aClass53Array1.length) {
																Static149.aClass349_37 = null;
																return true;
															}
															for (local1839 = Static399.anInt6590 - 1; local1839 > local494; local1839--) {
																Static502.aClass53Array1[local1839 + 1] = Static502.aClass53Array1[local1839];
															}
															if (Static399.anInt6590 == 0) {
																Static502.aClass53Array1 = new Class53[100];
															}
															Static502.aClass53Array1[local494 + 1] = local1857;
															Static399.anInt6590++;
															if (local468.equals(Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aString75)) {
																Static2.aByte1 = local5676;
															}
														}
														Static248.anInt4116 = Static390.anInt6454;
														Static149.aClass349_37 = null;
														return true;
													} else if (Static577.aClass349_161 == Static149.aClass349_37) {
														Static449.anInt7189 = Static361.aClass2_Sub7_Sub2_1.method4464();
														Static149.aClass349_37 = null;
														return true;
													} else if (Static241.aClass349_65 == Static149.aClass349_37) {
														local464 = Static361.aClass2_Sub7_Sub2_1.method4464() == 1;
														local468 = Static361.aClass2_Sub7_Sub2_1.method4494();
														local470 = local468;
														if (local464) {
															local470 = Static361.aClass2_Sub7_Sub2_1.method4494();
														}
														local481 = Static361.aClass2_Sub7_Sub2_1.method4514();
														local486 = Static361.aClass2_Sub7_Sub2_1.method4518();
														local3111 = Static361.aClass2_Sub7_Sub2_1.method4503();
														local1839 = Static361.aClass2_Sub7_Sub2_1.method4464();
														local2493 = Static361.aClass2_Sub7_Sub2_1.method4518();
														@Pc(5971) long local5971 = (local486 << 32) + local3111;
														@Pc(5973) boolean local5973 = false;
														@Pc(5975) int local5975 = 0;
														while (true) {
															if (local5975 >= 100) {
																if (local1839 <= 1 && Static520.method6723(local470)) {
																	local5973 = true;
																}
																break;
															}
															if (Static23.aLongArray2[local5975] == local5971) {
																local5973 = true;
																break;
															}
															local5975++;
														}
														if (!local5973 && Static12.anInt296 == 0) {
															Static23.aLongArray2[Static499.anInt7956] = local5971;
															Static499.anInt7956 = (Static499.anInt7956 + 1) % 100;
															@Pc(6027) String local6027 = Static330.aClass227_2.method4797(local2493).method4790(Static361.aClass2_Sub7_Sub2_1);
															if (local1839 == 2) {
																Static570.method7435(local468, 0, "<img=1>" + local470, local2493, 20, local6027, Static87.method7703(local481), "<img=1>" + local468);
															} else if (local1839 == 1) {
																Static570.method7435(local468, 0, "<img=0>" + local470, local2493, 20, local6027, Static87.method7703(local481), "<img=0>" + local468);
															} else {
																Static570.method7435(local468, 0, local470, local2493, 20, local6027, Static87.method7703(local481), local468);
															}
														}
														Static149.aClass349_37 = null;
														return true;
													} else if (Static149.aClass349_37 == Static395.aClass349_167) {
														Static284.method4051(Static575.aClass262_16);
														Static149.aClass349_37 = null;
														return true;
													} else if (Static186.aClass349_48 == Static149.aClass349_37) {
														local220 = Static361.aClass2_Sub7_Sub2_1.method4464();
														local73 = local220 >> 2;
														local286 = local220 & 0x3;
														local292 = Static175.anIntArray358[local73];
														local302 = Static361.aClass2_Sub7_Sub2_1.method4517();
														if (local302 == 65535) {
															local302 = -1;
														}
														local308 = Static361.aClass2_Sub7_Sub2_1.method4509();
														local1326 = local308 >> 28 & 0x3;
														local490 = local308 >> 14 & 0x3FFF;
														local494 = local308 & 0x3FFF;
														@Pc(6167) int local6167 = local490 - Static485.anInt7725;
														@Pc(6171) int local6171 = local494 - Static310.anInt5129;
														Static576.method7468(local1326, local286, local6171, local292, local302, local6167, local73);
														Static149.aClass349_37 = null;
														return true;
													} else if (Static492.aClass349_131 == Static149.aClass349_37) {
														local220 = Static361.aClass2_Sub7_Sub2_1.method4490();
														local73 = Static361.aClass2_Sub7_Sub2_1.method4461();
														local286 = Static361.aClass2_Sub7_Sub2_1.method4517();
														if (Static86.method1273(local286)) {
															Static348.method5033(local220, local73);
														}
														Static149.aClass349_37 = null;
														return true;
													} else if (Static475.aClass349_90 == Static149.aClass349_37) {
														local4655 = Static361.aClass2_Sub7_Sub2_1.method4494();
														local468 = Static315.method4559(Static208.method2577(Static361.aClass2_Sub7_Sub2_1));
														Static316.method4596(local4655, 6, local468, local4655, local4655, 0);
														Static149.aClass349_37 = null;
														return true;
													} else if (Static236.aClass349_64 == Static149.aClass349_37) {
														local220 = Static361.aClass2_Sub7_Sub2_1.method4466();
														local73 = Static361.aClass2_Sub7_Sub2_1.method4518();
														local1295 = (local220 & 0x1) == 1;
														Static214.method2620(local1295, local73);
														Static409.anIntArray428[Static375.anInt6283++ & 0x1F] = local73;
														Static149.aClass349_37 = null;
														return true;
													} else if (Static149.aClass349_37 == Static309.aClass349_86) {
														Static282.anInt4827 = Static361.aClass2_Sub7_Sub2_1.method4470();
														Static183.aBoolean193 = Static361.aClass2_Sub7_Sub2_1.method4464() == 1;
														Static149.aClass349_37 = null;
														return true;
													} else if (Static473.aClass349_128 == Static149.aClass349_37) {
														local220 = Static361.aClass2_Sub7_Sub2_1.method4518();
														if (local220 == 65535) {
															local220 = -1;
														}
														local73 = Static361.aClass2_Sub7_Sub2_1.method4464();
														local286 = Static361.aClass2_Sub7_Sub2_1.method4518();
														local292 = Static361.aClass2_Sub7_Sub2_1.method4464();
														Static351.method5040(true, local73, local286, 256, local220, local292);
														Static149.aClass349_37 = null;
														return true;
													} else if (Static536.aClass349_143 == Static149.aClass349_37) {
														local220 = Static361.aClass2_Sub7_Sub2_1.method4464();
														local73 = local220 >> 5;
														local286 = local220 & 0x1F;
														if (local286 == 0) {
															Static271.aClass80Array1[local73] = null;
															Static149.aClass349_37 = null;
															return true;
														}
														@Pc(6372) Class80 local6372 = new Class80();
														local6372.anInt1806 = local286;
														local6372.anInt1801 = Static361.aClass2_Sub7_Sub2_1.method4464();
														if (local6372.anInt1801 >= 0 && Static317.aClass38Array17.length > local6372.anInt1801) {
															if (local6372.anInt1806 == 1 || local6372.anInt1806 == 10) {
																local6372.anInt1798 = Static361.aClass2_Sub7_Sub2_1.method4518();
																Static361.aClass2_Sub7_Sub2_1.anInt5186 += 6;
															} else if (local6372.anInt1806 >= 2 && local6372.anInt1806 <= 6) {
																if (local6372.anInt1806 == 2) {
																	local6372.anInt1802 = 256;
																	local6372.anInt1809 = 256;
																}
																if (local6372.anInt1806 == 3) {
																	local6372.anInt1809 = 0;
																	local6372.anInt1802 = 256;
																}
																if (local6372.anInt1806 == 4) {
																	local6372.anInt1802 = 256;
																	local6372.anInt1809 = 512;
																}
																if (local6372.anInt1806 == 5) {
																	local6372.anInt1802 = 0;
																	local6372.anInt1809 = 256;
																}
																if (local6372.anInt1806 == 6) {
																	local6372.anInt1802 = 512;
																	local6372.anInt1809 = 256;
																}
																local6372.anInt1806 = 2;
																local6372.anInt1804 = Static361.aClass2_Sub7_Sub2_1.method4464();
																local6372.anInt1809 += Static361.aClass2_Sub7_Sub2_1.method4518() - Static485.anInt7725 << 9;
																local6372.anInt1802 += Static361.aClass2_Sub7_Sub2_1.method4518() - Static310.anInt5129 << 9;
																local6372.anInt1811 = Static361.aClass2_Sub7_Sub2_1.method4464() << 2;
																local6372.anInt1800 = Static361.aClass2_Sub7_Sub2_1.method4518();
															}
															local6372.anInt1803 = Static361.aClass2_Sub7_Sub2_1.method4518();
															if (local6372.anInt1803 == 65535) {
																local6372.anInt1803 = -1;
															}
															Static271.aClass80Array1[local73] = local6372;
														}
														Static149.aClass349_37 = null;
														return true;
													} else if (Static149.aClass349_37 == Static532.aClass349_142) {
														Static284.method4051(Static90.aClass262_3);
														Static149.aClass349_37 = null;
														return true;
													} else if (Static149.aClass349_37 == Static268.aClass349_73) {
														local220 = Static361.aClass2_Sub7_Sub2_1.method4518();
														if (Static86.method1273(local220)) {
															Static442.method5788();
														}
														Static149.aClass349_37 = null;
														return true;
													} else if (Static475.aClass349_89 == Static149.aClass349_37) {
														Static88.aString20 = Static528.anInt8479 > 2 ? Static361.aClass2_Sub7_Sub2_1.method4494() : Static229.aClass159_28.method2776(Static261.anInt4297);
														Static283.anInt9028 = Static528.anInt8479 <= 0 ? -1 : Static361.aClass2_Sub7_Sub2_1.method4518();
														Static149.aClass349_37 = null;
														if (Static283.anInt9028 == 65535) {
															Static283.anInt9028 = -1;
														}
														return true;
													} else if (Static149.aClass349_37 == Static512.aClass349_134) {
														local4655 = Static361.aClass2_Sub7_Sub2_1.method4494();
														local73 = Static361.aClass2_Sub7_Sub2_1.method4518();
														local470 = Static330.aClass227_2.method4797(local73).method4790(Static361.aClass2_Sub7_Sub2_1);
														Static570.method7435(local4655, 0, local4655, local73, 19, local470, null, local4655);
														Static149.aClass349_37 = null;
														return true;
													} else if (Static149.aClass349_37 == Static30.aClass349_11) {
														for (local220 = 0; local220 < Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1.length; local220++) {
															if (Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local220] != null) {
																Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local220].anIntArray558 = null;
																Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local220].anInt8394 = -1;
															}
														}
														for (local73 = 0; local73 < Static51.anInt912; local73++) {
															Static379.aClass2_Sub5Array1[local73].aClass12_Sub2_Sub1_Sub4_Sub2_1.anIntArray558 = null;
															Static379.aClass2_Sub5Array1[local73].aClass12_Sub2_Sub1_Sub4_Sub2_1.anInt8394 = -1;
														}
														Static149.aClass349_37 = null;
														return true;
													} else if (Static149.aClass349_37 == Static130.aClass349_34) {
														local220 = Static361.aClass2_Sub7_Sub2_1.method4496();
														local73 = Static361.aClass2_Sub7_Sub2_1.method4488();
														local286 = Static361.aClass2_Sub7_Sub2_1.method4521();
														if (Static86.method1273(local286)) {
															Static518.method6693(local220, local73);
														}
														Static149.aClass349_37 = null;
														return true;
													} else if (Static198.aClass349_52 == Static149.aClass349_37) {
														local220 = Static361.aClass2_Sub7_Sub2_1.method4518();
														local73 = Static361.aClass2_Sub7_Sub2_1.method4464();
														local1295 = (local73 & 0x1) == 1;
														while (Static361.aClass2_Sub7_Sub2_1.anInt5186 < Static528.anInt8479) {
															local292 = Static361.aClass2_Sub7_Sub2_1.method4458();
															local302 = Static361.aClass2_Sub7_Sub2_1.method4518();
															local308 = 0;
															if (local302 != 0) {
																local308 = Static361.aClass2_Sub7_Sub2_1.method4464();
																if (local308 == 255) {
																	local308 = Static361.aClass2_Sub7_Sub2_1.method4509();
																}
															}
															Static366.method5160(local220, local308, local302 - 1, local292, local1295);
														}
														Static409.anIntArray428[Static375.anInt6283++ & 0x1F] = local220;
														Static149.aClass349_37 = null;
														return true;
													} else if (Static149.aClass349_37 == Static529.aClass349_140) {
														local220 = Static361.aClass2_Sub7_Sub2_1.method4518();
														local73 = Static361.aClass2_Sub7_Sub2_1.method4490();
														local286 = Static361.aClass2_Sub7_Sub2_1.method4490();
														if (Static86.method1273(local220)) {
															@Pc(6838) Class2_Sub33 local6838 = (Class2_Sub33) Static346.aClass90_17.method1685((long) local73);
															local415 = (Class2_Sub33) Static346.aClass90_17.method1685((long) local286);
															if (local415 != null) {
																Static393.method5411(false, local415, local6838 == null || local6838.anInt5981 != local415.anInt5981);
															}
															if (local6838 != null) {
																local6838.method7657();
																Static346.aClass90_17.method1684(local6838, (long) local286);
															}
															@Pc(6882) Class273 local6882 = Static594.method7731(local73);
															if (local6882 != null) {
																Static155.method2111(local6882);
															}
															local6882 = Static594.method7731(local286);
															if (local6882 != null) {
																Static155.method2111(local6882);
																Static576.method7471(true, local6882);
															}
															if (Static122.anInt2094 != -1) {
																Static134.method1813(1, Static122.anInt2094);
															}
														}
														Static149.aClass349_37 = null;
														return true;
													} else if (Static550.aClass349_114 == Static149.aClass349_37) {
														Static284.method4051(Static275.aClass262_8);
														Static149.aClass349_37 = null;
														return true;
													} else if (Static397.aClass349_110 == Static149.aClass349_37) {
														local220 = Static361.aClass2_Sub7_Sub2_1.method4464();
														local73 = Static361.aClass2_Sub7_Sub2_1.method4517();
														if (Static86.method1273(local73)) {
															Static392.anInt6492 = local220;
														}
														Static149.aClass349_37 = null;
														return true;
													} else if (Static149.aClass349_37 == Static114.aClass349_31) {
														Static361.aClass2_Sub7_Sub2_1.anInt5186 += 28;
														if (Static361.aClass2_Sub7_Sub2_1.method4482()) {
															Static506.method6594(Static361.aClass2_Sub7_Sub2_1.anInt5186 - 28, Static361.aClass2_Sub7_Sub2_1);
														}
														Static149.aClass349_37 = null;
														return true;
													} else if (Static149.aClass349_37 == Static341.aClass349_98) {
														Static284.method4051(Static251.aClass262_7);
														Static149.aClass349_37 = null;
														return true;
													} else if (Static149.aClass349_37 == Static399.aClass349_112) {
														local220 = Static361.aClass2_Sub7_Sub2_1.method4518();
														local73 = Static361.aClass2_Sub7_Sub2_1.method4464();
														local286 = Static361.aClass2_Sub7_Sub2_1.method4464();
														local292 = Static361.aClass2_Sub7_Sub2_1.method4518() << 2;
														local302 = Static361.aClass2_Sub7_Sub2_1.method4464();
														local308 = Static361.aClass2_Sub7_Sub2_1.method4464();
														if (Static86.method1273(local220)) {
															Static368.method6713(local308, local292, local73, true, local302, local286);
														}
														Static149.aClass349_37 = null;
														return true;
													} else {
														Static357.method5094(null, "T1 - " + (Static149.aClass349_37 == null ? -1 : Static149.aClass349_37.method7331()) + "," + (Static577.aClass349_162 == null ? -1 : Static577.aClass349_162.method7331()) + "," + (Static511.aClass349_152 == null ? -1 : Static511.aClass349_152.method7331()) + " - " + Static528.anInt8479);
														Static449.method5858(false);
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
}
