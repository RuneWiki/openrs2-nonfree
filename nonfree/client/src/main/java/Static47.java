import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
	public static int anInt1385;

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "[I")
	public static int[] anIntArray194;

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
	public static int anInt1379 = -1;

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "Lclient!wb;")
	public static Class65 aClass65_612 = Static24.method441("Handel akzeptieren");

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "Lclient!wb;")
	public static Class65 aClass65_613 = Static24.method441("backhmid2");

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "Lclient!wb;")
	private static Class65 aClass65_615 = Static24.method441("Existing user");

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "Lclient!wb;")
	public static Class65 aClass65_614 = aClass65_615;

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "Lclient!wb;")
	public static Class65 aClass65_616 = Static24.method441("sideicons");

	@OriginalMember(owner = "client!ie", name = "r", descriptor = "Lclient!wb;")
	public static Class65 aClass65_617 = Static24.method441("hitmarks");

	@OriginalMember(owner = "client!ie", name = "u", descriptor = "Lclient!wb;")
	public static Class65 aClass65_618 = Static24.method441("Registrierter Benutzer");

	@OriginalMember(owner = "client!ie", name = "w", descriptor = "Lclient!wb;")
	public static Class65 aClass65_619 = Static24.method441("An");

	@OriginalMember(owner = "client!ie", name = "x", descriptor = "Lclient!wb;")
	public static Class65 aClass65_620 = Static24.method441("(WSpielkonto wiederherstellen(W Option auf der Hauptseite)3");

	@OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
	public static int anInt1390 = 0;

	@OriginalMember(owner = "client!ie", name = "A", descriptor = "Lclient!wb;")
	public static Class65 aClass65_621 = Static24.method441("@gre@");

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BI)Z")
	public static boolean method818(@OriginalArg(1) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IILclient!wb;Lclient!wb;III)V")
	public static void method820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class65 arg2, @OriginalArg(3) Class65 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static24.anInt719 >= 500) {
			return;
		}
		if (arg3.method1760() > 0) {
			Static89.aClass65Array12[Static24.anInt719] = Static13.method282(new Class65[] { arg2, Static36.aClass65_517, arg3 });
		} else {
			Static89.aClass65Array12[Static24.anInt719] = arg2;
		}
		Static3.anIntArray20[Static24.anInt719] = arg4;
		Static84.anIntArray313[Static24.anInt719] = arg1;
		Static12.anIntArray70[Static24.anInt719] = arg5;
		Static41.anIntArray171[Static24.anInt719] = arg0;
		Static24.anInt719++;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IBLclient!k;)Z")
	public static boolean method821(@OriginalArg(0) int arg0, @OriginalArg(2) Class33 arg1) {
		@Pc(8) byte[] local8 = arg1.method1136(arg0);
		if (local8 == null) {
			return false;
		} else {
			Static29.method516(local8);
			return true;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
	public static void method822() {
		aClass65_614 = null;
		aClass65_613 = null;
		aClass65_619 = null;
		aClass65_612 = null;
		aClass65_621 = null;
		aClass65_616 = null;
		aClass65_618 = null;
		aClass65_617 = null;
		anIntArray194 = null;
		aClass65_620 = null;
		aClass65_615 = null;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIII)I")
	public static int method823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg2 & 0x3;
		if (local8 == 0) {
			return arg0;
		} else if (local8 == 1) {
			return arg1;
		} else if (local8 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V")
	public static void method825() {
		while (true) {
			@Pc(10) Class52 local10 = Static62.aClass52_8;
			@Pc(17) Class2_Sub9 local17;
			synchronized (Static62.aClass52_8) {
				local17 = (Class2_Sub9) Static4.aClass52_1.method1594();
			}
			if (local17 == null) {
				return;
			}
			local17.aClass33_Sub1_18.method1155(false, local17.aByteArray36, (int) local17.aLong82, local17.aClass5_1);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IJ)V")
	public static void method826(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static32.anInt1047 >= 100 && Static23.anInt670 != 1 || Static32.anInt1047 >= 200) {
			Static36.method742(Static8.aClass65_145, Static68.aClass65_945, 0);
			return;
		}
		@Pc(35) Class65 local35 = Static24.method442(arg0).method1787();
		for (@Pc(37) int local37 = 0; local37 < Static32.anInt1047; local37++) {
			if (Static4.aLongArray2[local37] == arg0) {
				Static36.method742(Static8.aClass65_145, Static13.method282(new Class65[] { local35, Static52.aClass65_721 }), 0);
				return;
			}
		}
		for (@Pc(80) int local80 = 0; local80 < Static93.anInt2629; local80++) {
			if (Static52.aLongArray6[local80] == arg0) {
				Static36.method742(Static8.aClass65_145, Static13.method282(new Class65[] { Static9.aClass65_160, local35, Static36.aClass65_515 }), 0);
				return;
			}
		}
		if (local35.method1781(Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.aClass65_726)) {
			return;
		}
		Static67.aClass65Array9[Static32.anInt1047] = local35;
		Static4.aLongArray2[Static32.anInt1047] = arg0;
		Static12.anIntArray71[Static32.anInt1047] = 0;
		Static19.aBoolean99 = true;
		Static32.anInt1047++;
		Static12.aClass2_Sub8_Sub1_8.method1425(191);
		Static12.aClass2_Sub8_Sub1_8.method1389(arg0);
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
	public static void method827() {
		if (Static41.aClass13_3 != null) {
			Static41.aClass13_3.method316();
			Static41.aClass13_3 = null;
		}
		Static84.method1447();
		Static67.aClass18_1.method604();
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			Static84.aClass58Array1[local22].method1733();
		}
		System.gc();
		Static57.method995();
		Static71.anInt2165 = 0;
		Static15.anInt478 = -1;
		Static17.method367();
		Static76.method1307(10);
	}
}
