import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
	public static int anInt5904;

	@OriginalMember(owner = "client!ta", name = "u", descriptor = "Lclient!ve;")
	public static Class66 aClass66_5;

	@OriginalMember(owner = "client!ta", name = "C", descriptor = "[Lclient!wn;")
	public static Class95[] aClass95Array15;

	@OriginalMember(owner = "client!ta", name = "s", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_124 = new Class85("cyan:", "", "", "");

	@OriginalMember(owner = "client!ta", name = "x", descriptor = "J")
	public static long aLong199 = 0L;

	@OriginalMember(owner = "client!ta", name = "A", descriptor = "Z")
	public static boolean aBoolean489 = false;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBI)V")
	public static void method5313(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class190 local8 = new Class190(16);
		for (@Pc(20) Class5_Sub29 local20 = (Class5_Sub29) Static343.aClass190_33.method5471(); local20 != null; local20 = (Class5_Sub29) Static343.aClass190_33.method5465()) {
			local20.method6005();
			@Pc(30) int local30 = (int) (local20.aLong235 >> 28);
			@Pc(41) int local41 = (int) (local20.aLong235 >> 14 & 0x3FFFL) - arg1;
			@Pc(50) int local50 = (int) (local20.aLong235 & 0x3FFFL) - arg0;
			if (local50 >= 0 && local41 >= 0 && Static22.anInt481 > local50 && local41 < Static269.anInt5281) {
				local8.method5464(local20, (long) (local30 << 28 | local41 << 14 | local50));
			}
		}
		Static343.aClass190_33 = local8;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BI)V")
	public static void method5314() {
		Static239.aClass109_48.method2859(5);
	}
}
