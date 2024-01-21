import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!mc", name = "eb", descriptor = "[I")
	public static int[] anIntArray237;

	@OriginalMember(owner = "client!mc", name = "jb", descriptor = "[I")
	public static int[] anIntArray238;

	@OriginalMember(owner = "client!mc", name = "Ab", descriptor = "J")
	public static long aLong49;

	@OriginalMember(owner = "client!mc", name = "qb", descriptor = "Lclient!ke;")
	private static Class39 aClass39_814 = Static2.method66("Loading textures )2 ");

	@OriginalMember(owner = "client!mc", name = "Q", descriptor = "Lclient!ke;")
	public static Class39 aClass39_808 = aClass39_814;

	@OriginalMember(owner = "client!mc", name = "S", descriptor = "Z")
	public static boolean aBoolean92 = false;

	@OriginalMember(owner = "client!mc", name = "nb", descriptor = "Lclient!ke;")
	private static Class39 aClass39_812 = Static2.method66("Public chat");

	@OriginalMember(owner = "client!mc", name = "T", descriptor = "Lclient!ke;")
	public static Class39 aClass39_809 = aClass39_812;

	@OriginalMember(owner = "client!mc", name = "W", descriptor = "Lclient!qd;")
	public static Class54 aClass54_19 = new Class54(64);

	@OriginalMember(owner = "client!mc", name = "Y", descriptor = "I")
	public static final int anInt1851 = 2301979;

	@OriginalMember(owner = "client!mc", name = "Z", descriptor = "Lclient!ke;")
	private static Class39 aClass39_810 = Static2.method66("purple:");

	@OriginalMember(owner = "client!mc", name = "hb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_811 = aClass39_810;

	@OriginalMember(owner = "client!mc", name = "ob", descriptor = "Lclient!ke;")
	public static Class39 aClass39_813 = Static2.method66("mapscene");

	@OriginalMember(owner = "client!mc", name = "ub", descriptor = "I")
	public static int anInt1865 = 0;

	@OriginalMember(owner = "client!mc", name = "vb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_815 = Static2.method66("hitmarks");

	@OriginalMember(owner = "client!mc", name = "yb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_816 = Static2.method66("Ignorieren");

	@OriginalMember(owner = "client!mc", name = "zb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_817 = Static2.method66("Registrierter Benutzer");

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V")
	public static void method1328() {
		aClass39_811 = null;
		aClass54_19 = null;
		aClass39_812 = null;
		aClass39_810 = null;
		aClass39_815 = null;
		aClass39_816 = null;
		aClass39_809 = null;
		anIntArray237 = null;
		anIntArray238 = null;
		aClass39_817 = null;
		aClass39_814 = null;
		aClass39_813 = null;
		aClass39_808 = null;
	}

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "(B)V")
	public static void method1330() {
		while (true) {
			if (Static51.aClass2_Sub5_Sub1_4.method1307(Static48.anInt1342) >= 11) {
				@Pc(18) int local18 = Static51.aClass2_Sub5_Sub1_4.method1309(11);
				if (local18 != 2047) {
					@Pc(23) boolean local23 = false;
					if (Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local18] == null) {
						local23 = true;
						Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local18] = new Class2_Sub1_Sub2_Sub3_Sub1();
						if (Static94.aClass2_Sub5Array1[local18] != null) {
							Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local18].method1847(Static94.aClass2_Sub5Array1[local18]);
						}
					}
					Static7.anIntArray21[Static61.anInt1740++] = local18;
					@Pc(59) Class2_Sub1_Sub2_Sub3_Sub1 local59 = Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local18];
					local59.anInt2931 = Static64.anInt1889;
					@Pc(69) int local69 = Static29.anIntArray91[Static51.aClass2_Sub5_Sub1_4.method1309(3)];
					if (local23) {
						local59.anInt2909 = local69;
					}
					@Pc(79) int local79 = Static51.aClass2_Sub5_Sub1_4.method1309(1);
					if (local79 == 1) {
						Static39.anIntArray167[Static60.anInt1626++] = local18;
					}
					@Pc(97) int local97 = Static51.aClass2_Sub5_Sub1_4.method1309(5);
					@Pc(102) int local102 = Static51.aClass2_Sub5_Sub1_4.method1309(5);
					if (local102 > 15) {
						local102 -= 32;
					}
					@Pc(113) int local113 = Static51.aClass2_Sub5_Sub1_4.method1309(1);
					if (local97 > 15) {
						local97 -= 32;
					}
					local59.method2066(local113 == 1, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0] + local102, local97 + Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0]);
					continue;
				}
			}
			Static51.aClass2_Sub5_Sub1_4.method1303();
			return;
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)Lclient!jb;")
	public static Class2_Sub1_Sub8 method1331(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub8 local10 = (Class2_Sub1_Sub8) Static19.aClass54_9.method1634((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static81.aClass36_54.method1761(9, arg0);
		local10 = new Class2_Sub1_Sub8();
		local10.anInt1389 = arg0;
		if (local20 != null) {
			local10.method943(new Class2_Sub5(local20));
		}
		local10.method949();
		Static19.aClass54_9.method1637((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)V")
	public static void method1333() {
		Static7.aClass54_3.method1635();
		Static82.aClass54_23.method1635();
		Static65.aClass54_21.method1635();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BII)I")
	public static int method1334(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(28) int local28 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local28;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(JZ)V")
	public static void method1335(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < Static41.anInt1196; local12++) {
			if (Static30.aLongArray3[local12] == arg0) {
				Static97.aBoolean120 = true;
				Static41.anInt1196--;
				for (@Pc(32) int local32 = local12; local32 < Static41.anInt1196; local32++) {
					Static30.aLongArray3[local32] = Static30.aLongArray3[local32 + 1];
				}
				Static50.aClass2_Sub5_Sub1_2.method1302(202);
				Static50.aClass2_Sub5_Sub1_2.method1270(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "(I)V")
	public static void method1336() {
		if (Static45.anInt1235 != 0 || Static39.anInt1172 != 1) {
			return;
		}
		@Pc(28) int local28 = Static93.anInt2442 - 4 - 5;
		@Pc(34) int local34 = Static2.anInt91 - 550 - 25;
		if (local34 < 0 || local28 < 0 || local34 >= 146 || local28 >= 151) {
			return;
		}
		local34 -= 73;
		@Pc(55) int local55 = Static94.anInt2489 + Static101.anInt2748 & 0x7FF;
		@Pc(59) int local59 = Class2_Sub1_Sub4_Sub4.anIntArray356[local55];
		@Pc(67) int local67 = (anInt1865 + 256) * local59 >> 8;
		local28 -= 75;
		@Pc(72) int local72 = Class2_Sub1_Sub4_Sub4.anIntArray358[local55];
		@Pc(80) int local80 = local72 * (anInt1865 + 256) >> 8;
		@Pc(90) int local90 = local80 * local34 + local28 * local67 >> 11;
		@Pc(98) int local98 = Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2896 + local90 >> 7;
		@Pc(108) int local108 = local80 * local28 - local34 * local67 >> 11;
		@Pc(116) int local116 = Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2899 - local108 >> 7;
		@Pc(136) boolean local136 = Static22.method440(0, 0, 0, local116, 1, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], local98, true, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
		if (!local136) {
			return;
		}
		Static50.aClass2_Sub5_Sub1_2.method1252(local34);
		Static50.aClass2_Sub5_Sub1_2.method1252(local28);
		Static50.aClass2_Sub5_Sub1_2.method1257(Static101.anInt2748);
		Static50.aClass2_Sub5_Sub1_2.method1252(57);
		Static50.aClass2_Sub5_Sub1_2.method1252(Static94.anInt2489);
		Static50.aClass2_Sub5_Sub1_2.method1252(anInt1865);
		Static50.aClass2_Sub5_Sub1_2.method1252(89);
		Static50.aClass2_Sub5_Sub1_2.method1257(Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2896);
		Static50.aClass2_Sub5_Sub1_2.method1257(Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2899);
		Static50.aClass2_Sub5_Sub1_2.method1252(Static22.anInt607);
		Static50.aClass2_Sub5_Sub1_2.method1252(63);
		return;
	}
}
