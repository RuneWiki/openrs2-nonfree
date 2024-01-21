import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
	public static int anInt2669;

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "Lclient!ve;")
	public static Class69 aClass69_29;

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
	public static int anInt2672;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "[I")
	public static final int[] anIntArray211 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_787 = Static81.method1507("Loaded config");

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "Lclient!dj;")
	public static Class24 aClass24_785 = aClass24_787;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_786 = Static81.method1507(" <col=ffffff>");

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_788 = Static81.method1507("weiss:");

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
	public static int anInt2670 = 0;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!dj;BLclient!dj;Lclient!ve;)Lclient!od;")
	public static Class1_Sub2_Sub8_Sub3 method2030(@OriginalArg(0) Class24 arg0, @OriginalArg(2) Class24 arg1, @OriginalArg(3) Class69 arg2) {
		@Pc(8) int local8 = arg2.method2205(arg0);
		@Pc(19) int local19 = arg2.method2203(local8, arg1);
		return Static148.method2540(arg2, local8, local19);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)V")
	public static void method2031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub8 local7 = Static29.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass96_1 = null;
		}
	}
}
