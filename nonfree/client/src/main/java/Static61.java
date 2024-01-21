import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static61 {

	@OriginalMember(owner = "client!hh", name = "mc", descriptor = "Lclient!fd;")
	public static Class7_Sub1 aClass7_Sub1_8;

	@OriginalMember(owner = "client!hh", name = "pc", descriptor = "[I")
	public static int[] anIntArray316;

	@OriginalMember(owner = "client!hh", name = "W", descriptor = "Z")
	public static boolean aBoolean101 = false;

	@OriginalMember(owner = "client!hh", name = "oc", descriptor = "Lclient!eh;")
	public static Class28 aClass28_555 = Static170.method3101("jlv");

	@OriginalMember(owner = "client!hh", name = "qc", descriptor = "[I")
	public static int[] anIntArray317 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!hh", name = "rc", descriptor = "I")
	public static int anInt1843 = 0;

	@OriginalMember(owner = "client!hh", name = "sc", descriptor = "I")
	public static int anInt1844 = 0;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!gf;I)Z")
	public static boolean method1440(@OriginalArg(0) Class33 arg0) {
		if (Static168.aBoolean190) {
			if (Static4.method97(arg0) != 0) {
				return false;
			}
			if (arg0.anInt1522 == 0) {
				return false;
			}
		}
		return arg0.aBoolean78;
	}

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "(I)V")
	public static void method1441() {
		aClass7_Sub1_8 = null;
		anIntArray316 = null;
		anIntArray317 = null;
		aClass28_555 = null;
	}
}
