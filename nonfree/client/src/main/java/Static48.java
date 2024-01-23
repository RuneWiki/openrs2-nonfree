import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static48 {

	@OriginalMember(owner = "client!di", name = "m", descriptor = "Lclient!in;")
	public static Class71 aClass71_6;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray6 = new byte[250][];

	@OriginalMember(owner = "client!di", name = "f", descriptor = "Lclient!qh;")
	public static Class138 aClass138_1 = new Class138();

	@OriginalMember(owner = "client!di", name = "j", descriptor = "I")
	public static int anInt1122 = 0;

	@OriginalMember(owner = "client!di", name = "o", descriptor = "I")
	public static int anInt1125 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)V")
	public static void method933() {
		Static253.aClass71Array2 = null;
		Static85.method1489(0, 0, -1, 0, Static148.anInt3206, Static116.anInt5593, 0, Static3.anInt122);
		if (Static253.aClass71Array2 != null) {
			Static97.method1786(-1412584499, 0, Static220.anInt4374, Static100.aClass71_12.anInt2667, Static253.aClass71Array2, 0, Static148.anInt3206, Static258.anInt5076, Static3.anInt122);
			Static253.aClass71Array2 = null;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IJ)V")
	public static void method934(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static99.method1844(arg0 - 1L);
			Static99.method1844(1L);
		} else {
			Static99.method1844(arg0);
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!km;I)V")
	public static void method935(@OriginalArg(0) Class91 arg0) {
		Static155.aClass91_123 = arg0;
		Static227.anInt4509 = Static155.aClass91_123.method2510(4);
	}
}
