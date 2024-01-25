import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!hs", name = "G", descriptor = "I")
	public static int anInt2278;

	@OriginalMember(owner = "client!hs", name = "H", descriptor = "I")
	public static int anInt2279 = 10;

	@OriginalMember(owner = "client!hs", name = "I", descriptor = "I")
	public static int anInt2280 = 0;

	@OriginalMember(owner = "client!hs", name = "K", descriptor = "[I")
	public static final int[] anIntArray160 = new int[32];

	@OriginalMember(owner = "client!hs", name = "M", descriptor = "I")
	public static int anInt2282 = -1;

	@OriginalMember(owner = "client!hs", name = "R", descriptor = "I")
	public static int anInt2287 = 2;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIIII)V")
	public static void method1897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = arg4; local3 <= arg0; local3++) {
			Static224.method5303(Static73.anIntArrayArray6[local3], arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILclient!nq;)V")
	public static void method1900(@OriginalArg(1) Class144 arg0) {
		Static147.aClass144_42 = arg0;
	}
}
