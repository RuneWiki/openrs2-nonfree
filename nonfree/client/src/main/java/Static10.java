import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "[I")
	public static int[] anIntArray41;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "Lclient!gd;")
	public static Class23 aClass23_166 = Static15.method178("backvmid3");

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "Lclient!gd;")
	private static Class23 aClass23_168 = Static15.method178("Message");

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "Lclient!gd;")
	public static Class23 aClass23_167 = aClass23_168;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "[Lclient!gd;")
	public static Class23[] aClass23Array5 = new Class23[100];

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "Z")
	public static boolean aBoolean8 = false;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "Lclient!gd;")
	public static Class23 aClass23_169 = Static15.method178("@or2@");

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "Lclient!gd;")
	public static Class23 aClass23_170 = Static15.method178("blinken2:");

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "Lclient!gd;")
	public static Class23 aClass23_171 = Static15.method178("Lade Sprites )2 ");

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "Lclient!gd;")
	public static Class23 aClass23_172 = Static15.method178(" ");

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
	public static int anInt207 = 0;

	@OriginalMember(owner = "client!bc", name = "q", descriptor = "[I")
	public static int[] anIntArray42 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
	public static int anInt208 = 0;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BLclient!rc;)Lclient!gd;")
	public static Class23 method108(@OriginalArg(1) Class1_Sub5 arg0) {
		return Static1.method29(arg0);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!q;IILclient!ud;IIII)V")
	public static void method109(@OriginalArg(0) int arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class65 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (Static9.aBoolean7 && (Static95.aByteArrayArrayArray5[0][arg0][arg7] & 0x2) == 0) {
			if ((Static95.aByteArrayArrayArray5[arg6][arg0][arg7] & 0x10) != 0) {
				return;
			}
			if (Static8.method95(arg7, arg6, arg0) != Static61.anInt1894) {
				return;
			}
		}
		if (Static80.anInt2258 > arg6) {
			Static80.anInt2258 = arg6;
		}
		@Pc(51) int local51 = Static72.anIntArrayArrayArray5[arg6][arg0][arg7];
		@Pc(63) int local63 = Static72.anIntArrayArrayArray5[arg6][arg0 + 1][arg7 + 1];
		@Pc(73) int local73 = Static72.anIntArrayArrayArray5[arg6][arg0][arg7 + 1];
		@Pc(83) int local83 = Static72.anIntArrayArrayArray5[arg6][arg0 + 1][arg7];
		@Pc(87) Class1_Sub1_Sub4 local87 = Static97.method1645(arg3);
		@Pc(98) int local98 = local83 + local51 + local63 + local73 >> 2;
		@Pc(110) int local110 = (arg3 << 14) + arg0 + (arg7 << 7) + 1073741824;
		if (local87.anInt298 == 0) {
			local110 += Integer.MIN_VALUE;
		}
		@Pc(123) int local123 = arg5 + (arg2 << 6);
		if (local87.anInt318 == 1) {
			local123 += 256;
		}
		if (local87.method180()) {
			Static75.method1318(arg6, arg2, local87, arg0, arg7);
		}
		@Pc(171) Class1_Sub1_Sub2 local171;
		if (arg5 != 22) {
			@Pc(269) int local269;
			if (arg5 == 10 || arg5 == 11) {
				if (local87.anInt313 == -1 && local87.anIntArray54 == null) {
					local171 = local87.method173(local63, 10, local51, local83, local73, arg2);
				} else {
					local171 = new Class1_Sub1_Sub2_Sub2(arg3, 10, arg2, local51, local83, local63, local73, local87.anInt313, true, null);
				}
				if (local171 != null) {
					@Pc(266) int local266;
					if (arg2 == 1 || arg2 == 3) {
						local269 = local87.anInt305;
						local266 = local87.anInt299;
					} else {
						local266 = local87.anInt305;
						local269 = local87.anInt299;
					}
					@Pc(278) int local278 = 0;
					if (arg5 == 11) {
						local278 += 256;
					}
					if (arg4.method1720(arg6, arg0, arg7, local98, local269, local266, local171, local278, local110, local123) && local87.aBoolean19) {
						@Pc(304) Class1_Sub1_Sub2_Sub6 local304;
						if (local171 instanceof Class1_Sub1_Sub2_Sub6) {
							local304 = (Class1_Sub1_Sub2_Sub6) local171;
						} else {
							local304 = local87.method173(local63, 10, local51, local83, local73, arg2);
						}
						if (local304 != null) {
							for (@Pc(319) int local319 = 0; local319 <= local269; local319++) {
								for (@Pc(322) int local322 = 0; local322 <= local266; local322++) {
									@Pc(328) int local328 = local304.method1441() / 4;
									if (local328 > 30) {
										local328 = 30;
									}
									if (local328 > Static20.aByteArrayArrayArray1[arg6][local319 + arg0][local322 + arg7]) {
										Static20.aByteArrayArrayArray1[arg6][arg0 + local319][arg7 + local322] = (byte) local328;
									}
								}
							}
						}
					}
				}
				if (local87.aBoolean21 && arg1 != null) {
					arg1.method1356(arg2, local87.aBoolean14, local87.anInt299, arg7, local87.anInt305, arg0);
				}
			} else if (arg5 >= 12) {
				if (local87.anInt313 == -1 && local87.anIntArray54 == null) {
					local171 = local87.method173(local63, arg5, local51, local83, local73, arg2);
				} else {
					local171 = new Class1_Sub1_Sub2_Sub2(arg3, arg5, arg2, local51, local83, local63, local73, local87.anInt313, true, null);
				}
				arg4.method1720(arg6, arg0, arg7, local98, 1, 1, local171, 0, local110, local123);
				if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg6 > 0) {
					Static45.anIntArrayArrayArray4[arg6][arg0][arg7] |= 0x924;
				}
				if (local87.aBoolean21 && arg1 != null) {
					arg1.method1356(arg2, local87.aBoolean14, local87.anInt299, arg7, local87.anInt305, arg0);
				}
			} else if (arg5 == 0) {
				if (local87.anInt313 == -1 && local87.anIntArray54 == null) {
					local171 = local87.method173(local63, 0, local51, local83, local73, arg2);
				} else {
					local171 = new Class1_Sub1_Sub2_Sub2(arg3, 0, arg2, local51, local83, local63, local73, local87.anInt313, true, null);
				}
				arg4.method1744(arg6, arg0, arg7, local98, local171, null, Static29.anIntArray130[arg2], 0, local110, local123);
				if (arg2 == 0) {
					if (local87.aBoolean19) {
						Static20.aByteArrayArrayArray1[arg6][arg0][arg7] = 50;
						Static20.aByteArrayArrayArray1[arg6][arg0][arg7 + 1] = 50;
					}
					if (local87.aBoolean13) {
						Static45.anIntArrayArrayArray4[arg6][arg0][arg7] |= 0x249;
					}
				} else if (arg2 == 1) {
					if (local87.aBoolean19) {
						Static20.aByteArrayArrayArray1[arg6][arg0][arg7 + 1] = 50;
						Static20.aByteArrayArrayArray1[arg6][arg0 + 1][arg7 + 1] = 50;
					}
					if (local87.aBoolean13) {
						Static45.anIntArrayArrayArray4[arg6][arg0][arg7 + 1] |= 0x492;
					}
				} else if (arg2 == 2) {
					if (local87.aBoolean19) {
						Static20.aByteArrayArrayArray1[arg6][arg0 + 1][arg7] = 50;
						Static20.aByteArrayArrayArray1[arg6][arg0 + 1][arg7 + 1] = 50;
					}
					if (local87.aBoolean13) {
						Static45.anIntArrayArrayArray4[arg6][arg0 + 1][arg7] |= 0x249;
					}
				} else if (arg2 == 3) {
					if (local87.aBoolean19) {
						Static20.aByteArrayArrayArray1[arg6][arg0][arg7] = 50;
						Static20.aByteArrayArrayArray1[arg6][arg0 + 1][arg7] = 50;
					}
					if (local87.aBoolean13) {
						Static45.anIntArrayArrayArray4[arg6][arg0][arg7] |= 0x492;
					}
				}
				if (local87.aBoolean21 && arg1 != null) {
					arg1.method1357(arg0, arg7, arg2, local87.aBoolean14, arg5);
				}
				if (local87.anInt301 != 16) {
					arg4.method1736(arg6, arg0, arg7, local87.anInt301);
				}
			} else if (arg5 == 1) {
				if (local87.anInt313 == -1 && local87.anIntArray54 == null) {
					local171 = local87.method173(local63, 1, local51, local83, local73, arg2);
				} else {
					local171 = new Class1_Sub1_Sub2_Sub2(arg3, 1, arg2, local51, local83, local63, local73, local87.anInt313, true, null);
				}
				arg4.method1744(arg6, arg0, arg7, local98, local171, null, Static80.anIntArray269[arg2], 0, local110, local123);
				if (local87.aBoolean19) {
					if (arg2 == 0) {
						Static20.aByteArrayArrayArray1[arg6][arg0][arg7 + 1] = 50;
					} else if (arg2 == 1) {
						Static20.aByteArrayArrayArray1[arg6][arg0 + 1][arg7 + 1] = 50;
					} else if (arg2 == 2) {
						Static20.aByteArrayArrayArray1[arg6][arg0 + 1][arg7] = 50;
					} else if (arg2 == 3) {
						Static20.aByteArrayArrayArray1[arg6][arg0][arg7] = 50;
					}
				}
				if (local87.aBoolean21 && arg1 != null) {
					arg1.method1357(arg0, arg7, arg2, local87.aBoolean14, arg5);
				}
			} else {
				@Pc(888) int local888;
				@Pc(928) Class1_Sub1_Sub2 local928;
				if (arg5 == 2) {
					local888 = arg2 + 1 & 0x3;
					@Pc(913) Class1_Sub1_Sub2 local913;
					if (local87.anInt313 == -1 && local87.anIntArray54 == null) {
						local913 = local87.method173(local63, 2, local51, local83, local73, arg2 + 4);
						local928 = local87.method173(local63, 2, local51, local83, local73, local888);
					} else {
						local913 = new Class1_Sub1_Sub2_Sub2(arg3, 2, arg2 + 4, local51, local83, local63, local73, local87.anInt313, true, null);
						local928 = new Class1_Sub1_Sub2_Sub2(arg3, 2, local888, local51, local83, local63, local73, local87.anInt313, true, null);
					}
					arg4.method1744(arg6, arg0, arg7, local98, local913, local928, Static29.anIntArray130[arg2], Static29.anIntArray130[local888], local110, local123);
					if (local87.aBoolean13) {
						if (arg2 == 0) {
							Static45.anIntArrayArrayArray4[arg6][arg0][arg7] |= 0x249;
							Static45.anIntArrayArrayArray4[arg6][arg0][arg7 + 1] |= 0x492;
						} else if (arg2 == 1) {
							Static45.anIntArrayArrayArray4[arg6][arg0][arg7 + 1] |= 0x492;
							Static45.anIntArrayArrayArray4[arg6][arg0 + 1][arg7] |= 0x249;
						} else if (arg2 == 2) {
							Static45.anIntArrayArrayArray4[arg6][arg0 + 1][arg7] |= 0x249;
							Static45.anIntArrayArrayArray4[arg6][arg0][arg7] |= 0x492;
						} else if (arg2 == 3) {
							Static45.anIntArrayArrayArray4[arg6][arg0][arg7] |= 0x492;
							Static45.anIntArrayArrayArray4[arg6][arg0][arg7] |= 0x249;
						}
					}
					if (local87.aBoolean21 && arg1 != null) {
						arg1.method1357(arg0, arg7, arg2, local87.aBoolean14, arg5);
					}
					if (local87.anInt301 != 16) {
						arg4.method1736(arg6, arg0, arg7, local87.anInt301);
					}
				} else if (arg5 == 3) {
					if (local87.anInt313 == -1 && local87.anIntArray54 == null) {
						local171 = local87.method173(local63, 3, local51, local83, local73, arg2);
					} else {
						local171 = new Class1_Sub1_Sub2_Sub2(arg3, 3, arg2, local51, local83, local63, local73, local87.anInt313, true, null);
					}
					arg4.method1744(arg6, arg0, arg7, local98, local171, null, Static80.anIntArray269[arg2], 0, local110, local123);
					if (local87.aBoolean19) {
						if (arg2 == 0) {
							Static20.aByteArrayArrayArray1[arg6][arg0][arg7 + 1] = 50;
						} else if (arg2 == 1) {
							Static20.aByteArrayArrayArray1[arg6][arg0 + 1][arg7 + 1] = 50;
						} else if (arg2 == 2) {
							Static20.aByteArrayArrayArray1[arg6][arg0 + 1][arg7] = 50;
						} else if (arg2 == 3) {
							Static20.aByteArrayArrayArray1[arg6][arg0][arg7] = 50;
						}
					}
					if (local87.aBoolean21 && arg1 != null) {
						arg1.method1357(arg0, arg7, arg2, local87.aBoolean14, arg5);
					}
				} else if (arg5 == 9) {
					if (local87.anInt313 == -1 && local87.anIntArray54 == null) {
						local171 = local87.method173(local63, arg5, local51, local83, local73, arg2);
					} else {
						local171 = new Class1_Sub1_Sub2_Sub2(arg3, arg5, arg2, local51, local83, local63, local73, local87.anInt313, true, null);
					}
					arg4.method1720(arg6, arg0, arg7, local98, 1, 1, local171, 0, local110, local123);
					if (local87.aBoolean21 && arg1 != null) {
						arg1.method1356(arg2, local87.aBoolean14, local87.anInt299, arg7, local87.anInt305, arg0);
					}
				} else {
					if (local87.aBoolean12) {
						if (arg2 == 1) {
							local888 = local73;
							local73 = local63;
							local63 = local83;
							local83 = local51;
							local51 = local888;
						} else if (arg2 == 2) {
							local888 = local73;
							local73 = local83;
							local83 = local888;
							@Pc(1374) int local1374 = local63;
							local63 = local51;
							local51 = local1374;
						} else if (arg2 == 3) {
							local888 = local73;
							local73 = local51;
							local51 = local83;
							local83 = local63;
							local63 = local888;
						}
					}
					if (arg5 == 4) {
						if (local87.anInt313 == -1 && local87.anIntArray54 == null) {
							local171 = local87.method173(local63, 4, local51, local83, local73, 0);
						} else {
							local171 = new Class1_Sub1_Sub2_Sub2(arg3, 4, 0, local51, local83, local63, local73, local87.anInt313, true, null);
						}
						arg4.method1747(arg6, arg0, arg7, local98, local171, Static29.anIntArray130[arg2], arg2 * 512, 0, 0, local110, local123);
					} else if (arg5 == 5) {
						local269 = arg4.method1743(arg6, arg0, arg7);
						local888 = 16;
						if (local269 > 0) {
							local888 = Static97.method1645(local269 >> 14 & 0x7FFF).anInt301;
						}
						if (local87.anInt313 == -1 && local87.anIntArray54 == null) {
							local928 = local87.method173(local63, 4, local51, local83, local73, 0);
						} else {
							local928 = new Class1_Sub1_Sub2_Sub2(arg3, 4, 0, local51, local83, local63, local73, local87.anInt313, true, null);
						}
						arg4.method1747(arg6, arg0, arg7, local98, local928, Static29.anIntArray130[arg2], arg2 * 512, local888 * anIntArray42[arg2], Static20.anIntArray91[arg2] * local888, local110, local123);
					} else if (arg5 == 6) {
						if (local87.anInt313 == -1 && local87.anIntArray54 == null) {
							local171 = local87.method173(local63, 4, local51, local83, local73, 0);
						} else {
							local171 = new Class1_Sub1_Sub2_Sub2(arg3, 4, 0, local51, local83, local63, local73, local87.anInt313, true, null);
						}
						arg4.method1747(arg6, arg0, arg7, local98, local171, 256, arg2, 0, 0, local110, local123);
					} else if (arg5 == 7) {
						if (local87.anInt313 == -1 && local87.anIntArray54 == null) {
							local171 = local87.method173(local63, 4, local51, local83, local73, 0);
						} else {
							local171 = new Class1_Sub1_Sub2_Sub2(arg3, 4, 0, local51, local83, local63, local73, local87.anInt313, true, null);
						}
						arg4.method1747(arg6, arg0, arg7, local98, local171, 512, arg2, 0, 0, local110, local123);
					} else if (arg5 == 8) {
						if (local87.anInt313 == -1 && local87.anIntArray54 == null) {
							local171 = local87.method173(local63, 4, local51, local83, local73, 0);
						} else {
							local171 = new Class1_Sub1_Sub2_Sub2(arg3, 4, 0, local51, local83, local63, local73, local87.anInt313, true, null);
						}
						arg4.method1747(arg6, arg0, arg7, local98, local171, 768, arg2, 0, 0, local110, local123);
					}
				}
			}
		} else if (!Static9.aBoolean7 || local87.anInt298 != 0 || local87.aBoolean18) {
			if (local87.anInt313 == -1 && local87.anIntArray54 == null) {
				local171 = local87.method173(local63, 22, local51, local83, local73, arg2);
			} else {
				local171 = new Class1_Sub1_Sub2_Sub2(arg3, 22, arg2, local51, local83, local63, local73, local87.anInt313, true, null);
			}
			arg4.method1715(arg6, arg0, arg7, local98, local171, local110, local123);
			if (local87.aBoolean21 && local87.anInt298 == 1 && arg1 != null) {
				arg1.method1362(arg7, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public static void method110() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIII)I")
	public static int method111(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = 256 - arg2;
		return ((arg1 & 0xFF00) * arg2 + (arg0 & 0xFF00) * local8 & 0xFF0000) + ((arg1 & 0xFF00FF) * arg2 + (arg0 & 0xFF00FF) * local8 & 0xFF00FF00) >> 8;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
	public static void method112() {
		aClass23_166 = null;
		anIntArray42 = null;
		aClass23_167 = null;
		aClass23_170 = null;
		aClass23Array5 = null;
		aClass23_169 = null;
		aClass23_171 = null;
		aClass23_168 = null;
		anIntArray41 = null;
		aClass23_172 = null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	public static void method113() {
		Static14.aClass5_10.method99();
		Static80.aClass5_47.method99();
		Static16.aClass5_12.method99();
	}
}
