import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static559 {

	@OriginalMember(owner = "client!tc", name = "v", descriptor = "Lclient!vi;")
	public static Class369 aClass369_3;

	@OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
	public static int anInt9123 = -1;

	@OriginalMember(owner = "client!tc", name = "z", descriptor = "[Z")
	public static final boolean[] aBooleanArray36 = new boolean[8];

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
	public static void method7736() {
		Static109.anInt2331 = 0;
		Static494.anInt8274 = 0;
		for (@Pc(11) int local11 = 0; local11 < Static31.anInt495; local11++) {
			@Pc(17) int local17 = local11 * Static299.anInt5764;
			for (@Pc(19) int local19 = 0; local19 < Static299.anInt5764; local19++) {
				@Pc(25) int local25 = local19 + local17;
				Static420.anInterface15Array5[local25].method8681(Static597.anInt9791 * local19, local11 * Static382.anInt6778, Static597.anInt9791, Static382.anInt6778, true);
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)I")
	public static int method7737() {
		@Pc(10) Class340 local10 = Static201.aClass340_22;
		synchronized (Static201.aClass340_22) {
			return Static201.aClass340_22.method7990();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IBLclient!uaa;)I")
	public static int method7738(@OriginalArg(0) int arg0, @OriginalArg(2) Class345 arg1) {
		if (!Static84.method1822(arg1).method453(arg0) && arg1.anObjectArray30 == null) {
			return -1;
		} else if (arg1.anIntArray526 == null || arg1.anIntArray526.length <= arg0) {
			return -1;
		} else {
			return arg1.anIntArray526[arg0];
		}
	}
}
