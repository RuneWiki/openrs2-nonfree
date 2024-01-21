import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!od", name = "T", descriptor = "[I")
	public static int[] anIntArray285;

	@OriginalMember(owner = "client!od", name = "N", descriptor = "Lclient!tg;")
	public static Class81 aClass81_980 = Static120.method2057("Clientscript error in: ");

	@OriginalMember(owner = "client!od", name = "P", descriptor = "Lclient!tg;")
	public static Class81 aClass81_981 = Static120.method2057("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!od", name = "Q", descriptor = "I")
	public static int anInt2701 = 1;

	@OriginalMember(owner = "client!od", name = "R", descriptor = "I")
	public static int anInt2702 = 0;

	@OriginalMember(owner = "client!od", name = "X", descriptor = "I")
	public static int anInt2707 = 0;

	@OriginalMember(owner = "client!od", name = "Y", descriptor = "Lclient!tg;")
	public static Class81 aClass81_982 = Static120.method2057("headicons_pk");

	@OriginalMember(owner = "client!od", name = "Z", descriptor = "I")
	public static int anInt2708 = 255;

	@OriginalMember(owner = "client!od", name = "ab", descriptor = "[J")
	public static long[] aLongArray6 = new long[200];

	@OriginalMember(owner = "client!od", name = "cb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_983 = Static120.method2057("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B[[I)V")
	public static void method2082(@OriginalArg(1) int[][] arg0) {
	}

	@OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V")
	public static void method2083() {
		for (@Pc(3) int local3 = -1; local3 < Static25.anInt645; local3++) {
			@Pc(10) int local10;
			if (local3 == -1) {
				local10 = 2047;
			} else {
				local10 = Static176.anIntArray423[local3];
			}
			@Pc(20) Class1_Sub2_Sub1_Sub3_Sub1 local20 = Static51.aClass1_Sub2_Sub1_Sub3_Sub1Array1[local10];
			if (local20 != null) {
				Static50.method890(1, local20);
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(III)V")
	public static void method2084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class30 local11 = Static139.aClass30ArrayArrayArray1[Static44.anInt1086][arg0][arg1];
		if (local11 == null) {
			Static119.method2033(Static44.anInt1086, arg0, arg1);
			return;
		}
		@Pc(23) int local23 = -99999999;
		@Pc(25) Class1_Sub2_Sub1_Sub1 local25 = null;
		@Pc(30) Class1_Sub2_Sub1_Sub1 local30;
		for (local30 = (Class1_Sub2_Sub1_Sub1) local11.method1115(); local30 != null; local30 = (Class1_Sub2_Sub1_Sub1) local11.method1125()) {
			@Pc(36) Class1_Sub2_Sub12 local36 = Static54.method969(local30.anInt105);
			@Pc(39) int local39 = local36.anInt2395;
			if (local36.anInt2414 == 1) {
				local39 *= local30.anInt106 + 1;
			}
			if (local39 > local23) {
				local23 = local39;
				local25 = local30;
			}
		}
		if (local25 == null) {
			Static119.method2033(Static44.anInt1086, arg0, arg1);
			return;
		}
		local11.method1114(local25);
		local30 = (Class1_Sub2_Sub1_Sub1) local11.method1115();
		@Pc(88) Class1_Sub2_Sub1_Sub1 local88 = null;
		@Pc(90) Class1_Sub2_Sub1_Sub1 local90 = null;
		while (local30 != null) {
			if (local25.anInt105 != local30.anInt105) {
				if (local88 == null) {
					local88 = local30;
				}
				if (local88.anInt105 != local30.anInt105 && local90 == null) {
					local90 = local30;
				}
			}
			local30 = (Class1_Sub2_Sub1_Sub1) local11.method1125();
		}
		@Pc(125) long local125 = (long) (arg0 + (arg1 << 7) + 1610612736);
		Static116.method2028(Static44.anInt1086, arg0, arg1, Static102.method1694(arg0 * 128 + 64, Static44.anInt1086, arg1 * 128 + 64), local25, local125, local88, local90);
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(II)Z")
	public static boolean method2085(@OriginalArg(1) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(Z)V")
	public static void method2086() {
		aClass81_983 = null;
		aClass81_980 = null;
		aClass81_982 = null;
		aClass81_981 = null;
		anIntArray285 = null;
		aLongArray6 = null;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIB)V")
	public static void method2087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15;
		for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
			for (local15 = 0; local15 < 8; local15++) {
				Static157.anIntArrayArrayArray7[arg2][local11 + arg1][local15 + arg0] = 0;
			}
		}
		if (arg1 > 0) {
			for (local15 = 1; local15 < 8; local15++) {
				Static157.anIntArrayArrayArray7[arg2][arg1][local15 + arg0] = Static157.anIntArrayArrayArray7[arg2][arg1 - 1][arg0 + local15];
			}
		}
		if (arg0 > 0) {
			for (local15 = 1; local15 < 8; local15++) {
				Static157.anIntArrayArrayArray7[arg2][arg1 + local15][arg0] = Static157.anIntArrayArrayArray7[arg2][local15 + arg1][arg0 - 1];
			}
		}
		if (arg1 > 0 && Static157.anIntArrayArrayArray7[arg2][arg1 - 1][arg0] != 0) {
			Static157.anIntArrayArrayArray7[arg2][arg1][arg0] = Static157.anIntArrayArrayArray7[arg2][arg1 - 1][arg0];
		} else if (arg0 > 0 && Static157.anIntArrayArrayArray7[arg2][arg1][arg0 - 1] != 0) {
			Static157.anIntArrayArrayArray7[arg2][arg1][arg0] = Static157.anIntArrayArrayArray7[arg2][arg1][arg0 - 1];
		} else if (arg1 > 0 && arg0 > 0 && Static157.anIntArrayArrayArray7[arg2][arg1 - 1][arg0 - 1] != 0) {
			Static157.anIntArrayArrayArray7[arg2][arg1][arg0] = Static157.anIntArrayArrayArray7[arg2][arg1 - 1][arg0 - 1];
		}
	}
}
