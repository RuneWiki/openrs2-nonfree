import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!pa", name = "Vb", descriptor = "I")
	public static int anInt2014;

	@OriginalMember(owner = "client!pa", name = "Xb", descriptor = "I")
	public static int anInt2015;

	@OriginalMember(owner = "client!pa", name = "cc", descriptor = "[I")
	public static int[] anIntArray233;

	@OriginalMember(owner = "client!pa", name = "Tb", descriptor = "Lclient!bb;")
	public static Class9 aClass9_7 = new Class9();

	@OriginalMember(owner = "client!pa", name = "Ub", descriptor = "Lclient!va;")
	public static Class61 aClass61_810 = Static88.method1421("@or2@");

	@OriginalMember(owner = "client!pa", name = "Wb", descriptor = "Lclient!va;")
	private static Class61 aClass61_811 = Static88.method1421("Enter name of player to delete from list");

	@OriginalMember(owner = "client!pa", name = "Yb", descriptor = "[Z")
	public static boolean[] aBooleanArray9 = new boolean[5];

	@OriginalMember(owner = "client!pa", name = "bc", descriptor = "Z")
	public static boolean aBoolean91 = false;

	@OriginalMember(owner = "client!pa", name = "dc", descriptor = "Lclient!va;")
	public static Class61 aClass61_812 = aClass61_811;

	@OriginalMember(owner = "client!pa", name = "ec", descriptor = "I")
	public static int anInt2018 = -1;

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "(I)V")
	public static void method1163() {
		aClass9_7 = null;
		aBooleanArray9 = null;
		anIntArray233 = null;
		aClass61_810 = null;
		aClass61_811 = null;
		aClass61_812 = null;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!he;Lclient!va;Lclient!va;I)[Lclient!m;")
	public static Class10_Sub1_Sub1_Sub2[] method1168(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(2) Class61 arg2) {
		@Pc(8) int local8 = arg0.method221(arg1);
		@Pc(14) int local14 = arg0.method227(local8, arg2);
		return Static98.method1561(local8, local14, arg0);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLclient!ed;)V")
	public static void method1169(@OriginalArg(1) Class10_Sub1_Sub5_Sub2 arg0) {
		arg0.aBoolean80 = false;
		@Pc(21) Class10_Sub1_Sub6 local21;
		if (arg0.anInt1674 != -1) {
			local21 = Static5.method33(arg0.anInt1674);
			arg0.anInt1673++;
			if (local21.anIntArray106.length > arg0.anInt1641 && arg0.anInt1673 > local21.anIntArray109[arg0.anInt1641]) {
				arg0.anInt1673 = 1;
				arg0.anInt1641++;
			}
			if (local21.anIntArray106.length <= arg0.anInt1641) {
				arg0.anInt1641 = 0;
				arg0.anInt1673 = 0;
			}
		}
		if (arg0.anInt1655 != -1 && Static95.anInt2442 >= arg0.anInt1636) {
			if (arg0.anInt1640 < 0) {
				arg0.anInt1640 = 0;
			}
			@Pc(93) int local93 = Static51.method789(arg0.anInt1655).anInt2185;
			if (local93 == -1) {
				arg0.anInt1655 = -1;
			} else {
				@Pc(106) Class10_Sub1_Sub6 local106 = Static5.method33(local93);
				arg0.anInt1678++;
				if (local106.anIntArray106.length > arg0.anInt1640 && local106.anIntArray109[arg0.anInt1640] < arg0.anInt1678) {
					arg0.anInt1678 = 1;
					arg0.anInt1640++;
				}
				if (local106.anIntArray106.length <= arg0.anInt1640 && (arg0.anInt1640 < 0 || arg0.anInt1640 >= local106.anIntArray106.length)) {
					arg0.anInt1655 = -1;
				}
			}
		}
		if (arg0.anInt1688 != -1 && arg0.anInt1675 <= 1) {
			local21 = Static5.method33(arg0.anInt1688);
			if (local21.anInt968 == 1 && arg0.anInt1671 > 0 && arg0.anInt1635 <= Static95.anInt2442 && Static95.anInt2442 > arg0.anInt1676) {
				arg0.anInt1675 = 1;
				return;
			}
		}
		if (arg0.anInt1688 != -1 && arg0.anInt1675 == 0) {
			local21 = Static5.method33(arg0.anInt1688);
			arg0.anInt1651++;
			if (local21.anIntArray106.length > arg0.anInt1680 && local21.anIntArray109[arg0.anInt1680] < arg0.anInt1651) {
				arg0.anInt1651 = 1;
				arg0.anInt1680++;
			}
			if (arg0.anInt1680 >= local21.anIntArray106.length) {
				arg0.anInt1642++;
				arg0.anInt1680 -= local21.anInt976;
				if (local21.anInt977 <= arg0.anInt1642) {
					arg0.anInt1688 = -1;
				}
				if (arg0.anInt1680 < 0 || local21.anIntArray106.length <= arg0.anInt1680) {
					arg0.anInt1688 = -1;
				}
			}
			arg0.aBoolean80 = local21.aBoolean46;
		}
		if (arg0.anInt1675 > 0) {
			arg0.anInt1675--;
		}
	}

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "(Z)V")
	public static void method1170() {
		Static101.anInt2558++;
		Static81.method1274(true);
		Static40.method642(true);
		Static81.method1274(false);
		Static40.method642(false);
		Static82.method1281();
		Static7.method74();
		@Pc(35) int local35;
		@Pc(33) int local33;
		if (!Static96.aBoolean112) {
			local33 = Static15.anInt453 + Static79.anInt2144 & 0x7FF;
			local35 = Static78.anInt2131;
			if (Static12.anInt348 / 256 > local35) {
				local35 = Static12.anInt348 / 256;
			}
			if (aBooleanArray9[4] && local35 < Static1.anIntArray2[4] + 128) {
				local35 = Static1.anIntArray2[4] + 128;
			}
			Static39.method213(local33, Static25.anInt783, Static31.anInt927, local35, local35 * 3 + 600, Static39.method230(Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1654, Static101.anInt2582, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1649) + -50);
		}
		if (Static96.aBoolean112) {
			local35 = Static32.method566();
		} else {
			local35 = Static15.method342();
		}
		@Pc(97) int local97 = Static96.anInt2449;
		local33 = Static12.anInt349;
		@Pc(101) int local101 = Static30.anInt918;
		@Pc(103) int local103 = anInt2015;
		@Pc(105) int local105 = Static40.anInt1090;
		for (@Pc(107) int local107 = 0; local107 < 5; local107++) {
			if (aBooleanArray9[local107]) {
				@Pc(148) int local148 = (int) ((double) (Static57.anIntArray161[local107] * 2 + 1) * Math.random() - (double) Static57.anIntArray161[local107] + Math.sin((double) Static67.anIntArray195[local107] * ((double) Static48.anIntArray143[local107] / 100.0D)) * (double) Static1.anIntArray2[local107]);
				if (local107 == 1) {
					Static96.anInt2449 += local148;
				}
				if (local107 == 2) {
					Static30.anInt918 += local148;
				}
				if (local107 == 0) {
					Static12.anInt349 += local148;
				}
				if (local107 == 4) {
					anInt2015 += local148;
					if (anInt2015 < 128) {
						anInt2015 = 128;
					}
					if (anInt2015 > 383) {
						anInt2015 = 383;
					}
				}
				if (local107 == 3) {
					Static40.anInt1090 = local148 + Static40.anInt1090 & 0x7FF;
				}
			}
		}
		Static43.method694();
		Static84.aBoolean99 = true;
		Static84.anInt2268 = 0;
		Static84.anInt2270 = Static17.anInt597 - 4;
		Static84.anInt2272 = Static28.anInt889 - 4;
		Static45.method1525();
		Static48.aClass54_1.method1355(Static12.anInt349, Static96.anInt2449, Static30.anInt918, anInt2015, Static40.anInt1090, local35);
		Static48.aClass54_1.method1369();
		Static21.method443();
		Static71.method1017();
		((Class8) Static68.anInterface3_1).method63(Static106.anInt2692);
		Static49.method771();
		if (Static49.aBoolean64 && Static107.method1499() == 0) {
			Static49.aBoolean64 = false;
		}
		if (Static49.aBoolean64) {
			Static43.method694();
			Static45.method1525();
			Static58.method840(false, null, Static95.aClass61_975);
		}
		Static74.method1042();
		Static12.anInt349 = local33;
		Static96.anInt2449 = local97;
		Static30.anInt918 = local101;
		anInt2015 = local103;
		Static40.anInt1090 = local105;
	}
}
