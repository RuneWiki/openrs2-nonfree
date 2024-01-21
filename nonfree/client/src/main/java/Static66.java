import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!hc", name = "eb", descriptor = "I")
	public static int anInt1388;

	@OriginalMember(owner = "client!hc", name = "hb", descriptor = "I")
	public static int anInt1389;

	@OriginalMember(owner = "client!hc", name = "lb", descriptor = "I")
	public static int anInt1393;

	@OriginalMember(owner = "client!hc", name = "ob", descriptor = "I")
	public static int anInt1395;

	@OriginalMember(owner = "client!hc", name = "pb", descriptor = "I")
	public static int anInt1396;

	@OriginalMember(owner = "client!hc", name = "cb", descriptor = "[J")
	public static long[] aLongArray10 = new long[500];

	@OriginalMember(owner = "client!hc", name = "fb", descriptor = "Lclient!tf;")
	public static Class81 aClass81_5 = new Class81();

	@OriginalMember(owner = "client!hc", name = "gb", descriptor = "[I")
	public static int[] anIntArray168 = new int[50];

	@OriginalMember(owner = "client!hc", name = "mb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_733 = Static32.method683("<)4col>");

	@OriginalMember(owner = "client!hc", name = "nb", descriptor = "I")
	public static int anInt1394 = 0;

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(Z)V")
	public static void method1121() {
		anIntArray168 = null;
		aClass49_733 = null;
		aClass81_5 = null;
		aLongArray10 = null;
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V")
	public static void method1122() {
		for (@Pc(7) int local7 = -1; local7 < Static139.anInt2969; local7++) {
			@Pc(17) int local17;
			if (local7 == -1) {
				local17 = 2047;
			} else {
				local17 = Static110.anIntArray221[local7];
			}
			@Pc(25) Class2_Sub2_Sub3_Sub7_Sub2 local25 = Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[local17];
			if (local25 != null) {
				Static36.method753(local25, 1);
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)Lclient!ac;")
	public static Class2_Sub2_Sub1 method1123(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2_Sub1 local10 = (Class2_Sub2_Sub1) Static93.aClass74_59.method2345((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static145.aClass11_110.method2049(arg0, 8);
		local10 = new Class2_Sub2_Sub1();
		if (local20 != null) {
			local10.method48(new Class2_Sub13(local20));
		}
		Static93.aClass74_59.method2341((long) arg0, local10);
		return local10;
	}
}
