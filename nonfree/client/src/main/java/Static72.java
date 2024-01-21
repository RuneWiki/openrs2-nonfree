import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!le", name = "J", descriptor = "Lclient!tf;")
	public static Class73 aClass73_10;

	@OriginalMember(owner = "client!le", name = "v", descriptor = "Lclient!id;")
	public static Class34 aClass34_919 = Static9.method266("(U4");

	@OriginalMember(owner = "client!le", name = "w", descriptor = "Lclient!id;")
	public static Class34 aClass34_920 = Static9.method266("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!le", name = "x", descriptor = "[[I")
	public static int[][] anIntArrayArray18 = new int[104][104];

	@OriginalMember(owner = "client!le", name = "N", descriptor = "Lclient!id;")
	private static Class34 aClass34_927 = Static9.method266("Service unavailable)3");

	@OriginalMember(owner = "client!le", name = "z", descriptor = "Lclient!id;")
	public static Class34 aClass34_921 = aClass34_927;

	@OriginalMember(owner = "client!le", name = "G", descriptor = "Lclient!id;")
	private static Class34 aClass34_924 = Static9.method266("Use");

	@OriginalMember(owner = "client!le", name = "D", descriptor = "Lclient!id;")
	public static Class34 aClass34_922 = aClass34_924;

	@OriginalMember(owner = "client!le", name = "E", descriptor = "Lclient!id;")
	public static Class34 aClass34_923 = Static9.method266("welle2:");

	@OriginalMember(owner = "client!le", name = "F", descriptor = "[Lclient!a;")
	public static Class1_Sub1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1_Sub1Array1 = new Class1_Sub1_Sub1_Sub1_Sub1[2048];

	@OriginalMember(owner = "client!le", name = "H", descriptor = "I")
	public static int anInt1894 = 0;

	@OriginalMember(owner = "client!le", name = "I", descriptor = "J")
	public static long aLong100 = 0L;

	@OriginalMember(owner = "client!le", name = "K", descriptor = "Lclient!id;")
	private static Class34 aClass34_925 = Static9.method266("Loading title screen )2 ");

	@OriginalMember(owner = "client!le", name = "Q", descriptor = "Lclient!id;")
	private static Class34 aClass34_928 = Static9.method266("Close");

	@OriginalMember(owner = "client!le", name = "M", descriptor = "Lclient!id;")
	public static Class34 aClass34_926 = aClass34_928;

	@OriginalMember(owner = "client!le", name = "R", descriptor = "Lclient!id;")
	public static Class34 aClass34_929 = Static9.method266(" )2> ");

	@OriginalMember(owner = "client!le", name = "S", descriptor = "Lclient!id;")
	public static Class34 aClass34_930 = aClass34_925;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/awt/Component;Lclient!dd;BII)Lclient!wb;")
	public static Class22 method1263(@OriginalArg(0) Component arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static12.anInt553 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(38) Class22 local38 = (Class22) Class.forName("Class22_Sub1").getDeclaredConstructor().newInstance();
			local38.anInt1506 = arg2;
			local38.anIntArray156 = new int[(Static121.aBoolean163 ? 2 : 1) * 256];
			local38.method933(arg0);
			local38.anInt1510 = (-1024 & arg2) + 1024;
			if (local38.anInt1510 > 16384) {
				local38.anInt1510 = 16384;
			}
			local38.method929(local38.anInt1510);
			if (Static55.anInt1571 > 0 && Static41.aClass30_1 == null) {
				Static41.aClass30_1 = new Class30();
				Static41.aClass30_1.aClass15_2 = arg1;
				arg1.method488(Static55.anInt1571, Static41.aClass30_1);
			}
			if (Static41.aClass30_1 != null) {
				if (Static41.aClass30_1.aClass22Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static41.aClass30_1.aClass22Array1[arg3] = local38;
			}
			return local38;
		} catch (@Pc(113) Throwable local113) {
			try {
				@Pc(119) Class22_Sub2 local119 = new Class22_Sub2(arg1, arg3);
				local119.anInt1506 = arg2;
				local119.anIntArray156 = new int[(Static121.aBoolean163 ? 2 : 1) * 256];
				local119.method933(arg0);
				local119.anInt1510 = 16384;
				local119.method929(local119.anInt1510);
				if (Static55.anInt1571 > 0 && Static41.aClass30_1 == null) {
					Static41.aClass30_1 = new Class30();
					Static41.aClass30_1.aClass15_2 = arg1;
					arg1.method488(Static55.anInt1571, Static41.aClass30_1);
				}
				if (Static41.aClass30_1 != null) {
					if (Static41.aClass30_1.aClass22Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static41.aClass30_1.aClass22Array1[arg3] = local119;
				}
				return local119;
			} catch (@Pc(181) Throwable local181) {
				return new Class22();
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V")
	public static void method1264() {
		Static1.aClass63_1.method1665();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!ie;Lclient!ie;Z)V")
	public static void method1265(@OriginalArg(0) Class35 arg0, @OriginalArg(1) Class35 arg1) {
		Static99.aClass35_26 = arg0;
		Static26.aClass35_7 = arg1;
		Static116.anInt2809 = Static26.aClass35_7.method1579(3);
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V")
	public static void method1266() {
		aClass1_Sub1_Sub1_Sub1_Sub1Array1 = null;
		aClass34_930 = null;
		aClass34_922 = null;
		aClass34_925 = null;
		aClass34_927 = null;
		anIntArrayArray18 = null;
		aClass34_924 = null;
		aClass34_926 = null;
		aClass34_928 = null;
		aClass73_10 = null;
		aClass34_920 = null;
		aClass34_923 = null;
		aClass34_919 = null;
		aClass34_921 = null;
		aClass34_929 = null;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZILclient!id;)V")
	public static void method1267(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class34 arg1) {
		@Pc(23) int local23 = Static62.aClass1_Sub1_Sub2_Sub3_Sub1_4.method840(arg1, 250);
		@Pc(30) int local30 = Static62.aClass1_Sub1_Sub2_Sub3_Sub1_4.method850(arg1, 250) * 13;
		Static111.method1747(6, 6, local23 + 4 + 4, local30 + 4 - -4, 0);
		Static111.method1751(6, 6, local23 + 4 + 4, local30 + 4 - -4, 16777215);
		Static62.aClass1_Sub1_Sub2_Sub3_Sub1_4.method845(arg1, 10, 10, local23, local30, 16777215, -1, 1, 1, 0);
		Static8.method259(local23 + 4 + 4, 6, local30 + 8, 6);
		if (!arg0) {
			Static75.method1339(10, local30, 10, local23);
			return;
		}
		try {
			@Pc(109) Graphics local109 = Static7.aCanvas1.getGraphics();
			Static62.aClass6_1.method1355(local109);
		} catch (@Pc(117) Exception local117) {
			Static7.aCanvas1.repaint();
		}
	}
}
