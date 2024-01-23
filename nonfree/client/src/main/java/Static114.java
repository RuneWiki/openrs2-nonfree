import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
	public static int anInt2478;

	@OriginalMember(owner = "client!ij", name = "k", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
	public static int anInt2474 = 0;

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "Z")
	public static boolean aBoolean166 = true;

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "Z")
	public static boolean aBoolean167 = true;

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
	public static int anInt2477 = 0;

	@OriginalMember(owner = "client!ij", name = "h", descriptor = "[Lclient!qm;")
	public static Class141[] aClass141Array2 = new Class141[14];

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIZ)V")
	public static void method1938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static222.method3559(arg0)) {
			Static258.method3891(arg1, Static148.aClass22ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
	private static void method1939() {
		Static240.anInterface3Array6 = null;
		Static195.method3030();
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V")
	public static void method1940() {
		aClass141Array2 = null;
		aClient1 = null;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ID)V")
	public static void method1941(@OriginalArg(1) double arg0) {
		if (arg0 == Static201.aDouble1) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(30) int local30 = (int) (Math.pow((double) local17 / 255.0D, arg0) * 255.0D);
			Static277.anIntArray459[local17] = local30 <= 255 ? local30 : 255;
		}
		Static201.aDouble1 = arg0;
	}
}
