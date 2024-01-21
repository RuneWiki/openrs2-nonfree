import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "[Lclient!fa;")
	public static Class1_Sub1_Sub8_Sub1[] aClass1_Sub1_Sub8_Sub1Array7;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "Lclient!k;")
	public static Class1_Sub1_Sub8_Sub3 aClass1_Sub1_Sub8_Sub3_4;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "Lclient!ea;")
	public static Class18 aClass18_856 = Static8.method128("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "Lclient!ea;")
	private static Class18 aClass18_857 = Static8.method128("Please try again)3");

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "Lclient!ea;")
	private static Class18 aClass18_858 = Static8.method128(" has logged out)3");

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Lclient!ea;")
	public static Class18 aClass18_859 = Static8.method128("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "Lclient!ea;")
	public static Class18 aClass18_860 = aClass18_857;

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "Lclient!ea;")
	public static Class18 aClass18_861 = Static8.method128("p11_full");

	@OriginalMember(owner = "client!pc", name = "q", descriptor = "Lclient!ea;")
	public static Class18 aClass18_862 = aClass18_858;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
	public static void method2350() {
		for (@Pc(3) int local3 = 0; local3 < Static76.anInt2355; local3++) {
			@Pc(9) int local9 = Static82.anIntArray220[local3];
			@Pc(13) Class1_Sub1_Sub5_Sub1_Sub1 local13 = Static91.aClass1_Sub1_Sub5_Sub1_Sub1Array1[local9];
			@Pc(19) int local19 = Static167.aClass1_Sub6_Sub1_3.method544();
			@Pc(27) int local27;
			@Pc(31) int local31;
			if ((local19 & 0x10) != 0) {
				local27 = Static167.aClass1_Sub6_Sub1_3.method522();
				local31 = Static167.aClass1_Sub6_Sub1_3.method498();
				if (local27 == 65535) {
					local27 = -1;
				}
				if (local27 == local13.anInt3568 && local27 != -1) {
					@Pc(48) int local48 = Static121.method2378(local27).anInt3450;
					if (local48 == 1) {
						local13.anInt3586 = 0;
						local13.anInt3589 = 0;
						local13.anInt3597 = local31;
						local13.anInt3572 = 0;
					}
					if (local48 == 2) {
						local13.anInt3572 = 0;
					}
				} else if (local27 == -1 || local13.anInt3568 == -1 || Static121.method2378(local27).anInt3451 >= Static121.method2378(local13.anInt3568).anInt3451) {
					local13.anInt3568 = local27;
					local13.anInt3572 = 0;
					local13.anInt3556 = local13.anInt3561;
					local13.anInt3586 = 0;
					local13.anInt3597 = local31;
					local13.anInt3589 = 0;
				}
			}
			if ((local19 & 0x4) != 0) {
				local13.anInt3566 = Static167.aClass1_Sub6_Sub1_3.method546();
				if (local13.anInt3566 == 65535) {
					local13.anInt3566 = -1;
				}
			}
			if ((local19 & 0x2) != 0) {
				local13.aClass1_Sub1_Sub15_1 = Static164.method3047(Static167.aClass1_Sub6_Sub1_3.method522());
				local13.anInt3587 = local13.aClass1_Sub1_Sub15_1.anInt3801;
				local13.anInt3603 = local13.aClass1_Sub1_Sub15_1.anInt3790;
				local13.anInt3573 = local13.aClass1_Sub1_Sub15_1.anInt3787;
				local13.anInt3581 = local13.aClass1_Sub1_Sub15_1.anInt3793;
				local13.anInt3591 = local13.aClass1_Sub1_Sub15_1.anInt3809;
				local13.anInt3607 = local13.aClass1_Sub1_Sub15_1.anInt3783;
				local13.anInt3594 = local13.aClass1_Sub1_Sub15_1.anInt3794;
				local13.anInt3585 = local13.aClass1_Sub1_Sub15_1.anInt3810;
				local13.anInt3570 = local13.aClass1_Sub1_Sub15_1.anInt3784;
			}
			if ((local19 & 0x40) != 0) {
				local13.anInt3595 = Static167.aClass1_Sub6_Sub1_3.method522();
				local13.anInt3588 = Static167.aClass1_Sub6_Sub1_3.method522();
			}
			if ((local19 & 0x80) != 0) {
				local27 = Static167.aClass1_Sub6_Sub1_3.method544();
				local31 = Static167.aClass1_Sub6_Sub1_3.method518();
				local13.method2478(Static41.anInt1322, local27, local31);
				local13.anInt3604 = Static41.anInt1322 + 300;
				local13.anInt3600 = Static167.aClass1_Sub6_Sub1_3.method544();
				local13.anInt3598 = Static167.aClass1_Sub6_Sub1_3.method533();
			}
			if ((local19 & 0x20) != 0) {
				local27 = Static167.aClass1_Sub6_Sub1_3.method518();
				local31 = Static167.aClass1_Sub6_Sub1_3.method518();
				local13.method2478(Static41.anInt1322, local27, local31);
				local13.anInt3604 = Static41.anInt1322 + 300;
				local13.anInt3600 = Static167.aClass1_Sub6_Sub1_3.method518();
				local13.anInt3598 = Static167.aClass1_Sub6_Sub1_3.method518();
			}
			if ((local19 & 0x1) != 0) {
				local13.aClass18_899 = Static167.aClass1_Sub6_Sub1_3.method510();
				local13.anInt3575 = 100;
			}
			if ((local19 & 0x8) != 0) {
				local13.anInt3552 = Static167.aClass1_Sub6_Sub1_3.method550();
				local27 = Static167.aClass1_Sub6_Sub1_3.method502();
				local13.anInt3577 = 0;
				local13.anInt3565 = (local27 & 0xFFFF) + Static41.anInt1322;
				local13.anInt3567 = 0;
				if (local13.anInt3565 > Static41.anInt1322) {
					local13.anInt3567 = -1;
				}
				if (local13.anInt3552 == 65535) {
					local13.anInt3552 = -1;
				}
				local13.anInt3601 = local27 >> 16;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIILclient!re;ZIILclient!fh;)V")
	public static void method2351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class68 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class22 arg7) {
		if (Static27.aBoolean26 && (Static2.aByteArrayArrayArray1[0][arg6][arg5] & 0x2) == 0) {
			if ((Static2.aByteArrayArrayArray1[arg3][arg6][arg5] & 0x10) != 0) {
				return;
			}
			if (Static106.method2187(arg3, arg6, arg5) != Static99.anInt3024) {
				return;
			}
		}
		if (Static95.anInt2954 > arg3) {
			Static95.anInt2954 = arg3;
		}
		@Pc(59) Class1_Sub1_Sub11 local59 = Static62.method1274(arg0);
		@Pc(72) int local72;
		@Pc(75) int local75;
		if (arg2 == 1 || arg2 == 3) {
			local72 = local59.anInt2822;
			local75 = local59.anInt2815;
		} else {
			local75 = local59.anInt2822;
			local72 = local59.anInt2815;
		}
		@Pc(90) int local90;
		@Pc(94) int local94;
		if (local72 + arg6 > 104) {
			local90 = arg6;
			local94 = arg6 + 1;
		} else {
			local94 = arg6 + (local72 + 1 >> 1);
			local90 = (local72 >> 1) + arg6;
		}
		@Pc(119) int local119;
		@Pc(123) int local123;
		if (local75 + arg5 > 104) {
			local119 = arg5;
			local123 = arg5 + 1;
		} else {
			local123 = arg5 + (local75 + 1 >> 1);
			local119 = arg5 + (local75 >> 1);
		}
		@Pc(143) int[][] local143 = Static135.anIntArrayArrayArray5[arg3];
		@Pc(170) int local170 = local143[local94][local123] + local143[local90][local119] + local143[local94][local119] + local143[local90][local123] >> 2;
		@Pc(179) int local179 = (arg6 << 7) + (local72 << 6);
		@Pc(196) int local196 = (arg0 << 14) + arg6 + (arg5 << 7) + 1073741824;
		@Pc(204) int local204 = (local75 << 6) + (arg5 << 7);
		if (local59.anInt2811 == 0) {
			local196 += Integer.MIN_VALUE;
		}
		@Pc(220) int local220 = arg1 + (arg2 << 6);
		if (local59.anInt2805 == 1) {
			local220 += 256;
		}
		if (local59.method1967()) {
			Static164.method3043(arg3, arg2, local59, arg6, arg5);
		}
		@Pc(275) Class1_Sub1_Sub5 local275;
		if (arg1 != 22) {
			@Pc(376) int local376;
			if (arg1 == 10 || arg1 == 11) {
				if (local59.anInt2814 == -1 && local59.anIntArray250 == null) {
					local275 = local59.method1968(local204, 10, local170, local179, local143, arg2);
				} else {
					local275 = new Class1_Sub1_Sub5_Sub6(arg0, 10, arg2, arg3, arg6, arg5, local59.anInt2814, true, null);
				}
				if (local275 != null && arg4.method2621(arg3, arg6, arg5, local170, local72, local75, local275, arg1 == 11 ? 256 : 0, local196, local220) && local59.aBoolean113) {
					local376 = 15;
					if (local275 instanceof Class1_Sub1_Sub5_Sub4) {
						local376 = ((Class1_Sub1_Sub5_Sub4) local275).method998() / 4;
						if (local376 > 30) {
							local376 = 30;
						}
					}
					for (@Pc(394) int local394 = 0; local394 <= local72; local394++) {
						for (@Pc(398) int local398 = 0; local398 <= local75; local398++) {
							if (local376 > Static143.aByteArrayArrayArray6[arg3][arg6 + local394][arg5 + local398]) {
								Static143.aByteArrayArrayArray6[arg3][local394 + arg6][arg5 + local398] = (byte) local376;
							}
						}
					}
				}
				if (local59.anInt2820 != 0 && arg7 != null) {
					arg7.method1053(arg5, local75, local72, arg6, local59.aBoolean114);
				}
			} else if (arg1 >= 12) {
				if (local59.anInt2814 == -1 && local59.anIntArray250 == null) {
					local275 = local59.method1968(local204, arg1, local170, local179, local143, arg2);
				} else {
					local275 = new Class1_Sub1_Sub5_Sub6(arg0, arg1, arg2, arg3, arg6, arg5, local59.anInt2814, true, null);
				}
				arg4.method2621(arg3, arg6, arg5, local170, 1, 1, local275, 0, local196, local220);
				if (arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg3 > 0) {
					Static9.anIntArrayArrayArray1[arg3][arg6][arg5] |= 0x924;
				}
				if (local59.anInt2820 != 0 && arg7 != null) {
					arg7.method1053(arg5, local75, local72, arg6, local59.aBoolean114);
				}
			} else if (arg1 == 0) {
				if (local59.anInt2814 == -1 && local59.anIntArray250 == null) {
					local275 = local59.method1968(local204, 0, local170, local179, local143, arg2);
				} else {
					local275 = new Class1_Sub1_Sub5_Sub6(arg0, 0, arg2, arg3, arg6, arg5, local59.anInt2814, true, null);
				}
				arg4.method2611(arg3, arg6, arg5, local170, local275, null, Static98.anIntArray266[arg2], 0, local196, local220);
				if (arg2 == 0) {
					if (local59.aBoolean113) {
						Static143.aByteArrayArrayArray6[arg3][arg6][arg5] = 50;
						Static143.aByteArrayArrayArray6[arg3][arg6][arg5 + 1] = 50;
					}
					if (local59.aBoolean119) {
						Static9.anIntArrayArrayArray1[arg3][arg6][arg5] |= 0x249;
					}
				} else if (arg2 == 1) {
					if (local59.aBoolean113) {
						Static143.aByteArrayArrayArray6[arg3][arg6][arg5 + 1] = 50;
						Static143.aByteArrayArrayArray6[arg3][arg6 + 1][arg5 + 1] = 50;
					}
					if (local59.aBoolean119) {
						Static9.anIntArrayArrayArray1[arg3][arg6][arg5 + 1] |= 0x492;
					}
				} else if (arg2 == 2) {
					if (local59.aBoolean113) {
						Static143.aByteArrayArrayArray6[arg3][arg6 + 1][arg5] = 50;
						Static143.aByteArrayArrayArray6[arg3][arg6 + 1][arg5 + 1] = 50;
					}
					if (local59.aBoolean119) {
						Static9.anIntArrayArrayArray1[arg3][arg6 + 1][arg5] |= 0x249;
					}
				} else if (arg2 == 3) {
					if (local59.aBoolean113) {
						Static143.aByteArrayArrayArray6[arg3][arg6][arg5] = 50;
						Static143.aByteArrayArrayArray6[arg3][arg6 + 1][arg5] = 50;
					}
					if (local59.aBoolean119) {
						Static9.anIntArrayArrayArray1[arg3][arg6][arg5] |= 0x492;
					}
				}
				if (local59.anInt2820 != 0 && arg7 != null) {
					arg7.method1047(arg5, local59.aBoolean114, arg1, arg6, arg2);
				}
				if (local59.anInt2810 != 16) {
					arg4.method2618(arg3, arg6, arg5, local59.anInt2810);
				}
			} else if (arg1 == 1) {
				if (local59.anInt2814 == -1 && local59.anIntArray250 == null) {
					local275 = local59.method1968(local204, 1, local170, local179, local143, arg2);
				} else {
					local275 = new Class1_Sub1_Sub5_Sub6(arg0, 1, arg2, arg3, arg6, arg5, local59.anInt2814, true, null);
				}
				arg4.method2611(arg3, arg6, arg5, local170, local275, null, Static168.anIntArray416[arg2], 0, local196, local220);
				if (local59.aBoolean113) {
					if (arg2 == 0) {
						Static143.aByteArrayArrayArray6[arg3][arg6][arg5 + 1] = 50;
					} else if (arg2 == 1) {
						Static143.aByteArrayArrayArray6[arg3][arg6 + 1][arg5 + 1] = 50;
					} else if (arg2 == 2) {
						Static143.aByteArrayArrayArray6[arg3][arg6 + 1][arg5] = 50;
					} else if (arg2 == 3) {
						Static143.aByteArrayArrayArray6[arg3][arg6][arg5] = 50;
					}
				}
				if (local59.anInt2820 != 0 && arg7 != null) {
					arg7.method1047(arg5, local59.aBoolean114, arg1, arg6, arg2);
				}
			} else {
				@Pc(978) int local978;
				@Pc(1009) Class1_Sub1_Sub5 local1009;
				if (arg1 == 2) {
					local978 = arg2 + 1 & 0x3;
					@Pc(999) Class1_Sub1_Sub5 local999;
					if (local59.anInt2814 == -1 && local59.anIntArray250 == null) {
						local999 = local59.method1968(local204, 2, local170, local179, local143, arg2 + 4);
						local1009 = local59.method1968(local204, 2, local170, local179, local143, local978);
					} else {
						local999 = new Class1_Sub1_Sub5_Sub6(arg0, 2, arg2 + 4, arg3, arg6, arg5, local59.anInt2814, true, null);
						local1009 = new Class1_Sub1_Sub5_Sub6(arg0, 2, local978, arg3, arg6, arg5, local59.anInt2814, true, null);
					}
					arg4.method2611(arg3, arg6, arg5, local170, local999, local1009, Static98.anIntArray266[arg2], Static98.anIntArray266[local978], local196, local220);
					if (local59.aBoolean119) {
						if (arg2 == 0) {
							Static9.anIntArrayArrayArray1[arg3][arg6][arg5] |= 0x249;
							Static9.anIntArrayArrayArray1[arg3][arg6][arg5 + 1] |= 0x492;
						} else if (arg2 == 1) {
							Static9.anIntArrayArrayArray1[arg3][arg6][arg5 + 1] |= 0x492;
							Static9.anIntArrayArrayArray1[arg3][arg6 + 1][arg5] |= 0x249;
						} else if (arg2 == 2) {
							Static9.anIntArrayArrayArray1[arg3][arg6 + 1][arg5] |= 0x249;
							Static9.anIntArrayArrayArray1[arg3][arg6][arg5] |= 0x492;
						} else if (arg2 == 3) {
							Static9.anIntArrayArrayArray1[arg3][arg6][arg5] |= 0x492;
							Static9.anIntArrayArrayArray1[arg3][arg6][arg5] |= 0x249;
						}
					}
					if (local59.anInt2820 != 0 && arg7 != null) {
						arg7.method1047(arg5, local59.aBoolean114, arg1, arg6, arg2);
					}
					if (local59.anInt2810 != 16) {
						arg4.method2618(arg3, arg6, arg5, local59.anInt2810);
					}
				} else if (arg1 == 3) {
					if (local59.anInt2814 == -1 && local59.anIntArray250 == null) {
						local275 = local59.method1968(local204, 3, local170, local179, local143, arg2);
					} else {
						local275 = new Class1_Sub1_Sub5_Sub6(arg0, 3, arg2, arg3, arg6, arg5, local59.anInt2814, true, null);
					}
					arg4.method2611(arg3, arg6, arg5, local170, local275, null, Static168.anIntArray416[arg2], 0, local196, local220);
					if (local59.aBoolean113) {
						if (arg2 == 0) {
							Static143.aByteArrayArrayArray6[arg3][arg6][arg5 + 1] = 50;
						} else if (arg2 == 1) {
							Static143.aByteArrayArrayArray6[arg3][arg6 + 1][arg5 + 1] = 50;
						} else if (arg2 == 2) {
							Static143.aByteArrayArrayArray6[arg3][arg6 + 1][arg5] = 50;
						} else if (arg2 == 3) {
							Static143.aByteArrayArrayArray6[arg3][arg6][arg5] = 50;
						}
					}
					if (local59.anInt2820 != 0 && arg7 != null) {
						arg7.method1047(arg5, local59.aBoolean114, arg1, arg6, arg2);
					}
				} else if (arg1 == 9) {
					if (local59.anInt2814 == -1 && local59.anIntArray250 == null) {
						local275 = local59.method1968(local204, arg1, local170, local179, local143, arg2);
					} else {
						local275 = new Class1_Sub1_Sub5_Sub6(arg0, arg1, arg2, arg3, arg6, arg5, local59.anInt2814, true, null);
					}
					arg4.method2621(arg3, arg6, arg5, local170, 1, 1, local275, 0, local196, local220);
					if (local59.anInt2820 != 0 && arg7 != null) {
						arg7.method1053(arg5, local75, local72, arg6, local59.aBoolean114);
					}
					if (local59.anInt2810 != 16) {
						arg4.method2618(arg3, arg6, arg5, local59.anInt2810);
					}
				} else if (arg1 == 4) {
					if (local59.anInt2814 == -1 && local59.anIntArray250 == null) {
						local275 = local59.method1968(local204, 4, local170, local179, local143, arg2);
					} else {
						local275 = new Class1_Sub1_Sub5_Sub6(arg0, 4, arg2, arg3, arg6, arg5, local59.anInt2814, true, null);
					}
					arg4.method2619(arg3, arg6, arg5, local170, local275, null, Static98.anIntArray266[arg2], 0, 0, 0, local196, local220);
				} else if (arg1 == 5) {
					local978 = 16;
					local376 = arg4.method2648(arg3, arg6, arg5);
					if (local376 != 0) {
						local978 = Static62.method1274(local376 >> 14 & 0x7FFF).anInt2810;
					}
					if (local59.anInt2814 == -1 && local59.anIntArray250 == null) {
						local1009 = local59.method1968(local204, 4, local170, local179, local143, arg2);
					} else {
						local1009 = new Class1_Sub1_Sub5_Sub6(arg0, 4, arg2, arg3, arg6, arg5, local59.anInt2814, true, null);
					}
					arg4.method2619(arg3, arg6, arg5, local170, local1009, null, Static98.anIntArray266[arg2], 0, Static20.anIntArray42[arg2] * local978, Static31.anIntArray70[arg2] * local978, local196, local220);
				} else if (arg1 == 6) {
					local978 = 8;
					local376 = arg4.method2648(arg3, arg6, arg5);
					if (local376 != 0) {
						local978 = Static62.method1274(local376 >> 14 & 0x7FFF).anInt2810 / 2;
					}
					if (local59.anInt2814 == -1 && local59.anIntArray250 == null) {
						local1009 = local59.method1968(local204, 4, local170, local179, local143, arg2 + 4);
					} else {
						local1009 = new Class1_Sub1_Sub5_Sub6(arg0, 4, arg2 + 4, arg3, arg6, arg5, local59.anInt2814, true, null);
					}
					arg4.method2619(arg3, arg6, arg5, local170, local1009, null, 256, arg2, Static99.anIntArray267[arg2] * local978, Static72.anIntArray196[arg2] * local978, local196, local220);
				} else if (arg1 == 7) {
					local376 = arg2 + 2 & 0x3;
					if (local59.anInt2814 == -1 && local59.anIntArray250 == null) {
						local275 = local59.method1968(local204, 4, local170, local179, local143, local376 + 4);
					} else {
						local275 = new Class1_Sub1_Sub5_Sub6(arg0, 4, local376 + 4, arg3, arg6, arg5, local59.anInt2814, true, null);
					}
					arg4.method2619(arg3, arg6, arg5, local170, local275, null, 256, local376, 0, 0, local196, local220);
				} else if (arg1 == 8) {
					local978 = 8;
					local376 = arg4.method2648(arg3, arg6, arg5);
					if (local376 != 0) {
						local978 = Static62.method1274(local376 >> 14 & 0x7FFF).anInt2810 / 2;
					}
					@Pc(1788) int local1788 = arg2 + 2 & 0x3;
					@Pc(1820) Class1_Sub1_Sub5 local1820;
					if (local59.anInt2814 == -1 && local59.anIntArray250 == null) {
						local1009 = local59.method1968(local204, 4, local170, local179, local143, arg2 + 4);
						local1820 = local59.method1968(local204, 4, local170, local179, local143, local1788 + 4);
					} else {
						local1009 = new Class1_Sub1_Sub5_Sub6(arg0, 4, arg2 + 4, arg3, arg6, arg5, local59.anInt2814, true, null);
						local1820 = new Class1_Sub1_Sub5_Sub6(arg0, 4, local1788 + 4, arg3, arg6, arg5, local59.anInt2814, true, null);
					}
					arg4.method2619(arg3, arg6, arg5, local170, local1009, local1820, 256, arg2, local978 * Static99.anIntArray267[arg2], Static72.anIntArray196[arg2] * local978, local196, local220);
				}
			}
		} else if (!Static27.aBoolean26 || local59.anInt2811 != 0 || local59.anInt2820 == 1 || local59.aBoolean115) {
			if (local59.anInt2814 == -1 && local59.anIntArray250 == null) {
				local275 = local59.method1968(local204, 22, local170, local179, local143, arg2);
			} else {
				local275 = new Class1_Sub1_Sub5_Sub6(arg0, 22, arg2, arg3, arg6, arg5, local59.anInt2814, true, null);
			}
			arg4.method2643(arg3, arg6, arg5, local170, local275, local196, local220);
			if (local59.anInt2820 == 1 && arg7 != null) {
				arg7.method1052(arg5, arg6);
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V")
	public static void method2352() {
		aClass18_859 = null;
		aClass1_Sub1_Sub8_Sub1Array7 = null;
		aClass18_856 = null;
		aClass18_858 = null;
		aClass18_857 = null;
		aClass18_861 = null;
		aClass1_Sub1_Sub8_Sub3_4 = null;
		aClass18_860 = null;
		aClass18_862 = null;
	}
}
