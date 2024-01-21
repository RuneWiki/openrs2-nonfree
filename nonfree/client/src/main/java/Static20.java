import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!d", name = "W", descriptor = "Lclient!aa;")
	public static Class2 aClass2_1;

	@OriginalMember(owner = "client!d", name = "lb", descriptor = "Lclient!lc;")
	public static Class40 aClass40_15;

	@OriginalMember(owner = "client!d", name = "L", descriptor = "Lclient!qc;")
	private static Class60 aClass60_209 = Static121.method2047("Your account has been disabled)3");

	@OriginalMember(owner = "client!d", name = "I", descriptor = "Lclient!qc;")
	public static Class60 aClass60_208 = aClass60_209;

	@OriginalMember(owner = "client!d", name = "J", descriptor = "[I")
	public static int[] anIntArray32 = new int[500];

	@OriginalMember(owner = "client!d", name = "M", descriptor = "Lclient!qc;")
	public static Class60 aClass60_210 = Static121.method2047("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!d", name = "V", descriptor = "I")
	public static int anInt578 = 0;

	@OriginalMember(owner = "client!d", name = "ab", descriptor = "[Lclient!ua;")
	public static Class73[] aClass73Array1 = new Class73[50];

	@OriginalMember(owner = "client!d", name = "db", descriptor = "Lclient!qc;")
	private static Class60 aClass60_212 = Static121.method2047("Ok");

	@OriginalMember(owner = "client!d", name = "cb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_211 = aClass60_212;

	@OriginalMember(owner = "client!d", name = "eb", descriptor = "I")
	public static volatile int anInt582 = 0;

	@OriginalMember(owner = "client!d", name = "hb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_213 = Static121.method2047("mn");

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(II)V")
	public static void method359(@OriginalArg(0) int arg0) {
		if (arg0 == -1 && !Static103.aBoolean61) {
			Static31.method599();
		} else if (arg0 != -1 && Static108.anInt2556 != arg0 && Static64.anInt1714 != 0 && !Static103.aBoolean61) {
			Static125.method2069(Static5.aClass40_Sub1_3, 0, Static64.anInt1714, arg0);
		}
		Static108.anInt2556 = arg0;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZI)I")
	public static int method360(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(6) int local6 = local0 | local0 >>> 1;
		@Pc(12) int local12 = local6 | local6 >>> 2;
		@Pc(18) int local18 = local12 | local12 >>> 4;
		@Pc(33) int local33 = local18 | local18 >>> 8;
		@Pc(43) int local43 = local33 | local33 >>> 16;
		return local43 + 1;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V")
	public static void method362() {
		anIntArray32 = null;
		aClass60_213 = null;
		aClass60_211 = null;
		aClass60_209 = null;
		aClass40_15 = null;
		aClass2_1 = null;
		aClass73Array1 = null;
		aClass60_212 = null;
		aClass60_210 = null;
		aClass60_208 = null;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IBII)I")
	public static int method365(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg2;
		@Pc(13) int local13 = arg2 - 1 & arg1;
		@Pc(17) int local17 = arg0 / arg2;
		@Pc(23) int local23 = arg2 - 1 & arg0;
		@Pc(28) int local28 = Static71.method1372(local17, local7);
		@Pc(35) int local35 = Static71.method1372(local17, local7 + 1);
		@Pc(42) int local42 = Static71.method1372(local17 + 1, local7);
		@Pc(58) int local58 = Static71.method1372(local17 + 1, local7 + 1);
		@Pc(65) int local65 = Static128.method1876(local13, local28, arg2, local35);
		@Pc(72) int local72 = Static128.method1876(local13, local42, arg2, local58);
		return Static128.method1876(local23, local65, arg2, local72);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BIII)Lclient!r;")
	public static Class4_Sub18 method366(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class4_Sub18 local7 = new Class4_Sub18();
		local7.anInt2402 = arg2;
		local7.anInt2399 = arg0;
		Static111.aClass66_12.method1830(local7, (long) arg1);
		Static8.method118(arg2);
		Static26.method507(arg2);
		@Pc(34) Class4_Sub17 local34 = Static16.method283(arg1);
		if (local34 != null) {
			Static130.method2133(local34);
		}
		if (Static11.aClass4_Sub17_1 != null) {
			Static130.method2133(Static11.aClass4_Sub17_1);
			Static11.aClass4_Sub17_1 = null;
		}
		Static25.anInt693 = 0;
		Static93.aBoolean105 = false;
		Static26.method505(Static46.anInt1203, Static31.anInt849, Static33.anInt889, Static55.anInt1407);
		if (Static23.anInt664 != -1) {
			Static11.method207(Static23.anInt664, 1);
		}
		return local7;
	}
}
