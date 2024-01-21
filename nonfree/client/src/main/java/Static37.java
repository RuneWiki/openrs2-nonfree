import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!h", name = "q", descriptor = "[Lclient!sc;")
	public static Class5_Sub2_Sub6_Sub4[] aClass5_Sub2_Sub6_Sub4Array3;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "[Z")
	public static boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!h", name = "c", descriptor = "Lclient!mb;")
	public static Class45 aClass45_497 = Static63.method1251("Mitteilung");

	@OriginalMember(owner = "client!h", name = "d", descriptor = "I")
	public static volatile int anInt1076 = 0;

	@OriginalMember(owner = "client!h", name = "e", descriptor = "Lclient!mb;")
	public static Class45 aClass45_498 = Static63.method1251("Sprites geladen)3");

	@OriginalMember(owner = "client!h", name = "i", descriptor = "[Lclient!mb;")
	public static Class45[] aClass45Array11 = new Class45[100];

	@OriginalMember(owner = "client!h", name = "j", descriptor = "Z")
	public static boolean aBoolean55 = false;

	@OriginalMember(owner = "client!h", name = "k", descriptor = "Lclient!mb;")
	public static Class45 aClass45_499 = Static63.method1251("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!h", name = "l", descriptor = "I")
	public static int anInt1080 = 127;

	@OriginalMember(owner = "client!h", name = "o", descriptor = "Lclient!mb;")
	private static Class45 aClass45_501 = Static63.method1251("Report abuse");

	@OriginalMember(owner = "client!h", name = "n", descriptor = "Lclient!mb;")
	public static Class45 aClass45_500 = aClass45_501;

	@OriginalMember(owner = "client!h", name = "r", descriptor = "Lclient!mb;")
	public static Class45 aClass45_502 = Static63.method1251("chatback");

	@OriginalMember(owner = "client!h", name = "t", descriptor = "Lclient!mb;")
	public static Class45 aClass45_503 = Static63.method1251("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	public static void method788() {
		if (Static96.anInt2617 != 0) {
			return;
		}
		Static2.anIntArray5[0] = 1003;
		Static35.aClass45Array10[0] = Static16.aClass45_226;
		Static14.anInt426 = 1;
		if (Static101.anInt1036 != -1) {
			Static50.anInt1601 = -1;
			Static47.anInt1348 = -1;
			Static30.method309(Static47.anInt1354, Static14.anInt425, 0, 0, 503, 0, Static101.anInt1036, 765);
			Static120.anInt3126 = Static47.anInt1348;
			Static27.anInt858 = Static50.anInt1601;
			return;
		}
		@Pc(48) boolean local48 = false;
		Static100.method1842();
		Static50.anInt1601 = -1;
		Static47.anInt1348 = -1;
		if (Static14.anInt425 > 4 && Static47.anInt1354 > 4 && Static14.anInt425 < 516 && Static47.anInt1354 < 338) {
			if (Static63.anInt1837 == -1) {
				Static53.method1607();
			} else {
				Static30.method309(Static47.anInt1354, Static14.anInt425, 4, 0, 338, 4, Static63.anInt1837, 516);
			}
		}
		Static27.anInt858 = Static50.anInt1601;
		Static50.anInt1601 = -1;
		Static120.anInt3126 = Static47.anInt1348;
		Static47.anInt1348 = -1;
		if (Static14.anInt425 > 553 && Static47.anInt1354 > 205 && Static14.anInt425 < 743 && Static47.anInt1354 < 466) {
			if (Static72.anInt2162 != -1) {
				Static30.method309(Static47.anInt1354, Static14.anInt425, 205, 1, 466, 553, Static72.anInt2162, 743);
			} else if (Static57.anIntArray262[Static53.anInt2372] != -1) {
				Static30.method309(Static47.anInt1354, Static14.anInt425, 205, 1, 466, 553, Static57.anIntArray262[Static53.anInt2372], 743);
			}
		}
		if (Static47.anInt1348 != Static98.anInt2649) {
			Static98.anInt2649 = Static47.anInt1348;
			Static72.aBoolean99 = true;
		}
		if (Static32.anInt943 != Static50.anInt1601) {
			Static72.aBoolean99 = true;
			Static32.anInt943 = Static50.anInt1601;
		}
		Static47.anInt1348 = -1;
		Static50.anInt1601 = -1;
		if (Static14.anInt425 > 17 && Static47.anInt1354 > 357 && Static14.anInt425 < 496 && Static47.anInt1354 < 453) {
			if (Static67.anInt1909 != -1) {
				Static30.method309(Static47.anInt1354, Static14.anInt425, 357, 2, 453, 17, Static67.anInt1909, 496);
			} else if (Static100.anInt2693 != -1) {
				Static30.method309(Static47.anInt1354, Static14.anInt425, 357, 3, 453, 17, Static100.anInt2693, 496);
			} else if (Static47.anInt1354 < 434 && Static14.anInt425 < 426) {
				Static3.method64(Static14.anInt425 - 17, Static47.anInt1354 + -357);
			}
		}
		if ((Static67.anInt1909 != -1 || Static100.anInt2693 != -1) && Static47.anInt1348 != Static32.anInt942) {
			Static51.aBoolean81 = true;
			Static32.anInt942 = Static47.anInt1348;
		}
		if ((Static67.anInt1909 != -1 || Static100.anInt2693 != -1) && Static111.anInt2905 != Static50.anInt1601) {
			Static111.anInt2905 = Static50.anInt1601;
			Static51.aBoolean81 = true;
		}
		while (!local48) {
			local48 = true;
			for (@Pc(267) int local267 = 0; local267 < Static14.anInt426 - 1; local267++) {
				if (Static2.anIntArray5[local267] < 1000 && Static2.anIntArray5[local267 + 1] > 1000) {
					local48 = false;
					@Pc(288) Class45 local288 = Static35.aClass45Array10[local267];
					Static35.aClass45Array10[local267] = Static35.aClass45Array10[local267 + 1];
					Static35.aClass45Array10[local267 + 1] = local288;
					@Pc(306) int local306 = Static2.anIntArray5[local267];
					Static2.anIntArray5[local267] = Static2.anIntArray5[local267 + 1];
					Static2.anIntArray5[local267 + 1] = local306;
					@Pc(324) int local324 = Static16.anIntArray69[local267];
					Static16.anIntArray69[local267] = Static16.anIntArray69[local267 + 1];
					Static16.anIntArray69[local267 + 1] = local324;
					@Pc(342) int local342 = Static35.anIntArray163[local267];
					Static35.anIntArray163[local267] = Static35.anIntArray163[local267 + 1];
					Static35.anIntArray163[local267 + 1] = local342;
					@Pc(360) int local360 = Static102.anIntArray419[local267];
					Static102.anIntArray419[local267] = Static102.anIntArray419[local267 + 1];
					Static102.anIntArray419[local267 + 1] = local360;
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([BI)[B")
	public static byte[] method789(@OriginalArg(0) byte[] arg0) {
		@Pc(7) int local7 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local7];
		Static127.method878(arg0, 0, local14, 0, local7);
		return local14;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method790(@OriginalArg(1) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static102.anInt2744 > 0) {
			local21 = Static110.aByteArrayArray9[--Static102.anInt2744];
			Static110.aByteArrayArray9[Static102.anInt2744] = null;
			return local21;
		} else if (arg0 == 5000 && Static35.anInt968 > 0) {
			local21 = Static63.aByteArrayArray6[--Static35.anInt968];
			Static63.aByteArrayArray6[Static35.anInt968] = null;
			return local21;
		} else if (arg0 == 30000 && Static121.anInt2398 > 0) {
			local21 = Static54.aByteArrayArray5[--Static121.anInt2398];
			Static54.aByteArrayArray5[Static121.anInt2398] = null;
			return local21;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIB)I")
	public static int method791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(II)V")
	public static void method792(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !Static61.aBoolean88) {
			Static77.method1482();
		} else if (arg0 != -1 && Static73.anInt2169 != arg0 && Static107.anInt2807 != 0 && !Static61.aBoolean88) {
			Static59.method1212(Static21.aClass29_Sub1_11, arg0, Static107.anInt2807, 0);
		}
		Static73.anInt2169 = arg0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIBLclient!ve;)V")
	public static void method793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class5_Sub2_Sub17 arg3) {
		if (Static14.anInt426 >= 400) {
			return;
		}
		if (arg3.anIntArray479 != null) {
			arg3 = arg3.method2122();
		}
		if (arg3 == null || !arg3.aBoolean133) {
			return;
		}
		@Pc(31) Class45 local31 = arg3.aClass45_1342;
		if (arg3.anInt3056 != 0) {
			local31 = Static39.method1443(new Class45[] { local31, Static70.method1359(arg3.anInt3056, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt1569), Static61.aClass45_762, Static44.aClass45_546, Static76.method1476(arg3.anInt3056), Static98.aClass45_1123 });
		}
		if (Static16.anInt502 == 1) {
			Static108.method1945(arg0, 5, Static39.method1443(new Class45[] { Static12.aClass45_1357, Static92.aClass45_1333, local31 }), arg1, arg2, Static117.aClass45_1345);
		} else if (!Static13.aBoolean12) {
			@Pc(125) Class45[] local125 = arg3.aClass45Array19;
			if (Static23.aBoolean34) {
				local125 = Static119.method2136(local125);
			}
			@Pc(135) int local135;
			if (local125 != null) {
				for (local135 = 4; local135 >= 0; local135--) {
					if (local125[local135] != null && !local125[local135].method1330(Static25.aClass45_387)) {
						@Pc(153) byte local153 = 0;
						if (local135 == 0) {
							local153 = 12;
						}
						if (local135 == 1) {
							local153 = 14;
						}
						if (local135 == 2) {
							local153 = 57;
						}
						if (local135 == 3) {
							local153 = 2;
						}
						if (local135 == 4) {
							local153 = 18;
						}
						Static108.method1945(arg0, local153, Static39.method1443(new Class45[] { Static79.aClass45_946, local31 }), arg1, arg2, local125[local135]);
					}
				}
			}
			if (local125 != null) {
				for (local135 = 4; local135 >= 0; local135--) {
					if (local125[local135] != null && local125[local135].method1330(Static25.aClass45_387)) {
						@Pc(230) int local230 = 0;
						@Pc(232) short local232 = 0;
						if (arg3.anInt3056 > Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt1569) {
							local232 = 2000;
						}
						if (local135 == 0) {
							local230 = local232 + 12;
						}
						if (local135 == 1) {
							local230 = local232 + 14;
						}
						if (local135 == 2) {
							local230 = local232 + 57;
						}
						if (local135 == 3) {
							local230 = local232 + 2;
						}
						if (local135 == 4) {
							local230 = local232 + 18;
						}
						Static108.method1945(arg0, local230, Static39.method1443(new Class45[] { Static79.aClass45_946, local31 }), arg1, arg2, local125[local135]);
					}
				}
			}
			Static108.method1945(arg0, 1001, Static39.method1443(new Class45[] { Static79.aClass45_946, local31 }), arg1, arg2, Static6.aClass45_77);
		} else if ((Static101.anInt1044 & 0x2) == 2) {
			Static108.method1945(arg0, 27, Static39.method1443(new Class45[] { Static3.aClass45_32, Static92.aClass45_1333, local31 }), arg1, arg2, Static31.aClass45_445);
			return;
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
	public static void method794() {
		aClass5_Sub2_Sub6_Sub4Array3 = null;
		aClass45_498 = null;
		aClass45_500 = null;
		aClass45_497 = null;
		aClass45_499 = null;
		aClass45Array11 = null;
		aClass45_503 = null;
		aBooleanArray11 = null;
		aClass45_501 = null;
		aClass45_502 = null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)I")
	public static int method795(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(6) int local6 = arg4;
			arg4 = arg1;
			arg1 = local6;
		}
		@Pc(19) int local19 = arg0 & 0x3;
		if (local19 == 0) {
			return arg3;
		} else if (local19 == 1) {
			return arg2;
		} else if (local19 == 2) {
			return 7 + 1 - arg3 - arg4;
		} else {
			return 7 + 1 - arg2 - arg1;
		}
	}
}
