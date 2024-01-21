import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!ua", name = "w", descriptor = "Lclient!wc;")
	public static Class4 aClass4_60;

	@OriginalMember(owner = "client!ua", name = "A", descriptor = "[I")
	public static int[] anIntArray323;

	@OriginalMember(owner = "client!ua", name = "u", descriptor = "Lclient!a;")
	private static Class1 aClass1_2696 = Static94.method1596("To play on this world move to a free area first");

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "Lclient!a;")
	public static Class1 aClass1_2686 = aClass1_2696;

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "Lclient!a;")
	private static Class1 aClass1_2688 = Static94.method1596("Username: ");

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "Lclient!a;")
	public static Class1 aClass1_2687 = aClass1_2688;

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "Lclient!fe;")
	public static Class2_Sub3_Sub1 aClass2_Sub3_Sub1_3 = new Class2_Sub3_Sub1(5000);

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "Lclient!a;")
	public static Class1 aClass1_2689 = Static94.method1596("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "Lclient!a;")
	public static Class1 aClass1_2690 = Static94.method1596("mapedge");

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "Lclient!a;")
	private static Class1 aClass1_2692 = Static94.method1596("wishes to duel with you)3");

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "Lclient!a;")
	public static Class1 aClass1_2691 = aClass1_2692;

	@OriginalMember(owner = "client!ua", name = "t", descriptor = "Lclient!a;")
	private static Class1 aClass1_2695 = Static94.method1596("System update in: ");

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "Lclient!a;")
	public static Class1 aClass1_2693 = aClass1_2695;

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "[[I")
	public static int[][] anIntArrayArray25 = new int[104][104];

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "Lclient!a;")
	public static Class1 aClass1_2694 = Static94.method1596("null");

	@OriginalMember(owner = "client!ua", name = "v", descriptor = "Lclient!a;")
	public static Class1 aClass1_2697 = Static94.method1596("backleft1");

	@OriginalMember(owner = "client!ua", name = "z", descriptor = "Z")
	public static boolean aBoolean153 = false;

	@OriginalMember(owner = "client!ua", name = "B", descriptor = "Lclient!a;")
	public static Class1 aClass1_2698 = Static94.method1596("Fps:");

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)V")
	public static void method1717(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static113.aBooleanArray17[arg0]) {
			return;
		}
		Static30.aClass8_9.method1683(arg0);
		if (Static98.aClass2_Sub1_Sub14ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(30) boolean local30 = true;
		for (@Pc(32) int local32 = 0; local32 < Static98.aClass2_Sub1_Sub14ArrayArray1[arg0].length; local32++) {
			if (Static98.aClass2_Sub1_Sub14ArrayArray1[arg0][local32] != null) {
				if (Static98.aClass2_Sub1_Sub14ArrayArray1[arg0][local32].anInt2192 == 2) {
					local30 = false;
				} else {
					Static98.aClass2_Sub1_Sub14ArrayArray1[arg0][local32] = null;
				}
			}
		}
		if (local30) {
			Static98.aClass2_Sub1_Sub14ArrayArray1[arg0] = null;
		}
		Static113.aBooleanArray17[arg0] = false;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public static void method1718() {
		Static39.aClass4_62.method1527();
		Static46.aClass2_Sub1_Sub2_Sub2_12.method637(0, 0);
		Static37.anIntArray137 = Static24.method696(Static37.anIntArray137);
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
	public static void method1719() {
		if (Static58.aString5.toLowerCase().indexOf("microsoft") != -1) {
			Static111.anIntArray350[186] = 57;
			Static111.anIntArray350[187] = 27;
			Static111.anIntArray350[188] = 71;
			Static111.anIntArray350[189] = 26;
			Static111.anIntArray350[190] = 72;
			Static111.anIntArray350[191] = 73;
			Static111.anIntArray350[192] = 58;
			Static111.anIntArray350[219] = 42;
			Static111.anIntArray350[220] = 74;
			Static111.anIntArray350[221] = 43;
			Static111.anIntArray350[222] = 59;
			Static111.anIntArray350[223] = 28;
			return;
		}
		Static111.anIntArray350[44] = 71;
		Static111.anIntArray350[45] = 26;
		Static111.anIntArray350[46] = 72;
		Static111.anIntArray350[47] = 73;
		Static111.anIntArray350[59] = 57;
		Static111.anIntArray350[61] = 27;
		Static111.anIntArray350[91] = 42;
		Static111.anIntArray350[92] = 74;
		Static111.anIntArray350[93] = 43;
		if (Static58.aMethod2 == null) {
			Static111.anIntArray350[192] = 58;
			Static111.anIntArray350[222] = 59;
		} else {
			Static111.anIntArray350[192] = 28;
			Static111.anIntArray350[222] = 58;
			Static111.anIntArray350[520] = 59;
		}
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
	public static void method1720() {
		anIntArrayArray25 = null;
		aClass1_2698 = null;
		anIntArray323 = null;
		aClass4_60 = null;
		aClass2_Sub3_Sub1_3 = null;
		aClass1_2687 = null;
		aClass1_2692 = null;
		aClass1_2689 = null;
		aClass1_2696 = null;
		aClass1_2694 = null;
		aClass1_2695 = null;
		aClass1_2688 = null;
		aClass1_2686 = null;
		aClass1_2693 = null;
		aClass1_2691 = null;
		aClass1_2697 = null;
		aClass1_2690 = null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IBIII)V")
	public static void method1721(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) int local15 = arg0; local15 <= arg0 + arg1; local15++) {
			for (@Pc(19) int local19 = arg3; local19 <= arg2 + arg3; local19++) {
				if (local19 >= 0 && local19 < 104 && local15 >= 0 && local15 < 104) {
					Static32.aByteArrayArrayArray4[0][local19][local15] = 127;
					if (arg3 == local19 && local19 > 0) {
						Static50.anIntArrayArrayArray7[0][local19][local15] = Static50.anIntArrayArrayArray7[0][local19 - 1][local15];
					}
					if (arg3 + arg2 == local19 && local19 < 103) {
						Static50.anIntArrayArrayArray7[0][local19][local15] = Static50.anIntArrayArrayArray7[0][local19 + 1][local15];
					}
					if (arg0 == local15 && local15 > 0) {
						Static50.anIntArrayArrayArray7[0][local19][local15] = Static50.anIntArrayArrayArray7[0][local19][local15 - 1];
					}
					if (local15 == arg0 + arg1 && local15 < 103) {
						Static50.anIntArrayArrayArray7[0][local19][local15] = Static50.anIntArrayArrayArray7[0][local19][local15 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
	public static void method1722() {
		for (@Pc(14) Class2_Sub1_Sub1_Sub6 local14 = (Class2_Sub1_Sub1_Sub6) Static93.aClass46_10.method1435(); local14 != null; local14 = (Class2_Sub1_Sub1_Sub6) Static93.aClass46_10.method1442()) {
			if (local14.anInt2501 != Static2.anInt287 || local14.aBoolean146) {
				local14.method1820();
			} else if (Static69.anInt2806 >= local14.anInt2495) {
				local14.method1657(Static8.anInt509);
				if (local14.aBoolean146) {
					local14.method1820();
				} else {
					Static109.aClass3_1.method166(local14.anInt2501, local14.anInt2504, local14.anInt2500, local14.anInt2496, 60, local14, 0, -1, false);
				}
			}
		}
	}
}
