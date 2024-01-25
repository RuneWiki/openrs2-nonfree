import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!up", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString125 = null;

	@OriginalMember(owner = "client!up", name = "e", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_142 = new Class276(32, 6);

	@OriginalMember(owner = "client!up", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray80 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(CB)Z")
	public static boolean method7908(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ILclient!wk;)V")
	public static void method7909(@OriginalArg(1) Class2_Sub2_Sub1 arg0) {
		arg0.anInt7598 = 0;
		@Pc(18) Class174 local18;
		if (arg0.anInt7655 != -1) {
			local18 = Static532.aClass157_2.method3734(arg0.anInt7655);
			if (local18 == null || local18.anIntArray326 == null) {
				arg0.aBoolean645 = false;
				arg0.anInt7655 = -1;
			} else {
				label394: {
					arg0.anInt7625++;
					if (arg0.anInt7586 < local18.anIntArray326.length && arg0.anInt7625 > local18.anIntArray325[arg0.anInt7586]) {
						arg0.anInt7617++;
						arg0.anInt7586++;
						arg0.anInt7625 = 1;
						Static28.method957(local18, arg0.aByte103, arg0.anInt9396, arg0.anInt9398, arg0 == Static443.aClass2_Sub2_Sub1_Sub1_2, arg0.anInt7586);
					}
					if (local18.anIntArray326.length <= arg0.anInt7586) {
						arg0.anInt7625 = 0;
						arg0.anInt7586 = 0;
						if (arg0.aBoolean645) {
							arg0.anInt7655 = arg0.method6316().method4287();
							if (arg0.anInt7655 == -1) {
								arg0.aBoolean645 = false;
								break label394;
							}
							local18 = Static532.aClass157_2.method3734(arg0.anInt7655);
						}
						Static28.method957(local18, arg0.aByte103, arg0.anInt9396, arg0.anInt9398, Static443.aClass2_Sub2_Sub1_Sub1_2 == arg0, arg0.anInt7586);
					}
					arg0.anInt7617 = arg0.anInt7586 + 1;
					if (local18.anIntArray326.length <= arg0.anInt7617) {
						arg0.anInt7617 = 0;
					}
				}
			}
		}
		@Pc(177) int local177;
		@Pc(185) Class174 local185;
		@Pc(174) Class77 local174;
		if (arg0.anInt7621 != -1 && Static129.anInt10429 >= arg0.anInt7618) {
			local174 = Static107.aClass303_1.method7476(arg0.anInt7621);
			local177 = local174.anInt2573;
			if (local177 == -1) {
				arg0.anInt7621 = -1;
			} else {
				label396: {
					local185 = Static532.aClass157_2.method3734(local177);
					if (local174.aBoolean197) {
						if (local185.anInt5487 == 3) {
							if (arg0.anInt7659 > 0 && arg0.anInt7616 <= Static129.anInt10429 && Static129.anInt10429 > arg0.anInt7633) {
								arg0.anInt7621 = -1;
								break label396;
							}
						} else if (local185.anInt5487 == 1 && arg0.anInt7659 > 0 && Static129.anInt10429 >= arg0.anInt7616 && arg0.anInt7633 < Static129.anInt10429) {
							arg0.anInt7618 = Static129.anInt10429 + 1;
							break label396;
						}
					}
					if (local185 == null || local185.anIntArray326 == null) {
						arg0.anInt7621 = -1;
					} else {
						if (arg0.anInt7594 < 0) {
							arg0.anInt7594 = 0;
							Static28.method957(local185, arg0.aByte103, arg0.anInt9396, arg0.anInt9398, arg0 == Static443.aClass2_Sub2_Sub1_Sub1_2, 0);
						}
						arg0.anInt7596++;
						if (local185.anIntArray326.length > arg0.anInt7594 && local185.anIntArray325[arg0.anInt7594] < arg0.anInt7596) {
							arg0.anInt7594++;
							arg0.anInt7596 = 1;
							Static28.method957(local185, arg0.aByte103, arg0.anInt9396, arg0.anInt9398, arg0 == Static443.aClass2_Sub2_Sub1_Sub1_2, arg0.anInt7594);
						}
						if (local185.anIntArray326.length <= arg0.anInt7594) {
							if (local174.aBoolean197) {
								arg0.anInt7622++;
								arg0.anInt7594 -= local185.anInt5485;
								if (arg0.anInt7622 >= local185.anInt5479) {
									arg0.anInt7621 = -1;
								} else if (arg0.anInt7594 >= 0 && local185.anIntArray326.length > arg0.anInt7594) {
									Static28.method957(local185, arg0.aByte103, arg0.anInt9396, arg0.anInt9398, arg0 == Static443.aClass2_Sub2_Sub1_Sub1_2, arg0.anInt7594);
								} else {
									arg0.anInt7621 = -1;
								}
							} else {
								arg0.anInt7621 = -1;
							}
						}
						arg0.anInt7623 = arg0.anInt7594 + 1;
						if (local185.anIntArray326.length <= arg0.anInt7623) {
							if (local174.aBoolean197) {
								arg0.anInt7623 -= local185.anInt5485;
								if (arg0.anInt7622 + 1 >= local185.anInt5479) {
									arg0.anInt7623 = -1;
								} else if (arg0.anInt7623 < 0 || arg0.anInt7623 >= local185.anIntArray326.length) {
									arg0.anInt7623 = -1;
								}
							} else {
								arg0.anInt7623 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt7638 != -1 && Static129.anInt10429 >= arg0.anInt7649) {
			local174 = Static107.aClass303_1.method7476(arg0.anInt7638);
			local177 = local174.anInt2573;
			if (local177 == -1) {
				arg0.anInt7638 = -1;
			} else {
				label399: {
					local185 = Static532.aClass157_2.method3734(local177);
					if (local174.aBoolean197) {
						if (local185.anInt5487 == 3) {
							if (arg0.anInt7659 > 0 && Static129.anInt10429 >= arg0.anInt7616 && Static129.anInt10429 > arg0.anInt7633) {
								arg0.anInt7638 = -1;
								break label399;
							}
						} else if (local185.anInt5487 == 1 && arg0.anInt7659 > 0 && Static129.anInt10429 >= arg0.anInt7616 && Static129.anInt10429 > arg0.anInt7633) {
							arg0.anInt7649 = Static129.anInt10429 + 1;
							break label399;
						}
					}
					if (local185 == null || local185.anIntArray326 == null) {
						arg0.anInt7638 = -1;
					} else {
						if (arg0.anInt7656 < 0) {
							arg0.anInt7656 = 0;
							Static28.method957(local185, arg0.aByte103, arg0.anInt9396, arg0.anInt9398, arg0 == Static443.aClass2_Sub2_Sub1_Sub1_2, 0);
						}
						arg0.anInt7612++;
						if (arg0.anInt7656 < local185.anIntArray326.length && arg0.anInt7612 > local185.anIntArray325[arg0.anInt7656]) {
							arg0.anInt7656++;
							arg0.anInt7612 = 1;
							Static28.method957(local185, arg0.aByte103, arg0.anInt9396, arg0.anInt9398, arg0 == Static443.aClass2_Sub2_Sub1_Sub1_2, arg0.anInt7656);
						}
						if (arg0.anInt7656 >= local185.anIntArray326.length) {
							if (local174.aBoolean197) {
								arg0.anInt7656 -= local185.anInt5485;
								arg0.anInt7620++;
								if (local185.anInt5479 <= arg0.anInt7620) {
									arg0.anInt7638 = -1;
								} else if (arg0.anInt7656 >= 0 && arg0.anInt7656 < local185.anIntArray326.length) {
									Static28.method957(local185, arg0.aByte103, arg0.anInt9396, arg0.anInt9398, Static443.aClass2_Sub2_Sub1_Sub1_2 == arg0, arg0.anInt7656);
								} else {
									arg0.anInt7638 = -1;
								}
							} else {
								arg0.anInt7638 = -1;
							}
						}
						arg0.anInt7653 = arg0.anInt7656 + 1;
						if (local185.anIntArray326.length <= arg0.anInt7653) {
							if (local174.aBoolean197) {
								arg0.anInt7653 -= local185.anInt5485;
								if (local185.anInt5479 <= arg0.anInt7620 + 1) {
									arg0.anInt7653 = -1;
								} else if (arg0.anInt7653 < 0 || local185.anIntArray326.length <= arg0.anInt7653) {
									arg0.anInt7653 = -1;
								}
							} else {
								arg0.anInt7653 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt7651 != -1 && arg0.anInt7584 <= 1) {
			local18 = Static532.aClass157_2.method3734(arg0.anInt7651);
			if (local18.anInt5487 == 3) {
				if (arg0.anInt7659 > 0 && arg0.anInt7616 <= Static129.anInt10429 && arg0.anInt7633 < Static129.anInt10429) {
					arg0.anInt7651 = -1;
					arg0.anIntArray484 = null;
				}
			} else if (local18.anInt5487 == 1 && arg0.anInt7659 > 0 && arg0.anInt7616 <= Static129.anInt10429 && Static129.anInt10429 > arg0.anInt7633) {
				arg0.anInt7584 = 2;
			}
		}
		if (arg0.anInt7651 != -1 && arg0.anInt7584 == 0) {
			local18 = Static532.aClass157_2.method3734(arg0.anInt7651);
			if (local18 == null || local18.anIntArray326 == null) {
				arg0.anIntArray484 = null;
				arg0.anInt7651 = -1;
			} else {
				arg0.anInt7588++;
				if (local18.anIntArray326.length > arg0.anInt7646 && arg0.anInt7588 > local18.anIntArray325[arg0.anInt7646]) {
					arg0.anInt7588 = 1;
					arg0.anInt7646++;
					Static28.method957(local18, arg0.aByte103, arg0.anInt9396, arg0.anInt9398, arg0 == Static443.aClass2_Sub2_Sub1_Sub1_2, arg0.anInt7646);
				}
				if (local18.anIntArray326.length <= arg0.anInt7646) {
					arg0.anInt7589++;
					arg0.anInt7646 -= local18.anInt5485;
					if (local18.anInt5479 <= arg0.anInt7589) {
						arg0.anIntArray484 = null;
						arg0.anInt7651 = -1;
					} else if (arg0.anInt7646 >= 0 && arg0.anInt7646 < local18.anIntArray326.length) {
						Static28.method957(local18, arg0.aByte103, arg0.anInt9396, arg0.anInt9398, Static443.aClass2_Sub2_Sub1_Sub1_2 == arg0, arg0.anInt7646);
					} else {
						arg0.anInt7651 = -1;
						arg0.anIntArray484 = null;
					}
				}
				arg0.anInt7615 = arg0.anInt7646 + 1;
				if (local18.anIntArray326.length <= arg0.anInt7615) {
					arg0.anInt7615 -= local18.anInt5485;
					if (arg0.anInt7589 + 1 >= local18.anInt5479) {
						arg0.anInt7615 = -1;
					} else if (arg0.anInt7615 < 0 || local18.anIntArray326.length <= arg0.anInt7615) {
						arg0.anInt7615 = -1;
					}
				}
				arg0.anInt7598 = local18.anInt5494;
			}
		}
		if (arg0.anInt7584 > 0) {
			arg0.anInt7584--;
		}
		for (@Pc(1038) int local1038 = 0; local1038 < arg0.aClass216Array3.length; local1038++) {
			@Pc(1044) Class216 local1044 = arg0.aClass216Array3[local1038];
			if (local1044 != null) {
				if (local1044.anInt6911 > 0) {
					local1044.anInt6911--;
				} else {
					local185 = Static532.aClass157_2.method3734(local1044.anInt6912);
					if (local185 == null || local185.anIntArray326 == null) {
						arg0.aClass216Array3[local1038] = null;
					} else {
						local1044.anInt6913++;
						if (local185.anIntArray326.length > local1044.anInt6906 && local1044.anInt6913 > local185.anIntArray325[local1044.anInt6906]) {
							local1044.anInt6906++;
							local1044.anInt6913 = 1;
							Static28.method957(local185, arg0.aByte103, arg0.anInt9396, arg0.anInt9398, arg0 == Static443.aClass2_Sub2_Sub1_Sub1_2, local1044.anInt6906);
						}
						if (local185.anIntArray326.length <= local1044.anInt6906) {
							local1044.anInt6906 -= local185.anInt5485;
							local1044.anInt6908++;
							if (local185.anInt5479 <= local1044.anInt6908) {
								arg0.aClass216Array3[local1038] = null;
							} else if (local1044.anInt6906 >= 0 && local185.anIntArray326.length > local1044.anInt6906) {
								Static28.method957(local185, arg0.aByte103, arg0.anInt9396, arg0.anInt9398, Static443.aClass2_Sub2_Sub1_Sub1_2 == arg0, local1044.anInt6906);
							} else {
								arg0.aClass216Array3[local1038] = null;
							}
						}
						local1044.anInt6904 = local1044.anInt6906 + 1;
						if (local1044.anInt6904 >= local185.anIntArray326.length) {
							local1044.anInt6904 -= local185.anInt5485;
							if (local1044.anInt6908 + 1 >= local185.anInt5479) {
								local1044.anInt6904 = -1;
							} else if (local1044.anInt6904 < 0 || local1044.anInt6904 >= local185.anIntArray326.length) {
								local1044.anInt6904 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIIIII)V")
	public static void method7910(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		for (@Pc(4) Class55_Sub5 local4 = (Class55_Sub5) Static206.aClass134_10.method3233(); local4 != null; local4 = (Class55_Sub5) Static206.aClass134_10.method3230()) {
			if (local4.anInt7143 <= Static129.anInt10429) {
				local4.method7112();
			} else {
				Static479.method7343(arg3 >> 1, arg0 >> 1, (local4.anInt7147 << 9) + 256, local4.anInt7142, local4.anInt7145 * 2, (local4.anInt7148 << 9) + 256);
				Static162.aClass111_6.method6681(local4.anInt7141 | 0xFF000000, arg1 + Static580.anIntArray664[1], local4.aString80, Static580.anIntArray664[0] + arg2, 0);
			}
		}
	}
}
