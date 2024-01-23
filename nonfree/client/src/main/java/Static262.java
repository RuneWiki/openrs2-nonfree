import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "[I")
	public static int[] anIntArray439;

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "Lclient!lc;")
	public static Class98 aClass98_152;

	@OriginalMember(owner = "client!tn", name = "q", descriptor = "[I")
	public static int[] anIntArray442;

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "[I")
	public static int[] anIntArray440 = new int[50];

	@OriginalMember(owner = "client!tn", name = "h", descriptor = "Lclient!ii;")
	public static Class69 aClass69_12 = new Class69(128);

	@OriginalMember(owner = "client!tn", name = "p", descriptor = "[I")
	public static int[] anIntArray441 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!tn", name = "r", descriptor = "Lclient!lb;")
	public static Class97 aClass97_22 = new Class97(16);

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)V")
	public static void method3967() {
		anIntArray439 = null;
		anIntArray441 = null;
		anIntArray440 = null;
		aClass97_22 = null;
		aClass69_12 = null;
		anIntArray442 = null;
		aClass98_152 = null;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZIZIB)V")
	public static void method3969(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		Static259.method3913(arg1, Static96.aClass53_Sub1Array1.length - 1, arg3, arg2, arg0, 0);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)Lclient!ve;")
	public static Class175 method3970(@OriginalArg(1) int arg0) {
		@Pc(10) Class175 local10 = (Class175) Static36.aClass33_4.method841((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static242.aClass98_150.method2396(Static224.method3576(arg0), Static72.method1079(arg0));
		local10 = new Class175();
		local10.anInt5224 = arg0;
		if (local25 != null) {
			local10.method4125(new Class4_Sub17(local25));
		}
		local10.method4132();
		Static36.aClass33_4.method845(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IZ)V")
	public static void method3971() {
		Static137.aClass33_22.method838(5);
		Static116.aClass33_21.method838(5);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)I")
	public static int method3972() {
		return 6;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BI)Lclient!ok;")
	public static Class126 method3973(@OriginalArg(1) int arg0) {
		@Pc(6) Class126 local6 = (Class126) Static137.aClass33_22.method841((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static14.aClass98_58.method2396(Static111.method1920(arg0), Static87.method1398(arg0));
		local6 = new Class126();
		local6.anInt3812 = arg0;
		if (local25 != null) {
			local6.method3027(new Class4_Sub17(local25));
		}
		Static137.aClass33_22.method845(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(II)Z")
	public static boolean method3974(@OriginalArg(0) int arg0) {
		return arg0 == 4 || arg0 == 8;
	}
}
