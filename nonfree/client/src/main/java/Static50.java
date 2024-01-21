import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "Lclient!wa;")
	public static Class23 aClass23_22;

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
	public static int anInt1081;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
	public static int anInt1080 = 0;

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "[I")
	public static final int[] anIntArray100 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
	public static int anInt1082 = 0;

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_360 = Static161.method2452("Loaded fonts");

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_361 = Static161.method2452("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
	public static int anInt1085 = 0;

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "Lclient!dc;")
	public static Class20 aClass20_362 = aClass20_360;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB)Z")
	public static boolean method886(@OriginalArg(0) int arg0) {
		return (-arg0 & arg0) == arg0;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZI)Lclient!sj;")
	public static Class5_Sub2_Sub20 method887(@OriginalArg(1) int arg0) {
		@Pc(10) Class5_Sub2_Sub20 local10 = (Class5_Sub2_Sub20) Static1.aClass8_4.method227((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(31) byte[] local31 = Static181.aClass23_66.method738(Static180.method2727(arg0), Static175.method2665(arg0));
		local10 = new Class5_Sub2_Sub20();
		local10.anInt3602 = arg0;
		if (local31 != null) {
			local10.method2720(new Class5_Sub6(local31));
		}
		local10.method2729();
		Static1.aClass8_4.method232((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)I")
	public static int method888(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
