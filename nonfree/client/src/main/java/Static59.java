import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static59 {

	@OriginalMember(owner = "client!cp", name = "M", descriptor = "I")
	public static int anInt945;

	@OriginalMember(owner = "client!cp", name = "K", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_44 = new Class67(54, 17);

	@OriginalMember(owner = "client!cp", name = "L", descriptor = "Lclient!le;")
	public static final Class148 aClass148_1 = new Class148("runescape", 0);

	@OriginalMember(owner = "client!cp", name = "N", descriptor = "[I")
	public static final int[] anIntArray112 = new int[14];

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(B)V")
	public static void method835() {
		if (Static114.aClass101_1 != null) {
			Static114.aClass101_1.method4849();
		}
		if (Static457.aClass101_2 != null) {
			Static457.aClass101_2.method4849();
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIB)Z")
	public static boolean method836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x8000) != 0;
	}
}
