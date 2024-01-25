import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
	public static int anInt6125;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "Lclient!hs;")
	public static Class14_Sub25 aClass14_Sub25_2;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "[I")
	public static final int[] anIntArray446 = new int[8];

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray37 = new int[128][128];

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)[Lclient!saa;")
	public static Class310[] method5090() {
		return new Class310[] { Static174.aClass310_20, Static204.aClass310_17, Static79.aClass310_2, Static334.aClass310_8, Static558.aClass310_16, Static45.aClass310_1, Static575.aClass310_18, Static339.aClass310_9, Static509.aClass310_14, Static427.aClass310_11 };
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BI)V")
	public static void method5091(@OriginalArg(1) int arg0) {
		@Pc(11) Class14_Sub3_Sub9 local11 = Static142.method2219((long) arg0, 10);
		local11.method2822();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Z")
	public static boolean method5092(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
