import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "Lclient!pc;")
	public static Class12 aClass12_23;

	@OriginalMember(owner = "client!ge", name = "z", descriptor = "I")
	public static int anInt869;

	@OriginalMember(owner = "client!ge", name = "F", descriptor = "[I")
	public static int[] anIntArray160;

	@OriginalMember(owner = "client!ge", name = "M", descriptor = "Lclient!ab;")
	public static Class3_Sub1_Sub1 aClass3_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "Lclient!db;")
	public static Class14 aClass14_4 = new Class14(32);

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "[I")
	public static int[] anIntArray159 = new int[50];

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "J")
	public static long aLong33 = 0L;

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "Lclient!hb;")
	private static Class27 aClass27_428 = Static87.method1648("Existing user");

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "Lclient!hb;")
	public static Class27 aClass27_429 = aClass27_428;

	@OriginalMember(owner = "client!ge", name = "D", descriptor = "Lclient!hb;")
	private static Class27 aClass27_432 = Static87.method1648("Your account is already logged in)3");

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "Lclient!hb;")
	public static Class27 aClass27_430 = aClass27_432;

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "Lclient!hb;")
	private static Class27 aClass27_431 = Static87.method1648("Members object");

	@OriginalMember(owner = "client!ge", name = "E", descriptor = "Lclient!hb;")
	public static Class27 aClass27_433 = aClass27_431;

	@OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
	public static final int anInt873 = 3353893;

	@OriginalMember(owner = "client!ge", name = "H", descriptor = "Lclient!m;")
	public static Class3_Sub3_Sub6 aClass3_Sub3_Sub6_1 = new Class3_Sub3_Sub6();

	@OriginalMember(owner = "client!ge", name = "I", descriptor = "Lclient!hb;")
	public static Class27 aClass27_434 = Static87.method1648("Mitteilung");

	@OriginalMember(owner = "client!ge", name = "L", descriptor = "Lclient!hb;")
	private static Class27 aClass27_437 = Static87.method1648("Examine");

	@OriginalMember(owner = "client!ge", name = "J", descriptor = "Lclient!hb;")
	public static Class27 aClass27_435 = aClass27_437;

	@OriginalMember(owner = "client!ge", name = "K", descriptor = "Lclient!hb;")
	public static Class27 aClass27_436 = Static87.method1648("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!ge", name = "N", descriptor = "Lclient!hb;")
	public static Class27 aClass27_438 = Static87.method1648("backvmid2");

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	public static void method692() {
		Static102.aClass12_78.method674();
		Static24.aClass3_Sub3_Sub2_Sub4_30.method1332(0, 0);
		Static8.anIntArray44 = Static51.method1015(Static8.anIntArray44);
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
	public static void method693() {
		aClass27_433 = null;
		aClass27_432 = null;
		aClass27_438 = null;
		anIntArray160 = null;
		aClass27_428 = null;
		aClass12_23 = null;
		anIntArray159 = null;
		aClass27_434 = null;
		aClass27_437 = null;
		aClass27_431 = null;
		aClass27_430 = null;
		aClass3_Sub1_Sub1_1 = null;
		aClass14_4 = null;
		aClass27_435 = null;
		aClass27_436 = null;
		aClass27_429 = null;
		aClass3_Sub3_Sub6_1 = null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)Lclient!hb;")
	public static Class27 method694(@OriginalArg(1) int arg0) {
		@Pc(9) Class27 local9 = Static97.method1616(arg0);
		for (@Pc(15) int local15 = local9.method765() - 3; local15 > 0; local15 -= 3) {
			local9 = Static98.method1779(new Class27[] { local9.method747(0, local15), Static12.aClass27_150, local9.method731(local15) });
		}
		if (local9.method765() > 8) {
			local9 = Static98.method1779(new Class27[] { Static92.aClass27_1211, local9.method747(0, local9.method765() - 8), Static84.aClass27_1060, Static82.aClass27_1058, local9, Static71.aClass27_909 });
		} else if (local9.method765() > 4) {
			local9 = Static98.method1779(new Class27[] { Static67.aClass27_850, local9.method747(0, local9.method765() - 4), Static87.aClass27_1107, Static82.aClass27_1058, local9, Static71.aClass27_909 });
		}
		return Static98.method1779(new Class27[] { Static101.aClass27_1270, local9 });
	}
}
