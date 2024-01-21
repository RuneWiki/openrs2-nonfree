import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!e", name = "t", descriptor = "Lclient!ve;")
	public static Class69 aClass69_13;

	@OriginalMember(owner = "client!e", name = "s", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_365 = Static81.method1507("Invalid username or password)3");

	@OriginalMember(owner = "client!e", name = "q", descriptor = "Lclient!dj;")
	public static Class24 aClass24_364 = aClass24_365;

	@OriginalMember(owner = "client!e", name = "v", descriptor = "Lclient!ih;")
	public static final Class46 aClass46_3 = new Class46(30);

	@OriginalMember(owner = "client!e", name = "w", descriptor = "[I")
	public static final int[] anIntArray115 = new int[2048];

	@OriginalMember(owner = "client!e", name = "x", descriptor = "J")
	public static volatile long aLong41 = 0L;

	@OriginalMember(owner = "client!e", name = "y", descriptor = "I")
	public static int anInt1353 = 0;

	@OriginalMember(owner = "client!e", name = "z", descriptor = "I")
	public static int anInt1354 = 0;

	@OriginalMember(owner = "client!e", name = "A", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_366 = Static81.method1507("k");

	@OriginalMember(owner = "client!e", name = "B", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_367 = Static81.method1507("null");

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)Lclient!ed;")
	public static Class1_Sub2_Sub6 method1050(@OriginalArg(0) int arg0) {
		@Pc(6) Class1_Sub2_Sub6 local6 = (Class1_Sub2_Sub6) Static38.aClass86_15.method2816((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(24) byte[] local24 = Static194.aClass69_37.method2208(Static142.method2459(arg0), Static160.method3565(arg0));
		local6 = new Class1_Sub2_Sub6();
		if (local24 != null) {
			local6.method838(new Class1_Sub7(local24));
		}
		Static38.aClass86_15.method2821(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILjava/awt/Component;II)Lclient!ai;")
	public static Class7 method1052(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class7_Sub1");
			@Pc(15) Class7 local15 = (Class7) local6.getDeclaredConstructor().newInstance();
			local15.method1182(arg2, arg0, arg1);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class7_Sub2 local28 = new Class7_Sub2();
			local28.method1182(arg2, arg0, arg1);
			return local28;
		}
	}
}
