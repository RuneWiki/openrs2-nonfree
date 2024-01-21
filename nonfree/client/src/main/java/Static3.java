import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "ab", descriptor = "[I")
	public static int[] anIntArray5;

	@OriginalMember(owner = "client!ac", name = "M", descriptor = "J")
	public static long aLong5 = 0L;

	@OriginalMember(owner = "client!ac", name = "S", descriptor = "Lclient!ea;")
	private static Class18 aClass18_63 = Static8.method128("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!ac", name = "U", descriptor = "[J")
	public static long[] aLongArray1 = new long[32];

	@OriginalMember(owner = "client!ac", name = "db", descriptor = "Lclient!ea;")
	public static Class18 aClass18_64 = Static8.method128("<col=ff9040>");

	@OriginalMember(owner = "client!ac", name = "fb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_65 = aClass18_63;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILclient!dd;B)[Lclient!k;")
	public static Class1_Sub1_Sub8_Sub3[] method74(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2) {
		return Static65.method1300(arg0, arg2, arg1) ? Static47.method2895() : null;
	}

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "(I)V")
	public static void method78() {
		aLongArray1 = null;
		aClass18_64 = null;
		aClass18_63 = null;
		aClass18_65 = null;
		anIntArray5 = null;
	}
}
