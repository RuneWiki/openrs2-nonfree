import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
	public static int anInt4645 = 0;

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray26 = new boolean[200];

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "[I")
	public static final int[] anIntArray595 = new int[25];

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)V")
	public static void method4243() {
		@Pc(5) Class140 local5 = Static122.aClass140_66;
		synchronized (Static122.aClass140_66) {
			Static122.aClass140_66.method3824(5);
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(III)I")
	public static int method4244(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub38 local12 = (Class1_Sub38) Static338.aClass26_33.method870((long) arg0);
		if (local12 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = 0; local33 < local12.anIntArray762.length; local33++) {
				if (arg1 == local12.anIntArray763[local33]) {
					local31 += local12.anIntArray762[local33];
				}
			}
			return local31;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIIII)V")
	public static void method4246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) int local13 = Static216.method3969(Static291.anInt5657, arg1, Static49.anInt1124);
		@Pc(21) int local21 = Static216.method3969(Static291.anInt5657, arg3, Static49.anInt1124);
		@Pc(35) int local35 = Static216.method3969(Static251.anInt6512, arg4, Static106.anInt2157);
		@Pc(41) int local41 = Static216.method3969(Static251.anInt6512, arg2, Static106.anInt2157);
		for (@Pc(43) int local43 = local13; local43 <= local21; local43++) {
			Static97.method1784(local35, Static327.anIntArrayArray63[local43], arg0, local41);
		}
	}
}
