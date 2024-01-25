import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!cga", name = "k", descriptor = "I")
	public static int anInt1691;

	@OriginalMember(owner = "client!cga", name = "c", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_26 = new Class126(19, -1);

	@OriginalMember(owner = "client!cga", name = "i", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_21 = new Class376(21, 7);

	@OriginalMember(owner = "client!cga", name = "j", descriptor = "[[I")
	public static final int[][] anIntArrayArray21 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)V")
	public static void method1619() {
		Static482.method6863(11);
		Static132.method2272();
		System.gc();
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lclient!kh;I)V")
	public static void method1623(@OriginalArg(0) Class208 arg0) {
		@Pc(12) Class208 local12 = Static39.method1159(arg0);
		@Pc(17) int local17;
		@Pc(20) int local20;
		if (local12 == null) {
			local20 = Static483.anInt8181;
			local17 = Static654.anInt10064;
		} else {
			local17 = local12.anInt5639;
			local20 = local12.anInt5630;
		}
		Static391.method5678(arg0, false, local17, local20);
		Static528.method7386(local20, arg0, local17);
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1624(@OriginalArg(0) String arg0) {
		System.exit(1);
	}
}
