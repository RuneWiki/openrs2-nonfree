import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "Lclient!tb;")
	public static Class64_Sub1 aClass64_Sub1_8;

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "[Lclient!ub;")
	public static Class3_Sub1_Sub4_Sub2[] aClass3_Sub1_Sub4_Sub2Array7;

	@OriginalMember(owner = "client!fd", name = "B", descriptor = "J")
	public static long aLong36;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "Lclient!ad;")
	public static Class4 aClass4_452 = Static75.method1216("(U");

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
	public static int anInt951 = 0;

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
	public static int anInt954 = 0;

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "Lclient!ad;")
	public static Class4 aClass4_453 = Static75.method1216(" )2> @cya@");

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "Lclient!ad;")
	public static Class4 aClass4_454 = Static75.method1216("lila:");

	@OriginalMember(owner = "client!fd", name = "t", descriptor = "Lclient!ad;")
	public static Class4 aClass4_455 = Static75.method1216(" hat sich eingeloggt)3");

	@OriginalMember(owner = "client!fd", name = "v", descriptor = "Lclient!ad;")
	public static Class4 aClass4_456 = Static75.method1216("M");

	@OriginalMember(owner = "client!fd", name = "x", descriptor = "[J")
	public static long[] aLongArray9 = new long[200];

	@OriginalMember(owner = "client!fd", name = "y", descriptor = "I")
	public static int anInt958 = 0;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BIILclient!rd;)Lclient!ub;")
	public static Class3_Sub1_Sub4_Sub2 method623(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class64 arg2) {
		return Static5.method161(arg0, arg2, arg1) ? Static13.method217() : null;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
	public static void method624() {
		Static88.aClass25_103.method1157();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
	public static void method626() {
		aClass64_Sub1_8 = null;
		aLongArray9 = null;
		aClass3_Sub1_Sub4_Sub2Array7 = null;
		aClass4_454 = null;
		aClass4_456 = null;
		aClass4_452 = null;
		aClass4_455 = null;
		aClass4_453 = null;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(JI)V")
	public static void method627(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static87.anInt1451 >= 100 && Static51.anInt1255 != 1 || Static87.anInt1451 >= 200) {
			Static21.method296(Static54.aClass4_679, Static113.aClass4_1604, 0);
			return;
		}
		@Pc(35) Class4 local35 = Static96.method1165(arg0).method130();
		for (@Pc(37) int local37 = 0; local37 < Static87.anInt1451; local37++) {
			if (arg0 == aLongArray9[local37]) {
				Static21.method296(Static60.method1012(new Class4[] { local35, Static32.aClass4_464 }), Static113.aClass4_1604, 0);
				return;
			}
		}
		for (@Pc(68) int local68 = 0; local68 < Static28.anInt869; local68++) {
			if (arg0 == Static13.aLongArray6[local68]) {
				Static21.method296(Static60.method1012(new Class4[] { Static98.aClass4_1301, local35, Static20.aClass4_247 }), Static113.aClass4_1604, 0);
				return;
			}
		}
		if (local35.method151(Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.aClass4_1302)) {
			return;
		}
		Static21.aClass4Array2[Static87.anInt1451] = local35;
		aLongArray9[Static87.anInt1451] = arg0;
		Static36.anIntArray101[Static87.anInt1451] = 0;
		Static87.anInt1451++;
		Static39.aBoolean74 = true;
		Static5.aClass3_Sub4_Sub1_1.method464(199);
		Static5.aClass3_Sub4_Sub1_1.method456(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!rd;III)[Lclient!uc;")
	public static Class3_Sub1_Sub4_Sub3[] method629(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return Static5.method161(arg1, arg0, arg2) ? Static89.method1401() : null;
	}
}
