import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!o", name = "Jb", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!o", name = "mb", descriptor = "Lclient!fe;")
	public static Class2_Sub8 aClass2_Sub8_3 = new Class2_Sub8(8);

	@OriginalMember(owner = "client!o", name = "ob", descriptor = "I")
	public static int anInt2106 = 1;

	@OriginalMember(owner = "client!o", name = "Lb", descriptor = "Lclient!wb;")
	private static Class65 aClass65_975 = Static24.method441("red:");

	@OriginalMember(owner = "client!o", name = "pb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_973 = aClass65_975;

	@OriginalMember(owner = "client!o", name = "Db", descriptor = "Lclient!wb;")
	public static Class65 aClass65_974 = Static24.method441(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!o", name = "Nb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_976 = Static24.method441("titlebutton");

	@OriginalMember(owner = "client!o", name = "Vb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_977 = Static24.method441("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!o", name = "Wb", descriptor = "[Z")
	public static boolean[] aBooleanArray20 = new boolean[5];

	@OriginalMember(owner = "client!o", name = "Xb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_978 = Static24.method441("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!o", name = "f", descriptor = "(I)V")
	public static void method1258() {
		aClass65_977 = null;
		aClass65_973 = null;
		aBooleanArray20 = null;
		aClass65_974 = null;
		aClass2_Sub8_3 = null;
		aClass65_975 = null;
		aCanvas1 = null;
		aClass65_976 = null;
		aClass65_978 = null;
	}

	@OriginalMember(owner = "client!o", name = "g", descriptor = "(I)V")
	public static void method1259() {
		if (Static94.aString4.toLowerCase().indexOf("microsoft") != -1) {
			Static62.anIntArray255[186] = 57;
			Static62.anIntArray255[187] = 27;
			Static62.anIntArray255[188] = 71;
			Static62.anIntArray255[189] = 26;
			Static62.anIntArray255[190] = 72;
			Static62.anIntArray255[191] = 73;
			Static62.anIntArray255[192] = 58;
			Static62.anIntArray255[219] = 42;
			Static62.anIntArray255[220] = 74;
			Static62.anIntArray255[221] = 43;
			Static62.anIntArray255[222] = 59;
			Static62.anIntArray255[223] = 28;
			return;
		}
		Static62.anIntArray255[44] = 71;
		Static62.anIntArray255[45] = 26;
		Static62.anIntArray255[46] = 72;
		Static62.anIntArray255[47] = 73;
		Static62.anIntArray255[59] = 57;
		Static62.anIntArray255[61] = 27;
		Static62.anIntArray255[91] = 42;
		Static62.anIntArray255[92] = 74;
		Static62.anIntArray255[93] = 43;
		if (Static94.aMethod2 == null) {
			Static62.anIntArray255[192] = 58;
			Static62.anIntArray255[222] = 59;
		} else {
			Static62.anIntArray255[192] = 28;
			Static62.anIntArray255[222] = 58;
			Static62.anIntArray255[520] = 59;
		}
	}

	@OriginalMember(owner = "client!o", name = "h", descriptor = "(I)V")
	public static void method1260() {
		Static7.aClass15_9.method1098();
		Static96.anIntArray394 = Static10.method243(Static96.anIntArray394);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)Lclient!la;")
	public static Class2_Sub1_Sub8 method1263(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub1_Sub8 local8 = (Class2_Sub1_Sub8) Static48.aClass21_18.method744((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(22) byte[] local22 = Static57.aClass33_28.method1150(arg0, 10);
		local8 = new Class2_Sub1_Sub8();
		local8.anInt1822 = arg0;
		if (local22 != null) {
			local8.method1071(new Class2_Sub8(local22));
		}
		local8.method1074();
		if (local8.anInt1809 != -1) {
			local8.method1075(method1263(local8.anInt1809), method1263(local8.anInt1838));
		}
		if (!Static83.aBoolean121 && local8.aBoolean97) {
			local8.aClass65Array6 = null;
			local8.anInt1824 = 0;
			local8.aClass65Array8 = null;
			local8.aClass65_820 = Static42.aClass65_598;
		}
		Static48.aClass21_18.method745((long) arg0, local8);
		return local8;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V")
	public static void method1266(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static39.aBooleanArray11[arg0]) {
			return;
		}
		Static21.aClass33_40.method1143(arg0);
		if (Static89.aClass2_Sub1_Sub2ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(27) boolean local27 = true;
		for (@Pc(29) int local29 = 0; local29 < Static89.aClass2_Sub1_Sub2ArrayArray1[arg0].length; local29++) {
			if (Static89.aClass2_Sub1_Sub2ArrayArray1[arg0][local29] != null) {
				if (Static89.aClass2_Sub1_Sub2ArrayArray1[arg0][local29].anInt179 == 2) {
					local27 = false;
				} else {
					Static89.aClass2_Sub1_Sub2ArrayArray1[arg0][local29] = null;
				}
			}
		}
		if (local27) {
			Static89.aClass2_Sub1_Sub2ArrayArray1[arg0] = null;
		}
		Static39.aBooleanArray11[arg0] = false;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!k;BLclient!k;)V")
	public static void method1267(@OriginalArg(0) Class33 arg0, @OriginalArg(2) Class33 arg1) {
		Static99.aClass33_41 = arg0;
		Static21.aClass33_39 = arg1;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIBI)Lclient!ec;")
	public static Class2_Sub1_Sub4_Sub2 method1271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class2_Sub1_Sub4_Sub2 local17;
		if (arg2 == 0) {
			local17 = (Class2_Sub1_Sub4_Sub2) Static63.aClass21_27.method744((long) arg1);
			if (local17 != null && arg0 != local17.anInt763 && local17.anInt763 != -1) {
				local17.method1794();
				local17 = null;
			}
			if (local17 != null) {
				return local17;
			}
		}
		@Pc(41) Class2_Sub1_Sub8 local41 = method1263(arg1);
		if (local41.anIntArray243 == null) {
			arg0 = -1;
		}
		if (arg0 > 1) {
			@Pc(53) int local53 = -1;
			for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
				if (arg0 >= local41.anIntArray242[local55] && local41.anIntArray242[local55] != 0) {
					local53 = local41.anIntArray243[local55];
				}
			}
			if (local53 != -1) {
				local41 = method1263(local53);
			}
		}
		@Pc(96) Class2_Sub1_Sub1_Sub6 local96 = local41.method1073(true, 1);
		if (local96 == null) {
			return null;
		}
		@Pc(102) Class2_Sub1_Sub4_Sub2 local102 = null;
		if (local41.anInt1809 != -1) {
			local102 = method1271(10, local41.anInt1838, -1);
			if (local102 == null) {
				return null;
			}
		}
		@Pc(120) int local120 = Static43.anInt2925;
		@Pc(122) int[] local122 = Static43.anIntArray417;
		@Pc(124) int local124 = Static43.anInt2930;
		@Pc(126) int local126 = Static43.anInt2927;
		@Pc(128) int local128 = Static43.anInt2928;
		@Pc(130) int local130 = Static43.anInt2926;
		@Pc(132) int local132 = Static43.anInt2929;
		@Pc(134) int[] local134 = Static10.method255();
		@Pc(136) int local136 = Static10.anInt402;
		@Pc(138) int local138 = Static10.anInt404;
		local17 = new Class2_Sub1_Sub4_Sub2(32, 32);
		Static43.method1817(local17.anIntArray105, 32, 32);
		Static37.anIntArray159 = Static10.method243(Static37.anIntArray159);
		Static43.method1815(0, 0, 32, 32, 0);
		@Pc(161) int local161 = local41.anInt1808;
		Static10.aBoolean28 = false;
		if (arg2 == -1) {
			local161 = (int) ((double) local161 * 1.5D);
		}
		if (arg2 > 0) {
			local161 = (int) ((double) local161 * 1.04D);
		}
		@Pc(194) int local194 = Class2_Sub1_Sub4_Sub1.anIntArray55[local41.anInt1823] * local161 >> 16;
		@Pc(203) int local203 = local161 * Class2_Sub1_Sub4_Sub1.anIntArray56[local41.anInt1823] >> 16;
		local96.method1516();
		local96.method1530(local41.anInt1815, local41.anInt1812, local41.anInt1823, local41.anInt1821, local41.anInt1839 + local96.anInt2496 / 2 + local194, local41.anInt1839 + local203);
		for (@Pc(231) int local231 = 31; local231 >= 0; local231--) {
			for (local203 = 31; local203 >= 0; local203--) {
				if (local17.anIntArray105[local231 + local203 * 32] == 0) {
					if (local231 > 0 && local17.anIntArray105[local231 + local203 * 32 - 1] > 1) {
						local17.anIntArray105[local231 + local203 * 32] = 1;
					} else if (local203 > 0 && local17.anIntArray105[(local203 - 1) * 32 + local231] > 1) {
						local17.anIntArray105[local203 * 32 + local231] = 1;
					} else if (local231 < 31 && local17.anIntArray105[local231 + local203 * 32 + 1] > 1) {
						local17.anIntArray105[local231 + local203 * 32] = 1;
					} else if (local203 < 31 && local17.anIntArray105[local231 + local203 * 32 + 32] > 1) {
						local17.anIntArray105[local231 + local203 * 32] = 1;
					}
				}
			}
		}
		@Pc(370) int local370;
		if (arg2 > 0) {
			for (local370 = 31; local370 >= 0; local370--) {
				for (local203 = 31; local203 >= 0; local203--) {
					if (local17.anIntArray105[local203 * 32 + local370] == 0) {
						if (local370 > 0 && local17.anIntArray105[local203 * 32 + local370 - 1] == 1) {
							local17.anIntArray105[local370 + local203 * 32] = arg2;
						} else if (local203 > 0 && local17.anIntArray105[local370 + (local203 - 1) * 32] == 1) {
							local17.anIntArray105[local370 + local203 * 32] = arg2;
						} else if (local370 < 31 && local17.anIntArray105[local203 * 32 + local370 + 1] == 1) {
							local17.anIntArray105[local203 * 32 + local370] = arg2;
						} else if (local203 < 31 && local17.anIntArray105[local203 * 32 + local370 + 32] == 1) {
							local17.anIntArray105[local203 * 32 + local370] = arg2;
						}
					}
				}
			}
		} else if (arg2 == 0) {
			for (local370 = 31; local370 >= 0; local370--) {
				for (local203 = 31; local203 >= 0; local203--) {
					if (local17.anIntArray105[local203 * 32 + local370] == 0 && local370 > 0 && local203 > 0 && local17.anIntArray105[local203 * 32 + local370 - 32 - 1] > 0) {
						local17.anIntArray105[local203 * 32 + local370] = 3153952;
					}
				}
			}
		}
		if (local41.anInt1809 != -1) {
			@Pc(583) int local583 = local102.anInt763;
			local370 = local102.anInt760;
			local102.anInt763 = 32;
			local102.anInt760 = 32;
			local102.method486(0, 0);
			local102.anInt760 = local370;
			local102.anInt763 = local583;
		}
		if (arg2 == 0) {
			Static63.aClass21_27.method745((long) arg1, local17);
		}
		Static43.method1817(local122, local120, local124);
		Static43.method1807(local126, local130, local128, local132);
		Static10.method243(local134);
		Static10.anInt402 = local136;
		Static10.anInt404 = local138;
		Static10.method254();
		local17.anInt763 = arg0;
		Static10.aBoolean28 = true;
		if (local41.anInt1820 == 1) {
			local17.anInt760 = 33;
		} else {
			local17.anInt760 = 32;
		}
		return local17;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIZZZ)Lclient!mc;")
	public static Class33_Sub1 method1272(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(1) Class5 local1 = null;
		if (Static41.aClass3_3 != null) {
			local1 = new Class5(arg0, Static41.aClass3_3, Static99.aClass3Array3[arg0], 1000000);
		}
		return new Class33_Sub1(local1, Static85.aClass5_4, arg0, arg3, arg2, arg1);
	}
}
