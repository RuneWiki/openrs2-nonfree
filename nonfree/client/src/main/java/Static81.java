import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
	public static int anInt1857 = 0;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "Lclient!tg;")
	public static Class81 aClass81_634 = Static120.method2057("<col=c0ff00>");

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "Lclient!tg;")
	public static Class81 aClass81_635 = Static120.method2057("welle:");

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "Lclient!tg;")
	private static Class81 aClass81_637 = Static120.method2057("Attack");

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "Lclient!tg;")
	public static Class81 aClass81_636 = aClass81_637;

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
	public static int anInt1859 = 0;

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "Lclient!tg;")
	public static Class81 aClass81_638 = Static120.method2057("Lade Sprites )2 ");

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "[Z")
	public static boolean[] aBooleanArray8 = new boolean[8];

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public static void method1360() {
		if (Static80.aClass31_1 != null) {
			Static80.aClass31_1.method3000();
		}
		if (Static139.aClass31_2 != null) {
			Static139.aClass31_2.method3000();
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
	public static void method1361() {
		aClass81_635 = null;
		aClass81_638 = null;
		aClass81_636 = null;
		aBooleanArray8 = null;
		aClass81_637 = null;
		aClass81_634 = null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!ud;Lclient!pb;I)V")
	public static void method1362(@OriginalArg(1) Class82_Sub1 arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class1_Sub7 local7 = new Class1_Sub7();
		local7.aClass66_1 = arg1;
		local7.anInt307 = 1;
		local7.aLong148 = arg2;
		local7.aClass82_Sub1_4 = arg0;
		@Pc(22) Class30 local22 = Static139.aClass30_14;
		synchronized (Static139.aClass30_14) {
			Static139.aClass30_14.method1113(local7);
		}
		Static41.method805();
	}
}
