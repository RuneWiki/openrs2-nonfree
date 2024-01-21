import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!u", name = "g", descriptor = "I")
	public static int anInt2817;

	@OriginalMember(owner = "client!u", name = "J", descriptor = "Lclient!oe;")
	public static Class47 aClass47_1;

	@OriginalMember(owner = "client!u", name = "d", descriptor = "Z")
	public static boolean aBoolean161 = false;

	@OriginalMember(owner = "client!u", name = "o", descriptor = "Lclient!id;")
	private static Class34 aClass34_1434 = Static9.method266("flash3:");

	@OriginalMember(owner = "client!u", name = "f", descriptor = "Lclient!id;")
	public static Class34 aClass34_1433 = aClass34_1434;

	@OriginalMember(owner = "client!u", name = "s", descriptor = "Lclient!jd;")
	public static Class38 aClass38_24 = new Class38();

	@OriginalMember(owner = "client!u", name = "u", descriptor = "Lclient!id;")
	public static Class34 aClass34_1435 = aClass34_1434;

	@OriginalMember(owner = "client!u", name = "w", descriptor = "Lclient!id;")
	public static Class34 aClass34_1436 = Static9.method266("sl_flags");

	@OriginalMember(owner = "client!u", name = "A", descriptor = "Lclient!qd;")
	public static Class63 aClass63_24 = new Class63(30);

	@OriginalMember(owner = "client!u", name = "K", descriptor = "Lclient!id;")
	private static Class34 aClass34_1444 = Static9.method266("No response from server)3");

	@OriginalMember(owner = "client!u", name = "B", descriptor = "Lclient!id;")
	public static Class34 aClass34_1437 = aClass34_1444;

	@OriginalMember(owner = "client!u", name = "C", descriptor = "I")
	public static int anInt2830 = 0;

	@OriginalMember(owner = "client!u", name = "D", descriptor = "Lclient!id;")
	public static Class34 aClass34_1438 = Static9.method266("(U0a )2 in: ");

	@OriginalMember(owner = "client!u", name = "F", descriptor = "Lclient!id;")
	private static Class34 aClass34_1440 = Static9.method266("Create a free account");

	@OriginalMember(owner = "client!u", name = "E", descriptor = "Lclient!id;")
	public static Class34 aClass34_1439 = aClass34_1440;

	@OriginalMember(owner = "client!u", name = "G", descriptor = "Lclient!id;")
	private static Class34 aClass34_1441 = Static9.method266("Welcome to RuneScape");

	@OriginalMember(owner = "client!u", name = "H", descriptor = "Lclient!id;")
	public static Class34 aClass34_1442 = aClass34_1441;

	@OriginalMember(owner = "client!u", name = "I", descriptor = "Lclient!id;")
	public static Class34 aClass34_1443 = Static9.method266("Registrierter Benutzer");

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
	public static void method1872() {
		aClass34_1436 = null;
		aClass34_1437 = null;
		aClass34_1444 = null;
		aClass34_1435 = null;
		aClass47_1 = null;
		aClass34_1443 = null;
		aClass34_1440 = null;
		aClass34_1441 = null;
		aClass63_24 = null;
		aClass34_1433 = null;
		aClass34_1434 = null;
		aClass34_1442 = null;
		aClass34_1439 = null;
		aClass38_24 = null;
		aClass34_1438 = null;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(B)V")
	public static void method1873() {
		if (Static127.aClass22_3 != null) {
			Static127.aClass22_3.method931();
		}
		if (Static98.aClass22_4 != null) {
			Static98.aClass22_4.method931();
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
	public static void method1875() {
		for (@Pc(11) Class1_Sub16 local11 = (Class1_Sub16) Static35.aClass48_5.method1337(); local11 != null; local11 = (Class1_Sub16) Static35.aClass48_5.method1335()) {
			@Pc(16) int local16 = local11.anInt1893;
			if (Static26.method496(local16)) {
				@Pc(22) boolean local22 = true;
				@Pc(26) Class1_Sub9[] local26 = Static41.aClass1_Sub9ArrayArray1[local16];
				for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
					if (local26[local28] != null) {
						local22 = local26[local28].aBoolean57;
						break;
					}
				}
				if (!local22) {
					@Pc(56) int local56 = (int) local11.aLong162;
					@Pc(60) Class1_Sub9 local60 = Static113.method1814(local56);
					if (local60 != null) {
						Static10.method277(local60);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!l;IZIIIILclient!pb;)V")
	public static void method1876(@OriginalArg(0) int arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class58 arg7) {
		if (Static21.aBoolean39 && (Static105.aByteArrayArrayArray9[0][arg6][arg2] & 0x2) == 0) {
			if ((Static105.aByteArrayArrayArray9[arg4][arg6][arg2] & 0x10) != 0) {
				return;
			}
			if (Static29.method551(arg6, arg4, arg2) != Static128.anInt3003) {
				return;
			}
		}
		if (arg4 < Static5.anInt358) {
			Static5.anInt358 = arg4;
		}
		@Pc(55) int local55 = Static98.anIntArrayArrayArray4[arg4][arg6][arg2];
		@Pc(69) int local69 = Static98.anIntArrayArrayArray4[arg4][arg6 + 1][arg2];
		@Pc(81) int local81 = Static98.anIntArrayArrayArray4[arg4][arg6 + 1][arg2 + 1];
		@Pc(91) int local91 = Static98.anIntArrayArrayArray4[arg4][arg6][arg2 + 1];
		@Pc(95) Class1_Sub1_Sub16 local95 = Static28.method2008(arg0);
		@Pc(106) int local106 = local81 + local55 + local69 + local91 >> 2;
		@Pc(118) int local118 = (arg0 << 14) + (arg2 << 7) + arg6 + 1073741824;
		if (local95.anInt2980 == 0) {
			local118 += Integer.MIN_VALUE;
		}
		@Pc(134) int local134 = (arg5 << 6) + arg3;
		if (local95.anInt2958 == 1) {
			local134 += 256;
		}
		if (local95.method1955()) {
			Static133.method2107(local95, arg5, arg2, arg4, arg6);
		}
		@Pc(191) Class1_Sub1_Sub1 local191;
		if (arg3 != 22) {
			@Pc(287) int local287;
			if (arg3 == 10 || arg3 == 11) {
				if (local95.anInt2947 == -1 && local95.anIntArray366 == null) {
					local191 = local95.method1954(10, local91, local55, arg5, local69, local81);
				} else {
					local191 = new Class1_Sub1_Sub1_Sub7(arg0, 10, arg5, local55, local69, local81, local91, local95.anInt2947, true, null);
				}
				if (local191 != null) {
					@Pc(290) int local290;
					if (arg5 == 1 || arg5 == 3) {
						local287 = local95.anInt2946;
						local290 = local95.anInt2962;
					} else {
						local287 = local95.anInt2962;
						local290 = local95.anInt2946;
					}
					@Pc(300) int local300 = 0;
					if (arg3 == 11) {
						local300 += 256;
					}
					if (arg1.method1174(arg4, arg6, arg2, local106, local287, local290, local191, local300, local118, local134) && local95.aBoolean175) {
						@Pc(322) int local322 = 15;
						if (local191 instanceof Class1_Sub1_Sub1_Sub2) {
							local322 = ((Class1_Sub1_Sub1_Sub2) local191).method1086() / 4;
							if (local322 > 30) {
								local322 = 30;
							}
						}
						for (@Pc(338) int local338 = 0; local338 <= local287; local338++) {
							for (@Pc(342) int local342 = 0; local342 <= local290; local342++) {
								if (local322 > Static69.aByteArrayArrayArray7[arg4][local338 + arg6][arg2 + local342]) {
									Static69.aByteArrayArrayArray7[arg4][arg6 + local338][arg2 + local342] = (byte) local322;
								}
							}
						}
					}
				}
				if (local95.anInt2971 != 0 && arg7 != null) {
					arg7.method1598(arg5, arg6, local95.anInt2946, local95.aBoolean173, local95.anInt2962, arg2);
				}
			} else if (arg3 >= 12) {
				if (local95.anInt2947 == -1 && local95.anIntArray366 == null) {
					local191 = local95.method1954(arg3, local91, local55, arg5, local69, local81);
				} else {
					local191 = new Class1_Sub1_Sub1_Sub7(arg0, arg3, arg5, local55, local69, local81, local91, local95.anInt2947, true, null);
				}
				arg1.method1174(arg4, arg6, arg2, local106, 1, 1, local191, 0, local118, local134);
				if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg4 > 0) {
					Static50.anIntArrayArrayArray1[arg4][arg6][arg2] |= 0x924;
				}
				if (local95.anInt2971 != 0 && arg7 != null) {
					arg7.method1598(arg5, arg6, local95.anInt2946, local95.aBoolean173, local95.anInt2962, arg2);
				}
			} else if (arg3 == 0) {
				if (local95.anInt2947 == -1 && local95.anIntArray366 == null) {
					local191 = local95.method1954(0, local91, local55, arg5, local69, local81);
				} else {
					local191 = new Class1_Sub1_Sub1_Sub7(arg0, 0, arg5, local55, local69, local81, local91, local95.anInt2947, true, null);
				}
				arg1.method1149(arg4, arg6, arg2, local106, local191, null, Static62.anIntArray177[arg5], 0, local118, local134);
				if (arg5 == 0) {
					if (local95.aBoolean175) {
						Static69.aByteArrayArrayArray7[arg4][arg6][arg2] = 50;
						Static69.aByteArrayArrayArray7[arg4][arg6][arg2 + 1] = 50;
					}
					if (local95.aBoolean171) {
						Static50.anIntArrayArrayArray1[arg4][arg6][arg2] |= 0x249;
					}
				} else if (arg5 == 1) {
					if (local95.aBoolean175) {
						Static69.aByteArrayArrayArray7[arg4][arg6][arg2 + 1] = 50;
						Static69.aByteArrayArrayArray7[arg4][arg6 + 1][arg2 + 1] = 50;
					}
					if (local95.aBoolean171) {
						Static50.anIntArrayArrayArray1[arg4][arg6][arg2 + 1] |= 0x492;
					}
				} else if (arg5 == 2) {
					if (local95.aBoolean175) {
						Static69.aByteArrayArrayArray7[arg4][arg6 + 1][arg2] = 50;
						Static69.aByteArrayArrayArray7[arg4][arg6 + 1][arg2 + 1] = 50;
					}
					if (local95.aBoolean171) {
						Static50.anIntArrayArrayArray1[arg4][arg6 + 1][arg2] |= 0x249;
					}
				} else if (arg5 == 3) {
					if (local95.aBoolean175) {
						Static69.aByteArrayArrayArray7[arg4][arg6][arg2] = 50;
						Static69.aByteArrayArrayArray7[arg4][arg6 + 1][arg2] = 50;
					}
					if (local95.aBoolean171) {
						Static50.anIntArrayArrayArray1[arg4][arg6][arg2] |= 0x492;
					}
				}
				if (local95.anInt2971 != 0 && arg7 != null) {
					arg7.method1600(arg2, arg3, arg6, arg5, local95.aBoolean173);
				}
				if (local95.anInt2960 != 16) {
					arg1.method1183(arg4, arg6, arg2, local95.anInt2960);
				}
			} else if (arg3 == 1) {
				if (local95.anInt2947 == -1 && local95.anIntArray366 == null) {
					local191 = local95.method1954(1, local91, local55, arg5, local69, local81);
				} else {
					local191 = new Class1_Sub1_Sub1_Sub7(arg0, 1, arg5, local55, local69, local81, local91, local95.anInt2947, true, null);
				}
				arg1.method1149(arg4, arg6, arg2, local106, local191, null, Static15.anIntArray58[arg5], 0, local118, local134);
				if (local95.aBoolean175) {
					if (arg5 == 0) {
						Static69.aByteArrayArrayArray7[arg4][arg6][arg2 + 1] = 50;
					} else if (arg5 == 1) {
						Static69.aByteArrayArrayArray7[arg4][arg6 + 1][arg2 + 1] = 50;
					} else if (arg5 == 2) {
						Static69.aByteArrayArrayArray7[arg4][arg6 + 1][arg2] = 50;
					} else if (arg5 == 3) {
						Static69.aByteArrayArrayArray7[arg4][arg6][arg2] = 50;
					}
				}
				if (local95.anInt2971 != 0 && arg7 != null) {
					arg7.method1600(arg2, arg3, arg6, arg5, local95.aBoolean173);
				}
			} else {
				@Pc(924) int local924;
				@Pc(965) Class1_Sub1_Sub1 local965;
				if (arg3 == 2) {
					local924 = arg5 + 1 & 0x3;
					@Pc(950) Class1_Sub1_Sub1 local950;
					if (local95.anInt2947 == -1 && local95.anIntArray366 == null) {
						local950 = local95.method1954(2, local91, local55, arg5 + 4, local69, local81);
						local965 = local95.method1954(2, local91, local55, local924, local69, local81);
					} else {
						local950 = new Class1_Sub1_Sub1_Sub7(arg0, 2, arg5 + 4, local55, local69, local81, local91, local95.anInt2947, true, null);
						local965 = new Class1_Sub1_Sub1_Sub7(arg0, 2, local924, local55, local69, local81, local91, local95.anInt2947, true, null);
					}
					arg1.method1149(arg4, arg6, arg2, local106, local950, local965, Static62.anIntArray177[arg5], Static62.anIntArray177[local924], local118, local134);
					if (local95.aBoolean171) {
						if (arg5 == 0) {
							Static50.anIntArrayArrayArray1[arg4][arg6][arg2] |= 0x249;
							Static50.anIntArrayArrayArray1[arg4][arg6][arg2 + 1] |= 0x492;
						} else if (arg5 == 1) {
							Static50.anIntArrayArrayArray1[arg4][arg6][arg2 + 1] |= 0x492;
							Static50.anIntArrayArrayArray1[arg4][arg6 + 1][arg2] |= 0x249;
						} else if (arg5 == 2) {
							Static50.anIntArrayArrayArray1[arg4][arg6 + 1][arg2] |= 0x249;
							Static50.anIntArrayArrayArray1[arg4][arg6][arg2] |= 0x492;
						} else if (arg5 == 3) {
							Static50.anIntArrayArrayArray1[arg4][arg6][arg2] |= 0x492;
							Static50.anIntArrayArrayArray1[arg4][arg6][arg2] |= 0x249;
						}
					}
					if (local95.anInt2971 != 0 && arg7 != null) {
						arg7.method1600(arg2, arg3, arg6, arg5, local95.aBoolean173);
					}
					if (local95.anInt2960 != 16) {
						arg1.method1183(arg4, arg6, arg2, local95.anInt2960);
					}
				} else if (arg3 == 3) {
					if (local95.anInt2947 == -1 && local95.anIntArray366 == null) {
						local191 = local95.method1954(3, local91, local55, arg5, local69, local81);
					} else {
						local191 = new Class1_Sub1_Sub1_Sub7(arg0, 3, arg5, local55, local69, local81, local91, local95.anInt2947, true, null);
					}
					arg1.method1149(arg4, arg6, arg2, local106, local191, null, Static15.anIntArray58[arg5], 0, local118, local134);
					if (local95.aBoolean175) {
						if (arg5 == 0) {
							Static69.aByteArrayArrayArray7[arg4][arg6][arg2 + 1] = 50;
						} else if (arg5 == 1) {
							Static69.aByteArrayArrayArray7[arg4][arg6 + 1][arg2 + 1] = 50;
						} else if (arg5 == 2) {
							Static69.aByteArrayArrayArray7[arg4][arg6 + 1][arg2] = 50;
						} else if (arg5 == 3) {
							Static69.aByteArrayArrayArray7[arg4][arg6][arg2] = 50;
						}
					}
					if (local95.anInt2971 != 0 && arg7 != null) {
						arg7.method1600(arg2, arg3, arg6, arg5, local95.aBoolean173);
					}
				} else if (arg3 == 9) {
					if (local95.anInt2947 == -1 && local95.anIntArray366 == null) {
						local191 = local95.method1954(arg3, local91, local55, arg5, local69, local81);
					} else {
						local191 = new Class1_Sub1_Sub1_Sub7(arg0, arg3, arg5, local55, local69, local81, local91, local95.anInt2947, true, null);
					}
					arg1.method1174(arg4, arg6, arg2, local106, 1, 1, local191, 0, local118, local134);
					if (local95.anInt2971 != 0 && arg7 != null) {
						arg7.method1598(arg5, arg6, local95.anInt2946, local95.aBoolean173, local95.anInt2962, arg2);
					}
				} else {
					if (local95.aBoolean170) {
						if (arg5 == 1) {
							local924 = local91;
							local91 = local81;
							local81 = local69;
							local69 = local55;
							local55 = local924;
						} else if (arg5 == 2) {
							local924 = local91;
							local91 = local69;
							local69 = local924;
							local924 = local81;
							local81 = local55;
							local55 = local924;
						} else if (arg5 == 3) {
							local924 = local91;
							local91 = local55;
							local55 = local69;
							local69 = local81;
							local81 = local924;
						}
					}
					if (arg3 == 4) {
						if (local95.anInt2947 == -1 && local95.anIntArray366 == null) {
							local191 = local95.method1954(4, local91, local55, 0, local69, local81);
						} else {
							local191 = new Class1_Sub1_Sub1_Sub7(arg0, 4, 0, local55, local69, local81, local91, local95.anInt2947, true, null);
						}
						arg1.method1176(arg4, arg6, arg2, local106, local191, Static62.anIntArray177[arg5], arg5 * 512, 0, 0, local118, local134);
					} else if (arg3 == 5) {
						local924 = 16;
						local287 = arg1.method1145(arg4, arg6, arg2);
						if (local287 != 0) {
							local924 = Static28.method2008(local287 >> 14 & 0x7FFF).anInt2960;
						}
						if (local95.anInt2947 == -1 && local95.anIntArray366 == null) {
							local965 = local95.method1954(4, local91, local55, 0, local69, local81);
						} else {
							local965 = new Class1_Sub1_Sub1_Sub7(arg0, 4, 0, local55, local69, local81, local91, local95.anInt2947, true, null);
						}
						arg1.method1176(arg4, arg6, arg2, local106, local965, Static62.anIntArray177[arg5], arg5 * 512, local924 * Static86.anIntArray295[arg5], local924 * Static115.anIntArray348[arg5], local118, local134);
					} else if (arg3 == 6) {
						if (local95.anInt2947 == -1 && local95.anIntArray366 == null) {
							local191 = local95.method1954(4, local91, local55, 0, local69, local81);
						} else {
							local191 = new Class1_Sub1_Sub1_Sub7(arg0, 4, 0, local55, local69, local81, local91, local95.anInt2947, true, null);
						}
						arg1.method1176(arg4, arg6, arg2, local106, local191, 256, arg5, 0, 0, local118, local134);
					} else if (arg3 == 7) {
						if (local95.anInt2947 == -1 && local95.anIntArray366 == null) {
							local191 = local95.method1954(4, local91, local55, 0, local69, local81);
						} else {
							local191 = new Class1_Sub1_Sub1_Sub7(arg0, 4, 0, local55, local69, local81, local91, local95.anInt2947, true, null);
						}
						arg1.method1176(arg4, arg6, arg2, local106, local191, 512, arg5, 0, 0, local118, local134);
					} else if (arg3 == 8) {
						if (local95.anInt2947 == -1 && local95.anIntArray366 == null) {
							local191 = local95.method1954(4, local91, local55, 0, local69, local81);
						} else {
							local191 = new Class1_Sub1_Sub1_Sub7(arg0, 4, 0, local55, local69, local81, local91, local95.anInt2947, true, null);
						}
						arg1.method1176(arg4, arg6, arg2, local106, local191, 768, arg5, 0, 0, local118, local134);
					}
				}
			}
		} else if (!Static21.aBoolean39 || local95.anInt2980 != 0 || local95.anInt2971 == 1 || local95.aBoolean169) {
			if (local95.anInt2947 == -1 && local95.anIntArray366 == null) {
				local191 = local95.method1954(22, local91, local55, arg5, local69, local81);
			} else {
				local191 = new Class1_Sub1_Sub1_Sub7(arg0, 22, arg5, local55, local69, local81, local91, local95.anInt2947, true, null);
			}
			arg1.method1165(arg4, arg6, arg2, local106, local191, local118, local134);
			if (local95.anInt2971 == 1 && arg7 != null) {
				arg7.method1601(arg2, arg6);
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZI)V")
	public static void method1878(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(10) int local10 = Static51.anIntArray155[arg0];
		@Pc(14) int local14 = Static62.anIntArray178[arg0];
		@Pc(22) int local22 = Static126.anIntArray368[arg0];
		@Pc(26) int local26 = Static78.anIntArray245[arg0];
		if (local26 >= 2000) {
			local26 -= 2000;
		}
		@Pc(55) boolean local55;
		if (local26 == 42) {
			local55 = Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 0, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local10, false, 0, local14, 0, 0);
			if (!local55) {
				Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 1, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local10, false, 0, local14, 0, 1);
			}
			Static9.anInt458 = 2;
			Static8.anInt446 = 0;
			Static102.anInt2587 = anInt2830;
			Static124.anInt2986 = Static119.anInt2832;
			Static21.aClass1_Sub19_Sub1_1.method2105(75);
			Static21.aClass1_Sub19_Sub1_1.method2054(local22);
			Static21.aClass1_Sub19_Sub1_1.method2054(local10 + Static37.anInt1098);
			Static21.aClass1_Sub19_Sub1_1.method2054(Static121.anInt2871 + local14);
		}
		if (local26 == 1003) {
			Static124.anInt2986 = Static119.anInt2832;
			Static8.anInt446 = 0;
			Static9.anInt458 = 2;
			Static102.anInt2587 = anInt2830;
			Static21.aClass1_Sub19_Sub1_1.method2105(23);
			Static21.aClass1_Sub19_Sub1_1.method2043(local22);
		}
		if (local26 == 47) {
			Static21.aClass1_Sub19_Sub1_1.method2105(28);
			Static21.aClass1_Sub19_Sub1_1.method2088(local22);
			Static21.aClass1_Sub19_Sub1_1.method2088(local10);
			Static21.aClass1_Sub19_Sub1_1.method2069(local14);
			Static72.anInt1894 = 0;
			Static132.aClass1_Sub9_16 = Static113.method1814(local14);
			Static21.anInt769 = local10;
		}
		@Pc(175) Class1_Sub9 local175;
		if (local26 == 1001) {
			local175 = Static113.method1814(local14);
			if (local175 == null || local175.anIntArray104[local10] < 100000) {
				Static21.aClass1_Sub19_Sub1_1.method2105(23);
				Static21.aClass1_Sub19_Sub1_1.method2043(local22);
			} else {
				Static39.method685(Static81.aClass34_1058, 0, Static91.method1554(new Class34[] { Static85.method1456(local175.anIntArray104[local10]), Static22.aClass34_384, Static74.method1334(local22).aClass34_1002 }));
			}
			Static72.anInt1894 = 0;
			Static132.aClass1_Sub9_16 = Static113.method1814(local14);
			Static21.anInt769 = local10;
		}
		if (local26 == 31) {
			Static21.aClass1_Sub19_Sub1_1.method2105(102);
			Static21.aClass1_Sub19_Sub1_1.method2069(local14);
			Static21.aClass1_Sub19_Sub1_1.method2088(local10);
			Static21.aClass1_Sub19_Sub1_1.method2043(local22);
			Static72.anInt1894 = 0;
			Static132.aClass1_Sub9_16 = Static113.method1814(local14);
			Static21.anInt769 = local10;
		}
		if (local26 == 18) {
			Static42.method714(local10, local14, local22);
			Static21.aClass1_Sub19_Sub1_1.method2105(31);
			Static21.aClass1_Sub19_Sub1_1.method2043(local22 >> 14 & 0x7FFF);
			Static21.aClass1_Sub19_Sub1_1.method2054(local10 + Static37.anInt1098);
			Static21.aClass1_Sub19_Sub1_1.method2088(Static121.anInt2871 + local14);
		}
		@Pc(311) Class1_Sub1_Sub1_Sub1_Sub1 local311;
		if (local26 == 35) {
			local311 = Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local22];
			if (local311 != null) {
				Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 1, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local311.anIntArray149[0], false, 0, local311.anIntArray147[0], 0, 1);
				Static8.anInt446 = 0;
				Static124.anInt2986 = Static119.anInt2832;
				Static102.anInt2587 = anInt2830;
				Static9.anInt458 = 2;
				Static21.aClass1_Sub19_Sub1_1.method2105(99);
				Static21.aClass1_Sub19_Sub1_1.method2043(local22);
			}
		}
		@Pc(366) Class1_Sub1_Sub1_Sub1_Sub2 local366;
		if (local26 == 16) {
			local366 = Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local22];
			if (local366 != null) {
				Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 1, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local366.anIntArray149[0], false, 0, local366.anIntArray147[0], 0, 1);
				Static102.anInt2587 = anInt2830;
				Static8.anInt446 = 0;
				Static124.anInt2986 = Static119.anInt2832;
				Static9.anInt458 = 2;
				Static21.aClass1_Sub19_Sub1_1.method2105(188);
				Static21.aClass1_Sub19_Sub1_1.method2043(Static22.anInt779);
				Static21.aClass1_Sub19_Sub1_1.method2043(Static88.anInt2290);
				Static21.aClass1_Sub19_Sub1_1.method2067(local22);
				Static21.aClass1_Sub19_Sub1_1.method2077(Static94.anInt2436);
			}
		}
		if (local26 == 57) {
			Static21.aClass1_Sub19_Sub1_1.method2105(239);
			Static21.aClass1_Sub19_Sub1_1.method2077(local14);
			Static21.aClass1_Sub19_Sub1_1.method2054(Static8.anInt436);
			Static21.aClass1_Sub19_Sub1_1.method2069(Static115.anInt2779);
			Static21.aClass1_Sub19_Sub1_1.method2043(local10);
		}
		if (local26 == 13) {
			local311 = Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local22];
			if (local311 != null) {
				Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 1, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local311.anIntArray149[0], false, 0, local311.anIntArray147[0], 0, 1);
				Static8.anInt446 = 0;
				Static9.anInt458 = 2;
				Static124.anInt2986 = Static119.anInt2832;
				Static102.anInt2587 = anInt2830;
				Static21.aClass1_Sub19_Sub1_1.method2105(245);
				Static21.aClass1_Sub19_Sub1_1.method2043(local22);
			}
		}
		if (local26 == 40) {
			local311 = Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local22];
			if (local311 != null) {
				Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 1, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local311.anIntArray149[0], false, 0, local311.anIntArray147[0], 0, 1);
				Static8.anInt446 = 0;
				Static102.anInt2587 = anInt2830;
				Static124.anInt2986 = Static119.anInt2832;
				Static9.anInt458 = 2;
				Static21.aClass1_Sub19_Sub1_1.method2105(175);
				Static21.aClass1_Sub19_Sub1_1.method2069(Static115.anInt2779);
				Static21.aClass1_Sub19_Sub1_1.method2043(local22);
				Static21.aClass1_Sub19_Sub1_1.method2088(Static8.anInt436);
			}
		}
		if (local26 == 23) {
			Static21.aClass1_Sub19_Sub1_1.method2105(251);
			Static21.aClass1_Sub19_Sub1_1.method2043(local22);
			Static21.aClass1_Sub19_Sub1_1.method2043(local10);
			Static21.aClass1_Sub19_Sub1_1.method2069(local14);
			Static72.anInt1894 = 0;
			Static132.aClass1_Sub9_16 = Static113.method1814(local14);
			Static21.anInt769 = local10;
		}
		if (local26 == 9 && Static105.aClass1_Sub9_13 == null) {
			Static119.method1883(local14, local10);
			Static105.aClass1_Sub9_13 = Static133.method2109(local10, local14);
			Static10.method277(Static105.aClass1_Sub9_13);
		}
		if (local26 == 32) {
			local311 = Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local22];
			if (local311 != null) {
				Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 1, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local311.anIntArray149[0], false, 0, local311.anIntArray147[0], 0, 1);
				Static124.anInt2986 = Static119.anInt2832;
				Static8.anInt446 = 0;
				Static102.anInt2587 = anInt2830;
				Static9.anInt458 = 2;
				Static21.aClass1_Sub19_Sub1_1.method2105(203);
				Static21.aClass1_Sub19_Sub1_1.method2067(local22);
			}
		}
		if (local26 == 34) {
			Static21.aClass1_Sub19_Sub1_1.method2105(29);
			Static21.aClass1_Sub19_Sub1_1.method2077(Static94.anInt2436);
			Static21.aClass1_Sub19_Sub1_1.method2043(local10);
			Static21.aClass1_Sub19_Sub1_1.method2054(local22);
			Static21.aClass1_Sub19_Sub1_1.method2062(local14);
			Static21.aClass1_Sub19_Sub1_1.method2088(Static22.anInt779);
			Static21.aClass1_Sub19_Sub1_1.method2043(Static88.anInt2290);
			Static72.anInt1894 = 0;
			Static132.aClass1_Sub9_16 = Static113.method1814(local14);
			Static21.anInt769 = local10;
		}
		if (local26 == 44) {
			Static42.method714(local10, local14, local22);
			Static21.aClass1_Sub19_Sub1_1.method2105(106);
			Static21.aClass1_Sub19_Sub1_1.method2088(local10 + Static37.anInt1098);
			Static21.aClass1_Sub19_Sub1_1.method2043(local22 >> 14 & 0x7FFF);
			Static21.aClass1_Sub19_Sub1_1.method2067(local14 + Static121.anInt2871);
		}
		if (local26 == 45) {
			local55 = Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 0, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local10, false, 0, local14, 0, 0);
			if (!local55) {
				Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 1, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local10, false, 0, local14, 0, 1);
			}
			Static102.anInt2587 = anInt2830;
			Static9.anInt458 = 2;
			Static8.anInt446 = 0;
			Static124.anInt2986 = Static119.anInt2832;
			Static21.aClass1_Sub19_Sub1_1.method2105(83);
			Static21.aClass1_Sub19_Sub1_1.method2067(local22);
			Static21.aClass1_Sub19_Sub1_1.method2054(Static37.anInt1098 + local10);
			Static21.aClass1_Sub19_Sub1_1.method2088(Static121.anInt2871 + local14);
		}
		if (local26 == 1002) {
			Static102.anInt2587 = anInt2830;
			Static8.anInt446 = 0;
			Static9.anInt458 = 2;
			Static124.anInt2986 = Static119.anInt2832;
			local366 = Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local22];
			if (local366 != null) {
				@Pc(862) Class1_Sub1_Sub17 local862 = local366.aClass1_Sub1_Sub17_1;
				if (local862.anIntArray375 != null) {
					local862 = local862.method2010();
				}
				if (local862 != null) {
					Static21.aClass1_Sub19_Sub1_1.method2105(56);
					Static21.aClass1_Sub19_Sub1_1.method2043(local862.anInt3043);
				}
			}
		}
		if (local26 == 21) {
			Static39.aClass44_1.method1151(Static42.anInt1208, local10, local14);
		}
		if (local26 == 36) {
			local55 = Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 0, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local10, false, 0, local14, 0, 0);
			if (!local55) {
				Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 1, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local10, false, 0, local14, 0, 1);
			}
			Static102.anInt2587 = anInt2830;
			Static9.anInt458 = 2;
			Static8.anInt446 = 0;
			Static124.anInt2986 = Static119.anInt2832;
			Static21.aClass1_Sub19_Sub1_1.method2105(201);
			Static21.aClass1_Sub19_Sub1_1.method2088(Static8.anInt436);
			Static21.aClass1_Sub19_Sub1_1.method2088(local14 + Static121.anInt2871);
			Static21.aClass1_Sub19_Sub1_1.method2054(local22);
			Static21.aClass1_Sub19_Sub1_1.method2062(Static115.anInt2779);
			Static21.aClass1_Sub19_Sub1_1.method2067(Static37.anInt1098 + local10);
		}
		if (local26 == 28) {
			@Pc(984) boolean local984 = true;
			local175 = Static113.method1814(local14);
			if (local175.anInt1030 > 0) {
				local984 = Static127.method1354(local175);
			}
			if (local984) {
				Static21.aClass1_Sub19_Sub1_1.method2105(152);
				Static21.aClass1_Sub19_Sub1_1.method2062(local14);
			}
		}
		if (local26 == 20) {
			Static21.aClass1_Sub19_Sub1_1.method2105(207);
			Static21.aClass1_Sub19_Sub1_1.method2088(local10);
			Static21.aClass1_Sub19_Sub1_1.method2067(local22);
			Static21.aClass1_Sub19_Sub1_1.method2069(local14);
			Static72.anInt1894 = 0;
			Static132.aClass1_Sub9_16 = Static113.method1814(local14);
			Static21.anInt769 = local10;
		}
		if (local26 == 1005) {
			Static42.method714(local10, local14, local22);
			Static21.aClass1_Sub19_Sub1_1.method2105(149);
			Static21.aClass1_Sub19_Sub1_1.method2088(local22 >> 14 & 0x7FFF);
			Static21.aClass1_Sub19_Sub1_1.method2067(local14 + Static121.anInt2871);
			Static21.aClass1_Sub19_Sub1_1.method2043(Static37.anInt1098 + local10);
		}
		if (local26 == 14) {
			local366 = Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local22];
			if (local366 != null) {
				Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 1, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local366.anIntArray149[0], false, 0, local366.anIntArray147[0], 0, 1);
				Static102.anInt2587 = anInt2830;
				Static9.anInt458 = 2;
				Static124.anInt2986 = Static119.anInt2832;
				Static8.anInt446 = 0;
				Static21.aClass1_Sub19_Sub1_1.method2105(241);
				Static21.aClass1_Sub19_Sub1_1.method2088(local22);
			}
		}
		if (local26 == 33) {
			local366 = Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local22];
			if (local366 != null) {
				Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 1, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local366.anIntArray149[0], false, 0, local366.anIntArray147[0], 0, 1);
				Static8.anInt446 = 0;
				Static9.anInt458 = 2;
				Static124.anInt2986 = Static119.anInt2832;
				Static102.anInt2587 = anInt2830;
				Static21.aClass1_Sub19_Sub1_1.method2105(64);
				Static21.aClass1_Sub19_Sub1_1.method2067(local22);
				Static21.aClass1_Sub19_Sub1_1.method2069(Static115.anInt2779);
				Static21.aClass1_Sub19_Sub1_1.method2088(Static8.anInt436);
			}
		}
		if (local26 == 46) {
			local175 = Static133.method2109(local10, local14);
			if (local175 != null) {
				Static88.method1494();
				Static41.method697(local14, Static119.method1885(Static84.method1448(local175)), local10);
				Static130.anInt1509 = 0;
				Static32.aClass34_700 = Static19.method394(local175);
				if (Static32.aClass34_700 == null) {
					Static32.aClass34_700 = Static2.aClass34_106;
				}
				if (!local175.aBoolean57) {
					Static51.aClass34_719 = Static91.method1554(new Class34[] { Static30.aClass34_449, local175.aClass34_498, Static78.aClass34_1036 });
					return;
				}
				Static51.aClass34_719 = Static91.method1554(new Class34[] { local175.aClass34_497, Static78.aClass34_1036 });
			}
			return;
		}
		@Pc(1307) int local1307;
		if (local26 == 17) {
			Static21.aClass1_Sub19_Sub1_1.method2105(152);
			Static21.aClass1_Sub19_Sub1_1.method2062(local14);
			local175 = Static113.method1814(local14);
			if (local175.anIntArrayArray5 != null && local175.anIntArrayArray5[0][0] == 5) {
				local1307 = local175.anIntArrayArray5[0][1];
				Static39.anIntArray116[local1307] = 1 - Static39.anIntArray116[local1307];
				Static64.method1108(local1307);
			}
		}
		if (local26 == 37) {
			Static21.aClass1_Sub19_Sub1_1.method2105(1);
			Static21.aClass1_Sub19_Sub1_1.method2043(local10);
			Static21.aClass1_Sub19_Sub1_1.method2067(local22);
			Static21.aClass1_Sub19_Sub1_1.method2077(local14);
			Static72.anInt1894 = 0;
			Static132.aClass1_Sub9_16 = Static113.method1814(local14);
			Static21.anInt769 = local10;
		}
		if (local26 == 26) {
			Static21.aClass1_Sub19_Sub1_1.method2105(12);
			Static21.aClass1_Sub19_Sub1_1.method2088(local22);
			Static21.aClass1_Sub19_Sub1_1.method2062(local14);
			Static21.aClass1_Sub19_Sub1_1.method2043(local10);
			Static72.anInt1894 = 0;
			Static132.aClass1_Sub9_16 = Static113.method1814(local14);
			Static21.anInt769 = local10;
		}
		if (local26 == 12) {
			local55 = Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 0, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local10, false, 0, local14, 0, 0);
			if (!local55) {
				Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 1, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local10, false, 0, local14, 0, 1);
			}
			Static124.anInt2986 = Static119.anInt2832;
			Static8.anInt446 = 0;
			Static9.anInt458 = 2;
			Static102.anInt2587 = anInt2830;
			Static21.aClass1_Sub19_Sub1_1.method2105(136);
			Static21.aClass1_Sub19_Sub1_1.method2054(Static37.anInt1098 + local10);
			Static21.aClass1_Sub19_Sub1_1.method2054(local14 + Static121.anInt2871);
			Static21.aClass1_Sub19_Sub1_1.method2054(local22);
		}
		if (local26 == 22) {
			local366 = Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local22];
			if (local366 != null) {
				Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 1, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local366.anIntArray149[0], false, 0, local366.anIntArray147[0], 0, 1);
				Static8.anInt446 = 0;
				Static102.anInt2587 = anInt2830;
				Static9.anInt458 = 2;
				Static124.anInt2986 = Static119.anInt2832;
				Static21.aClass1_Sub19_Sub1_1.method2105(227);
				Static21.aClass1_Sub19_Sub1_1.method2054(local22);
			}
		}
		if (local26 == 48) {
			Static21.aClass1_Sub19_Sub1_1.method2105(13);
			Static21.aClass1_Sub19_Sub1_1.method2043(local10);
			Static21.aClass1_Sub19_Sub1_1.method2080(local14);
			Static21.aClass1_Sub19_Sub1_1.method2088(Static8.anInt436);
			Static21.aClass1_Sub19_Sub1_1.method2067(local22);
			Static21.aClass1_Sub19_Sub1_1.method2077(Static115.anInt2779);
			Static72.anInt1894 = 0;
			Static132.aClass1_Sub9_16 = Static113.method1814(local14);
			Static21.anInt769 = local10;
		}
		if (local26 == 19) {
			Static42.method714(local10, local14, local22);
			Static21.aClass1_Sub19_Sub1_1.method2105(129);
			Static21.aClass1_Sub19_Sub1_1.method2088(local22 >> 14 & 0x7FFF);
			Static21.aClass1_Sub19_Sub1_1.method2067(local10 + Static37.anInt1098);
			Static21.aClass1_Sub19_Sub1_1.method2054(local14 + Static121.anInt2871);
		}
		if (local26 == 2) {
			Static21.aClass1_Sub19_Sub1_1.method2105(234);
			Static21.aClass1_Sub19_Sub1_1.method2043(local10);
			Static21.aClass1_Sub19_Sub1_1.method2054(local22);
			Static21.aClass1_Sub19_Sub1_1.method2069(local14);
			Static72.anInt1894 = 0;
			Static132.aClass1_Sub9_16 = Static113.method1814(local14);
			Static21.anInt769 = local10;
		}
		if (local26 == 3) {
			local366 = Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local22];
			if (local366 != null) {
				Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 1, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local366.anIntArray149[0], false, 0, local366.anIntArray147[0], 0, 1);
				Static8.anInt446 = 0;
				Static102.anInt2587 = anInt2830;
				Static124.anInt2986 = Static119.anInt2832;
				Static9.anInt458 = 2;
				Static21.aClass1_Sub19_Sub1_1.method2105(220);
				Static21.aClass1_Sub19_Sub1_1.method2043(local22);
			}
		}
		if (local26 == 1007) {
			Static102.anInt2587 = anInt2830;
			Static124.anInt2986 = Static119.anInt2832;
			Static8.anInt446 = 0;
			Static9.anInt458 = 2;
			Static21.aClass1_Sub19_Sub1_1.method2105(22);
			Static21.aClass1_Sub19_Sub1_1.method2067(local22 >> 14 & 0x7FFF);
		}
		if (local26 == 49) {
			Static88.method1494();
			local175 = Static113.method1814(local14);
			Static88.anInt2290 = local22;
			Static94.anInt2436 = local14;
			Static22.anInt779 = local10;
			Static130.anInt1509 = 1;
			Static10.method277(local175);
			Static74.aClass34_1001 = Static91.method1554(new Class34[] { Static112.aClass34_1353, Static74.method1334(local22).aClass34_1002, Static78.aClass34_1036 });
			if (Static74.aClass34_1001 == null) {
				Static74.aClass34_1001 = Static37.aClass34_510;
			}
			return;
		}
		if (local26 == 11 && Static42.method714(local10, local14, local22)) {
			Static21.aClass1_Sub19_Sub1_1.method2105(200);
			Static21.aClass1_Sub19_Sub1_1.method2067(local14 + Static121.anInt2871);
			Static21.aClass1_Sub19_Sub1_1.method2088(local22 >> 14 & 0x7FFF);
			Static21.aClass1_Sub19_Sub1_1.method2069(Static115.anInt2779);
			Static21.aClass1_Sub19_Sub1_1.method2088(Static37.anInt1098 + local10);
			Static21.aClass1_Sub19_Sub1_1.method2043(Static8.anInt436);
		}
		if (local26 == 38) {
			Static21.aClass1_Sub19_Sub1_1.method2105(6);
			Static21.aClass1_Sub19_Sub1_1.method2067(local10);
			Static21.aClass1_Sub19_Sub1_1.method2043(local22);
			Static21.aClass1_Sub19_Sub1_1.method2069(local14);
			Static72.anInt1894 = 0;
			Static132.aClass1_Sub9_16 = Static113.method1814(local14);
			Static21.anInt769 = local10;
		}
		if (local26 == 43 || local26 == 1004) {
			Static38.method671(local14, local10, local22, Static71.aClass34Array16[arg0]);
		}
		if (local26 == 25) {
			local311 = Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local22];
			if (local311 != null) {
				Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 1, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local311.anIntArray149[0], false, 0, local311.anIntArray147[0], 0, 1);
				Static8.anInt446 = 0;
				Static124.anInt2986 = Static119.anInt2832;
				Static102.anInt2587 = anInt2830;
				Static9.anInt458 = 2;
				Static21.aClass1_Sub19_Sub1_1.method2105(92);
				Static21.aClass1_Sub19_Sub1_1.method2088(local22);
				Static21.aClass1_Sub19_Sub1_1.method2088(Static22.anInt779);
				Static21.aClass1_Sub19_Sub1_1.method2067(Static88.anInt2290);
				Static21.aClass1_Sub19_Sub1_1.method2080(Static94.anInt2436);
			}
		}
		if (local26 == 29) {
			local311 = Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local22];
			if (local311 != null) {
				Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 1, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local311.anIntArray149[0], false, 0, local311.anIntArray147[0], 0, 1);
				Static124.anInt2986 = Static119.anInt2832;
				Static8.anInt446 = 0;
				Static102.anInt2587 = anInt2830;
				Static9.anInt458 = 2;
				Static21.aClass1_Sub19_Sub1_1.method2105(229);
				Static21.aClass1_Sub19_Sub1_1.method2067(local22);
			}
		}
		if (local26 == 24) {
			Static42.method714(local10, local14, local22);
			Static21.aClass1_Sub19_Sub1_1.method2105(112);
			Static21.aClass1_Sub19_Sub1_1.method2043(Static121.anInt2871 + local14);
			Static21.aClass1_Sub19_Sub1_1.method2088(Static37.anInt1098 + local10);
			Static21.aClass1_Sub19_Sub1_1.method2088(local22 >> 14 & 0x7FFF);
		}
		if (local26 == 7) {
			local311 = Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local22];
			if (local311 != null) {
				Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 1, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local311.anIntArray149[0], false, 0, local311.anIntArray147[0], 0, 1);
				Static124.anInt2986 = Static119.anInt2832;
				Static9.anInt458 = 2;
				Static102.anInt2587 = anInt2830;
				Static8.anInt446 = 0;
				Static21.aClass1_Sub19_Sub1_1.method2105(7);
				Static21.aClass1_Sub19_Sub1_1.method2088(local22);
			}
		}
		if (local26 == 6 && Static42.method714(local10, local14, local22)) {
			Static21.aClass1_Sub19_Sub1_1.method2105(108);
			Static21.aClass1_Sub19_Sub1_1.method2054(Static121.anInt2871 + local14);
			Static21.aClass1_Sub19_Sub1_1.method2088(Static37.anInt1098 + local10);
			Static21.aClass1_Sub19_Sub1_1.method2077(Static94.anInt2436);
			Static21.aClass1_Sub19_Sub1_1.method2043(Static22.anInt779);
			Static21.aClass1_Sub19_Sub1_1.method2088(Static88.anInt2290);
			Static21.aClass1_Sub19_Sub1_1.method2067(local22 >> 14 & 0x7FFF);
		}
		if (local26 == 8) {
			local366 = Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local22];
			if (local366 != null) {
				Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 1, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local366.anIntArray149[0], false, 0, local366.anIntArray147[0], 0, 1);
				Static124.anInt2986 = Static119.anInt2832;
				Static8.anInt446 = 0;
				Static102.anInt2587 = anInt2830;
				Static9.anInt458 = 2;
				Static21.aClass1_Sub19_Sub1_1.method2105(126);
				Static21.aClass1_Sub19_Sub1_1.method2088(local22);
			}
		}
		if (local26 == 58) {
			local55 = Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 0, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local10, false, 0, local14, 0, 0);
			if (!local55) {
				Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 1, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local10, false, 0, local14, 0, 1);
			}
			Static8.anInt446 = 0;
			Static124.anInt2986 = Static119.anInt2832;
			Static102.anInt2587 = anInt2830;
			Static9.anInt458 = 2;
			Static21.aClass1_Sub19_Sub1_1.method2105(205);
			Static21.aClass1_Sub19_Sub1_1.method2088(local14 + Static121.anInt2871);
			Static21.aClass1_Sub19_Sub1_1.method2088(Static37.anInt1098 + local10);
			Static21.aClass1_Sub19_Sub1_1.method2043(local22);
		}
		if (local26 == 50) {
			Static75.method1342();
		}
		if (local26 == 15) {
			local311 = Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local22];
			if (local311 != null) {
				Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 1, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local311.anIntArray149[0], false, 0, local311.anIntArray147[0], 0, 1);
				Static102.anInt2587 = anInt2830;
				Static8.anInt446 = 0;
				Static124.anInt2986 = Static119.anInt2832;
				Static9.anInt458 = 2;
				Static21.aClass1_Sub19_Sub1_1.method2105(66);
				Static21.aClass1_Sub19_Sub1_1.method2067(local22);
			}
		}
		if (local26 == 30) {
			Static21.aClass1_Sub19_Sub1_1.method2105(24);
			Static21.aClass1_Sub19_Sub1_1.method2069(local14);
			Static21.aClass1_Sub19_Sub1_1.method2054(local10);
			Static21.aClass1_Sub19_Sub1_1.method2043(local22);
			Static72.anInt1894 = 0;
			Static132.aClass1_Sub9_16 = Static113.method1814(local14);
			Static21.anInt769 = local10;
		}
		if (local26 == 41) {
			Static21.aClass1_Sub19_Sub1_1.method2105(152);
			Static21.aClass1_Sub19_Sub1_1.method2062(local14);
			local175 = Static113.method1814(local14);
			if (local175.anIntArrayArray5 != null && local175.anIntArrayArray5[0][0] == 5) {
				local1307 = local175.anIntArrayArray5[0][1];
				if (local175.anIntArray105[0] != Static39.anIntArray116[local1307]) {
					Static39.anIntArray116[local1307] = local175.anIntArray105[0];
					Static64.method1108(local1307);
				}
			}
		}
		if (local26 == 39) {
			local311 = Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local22];
			if (local311 != null) {
				Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 1, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local311.anIntArray149[0], false, 0, local311.anIntArray147[0], 0, 1);
				Static9.anInt458 = 2;
				Static8.anInt446 = 0;
				Static102.anInt2587 = anInt2830;
				Static124.anInt2986 = Static119.anInt2832;
				Static21.aClass1_Sub19_Sub1_1.method2105(140);
				Static21.aClass1_Sub19_Sub1_1.method2088(local22);
			}
		}
		if (local26 == 5) {
			Static21.aClass1_Sub19_Sub1_1.method2105(51);
			Static21.aClass1_Sub19_Sub1_1.method2054(local10);
			Static21.aClass1_Sub19_Sub1_1.method2043(local22);
			Static21.aClass1_Sub19_Sub1_1.method2077(local14);
			Static72.anInt1894 = 0;
			Static132.aClass1_Sub9_16 = Static113.method1814(local14);
			Static21.anInt769 = local10;
		}
		if (local26 == 1) {
			local55 = Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 0, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local10, false, 0, local14, 0, 0);
			if (!local55) {
				Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 1, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local10, false, 0, local14, 0, 1);
			}
			Static9.anInt458 = 2;
			Static8.anInt446 = 0;
			Static102.anInt2587 = anInt2830;
			Static124.anInt2986 = Static119.anInt2832;
			Static21.aClass1_Sub19_Sub1_1.method2105(215);
			Static21.aClass1_Sub19_Sub1_1.method2067(Static22.anInt779);
			Static21.aClass1_Sub19_Sub1_1.method2067(Static88.anInt2290);
			Static21.aClass1_Sub19_Sub1_1.method2088(local22);
			Static21.aClass1_Sub19_Sub1_1.method2080(Static94.anInt2436);
			Static21.aClass1_Sub19_Sub1_1.method2043(Static37.anInt1098 + local10);
			Static21.aClass1_Sub19_Sub1_1.method2054(local14 + Static121.anInt2871);
		}
		if (local26 == 51) {
			local311 = Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local22];
			if (local311 != null) {
				Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 1, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local311.anIntArray149[0], false, 0, local311.anIntArray147[0], 0, 1);
				Static9.anInt458 = 2;
				Static8.anInt446 = 0;
				Static124.anInt2986 = Static119.anInt2832;
				Static102.anInt2587 = anInt2830;
				Static21.aClass1_Sub19_Sub1_1.method2105(38);
				Static21.aClass1_Sub19_Sub1_1.method2067(local22);
			}
		}
		if (local26 == 4) {
			local55 = Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 0, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local10, false, 0, local14, 0, 0);
			if (!local55) {
				Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 1, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local10, false, 0, local14, 0, 1);
			}
			Static8.anInt446 = 0;
			Static124.anInt2986 = Static119.anInt2832;
			Static9.anInt458 = 2;
			Static102.anInt2587 = anInt2830;
			Static21.aClass1_Sub19_Sub1_1.method2105(132);
			Static21.aClass1_Sub19_Sub1_1.method2088(Static37.anInt1098 + local10);
			Static21.aClass1_Sub19_Sub1_1.method2054(local14 + Static121.anInt2871);
			Static21.aClass1_Sub19_Sub1_1.method2043(local22);
		}
		if (local26 == 10) {
			local366 = Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local22];
			if (local366 != null) {
				Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 1, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local366.anIntArray149[0], false, 0, local366.anIntArray147[0], 0, 1);
				Static8.anInt446 = 0;
				Static102.anInt2587 = anInt2830;
				Static124.anInt2986 = Static119.anInt2832;
				Static9.anInt458 = 2;
				Static21.aClass1_Sub19_Sub1_1.method2105(167);
				Static21.aClass1_Sub19_Sub1_1.method2088(local22);
			}
		}
		if (Static130.anInt1509 != 0) {
			Static130.anInt1509 = 0;
			Static10.method277(Static113.method1814(Static94.anInt2436));
		}
		if (Static1.aBoolean14) {
			Static88.method1494();
		}
		if (Static132.aClass1_Sub9_16 != null && Static72.anInt1894 == 0) {
			Static10.method277(Static132.aClass1_Sub9_16);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!kb;)V")
	public static void method1879(@OriginalArg(1) Class1_Sub4 arg0) {
		arg0.aBoolean162 = false;
		if (arg0.aClass1_Sub17_5 != null) {
			arg0.aClass1_Sub17_5.anInt1965 = 0;
		}
		for (@Pc(18) Class1_Sub4 local18 = arg0.method1896(); local18 != null; local18 = arg0.method1894()) {
			method1879(local18);
		}
	}
}
