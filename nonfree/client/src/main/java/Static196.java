import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!p", name = "h", descriptor = "[I")
	public static int[] anIntArray337 = new int[128];

	@OriginalMember(owner = "client!p", name = "v", descriptor = "[I")
	public static int[] anIntArray338 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

	@OriginalMember(owner = "client!p", name = "B", descriptor = "[I")
	public static int[] anIntArray340 = new int[128];

	@OriginalMember(owner = "client!p", name = "L", descriptor = "Z")
	public static boolean aBoolean342 = false;

	@OriginalMember(owner = "client!p", name = "M", descriptor = "I")
	public static int anInt4105 = 0;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
	public static void method3331(@OriginalArg(0) int arg0) {
		Static11.anInt297 = 20;
		Static77.anInt1651 = 3;
		Static84.anInt827 = arg0;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!vl;B)[Lclient!vn;")
	public static Class178[] method3332(@OriginalArg(0) Class177 arg0) {
		if (!arg0.method4682()) {
			return new Class178[0];
		}
		@Pc(17) Class28 local17 = arg0.method4677();
		while (local17.anInt726 == 0) {
			Static134.method2329(10L);
		}
		if (local17.anInt726 == 2) {
			return new Class178[0];
		}
		@Pc(38) int[] local38 = (int[]) local17.anObject2;
		@Pc(44) Class178[] local44 = new Class178[local38.length >> 2];
		for (@Pc(46) int local46 = 0; local46 < local44.length; local46++) {
			@Pc(54) Class178 local54 = new Class178();
			local44[local46] = local54;
			local54.anInt5877 = local38[local46 << 2];
			local54.anInt5883 = local38[(local46 << 2) + 1];
			local54.anInt5881 = local38[(local46 << 2) + 2];
			local54.anInt5878 = local38[(local46 << 2) + 3];
		}
		return local44;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method3333(@OriginalArg(1) int arg0) {
		return Static214.aStringArray22[arg0].length() > 0 ? Static250.aStringArray28[arg0] + Static208.aString217 + Static214.aStringArray22[arg0] : Static250.aStringArray28[arg0];
	}
}
