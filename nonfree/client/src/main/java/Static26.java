import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!ed", name = "Lb", descriptor = "Lclient!qa;")
	public static Class50 aClass50_8;

	@OriginalMember(owner = "client!ed", name = "zb", descriptor = "Lclient!va;")
	private static Class61 aClass61_696 = Static88.method1421("flash3:");

	@OriginalMember(owner = "client!ed", name = "Ab", descriptor = "Lclient!va;")
	public static Class61 aClass61_697 = aClass61_696;

	@OriginalMember(owner = "client!ed", name = "Db", descriptor = "[I")
	public static int[] anIntArray187 = new int[25];

	@OriginalMember(owner = "client!ed", name = "Sb", descriptor = "Lclient!d;")
	public static Class10_Sub1_Sub4 aClass10_Sub1_Sub4_3 = new Class10_Sub1_Sub4();

	@OriginalMember(owner = "client!ed", name = "Tb", descriptor = "Lclient!va;")
	public static Class61 aClass61_698 = Static88.method1421(":");

	@OriginalMember(owner = "client!ed", name = "Wb", descriptor = "I")
	public static int anInt1666 = -1;

	@OriginalMember(owner = "client!ed", name = "lc", descriptor = "I")
	public static int anInt1677 = 0;

	@OriginalMember(owner = "client!ed", name = "uc", descriptor = "I")
	public static int anInt1685 = 0;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V")
	public static void method922(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = Static61.method903(arg0).anInt2623;
		if (local10 == 0) {
			return;
		}
		@Pc(20) int local20 = Static74.anIntArray228[arg0];
		if (local10 == 1) {
			if (local20 == 1) {
				Static68.method995(0.9D);
				((Class8) Static68.anInterface3_1).method65(0.9D);
			}
			if (local20 == 2) {
				Static68.method995(0.8D);
				((Class8) Static68.anInterface3_1).method65(0.8D);
			}
			if (local20 == 3) {
				Static68.method995(0.7D);
				((Class8) Static68.anInterface3_1).method65(0.7D);
			}
			if (local20 == 4) {
				Static68.method995(0.6D);
				((Class8) Static68.anInterface3_1).method65(0.6D);
			}
			Static70.method1665();
			Static40.aBoolean51 = true;
		}
		if (local10 == 3) {
			@Pc(82) short local82 = 0;
			if (local20 == 0) {
				local82 = 255;
			}
			if (local20 == 1) {
				local82 = 192;
			}
			if (local20 == 2) {
				local82 = 128;
			}
			if (local20 == 3) {
				local82 = 64;
			}
			if (local20 == 4) {
				local82 = 0;
			}
			if (local82 != Static51.anInt1419) {
				if (Static51.anInt1419 == 0 && Static47.anInt1303 != -1) {
					Static15.method344(local82, Static47.anInt1303, Static106.aClass11_Sub1_16, 0);
					Static70.anInt2671 = 0;
				} else if (local82 == 0) {
					Static15.method343();
					Static70.anInt2671 = 0;
				} else {
					Static32.method564(local82);
				}
				Static51.anInt1419 = local82;
			}
		}
		if (local10 == 4) {
			if (local20 == 0) {
				Static88.anInt2323 = 127;
			}
			if (local20 == 1) {
				Static88.anInt2323 = 96;
			}
			if (local20 == 2) {
				Static88.anInt2323 = 64;
			}
			if (local20 == 3) {
				Static88.anInt2323 = 32;
			}
			if (local20 == 4) {
				Static88.anInt2323 = 0;
			}
		}
		if (local10 == 8) {
			Static57.anInt1519 = local20;
			Static7.aBoolean1 = true;
		}
		if (local10 == 5) {
			Static69.anInt1817 = local20;
		}
		if (local10 == 6) {
			Static76.anInt2026 = local20;
		}
		if (local10 == 9) {
			Static61.anInt1600 = local20;
		}
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(Z)V")
	public static void method924() {
		aClass50_8 = null;
		aClass61_696 = null;
		aClass61_698 = null;
		anIntArray187 = null;
		aClass61_697 = null;
		aClass10_Sub1_Sub4_3 = null;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIIIZII)V")
	public static void method925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static25.method491(arg7) || (arg4 > arg2 || arg0 > arg9 || arg2 >= arg5 || arg9 >= arg8)) {
			return;
		}
		@Pc(27) Class10_Sub1_Sub4[] local27 = Static104.aClass10_Sub1_Sub4ArrayArray1[arg7];
		for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
			@Pc(40) Class10_Sub1_Sub4 local40 = local27[local29];
			if (local40 != null && arg6 == local40.anInt553) {
				@Pc(57) int local57 = arg4 + local40.anInt594;
				@Pc(66) int local66 = local40.anInt592 + arg0 - arg1;
				if (local40.anInt577 == 8 && arg2 >= local57 && local66 <= arg9 && arg2 < local40.anInt564 + local57 && local66 + local40.anInt557 > arg9) {
					anInt1666 = local29;
				}
				if ((local40.anInt599 >= 0 || local40.anInt574 != 0) && arg2 >= local57 && local66 <= arg9 && arg2 < local57 + local40.anInt564 && arg9 < local66 + local40.anInt557) {
					if (local40.anInt599 < 0) {
						Static89.anInt2328 = local29;
					} else {
						Static89.anInt2328 = local40.anInt599;
					}
				}
				if (local40.anInt577 != 0) {
					if (local40.anInt581 == 1 && arg2 >= local57 && local66 <= arg9 && arg2 < local57 + local40.anInt564 && local40.anInt557 + local66 > arg9) {
						@Pc(247) boolean local247 = false;
						if (local40.anInt600 != 0) {
							local247 = Static53.method799(local40);
						}
						if (!local247) {
							Static107.method1502(local29 + (arg7 << 16), 0, 8, 0, local40.aClass61_194);
						}
					}
					if (local40.anInt581 == 2 && Static20.anInt2651 == 0 && arg2 >= local57 && local66 <= arg9 && local57 + local40.anInt564 > arg2 && local40.anInt557 + local66 > arg9) {
						Static107.method1502(local29 + (arg7 << 16), 0, 4, 0, Static93.method1156(new Class61[] { local40.aClass61_193, Static52.aClass61_602, local40.aClass61_190 }));
					}
					if (local40.anInt581 == 3 && arg2 >= local57 && arg9 >= local66 && arg2 < local57 + local40.anInt564 && local66 + local40.anInt557 > arg9) {
						@Pc(377) byte local377;
						if (arg3 == 3) {
							local377 = 28;
						} else {
							local377 = 51;
						}
						Static107.method1502(local29 + (arg7 << 16), 0, local377, 0, Static57.aClass61_633);
					}
					if (local40.anInt581 == 4 && arg2 >= local57 && arg9 >= local66 && arg2 < local57 + local40.anInt564 && local40.anInt557 + local66 > arg9) {
						Static107.method1502(local29 + (arg7 << 16), 0, 43, 0, local40.aClass61_194);
					}
					if (local40.anInt581 == 5 && arg2 >= local57 && arg9 >= local66 && arg2 < local57 + local40.anInt564 && local66 + local40.anInt557 > arg9) {
						Static107.method1502((arg7 << 16) + local29, 0, 32, 0, local40.aClass61_194);
					}
					if (local40.anInt581 == 6 && !Static104.aBoolean120 && arg2 >= local57 && arg9 >= local66 && local40.anInt564 + local57 > arg2 && local40.anInt557 + local66 > arg9) {
						Static107.method1502(local29 + (arg7 << 16), 0, 22, 0, local40.aClass61_194);
					}
					if (local40.anInt577 == 2) {
						@Pc(549) int local549 = 0;
						for (@Pc(551) int local551 = 0; local551 < local40.anInt557; local551++) {
							for (@Pc(555) int local555 = 0; local555 < local40.anInt564; local555++) {
								@Pc(567) int local567 = local57 + (local40.anInt583 + 32) * local555;
								@Pc(576) int local576 = local66 + local551 * (local40.anInt572 + 32);
								if (local549 < 20) {
									local576 += local40.anIntArray69[local549];
									local567 += local40.anIntArray68[local549];
								}
								if (local567 <= arg2 && arg9 >= local576 && local567 + 32 > arg2 && local576 + 32 > arg9) {
									Static7.anInt81 = local29 + (arg7 << 16);
									Static9.anInt304 = local549;
									if (local40.anIntArray63[local549] > 0) {
										@Pc(645) Class10_Sub1_Sub15 local645 = Static94.method1491(local40.anIntArray63[local549] - 1);
										if (Static94.anInt2408 == 1 && local40.aBoolean25) {
											if (local29 + (arg7 << 16) != Static11.anInt323 || local549 != Static23.anInt761) {
												Static107.method1502((arg7 << 16) + local29, local549, 12, local645.anInt2530, Static93.method1156(new Class61[] { Static101.aClass61_1035, Static24.aClass61_925, Static37.aClass61_435, Static18.aClass61_206, local645.aClass61_1029 }));
											}
										} else if (Static20.anInt2651 != 1 || !local40.aBoolean25) {
											@Pc(703) Class61[] local703 = local645.aClass61Array14;
											if (Static19.aBoolean32) {
												local703 = Static40.method645(local703);
											}
											@Pc(714) int local714;
											@Pc(731) byte local731;
											if (local40.aBoolean25) {
												for (local714 = 4; local714 >= 3; local714--) {
													if (local703 != null && local703[local714] != null) {
														if (local714 == 3) {
															local731 = 18;
														} else {
															local731 = 36;
														}
														Static107.method1502((arg7 << 16) + local29, local549, local731, local645.anInt2530, Static93.method1156(new Class61[] { local703[local714], Static56.aClass61_624, local645.aClass61_1029 }));
													} else if (local714 == 4) {
														Static107.method1502((arg7 << 16) + local29, local549, 36, local645.anInt2530, Static93.method1156(new Class61[] { Static94.aClass61_961, Static56.aClass61_624, local645.aClass61_1029 }));
													}
												}
											}
											if (local40.aBoolean28) {
												Static107.method1502((arg7 << 16) + local29, local549, 27, local645.anInt2530, Static93.method1156(new Class61[] { Static101.aClass61_1035, Static56.aClass61_624, local645.aClass61_1029 }));
											}
											if (local40.aBoolean25 && local703 != null) {
												for (local714 = 2; local714 >= 0; local714--) {
													if (local703[local714] != null) {
														local731 = 0;
														if (local714 == 0) {
															local731 = 16;
														}
														if (local714 == 1) {
															local731 = 11;
														}
														if (local714 == 2) {
															local731 = 20;
														}
														Static107.method1502((arg7 << 16) + local29, local549, local731, local645.anInt2530, Static93.method1156(new Class61[] { local703[local714], Static56.aClass61_624, local645.aClass61_1029 }));
													}
												}
											}
											local703 = local40.aClass61Array6;
											if (Static19.aBoolean32) {
												local703 = Static40.method645(local703);
											}
											if (local703 != null) {
												for (local714 = 4; local714 >= 0; local714--) {
													if (local703[local714] != null) {
														local731 = 0;
														if (local714 == 0) {
															local731 = 3;
														}
														if (local714 == 1) {
															local731 = 6;
														}
														if (local714 == 2) {
															local731 = 38;
														}
														if (local714 == 3) {
															local731 = 29;
														}
														if (local714 == 4) {
															local731 = 42;
														}
														Static107.method1502(local29 + (arg7 << 16), local549, local731, local645.anInt2530, Static93.method1156(new Class61[] { local703[local714], Static56.aClass61_624, local645.aClass61_1029 }));
													}
												}
											}
											Static107.method1502(local29 + (arg7 << 16), local549, 1006, local645.anInt2530, Static93.method1156(new Class61[] { Static54.aClass61_616, Static56.aClass61_624, local645.aClass61_1029 }));
										} else if ((Static88.anInt2310 & 0x10) == 16) {
											Static107.method1502((arg7 << 16) + local29, local549, 49, local645.anInt2530, Static93.method1156(new Class61[] { Static49.aClass61_568, Static18.aClass61_206, local645.aClass61_1029 }));
										}
									}
								}
								local549++;
							}
						}
					}
				} else if (!local40.aBoolean29 || Static50.method781(local29, arg3) || Static58.aBoolean75) {
					method925(local66, local40.anInt579, arg2, arg3, local57, local57 + local40.anInt564, local29, arg7, local66 + local40.anInt557, arg9);
					if (local40.anInt557 < local40.anInt575) {
						Static89.method1425(arg9, local40.anInt557, arg3, local57 + local40.anInt564, local40, arg2, local66, local40.anInt575);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "(B)V")
	public static void method926() {
		if (Static107.aClass17_5 != null) {
			Static107.aClass17_5.method1435();
			Static107.aClass17_5 = null;
		}
	}
}
