import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "Lclient!pd;")
	public static Class20 aClass20_17;

	@OriginalMember(owner = "client!dd", name = "y", descriptor = "[I")
	public static int[] anIntArray66;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "Lclient!ja;")
	private static Class39 aClass39_360 = Static28.method504("Attack");

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "[I")
	public static int[] anIntArray65 = new int[5];

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "Lclient!ja;")
	public static Class39 aClass39_361 = Static28.method504(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "Lclient!ja;")
	private static Class39 aClass39_368 = Static28.method504("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "Lclient!ja;")
	public static Class39 aClass39_362 = aClass39_368;

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
	public static int anInt646 = -1;

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "Lclient!ja;")
	private static Class39 aClass39_365 = Static28.method504("World");

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "Lclient!ja;")
	public static Class39 aClass39_363 = aClass39_365;

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "Lclient!c;")
	public static Class12 aClass12_19 = new Class12(64);

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "Lclient!ja;")
	public static Class39 aClass39_364 = aClass39_360;

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
	public static int anInt649 = 0;

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
	public static int anInt653 = 0;

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "Lclient!ja;")
	public static Class39 aClass39_366 = aClass39_365;

	@OriginalMember(owner = "client!dd", name = "s", descriptor = "Lclient!ja;")
	public static Class39 aClass39_367 = Static28.method504("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!dd", name = "A", descriptor = "Lclient!ja;")
	private static Class39 aClass39_371 = Static28.method504("Login server offline)3");

	@OriginalMember(owner = "client!dd", name = "u", descriptor = "Lclient!ja;")
	public static Class39 aClass39_369 = aClass39_371;

	@OriginalMember(owner = "client!dd", name = "w", descriptor = "Lclient!ja;")
	public static Class39 aClass39_370 = Static28.method504("welle:");

	@OriginalMember(owner = "client!dd", name = "B", descriptor = "Lclient!ja;")
	public static Class39 aClass39_372 = Static28.method504(" x ");

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IBLclient!ae;)V")
	public static void method426(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub2_Sub1_Sub1 arg1) {
		if (arg1.anInt2654 > Static71.anInt1738) {
			Static20.method386(arg1);
		} else if (Static71.anInt1738 > arg1.anInt2687) {
			Static77.method1292(arg1);
		} else {
			Static110.method1947(arg1);
		}
		if (arg1.anInt2643 < 128 || arg1.anInt2641 < 128 || arg1.anInt2643 >= 13184 || arg1.anInt2641 >= 13184) {
			arg1.anInt2687 = 0;
			arg1.anInt2692 = -1;
			arg1.anInt2654 = 0;
			arg1.anInt2643 = arg1.anIntArray300[0] * 128 + arg1.anInt2653 * 64;
			arg1.anInt2678 = -1;
			arg1.anInt2641 = arg1.anIntArray296[0] * 128 + arg1.anInt2653 * 64;
			arg1.method1910();
		}
		if (Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1 == arg1 && (arg1.anInt2643 < 1536 || arg1.anInt2641 < 1536 || arg1.anInt2643 >= 11776 || arg1.anInt2641 >= 11776)) {
			arg1.anInt2692 = -1;
			arg1.anInt2678 = -1;
			arg1.anInt2654 = 0;
			arg1.anInt2641 = arg1.anIntArray296[0] * 128 + arg1.anInt2653 * 64;
			arg1.anInt2643 = arg1.anInt2653 * 64 + arg1.anIntArray300[0] * 128;
			arg1.anInt2687 = 0;
			arg1.method1910();
		}
		Static25.method2198(arg1);
		Static85.method1523(arg1);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
	public static void method427() {
		aClass39_368 = null;
		aClass39_366 = null;
		anIntArray66 = null;
		aClass39_363 = null;
		aClass39_371 = null;
		aClass39_364 = null;
		aClass39_369 = null;
		aClass20_17 = null;
		aClass39_372 = null;
		anIntArray65 = null;
		aClass39_370 = null;
		aClass39_365 = null;
		aClass39_367 = null;
		aClass39_362 = null;
		aClass12_19 = null;
		aClass39_360 = null;
		aClass39_361 = null;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IBZI)V")
	public static void method428(@OriginalArg(2) boolean arg0) {
		Static123.anInt3048 = 22050;
		Static7.aBoolean9 = arg0;
		Static100.anInt2492 = 2;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/awt/Component;III)Lclient!ma;")
	public static Class6 method429(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(14) Class local14 = Class.forName("Class6_Sub1");
			@Pc(18) Class6 local18 = (Class6) local14.getDeclaredConstructor().newInstance();
			local18.method538(arg2, arg0, arg1);
			return local18;
		} catch (@Pc(29) Throwable local29) {
			@Pc(33) Class6_Sub2 local33 = new Class6_Sub2();
			local33.method538(arg2, arg0, arg1);
			return local33;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILclient!we;IIIILclient!ka;I)V")
	public static void method430(@OriginalArg(0) int arg0, @OriginalArg(2) Class81 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class43 arg6, @OriginalArg(8) int arg7) {
		if (Static123.aBoolean150 && (Static131.aByteArrayArrayArray7[0][arg3][arg2] & 0x2) == 0) {
			if ((Static131.aByteArrayArrayArray7[arg0][arg3][arg2] & 0x10) != 0) {
				return;
			}
			if (Static15.method246(arg3, arg2, arg0) != Static47.anInt1183) {
				return;
			}
		}
		if (arg0 < Static73.anInt1760) {
			Static73.anInt1760 = arg0;
		}
		@Pc(58) int local58 = Static6.anIntArrayArrayArray1[arg0][arg3 + 1][arg2];
		@Pc(71) int local71 = Static6.anIntArrayArrayArray1[arg0][arg3][arg2];
		@Pc(81) int local81 = Static6.anIntArrayArrayArray1[arg0][arg3][arg2 + 1];
		@Pc(93) int local93 = Static6.anIntArrayArrayArray1[arg0][arg3 + 1][arg2 + 1];
		@Pc(97) Class4_Sub2_Sub10 local97 = Static73.method1207(arg5);
		@Pc(108) int local108 = local58 + local71 + local93 + local81 >> 2;
		@Pc(120) int local120 = arg3 + (arg2 << 7) + (arg5 << 14) + 1073741824;
		if (local97.anInt1404 == 0) {
			local120 += Integer.MIN_VALUE;
		}
		@Pc(136) int local136 = (arg4 << 6) + arg7;
		if (local97.anInt1396 == 1) {
			local136 += 256;
		}
		if (local97.method922()) {
			Static44.method739(local97, arg4, arg0, arg3, arg2);
		}
		@Pc(191) Class4_Sub2_Sub1 local191;
		if (arg7 != 22) {
			@Pc(298) int local298;
			if (arg7 == 10 || arg7 == 11) {
				if (local97.anInt1428 == -1 && local97.anIntArray144 == null) {
					local191 = local97.method929(local58, arg4, 10, local93, local71, local81);
				} else {
					local191 = new Class4_Sub2_Sub1_Sub2(arg5, 10, arg4, local71, local58, local93, local81, local97.anInt1428, true, null);
				}
				if (local191 != null) {
					@Pc(278) int local278 = 0;
					if (arg7 == 11) {
						local278 += 256;
					}
					@Pc(295) int local295;
					if (arg4 == 1 || arg4 == 3) {
						local295 = local97.anInt1410;
						local298 = local97.anInt1413;
					} else {
						local295 = local97.anInt1413;
						local298 = local97.anInt1410;
					}
					if (arg6.method1092(arg0, arg3, arg2, local108, local298, local295, local191, local278, local120, local136) && local97.aBoolean73) {
						@Pc(324) int local324 = 15;
						if (local191 instanceof Class4_Sub2_Sub1_Sub6) {
							local324 = ((Class4_Sub2_Sub1_Sub6) local191).method2141() / 4;
							if (local324 > 30) {
								local324 = 30;
							}
						}
						for (@Pc(342) int local342 = 0; local342 <= local298; local342++) {
							for (@Pc(346) int local346 = 0; local346 <= local295; local346++) {
								if (local324 > Static14.aByteArrayArrayArray1[arg0][local342 + arg3][local346 + arg2]) {
									Static14.aByteArrayArrayArray1[arg0][arg3 + local342][local346 + arg2] = (byte) local324;
								}
							}
						}
					}
				}
				if (local97.anInt1407 != 0 && arg1 != null) {
					arg1.method2226(local97.anInt1413, arg4, local97.anInt1410, local97.aBoolean75, arg3, arg2);
				}
			} else if (arg7 >= 12) {
				if (local97.anInt1428 == -1 && local97.anIntArray144 == null) {
					local191 = local97.method929(local58, arg4, arg7, local93, local71, local81);
				} else {
					local191 = new Class4_Sub2_Sub1_Sub2(arg5, arg7, arg4, local71, local58, local93, local81, local97.anInt1428, true, null);
				}
				arg6.method1092(arg0, arg3, arg2, local108, 1, 1, local191, 0, local120, local136);
				if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg0 > 0) {
					Static72.anIntArrayArrayArray4[arg0][arg3][arg2] |= 0x924;
				}
				if (local97.anInt1407 != 0 && arg1 != null) {
					arg1.method2226(local97.anInt1413, arg4, local97.anInt1410, local97.aBoolean75, arg3, arg2);
				}
			} else if (arg7 == 0) {
				if (local97.anInt1428 == -1 && local97.anIntArray144 == null) {
					local191 = local97.method929(local58, arg4, 0, local93, local71, local81);
				} else {
					local191 = new Class4_Sub2_Sub1_Sub2(arg5, 0, arg4, local71, local58, local93, local81, local97.anInt1428, true, null);
				}
				arg6.method1114(arg0, arg3, arg2, local108, local191, null, Static99.anIntArray279[arg4], 0, local120, local136);
				if (arg4 == 0) {
					if (local97.aBoolean73) {
						Static14.aByteArrayArrayArray1[arg0][arg3][arg2] = 50;
						Static14.aByteArrayArrayArray1[arg0][arg3][arg2 + 1] = 50;
					}
					if (local97.aBoolean78) {
						Static72.anIntArrayArrayArray4[arg0][arg3][arg2] |= 0x249;
					}
				} else if (arg4 == 1) {
					if (local97.aBoolean73) {
						Static14.aByteArrayArrayArray1[arg0][arg3][arg2 + 1] = 50;
						Static14.aByteArrayArrayArray1[arg0][arg3 + 1][arg2 + 1] = 50;
					}
					if (local97.aBoolean78) {
						Static72.anIntArrayArrayArray4[arg0][arg3][arg2 + 1] |= 0x492;
					}
				} else if (arg4 == 2) {
					if (local97.aBoolean73) {
						Static14.aByteArrayArrayArray1[arg0][arg3 + 1][arg2] = 50;
						Static14.aByteArrayArrayArray1[arg0][arg3 + 1][arg2 + 1] = 50;
					}
					if (local97.aBoolean78) {
						Static72.anIntArrayArrayArray4[arg0][arg3 + 1][arg2] |= 0x249;
					}
				} else if (arg4 == 3) {
					if (local97.aBoolean73) {
						Static14.aByteArrayArrayArray1[arg0][arg3][arg2] = 50;
						Static14.aByteArrayArrayArray1[arg0][arg3 + 1][arg2] = 50;
					}
					if (local97.aBoolean78) {
						Static72.anIntArrayArrayArray4[arg0][arg3][arg2] |= 0x492;
					}
				}
				if (local97.anInt1407 != 0 && arg1 != null) {
					arg1.method2224(arg4, arg2, arg7, local97.aBoolean75, arg3);
				}
				if (local97.anInt1412 != 16) {
					arg6.method1086(arg0, arg3, arg2, local97.anInt1412);
				}
			} else if (arg7 == 1) {
				if (local97.anInt1428 == -1 && local97.anIntArray144 == null) {
					local191 = local97.method929(local58, arg4, 1, local93, local71, local81);
				} else {
					local191 = new Class4_Sub2_Sub1_Sub2(arg5, 1, arg4, local71, local58, local93, local81, local97.anInt1428, true, null);
				}
				arg6.method1114(arg0, arg3, arg2, local108, local191, null, Static131.anIntArray367[arg4], 0, local120, local136);
				if (local97.aBoolean73) {
					if (arg4 == 0) {
						Static14.aByteArrayArrayArray1[arg0][arg3][arg2 + 1] = 50;
					} else if (arg4 == 1) {
						Static14.aByteArrayArrayArray1[arg0][arg3 + 1][arg2 + 1] = 50;
					} else if (arg4 == 2) {
						Static14.aByteArrayArrayArray1[arg0][arg3 + 1][arg2] = 50;
					} else if (arg4 == 3) {
						Static14.aByteArrayArrayArray1[arg0][arg3][arg2] = 50;
					}
				}
				if (local97.anInt1407 != 0 && arg1 != null) {
					arg1.method2224(arg4, arg2, arg7, local97.aBoolean75, arg3);
				}
			} else {
				@Pc(919) int local919;
				@Pc(948) Class4_Sub2_Sub1 local948;
				if (arg7 == 2) {
					local919 = arg4 + 1 & 0x3;
					@Pc(938) Class4_Sub2_Sub1 local938;
					if (local97.anInt1428 == -1 && local97.anIntArray144 == null) {
						local938 = local97.method929(local58, arg4 + 4, 2, local93, local71, local81);
						local948 = local97.method929(local58, local919, 2, local93, local71, local81);
					} else {
						local938 = new Class4_Sub2_Sub1_Sub2(arg5, 2, arg4 + 4, local71, local58, local93, local81, local97.anInt1428, true, null);
						local948 = new Class4_Sub2_Sub1_Sub2(arg5, 2, local919, local71, local58, local93, local81, local97.anInt1428, true, null);
					}
					arg6.method1114(arg0, arg3, arg2, local108, local938, local948, Static99.anIntArray279[arg4], Static99.anIntArray279[local919], local120, local136);
					if (local97.aBoolean78) {
						if (arg4 == 0) {
							Static72.anIntArrayArrayArray4[arg0][arg3][arg2] |= 0x249;
							Static72.anIntArrayArrayArray4[arg0][arg3][arg2 + 1] |= 0x492;
						} else if (arg4 == 1) {
							Static72.anIntArrayArrayArray4[arg0][arg3][arg2 + 1] |= 0x492;
							Static72.anIntArrayArrayArray4[arg0][arg3 + 1][arg2] |= 0x249;
						} else if (arg4 == 2) {
							Static72.anIntArrayArrayArray4[arg0][arg3 + 1][arg2] |= 0x249;
							Static72.anIntArrayArrayArray4[arg0][arg3][arg2] |= 0x492;
						} else if (arg4 == 3) {
							Static72.anIntArrayArrayArray4[arg0][arg3][arg2] |= 0x492;
							Static72.anIntArrayArrayArray4[arg0][arg3][arg2] |= 0x249;
						}
					}
					if (local97.anInt1407 != 0 && arg1 != null) {
						arg1.method2224(arg4, arg2, arg7, local97.aBoolean75, arg3);
					}
					if (local97.anInt1412 != 16) {
						arg6.method1086(arg0, arg3, arg2, local97.anInt1412);
					}
				} else if (arg7 == 3) {
					if (local97.anInt1428 == -1 && local97.anIntArray144 == null) {
						local191 = local97.method929(local58, arg4, 3, local93, local71, local81);
					} else {
						local191 = new Class4_Sub2_Sub1_Sub2(arg5, 3, arg4, local71, local58, local93, local81, local97.anInt1428, true, null);
					}
					arg6.method1114(arg0, arg3, arg2, local108, local191, null, Static131.anIntArray367[arg4], 0, local120, local136);
					if (local97.aBoolean73) {
						if (arg4 == 0) {
							Static14.aByteArrayArrayArray1[arg0][arg3][arg2 + 1] = 50;
						} else if (arg4 == 1) {
							Static14.aByteArrayArrayArray1[arg0][arg3 + 1][arg2 + 1] = 50;
						} else if (arg4 == 2) {
							Static14.aByteArrayArrayArray1[arg0][arg3 + 1][arg2] = 50;
						} else if (arg4 == 3) {
							Static14.aByteArrayArrayArray1[arg0][arg3][arg2] = 50;
						}
					}
					if (local97.anInt1407 != 0 && arg1 != null) {
						arg1.method2224(arg4, arg2, arg7, local97.aBoolean75, arg3);
					}
				} else if (arg7 == 9) {
					if (local97.anInt1428 == -1 && local97.anIntArray144 == null) {
						local191 = local97.method929(local58, arg4, arg7, local93, local71, local81);
					} else {
						local191 = new Class4_Sub2_Sub1_Sub2(arg5, arg7, arg4, local71, local58, local93, local81, local97.anInt1428, true, null);
					}
					arg6.method1092(arg0, arg3, arg2, local108, 1, 1, local191, 0, local120, local136);
					if (local97.anInt1407 != 0 && arg1 != null) {
						arg1.method2226(local97.anInt1413, arg4, local97.anInt1410, local97.aBoolean75, arg3, arg2);
					}
				} else {
					if (local97.aBoolean72) {
						if (arg4 == 1) {
							local919 = local81;
							local81 = local93;
							local93 = local58;
							local58 = local71;
							local71 = local919;
						} else if (arg4 == 2) {
							local919 = local81;
							local81 = local58;
							local58 = local919;
							@Pc(1419) int local1419 = local93;
							local93 = local71;
							local71 = local1419;
						} else if (arg4 == 3) {
							local919 = local81;
							local81 = local71;
							local71 = local58;
							local58 = local93;
							local93 = local919;
						}
					}
					if (arg7 == 4) {
						if (local97.anInt1428 == -1 && local97.anIntArray144 == null) {
							local191 = local97.method929(local58, 0, 4, local93, local71, local81);
						} else {
							local191 = new Class4_Sub2_Sub1_Sub2(arg5, 4, 0, local71, local58, local93, local81, local97.anInt1428, true, null);
						}
						arg6.method1118(arg0, arg3, arg2, local108, local191, Static99.anIntArray279[arg4], arg4 * 512, 0, 0, local120, local136);
					} else if (arg7 == 5) {
						local919 = 16;
						local298 = arg6.method1099(arg0, arg3, arg2);
						if (local298 != 0) {
							local919 = Static73.method1207(local298 >> 14 & 0x7FFF).anInt1412;
						}
						if (local97.anInt1428 == -1 && local97.anIntArray144 == null) {
							local948 = local97.method929(local58, 0, 4, local93, local71, local81);
						} else {
							local948 = new Class4_Sub2_Sub1_Sub2(arg5, 4, 0, local71, local58, local93, local81, local97.anInt1428, true, null);
						}
						arg6.method1118(arg0, arg3, arg2, local108, local948, Static99.anIntArray279[arg4], arg4 * 512, Static130.anIntArray364[arg4] * local919, local919 * Static25.anIntArray363[arg4], local120, local136);
					} else if (arg7 == 6) {
						if (local97.anInt1428 == -1 && local97.anIntArray144 == null) {
							local191 = local97.method929(local58, 0, 4, local93, local71, local81);
						} else {
							local191 = new Class4_Sub2_Sub1_Sub2(arg5, 4, 0, local71, local58, local93, local81, local97.anInt1428, true, null);
						}
						arg6.method1118(arg0, arg3, arg2, local108, local191, 256, arg4, 0, 0, local120, local136);
					} else if (arg7 == 7) {
						if (local97.anInt1428 == -1 && local97.anIntArray144 == null) {
							local191 = local97.method929(local58, 0, 4, local93, local71, local81);
						} else {
							local191 = new Class4_Sub2_Sub1_Sub2(arg5, 4, 0, local71, local58, local93, local81, local97.anInt1428, true, null);
						}
						arg6.method1118(arg0, arg3, arg2, local108, local191, 512, arg4, 0, 0, local120, local136);
					} else if (arg7 == 8) {
						if (local97.anInt1428 == -1 && local97.anIntArray144 == null) {
							local191 = local97.method929(local58, 0, 4, local93, local71, local81);
						} else {
							local191 = new Class4_Sub2_Sub1_Sub2(arg5, 4, 0, local71, local58, local93, local81, local97.anInt1428, true, null);
						}
						arg6.method1118(arg0, arg3, arg2, local108, local191, 768, arg4, 0, 0, local120, local136);
					}
				}
			}
		} else if (!Static123.aBoolean150 || local97.anInt1404 != 0 || local97.anInt1407 == 1 || local97.aBoolean74) {
			if (local97.anInt1428 == -1 && local97.anIntArray144 == null) {
				local191 = local97.method929(local58, arg4, 22, local93, local71, local81);
			} else {
				local191 = new Class4_Sub2_Sub1_Sub2(arg5, 22, arg4, local71, local58, local93, local81, local97.anInt1428, true, null);
			}
			arg6.method1102(arg0, arg3, arg2, local108, local191, local120, local136);
			if (local97.anInt1407 == 1 && arg1 != null) {
				arg1.method2225(arg3, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)J")
	public static synchronized long method431() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (local5 < Static126.aLong156) {
			Static118.aLong142 += Static126.aLong156 - local5;
		}
		Static126.aLong156 = local5;
		return local5 + Static118.aLong142;
	}
}
