import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ed", name = "Jb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!ed", name = "Mb", descriptor = "Lclient!gd;")
	public static Class27 aClass27_13;

	@OriginalMember(owner = "client!ed", name = "Tb", descriptor = "Lclient!bf;")
	public static Class10 aClass10_3;

	@OriginalMember(owner = "client!ed", name = "fb", descriptor = "Lclient!na;")
	private static Class53 aClass53_352 = Static109.method1737("wishes to duel with you)3");

	@OriginalMember(owner = "client!ed", name = "jb", descriptor = "Lclient!te;")
	public static Class75 aClass75_22 = new Class75(20);

	@OriginalMember(owner = "client!ed", name = "pb", descriptor = "Lclient!na;")
	public static Class53 aClass53_353 = Static109.method1737("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!ed", name = "qb", descriptor = "Lclient!na;")
	public static Class53 aClass53_354 = Static109.method1737(")4l");

	@OriginalMember(owner = "client!ed", name = "sb", descriptor = "Lclient!na;")
	public static Class53 aClass53_355 = aClass53_352;

	@OriginalMember(owner = "client!ed", name = "zb", descriptor = "I")
	public static int anInt843 = 0;

	@OriginalMember(owner = "client!ed", name = "Vb", descriptor = "Lclient!na;")
	private static Class53 aClass53_357 = Static109.method1737("Your account is already logged in)3");

	@OriginalMember(owner = "client!ed", name = "Eb", descriptor = "Lclient!na;")
	public static Class53 aClass53_356 = aClass53_357;

	@OriginalMember(owner = "client!ed", name = "Ub", descriptor = "I")
	public static int anInt856 = -1;

	@OriginalMember(owner = "client!ed", name = "Wb", descriptor = "Lclient!na;")
	private static Class53 aClass53_358 = Static109.method1737("Loaded wordpack");

	@OriginalMember(owner = "client!ed", name = "Xb", descriptor = "Lclient!na;")
	public static Class53 aClass53_359 = Static109.method1737("huffman");

	@OriginalMember(owner = "client!ed", name = "Yb", descriptor = "I")
	public static int anInt857 = 0;

	@OriginalMember(owner = "client!ed", name = "Zb", descriptor = "Lclient!na;")
	public static Class53 aClass53_360 = aClass53_358;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIILclient!je;I[BI[Lclient!bd;III)V")
	public static void method517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class39 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class9[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(11) int local11 = -1;
		@Pc(16) Class3_Sub7 local16 = new Class3_Sub7(arg4);
		while (true) {
			@Pc(22) int local22 = local16.method619();
			if (local22 == 0) {
				return;
			}
			local11 += local22;
			@Pc(33) int local33 = 0;
			while (true) {
				@Pc(37) int local37 = local16.method619();
				if (local37 == 0) {
					break;
				}
				local33 += local37 - 1;
				@Pc(51) int local51 = local33 >> 6 & 0x3F;
				@Pc(55) int local55 = local33 & 0x3F;
				@Pc(59) int local59 = local33 >> 12;
				@Pc(63) int local63 = local16.method647();
				@Pc(67) int local67 = local63 >> 2;
				@Pc(71) int local71 = local63 & 0x3;
				if (arg1 == local59 && arg9 <= local51 && local51 < arg9 + 8 && arg8 <= local55 && arg8 + 8 > local55) {
					@Pc(108) Class3_Sub1_Sub2 local108 = Static12.method200(local11);
					@Pc(125) int local125 = Static20.method378(local51 & 0x7, local108.anInt282, local55 & 0x7, local108.anInt270, arg3, local71) + arg0;
					@Pc(145) int local145 = arg5 + Static120.method1922(arg3, local108.anInt270, local51 & 0x7, local108.anInt282, local71, local55 & 0x7);
					if (local125 > 0 && local145 > 0 && local125 < 103 && local145 < 103) {
						@Pc(162) int local162 = arg7;
						if ((Static37.aByteArrayArrayArray17[1][local125][local145] & 0x2) == 2) {
							local162 = arg7 - 1;
						}
						@Pc(176) Class9 local176 = null;
						if (local162 >= 0) {
							local176 = arg6[local162];
						}
						Static35.method757(local145, arg7, local125, local71 + arg3 & 0x3, local67, local176, arg2, local11);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BIIZ)Lclient!na;")
	public static Class53 method518(@OriginalArg(2) int arg0, @OriginalArg(3) boolean arg1) {
		@Pc(17) int local17 = 1;
		@Pc(21) int local21 = arg0 / 10;
		while (local21 != 0) {
			local21 /= 10;
			local17++;
		}
		@Pc(35) int local35 = local17;
		if (arg0 < 0 || arg1) {
			local35 = local17 + 1;
		}
		@Pc(43) byte[] local43 = new byte[local35];
		if (arg0 < 0) {
			local43[0] = 45;
		} else if (arg1) {
			local43[0] = 43;
		}
		for (@Pc(59) int local59 = 0; local59 < local17; local59++) {
			@Pc(65) int local65 = arg0 % 10;
			arg0 /= 10;
			if (local65 < 0) {
				local65 = -local65;
			}
			if (local65 > 9) {
				local65 += 39;
			}
			local43[local35 - local59 - 1] = (byte) (local65 + 48);
		}
		@Pc(116) Class53 local116 = new Class53();
		local116.aByteArray43 = local43;
		local116.anInt1890 = local35;
		return local116;
	}

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "(I)V")
	public static void method520() {
		if (Static37.aBooleanArray11[96]) {
			Static81.anInt2042 += (-Static81.anInt2042 - 24) / 2;
		} else if (Static37.aBooleanArray11[97]) {
			Static81.anInt2042 += (24 - Static81.anInt2042) / 2;
		} else {
			Static81.anInt2042 /= 2;
		}
		if (Static37.aBooleanArray11[98]) {
			Static33.anInt1998 += (12 - Static33.anInt1998) / 2;
		} else if (Static37.aBooleanArray11[99]) {
			Static33.anInt1998 += (-Static33.anInt1998 - 12) / 2;
		} else {
			Static33.anInt1998 /= 2;
		}
		Static87.anInt2099 = Static87.anInt2099 + Static81.anInt2042 / 2 & 0x7FF;
		Static99.anInt2344 += Static33.anInt1998 / 2;
		if (Static99.anInt2344 < 128) {
			Static99.anInt2344 = 128;
		}
		@Pc(93) int local93 = Static29.anInt1014 + Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1424;
		@Pc(107) int local107 = Static114.anInt2611 + Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1427;
		if (Static99.anInt2344 > 383) {
			Static99.anInt2344 = 383;
		}
		if (Static49.anInt1321 - local93 < -500 || Static49.anInt1321 - local93 > 500 || Static96.anInt1443 - local107 < -500 || Static96.anInt1443 - local107 > 500) {
			Static96.anInt1443 = local107;
			Static49.anInt1321 = local93;
		}
		@Pc(151) int local151 = 0;
		if (local93 != Static49.anInt1321) {
			Static49.anInt1321 += (local93 - Static49.anInt1321) / 16;
		}
		@Pc(170) int local170 = Static49.anInt1321 >> 7;
		if (Static96.anInt1443 != local107) {
			Static96.anInt1443 += (local107 - Static96.anInt1443) / 16;
		}
		@Pc(185) int local185 = Static96.anInt1443 >> 7;
		@Pc(191) int local191 = Static77.method1355(Static96.anInt1443, Static72.anInt1813, Static49.anInt1321);
		@Pc(209) int local209;
		if (local170 > 3 && local185 > 3 && local170 < 100 && local185 < 100) {
			for (local209 = local170 - 4; local209 <= local170 + 4; local209++) {
				for (@Pc(215) int local215 = local185 - 4; local215 <= local185 + 4; local215++) {
					@Pc(219) int local219 = Static72.anInt1813;
					if (local219 < 3 && (Static37.aByteArrayArrayArray17[1][local209][local215] & 0x2) == 2) {
						local219++;
					}
					@Pc(245) int local245 = local191 - Static107.anIntArrayArrayArray7[local219][local209][local215];
					if (local245 > local151) {
						local151 = local245;
					}
				}
			}
		}
		local209 = local151 * 192;
		if (local209 > 98048) {
			local209 = 98048;
		}
		if (local209 < 32768) {
			local209 = 32768;
		}
		if (Static9.anInt231 < local209) {
			Static9.anInt231 += (local209 - Static9.anInt231) / 24;
		} else if (local209 < Static9.anInt231) {
			Static9.anInt231 += (local209 - Static9.anInt231) / 80;
		}
	}

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "(I)V")
	public static void method522() {
		anIntArrayArrayArray1 = null;
		aClass53_352 = null;
		aClass53_355 = null;
		aClass27_13 = null;
		aClass53_358 = null;
		aClass53_360 = null;
		aClass53_356 = null;
		aClass53_354 = null;
		aClass53_357 = null;
		aClass53_353 = null;
		aClass75_22 = null;
		aClass10_3 = null;
		aClass53_359 = null;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III[IZ)V")
	public static void method523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3) {
		Static11.aClass27_4.method1540();
		Static78.aClass3_Sub1_Sub5_Sub3_16.method813(0, 0);
		if (arg3) {
			if (arg2[arg0] != -1) {
				if (arg0 == 0) {
					Static72.aClass3_Sub1_Sub5_Sub3_14.method813(22, 10);
				}
				if (arg0 == 1) {
					Static123.aClass3_Sub1_Sub5_Sub3_26.method813(54, 8);
				}
				if (arg0 == 2) {
					Static123.aClass3_Sub1_Sub5_Sub3_26.method813(82, 8);
				}
				if (arg0 == 3) {
					Static119.aClass3_Sub1_Sub5_Sub3_5.method813(110, 8);
				}
				if (arg0 == 4) {
					Static126.aClass3_Sub1_Sub5_Sub3_20.method813(153, 8);
				}
				if (arg0 == 5) {
					Static126.aClass3_Sub1_Sub5_Sub3_20.method813(181, 8);
				}
				if (arg0 == 6) {
					Static33.aClass3_Sub1_Sub5_Sub3_17.method813(209, 9);
				}
			}
			if (arg2[0] != -1 && arg1 != 0) {
				Static41.aClass3_Sub1_Sub5_Sub3Array3[0].method813(29, 13);
			}
			if (arg2[1] != -1 && arg1 != 1) {
				Static41.aClass3_Sub1_Sub5_Sub3Array3[1].method813(53, 11);
			}
			if (arg2[2] != -1 && arg1 != 2) {
				Static41.aClass3_Sub1_Sub5_Sub3Array3[2].method813(82, 11);
			}
			if (arg2[3] != -1 && arg1 != 3) {
				Static41.aClass3_Sub1_Sub5_Sub3Array3[3].method813(115, 12);
			}
			if (arg2[4] != -1 && arg1 != 4) {
				Static41.aClass3_Sub1_Sub5_Sub3Array3[4].method813(153, 13);
			}
			if (arg2[5] != -1 && arg1 != 5) {
				Static41.aClass3_Sub1_Sub5_Sub3Array3[5].method813(180, 11);
			}
			if (arg2[6] != -1 && arg1 != 6) {
				Static41.aClass3_Sub1_Sub5_Sub3Array3[6].method813(208, 13);
			}
		}
		Static18.aClass27_6.method1540();
		Static96.aClass3_Sub1_Sub5_Sub3_13.method813(0, 0);
		if (arg3) {
			if (arg2[arg0] != -1) {
				if (arg0 == 7) {
					Static101.aClass3_Sub1_Sub5_Sub3_22.method813(42, 0);
				}
				if (arg0 == 8) {
					Static48.aClass3_Sub1_Sub5_Sub3_12.method813(74, 0);
				}
				if (arg0 == 9) {
					Static48.aClass3_Sub1_Sub5_Sub3_12.method813(102, 0);
				}
				if (arg0 == 10) {
					Static105.aClass3_Sub1_Sub5_Sub3_23.method813(130, 1);
				}
				if (arg0 == 11) {
					Static80.aClass3_Sub1_Sub5_Sub3_18.method813(173, 0);
				}
				if (arg0 == 12) {
					Static80.aClass3_Sub1_Sub5_Sub3_18.method813(201, 0);
				}
				if (arg0 == 13) {
					Static32.aClass3_Sub1_Sub5_Sub3_9.method813(229, 0);
				}
			}
			if (arg2[8] != -1 && arg1 != 8) {
				Static41.aClass3_Sub1_Sub5_Sub3Array3[7].method813(74, 2);
			}
			if (arg2[9] != -1 && arg1 != 9) {
				Static41.aClass3_Sub1_Sub5_Sub3Array3[8].method813(102, 3);
			}
			if (arg2[10] != -1 && arg1 != 10) {
				Static41.aClass3_Sub1_Sub5_Sub3Array3[9].method813(137, 4);
			}
			if (arg2[11] != -1 && arg1 != 11) {
				Static41.aClass3_Sub1_Sub5_Sub3Array3[10].method813(174, 2);
			}
			if (arg2[12] != -1 && arg1 != 12) {
				Static41.aClass3_Sub1_Sub5_Sub3Array3[11].method813(201, 2);
			}
			if (arg2[13] != -1 && arg1 != 13) {
				Static41.aClass3_Sub1_Sub5_Sub3Array3[12].method813(226, 2);
			}
		}
		try {
			@Pc(356) Graphics local356 = Static87.aCanvas1.getGraphics();
			Static11.aClass27_4.method1536(160, local356, 516);
			Static18.aClass27_6.method1536(466, local356, 496);
		} catch (@Pc(370) Exception local370) {
			Static87.aCanvas1.repaint();
		}
	}
}
