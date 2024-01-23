import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!tg", name = "O", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas3;

	@OriginalMember(owner = "client!tg", name = "U", descriptor = "[I")
	public static int[] anIntArray10;

	@OriginalMember(owner = "client!tg", name = "V", descriptor = "[I")
	public static int[] anIntArray11;

	@OriginalMember(owner = "client!tg", name = "X", descriptor = "I")
	public static int anInt204;

	@OriginalMember(owner = "client!tg", name = "db", descriptor = "Lclient!hd;")
	public static Class50 aClass50_3;

	@OriginalMember(owner = "client!tg", name = "N", descriptor = "Lclient!sc;")
	private static Class107 aClass107_85 = Static231.method3737("Prepared sound engine");

	@OriginalMember(owner = "client!tg", name = "P", descriptor = "Lclient!sc;")
	public static Class107 aClass107_86 = Static231.method3737("hitbar_default");

	@OriginalMember(owner = "client!tg", name = "Q", descriptor = "Lclient!sc;")
	private static Class107 aClass107_87 = Static231.method3737("red:");

	@OriginalMember(owner = "client!tg", name = "R", descriptor = "Lclient!sc;")
	public static Class107 aClass107_88 = Static231.method3737("blinken1:");

	@OriginalMember(owner = "client!tg", name = "S", descriptor = "Lclient!sc;")
	public static Class107 aClass107_89 = aClass107_87;

	@OriginalMember(owner = "client!tg", name = "W", descriptor = "Lclient!sc;")
	public static Class107 aClass107_90 = Static231.method3737("settings");

	@OriginalMember(owner = "client!tg", name = "Z", descriptor = "[I")
	public static int[] anIntArray12 = new int[2000];

	@OriginalMember(owner = "client!tg", name = "ab", descriptor = "Lclient!sc;")
	public static Class107 aClass107_91 = aClass107_85;

	@OriginalMember(owner = "client!tg", name = "cb", descriptor = "I")
	public static int anInt207 = 99;

	@OriginalMember(owner = "client!tg", name = "ib", descriptor = "Lclient!sc;")
	public static Class107 aClass107_92 = aClass107_87;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIII)V")
	public static void method182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 - arg3 >= Static99.anInt915 && arg3 + arg1 <= Static38.anInt784 && Static223.anInt4869 <= arg0 - arg3 && Static47.anInt1057 >= arg3 + arg0) {
			Static186.method3041(arg3, arg4, arg2, arg1, arg0, arg5);
		} else {
			Static12.method323(arg1, arg2, arg3, arg4, arg0, arg5);
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)I")
	public static int method185(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)V")
	public static void method187() {
		if (Static57.aClass1_Sub2_Sub6_42 == null) {
			return;
		}
		if (Static107.anInt2345 < 10) {
			if (!Static155.aClass28_10.method817(Static57.aClass1_Sub2_Sub6_42.aClass107_252) || !Static155.aClass28_10.method817(Static149.method2437(new Class107[] { Static57.aClass1_Sub2_Sub6_42.aClass107_252, Static44.aClass107_293 }))) {
				Static107.anInt2345 = Static217.aClass28_Sub1_126.method843(Static57.aClass1_Sub2_Sub6_42.aClass107_252) / 10;
				return;
			}
			Static129.method2155();
			Static107.anInt2345 = 10;
		}
		if (Static107.anInt2345 == 10) {
			Static101.anInt2179 = Static57.aClass1_Sub2_Sub6_42.anInt751 >> 6 << 6;
			Static170.anInt3706 = (Static57.aClass1_Sub2_Sub6_42.anInt746 >> 6 << 6) + 64 - Static101.anInt2179;
			Static4.aFloat10 = 8.0F;
			Static24.aFloat2 = 8.0F;
			Static64.anInt1525 = Static57.aClass1_Sub2_Sub6_42.anInt745 >> 6 << 6;
			Static152.anInt3375 = (Static57.aClass1_Sub2_Sub6_42.anInt742 >> 6 << 6) + 64 - Static64.anInt1525;
			@Pc(99) int local99 = (Static204.aClass5_Sub5_Sub1_2.anInt3021 >> 7) + Static36.anInt764 - Static101.anInt2179;
			@Pc(108) int local108 = local99 + (int) (Math.random() * 10.0D) - 5;
			@Pc(123) int local123 = Static64.anInt1525 + Static152.anInt3375 - Static152.anInt3377 - (Static204.aClass5_Sub5_Sub1_2.anInt3044 >> 7) - 1;
			@Pc(132) int local132 = local123 + (int) (Math.random() * 10.0D) - 5;
			if (local108 >= 0 && local108 < Static170.anInt3706 && local132 >= 0 && local132 < Static152.anInt3375) {
				Static10.anInt284 = local108;
				Static114.anInt2509 = local132;
			} else {
				Static114.anInt2509 = Static152.anInt3375 + Static64.anInt1525 - Static57.aClass1_Sub2_Sub6_42.anInt741 * 64 - 1;
				Static10.anInt284 = Static57.aClass1_Sub2_Sub6_42.anInt756 * 64 - Static101.anInt2179;
			}
			Static25.method458();
			Static1.anIntArray1 = new int[Static201.anInt4358 + 1];
			@Pc(184) int local184 = Static152.anInt3375 >> 6;
			@Pc(190) int local190 = Static22.anInt439 >> 2 << 10;
			@Pc(194) int local194 = Static170.anInt3706 >> 6;
			Static83.aByteArrayArrayArray7 = new byte[local194][local184][];
			Static88.aShortArrayArrayArray1 = new short[local194][local184][];
			Static13.aByteArrayArrayArray1 = new byte[local194][local184][];
			@Pc(210) int local210 = Static118.anInt2617 >> 1;
			Static81.aByteArrayArrayArray6 = new byte[local194][local184][];
			Static150.aByteArrayArrayArray10 = new byte[local194][local184][];
			Static223.anIntArrayArrayArray12 = new int[local194][local184][];
			Static43.anIntArrayArrayArray4 = new int[local194][local184][];
			Static212.aByteArrayArrayArray12 = new byte[local194][local184][];
			Static168.method2687(local210, local190);
			Static107.anInt2345 = 20;
		} else if (Static107.anInt2345 == 20) {
			Static6.method2301(new Class1_Sub26(Static155.aClass28_10.method818(Static57.aClass1_Sub2_Sub6_42.aClass107_252, Static70.aClass107_459)));
			Static107.anInt2345 = 30;
			Static140.method666(true);
			Static29.method582();
		} else if (Static107.anInt2345 == 30) {
			Static220.method3624(new Class1_Sub26(Static155.aClass28_10.method818(Static57.aClass1_Sub2_Sub6_42.aClass107_252, Static20.aClass107_608)));
			Static107.anInt2345 = 40;
			Static29.method582();
		} else if (Static107.anInt2345 == 40) {
			Static106.method1855(new Class1_Sub26(Static155.aClass28_10.method818(Static57.aClass1_Sub2_Sub6_42.aClass107_252, Static72.aClass107_472)));
			Static107.anInt2345 = 50;
			Static29.method582();
		} else if (Static107.anInt2345 == 50) {
			Static139.method2342(new Class1_Sub26(Static155.aClass28_10.method818(Static57.aClass1_Sub2_Sub6_42.aClass107_252, Static108.aClass107_639)));
			Static107.anInt2345 = 60;
			Static140.method666(true);
			Static29.method582();
		} else if (Static107.anInt2345 == 60) {
			Static83.aClass119_2 = Static219.method3599(Static155.aClass28_10, Static149.method2437(new Class107[] { Static57.aClass1_Sub2_Sub6_42.aClass107_252, Static44.aClass107_293 }));
			Static107.anInt2345 = 70;
			Static29.method582();
		} else if (Static107.anInt2345 == 70) {
			Static117.aClass27_4 = new Class27(11, true, aCanvas3);
			Static107.anInt2345 = 73;
			Static140.method666(true);
			Static29.method582();
		} else if (Static107.anInt2345 == 73) {
			Static155.aClass27_2 = new Class27(12, true, aCanvas3);
			Static107.anInt2345 = 76;
			Static140.method666(true);
			Static29.method582();
		} else if (Static107.anInt2345 == 76) {
			Static29.aClass27_3 = new Class27(14, true, aCanvas3);
			Static107.anInt2345 = 79;
			Static140.method666(true);
			Static29.method582();
		} else if (Static107.anInt2345 == 79) {
			Static141.aClass27_5 = new Class27(17, true, aCanvas3);
			Static107.anInt2345 = 82;
			Static140.method666(true);
			Static29.method582();
		} else if (Static107.anInt2345 == 82) {
			Static176.aClass27_8 = new Class27(19, true, aCanvas3);
			Static107.anInt2345 = 85;
			Static140.method666(true);
			Static29.method582();
		} else if (Static107.anInt2345 == 85) {
			Static147.aClass27_6 = new Class27(22, true, aCanvas3);
			Static107.anInt2345 = 88;
			Static140.method666(true);
			Static29.method582();
		} else if (Static107.anInt2345 == 88) {
			Static196.aClass27_9 = new Class27(26, true, aCanvas3);
			Static107.anInt2345 = 91;
			Static140.method666(true);
			Static29.method582();
		} else {
			Static153.aClass27_7 = new Class27(30, true, aCanvas3);
			Static107.anInt2345 = 100;
			Static140.method666(true);
			Static29.method582();
			Static194.anInt4290 = -1;
			Static199.anInt4323 = -1;
			System.gc();
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BIIIIII)I")
	public static int method191(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg3 & 0x1) == 1) {
			@Pc(8) int local8 = arg1;
			arg1 = arg2;
			arg2 = local8;
		}
		@Pc(20) int local20 = arg0 & 0x3;
		if (local20 == 0) {
			return arg5;
		} else if (local20 == 1) {
			return 7 + 1 - arg4 - arg1;
		} else if (local20 == 2) {
			return 7 + 1 - arg5 - arg2;
		} else {
			return arg4;
		}
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(Z)V")
	public static void method192() {
		Static81.aClass61_27.method1697();
	}
}
