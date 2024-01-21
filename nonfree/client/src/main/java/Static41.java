import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!i", name = "h", descriptor = "I")
	public static int anInt1188;

	@OriginalMember(owner = "client!i", name = "j", descriptor = "I")
	public static int anInt1190;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "Lclient!ke;")
	public static Class39 aClass39_516 = null;

	@OriginalMember(owner = "client!i", name = "r", descriptor = "Lclient!ke;")
	private static Class39 aClass39_523 = Static2.method66("Moderator option: Mute player for 48 hours: <OFF>");

	@OriginalMember(owner = "client!i", name = "c", descriptor = "Lclient!ke;")
	public static Class39 aClass39_517 = aClass39_523;

	@OriginalMember(owner = "client!i", name = "d", descriptor = "Lclient!ke;")
	private static Class39 aClass39_518 = Static2.method66("level)2");

	@OriginalMember(owner = "client!i", name = "f", descriptor = "Lclient!ke;")
	public static Class39 aClass39_519 = Static2.method66("backleft2");

	@OriginalMember(owner = "client!i", name = "g", descriptor = "Lclient!ie;")
	public static Class34 aClass34_21 = new Class34();

	@OriginalMember(owner = "client!i", name = "i", descriptor = "I")
	public static int anInt1189 = 0;

	@OriginalMember(owner = "client!i", name = "k", descriptor = "Lclient!ke;")
	public static Class39 aClass39_520 = Static2.method66("::noclip");

	@OriginalMember(owner = "client!i", name = "p", descriptor = "Lclient!ke;")
	public static Class39 aClass39_521 = Static2.method66("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!i", name = "q", descriptor = "Lclient!ke;")
	public static Class39 aClass39_522 = Static2.method66("Menge eingeben:");

	@OriginalMember(owner = "client!i", name = "u", descriptor = "Lclient!ke;")
	public static Class39 aClass39_524 = aClass39_518;

	@OriginalMember(owner = "client!i", name = "v", descriptor = "Lclient!ke;")
	public static Class39 aClass39_525 = Static2.method66("lila:");

	@OriginalMember(owner = "client!i", name = "x", descriptor = "I")
	public static int anInt1195 = 0;

	@OriginalMember(owner = "client!i", name = "y", descriptor = "Lclient!ke;")
	private static Class39 aClass39_526 = Static2.method66("Loaded config");

	@OriginalMember(owner = "client!i", name = "z", descriptor = "I")
	public static int anInt1196 = 0;

	@OriginalMember(owner = "client!i", name = "A", descriptor = "I")
	public static int anInt1197 = -1;

	@OriginalMember(owner = "client!i", name = "B", descriptor = "Lclient!ke;")
	public static Class39 aClass39_527 = aClass39_526;

	@OriginalMember(owner = "client!i", name = "C", descriptor = "[Lclient!kb;")
	public static Class2_Sub1_Sub4_Sub2[] aClass2_Sub1_Sub4_Sub2Array6 = new Class2_Sub1_Sub4_Sub2[1000];

	@OriginalMember(owner = "client!i", name = "E", descriptor = "I")
	public static int anInt1198 = 0;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIZIII)I")
	public static int method826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg3 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(19) int local19 = arg5;
			arg5 = arg4;
			arg4 = local19;
		}
		if (local8 == 0) {
			return arg1;
		} else if (local8 == 1) {
			return arg2;
		} else if (local8 == 2) {
			return 1 + 7 - arg5 - arg1;
		} else {
			return 7 + 1 - arg2 - arg4;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IZ)Lclient!ke;")
	public static Class39 method828(@OriginalArg(0) int arg0) {
		return Static20.method431(new Class39[] { Static31.method1267(arg0 >> 24 & 0xFF), Static95.aClass39_1155, Static31.method1267(arg0 >> 16 & 0xFF), Static95.aClass39_1155, Static31.method1267(arg0 >> 8 & 0xFF), Static95.aClass39_1155, Static31.method1267(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II[B[Lclient!ne;BII)V")
	public static void method829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) Class47[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11;
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			for (@Pc(8) int local8 = 0; local8 < 64; local8++) {
				for (local11 = 0; local11 < 64; local11++) {
					if (arg1 + local8 > 0 && local8 + arg1 < 103 && arg0 + local11 > 0 && arg0 + local11 < 103) {
						arg3[local5].anIntArrayArray20[arg1 + local8][local11 + arg0] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(87) Class2_Sub5 local87 = new Class2_Sub5(arg2);
		for (local11 = 0; local11 < 4; local11++) {
			for (@Pc(92) int local92 = 0; local92 < 64; local92++) {
				for (@Pc(95) int local95 = 0; local95 < 64; local95++) {
					Static6.method2056(arg4, 0, local87, local11, local95 + arg0, arg1 + local92, arg5);
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public static void method831() {
		Static10.method167();
		Static19.method428();
		Static58.method1164();
		Static79.method1968();
		Static58.method1158();
		Static63.method1333();
		Static58.method1155();
		Static69.method1437();
		Static96.method1846();
		Static100.method1949();
		Static68.method1430();
		Static9.method127();
		((Class59) Static106.anInterface1_1).method1728();
		Static18.aClass36_Sub1_4.method1755();
		Static6.aClass36_Sub1_23.method1755();
		Static99.aClass36_Sub1_22.method1755();
		Static58.aClass36_Sub1_14.method1755();
		Static19.aClass36_Sub1_5.method1755();
		Static50.aClass36_Sub1_12.method1755();
		Static24.aClass36_Sub1_6.method1755();
		Static21.aClass36_Sub1_21.method1755();
		Static47.aClass36_Sub1_10.method1755();
		Static86.aClass36_Sub1_18.method1755();
		Static49.aClass36_Sub1_11.method1755();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
	public static void method832() {
		aClass39_527 = null;
		aClass39_520 = null;
		aClass39_522 = null;
		aClass34_21 = null;
		aClass2_Sub1_Sub4_Sub2Array6 = null;
		aClass39_519 = null;
		aClass39_525 = null;
		aClass39_526 = null;
		aClass39_518 = null;
		aClass39_524 = null;
		aClass39_516 = null;
		aClass39_523 = null;
		aClass39_517 = null;
		aClass39_521 = null;
	}
}
