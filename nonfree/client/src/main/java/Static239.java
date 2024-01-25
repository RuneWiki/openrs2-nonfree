import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!pa", name = "L", descriptor = "Lclient!jm;")
	public static Class103 aClass103_116;

	@OriginalMember(owner = "client!pa", name = "N", descriptor = "I")
	public static int anInt4811;

	@OriginalMember(owner = "client!pa", name = "O", descriptor = "I")
	public static int anInt4812 = 0;

	@OriginalMember(owner = "client!pa", name = "S", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_48 = new Class109(4);

	@OriginalMember(owner = "client!pa", name = "X", descriptor = "[I")
	public static final int[] anIntArray441 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!pa", name = "Y", descriptor = "[S")
	public static short[] aShortArray77 = new short[256];

	@OriginalMember(owner = "client!pa", name = "Z", descriptor = "Z")
	public static boolean aBoolean401 = false;

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "(I)V")
	public static void method4262() {
		@Pc(1) Class109 local1 = Static119.aClass109_43;
		synchronized (Static119.aClass109_43) {
			Static119.aClass109_43.method2850();
		}
		local1 = Static41.aClass109_14;
		synchronized (Static41.aClass109_14) {
			Static41.aClass109_14.method2850();
		}
		local1 = Static142.aClass109_32;
		synchronized (Static142.aClass109_32) {
			Static142.aClass109_32.method2850();
		}
	}
}
