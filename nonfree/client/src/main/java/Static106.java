import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!se", name = "c", descriptor = "I")
	public static int anInt2626;

	@OriginalMember(owner = "client!se", name = "k", descriptor = "Z")
	public static boolean aBoolean122;

	@OriginalMember(owner = "client!se", name = "n", descriptor = "Lclient!ab;")
	public static Class2 aClass2_11;

	@OriginalMember(owner = "client!se", name = "q", descriptor = "Lclient!kd;")
	public static Class44_Sub1 aClass44_Sub1_67;

	@OriginalMember(owner = "client!se", name = "x", descriptor = "Lclient!oc;")
	public static Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_63;

	@OriginalMember(owner = "client!se", name = "C", descriptor = "[I")
	public static int[] anIntArray225;

	@OriginalMember(owner = "client!se", name = "D", descriptor = "Lclient!ha;")
	public static Class3_Sub8 aClass3_Sub8_1;

	@OriginalMember(owner = "client!se", name = "J", descriptor = "[I")
	public static int[] anIntArray226;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1447 = Static33.method650("Offline");

	@OriginalMember(owner = "client!se", name = "b", descriptor = "I")
	public static int anInt2625 = 0;

	@OriginalMember(owner = "client!se", name = "m", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1450 = Static33.method650("Enter your username (V password)3");

	@OriginalMember(owner = "client!se", name = "g", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1448 = aClass56_1450;

	@OriginalMember(owner = "client!se", name = "j", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1449 = Static33.method650("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!se", name = "o", descriptor = "I")
	public static int anInt2632 = 128;

	@OriginalMember(owner = "client!se", name = "p", descriptor = "I")
	public static int anInt2633 = 0;

	@OriginalMember(owner = "client!se", name = "u", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1451 = Static33.method650(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!se", name = "v", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1452 = aClass56_1447;

	@OriginalMember(owner = "client!se", name = "z", descriptor = "I")
	public static int anInt2639 = 0;

	@OriginalMember(owner = "client!se", name = "A", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1453 = Static33.method650("backright2");

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZLclient!tb;ZILclient!oa;ILclient!oa;)V")
	public static void method1756(@OriginalArg(1) Class44 arg0, @OriginalArg(4) Class56 arg1, @OriginalArg(6) Class56 arg2) {
		@Pc(8) int local8 = arg0.method1148(arg1);
		@Pc(19) int local19 = arg0.method1136(arg2, local8);
		Static77.method2027(arg0, local8, local19, 255);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)V")
	public static void method1757(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static19.method398(arg0)) {
			return;
		}
		@Pc(22) Class3_Sub1_Sub16[] local22 = Static31.aClass3_Sub1_Sub16ArrayArray1[arg0];
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Class3_Sub1_Sub16 local30 = local22[local24];
			if (local30.anObjectArray4 != null) {
				Static56.method1067(local30, 0, null, local30.anObjectArray4, 0, 0);
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
	public static void method1758() {
		Static20.aBoolean28 = false;
		Static77.aBoolean169 = false;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
	public static void method1759() {
		Static80.aClass30_13.method813();
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V")
	public static void method1760() {
		aClass56_1451 = null;
		aClass56_1447 = null;
		aClass56_1448 = null;
		aClass56_1450 = null;
		aClass3_Sub1_Sub1_Sub4_63 = null;
		aClass56_1452 = null;
		aClass56_1449 = null;
		aClass2_11 = null;
		anIntArray226 = null;
		aClass56_1453 = null;
		aClass44_Sub1_67 = null;
		aClass3_Sub8_1 = null;
		anIntArray225 = null;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III[B)Z")
	public static boolean method1761(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) int local7 = -1;
		@Pc(9) boolean local9 = true;
		@Pc(21) Class3_Sub2 local21 = new Class3_Sub2(arg2);
		label54: while (true) {
			@Pc(25) int local25 = local21.method311();
			if (local25 == 0) {
				return local9;
			}
			@Pc(29) int local29 = 0;
			@Pc(31) boolean local31 = false;
			local7 += local25;
			while (true) {
				@Pc(41) int local41;
				while (!local31) {
					local41 = local21.method311();
					if (local41 == 0) {
						continue label54;
					}
					local29 += local41 - 1;
					@Pc(71) int local71 = local29 & 0x3F;
					@Pc(77) int local77 = local29 >> 6 & 0x3F;
					@Pc(82) int local82 = local77 + arg1;
					@Pc(86) int local86 = arg0 + local71;
					@Pc(92) int local92 = local21.method270() >> 2;
					if (local82 > 0 && local86 > 0 && local82 < 103 && local86 < 103) {
						@Pc(112) Class3_Sub1_Sub15 local112 = Static122.method1962(local7);
						if (local92 != 22 || !Static77.aBoolean169 || local112.anInt2728 != 0 || local112.aBoolean132) {
							if (!local112.method1828()) {
								Static93.anInt2440++;
								local9 = false;
							}
							local31 = true;
						}
					}
				}
				local41 = local21.method311();
				if (local41 == 0) {
					break;
				}
				local21.method270();
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!wc;IIIIIBLclient!d;)V")
	public static void method1762(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class14 arg7) {
		if (Static77.aBoolean169 && (Static66.aByteArrayArrayArray3[0][arg5][arg0] & 0x2) == 0) {
			if ((Static66.aByteArrayArrayArray3[arg4][arg5][arg0] & 0x10) != 0) {
				return;
			}
			if (Static84.method1525(arg0, arg4, arg5) != Static14.anInt326) {
				return;
			}
		}
		if (arg4 < Static66.anInt569) {
			Static66.anInt569 = arg4;
		}
		@Pc(63) int local63 = Static22.anIntArrayArrayArray4[arg4][arg5 + 1][arg0 + 1];
		@Pc(73) int local73 = Static22.anIntArrayArrayArray4[arg4][arg5 + 1][arg0];
		@Pc(81) int local81 = Static22.anIntArrayArrayArray4[arg4][arg5][arg0];
		@Pc(93) int local93 = (arg6 << 14) + arg5 + (arg0 << 7) + 1073741824;
		@Pc(99) int local99 = arg3 + (arg2 << 6);
		@Pc(109) int local109 = Static22.anIntArrayArrayArray4[arg4][arg5][arg0 + 1];
		@Pc(120) int local120 = local73 + local81 + local63 + local109 >> 2;
		@Pc(124) Class3_Sub1_Sub15 local124 = Static122.method1962(arg6);
		if (local124.anInt2722 == 1) {
			local99 += 256;
		}
		if (local124.anInt2728 == 0) {
			local93 += Integer.MIN_VALUE;
		}
		if (local124.method1821()) {
			Static25.method533(arg5, arg0, arg4, local124, arg2);
		}
		@Pc(188) Class3_Sub1_Sub2 local188;
		if (arg3 != 22) {
			@Pc(278) int local278;
			@Pc(281) int local281;
			if (arg3 == 10 || arg3 == 11) {
				if (local124.anInt2742 == -1 && local124.anIntArray259 == null) {
					local188 = local124.method1825(local109, 10, local81, arg2, local63, local73);
				} else {
					local188 = new Class3_Sub1_Sub2_Sub5(arg6, 10, arg2, local81, local73, local63, local109, local124.anInt2742, true, null);
				}
				if (local188 != null) {
					if (arg2 == 1 || arg2 == 3) {
						local278 = local124.anInt2743;
						local281 = local124.anInt2745;
					} else {
						local281 = local124.anInt2743;
						local278 = local124.anInt2745;
					}
					@Pc(291) int local291 = 0;
					if (arg3 == 11) {
						local291 += 256;
					}
					if (arg7.method425(arg4, arg5, arg0, local120, local278, local281, local188, local291, local93, local99) && local124.aBoolean129) {
						@Pc(315) int local315 = 15;
						if (local188 instanceof Class3_Sub1_Sub2_Sub6) {
							local315 = ((Class3_Sub1_Sub2_Sub6) local188).method1797() / 4;
							if (local315 > 30) {
								local315 = 30;
							}
						}
						for (@Pc(333) int local333 = 0; local333 <= local278; local333++) {
							for (@Pc(337) int local337 = 0; local337 <= local281; local337++) {
								if (Static117.aByteArrayArrayArray8[arg4][arg5 + local333][arg0 + local337] < local315) {
									Static117.aByteArrayArrayArray8[arg4][arg5 + local333][arg0 + local337] = (byte) local315;
								}
							}
						}
					}
				}
				if (local124.anInt2717 != 0 && arg1 != null) {
					arg1.method2001(arg0, arg2, local124.anInt2743, local124.anInt2745, local124.aBoolean136, arg5);
				}
			} else if (arg3 >= 12) {
				if (local124.anInt2742 == -1 && local124.anIntArray259 == null) {
					local188 = local124.method1825(local109, arg3, local81, arg2, local63, local73);
				} else {
					local188 = new Class3_Sub1_Sub2_Sub5(arg6, arg3, arg2, local81, local73, local63, local109, local124.anInt2742, true, null);
				}
				arg7.method425(arg4, arg5, arg0, local120, 1, 1, local188, 0, local93, local99);
				if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg4 > 0) {
					Static73.anIntArrayArrayArray5[arg4][arg5][arg0] |= 0x924;
				}
				if (local124.anInt2717 != 0 && arg1 != null) {
					arg1.method2001(arg0, arg2, local124.anInt2743, local124.anInt2745, local124.aBoolean136, arg5);
				}
			} else if (arg3 == 0) {
				if (local124.anInt2742 == -1 && local124.anIntArray259 == null) {
					local188 = local124.method1825(local109, 0, local81, arg2, local63, local73);
				} else {
					local188 = new Class3_Sub1_Sub2_Sub5(arg6, 0, arg2, local81, local73, local63, local109, local124.anInt2742, true, null);
				}
				arg7.method445(arg4, arg5, arg0, local120, local188, null, Static41.anIntArray74[arg2], 0, local93, local99);
				if (arg2 == 0) {
					if (local124.aBoolean129) {
						Static117.aByteArrayArrayArray8[arg4][arg5][arg0] = 50;
						Static117.aByteArrayArrayArray8[arg4][arg5][arg0 + 1] = 50;
					}
					if (local124.aBoolean128) {
						Static73.anIntArrayArrayArray5[arg4][arg5][arg0] |= 0x249;
					}
				} else if (arg2 == 1) {
					if (local124.aBoolean129) {
						Static117.aByteArrayArrayArray8[arg4][arg5][arg0 + 1] = 50;
						Static117.aByteArrayArrayArray8[arg4][arg5 + 1][arg0 + 1] = 50;
					}
					if (local124.aBoolean128) {
						Static73.anIntArrayArrayArray5[arg4][arg5][arg0 + 1] |= 0x492;
					}
				} else if (arg2 == 2) {
					if (local124.aBoolean129) {
						Static117.aByteArrayArrayArray8[arg4][arg5 + 1][arg0] = 50;
						Static117.aByteArrayArrayArray8[arg4][arg5 + 1][arg0 + 1] = 50;
					}
					if (local124.aBoolean128) {
						Static73.anIntArrayArrayArray5[arg4][arg5 + 1][arg0] |= 0x249;
					}
				} else if (arg2 == 3) {
					if (local124.aBoolean129) {
						Static117.aByteArrayArrayArray8[arg4][arg5][arg0] = 50;
						Static117.aByteArrayArrayArray8[arg4][arg5 + 1][arg0] = 50;
					}
					if (local124.aBoolean128) {
						Static73.anIntArrayArrayArray5[arg4][arg5][arg0] |= 0x492;
					}
				}
				if (local124.anInt2717 != 0 && arg1 != null) {
					arg1.method2005(arg3, arg2, arg0, arg5, local124.aBoolean136);
				}
				if (local124.anInt2718 != 16) {
					arg7.method437(arg4, arg5, arg0, local124.anInt2718);
				}
			} else if (arg3 == 1) {
				if (local124.anInt2742 == -1 && local124.anIntArray259 == null) {
					local188 = local124.method1825(local109, 1, local81, arg2, local63, local73);
				} else {
					local188 = new Class3_Sub1_Sub2_Sub5(arg6, 1, arg2, local81, local73, local63, local109, local124.anInt2742, true, null);
				}
				arg7.method445(arg4, arg5, arg0, local120, local188, null, Static111.anIntArray271[arg2], 0, local93, local99);
				if (local124.aBoolean129) {
					if (arg2 == 0) {
						Static117.aByteArrayArrayArray8[arg4][arg5][arg0 + 1] = 50;
					} else if (arg2 == 1) {
						Static117.aByteArrayArrayArray8[arg4][arg5 + 1][arg0 + 1] = 50;
					} else if (arg2 == 2) {
						Static117.aByteArrayArrayArray8[arg4][arg5 + 1][arg0] = 50;
					} else if (arg2 == 3) {
						Static117.aByteArrayArrayArray8[arg4][arg5][arg0] = 50;
					}
				}
				if (local124.anInt2717 != 0 && arg1 != null) {
					arg1.method2005(arg3, arg2, arg0, arg5, local124.aBoolean136);
				}
			} else {
				@Pc(928) int local928;
				@Pc(953) Class3_Sub1_Sub2 local953;
				if (arg3 == 2) {
					local928 = arg2 + 1 & 0x3;
					@Pc(968) Class3_Sub1_Sub2 local968;
					if (local124.anInt2742 == -1 && local124.anIntArray259 == null) {
						local953 = local124.method1825(local109, 2, local81, arg2 + 4, local63, local73);
						local968 = local124.method1825(local109, 2, local81, local928, local63, local73);
					} else {
						local953 = new Class3_Sub1_Sub2_Sub5(arg6, 2, arg2 + 4, local81, local73, local63, local109, local124.anInt2742, true, null);
						local968 = new Class3_Sub1_Sub2_Sub5(arg6, 2, local928, local81, local73, local63, local109, local124.anInt2742, true, null);
					}
					arg7.method445(arg4, arg5, arg0, local120, local953, local968, Static41.anIntArray74[arg2], Static41.anIntArray74[local928], local93, local99);
					if (local124.aBoolean128) {
						if (arg2 == 0) {
							Static73.anIntArrayArrayArray5[arg4][arg5][arg0] |= 0x249;
							Static73.anIntArrayArrayArray5[arg4][arg5][arg0 + 1] |= 0x492;
						} else if (arg2 == 1) {
							Static73.anIntArrayArrayArray5[arg4][arg5][arg0 + 1] |= 0x492;
							Static73.anIntArrayArrayArray5[arg4][arg5 + 1][arg0] |= 0x249;
						} else if (arg2 == 2) {
							Static73.anIntArrayArrayArray5[arg4][arg5 + 1][arg0] |= 0x249;
							Static73.anIntArrayArrayArray5[arg4][arg5][arg0] |= 0x492;
						} else if (arg2 == 3) {
							Static73.anIntArrayArrayArray5[arg4][arg5][arg0] |= 0x492;
							Static73.anIntArrayArrayArray5[arg4][arg5][arg0] |= 0x249;
						}
					}
					if (local124.anInt2717 != 0 && arg1 != null) {
						arg1.method2005(arg3, arg2, arg0, arg5, local124.aBoolean136);
					}
					if (local124.anInt2718 != 16) {
						arg7.method437(arg4, arg5, arg0, local124.anInt2718);
					}
				} else if (arg3 == 3) {
					if (local124.anInt2742 == -1 && local124.anIntArray259 == null) {
						local188 = local124.method1825(local109, 3, local81, arg2, local63, local73);
					} else {
						local188 = new Class3_Sub1_Sub2_Sub5(arg6, 3, arg2, local81, local73, local63, local109, local124.anInt2742, true, null);
					}
					arg7.method445(arg4, arg5, arg0, local120, local188, null, Static111.anIntArray271[arg2], 0, local93, local99);
					if (local124.aBoolean129) {
						if (arg2 == 0) {
							Static117.aByteArrayArrayArray8[arg4][arg5][arg0 + 1] = 50;
						} else if (arg2 == 1) {
							Static117.aByteArrayArrayArray8[arg4][arg5 + 1][arg0 + 1] = 50;
						} else if (arg2 == 2) {
							Static117.aByteArrayArrayArray8[arg4][arg5 + 1][arg0] = 50;
						} else if (arg2 == 3) {
							Static117.aByteArrayArrayArray8[arg4][arg5][arg0] = 50;
						}
					}
					if (local124.anInt2717 != 0 && arg1 != null) {
						arg1.method2005(arg3, arg2, arg0, arg5, local124.aBoolean136);
					}
				} else if (arg3 == 9) {
					if (local124.anInt2742 == -1 && local124.anIntArray259 == null) {
						local188 = local124.method1825(local109, arg3, local81, arg2, local63, local73);
					} else {
						local188 = new Class3_Sub1_Sub2_Sub5(arg6, arg3, arg2, local81, local73, local63, local109, local124.anInt2742, true, null);
					}
					arg7.method425(arg4, arg5, arg0, local120, 1, 1, local188, 0, local93, local99);
					if (local124.anInt2717 != 0 && arg1 != null) {
						arg1.method2001(arg0, arg2, local124.anInt2743, local124.anInt2745, local124.aBoolean136, arg5);
					}
				} else {
					if (local124.aBoolean131) {
						if (arg2 == 1) {
							local928 = local109;
							local109 = local63;
							local63 = local73;
							local73 = local81;
							local81 = local928;
						} else if (arg2 == 2) {
							local928 = local109;
							local109 = local73;
							local73 = local928;
							@Pc(1425) int local1425 = local63;
							local63 = local81;
							local81 = local1425;
						} else if (arg2 == 3) {
							local928 = local109;
							local109 = local81;
							local81 = local73;
							local73 = local63;
							local63 = local928;
						}
					}
					if (arg3 == 4) {
						if (local124.anInt2742 == -1 && local124.anIntArray259 == null) {
							local188 = local124.method1825(local109, 4, local81, 0, local63, local73);
						} else {
							local188 = new Class3_Sub1_Sub2_Sub5(arg6, 4, 0, local81, local73, local63, local109, local124.anInt2742, true, null);
						}
						arg7.method427(arg4, arg5, arg0, local120, local188, Static41.anIntArray74[arg2], arg2 * 512, 0, 0, local93, local99);
					} else if (arg3 == 5) {
						local281 = arg7.method436(arg4, arg5, arg0);
						local278 = 16;
						if (local281 != 0) {
							local278 = Static122.method1962(local281 >> 14 & 0x7FFF).anInt2718;
						}
						@Pc(1563) Class3_Sub1_Sub2 local1563;
						if (local124.anInt2742 == -1 && local124.anIntArray259 == null) {
							local1563 = local124.method1825(local109, 4, local81, 0, local63, local73);
						} else {
							local1563 = new Class3_Sub1_Sub2_Sub5(arg6, 4, 0, local81, local73, local63, local109, local124.anInt2742, true, null);
						}
						arg7.method427(arg4, arg5, arg0, local120, local1563, Static41.anIntArray74[arg2], arg2 * 512, Static116.anIntArray294[arg2] * local278, Static27.anIntArray53[arg2] * local278, local93, local99);
					} else if (arg3 == 6) {
						if (local124.anInt2742 == -1 && local124.anIntArray259 == null) {
							local953 = local124.method1825(local109, 4, local81, 0, local63, local73);
						} else {
							local953 = new Class3_Sub1_Sub2_Sub5(arg6, 4, 0, local81, local73, local63, local109, local124.anInt2742, true, null);
						}
						arg7.method427(arg4, arg5, arg0, local120, local953, 256, arg2, 0, 0, local93, local99);
					} else if (arg3 == 7) {
						if (local124.anInt2742 == -1 && local124.anIntArray259 == null) {
							local953 = local124.method1825(local109, 4, local81, 0, local63, local73);
						} else {
							local953 = new Class3_Sub1_Sub2_Sub5(arg6, 4, 0, local81, local73, local63, local109, local124.anInt2742, true, null);
						}
						arg7.method427(arg4, arg5, arg0, local120, local953, 512, arg2, 0, 0, local93, local99);
					} else if (arg3 == 8) {
						if (local124.anInt2742 == -1 && local124.anIntArray259 == null) {
							local953 = local124.method1825(local109, 4, local81, 0, local63, local73);
						} else {
							local953 = new Class3_Sub1_Sub2_Sub5(arg6, 4, 0, local81, local73, local63, local109, local124.anInt2742, true, null);
						}
						arg7.method427(arg4, arg5, arg0, local120, local953, 768, arg2, 0, 0, local93, local99);
					}
				}
			}
		} else if (!Static77.aBoolean169 || local124.anInt2728 != 0 || local124.aBoolean132) {
			if (local124.anInt2742 == -1 && local124.anIntArray259 == null) {
				local188 = local124.method1825(local109, 22, local81, arg2, local63, local73);
			} else {
				local188 = new Class3_Sub1_Sub2_Sub5(arg6, 22, arg2, local81, local73, local63, local109, local124.anInt2742, true, null);
			}
			arg7.method433(arg4, arg5, arg0, local120, local188, local93, local99);
			if (local124.anInt2717 == 1 && arg1 != null) {
				arg1.method2002(arg0, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
	public static void method1763() {
		if (Static13.aClass3_Sub1_Sub16_1 == null) {
			return;
		}
		@Pc(17) Class3_Sub1_Sub16 local17 = Static13.aClass3_Sub1_Sub16_1;
		@Pc(21) Class3_Sub1_Sub16 local21 = Static50.method905(local17);
		if (local21 == null) {
			Static13.aClass3_Sub1_Sub16_1 = null;
			return;
		}
		Static16.anInt469++;
		@Pc(32) int local32 = Static36.anInt1021;
		@Pc(34) int local34 = Static102.anInt3222;
		if (Static43.anInt1150 == 0) {
			local32 -= 4;
			local34 -= 4;
		}
		if (Static43.anInt1150 == 1) {
			local32 -= 553;
			local34 -= 205;
		}
		if (Static43.anInt1150 == 2) {
			local34 -= 357;
			local32 -= 17;
		}
		local32 -= Static27.anInt811;
		local34 -= Static52.anInt1511;
		@Pc(67) int[] local67 = Static124.method1995(local21);
		@Pc(79) Class3_Sub1_Sub16 local79 = Static31.aClass3_Sub1_Sub16ArrayArray1[local17.anInt2817 >> 16][local17.anInt2845 & 0xFFFF];
		if (local34 < local67[1]) {
			local34 = local67[1];
		}
		if (local17.anInt2827 + local34 > local21.anInt2827 + local67[1]) {
			local34 = local21.anInt2827 + local67[1] - local17.anInt2827;
		}
		@Pc(120) int local120 = local21.anInt2806 + local34 - local67[1];
		if (local32 < local67[0]) {
			local32 = local67[0];
		}
		if (local67[0] + local21.anInt2854 < local32 + local17.anInt2854) {
			local32 = local67[0] + local21.anInt2854 - local17.anInt2854;
		}
		@Pc(161) int local161 = local32 + local21.anInt2842 - local67[0];
		@Pc(165) int[] local165 = Static124.method1995(local79);
		@Pc(175) int local175 = local79.anInt2842 + local32 - local165[0];
		@Pc(185) int local185 = local79.anInt2806 + local34 - local165[1];
		@Pc(191) int local191 = local185 - local17.anInt2797;
		@Pc(197) int local197 = local175 - local17.anInt2855;
		if (local197 <= local17.anInt2796 && local197 >= -local17.anInt2796 && local191 <= local17.anInt2796 && -local17.anInt2796 <= local191 && !Static25.aBoolean38) {
			local161 -= local197;
			local120 -= local191;
		} else if (local17.anInt2830 < Static16.anInt469 || Static25.aBoolean38) {
			Static25.aBoolean38 = true;
		} else {
			local161 -= local197;
			local120 -= local191;
		}
		if (Static13.aClass3_Sub1_Sub16_1.anObjectArray9 != null && Static25.aBoolean38) {
			Static56.method1067(local17, 0, null, local17.anObjectArray9, local120, local161);
		}
		if (Static31.anInt928 != 0) {
			return;
		}
		if (Static25.aBoolean38) {
			@Pc(302) Class3_Sub1_Sub16 local302 = Static44.method808(local17, local21, Static27.anInt811 + local161, local120 + Static52.anInt1511);
			if (Static13.aClass3_Sub1_Sub16_1.anObjectArray19 != null) {
				Static56.method1067(local17, 0, local302, local17.anObjectArray19, local120, local161);
			}
			if (local302 != null && Static19.method402(local17) != null) {
				Static111.aClass3_Sub2_Sub1_4.method325(137);
				Static111.aClass3_Sub2_Sub1_4.method289(local17.anInt2807);
				Static111.aClass3_Sub2_Sub1_4.method297(local17.anInt2817);
				Static111.aClass3_Sub2_Sub1_4.method262(local302.anInt2807);
				Static111.aClass3_Sub2_Sub1_4.method274(local302.anInt2817);
			}
		} else {
			if (Static13.aClass3_Sub1_Sub16_1.anObjectArray15 != null) {
				Static56.method1067(local17, 0, null, local17.anObjectArray15, local120, local161);
			}
			if ((Static92.anInt2426 == 1 || Static81.method1452(Static66.anInt559 - 1)) && Static66.anInt559 > 2) {
				Static25.method534();
			} else if (Static66.anInt559 > 0) {
				Static18.method354(Static66.anInt559 - 1);
			}
		}
		Static13.aClass3_Sub1_Sub16_1 = null;
		return;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)Z")
	public static boolean method1764(@OriginalArg(1) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}
}
