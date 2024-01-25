import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
	public static int anInt4958;

	@OriginalMember(owner = "client!nh", name = "M", descriptor = "I")
	public static int anInt4963;

	@OriginalMember(owner = "client!nh", name = "D", descriptor = "[Z")
	public static final boolean[] aBooleanArray15 = new boolean[100];

	@OriginalMember(owner = "client!nh", name = "G", descriptor = "Z")
	public static boolean aBoolean455 = false;

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)V")
	public static void method3806() {
		if (!Static423.method5406()) {
			return;
		}
		if (Static102.aStringArray8 == null) {
			Static19.method198();
		}
		Static69.aBoolean292 = true;
		Static259.anInt4882 = 0;
		try {
			Static348.aClipboard1 = Static6.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(16) Exception local16) {
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BII)I")
	public static int method3807(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local9 << 13 ^ local9;
		@Pc(34) int local34 = (local20 * local20 * 15731 + 789221) * local20 + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!ta;)V")
	public static void method3808(@OriginalArg(0) int arg0, @OriginalArg(1) Class65 arg1) {
		Static417.aClass65Array4[arg0] = arg1;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(BI)V")
	public static void method3809(@OriginalArg(1) int arg0) {
		if (arg0 == Static140.anInt2845) {
			return;
		}
		Static326.anInt5666 = Static283.anInt5187 = Static180.anIntArray226[arg0];
		Static201.method4607();
		Static313.anIntArrayArrayArray12 = new int[4][Static326.anInt5666 >> 3][Static283.anInt5187 >> 3];
		Static50.anIntArrayArray8 = new int[Static326.anInt5666][Static283.anInt5187];
		Static44.anIntArrayArray7 = new int[Static326.anInt5666][Static283.anInt5187];
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			Static175.aClass213Array1[local40] = Static446.method5622(Static283.anInt5187, Static326.anInt5666);
		}
		Static12.aByteArrayArrayArray1 = new byte[4][Static326.anInt5666][Static283.anInt5187];
		Static372.method4977(Static283.anInt5187, Static326.anInt5666);
		Static254.method3682(Static283.anInt5187 >> 3, Static122.aClass19_16, Static326.anInt5666 >> 3);
		Static140.anInt2845 = arg0;
	}
}
