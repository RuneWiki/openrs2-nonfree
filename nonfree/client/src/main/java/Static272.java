import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!uk", name = "t", descriptor = "I")
	public static int anInt5102 = 0;

	@OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
	public static int anInt5103 = 0;

	@OriginalMember(owner = "client!uk", name = "v", descriptor = "[Z")
	public static boolean[] aBooleanArray25 = new boolean[100];

	@OriginalMember(owner = "client!uk", name = "w", descriptor = "I")
	public static int anInt5104 = 0;

	@OriginalMember(owner = "client!uk", name = "x", descriptor = "Z")
	public static boolean aBoolean337 = false;

	@OriginalMember(owner = "client!uk", name = "z", descriptor = "[I")
	public static int[] anIntArray452 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)V")
	public static void method4071() {
		Static118.method2032();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static121.aClass63Array1[local8].method1668();
		}
		System.gc();
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)V")
	public static void method4072() {
		aBooleanArray25 = null;
		anIntArray452 = null;
	}
}
