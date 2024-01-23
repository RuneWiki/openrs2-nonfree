import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!il", name = "t", descriptor = "I")
	public static int anInt2421;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "I")
	public static int anInt2406 = 0;

	@OriginalMember(owner = "client!il", name = "n", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray14 = new String[5];

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIII[Lclient!gd;[BIIIBZ)[I")
	public static int[] method2133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class60[] arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) boolean arg9) {
		@Pc(11) int local11;
		@Pc(26) int local26;
		if (!arg9) {
			for (@Pc(6) int local6 = 0; local6 < 8; local6++) {
				for (local11 = 0; local11 < 8; local11++) {
					local26 = Static79.method1629(local6 & 0x7, local11 & 0x7, arg7) + arg6;
					@Pc(38) int local38 = Static41.method727(local11 & 0x7, local6 & 0x7, arg7) + arg3;
					if (local26 > 0 && local26 < 103 && local38 > 0 && local38 < 103) {
						arg4[arg8].anIntArrayArray12[local26][local38] &= 0xFFDFFFFF;
					}
				}
			}
		}
		@Pc(82) byte local82;
		if (arg9) {
			local82 = 1;
		} else {
			local82 = 4;
		}
		@Pc(92) int local92 = (arg0 & 0x7) * 8;
		local11 = (arg2 & 0x1FFFFFF8) << 3;
		@Pc(104) int local104 = (arg2 & 0x7) * 8;
		@Pc(110) byte local110 = 0;
		local26 = (arg0 & 0x1FFFFFF8) << 3;
		@Pc(121) Class1_Sub13 local121 = new Class1_Sub13(arg5);
		@Pc(123) byte local123 = 0;
		if (arg7 == 1) {
			local123 = 1;
		} else if (arg7 == 2) {
			local123 = 1;
			local110 = 1;
		} else if (arg7 == 3) {
			local110 = 1;
		}
		@Pc(169) int local169;
		@Pc(226) int local226;
		@Pc(219) int local219;
		@Pc(374) int local374;
		@Pc(381) int local381;
		@Pc(390) int local390;
		@Pc(397) int local397;
		for (@Pc(157) int local157 = 0; local157 < local82; local157++) {
			for (@Pc(162) int local162 = 0; local162 < 64; local162++) {
				for (local169 = 0; local169 < 64; local169++) {
					if (local157 != arg1 || local162 < local104 || local104 + 8 < local162 || local92 > local169 || local92 + 8 < local169) {
						Static68.method1294(-1, 0, local121, 0, false, 0, 0, arg9, 0, 0, -1);
					} else if (local162 == local104 + 8 || local169 == local92 + 8) {
						if (arg7 == 0) {
							local219 = local169 + arg3 - local92;
							local226 = local162 + arg6 - local104;
						} else if (arg7 == 1) {
							local219 = local104 + arg3 + 8 - local162;
							local226 = arg6 + local169 - local92;
						} else if (arg7 == 2) {
							local219 = arg3 + local92 + 8 - local169;
							local226 = arg6 + local104 + 8 - local162;
						} else {
							local226 = local92 + arg6 + 8 - local169;
							local219 = arg3 + local162 - local104;
						}
						Static68.method1294(local219, local11 + local162, local121, 0, true, 0, 0, arg9, arg8, local169 + local26, local226);
					} else {
						local226 = Static79.method1629(local162 & 0x7, local169 & 0x7, arg7) + arg6;
						local219 = arg3 + Static41.method727(local169 & 0x7, local162 & 0x7, arg7);
						Static68.method1294(local219, local162 + local11, local121, local123, false, arg7, local110, arg9, arg8, local169 + local26, local226);
						if (local162 == 63 || local169 == 63) {
							local374 = local162 == 63 ? 64 : local162;
							local381 = local169 == 63 ? 64 : local169;
							if (arg7 == 0) {
								local390 = arg6 + local374 - local104;
								local397 = arg3 + local381 - local92;
							} else if (arg7 == 1) {
								local397 = arg3 + local104 + 8 - local374;
								local390 = arg6 + local381 - local92;
							} else if (arg7 == 2) {
								local390 = arg6 + local104 + 8 - local374;
								local397 = local92 + arg3 + 8 - local381;
							} else {
								local390 = local92 + arg6 + 8 - local381;
								local397 = local374 + arg3 - local104;
							}
							if (local390 >= 0 && local390 < 104 && local397 >= 0 && local397 < 104) {
								Static280.anIntArrayArrayArray13[arg8][local390][local397] = Static280.anIntArrayArrayArray13[arg8][local110 + local226][local219 + local123];
							}
						}
					}
				}
			}
		}
		@Pc(518) boolean local518 = false;
		@Pc(638) int local638;
		@Pc(679) int local679;
		while (local121.aByteArray63.length > local121.anInt2018) {
			local169 = local121.method1853();
			if (local169 == 128) {
				local518 = true;
				Static261.anIntArray546[0] = local121.method1879();
				Static261.anIntArray546[1] = local121.method1843();
				Static261.anIntArray546[2] = local121.method1843();
				Static261.anIntArray546[3] = local121.method1843();
				Static261.anIntArray546[4] = local121.method1879();
			} else {
				if (local169 != 129) {
					local121.anInt2018--;
					break;
				}
				for (local226 = 0; local226 < 4; local226++) {
					@Pc(595) byte local595 = local121.method1829();
					if (local595 == 0) {
						if (arg1 >= local226) {
							local381 = arg6 + 7;
							local374 = arg6;
							if (local381 < 0) {
								local381 = 0;
							} else if (local381 >= 104) {
								local381 = 104;
							}
							if (arg6 < 0) {
								local374 = 0;
							} else if (arg6 >= 104) {
								local374 = 104;
							}
							local397 = arg3 + 7;
							local390 = arg3;
							if (arg3 < 0) {
								local390 = 0;
							} else if (arg3 >= 104) {
								local390 = 104;
							}
							if (local397 < 0) {
								local397 = 0;
							} else if (local397 >= 104) {
								local397 = 104;
							}
							while (local374 < local381) {
								while (local397 > local390) {
									Static199.aByteArrayArrayArray8[arg8][local374][local390] = 0;
									local390++;
								}
								local374++;
							}
						}
					} else if (local595 == 1) {
						for (local374 = 0; local374 < 64; local374 += 4) {
							for (local381 = 0; local381 < 64; local381 += 4) {
								@Pc(625) byte local625 = local121.method1829();
								if (arg1 >= local226) {
									for (local397 = local374; local397 < local374 + 4; local397++) {
										for (local638 = local381; local638 < local381 + 4; local638++) {
											if (local104 <= local397 && local397 < local104 + 8 && local92 <= local638 && local92 + 8 > local92) {
												local679 = Static79.method1629(local397 & 0x7, local638 & 0x7, arg7) + arg6;
												@Pc(692) int local692 = arg3 + Static41.method727(local638 & 0x7, local397 & 0x7, arg7);
												if (local679 >= 0 && local679 < 104 && local692 >= 0 && local692 < 104) {
													Static199.aByteArrayArrayArray8[arg8][local679][local692] = local625;
												}
											}
										}
									}
								}
							}
						}
					} else if (local595 == 2) {
					}
				}
			}
		}
		if (Static71.aBoolean165 && !arg9) {
			@Pc(846) Class43 local846 = null;
			label291: while (true) {
				label284: do {
					while (true) {
						while (local121.anInt2018 < local121.aByteArray63.length) {
							local226 = local121.method1853();
							if (local226 == 0) {
								local846 = new Class43(local121);
							} else {
								if (local226 == 1) {
									local219 = local121.method1853();
									continue label284;
								}
								if (local226 != 2) {
									throw new IllegalStateException();
								}
								if (local846 == null) {
									local846 = new Class43();
								}
								local846.method1133(local121);
							}
						}
						if (local846 == null) {
							local846 = new Class43();
						}
						Static54.aClass43ArrayArray1[arg6 >> 3][arg3 >> 3] = local846;
						break label291;
					}
				} while (local219 <= 0);
				for (local374 = 0; local374 < local219; local374++) {
					@Pc(888) Class118 local888 = new Class118(local121);
					if (local888.anInt3563 == 31) {
						@Pc(900) Class70 local900 = Static19.method321(local121.method1879());
						local888.method3151(local900.anInt1983, local900.anInt1981, local900.anInt1984, local900.anInt1986);
					}
					local397 = local888.anInt3569 >> 7;
					local390 = local888.anInt3551 >> 7;
					if (arg1 == local888.anInt3552 && local390 >= local104 && local390 < local104 + 8 && local397 >= local92 && local397 < local92 + 8) {
						local638 = Static80.method1666(local888.anInt3569 & 0x3FF, local888.anInt3551 & 0x3FF, arg7) + (arg6 << 7);
						local679 = (arg3 << 7) + Static138.method3844(arg7, local888.anInt3551 & 0x3FF, local888.anInt3569 & 0x3FF);
						local888.anInt3569 = local679;
						local888.anInt3551 = local638;
						local397 = local888.anInt3569 >> 7;
						local390 = local888.anInt3551 >> 7;
						if (local390 >= 0 && local397 >= 0 && local390 < 104 && local397 < 104) {
							local888.aBoolean316 = (Static17.aByteArrayArrayArray1[1][local390][local397] & 0x2) != 0;
							local888.anInt3565 = Static280.anIntArrayArrayArray13[local888.anInt3552][local390][local397] - local888.anInt3565;
							Static151.method2642(local888);
						}
					}
				}
			}
		}
		local169 = arg6 + 7;
		local226 = arg3 + 7;
		for (local219 = arg6; local219 < local169; local219++) {
			for (local374 = arg3; local374 < local226; local374++) {
				Static199.aByteArrayArrayArray8[arg8][local219][local374] = 0;
			}
		}
		return local518 ? Static261.anIntArray546 : null;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZLjava/util/Random;I)I")
	public static int method2140(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static57.method1025(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(36) int local36 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(43) int local43;
			do {
				local43 = arg0.nextInt();
			} while (local43 >= local36);
			return Static53.method982(local43, arg1);
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IILclient!kl;I)V")
	public static void method2143(@OriginalArg(0) int arg0, @OriginalArg(2) Class11_Sub4_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(23) int local23;
		if ((arg2 & 0x8) != 0) {
			local12 = Static10.aClass1_Sub13_Sub1_117.method1879();
			local16 = Static10.aClass1_Sub13_Sub1_117.method1845();
			@Pc(20) int local20 = Static10.aClass1_Sub13_Sub1_117.method1867();
			local23 = Static10.aClass1_Sub13_Sub1_117.anInt2018;
			@Pc(34) boolean local34 = (local12 & 0x8000) != 0;
			if (arg1.aString99 != null && arg1.aClass61_2 != null) {
				@Pc(47) long local47 = Static282.method4276(arg1.aString99);
				@Pc(49) boolean local49 = false;
				if (local16 <= 1) {
					if (!local34 && (Static287.aBoolean492 && !Static294.aBoolean110 || Static220.aBoolean372)) {
						local49 = true;
					} else {
						for (@Pc(68) int local68 = 0; local68 < Static282.anInt5138; local68++) {
							if (local47 == Static86.aLongArray6[local68]) {
								local49 = true;
								break;
							}
						}
					}
				}
				if (!local49 && Static155.anInt3106 == 0) {
					Static301.aClass1_Sub13_10.anInt2018 = 0;
					Static10.aClass1_Sub13_Sub1_117.method1866(Static301.aClass1_Sub13_10.aByteArray63, local20);
					Static301.aClass1_Sub13_10.anInt2018 = 0;
					@Pc(109) int local109 = -1;
					@Pc(128) String local128;
					if (local34) {
						local12 &= 0x7FFF;
						@Pc(119) Class67 local119 = Static9.method169(Static301.aClass1_Sub13_10);
						local109 = local119.anInt1904;
						local128 = local119.aClass1_Sub5_Sub19_1.method3710(Static301.aClass1_Sub13_10);
					} else {
						local128 = Static285.method2872(Static314.method4670(Static263.method4065(Static301.aClass1_Sub13_10)));
					}
					arg1.aString130 = local128.trim();
					arg1.anInt3818 = local12 >> 8;
					arg1.anInt3786 = local12 & 0xFF;
					arg1.anInt3809 = 150;
					if (local16 == 2) {
						Static219.method3546(null, local109, "<img=1>" + arg1.method2583(), local128, local34 ? 17 : 1);
					} else if (local16 == 1) {
						Static219.method3546(null, local109, "<img=0>" + arg1.method2583(), local128, local34 ? 17 : 1);
					} else {
						Static219.method3546(null, local109, arg1.method2583(), local128, local34 ? 17 : 2);
					}
				}
			}
			Static10.aClass1_Sub13_Sub1_117.anInt2018 = local20 + local23;
		}
		if ((arg2 & 0x10) != 0) {
			local12 = Static10.aClass1_Sub13_Sub1_117.method1867();
			@Pc(241) byte[] local241 = new byte[local12];
			@Pc(246) Class1_Sub13 local246 = new Class1_Sub13(local241);
			Static10.aClass1_Sub13_Sub1_117.method1832(local241, local12);
			Static197.aClass1_Sub13Array1[arg0] = local246;
			arg1.method2581(local246);
		}
		if ((arg2 & 0x400) != 0) {
			local12 = Static10.aClass1_Sub13_Sub1_117.method1879();
			if (local12 == 65535) {
				local12 = -1;
			}
			local16 = Static10.aClass1_Sub13_Sub1_117.method1834();
			@Pc(287) boolean local287 = true;
			if (local12 != -1 && arg1.anInt3857 != -1 && Static107.method2016(Static226.method3632(local12).anInt518).anInt4608 < Static107.method2016(Static226.method3632(arg1.anInt3857).anInt518).anInt4608) {
				local287 = false;
			}
			if (local287) {
				arg1.anInt3857 = local12;
				arg1.anInt3795 = 0;
				arg1.anInt3805 = local16 >> 16;
				arg1.anInt3801 = 1;
				arg1.anInt3851 = (local16 & 0xFFFF) + Static167.anInt637;
				arg1.anInt3788 = 0;
				if (Static167.anInt637 < arg1.anInt3851) {
					arg1.anInt3788 = -1;
				}
				if (arg1.anInt3857 != -1 && Static167.anInt637 == arg1.anInt3851) {
					local23 = Static226.method3632(arg1.anInt3857).anInt518;
					if (local23 != -1) {
						@Pc(375) Class152 local375 = Static107.method2016(local23);
						if (local375 != null && local375.anIntArray509 != null) {
							Static291.method4385(local375, arg1 == Static138.aClass11_Sub4_Sub1_3, arg1.anInt3856, arg1.anInt3865, 0);
						}
					}
				}
			}
		}
		if ((arg2 & 0x2) != 0) {
			local12 = Static10.aClass1_Sub13_Sub1_117.method1830();
			local16 = Static10.aClass1_Sub13_Sub1_117.method1867();
			arg1.method3345(Static167.anInt637, local12, local16);
			arg1.anInt3791 = Static167.anInt637 + 300;
			arg1.anInt3854 = Static10.aClass1_Sub13_Sub1_117.method1849();
		}
		if ((arg2 & 0x1) != 0) {
			arg1.aString130 = Static10.aClass1_Sub13_Sub1_117.method1827();
			if (arg1.aString130.charAt(0) == '~') {
				arg1.aString130 = arg1.aString130.substring(1);
				Static305.method4555(arg1.aString130, arg1.method2583(), 2);
			} else if (arg1 == Static138.aClass11_Sub4_Sub1_3) {
				Static305.method4555(arg1.aString130, arg1.method2583(), 2);
			}
			arg1.anInt3809 = 150;
			arg1.anInt3818 = 0;
			arg1.anInt3786 = 0;
		}
		if ((arg2 & 0x800) != 0) {
			local12 = Static10.aClass1_Sub13_Sub1_117.method1853();
			@Pc(499) int[] local499 = new int[local12];
			@Pc(502) int[] local502 = new int[local12];
			@Pc(505) int[] local505 = new int[local12];
			for (@Pc(507) int local507 = 0; local507 < local12; local507++) {
				@Pc(518) int local518 = Static10.aClass1_Sub13_Sub1_117.method1879();
				if (local518 == 65535) {
					local518 = -1;
				}
				local499[local507] = local518;
				local505[local507] = Static10.aClass1_Sub13_Sub1_117.method1853();
				local502[local507] = Static10.aClass1_Sub13_Sub1_117.method1879();
			}
			Static140.method2474(arg1, local505, local499, local502);
		}
		if ((arg2 & 0x20) != 0) {
			arg1.anInt3784 = Static10.aClass1_Sub13_Sub1_117.method1844();
			if (arg1.anInt3784 == 65535) {
				arg1.anInt3784 = -1;
			}
		}
		if ((arg2 & 0x200) != 0) {
			local12 = Static10.aClass1_Sub13_Sub1_117.method1830();
			local16 = Static10.aClass1_Sub13_Sub1_117.method1849();
			arg1.method3345(Static167.anInt637, local12, local16);
		}
		if ((arg2 & 0x100) != 0) {
			arg1.anInt3844 = Static10.aClass1_Sub13_Sub1_117.method1849();
			arg1.anInt3827 = Static10.aClass1_Sub13_Sub1_117.method1853();
			arg1.anInt3834 = Static10.aClass1_Sub13_Sub1_117.method1853();
			arg1.anInt3810 = Static10.aClass1_Sub13_Sub1_117.method1853();
			arg1.anInt3867 = Static10.aClass1_Sub13_Sub1_117.method1870() + Static167.anInt637;
			arg1.anInt3807 = Static10.aClass1_Sub13_Sub1_117.method1870() + Static167.anInt637;
			arg1.anInt3819 = Static10.aClass1_Sub13_Sub1_117.method1853();
			arg1.anInt3863 = 1;
			arg1.anInt3783 = 0;
		}
		if ((arg2 & 0x40) != 0) {
			local12 = Static10.aClass1_Sub13_Sub1_117.method1856();
			local16 = Static10.aClass1_Sub13_Sub1_117.method1867();
			if (local12 == 65535) {
				local12 = -1;
			}
			Static23.method466(local12, arg1, local16);
		}
		if ((arg2 & 0x4) != 0) {
			arg1.anInt3816 = Static10.aClass1_Sub13_Sub1_117.method1879();
			arg1.anInt3790 = Static10.aClass1_Sub13_Sub1_117.method1856();
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(II)I")
	public static int method2145(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
