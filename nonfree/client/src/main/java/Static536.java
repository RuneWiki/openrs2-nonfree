import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!sw", name = "t", descriptor = "[J")
	public static long[] aLongArray14;

	@OriginalMember(owner = "client!sw", name = "f", descriptor = "I")
	public static int anInt8899 = -1;

	@OriginalMember(owner = "client!sw", name = "p", descriptor = "Lclient!vfa;")
	public static Class357 aClass357_10 = null;

	@OriginalMember(owner = "client!sw", name = "s", descriptor = "Z")
	public static boolean aBoolean732 = false;

	@OriginalMember(owner = "client!sw", name = "w", descriptor = "I")
	public static int anInt8903 = -1;

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(ZIIII)V")
	public static void method7638(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = arg0;
		@Pc(16) int local16 = -arg0;
		Static260.method3979(arg2, arg3 - arg0, Static267.anIntArrayArray20[arg1], arg3 + arg0);
		@Pc(31) int local31 = -1;
		while (local11 < local13) {
			local31 += 2;
			local16 += local31;
			local11++;
			if (local16 >= 0) {
				local13--;
				local16 -= local13 << 1;
				@Pc(57) int[] local57 = Static267.anIntArrayArray20[arg1 + local13];
				@Pc(64) int[] local64 = Static267.anIntArrayArray20[arg1 - local13];
				@Pc(68) int local68 = local11 + arg3;
				@Pc(73) int local73 = arg3 - local11;
				Static260.method3979(arg2, local73, local57, local68);
				Static260.method3979(arg2, local73, local64, local68);
			}
			@Pc(90) int local90 = arg3 + local13;
			@Pc(95) int local95 = arg3 - local13;
			@Pc(101) int[] local101 = Static267.anIntArrayArray20[arg1 + local11];
			@Pc(108) int[] local108 = Static267.anIntArrayArray20[arg1 - local11];
			Static260.method3979(arg2, local95, local101, local90);
			Static260.method3979(arg2, local95, local108, local90);
		}
	}
}
