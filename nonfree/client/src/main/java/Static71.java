import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!ie", name = "jb", descriptor = "I")
	public static int anInt1936;

	@OriginalMember(owner = "client!ie", name = "bb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_712 = Static169.method2903("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@OriginalMember(owner = "client!ie", name = "eb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_713 = Static169.method2903("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!ie", name = "gb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_714 = Static169.method2903("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!ie", name = "ib", descriptor = "Lclient!ed;")
	public static Class23 aClass23_715 = Static169.method2903("mapscene");

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([BZLclient!f;I)V")
	public static void method1273(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class27 arg1, @OriginalArg(3) int arg2) {
		@Pc(3) Class1_Sub25 local3 = new Class1_Sub25();
		local3.anInt4202 = 0;
		local3.aLong140 = arg2;
		local3.aByteArray47 = arg0;
		local3.aClass27_6 = arg1;
		@Pc(22) Class56 local22 = Static102.aClass56_10;
		synchronized (Static102.aClass56_10) {
			Static102.aClass56_10.method1856(local3);
		}
		Static33.method573();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BIIIZI)Lclient!nb;")
	public static Class1_Sub1_Sub12_Sub1 method1274(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(29) long local29 = ((long) arg0 << 40) + ((long) arg4 << 16) + (long) arg1 + ((long) arg2 << 38);
		@Pc(37) Class1_Sub1_Sub12_Sub1 local37;
		if (!arg3) {
			local37 = (Class1_Sub1_Sub12_Sub1) Static164.aClass79_26.method2657(local29);
			if (local37 != null) {
				return local37;
			}
		}
		@Pc(45) Class1_Sub1_Sub7 local45 = Static2.method118(arg1);
		if (arg4 > 1 && local45.anIntArray137 != null) {
			@Pc(53) int local53 = -1;
			for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
				if (arg4 >= local45.anIntArray138[local55] && local45.anIntArray138[local55] != 0) {
					local53 = local45.anIntArray137[local55];
				}
			}
			if (local53 != -1) {
				local45 = Static2.method118(local53);
			}
		}
		@Pc(90) Class1_Sub1_Sub1_Sub2_Sub1 local90 = local45.method705();
		if (local90 == null) {
			return null;
		}
		@Pc(96) Class1_Sub1_Sub12_Sub1 local96 = null;
		if (local45.anInt1143 != -1) {
			local96 = method1274(0, local45.anInt1147, 1, true, 10);
			if (local96 == null) {
				return null;
			}
		}
		@Pc(115) int[] local115 = Static150.anIntArray586;
		@Pc(117) int local117 = Static150.anInt4227;
		@Pc(120) int[] local120 = new int[4];
		@Pc(122) int local122 = Static150.anInt4226;
		Static150.method3021(local120);
		local37 = new Class1_Sub1_Sub12_Sub1(36, 32);
		Static150.method3025(local37.anIntArray374, 36, 32);
		Static150.method3032();
		Static121.method2142();
		Static121.method2143(16, 16);
		Static121.aBoolean164 = false;
		@Pc(145) int local145 = local45.anInt1154;
		if (arg3) {
			local145 = (int) ((double) local145 * 1.5D);
		} else if (arg2 == 2) {
			local145 = (int) ((double) local145 * 1.04D);
		}
		@Pc(175) int local175 = Class1_Sub1_Sub12_Sub2.anIntArray417[local45.anInt1169] * local145 >> 16;
		@Pc(184) int local184 = local145 * Class1_Sub1_Sub12_Sub2.anIntArray416[local45.anInt1169] >> 16;
		local90.method1085();
		local90.method1082(local45.anInt1163, local45.anInt1158, local45.anInt1169, local45.anInt1141, local184 + local45.anInt1131 - local90.aShort36 / 2, local175 + local45.anInt1131);
		if (arg2 >= 1) {
			local37.method1940(1);
		}
		if (arg2 >= 2) {
			local37.method1940(16777215);
		}
		if (arg0 != 0) {
			local37.method1926(arg0);
		}
		Static150.method3025(local37.anIntArray374, 36, 32);
		if (local45.anInt1143 != -1) {
			local96.method1944(0, 0);
		}
		if (!arg3 && (local45.anInt1155 == 1 || arg4 != 1) && arg4 != -1) {
			Static52.aClass1_Sub1_Sub12_Sub3_Sub1_5.method3058(Static82.method1449(arg4), 0, 9, 16776960, 1);
		}
		if (!arg3) {
			Static164.aClass79_26.method2658(local29, local37);
		}
		Static150.method3025(local115, local117, local122);
		Static150.method3030(local120);
		Static121.method2142();
		Static121.aBoolean164 = true;
		return local37;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIZI)I")
	public static int method1275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 & 0x3;
		if (local15 == 0) {
			return arg0;
		} else if (local15 == 1) {
			return arg1;
		} else if (local15 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)V")
	public static void method1276() {
		aClass23_714 = null;
		aClass23_715 = null;
		aClass23_712 = null;
		aClass23_713 = null;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZI)V")
	public static void method1277(@OriginalArg(0) boolean arg0) {
		if (Static111.anInt2840 == Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1838 >> 7 && Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1825 >> 7 == Static32.anInt934) {
			Static111.anInt2840 = 0;
		}
		@Pc(25) int local25 = Static152.anInt3549;
		if (arg0) {
			local25 = 1;
		}
		for (@Pc(31) int local31 = 0; local31 < local25; local31++) {
			@Pc(41) Class1_Sub1_Sub1_Sub1_Sub1 local41;
			@Pc(39) int local39;
			if (arg0) {
				local39 = 33538048;
				local41 = Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103;
			} else {
				local41 = Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[Static112.anIntArray382[local31]];
				local39 = Static112.anIntArray382[local31] << 14;
			}
			if (local41 != null && local41.method1222()) {
				local41.aBoolean12 = false;
				if ((Static8.aBoolean17 && Static152.anInt3549 > 50 || Static152.anInt3549 > 200) && !arg0 && local41.anInt1823 == local41.anInt1835) {
					local41.aBoolean12 = true;
				}
				@Pc(91) int local91 = local41.anInt1838 >> 7;
				@Pc(96) int local96 = local41.anInt1825 >> 7;
				if (local91 >= 0 && local91 < 104 && local96 >= 0 && local96 < 104) {
					if (local41.aClass1_Sub1_Sub1_Sub2_1 == null || local41.anInt203 > Static26.anInt845 || Static26.anInt845 >= local41.anInt200) {
						if ((local41.anInt1838 & 0x7F) == 64 && (local41.anInt1825 & 0x7F) == 64) {
							if (Static53.anIntArrayArray12[local91][local96] == Static104.anInt2667) {
								continue;
							}
							Static53.anIntArrayArray12[local91][local96] = Static104.anInt2667;
						}
						local41.anInt1832 = Static99.method1680(local41.anInt1825, local41.anInt1838, Static85.anInt2267);
						Static123.aClass80_1.method2705(Static85.anInt2267, local41.anInt1838, local41.anInt1825, local41.anInt1832, 60, local41, local41.anInt1843, local39, local41.aBoolean93);
					} else {
						local41.aBoolean12 = false;
						local41.anInt1832 = Static99.method1680(local41.anInt1825, local41.anInt1838, Static85.anInt2267);
						Static123.aClass80_1.method2695(Static85.anInt2267, local41.anInt1838, local41.anInt1825, local41.anInt1832, local41, local41.anInt1843, local39, local41.anInt218, local41.anInt216, local41.anInt214, local41.anInt208);
					}
				}
			}
		}
	}
}
