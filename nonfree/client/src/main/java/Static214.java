import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
	public static volatile int anInt4261 = 0;

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
	public static int anInt4262 = -1;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
	public static int anInt4266 = 0;

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString134 = "cyan:";

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIZLclient!p;IZIIII)V")
	public static void method3421(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class4_Sub17 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(23) int local23;
		if (arg7 < 0 || arg7 >= 104 || arg2 < 0 || arg2 >= 104) {
			while (true) {
				local23 = arg4.method1874();
				if (local23 == 0) {
					break;
				}
				if (local23 == 1) {
					arg4.method1874();
					break;
				}
				if (local23 <= 49) {
					arg4.method1874();
				}
			}
			return;
		}
		if (!arg3 && !arg6) {
			Static46.aByteArrayArrayArray2[arg0][arg7][arg2] = 0;
		}
		while (true) {
			local23 = arg4.method1874();
			if (local23 == 0) {
				if (arg3) {
					Static250.anIntArrayArrayArray13[0][arg7 + arg1][arg2 + arg8] = Static231.anIntArrayArrayArray12[0][arg7 + arg1][arg8 + arg2];
				} else if (arg0 == 0) {
					Static250.anIntArrayArrayArray13[0][arg7 + arg1][arg2 + arg8] = -Static87.method1400(arg10 + 932731, 556238 - -arg9) * 8;
				} else {
					Static250.anIntArrayArrayArray13[arg0][arg7 + arg1][arg8 + arg2] = Static250.anIntArrayArrayArray13[arg0 - 1][arg1 + arg7][arg8 + arg2] - 240;
				}
				break;
			}
			if (local23 == 1) {
				@Pc(164) int local164 = arg4.method1874();
				if (arg3) {
					Static250.anIntArrayArrayArray13[0][arg7 + arg1][arg2 + arg8] = Static231.anIntArrayArrayArray12[0][arg1 + arg7][arg8 + arg2] + local164 * 8;
				} else {
					if (local164 == 1) {
						local164 = 0;
					}
					if (arg0 == 0) {
						Static250.anIntArrayArrayArray13[0][arg1 + arg7][arg2 + arg8] = -local164 * 8;
					} else {
						Static250.anIntArrayArrayArray13[arg0][arg1 + arg7][arg2 + arg8] = Static250.anIntArrayArrayArray13[arg0 - 1][arg1 + arg7][arg8 + arg2] - local164 * 8;
					}
				}
				break;
			}
			if (local23 <= 49) {
				if (arg6) {
					arg4.method1874();
				} else {
					Static81.aByteArrayArrayArray15[arg0][arg7][arg2] = arg4.method1892();
					Static200.aByteArrayArrayArray12[arg0][arg7][arg2] = (byte) ((local23 - 2) / 4);
					Static84.aByteArrayArrayArray4[arg0][arg7][arg2] = (byte) (local23 + arg5 - 2 & 0x3);
				}
			} else if (local23 <= 81) {
				if (!arg3 && !arg6) {
					Static46.aByteArrayArrayArray2[arg0][arg7][arg2] = (byte) (local23 - 49);
				}
			} else if (!arg6) {
				Static218.aByteArrayArrayArray21[arg0][arg7][arg2] = (byte) (local23 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
	public static void method3422() {
		aString134 = null;
		anIntArrayArrayArray10 = null;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(III[[[BIBII)V")
	public static void method3423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		Static65.anInt1217++;
		Static243.anInt4649 = 0;
		@Pc(9) int local9 = arg6 - 16;
		@Pc(13) int local13 = arg6 + 16;
		@Pc(17) int local17 = arg7 - 16;
		@Pc(21) int local21 = arg7 + 16;
		@Pc(32) int local32;
		@Pc(37) int local37;
		@Pc(183) int local183;
		for (@Pc(23) int local23 = Static122.anInt2663; local23 < Static114.anInt2478; local23++) {
			@Pc(30) Class4_Sub11[][] local30 = Static127.aClass4_Sub11ArrayArrayArray1[local23];
			for (local32 = Static106.anInt2266; local32 < Static137.anInt2811; local32++) {
				for (local37 = Static219.anInt4347; local37 < Static77.anInt1474; local37++) {
					@Pc(46) Class4_Sub11 local46 = local30[local32][local37];
					if (local46 != null) {
						if (Static191.aBooleanArrayArray8[local32 + Static225.anInt4462 - Static273.anInt1119][local37 + Static225.anInt4462 - Static89.anInt1839] && (arg3 == null || local23 < arg4 || arg3[local23][local32][local37] != arg5)) {
							local46.aBoolean76 = true;
							local46.aBoolean74 = true;
							if (local46.anInt1054 > 0) {
								local46.aBoolean75 = true;
							} else {
								local46.aBoolean75 = false;
							}
							Static243.anInt4649++;
						} else {
							local46.aBoolean76 = false;
							local46.aBoolean74 = false;
							local46.anInt1050 = 0;
							if (local32 >= local9 && local32 <= local13 && local37 >= local17 && local37 <= local21) {
								if (local46.aClass43_1 != null) {
									@Pc(103) Class43 local103 = local46.aClass43_1;
									local103.aClass12_5.method3353(0, local23, local103.anInt1225, local103.anInt1230, local103.anInt1226);
									if (local103.aClass12_4 != null) {
										local103.aClass12_4.method3353(0, local23, local103.anInt1225, local103.anInt1230, local103.anInt1226);
									}
								}
								if (local46.aClass104_1 != null) {
									@Pc(134) Class104 local134 = local46.aClass104_1;
									local134.aClass12_6.method3353(local134.anInt3172, local23, local134.anInt3164, local134.anInt3171, local134.anInt3165);
									if (local134.aClass12_7 != null) {
										local134.aClass12_7.method3353(local134.anInt3172, local23, local134.anInt3164, local134.anInt3171, local134.anInt3165);
									}
								}
								if (local46.aClass135_1 != null) {
									@Pc(167) Class135 local167 = local46.aClass135_1;
									local167.aClass12_8.method3353(0, local23, local167.anInt4101, local167.anInt4100, local167.anInt4098);
								}
								if (local46.aClass173Array1 != null) {
									for (local183 = 0; local183 < local46.anInt1054; local183++) {
										@Pc(192) Class173 local192 = local46.aClass173Array1[local183];
										local192.aClass12_10.method3353(local192.anInt5150, local23, local192.anInt5162, local192.anInt5159, local192.anInt5161);
									}
								}
							}
						}
					}
				}
			}
		}
		@Pc(240) boolean local240 = Static250.anIntArrayArrayArray13 == Static15.anIntArrayArrayArray2;
		if (Static178.aBoolean216) {
			@Pc(244) GL local244 = Static178.aGL1;
			local244.glPushMatrix();
			local244.glTranslatef((float) -arg0, (float) -arg1, (float) -arg2);
			if (local240) {
				Static73.method1097();
				Static32.method479(3, -1);
				Static72.aBoolean96 = true;
				Static128.method2105();
				Static125.anInt2693 = -1;
				Static289.anInt5422 = -1;
				for (local32 = 0; local32 < Static281.aClass4_Sub14ArrayArray3[0].length; local32++) {
					@Pc(285) Class4_Sub14 local285 = Static281.aClass4_Sub14ArrayArray3[0][local32];
					@Pc(294) float local294 = 251.5F - (local285.aBoolean140 ? 1.0F : 0.5F);
					if (local285.anInt1875 != Static125.anInt2693) {
						Static125.anInt2693 = local285.anInt1875;
						Static74.method1121(local285.anInt1875);
						Static291.method4319(Static46.method725());
					}
					local285.method1453(Static127.aClass4_Sub11ArrayArrayArray1, local294, false);
				}
				Static128.method2103();
			} else {
				local32 = Static122.anInt2663;
				while (true) {
					if (local32 >= Static114.anInt2478) {
						Static12.method208(Static273.anInt1119, Static89.anInt1839, Static127.aClass4_Sub11ArrayArrayArray1);
						break;
					}
					for (local37 = 0; local37 < Static281.aClass4_Sub14ArrayArray3[local32].length; local37++) {
						@Pc(336) Class4_Sub14 local336 = Static281.aClass4_Sub14ArrayArray3[local32][local37];
						@Pc(350) float local350 = 201.5F - (float) local32 * 50.0F - (local336.aBoolean140 ? 1.0F : 0.5F);
						if (local336.anInt1879 != -1 && Static262.method3974(Static204.anInterface2_1.method1983(local336.anInt1879)) && Static139.aBoolean188) {
							Static74.method1121(local336.anInt1875);
						}
						local336.method1453(Static127.aClass4_Sub11ArrayArrayArray1, local350, false);
					}
					if (local32 == 0 && Static18.anInt380 > 0) {
						Static178.method2771(101.5F);
						Static64.method973(Static273.anInt1119, Static89.anInt1839, Static225.anInt4462, arg1, Static191.aBooleanArrayArray8, Static250.anIntArrayArrayArray13[0]);
					}
					local32++;
				}
			}
			local244.glPopMatrix();
		}
		@Pc(435) int local435;
		@Pc(439) int local439;
		@Pc(451) Class4_Sub11 local451;
		@Pc(400) int local400;
		@Pc(407) Class4_Sub11[][] local407;
		@Pc(416) int local416;
		@Pc(429) int local429;
		for (local400 = Static122.anInt2663; local400 < Static114.anInt2478; local400++) {
			local407 = Static127.aClass4_Sub11ArrayArrayArray1[local400];
			for (local37 = -Static225.anInt4462; local37 <= 0; local37++) {
				local416 = Static273.anInt1119 + local37;
				local183 = Static273.anInt1119 - local37;
				if (local416 >= Static106.anInt2266 || local183 < Static137.anInt2811) {
					for (local429 = -Static225.anInt4462; local429 <= 0; local429++) {
						local435 = Static89.anInt1839 + local429;
						local439 = Static89.anInt1839 - local429;
						if (local416 >= Static106.anInt2266) {
							if (local435 >= Static219.anInt4347) {
								local451 = local407[local416][local435];
								if (local451 != null && local451.aBoolean76) {
									Static175.method2720(local451, true);
								}
							}
							if (local439 < Static77.anInt1474) {
								local451 = local407[local416][local439];
								if (local451 != null && local451.aBoolean76) {
									Static175.method2720(local451, true);
								}
							}
						}
						if (local183 < Static137.anInt2811) {
							if (local435 >= Static219.anInt4347) {
								local451 = local407[local183][local435];
								if (local451 != null && local451.aBoolean76) {
									Static175.method2720(local451, true);
								}
							}
							if (local439 < Static77.anInt1474) {
								local451 = local407[local183][local439];
								if (local451 != null && local451.aBoolean76) {
									Static175.method2720(local451, true);
								}
							}
						}
						if (Static243.anInt4649 == 0) {
							if (!local240) {
								Static125.aBoolean177 = false;
							}
							return;
						}
					}
				}
			}
		}
		for (local400 = Static122.anInt2663; local400 < Static114.anInt2478; local400++) {
			local407 = Static127.aClass4_Sub11ArrayArrayArray1[local400];
			for (local37 = -Static225.anInt4462; local37 <= 0; local37++) {
				local416 = Static273.anInt1119 + local37;
				local183 = Static273.anInt1119 - local37;
				if (local416 >= Static106.anInt2266 || local183 < Static137.anInt2811) {
					for (local429 = -Static225.anInt4462; local429 <= 0; local429++) {
						local435 = Static89.anInt1839 + local429;
						local439 = Static89.anInt1839 - local429;
						if (local416 >= Static106.anInt2266) {
							if (local435 >= Static219.anInt4347) {
								local451 = local407[local416][local435];
								if (local451 != null && local451.aBoolean76) {
									Static175.method2720(local451, false);
								}
							}
							if (local439 < Static77.anInt1474) {
								local451 = local407[local416][local439];
								if (local451 != null && local451.aBoolean76) {
									Static175.method2720(local451, false);
								}
							}
						}
						if (local183 < Static137.anInt2811) {
							if (local435 >= Static219.anInt4347) {
								local451 = local407[local183][local435];
								if (local451 != null && local451.aBoolean76) {
									Static175.method2720(local451, false);
								}
							}
							if (local439 < Static77.anInt1474) {
								local451 = local407[local183][local439];
								if (local451 != null && local451.aBoolean76) {
									Static175.method2720(local451, false);
								}
							}
						}
						if (Static243.anInt4649 == 0) {
							if (!local240) {
								Static125.aBoolean177 = false;
							}
							return;
						}
					}
				}
			}
		}
		Static125.aBoolean177 = false;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([BIBI)Z")
	public static boolean method3424(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(21) int local21 = -1;
		@Pc(26) Class4_Sub17 local26 = new Class4_Sub17(arg0);
		label73: while (true) {
			@Pc(30) int local30 = local26.method1877();
			if (local30 == 0) {
				return local7;
			}
			local21 += local30;
			@Pc(41) int local41 = 0;
			@Pc(43) boolean local43 = false;
			while (true) {
				@Pc(77) int local77;
				@Pc(98) Class47 local98;
				do {
					@Pc(67) int local67;
					@Pc(81) int local81;
					do {
						do {
							do {
								do {
									@Pc(49) int local49;
									while (local43) {
										local49 = local26.method1856();
										if (local49 == 0) {
											continue label73;
										}
										local26.method1874();
									}
									local49 = local26.method1856();
									if (local49 == 0) {
										continue label73;
									}
									local41 += local49 - 1;
									@Pc(63) int local63 = local41 >> 6 & 0x3F;
									local67 = arg1 + local63;
									@Pc(71) int local71 = local41 & 0x3F;
									local77 = local26.method1874() >> 2;
									local81 = local71 + arg2;
								} while (local67 <= 0);
							} while (local81 <= 0);
						} while (local67 >= 103);
					} while (local81 >= 103);
					local98 = Static170.method2683(local21);
				} while (local77 == 22 && !Static114.aBoolean166 && local98.anInt1340 == 0 && local98.anInt1339 != 1 && !local98.aBoolean97);
				if (!local98.method1089()) {
					Static131.anInt2782++;
					local7 = false;
				}
				local43 = true;
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	public static void method3425() {
		Static90.aClass33_13.method839();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([BIIZ[Lclient!hm;I)V")
	public static void method3426(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class63[] arg3, @OriginalArg(5) int arg4) {
		@Pc(10) Class4_Sub17 local10 = new Class4_Sub17(arg0);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local10.method1877();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(39) int local39 = local10.method1856();
				if (local39 == 0) {
					break;
				}
				local35 += local39 - 1;
				@Pc(54) int local54 = local35 >> 6 & 0x3F;
				@Pc(58) int local58 = local35 & 0x3F;
				@Pc(62) int local62 = local35 >> 12;
				@Pc(66) int local66 = local10.method1874();
				@Pc(70) int local70 = local66 >> 2;
				@Pc(74) int local74 = local66 & 0x3;
				@Pc(78) int local78 = local54 + arg1;
				@Pc(82) int local82 = arg4 + local58;
				if (local78 > 0 && local82 > 0 && local78 < 103 && local82 < 103) {
					@Pc(104) Class63 local104 = null;
					if (!arg2) {
						@Pc(109) int local109 = local62;
						if ((Static46.aByteArrayArrayArray2[1][local78][local82] & 0x2) == 2) {
							local109 = local62 - 1;
						}
						if (local109 >= 0) {
							local104 = arg3[local109];
						}
					}
					Static21.method3455(local70, local74, arg2, local62, !arg2, local62, local104, local78, local20, local82);
				}
			}
		}
	}
}
