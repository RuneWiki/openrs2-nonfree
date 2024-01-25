import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "[J")
	public static final long[] aLongArray1 = new long[32];

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
	public static final int anInt63 = 1401;

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
	public static int anInt65 = 0;

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_5 = new Class48(47, 3);

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "[I")
	public static final int[] anIntArray10 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)Z")
	public static boolean method56(@OriginalArg(0) int arg0) {
		if (arg0 == 60 || arg0 == 11 || arg0 == 48 || arg0 == 20 || arg0 == 47) {
			return true;
		} else {
			return arg0 == 22 || arg0 == 1009;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!bg;B)V")
	public static void method57(@OriginalArg(0) Class25_Sub1_Sub1_Sub1 arg0) {
		@Pc(17) Class1_Sub18 local17 = (Class1_Sub18) Static48.aClass77_4.method1368((long) arg0.anInt2331);
		if (local17 == null) {
			Static275.method4229(null, arg0, arg0.aByte70, null, 0, arg0.anIntArray295[0], arg0.anIntArray296[0]);
		} else {
			local17.method2348();
		}
	}
}
