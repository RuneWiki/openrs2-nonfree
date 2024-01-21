import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!eb", name = "L", descriptor = "[[S")
	public static short[][] aShortArrayArray7;

	@OriginalMember(owner = "client!eb", name = "V", descriptor = "[Lclient!qb;")
	public static Class2_Sub1_Sub2_Sub4[] aClass2_Sub1_Sub2_Sub4Array3;

	@OriginalMember(owner = "client!eb", name = "B", descriptor = "[Lclient!je;")
	public static Class40[] aClass40Array1 = new Class40[500];

	@OriginalMember(owner = "client!eb", name = "E", descriptor = "Lclient!je;")
	private static Class40 aClass40_386 = Static69.method1231("scroll:");

	@OriginalMember(owner = "client!eb", name = "I", descriptor = "Lclient!je;")
	public static Class40 aClass40_387 = Static69.method1231("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!eb", name = "M", descriptor = "Lclient!je;")
	public static Class40 aClass40_388 = aClass40_386;

	@OriginalMember(owner = "client!eb", name = "R", descriptor = "Z")
	public static boolean aBoolean50 = false;

	@OriginalMember(owner = "client!eb", name = "T", descriptor = "Lclient!je;")
	public static Class40 aClass40_389 = aClass40_386;

	@OriginalMember(owner = "client!eb", name = "W", descriptor = "J")
	public static long aLong17 = 0L;

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)Lclient!kd;")
	public static Class2_Sub1_Sub2_Sub1 method420() {
		@Pc(7) Class2_Sub1_Sub2_Sub1 local7 = new Class2_Sub1_Sub2_Sub1();
		local7.anInt1631 = Static57.anIntArray149[0];
		local7.anIntArray164 = Static69.anIntArray205;
		local7.anInt1635 = Static105.anIntArray287[0];
		local7.anInt1633 = Static16.anInt410;
		local7.anInt1630 = Static3.anIntArray5[0];
		local7.aByteArray19 = Static127.aByteArrayArray9[0];
		local7.anInt1632 = Static3.anIntArray6[0];
		local7.anInt1634 = Static10.anInt2972;
		Static126.method2088();
		return local7;
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)V")
	public static void method421() {
		Static32.aClass55_30.method1413();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BJ)V")
	public static void method422(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < Static75.anInt1945; local12++) {
			if (Static10.aLongArray8[local12] == arg0) {
				Static75.anInt1945--;
				for (@Pc(30) int local30 = local12; local30 < Static75.anInt1945; local30++) {
					Static10.aLongArray8[local30] = Static10.aLongArray8[local30 + 1];
					Static56.aClass40Array5[local30] = Static56.aClass40Array5[local30 + 1];
				}
				Static21.anInt643 = Static70.anInt1886;
				Static57.aClass2_Sub9_Sub1_2.method673(239);
				Static57.aClass2_Sub9_Sub1_2.method647(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V")
	public static void method424() {
		aClass40_389 = null;
		aClass40_388 = null;
		aClass40_386 = null;
		aClass40_387 = null;
		aClass40Array1 = null;
		aShortArrayArray7 = null;
		aClass2_Sub1_Sub2_Sub4Array3 = null;
	}
}
