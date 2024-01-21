import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "[I")
	public static int[] anIntArray172;

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "Z")
	public static boolean aBoolean72;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "Lclient!lc;")
	public static Class31 aClass31_447 = Static56.method1206("::errortest");

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "[I")
	public static int[] anIntArray171 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "[Lclient!ca;")
	public static Class10[] aClass10Array1 = new Class10[50];

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
	public static int anInt1312 = 0;

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17 = new byte[4][104][104];

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
	public static int anInt1316 = 0;

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "Lclient!lc;")
	public static Class31 aClass31_448 = Static56.method1206("Imported music");

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "Lclient!lc;")
	public static Class31 aClass31_449 = Static56.method1206(" ");

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "Lclient!lc;")
	public static Class31 aClass31_450 = Static56.method1206("Report abuse");

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "Lclient!lc;")
	public static Class31 aClass31_451 = Static56.method1206("(U(Y");

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)I")
	public static int method871(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		} else {
			arg1 = (arg0 & 0x7F) * arg1 / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(3) Class2_Sub3 local3 = null;
		for (@Pc(20) Class2_Sub3 local20 = (Class2_Sub3) Static62.aClass36_5.method1365(); local20 != null; local20 = (Class2_Sub3) Static62.aClass36_5.method1361()) {
			if (arg2 == local20.anInt356 && arg4 == local20.anInt355 && arg3 == local20.anInt363 && local20.anInt368 == arg7) {
				local3 = local20;
				break;
			}
		}
		if (local3 == null) {
			local3 = new Class2_Sub3();
			local3.anInt356 = arg2;
			local3.anInt368 = arg7;
			local3.anInt355 = arg4;
			local3.anInt363 = arg3;
			Static64.method415(local3);
			Static62.aClass36_5.method1362(local3);
		}
		local3.anInt358 = arg1;
		local3.anInt371 = arg0;
		local3.anInt359 = arg8;
		local3.anInt354 = arg6;
		local3.anInt360 = arg5;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!ib;Z)V")
	public static void method873(@OriginalArg(0) Class2_Sub1_Sub4_Sub6 arg0) {
		if (arg0.anInt1992 == 0) {
			arg0.anInt2023 = 1024;
		}
		if (arg0.anInt1992 == 1) {
			arg0.anInt2023 = 1536;
		}
		@Pc(27) int local27 = arg0.anInt2018 - Static49.anInt2694;
		if (arg0.anInt1992 == 2) {
			arg0.anInt2023 = 0;
		}
		@Pc(51) int local51 = arg0.anInt1994 * 64 + arg0.anInt1998 * 128;
		arg0.anInt1989 = 0;
		if (arg0.anInt1992 == 3) {
			arg0.anInt2023 = 512;
		}
		@Pc(73) int local73 = arg0.anInt2037 * 128 + arg0.anInt1994 * 64;
		arg0.anInt2011 += (local73 - arg0.anInt2011) / local27;
		arg0.anInt2006 += (local51 - arg0.anInt2006) / local27;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
	public static void method874() {
		aClass10Array1 = null;
		aClass31_450 = null;
		aClass31_449 = null;
		aByteArrayArrayArray17 = null;
		anIntArray172 = null;
		aClass31_448 = null;
		anIntArray171 = null;
		aClass31_451 = null;
		aClass31_447 = null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!bb;B)Z")
	public static boolean method875(@OriginalArg(0) Class2_Sub1_Sub2 arg0) {
		@Pc(6) int local6 = arg0.anInt278;
		if (Static16.anInt767 == 2) {
			if (local6 == 201) {
				Static49.anInt2692 = 0;
				Static2.aBoolean8 = true;
				Static27.aBoolean65 = true;
				Static39.aClass31_542 = Static39.aClass31_531;
				Static46.anInt1612 = 1;
				Static39.aClass31_537 = Static18.aClass31_264;
			}
			if (local6 == 202) {
				Static39.aClass31_542 = Static39.aClass31_531;
				Static46.anInt1612 = 2;
				Static2.aBoolean8 = true;
				Static39.aClass31_537 = Static15.aClass31_199;
				Static27.aBoolean65 = true;
				Static49.anInt2692 = 0;
			}
		}
		if (local6 == 205) {
			Static40.anInt2035 = 250;
			return true;
		}
		if (local6 == 501) {
			Static2.aBoolean8 = true;
			Static49.anInt2692 = 0;
			Static27.aBoolean65 = true;
			Static39.aClass31_537 = Static44.aClass31_580;
			Static46.anInt1612 = 4;
			Static39.aClass31_542 = Static39.aClass31_531;
		}
		if (local6 == 502) {
			Static39.aClass31_537 = Static39.aClass31_533;
			Static46.anInt1612 = 5;
			Static27.aBoolean65 = true;
			Static39.aClass31_542 = Static39.aClass31_531;
			Static2.aBoolean8 = true;
			Static49.anInt2692 = 0;
		}
		@Pc(104) int local104;
		@Pc(108) int local108;
		if (local6 >= 300 && local6 <= 313) {
			local104 = (local6 - 300) / 2;
			local108 = local6 & 0x1;
			Static80.aClass4_2.method103(local104, local108 == 1);
		}
		if (local6 >= 314 && local6 <= 323) {
			local104 = (local6 - 314) / 2;
			local108 = local6 & 0x1;
			Static80.aClass4_2.method93(local108 == 1, local104);
		}
		if (local6 == 324) {
			Static80.aClass4_2.method99(false);
		}
		if (local6 == 325) {
			Static80.aClass4_2.method99(true);
		}
		if (local6 == 326) {
			Static20.aClass2_Sub6_Sub1_11.method684(12);
			Static80.aClass4_2.method97(Static20.aClass2_Sub6_Sub1_11);
			return true;
		}
		if (local6 == 620) {
			Static77.aBoolean118 = !Static77.aBoolean118;
		}
		if (local6 >= 601 && local6 <= 613) {
			Static82.method1447();
			if (Static39.aClass31_541.method1223() > 0) {
				Static20.aClass2_Sub6_Sub1_11.method684(72);
				Static20.aClass2_Sub6_Sub1_11.method626(Static39.aClass31_541.method1201());
				Static20.aClass2_Sub6_Sub1_11.method637(local6 - 601);
				Static20.aClass2_Sub6_Sub1_11.method637(Static77.aBoolean118 ? 1 : 0);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILclient!bb;)V")
	public static void method876(@OriginalArg(1) Class2_Sub1_Sub2 arg0) {
		@Pc(4) int local4 = arg0.anInt278;
		@Pc(64) int local64;
		if (local4 >= 1 && local4 <= 100 || local4 >= 701 && local4 <= 800) {
			if (local4 == 1 && Static16.anInt767 == 0) {
				arg0.aClass31_94 = Static57.aClass31_925;
				arg0.anInt257 = 0;
			} else if (local4 == 1 && Static16.anInt767 == 1) {
				arg0.anInt257 = 0;
				arg0.aClass31_94 = Static60.aClass31_722;
			} else if (local4 == 2 && Static16.anInt767 != 2) {
				arg0.aClass31_94 = Static54.aClass31_641;
				arg0.anInt257 = 0;
			} else {
				local64 = anInt1312;
				if (Static16.anInt767 != 2) {
					local64 = 0;
				}
				if (local4 <= 700) {
					local4--;
				} else {
					local4 -= 601;
				}
				if (local64 <= local4) {
					arg0.anInt257 = 0;
					arg0.aClass31_94 = Static39.aClass31_531;
				} else {
					arg0.aClass31_94 = Static51.aClass31Array7[local4];
					arg0.anInt257 = 1;
				}
			}
		} else if (local4 >= 101 && local4 <= 200 || !(local4 < 801 || local4 > 900)) {
			if (local4 > 800) {
				local4 -= 701;
			} else {
				local4 -= 101;
			}
			local64 = anInt1312;
			if (Static16.anInt767 != 2) {
				local64 = 0;
			}
			if (local4 >= local64) {
				arg0.aClass31_94 = Static39.aClass31_531;
				arg0.anInt257 = 0;
			} else {
				if (Static41.anIntArray246[local4] == 0) {
					arg0.aClass31_94 = Static27.aClass31_380;
				} else if (Static41.anIntArray246[local4] < 5000) {
					if (Static41.anIntArray246[local4] == Static2.anInt100) {
						arg0.aClass31_94 = Static37.method974(new Class31[] { Static17.aClass31_263, Static89.method1499(Static41.anIntArray246[local4]) });
					} else {
						arg0.aClass31_94 = Static37.method974(new Class31[] { Static17.aClass31_262, Static89.method1499(Static41.anIntArray246[local4]) });
					}
				} else if (Static41.anIntArray246[local4] == Static2.anInt100) {
					arg0.aClass31_94 = Static37.method974(new Class31[] { Static65.aClass31_759, Static89.method1499(Static41.anIntArray246[local4] - 5000) });
				} else {
					arg0.aClass31_94 = Static37.method974(new Class31[] { Static31.aClass31_440, Static89.method1499(Static41.anIntArray246[local4] - 5000) });
				}
				arg0.anInt257 = 1;
			}
		} else if (local4 == 203) {
			local64 = anInt1312;
			if (Static16.anInt767 != 2) {
				local64 = 0;
			}
			arg0.anInt275 = local64 * 15 + 20;
			if (arg0.anInt275 <= arg0.anInt248) {
				arg0.anInt275 = arg0.anInt248 + 1;
			}
		} else if (local4 >= 401 && local4 <= 500) {
			local4 -= 401;
			if (local4 == 0 && Static16.anInt767 == 0) {
				arg0.anInt257 = 0;
				arg0.aClass31_94 = Static82.aClass31_800;
			} else if (local4 == 1 && Static16.anInt767 == 0) {
				arg0.aClass31_94 = Static54.aClass31_641;
				arg0.anInt257 = 0;
			} else {
				local64 = Static88.anInt2367;
				if (Static16.anInt767 == 0) {
					local64 = 0;
				}
				if (local4 >= local64) {
					arg0.anInt257 = 0;
					arg0.aClass31_94 = Static39.aClass31_531;
				} else {
					arg0.aClass31_94 = Static39.method1010(Static16.aLongArray2[local4]).method1196();
					arg0.anInt257 = 1;
				}
			}
		} else if (local4 == 503) {
			arg0.anInt275 = Static88.anInt2367 * 15 + 20;
			if (arg0.anInt248 >= arg0.anInt275) {
				arg0.anInt275 = arg0.anInt248 + 1;
			}
		} else if (local4 == 327) {
			arg0.anInt236 = 150;
			arg0.anInt273 = (int) (Math.sin((double) Static49.anInt2694 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt271 = 0;
			arg0.anInt252 = 5;
		} else if (local4 == 324) {
			if (Static41.anInt1580 == -1) {
				Static70.anInt2225 = arg0.anInt261;
				Static41.anInt1580 = arg0.anInt233;
			}
			if (Static80.aClass4_2.aBoolean10) {
				arg0.anInt233 = Static41.anInt1580;
			} else {
				arg0.anInt233 = Static70.anInt2225;
			}
		} else if (local4 == 325) {
			if (Static41.anInt1580 == -1) {
				Static70.anInt2225 = arg0.anInt261;
				Static41.anInt1580 = arg0.anInt233;
			}
			if (Static80.aClass4_2.aBoolean10) {
				arg0.anInt233 = Static70.anInt2225;
			} else {
				arg0.anInt233 = Static41.anInt1580;
			}
		} else if (local4 == 600) {
			arg0.aClass31_94 = Static39.aClass31_541;
			if (Static49.anInt2694 % 20 < 10) {
				arg0.aClass31_94 = arg0.aClass31_94.method1205(124);
			} else {
				arg0.aClass31_94 = arg0.aClass31_94.method1205(32);
			}
		} else {
			if (local4 == 620) {
				if (Static67.anInt2204 < 1) {
					arg0.aClass31_94 = Static39.aClass31_531;
				} else if (Static77.aBoolean118) {
					arg0.aClass31_94 = Static28.aClass31_386;
					arg0.anInt276 = 16711680;
				} else {
					arg0.anInt276 = 16777215;
					arg0.aClass31_94 = Static47.aClass31_615;
				}
			}
			@Pc(543) Class31 local543;
			if (local4 == 660) {
				local64 = Static40.anInt2026 - Static8.anInt305;
				if (local64 <= 0) {
					local543 = Static106.aClass31_955;
				} else if (local64 == 1) {
					local543 = Static15.aClass31_201;
				} else {
					local543 = Static37.method974(new Class31[] { Static89.method1499(local64), Static92.aClass31_567 });
				}
				@Pc(569) Class31 local569 = Static39.aClass31_531;
				if (Static76.aClass59_5 != null) {
					local569 = Static19.method557(Static76.aClass59_5.anInt2609);
					try {
						if (Static76.aClass59_5.anObject5 != null) {
							@Pc(585) byte[] local585 = ((String) Static76.aClass59_5.anObject5).getBytes("ISO-8859-1");
							local569 = Static49.method1697(local585.length, local585, 0);
						}
					} catch (@Pc(594) UnsupportedEncodingException local594) {
					}
				}
				arg0.aClass31_94 = Static37.method974(new Class31[] { Static12.aClass31_169, local543, Static69.aClass31_770, local569 });
			}
			if (local4 == 661) {
				if (Static96.anInt2605 == 0) {
					arg0.aClass31_94 = Static14.aClass31_191;
				} else if (Static40.anInt2026 < Static96.anInt2605) {
					local64 = Static40.anInt2026 + 14 - Static96.anInt2605;
					if (local64 <= 0) {
						local543 = Static87.aClass31_817;
					} else if (local64 == 1) {
						local543 = Static62.aClass31_741;
					} else {
						local543 = Static37.method974(new Class31[] { Static89.method1499(local64), Static92.aClass31_567 });
					}
					arg0.aClass31_94 = Static37.method974(new Class31[] { local543, Static57.aClass31_930, Static63.method1324(Static96.anInt2605), Static30.aClass31_426 });
				} else {
					arg0.aClass31_94 = Static37.method974(new Class31[] { Static79.aClass31_797, Static63.method1324(Static96.anInt2605) });
				}
			}
			if (local4 == 662) {
				@Pc(724) Class31 local724;
				if (Static50.anInt475 == 0) {
					local724 = Static95.aClass31_888;
				} else if (Static50.anInt475 == 1) {
					local724 = Static24.aClass31_342;
				} else {
					local724 = Static37.method974(new Class31[] { Static83.aClass31_808, Static89.method1499(Static50.anInt475), Static15.aClass31_195 });
				}
				arg0.aClass31_94 = Static37.method974(new Class31[] { Static18.aClass31_266, local724, Static79.aClass31_794 });
			}
			if (local4 == 663) {
				if (Static23.anInt1025 > 0 && Static40.anInt2026 + 10 >= Static23.anInt1025) {
					arg0.aClass31_94 = Static37.method974(new Class31[] { Static93.aClass31_873, Static63.method1324(Static23.anInt1025) });
				} else {
					arg0.aClass31_94 = Static7.aClass31_99;
				}
			}
			if (local4 == 664) {
				if (Static101.anInt2750 == 0) {
					arg0.aClass31_94 = Static54.aClass31_645;
				}
				if (Static101.anInt2750 == 1) {
					arg0.aClass31_94 = Static37.method974(new Class31[] { Static70.aClass31_774, Static63.method1324(Static100.anInt2726) });
				}
				if (Static101.anInt2750 == 2) {
					arg0.aClass31_94 = Static98.aClass31_395;
				}
			}
			if (local4 == 665) {
				if (Static30.anInt1257 > 2 && !Static62.aBoolean108) {
					arg0.aClass31_94 = Static51.aClass31_632;
				} else if (Static30.anInt1257 > 2) {
					arg0.aClass31_94 = Static37.method974(new Class31[] { Static68.aClass31_768, Static89.method1499(Static30.anInt1257), Static47.aClass31_614 });
				} else if (Static30.anInt1257 <= 0) {
					arg0.aClass31_94 = Static64.aClass31_190;
				} else {
					arg0.aClass31_94 = Static37.method974(new Class31[] { Static82.aClass31_802, Static89.method1499(Static30.anInt1257), Static23.aClass31_324 });
				}
			}
			if (local4 == 667) {
				if (Static30.anInt1257 > 2 && !Static62.aBoolean108) {
					arg0.aClass31_94 = Static10.aClass31_133;
				} else if (Static30.anInt1257 > 0) {
					arg0.aClass31_94 = Static38.aClass31_519;
				} else {
					arg0.aClass31_94 = Static15.aClass31_198;
				}
			}
			if (local4 == 668) {
				if (Static96.anInt2605 > Static40.anInt2026) {
					arg0.aClass31_94 = Static56.aClass31_669;
				} else {
					arg0.aClass31_94 = Static95.aClass31_887;
				}
			}
		}
	}
}
