import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!mc", name = "v", descriptor = "[Lclient!rc;")
	public static Class20_Sub2_Sub4[] aClass20_Sub2_Sub4Array1;

	@OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
	public static int anInt5683;

	@OriginalMember(owner = "client!mc", name = "B", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray1;

	@OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
	public static int anInt5680 = -1;

	@OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
	public static int anInt5682 = 0;

	@OriginalMember(owner = "client!mc", name = "A", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray25 = new String[100];

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V")
	public static void method4803() {
		if (Static279.anIntArray312 != null && Static549.anIntArray610 != null) {
			return;
		}
		Static549.anIntArray610 = new int[256];
		Static279.anIntArray312 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static279.anIntArray312[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static549.anIntArray610[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)V")
	public static void method4805() {
		Static225.aClass361_49.method7860();
		Static478.anInt8068 = 0;
	}
}
