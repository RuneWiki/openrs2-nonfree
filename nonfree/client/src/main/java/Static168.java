import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
	public static int anInt3290 = -1;

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString198 = "red:";

	@OriginalMember(owner = "client!mc", name = "s", descriptor = "[I")
	public static int[] anIntArray313 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!mc", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString199 = "Loaded update list";

	@OriginalMember(owner = "client!mc", name = "x", descriptor = "[Lclient!te;")
	public static Class4_Sub3_Sub19[] aClass4_Sub3_Sub19Array2 = new Class4_Sub3_Sub19[14];

	@OriginalMember(owner = "client!mc", name = "y", descriptor = "[F")
	public static float[] aFloatArray38 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

	@OriginalMember(owner = "client!mc", name = "A", descriptor = "[I")
	public static int[] anIntArray314 = new int[256];

	@OriginalMember(owner = "client!mc", name = "D", descriptor = "F")
	public static float aFloat79 = 0.0F;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(BI)V")
	public static void method2702(@OriginalArg(1) int arg0) {
		for (@Pc(16) Class4 local16 = Static65.aClass85_5.method1843(); local16 != null; local16 = Static65.aClass85_5.method1844()) {
			if ((local16.aLong217 >> 48 & 0xFFFFL) == (long) arg0) {
				local16.method4854();
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)I")
	public static int method2703(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!fh;IBIIZ)V")
	public static void method2705(@OriginalArg(1) Class58 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		Static107.anInt5398 = 2;
		Static310.anInt6026 = arg2;
		Static85.aClass58_42 = arg0;
		Static242.aBoolean322 = false;
		Static63.anInt1244 = 0;
		Static287.anInt5392 = arg1;
		Static227.anInt4358 = 1;
	}
}
