import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!ib", name = "P", descriptor = "I")
	public static int anInt1660;

	@OriginalMember(owner = "client!ib", name = "U", descriptor = "[Lclient!ea;")
	public static Class2_Sub1_Sub4_Sub2[] aClass2_Sub1_Sub4_Sub2Array5;

	@OriginalMember(owner = "client!ib", name = "Z", descriptor = "I")
	public static int anInt1667;

	@OriginalMember(owner = "client!ib", name = "jb", descriptor = "Lclient!cd;")
	private static Class10 aClass10_724 = Static51.method932("Select");

	@OriginalMember(owner = "client!ib", name = "S", descriptor = "Lclient!cd;")
	public static Class10 aClass10_723 = aClass10_724;

	@OriginalMember(owner = "client!ib", name = "W", descriptor = "[I")
	public static int[] anIntArray181 = new int[200];

	@OriginalMember(owner = "client!ib", name = "kb", descriptor = "I")
	public static int anInt1677 = 0;

	@OriginalMember(owner = "client!ib", name = "tb", descriptor = "Lclient!cd;")
	private static Class10 aClass10_727 = Static51.method932("Loading interfaces )2 ");

	@OriginalMember(owner = "client!ib", name = "lb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_725 = aClass10_727;

	@OriginalMember(owner = "client!ib", name = "mb", descriptor = "Lclient!cd;")
	private static Class10 aClass10_726 = Static51.method932("Location");

	@OriginalMember(owner = "client!ib", name = "vb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_728 = aClass10_726;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
	public static byte[] method1183(@OriginalArg(1) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static130.method2082(local13) : local13;
		} else if (arg1 instanceof Class36) {
			@Pc(27) Class36 local27 = (Class36) arg1;
			return local27.method2101();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)V")
	public static void method1184(@OriginalArg(1) int arg0) {
		if (Static76.method1263(arg0)) {
			Static8.method160(-1, Static90.aClass23ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIII)V")
	public static void method1186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static137.aClass2_Sub1_Sub4_Sub3Array18[0].method1874(arg3, arg0);
		Static137.aClass2_Sub1_Sub4_Sub3Array18[1].method1874(arg3, arg2 + arg0 - 16);
		@Pc(27) int local27 = arg2 * (arg2 - 32) / arg4;
		if (local27 < 8) {
			local27 = 8;
		}
		@Pc(48) int local48 = arg1 * (arg2 - local27 - 32) / (arg4 - arg2);
		Static172.method2026(arg3, arg0 + 16, 16, arg2 - 32, Static4.anInt62);
		Static172.method2026(arg3, arg0 + local48 + 16, 16, local27, Static86.anInt1945);
		Static172.method2028(arg3, local48 + arg0 + 16, local27, Static120.anInt2718);
		Static172.method2028(arg3 + 1, local48 + 16 + arg0, local27, Static120.anInt2718);
		Static172.method2029(arg3, local48 + arg0 + 16, 16, Static120.anInt2718);
		Static172.method2029(arg3, arg0 + local48 + 17, 16, Static120.anInt2718);
		Static172.method2028(arg3 + 15, local48 + 16 + arg0, local27, Static61.anInt3640);
		Static172.method2028(arg3 + 14, arg0 + 17 + local48, local27 - 1, Static61.anInt3640);
		Static172.method2029(arg3, local48 + arg0 + local27 + 15, 16, Static61.anInt3640);
		Static172.method2029(arg3 + 1, arg0 + 14 - (-local48 + -local27), 15, Static61.anInt3640);
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(III)V")
	public static void method1187(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static46.anInt1135 < 2 && Static44.anInt1023 == 0 && !Static69.aBoolean74) {
			return;
		}
		@Pc(32) Class10 local32;
		if (Static44.anInt1023 == 1 && Static46.anInt1135 < 2) {
			local32 = Static3.method36(new Class10[] { Static151.aClass10_1426, Static163.aClass10_1520, Static163.aClass10_1521, Static98.aClass10_984 });
		} else if (Static69.aBoolean74 && Static46.anInt1135 < 2) {
			local32 = Static3.method36(new Class10[] { Static111.aClass10_1098, Static163.aClass10_1520, Static121.aClass10_1190, Static98.aClass10_984 });
		} else {
			local32 = Static9.method163(Static46.anInt1135 - 1);
		}
		if (Static46.anInt1135 > 2) {
			local32 = Static3.method36(new Class10[] { local32, Static39.aClass10_478, Static164.method2485(Static46.anInt1135 - 2), Static98.aClass10_986 });
		}
		@Pc(132) int local132 = Static167.aClass2_Sub1_Sub4_Sub1_Sub1_4.method509(local32, arg1 + 4, arg0 + 15, Static175.aRandom1, anInt1660);
		Static98.method1627(arg1 + 4, arg0, local132 + Static167.aClass2_Sub1_Sub4_Sub1_Sub1_4.method514(local32), 15);
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)V")
	public static void method1188() {
		Static3.method34(Static16.aClass23_1);
		Static117.anInt2670++;
		if (Static131.aBoolean131 && Static142.aBoolean140) {
			@Pc(31) int local31 = Static72.anInt1723;
			local31 -= Static143.anInt3171;
			if (local31 < Static135.anInt2991) {
				local31 = Static135.anInt2991;
			}
			if (Static16.aClass23_1.anInt1089 + local31 > Static169.aClass23_13.anInt1089 + Static135.anInt2991) {
				local31 = Static135.anInt2991 + Static169.aClass23_13.anInt1089 - Static16.aClass23_1.anInt1089;
			}
			@Pc(60) int local60 = Static61.anInt3635;
			local60 -= Static41.anInt986;
			@Pc(69) int local69 = local31 - Static179.anInt3814;
			if (Static87.anInt2091 > local60) {
				local60 = Static87.anInt2091;
			}
			@Pc(81) int local81 = Static16.aClass23_1.anInt1063;
			@Pc(89) int local89 = Static169.aClass23_13.anInt1071 + local31 - Static135.anInt2991;
			if (local60 + Static16.aClass23_1.anInt1087 > Static169.aClass23_13.anInt1087 + Static87.anInt2091) {
				local60 = Static169.aClass23_13.anInt1087 + Static87.anInt2091 - Static16.aClass23_1.anInt1087;
			}
			@Pc(115) int local115 = local60 + Static169.aClass23_13.anInt1053 - Static87.anInt2091;
			@Pc(120) int local120 = local60 - Static69.anInt1634;
			if (Static16.aClass23_1.anInt1081 < Static117.anInt2670 && (local81 < local69 || -local81 > local69 || local81 < local120 || -local81 > local120)) {
				Static139.aBoolean137 = true;
			}
			@Pc(157) Class2_Sub18 local157;
			if (Static16.aClass23_1.anObjectArray1 != null && Static139.aBoolean137) {
				local157 = new Class2_Sub18();
				local157.anInt2889 = local89;
				local157.aClass23_9 = Static16.aClass23_1;
				local157.anObjectArray29 = Static16.aClass23_1.anObjectArray1;
				local157.anInt2887 = local115;
				Static47.method881(local157);
			}
			if (Static95.anInt2252 == 0) {
				if (Static139.aBoolean137) {
					if (Static16.aClass23_1.anObjectArray6 != null) {
						local157 = new Class2_Sub18();
						local157.aClass23_10 = Static60.aClass23_5;
						local157.anInt2887 = local115;
						local157.anInt2889 = local89;
						local157.aClass23_9 = Static16.aClass23_1;
						local157.anObjectArray29 = Static16.aClass23_1.anObjectArray6;
						Static47.method881(local157);
					}
					if (Static60.aClass23_5 != null && Static68.method1155(Static16.aClass23_1) != null) {
						Static141.aClass2_Sub11_Sub1_3.method1495(64);
						Static141.aClass2_Sub11_Sub1_3.method1480(Static16.aClass23_1.anInt1056);
						Static141.aClass2_Sub11_Sub1_3.method1453(Static60.aClass23_5.anInt1057);
						Static141.aClass2_Sub11_Sub1_3.method1474(Static60.aClass23_5.anInt1056);
						Static141.aClass2_Sub11_Sub1_3.method1485(Static16.aClass23_1.anInt1057);
					}
				} else if ((Static131.anInt2911 == 1 || Static139.method2197(Static46.anInt1135 - 1)) && Static46.anInt1135 > 2) {
					Static8.method156();
				} else if (Static46.anInt1135 > 0) {
					Static38.method780(Static46.anInt1135 - 1);
				}
				Static16.aClass23_1 = null;
			}
		} else if (Static117.anInt2670 > 1) {
			Static16.aClass23_1 = null;
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(Z)V")
	public static void method1189() {
		aClass10_723 = null;
		aClass2_Sub1_Sub4_Sub2Array5 = null;
		aClass10_725 = null;
		aClass10_728 = null;
		aClass10_726 = null;
		aClass10_727 = null;
		aClass10_724 = null;
		anIntArray181 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILclient!bb;)V")
	public static void method1190(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub3_Sub2 arg1) {
		Static116.method1882(arg0, arg1.anInt3454, arg1.anInt3499);
	}
}
