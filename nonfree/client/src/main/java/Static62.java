import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!hg", name = "pb", descriptor = "[I")
	public static int[] anIntArray163;

	@OriginalMember(owner = "client!hg", name = "Z", descriptor = "Lclient!ea;")
	public static Class18 aClass18_472 = Static8.method128("");

	@OriginalMember(owner = "client!hg", name = "cb", descriptor = "[S")
	public static short[] aShortArray12 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!hg", name = "fb", descriptor = "I")
	public static int anInt1924 = 0;

	@OriginalMember(owner = "client!hg", name = "jb", descriptor = "Lclient!ea;")
	private static Class18 aClass18_473 = Static8.method128(" seconds)3");

	@OriginalMember(owner = "client!hg", name = "kb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_474 = aClass18_472;

	@OriginalMember(owner = "client!hg", name = "lb", descriptor = "I")
	public static int anInt1927 = 0;

	@OriginalMember(owner = "client!hg", name = "nb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_475 = Static8.method128("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!hg", name = "rb", descriptor = "I")
	public static int anInt1930 = -1;

	@OriginalMember(owner = "client!hg", name = "ub", descriptor = "Lclient!ea;")
	public static Class18 aClass18_476 = aClass18_473;

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(II)Lclient!lh;")
	public static Class1_Sub1_Sub11 method1274(@OriginalArg(0) int arg0) {
		@Pc(6) Class1_Sub1_Sub11 local6 = (Class1_Sub1_Sub11) Static177.aClass66_27.method2599((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(22) byte[] local22 = Static173.aClass16_38.method2254(arg0, 6);
		local6 = new Class1_Sub1_Sub11();
		local6.anInt2823 = arg0;
		if (local22 != null) {
			local6.method1971(new Class1_Sub6(local22));
		}
		local6.method1965();
		if (local6.aBoolean118) {
			local6.aBoolean114 = false;
			local6.anInt2820 = 0;
		}
		Static177.aClass66_27.method2597((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZLclient!dd;BLclient!m;Lclient!dd;)V")
	public static void method1275(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(3) Class1_Sub1_Sub8_Sub2_Sub1 arg2, @OriginalArg(4) Class16 arg3) {
		Static113.aClass16_33 = arg3;
		Static71.aBoolean83 = arg0;
		Static76.aClass16_8 = arg1;
		Static81.anInt2488 = Static76.aClass16_8.method2252(10);
		Static89.aClass1_Sub1_Sub8_Sub2_Sub1_25 = arg2;
	}

	@OriginalMember(owner = "client!hg", name = "i", descriptor = "(I)V")
	public static void method1276() {
		aClass18_473 = null;
		aClass18_475 = null;
		aClass18_476 = null;
		aClass18_472 = null;
		anIntArray163 = null;
		aClass18_474 = null;
		aShortArray12 = null;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(JZ)V")
	public static void method1277(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static20.anInt570 >= 100 && Static65.anInt1964 != 1 || Static20.anInt570 >= 200) {
			Static88.method1922(aClass18_472, 0, Static27.aClass18_234);
			return;
		}
		@Pc(37) Class18 local37 = Static124.method2453(arg0).method739();
		for (@Pc(39) int local39 = 0; local39 < Static20.anInt570; local39++) {
			if (arg0 == Static146.aLongArray5[local39]) {
				Static88.method1922(aClass18_472, 0, Static144.method2735(new Class18[] { local37, Static71.aClass18_526 }));
				return;
			}
		}
		for (@Pc(78) int local78 = 0; local78 < Static39.anInt1205; local78++) {
			if (arg0 == Static162.aLongArray6[local78]) {
				Static88.method1922(aClass18_472, 0, Static144.method2735(new Class18[] { Static156.aClass18_1102, local37, Static92.aClass18_697 }));
				return;
			}
		}
		if (local37.method723(Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.aClass18_908)) {
			Static88.method1922(aClass18_472, 0, Static8.aClass18_88);
			return;
		}
		Static142.aClass18Array20[Static20.anInt570] = local37;
		Static146.aLongArray5[Static20.anInt570] = arg0;
		Static20.anIntArray43[Static20.anInt570] = 0;
		Static156.anIntArray394[Static20.anInt570] = 0;
		Static20.anInt570++;
		Static159.anInt4381 = Static167.anInt4526;
		Static95.aClass1_Sub6_Sub1_1.method555(131);
		Static95.aClass1_Sub6_Sub1_1.method515(arg0);
	}
}
