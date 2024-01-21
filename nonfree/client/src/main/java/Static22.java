import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!de", name = "s", descriptor = "Lclient!e;")
	public static Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_8;

	@OriginalMember(owner = "client!de", name = "v", descriptor = "[I")
	public static int[] anIntArray92;

	@OriginalMember(owner = "client!de", name = "c", descriptor = "I")
	public static int anInt921 = 1;

	@OriginalMember(owner = "client!de", name = "d", descriptor = "[I")
	public static int[] anIntArray91 = new int[25];

	@OriginalMember(owner = "client!de", name = "e", descriptor = "Lclient!a;")
	private static Class1 aClass1_852 = Static94.method1596("Enter name of friend to delete from list");

	@OriginalMember(owner = "client!de", name = "m", descriptor = "Lclient!a;")
	private static Class1 aClass1_855 = Static94.method1596("Loading friend list");

	@OriginalMember(owner = "client!de", name = "f", descriptor = "Lclient!a;")
	public static Class1 aClass1_853 = aClass1_855;

	@OriginalMember(owner = "client!de", name = "g", descriptor = "Lclient!cb;")
	public static Class11 aClass11_7 = new Class11(64);

	@OriginalMember(owner = "client!de", name = "l", descriptor = "Lclient!a;")
	public static Class1 aClass1_854 = Static94.method1596("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!de", name = "o", descriptor = "[Z")
	public static boolean[] aBooleanArray9 = new boolean[5];

	@OriginalMember(owner = "client!de", name = "r", descriptor = "Lclient!a;")
	public static Class1 aClass1_856 = aClass1_852;

	@OriginalMember(owner = "client!de", name = "t", descriptor = "I")
	public static int anInt929 = 2;

	@OriginalMember(owner = "client!de", name = "u", descriptor = "I")
	public static int anInt930 = 0;

	@OriginalMember(owner = "client!de", name = "w", descriptor = "Lclient!a;")
	public static Class1 aClass1_857 = Static94.method1596("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!nb;IB)V")
	public static void method601(@OriginalArg(0) Class2_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anInt2724 < 128 || arg0.anInt2717 < 128 || arg0.anInt2724 >= 13184 || arg0.anInt2717 >= 13184) {
			arg0.anInt2759 = -1;
			arg0.anInt2736 = 0;
			arg0.anInt2732 = 0;
			arg0.anInt2718 = -1;
			arg0.anInt2724 = arg0.anInt2722 * 64 + arg0.anIntArray341[0] * 128;
			arg0.anInt2717 = arg0.anIntArray343[0] * 128 + arg0.anInt2722 * 64;
			arg0.method1789();
		}
		if (arg0 == Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1 && (arg0.anInt2724 < 1536 || arg0.anInt2717 < 1536 || arg0.anInt2724 >= 11776 || arg0.anInt2717 >= 11776)) {
			arg0.anInt2718 = -1;
			arg0.anInt2732 = 0;
			arg0.anInt2736 = 0;
			arg0.anInt2759 = -1;
			arg0.anInt2724 = arg0.anIntArray341[0] * 128 + arg0.anInt2722 * 64;
			arg0.anInt2717 = arg0.anInt2722 * 64 + arg0.anIntArray343[0] * 128;
			arg0.method1789();
		}
		if (Static69.anInt2806 < arg0.anInt2736) {
			Static80.method1483(arg0);
		} else if (arg0.anInt2732 < Static69.anInt2806) {
			Static73.method1375(arg0);
		} else {
			Static57.method1247(arg0);
		}
		Static18.method523(arg0);
		Static95.method1612(arg0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
	public static void method602() {
		while (true) {
			@Pc(12) Class46 local12 = Static53.aClass46_4;
			@Pc(19) Class2_Sub7 local19;
			synchronized (Static53.aClass46_4) {
				local19 = (Class2_Sub7) Static79.aClass46_8.method1446();
			}
			if (local19 == null) {
				return;
			}
			local19.aClass8_Sub1_11.method1710(false, local19.aByteArray12, (int) local19.aLong96, local19.aClass57_2);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BIIIIIIII)V")
	public static void method603(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static113.method1524(arg3)) {
			Static81.method1492(arg2, Static98.aClass2_Sub1_Sub14ArrayArray1[arg3], arg4, 0, arg6, -1, arg7, arg5, arg0, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIII)I")
	public static int method604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 179) {
			arg0 /= 2;
		}
		if (arg1 > 192) {
			arg0 /= 2;
		}
		if (arg1 > 217) {
			arg0 /= 2;
		}
		if (arg1 > 243) {
			arg0 /= 2;
		}
		return arg1 / 2 + (arg0 / 32 << 7) + (arg2 / 4 << 10);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	public static void method605() {
		for (@Pc(3) int local3 = 0; local3 < Static67.anInt2767; local3++) {
			@Pc(9) int local9 = Static45.anIntArray156[local3];
			@Pc(13) Class2_Sub1_Sub1_Sub1_Sub2 local13 = Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local9];
			@Pc(17) int local17 = Static13.aClass2_Sub3_Sub1_1.method791();
			@Pc(28) int local28;
			@Pc(32) int local32;
			if ((local17 & 0x1) != 0) {
				local28 = Static13.aClass2_Sub3_Sub1_1.method799();
				local32 = Static13.aClass2_Sub3_Sub1_1.method803();
				local13.method1784(local32, Static69.anInt2806, local28);
				local13.anInt2757 = Static69.anInt2806 + 300;
				local13.anInt2751 = Static13.aClass2_Sub3_Sub1_1.method799();
				local13.anInt2727 = Static13.aClass2_Sub3_Sub1_1.method791();
			}
			if ((local17 & 0x20) != 0) {
				local13.anInt2718 = Static13.aClass2_Sub3_Sub1_1.method827();
				local28 = Static13.aClass2_Sub3_Sub1_1.method814();
				local13.anInt2750 = 0;
				local13.anInt2719 = Static69.anInt2806 + (local28 & 0xFFFF);
				local13.anInt2735 = local28 >> 16;
				local13.anInt2758 = 0;
				if (local13.anInt2719 > Static69.anInt2806) {
					local13.anInt2758 = -1;
				}
				if (local13.anInt2718 == 65535) {
					local13.anInt2718 = -1;
				}
			}
			if ((local17 & 0x4) != 0) {
				local13.anInt2756 = Static13.aClass2_Sub3_Sub1_1.method784();
				if (local13.anInt2756 == 65535) {
					local13.anInt2756 = -1;
				}
			}
			if ((local17 & 0x2) != 0) {
				local28 = Static13.aClass2_Sub3_Sub1_1.method799();
				local32 = Static13.aClass2_Sub3_Sub1_1.method791();
				local13.method1784(local32, Static69.anInt2806, local28);
				local13.anInt2757 = Static69.anInt2806 + 300;
				local13.anInt2751 = Static13.aClass2_Sub3_Sub1_1.method803();
				local13.anInt2727 = Static13.aClass2_Sub3_Sub1_1.method803();
			}
			if ((local17 & 0x40) != 0) {
				local13.aClass1_2863 = Static13.aClass2_Sub3_Sub1_1.method787();
				local13.anInt2709 = 100;
			}
			if ((local17 & 0x80) != 0) {
				local13.aClass2_Sub1_Sub7_1 = Static84.method1529(Static13.aClass2_Sub3_Sub1_1.method784());
				local13.anInt2714 = local13.aClass2_Sub1_Sub7_1.anInt1342;
				local13.anInt2737 = local13.aClass2_Sub1_Sub7_1.anInt1344;
				local13.anInt2706 = local13.aClass2_Sub1_Sub7_1.anInt1359;
				local13.anInt2747 = local13.aClass2_Sub1_Sub7_1.anInt1339;
				local13.anInt2752 = local13.aClass2_Sub1_Sub7_1.anInt1365;
				local13.anInt2762 = local13.aClass2_Sub1_Sub7_1.anInt1362;
				local13.anInt2722 = local13.aClass2_Sub1_Sub7_1.anInt1335;
				local13.anInt2753 = local13.aClass2_Sub1_Sub7_1.anInt1356;
				local13.anInt2710 = local13.aClass2_Sub1_Sub7_1.anInt1351;
			}
			if ((local17 & 0x8) != 0) {
				local13.anInt2765 = Static13.aClass2_Sub3_Sub1_1.method784();
				local13.anInt2726 = Static13.aClass2_Sub3_Sub1_1.method813();
			}
			if ((local17 & 0x10) != 0) {
				local28 = Static13.aClass2_Sub3_Sub1_1.method784();
				if (local28 == 65535) {
					local28 = -1;
				}
				local32 = Static13.aClass2_Sub3_Sub1_1.method794();
				if (local28 == local13.anInt2759 && local28 != -1) {
					@Pc(271) int local271 = Static4.method192(local28).anInt1436;
					if (local271 == 1) {
						local13.anInt2738 = 0;
						local13.anInt2721 = 0;
						local13.anInt2730 = 0;
						local13.anInt2744 = local32;
					}
					if (local271 == 2) {
						local13.anInt2721 = 0;
					}
				} else if (local28 == -1 || local13.anInt2759 == -1 || Static4.method192(local28).anInt1442 >= Static4.method192(local13.anInt2759).anInt1442) {
					local13.anInt2759 = local28;
					local13.anInt2738 = 0;
					local13.anInt2744 = local32;
					local13.anInt2730 = 0;
					local13.anInt2721 = 0;
					local13.anInt2720 = local13.anInt2734;
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method606(@OriginalArg(1) int arg0) {
		@Pc(16) byte[] local16;
		if (arg0 == 100 && Static15.anInt696 > 0) {
			local16 = Static94.aByteArrayArray9[--Static15.anInt696];
			Static94.aByteArrayArray9[Static15.anInt696] = null;
			return local16;
		} else if (arg0 == 5000 && Static17.anInt775 > 0) {
			local16 = Static73.aByteArrayArray6[--Static17.anInt775];
			Static73.aByteArrayArray6[Static17.anInt775] = null;
			return local16;
		} else if (arg0 == 30000 && Static30.anInt1128 > 0) {
			local16 = Static53.aByteArrayArray4[--Static30.anInt1128];
			Static53.aByteArrayArray4[Static30.anInt1128] = null;
			return local16;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!qd;B)[I")
	public static int[] method607(@OriginalArg(0) Class2_Sub1_Sub14 arg0) {
		@Pc(14) int local14;
		if (arg0.anInt2194 < 0) {
			local14 = arg0.anInt2174 >> 16;
		} else {
			local14 = arg0.anInt2194 >> 16;
		}
		if (!Static113.method1524(local14)) {
			return null;
		}
		@Pc(34) int local34 = arg0.anInt2180;
		@Pc(37) int local37 = arg0.anInt2197;
		@Pc(40) int local40 = arg0.anInt2174;
		while (local40 != -1) {
			@Pc(50) Class2_Sub1_Sub14 local50 = Static98.aClass2_Sub1_Sub14ArrayArray1[local14][local40 & 0xFFFF];
			local34 += local50.anInt2180;
			if (!arg0.aBoolean128) {
				local34 -= local50.anInt2228;
			}
			local37 += local50.anInt2197;
			local40 = local50.anInt2174;
			if (!arg0.aBoolean128) {
				local37 -= local50.anInt2215;
			}
		}
		return new int[] { local34, local37 };
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
	public static void method608() {
		anIntArray92 = null;
		aClass1_857 = null;
		aClass1_852 = null;
		aClass2_Sub1_Sub2_Sub2_8 = null;
		aClass1_853 = null;
		aClass1_854 = null;
		aClass1_856 = null;
		anIntArray91 = null;
		aBooleanArray9 = null;
		aClass11_7 = null;
		aClass1_855 = null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
	public static void method609() {
		if (Static48.aClass63_1 != null) {
			@Pc(12) Class63 local12 = Static48.aClass63_1;
			synchronized (Static48.aClass63_1) {
				Static48.aClass63_1 = null;
			}
		}
	}
}
