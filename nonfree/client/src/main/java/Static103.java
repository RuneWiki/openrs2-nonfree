import java.awt.Canvas;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "J")
	public static long aLong83;

	@OriginalMember(owner = "client!ub", name = "u", descriptor = "J")
	public static long aLong84;

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
	public static int anInt2616;

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!ub", name = "A", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
	public static int anInt2605 = -1;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "Lclient!cb;")
	public static Class11 aClass11_26 = new Class11(50);

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
	public static int anInt2610 = -1;

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "Lclient!a;")
	private static Class1 aClass1_2699 = Static94.method1596("wave2:");

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "Lclient!a;")
	private static Class1 aClass1_2700 = Static94.method1596(" is already on your friend list");

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "Lclient!a;")
	public static Class1 aClass1_2701 = aClass1_2700;

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "[Lclient!jd;")
	public static Class2_Sub1_Sub2_Sub4[] aClass2_Sub1_Sub2_Sub4Array12 = new Class2_Sub1_Sub2_Sub4[1000];

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
	public static int anInt2617 = 0;

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "Lclient!a;")
	public static Class1 aClass1_2702 = Static94.method1596("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
	public static int anInt2618 = 78;

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "Lclient!a;")
	public static Class1 aClass1_2703 = aClass1_2699;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
	public static void method1723() {
		aClass1_2702 = null;
		aClass2_Sub1_Sub2_Sub4Array12 = null;
		aClass1_2701 = null;
		aClass1_2699 = null;
		aClass11_26 = null;
		aCanvas1 = null;
		aClass1_2700 = null;
		aClass1_2703 = null;
		aByteArrayArrayArray9 = null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	public static void method1724() {
		if (Static28.anInt1052 != 0) {
			return;
		}
		@Pc(18) int local18 = anInt2617;
		if (Static17.anInt783 == 1 && Static93.anInt2360 >= 516 && Static1.anInt13 >= 160 && Static93.anInt2360 <= 765 && Static1.anInt13 <= 205) {
			local18 = 0;
		}
		@Pc(59) int local59;
		@Pc(113) int local113;
		@Pc(119) int local119;
		if (!Static6.aBoolean11) {
			if (local18 == 1 && Static37.anInt1346 > 0) {
				local59 = Static66.anIntArray290[Static37.anInt1346 - 1];
				if (local59 == 53 || local59 == 25 || local59 == 55 || local59 == 48 || local59 == 24 || local59 == 52 || local59 == 6 || local59 == 31 || local59 == 43 || local59 == 11 || local59 == 19 || local59 == 1006) {
					local113 = Static32.anIntArray123[Static37.anInt1346 - 1];
					local119 = Static98.anIntArray311[Static37.anInt1346 - 1];
					@Pc(123) Class2_Sub1_Sub14 local123 = Static113.method1526(local119);
					if (local123.aBoolean130 || local123.aBoolean131) {
						Static107.anInt2703 = Static93.anInt2360;
						Static95.aBoolean142 = false;
						Static28.anInt1052 = 2;
						Static81.anInt2133 = local119;
						Static96.anInt2421 = Static1.anInt13;
						Static94.anInt2364 = local113;
						if (Static111.anInt2784 == local119 >> 16) {
							Static28.anInt1052 = 1;
						}
						if (local119 >> 16 == Static72.anInt1978) {
							Static28.anInt1052 = 3;
						}
						Static7.anInt1196 = 0;
						return;
					}
				}
			}
			if (local18 == 1 && (Static113.anInt2241 == 1 || Static60.method1282(Static37.anInt1346 - 1)) && Static37.anInt1346 > 2) {
				local18 = 2;
			}
			if (local18 == 1 && Static37.anInt1346 > 0) {
				Static54.method1224(Static37.anInt1346 - 1);
			}
			if (local18 == 2 && Static37.anInt1346 > 0) {
				Static99.method1667();
			}
			return;
		}
		if (local18 != 1) {
			local59 = Static22.anInt930;
			local113 = Static84.anInt2248;
			if (Static18.anInt835 == 0) {
				local59 -= 4;
				local113 -= 4;
			}
			if (Static18.anInt835 == 1) {
				local113 -= 205;
				local59 -= 553;
			}
			if (Static18.anInt835 == 2) {
				local113 -= 357;
				local59 -= 17;
			}
			if (Static32.anInt1230 - 10 > local59 || Static77.anInt2065 + Static32.anInt1230 + 10 < local59 || local113 < Static17.anInt772 - 10 || local113 > Static17.anInt772 + Static5.anInt404 + 10) {
				if (Static18.anInt835 == 1) {
					Static34.aBoolean60 = true;
				}
				Static6.aBoolean11 = false;
				if (Static18.anInt835 == 2) {
					Static87.aBoolean137 = true;
				}
			}
		}
		if (local18 != 1) {
			return;
		}
		local59 = Static32.anInt1230;
		local113 = Static17.anInt772;
		local119 = Static77.anInt2065;
		@Pc(298) int local298 = Static93.anInt2360;
		@Pc(300) int local300 = -1;
		@Pc(302) int local302 = Static1.anInt13;
		if (Static18.anInt835 == 0) {
			local298 -= 4;
			local302 -= 4;
		}
		if (Static18.anInt835 == 1) {
			local298 -= 553;
			local302 -= 205;
		}
		if (Static18.anInt835 == 2) {
			local298 -= 17;
			local302 -= 357;
		}
		for (@Pc(325) int local325 = 0; local325 < Static37.anInt1346; local325++) {
			@Pc(339) int local339 = local113 + (Static37.anInt1346 + -1 - local325) * 15 + 31;
			if (local298 > local59 && local298 < local119 + local59 && local302 > local339 - 13 && local302 < local339 + 3) {
				local300 = local325;
			}
		}
		if (local300 != -1) {
			Static54.method1224(local300);
		}
		if (Static18.anInt835 == 1) {
			Static34.aBoolean60 = true;
		}
		Static6.aBoolean11 = false;
		if (Static18.anInt835 == 2) {
			Static87.aBoolean137 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!lc;Ljava/awt/Component;I)Lclient!b;")
	public static Class2_Sub2_Sub1 method1725(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Component arg1) {
		Static113.method1521(arg1, arg0);
		@Pc(12) Class2_Sub2_Sub1 local12 = new Class2_Sub2_Sub1();
		Static12.method1745(local12);
		return local12;
	}
}
