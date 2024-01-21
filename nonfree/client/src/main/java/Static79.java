import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!p", name = "z", descriptor = "Lclient!sb;")
	public static Class17 aClass17_1;

	@OriginalMember(owner = "client!p", name = "L", descriptor = "[I")
	public static int[] anIntArray284;

	@OriginalMember(owner = "client!p", name = "D", descriptor = "[[B")
	public static byte[][] aByteArrayArray6 = new byte[1000][];

	@OriginalMember(owner = "client!p", name = "N", descriptor = "[I")
	public static int[] anIntArray285 = new int[25];

	@OriginalMember(owner = "client!p", name = "S", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1166 = Static69.method1153("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!p", name = "U", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1167 = Static69.method1153("@gr2@");

	@OriginalMember(owner = "client!p", name = "V", descriptor = "I")
	public static int anInt1888 = 0;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
	public static void method1361(@OriginalArg(1) int arg0) {
		Static49.anInt1165 = arg0;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILclient!nd;)Z")
	public static boolean method1362(@OriginalArg(1) Class1_Sub1_Sub11 arg0) {
		if (arg0.anIntArray249 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray249.length; local17++) {
			@Pc(24) int local24 = Static44.method803(arg0, local17);
			@Pc(29) int local29 = arg0.anIntArray247[local17];
			if (arg0.anIntArray249[local17] == 2) {
				if (local24 >= local29) {
					return false;
				}
			} else if (arg0.anIntArray249[local17] == 3) {
				if (local29 >= local24) {
					return false;
				}
			} else if (arg0.anIntArray249[local17] == 4) {
				if (local29 == local24) {
					return false;
				}
			} else if (local24 != local29) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "(I)V")
	public static void method1363() {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = -1; local7 < Static6.anInt319; local7++) {
			if (local7 == -1) {
				local16 = 2047;
			} else {
				local16 = Static90.anIntArray69[local7];
			}
			@Pc(24) Class1_Sub1_Sub2_Sub1_Sub2 local24 = Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local16];
			if (local24 != null && local24.anInt2405 > 0) {
				local24.anInt2405--;
				if (local24.anInt2405 == 0) {
					local24.aClass64_1528 = null;
				}
			}
		}
		for (local16 = 0; local16 < Static64.anInt1488; local16++) {
			@Pc(61) int local61 = Static13.anIntArray65[local16];
			@Pc(65) Class1_Sub1_Sub2_Sub1_Sub1 local65 = Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local61];
			if (local65 != null && local65.anInt2405 > 0) {
				local65.anInt2405--;
				if (local65.anInt2405 == 0) {
					local65.aClass64_1528 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "f", descriptor = "(I)V")
	public static void method1364() {
		while (true) {
			@Pc(10) Class50 local10 = Static96.aClass50_14;
			@Pc(17) Class1_Sub12 local17;
			synchronized (Static96.aClass50_14) {
				local17 = (Class1_Sub12) Static84.aClass50_9.method1150();
			}
			if (local17 == null) {
				return;
			}
			local17.aClass41_Sub1_17.method1082((int) local17.aLong87, local17.aByteArray26, local17.aClass16_4, false);
		}
	}

	@OriginalMember(owner = "client!p", name = "g", descriptor = "(I)V")
	public static void method1365() {
		anIntArray285 = null;
		anIntArray284 = null;
		aClass64_1167 = null;
		aByteArrayArray6 = null;
		aClass64_1166 = null;
		aClass17_1 = null;
	}
}
