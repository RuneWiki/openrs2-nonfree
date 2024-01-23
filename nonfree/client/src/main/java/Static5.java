import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "Lclient!jd;")
	public static Class84 aClass84_3;

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
	public static int anInt153;

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString7 = "Loaded wordpack";

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "Z")
	public static boolean aBoolean15 = true;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)V")
	public static void method122(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub3_Sub16 local12 = Static119.method2204(arg0, 8);
		local12.method2719();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public static void method123() {
		Static74.aClass46_10.method1079();
		Static285.aClass46_41.method1079();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([II[J)V")
	public static void method125(@OriginalArg(0) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static82.method4610(0, arg1, arg1.length - 1, arg0);
	}
}
