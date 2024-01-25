import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static578 {

	@OriginalMember(owner = "client!wr", name = "y", descriptor = "[I")
	public static int[] anIntArray845;

	@OriginalMember(owner = "client!wr", name = "t", descriptor = "[I")
	public static final int[] anIntArray844 = new int[200];

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z)V")
	public static void method8143() {
		Static145.method2683(11);
		Static73.method1563();
		System.gc();
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method8146(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = (local15 << 5) + Static139.method2605(arg0.charAt(local17)) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IZ)I")
	public static int method8148(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
