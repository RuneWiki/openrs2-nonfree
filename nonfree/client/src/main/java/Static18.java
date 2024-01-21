import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
	public static int anInt3874;

	@OriginalMember(owner = "client!bi", name = "t", descriptor = "Lclient!gb;")
	public static Class1_Sub2_Sub8_Sub1_Sub1 aClass1_Sub2_Sub8_Sub1_Sub1_7;

	@OriginalMember(owner = "client!bi", name = "v", descriptor = "Lclient!nf;")
	public static Class69_Sub1 aClass69_Sub1_128;

	@OriginalMember(owner = "client!bi", name = "q", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1113 = Static81.method1507("Please reload this page)3");

	@OriginalMember(owner = "client!bi", name = "s", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1114 = Static81.method1507("Please use a different world)3");

	@OriginalMember(owner = "client!bi", name = "u", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1115 = Static81.method1507("http:)4)4");

	@OriginalMember(owner = "client!bi", name = "x", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1116 = aClass24_1114;

	@OriginalMember(owner = "client!bi", name = "y", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1117 = aClass24_1113;

	@OriginalMember(owner = "client!bi", name = "z", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1118 = aClass24_1114;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)I")
	public static int method2994(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(33) int local33 = (local24 * arg0 >> 12) + 40960;
		return local33 * local9 >> 12;
	}
}
