import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "Z")
	public static boolean aBoolean26 = false;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "Lclient!ja;")
	public static Class39 aClass39_354 = Static28.method504("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "Lclient!ja;")
	private static Class39 aClass39_359 = Static28.method504("The server is being updated)3");

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "Lclient!ja;")
	public static Class39 aClass39_355 = aClass39_359;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "Lclient!ja;")
	public static Class39 aClass39_356 = Static28.method504("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "Lclient!ja;")
	public static Class39 aClass39_357 = Static28.method504("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
	public static int anInt642 = 0;

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "[I")
	public static int[] anIntArray64 = new int[2000];

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "Lclient!ja;")
	public static Class39 aClass39_358 = Static28.method504("mapfunction");

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public static void method420() {
		for (@Pc(6) Class4_Sub7 local6 = (Class4_Sub7) Static112.aClass61_12.method1628(); local6 != null; local6 = (Class4_Sub7) Static112.aClass61_12.method1629()) {
			if (local6.aClass4_Sub2_Sub10_1 != null) {
				local6.method980();
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V")
	public static void method422() {
		aClass39_359 = null;
		aByteArrayArray3 = null;
		aClass39_356 = null;
		aClass39_357 = null;
		aClass39_354 = null;
		aClass39_355 = null;
		anIntArray64 = null;
		aClass39_358 = null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
	public static void method423() {
		if (Static63.aClass4_Sub5_36 != null || Static129.aClass4_Sub5_72 != null) {
			return;
		}
		@Pc(21) int local21 = Static62.anInt1637;
		@Pc(28) int local28;
		@Pc(30) int local30;
		@Pc(80) int local80;
		if (Static101.aBoolean122) {
			if (local21 != 1) {
				local28 = Static88.anInt2198;
				local30 = Static73.anInt1769;
				if (local28 < Static73.anInt1764 - 10 || local28 > Static51.anInt2470 + Static73.anInt1764 + 10 || Static65.anInt1666 - 10 > local30 || Static65.anInt1666 + Static126.anInt3156 + 10 < local30) {
					Static101.aBoolean122 = false;
					Static1.method6(Static73.anInt1764, Static51.anInt2470, Static65.anInt1666, Static126.anInt3156);
				}
			}
			if (local21 == 1) {
				local80 = Static51.anInt2470;
				local28 = Static73.anInt1764;
				local30 = Static65.anInt1666;
				@Pc(86) int local86 = Static27.anInt741;
				@Pc(88) int local88 = Static1.anInt9;
				@Pc(90) int local90 = -1;
				for (@Pc(92) int local92 = 0; local92 < Static105.anInt2033; local92++) {
					@Pc(107) int local107 = (Static105.anInt2033 - local92 - 1) * 15 + local30 + 31;
					if (local86 > local28 && local86 < local28 + local80 && local88 > local107 - 13 && local107 + 3 > local88) {
						local90 = local92;
					}
				}
				if (local90 != -1) {
					Static67.method1166(local90);
				}
				Static101.aBoolean122 = false;
				Static1.method6(Static73.anInt1764, Static51.anInt2470, Static65.anInt1666, Static126.anInt3156);
				return;
			}
			return;
		}
		if (local21 == 1 && Static105.anInt2033 > 0) {
			local28 = Static125.anIntArray358[Static105.anInt2033 - 1];
			if (local28 == 21 || local28 == 19 || local28 == 8 || local28 == 43 || local28 == 29 || local28 == 5 || local28 == 26 || local28 == 20 || local28 == 37 || local28 == 40 || local28 == 1 || local28 == 1004) {
				local30 = Static10.anIntArray36[Static105.anInt2033 - 1];
				local80 = Static49.anIntArray136[Static105.anInt2033 - 1];
				@Pc(233) Class4_Sub5 local233 = Static54.method949(local80);
				if (Static73.method1209(Static20.method385(local233)) || Static70.method1189(Static20.method385(local233))) {
					Static30.aBoolean34 = false;
					Static23.anInt649 = 0;
					if (Static63.aClass4_Sub5_36 != null) {
						Static19.method344(Static63.aClass4_Sub5_36);
					}
					Static63.aClass4_Sub5_36 = Static54.method949(local80);
					Static108.anInt2699 = Static27.anInt741;
					Static126.anInt3160 = local30;
					Static44.anInt1129 = Static1.anInt9;
					Static19.method344(Static63.aClass4_Sub5_36);
					return;
				}
			}
		}
		if (local21 == 1 && (Static2.anInt19 == 1 && Static105.anInt2033 > 2 || Static72.method532(Static105.anInt2033 - 1))) {
			local21 = 2;
		}
		if (local21 == 1 && Static105.anInt2033 > 0) {
			Static67.method1166(Static105.anInt2033 - 1);
		}
		if (local21 != 2 || Static105.anInt2033 <= 0) {
			return;
		}
		Static88.method1612();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!he;I)V")
	public static void method424(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub5 arg1, @OriginalArg(3) int arg2) {
		if (Static129.aClass4_Sub5_72 != null || Static101.aBoolean122 || (arg1 == null || Static45.method763(arg1) == null)) {
			return;
		}
		Static129.aClass4_Sub5_72 = arg1;
		Static71.aClass4_Sub5_38 = Static45.method763(arg1);
		Static14.aBoolean13 = false;
		Static77.anInt1849 = arg0;
		Static58.anInt1549 = arg2;
		Static125.anInt3121 = 0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)I")
	public static int method425(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(15) int local15 = local5 ^ local5 << 13;
		@Pc(33) int local33 = local15 * (local15 * local15 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local33 >> 19 & 0xFF;
	}
}
