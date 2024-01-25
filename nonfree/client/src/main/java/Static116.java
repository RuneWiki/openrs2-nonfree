import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!em", name = "q", descriptor = "I")
	public static int anInt2289;

	@OriginalMember(owner = "client!em", name = "s", descriptor = "F")
	public static float aFloat31;

	@OriginalMember(owner = "client!em", name = "m", descriptor = "Lclient!no;")
	public static final Class240 aClass240_1 = new Class240();

	@OriginalMember(owner = "client!em", name = "o", descriptor = "Lclient!tf;")
	public static final Class316 aClass316_3 = new Class316(1, 7);

	@OriginalMember(owner = "client!em", name = "p", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_74 = new Class235(1, -1);

	@OriginalMember(owner = "client!em", name = "r", descriptor = "Lclient!eca;")
	public static final Class82 aClass82_3 = new Class82();

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZI)V")
	public static void method1836(@OriginalArg(1) int arg0) {
		@Pc(16) Class1_Sub6_Sub16 local16 = Static212.method3332(5, arg0);
		local16.method6593();
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(III)Z")
	public static boolean method1841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
