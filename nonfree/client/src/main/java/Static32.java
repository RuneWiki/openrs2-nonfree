import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "Lclient!mb;")
	public static Class45 aClass45_457 = Static63.method1251("Wen m-Ochten Sie der Liste hinzuf-Ugen?");

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
	public static int anInt936 = 99;

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
	public static int anInt937 = 0;

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "Lclient!mb;")
	public static Class45 aClass45_458 = Static63.method1251("cross");

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "Lclient!mb;")
	private static Class45 aClass45_459 = Static63.method1251("flash1:");

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "Lclient!mb;")
	public static Class45 aClass45_460 = Static63.method1251("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "Lclient!mb;")
	public static Class45 aClass45_461 = aClass45_459;

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
	public static int anInt942 = -1;

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
	public static int anInt943 = -1;

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "Lclient!mb;")
	public static Class45 aClass45_462 = Static63.method1251("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!fe", name = "q", descriptor = "Lclient!mb;")
	public static Class45 aClass45_463 = Static63.method1251("An:");

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V")
	public static void method675() {
		aByteArrayArrayArray2 = null;
		aClass45_463 = null;
		aClass45_460 = null;
		aClass45_461 = null;
		aClass45_459 = null;
		aClass45_462 = null;
		aClass45_457 = null;
		aClass45_458 = null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BIII)I")
	public static int method676(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 >> 7;
		@Pc(11) int local11 = arg1 >> 7;
		if (local7 < 0 || local11 < 0 || local7 > 103 || local11 > 103) {
			return 0;
		}
		@Pc(32) int local32 = arg2;
		@Pc(36) int local36 = arg0 & 0x7F;
		@Pc(40) int local40 = arg1 & 0x7F;
		if (arg2 < 3 && (Static48.aByteArrayArrayArray3[1][local7][local11] & 0x2) == 2) {
			local32 = arg2 + 1;
		}
		@Pc(94) int local94 = Static40.anIntArrayArrayArray2[local32][local7][local11 + 1] * (128 - local36) + Static40.anIntArrayArrayArray2[local32][local7 + 1][local11 + 1] * local36 >> 7;
		@Pc(120) int local120 = local36 * Static40.anIntArrayArrayArray2[local32][local7 + 1][local11] + (128 - local36) * Static40.anIntArrayArrayArray2[local32][local7][local11] >> 7;
		return (128 - local40) * local120 + local40 * local94 >> 7;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZLclient!sd;II)Lclient!df;")
	public static Class5_Sub2_Sub6_Sub1 method678(@OriginalArg(1) Class29 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static106.method1918(arg2, arg0, arg1) ? Static8.method161() : null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBLclient!hb;)Lclient!mb;")
	public static Class45 method679(@OriginalArg(2) Class5_Sub9 arg0) {
		try {
			@Pc(12) Class45 local12 = new Class45();
			local12.anInt1925 = arg0.method1417();
			if (local12.anInt1925 > 32767) {
				local12.anInt1925 = 32767;
			}
			local12.aByteArray27 = new byte[local12.anInt1925];
			arg0.anInt2140 += Static49.aClass48_1.method1469(0, arg0.anInt2140, arg0.aByteArray28, local12.anInt1925, local12.aByteArray27);
			return local12;
		} catch (@Pc(53) Exception local53) {
			return Static6.aClass45_75;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
	public static void method680() {
		Static104.method1900();
		Static88.aBoolean114 = true;
		Static17.method324();
		@Pc(30) boolean local30;
		if (Static72.anInt2162 != -1) {
			local30 = Static52.method2151(261, 190, 1, Static72.anInt2162);
			if (!local30) {
				Static72.aBoolean99 = true;
			}
		} else if (Static57.anIntArray262[Static53.anInt2372] != -1) {
			local30 = Static52.method2151(261, 190, 1, Static57.anIntArray262[Static53.anInt2372]);
			if (!local30) {
				Static72.aBoolean99 = true;
			}
		}
		if (Static2.aBoolean2 && Static97.anInt2635 == 1) {
			if (Static122.anInt3151 == 1) {
				Static7.method133();
			} else {
				Static14.method271();
			}
		}
		Static39.method1441();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([Lclient!ia;IIIIIIIIIII)V")
	public static void method682(@OriginalArg(0) Class5_Sub2_Sub8[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg5 > arg7 || arg4 > arg10 || arg7 >= arg3 || arg10 >= arg1) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < arg0.length; local30++) {
			@Pc(35) Class5_Sub2_Sub8 local35 = arg0[local30];
			if (local35 != null && arg9 == local35.anInt1301 && (!local35.aBoolean66 || !Static60.method1218(local35))) {
				@Pc(57) int local57 = local35.anInt1252 + arg5 - arg6;
				@Pc(65) int local65 = arg4 + local35.anInt1294 - arg8;
				if ((local35.anInt1287 >= 0 || local35.anInt1249 != 0) && arg7 >= local57 && local65 <= arg10 && local57 + local35.anInt1260 > arg7 && arg10 < local35.anInt1243 + local65) {
					if (local35.anInt1287 < 0) {
						Static47.anInt1348 = local30;
					} else {
						Static47.anInt1348 = local35.anInt1287;
					}
				}
				if (local35.anInt1269 == 8 && arg7 >= local57 && local65 <= arg10 && arg7 < local35.anInt1260 + local57 && local65 + local35.anInt1243 > arg10) {
					Static50.anInt1601 = local30;
				}
				if (local35.anInt1269 == 0) {
					if (!local35.aBoolean66 && Static60.method1218(local35) && !Static112.method2057(arg2, local30)) {
						continue;
					}
					method682(arg0, local35.anInt1243 + local65, arg2, local57 + local35.anInt1260, local65, local57, local35.anInt1265, arg7, local35.anInt1244, local35.anInt1262, arg10);
					if (local35.aClass5_Sub2_Sub8Array1 != null) {
						method682(local35.aClass5_Sub2_Sub8Array1, local35.anInt1243 + local65, arg2, local57 + local35.anInt1260, local65, local57, local35.anInt1265, arg7, local35.anInt1244, local35.anInt1262, arg10);
					}
					if (local35.anInt1232 > local35.anInt1243 && !local35.aBoolean66) {
						Static62.method1229(arg10, local35.anInt1260 + local57, local35.anInt1232, arg2, local35.anInt1243, arg7, local35, local65);
					}
					if (!local35.aBoolean66) {
						continue;
					}
				}
				if (local35.anInt1268 == 1 && local57 <= arg7 && local65 <= arg10 && local57 + local35.anInt1260 > arg7 && local65 + local35.anInt1243 > arg10) {
					@Pc(274) boolean local274 = false;
					if (local35.anInt1267 != 0) {
						local274 = Static2.method15(local35);
					}
					if (!local274) {
						Static108.method1945(0, 36, Static78.aClass45_929, local35.anInt1262, 0, local35.aClass45_552);
					}
				}
				if (local35.anInt1268 == 2 && !Static13.aBoolean12 && local57 <= arg7 && arg10 >= local65 && arg7 < local35.anInt1260 + local57 && local65 + local35.anInt1243 > arg10) {
					@Pc(335) Class45 local335 = Static84.method1590(local35);
					if (local335 != null) {
						Static108.method1945(-1, 21, Static39.method1443(new Class45[] { Static90.aClass45_1055, local35.aClass45_551 }), local35.anInt1262, 0, local335);
					}
				}
				if (local35.anInt1268 == 3 && arg7 >= local57 && local65 <= arg10 && local35.anInt1260 + local57 > arg7 && local65 + local35.anInt1243 > arg10) {
					@Pc(397) byte local397;
					if (arg2 == 3) {
						local397 = 23;
					} else {
						local397 = 41;
					}
					Static108.method1945(0, local397, Static78.aClass45_929, local35.anInt1262, 0, Static64.aClass45_786);
				}
				if (local35.anInt1268 == 4 && arg7 >= local57 && local65 <= arg10 && arg7 < local57 + local35.anInt1260 && local35.anInt1243 + local65 > arg10) {
					Static108.method1945(0, 28, Static78.aClass45_929, local35.anInt1262, 0, local35.aClass45_552);
				}
				if (local35.anInt1268 == 5 && arg7 >= local57 && local65 <= arg10 && local57 + local35.anInt1260 > arg7 && arg10 < local65 + local35.anInt1243) {
					Static108.method1945(0, 42, Static78.aClass45_929, local35.anInt1262, 0, local35.aClass45_552);
				}
				if (local35.anInt1268 == 6 && Static119.anInt3089 == -1 && local57 <= arg7 && arg10 >= local65 && arg7 < local57 + local35.anInt1260 && local65 + local35.anInt1243 > arg10) {
					Static108.method1945(-1, 56, Static78.aClass45_929, local35.anInt1262, 0, local35.aClass45_552);
				}
				@Pc(563) int local563;
				@Pc(558) int local558;
				if (local35.anInt1269 == 2) {
					local558 = 0;
					for (@Pc(560) int local560 = 0; local560 < local35.anInt1243; local560++) {
						for (local563 = 0; local563 < local35.anInt1260; local563++) {
							@Pc(574) int local574 = local563 * (local35.anInt1290 + 32) + local57;
							@Pc(583) int local583 = local560 * (local35.anInt1282 + 32) + local65;
							if (local558 < 20) {
								local574 += local35.anIntArray210[local558];
								local583 += local35.anIntArray207[local558];
							}
							if (local574 <= arg7 && arg10 >= local583 && local574 + 32 > arg7 && arg10 < local583 + 32) {
								Static103.anInt2765 = local35.anInt1262;
								Static84.anInt2334 = local558;
								if (local35.anIntArray201[local558] > 0) {
									@Pc(652) Class5_Sub2_Sub3 local652 = Static81.method1515(local35.anIntArray201[local558] - 1);
									if (Static16.anInt502 == 1 && Static119.method2132(Static74.method1700(local35))) {
										if (Static4.anInt95 != local35.anInt1262 || local558 != Static40.anInt1179) {
											Static108.method1945(local558, 11, Static39.method1443(new Class45[] { Static12.aClass45_1357, Static1.aClass45_7, local652.aClass45_108 }), local35.anInt1262, local652.anInt234, Static117.aClass45_1345);
										}
									} else if (!Static13.aBoolean12 || !Static119.method2132(Static74.method1700(local35))) {
										@Pc(752) Class45[] local752 = local652.aClass45Array1;
										if (Static23.aBoolean34) {
											local752 = Static119.method2136(local752);
										}
										@Pc(766) int local766;
										@Pc(780) byte local780;
										if (Static119.method2132(Static74.method1700(local35))) {
											for (local766 = 4; local766 >= 3; local766--) {
												if (local752 != null && local752[local766] != null) {
													if (local766 == 3) {
														local780 = 50;
													} else {
														local780 = 24;
													}
													Static108.method1945(local558, local780, Static39.method1443(new Class45[] { Static68.aClass45_830, local652.aClass45_108 }), local35.anInt1262, local652.anInt234, local752[local766]);
												} else if (local766 == 4) {
													Static108.method1945(local558, 24, Static39.method1443(new Class45[] { Static68.aClass45_830, local652.aClass45_108 }), local35.anInt1262, local652.anInt234, Static89.aClass45_1049);
												}
											}
										}
										if (Static74.method1698(Static74.method1700(local35))) {
											Static108.method1945(local558, 37, Static39.method1443(new Class45[] { Static68.aClass45_830, local652.aClass45_108 }), local35.anInt1262, local652.anInt234, Static117.aClass45_1345);
										}
										if (Static119.method2132(Static74.method1700(local35)) && local752 != null) {
											for (local766 = 2; local766 >= 0; local766--) {
												if (local752[local766] != null) {
													local780 = 0;
													if (local766 == 0) {
														local780 = 53;
													}
													if (local766 == 1) {
														local780 = 49;
													}
													if (local766 == 2) {
														local780 = 22;
													}
													Static108.method1945(local558, local780, Static39.method1443(new Class45[] { Static68.aClass45_830, local652.aClass45_108 }), local35.anInt1262, local652.anInt234, local752[local766]);
												}
											}
										}
										local752 = local35.aClass45Array14;
										if (Static23.aBoolean34) {
											local752 = Static119.method2136(local752);
										}
										if (local752 != null) {
											for (local766 = 4; local766 >= 0; local766--) {
												if (local752[local766] != null) {
													local780 = 0;
													if (local766 == 0) {
														local780 = 35;
													}
													if (local766 == 1) {
														local780 = 31;
													}
													if (local766 == 2) {
														local780 = 26;
													}
													if (local766 == 3) {
														local780 = 44;
													}
													if (local766 == 4) {
														local780 = 25;
													}
													Static108.method1945(local558, local780, Static39.method1443(new Class45[] { Static68.aClass45_830, local652.aClass45_108 }), local35.anInt1262, local652.anInt234, local752[local766]);
												}
											}
										}
										Static108.method1945(local558, 1004, Static39.method1443(new Class45[] { Static68.aClass45_830, local652.aClass45_108 }), local35.anInt1262, local652.anInt234, Static6.aClass45_77);
									} else if ((Static101.anInt1044 & 0x10) == 16) {
										Static108.method1945(local558, 55, Static39.method1443(new Class45[] { Static3.aClass45_32, Static1.aClass45_7, local652.aClass45_108 }), local35.anInt1262, local652.anInt234, Static31.aClass45_445);
									}
								}
							}
							local558++;
						}
					}
				}
				if (local35.aBoolean66) {
					if (Static13.aBoolean12) {
						if (Static87.method1680(Static74.method1700(local35)) && (Static101.anInt1044 & 0x20) == 32 && arg7 >= local57 && local65 <= arg10 && arg7 < local35.anInt1260 + local57 && local65 + local35.anInt1243 > arg10) {
							Static108.method1945(local35.anInt1288, 19, Static39.method1443(new Class45[] { Static3.aClass45_32, Static92.aClass45_1334, local35.aClass45_545 }), local35.anInt1262, 0, Static31.aClass45_445);
						}
					} else if (local57 <= arg7 && local65 <= arg10 && arg7 < local35.anInt1260 + local57 && arg10 < local35.anInt1243 + local65) {
						@Pc(1178) Class45 local1178;
						for (local558 = 9; local558 >= 5; local558--) {
							local1178 = Static61.method1225(local35, local558);
							if (local1178 != null) {
								Static108.method1945(local35.anInt1288, 1, local35.aClass45_545, local35.anInt1262, local558 + 1, local1178);
							}
						}
						local1178 = Static84.method1590(local35);
						if (local1178 != null) {
							Static108.method1945(local35.anInt1288, 21, local35.aClass45_545, local35.anInt1262, 0, local1178);
						}
						for (local563 = 4; local563 >= 0; local563--) {
							@Pc(1230) Class45 local1230 = Static61.method1225(local35, local563);
							if (local1230 != null) {
								Static108.method1945(local35.anInt1288, 1, local35.aClass45_545, local35.anInt1262, local563 + 1, local1230);
							}
						}
						if (Static92.method2112(Static74.method1700(local35))) {
							Static108.method1945(-1, 56, Static78.aClass45_929, local35.anInt1262, 0, local35.aClass45_552);
						}
					}
				}
			}
		}
	}
}
