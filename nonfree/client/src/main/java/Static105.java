import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!gi", name = "Q", descriptor = "I")
	public static int anInt2155;

	@OriginalMember(owner = "client!gi", name = "R", descriptor = "Lclient!rj;")
	public static Class13 aClass13_4;

	@OriginalMember(owner = "client!gi", name = "L", descriptor = "[I")
	public static final int[] anIntArray259 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!gi", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString82 = "K";

	@OriginalMember(owner = "client!gi", name = "O", descriptor = "Z")
	public static boolean aBoolean182 = false;

	@OriginalMember(owner = "client!gi", name = "P", descriptor = "[[I")
	public static final int[][] anIntArrayArray20 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZLclient!qj;)V")
	public static void method1976(@OriginalArg(1) Class165 arg0) {
		Static82.aClass165_27 = arg0;
		Static7.anInt160 = Static82.aClass165_27.method4499(4);
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(II)V")
	public static void method1977() {
		@Pc(1) Class140 local1 = Static278.aClass140_145;
		synchronized (Static278.aClass140_145) {
			Static278.aClass140_145.method3824(5);
		}
		local1 = Static145.aClass140_77;
		synchronized (Static145.aClass140_77) {
			Static145.aClass140_77.method3824(5);
		}
		local1 = Static159.aClass140_84;
		synchronized (Static159.aClass140_84) {
			Static159.aClass140_84.method3824(5);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static198.method3725(arg3)) {
			Static225.method3158(arg2, arg7, arg4, arg5, -1, arg1, arg0, Static314.aClass177ArrayArray1[arg3], arg6);
		} else if (arg2 == -1) {
			for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
				Static313.aBooleanArray30[local19] = true;
			}
		} else {
			Static313.aBooleanArray30[arg2] = true;
		}
	}
}
