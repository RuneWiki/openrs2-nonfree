import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ca", name = "s", descriptor = "Lclient!qd;")
	public static Class63 aClass63_6 = new Class63(30);

	@OriginalMember(owner = "client!ca", name = "F", descriptor = "Lclient!id;")
	private static Class34 aClass34_305 = Static9.method266("Sorry invited players only)3");

	@OriginalMember(owner = "client!ca", name = "B", descriptor = "Lclient!id;")
	public static Class34 aClass34_304 = aClass34_305;

	@OriginalMember(owner = "client!ca", name = "L", descriptor = "[I")
	public static int[] anIntArray54 = new int[1000];

	@OriginalMember(owner = "client!ca", name = "R", descriptor = "Lclient!mc;")
	public static Class48 aClass48_2 = new Class48(32);

	@OriginalMember(owner = "client!ca", name = "S", descriptor = "I")
	public static int anInt599 = 0;

	@OriginalMember(owner = "client!ca", name = "T", descriptor = "Lclient!id;")
	public static Class34 aClass34_306 = Static9.method266("sl_arrows");

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLclient!id;Lclient!id;Lclient!id;)V")
	public static void method345(@OriginalArg(1) Class34 arg0, @OriginalArg(2) Class34 arg1, @OriginalArg(3) Class34 arg2) {
		Static120.aClass34_1462 = arg1;
		Static120.aClass34_1470 = arg0;
		Static120.aClass34_1459 = arg2;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BIIIIII)I")
	public static int method346(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg3 & 0x3;
		if ((arg5 & 0x1) == 1) {
			@Pc(16) int local16 = arg4;
			arg4 = arg0;
			arg0 = local16;
		}
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 7 + 1 - arg2 - arg4;
		} else {
			return 7 + 1 - arg1 - arg0;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZI)V")
	public static void method347(@OriginalArg(1) int arg0) {
		if (Static88.aClass1_Sub14Array1 != null && arg0 >= 0 && arg0 < Static88.aClass1_Sub14Array1.length && Static88.aClass1_Sub14Array1[arg0] != null) {
			Static21.aClass1_Sub19_Sub1_1.method2105(32);
			Static21.aClass1_Sub19_Sub1_1.method2073(Static88.aClass1_Sub14Array1[arg0].aLong162);
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)V")
	public static void method348(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static26.method496(arg0)) {
			Static20.method437(arg1, Static41.aClass1_Sub9ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IBLclient!a;II)V")
	public static void method349(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub1_Sub1_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 == Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1 || Static71.anInt1876 >= 400) {
			return;
		}
		@Pc(48) Class34 local48;
		if (arg1.anInt264 == 0) {
			local48 = Static91.method1554(new Class34[] { arg1.aClass34_97, Static16.method380(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt253, arg1.anInt253), Static109.aClass34_1580, Static102.aClass34_1288, Static85.method1456(arg1.anInt253), Static11.aClass34_250 });
		} else {
			local48 = Static91.method1554(new Class34[] { arg1.aClass34_97, Static109.aClass34_1580, Static126.aClass34_1537, Static85.method1456(arg1.anInt264), Static11.aClass34_250 });
		}
		@Pc(162) int local162;
		if (Static130.anInt1509 == 1) {
			Static73.method1286(arg0, 25, Static91.method1554(new Class34[] { Static74.aClass34_1001, Static98.aClass34_1242, local48 }), arg3, arg2, Static72.aClass34_922);
		} else if (!Static1.aBoolean14) {
			for (local162 = 7; local162 >= 0; local162--) {
				if (Static65.aClass34Array15[local162] != null) {
					@Pc(170) short local170 = 0;
					if (Static65.aClass34Array15[local162].method961(Static7.aClass34_213)) {
						if (arg1.anInt253 > Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt253) {
							local170 = 2000;
						}
						if (Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt248 != 0 && arg1.anInt248 != 0) {
							if (arg1.anInt248 == Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt248) {
								local170 = 2000;
							} else {
								local170 = 0;
							}
						}
					} else if (Static40.aBooleanArray7[local162]) {
						local170 = 2000;
					}
					@Pc(231) int local231 = local170 + Static41.anIntArray117[local162];
					Static73.method1286(arg0, local231, Static91.method1554(new Class34[] { Static78.aClass34_1036, local48 }), arg3, arg2, Static65.aClass34Array15[local162]);
				}
			}
		} else if ((Static5.anInt362 & 0x8) == 8) {
			Static73.method1286(arg0, 40, Static91.method1554(new Class34[] { Static51.aClass34_719, Static98.aClass34_1242, local48 }), arg3, arg2, Static32.aClass34_700);
		}
		for (local162 = 0; local162 < Static71.anInt1876; local162++) {
			if (Static78.anIntArray245[local162] == 21) {
				Static71.aClass34Array16[local162] = Static91.method1554(new Class34[] { Static78.aClass34_1036, local48 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!ef;Z)V")
	public static void method350(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		arg0.anInt1446 = arg0.anInt1409;
		if (arg0.anInt1417 == 0) {
			arg0.anInt1412 = 0;
			return;
		}
		if (arg0.anInt1388 != -1 && arg0.anInt1416 == 0) {
			@Pc(35) Class1_Sub1_Sub6 local35 = Static40.method687(arg0.anInt1388);
			if (arg0.anInt1418 > 0 && local35.anInt1196 == 0) {
				arg0.anInt1412++;
				return;
			}
			if (arg0.anInt1418 <= 0 && local35.anInt1205 == 0) {
				arg0.anInt1412++;
				return;
			}
		}
		@Pc(70) int local70 = arg0.anInt1428;
		@Pc(73) int local73 = arg0.anInt1405;
		@Pc(88) int local88 = arg0.anInt1443 * 64 + arg0.anIntArray149[arg0.anInt1417 - 1] * 128;
		@Pc(103) int local103 = arg0.anInt1443 * 64 + arg0.anIntArray147[arg0.anInt1417 - 1] * 128;
		if (local88 - local70 > 256 || local88 - local70 < -256 || local103 - local73 > 256 || local103 - local73 < -256) {
			arg0.anInt1428 = local88;
			arg0.anInt1405 = local103;
			return;
		}
		@Pc(141) int local141 = arg0.anInt1404;
		if (local70 >= local88) {
			if (local88 >= local70) {
				if (local73 < local103) {
					arg0.anInt1402 = 1024;
				} else if (local73 > local103) {
					arg0.anInt1402 = 0;
				}
			} else if (local103 > local73) {
				arg0.anInt1402 = 768;
			} else if (local103 < local73) {
				arg0.anInt1402 = 256;
			} else {
				arg0.anInt1402 = 512;
			}
		} else if (local103 > local73) {
			arg0.anInt1402 = 1280;
		} else if (local103 < local73) {
			arg0.anInt1402 = 1792;
		} else {
			arg0.anInt1402 = 1536;
		}
		@Pc(223) int local223 = arg0.anInt1402 - arg0.anInt1436 & 0x7FF;
		if (local223 > 1024) {
			local223 -= 2048;
		}
		if (local223 >= -256 && local223 <= 256) {
			local141 = arg0.anInt1442;
		} else if (local223 >= 256 && local223 < 768) {
			local141 = arg0.anInt1447;
		} else if (local223 >= -768 && local223 <= -256) {
			local141 = arg0.anInt1395;
		}
		@Pc(266) int local266 = 4;
		@Pc(268) boolean local268 = true;
		if (local141 == -1) {
			local141 = arg0.anInt1442;
		}
		arg0.anInt1446 = local141;
		if (arg0 instanceof Class1_Sub1_Sub1_Sub1_Sub2) {
			local268 = ((Class1_Sub1_Sub1_Sub1_Sub2) arg0).aClass1_Sub1_Sub17_1.aBoolean179;
		}
		if (local268) {
			if (arg0.anInt1436 != arg0.anInt1402 && arg0.anInt1389 == -1 && arg0.anInt1432 != 0) {
				local266 = 2;
			}
			if (arg0.anInt1417 > 2) {
				local266 = 6;
			}
			if (arg0.anInt1417 > 3) {
				local266 = 8;
			}
			if (arg0.anInt1412 > 0 && arg0.anInt1417 > 1) {
				arg0.anInt1412--;
				local266 = 8;
			}
		} else {
			if (arg0.anInt1417 > 1) {
				local266 = 6;
			}
			if (arg0.anInt1417 > 2) {
				local266 = 8;
			}
			if (arg0.anInt1412 > 0 && arg0.anInt1417 > 1) {
				arg0.anInt1412--;
				local266 = 8;
			}
		}
		if (arg0.aBooleanArray9[arg0.anInt1417 - 1]) {
			local266 <<= 0x1;
		}
		if (local73 < local103) {
			arg0.anInt1405 += local266;
			if (arg0.anInt1405 > local103) {
				arg0.anInt1405 = local103;
			}
		} else if (local73 > local103) {
			arg0.anInt1405 -= local266;
			if (local103 > arg0.anInt1405) {
				arg0.anInt1405 = local103;
			}
		}
		if (local70 < local88) {
			arg0.anInt1428 += local266;
			if (local88 < arg0.anInt1428) {
				arg0.anInt1428 = local88;
			}
		} else if (local88 < local70) {
			arg0.anInt1428 -= local266;
			if (local88 > arg0.anInt1428) {
				arg0.anInt1428 = local88;
			}
		}
		if (local266 >= 8 && arg0.anInt1442 == arg0.anInt1446 && arg0.anInt1439 != -1) {
			arg0.anInt1446 = arg0.anInt1439;
		}
		if (local88 != arg0.anInt1428 || local103 != arg0.anInt1405) {
			return;
		}
		arg0.anInt1417--;
		if (arg0.anInt1418 > 0) {
			arg0.anInt1418--;
			return;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
	public static void method351() {
		aClass63_6 = null;
		aClass34_306 = null;
		aClass34_305 = null;
		anIntArray54 = null;
		aClass34_304 = null;
		aClass48_2 = null;
	}
}
