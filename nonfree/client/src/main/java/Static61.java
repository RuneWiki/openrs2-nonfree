import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static61 {

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "Lclient!ss;")
	public static Class335 aClass335_1;

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "[S")
	public static short[] aShortArray23 = new short[256];

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
	public static void method763() {
		Static619.aClass74_69.method1398();
		Static371.aClass82_11.method2075();
		Static99.aClass82_2.method2075();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)B")
	public static byte method767(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
