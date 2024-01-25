import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!et", name = "t", descriptor = "[I")
	public static int[] anIntArray136;

	@OriginalMember(owner = "client!et", name = "k", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_39 = new Class2(54, 3);

	@OriginalMember(owner = "client!et", name = "q", descriptor = "[I")
	public static final int[] anIntArray135 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
	public static void method1747() {
		Static138.method2151(10);
		Static12.method111();
		System.gc();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method1748(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = (local15 << 5) - (local15 - Static20.method1886(arg0.charAt(local17)));
		}
		return local15;
	}
}
