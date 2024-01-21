import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
	public static int anInt3280;

	@OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
	public static int anInt3285;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "[I")
	public static int[] anIntArray568 = new int[128];

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "[Lclient!pg;")
	public static Class65[] aClass65Array1 = new Class65[500];

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "Lclient!ve;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1078 = Static170.method3101(")1p");

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "[B")
	public static byte[] aByteArray34 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!qe", name = "p", descriptor = "[Lclient!df;")
	public static Class20[] aClass20Array1 = new Class20[6];

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method2521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class3_Sub20 local7 = Static149.aClass3_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass25_1 != null && local7.aClass25_1.aLong36 == arg3) {
			return true;
		} else if (local7.aClass55_1 != null && local7.aClass55_1.aLong89 == arg3) {
			return true;
		} else if (local7.aClass84_1 != null && local7.aClass84_1.aLong143 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt3336; local46++) {
				if (local7.aClass32Array3[local46].aLong49 == arg3) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
	public static void method2522() {
		aClass20Array1 = null;
		aClass65Array1 = null;
		aClass28_1078 = null;
		aByteArray34 = null;
		anIntArray568 = null;
	}
}
