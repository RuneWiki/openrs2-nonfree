import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!gk", name = "m", descriptor = "[I")
	public static final int[] anIntArray128 = new int[4096];

	@OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
	public static int anInt2182 = 0;

	@OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
	public static volatile int anInt2184 = 0;

	@OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
	public static int anInt2185 = 0;

	@OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
	public static int anInt2186 = -1;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method1768(@OriginalArg(0) String arg0) {
		if (Static265.aStringArray34 == null) {
			Static123.method2157();
		}
		@Pc(19) String[] local19 = Static159.method2528('\n', arg0);
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			for (@Pc(28) int local28 = Static265.aStringArray34.length - 1; local28 > 0; local28--) {
				Static265.aStringArray34[local28] = Static265.aStringArray34[local28 - 1];
			}
			Static265.aStringArray34[0] = local19[local21];
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIII)V")
	public static void method1769(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static73.anInt1425 = arg1;
		Static4.anInt75 = arg0;
		Static19.anInt533 = 0;
		Static236.anInt4721 = 0;
	}
}
