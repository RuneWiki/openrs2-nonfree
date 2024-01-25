import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static539 {

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "D")
	public static double aDouble20;

	@OriginalMember(owner = "client!tfa", name = "d", descriptor = "Lclient!in;")
	public static Class157 aClass157_263;

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "Lclient!hj;")
	public static final Class134 aClass134_6 = new Class134();

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IBII)I")
	public static int method8073(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 243) {
			arg1 >>= 0x4;
		} else if (arg0 > 217) {
			arg1 >>= 0x3;
		} else if (arg0 > 192) {
			arg1 >>= 0x2;
		} else if (arg0 > 179) {
			arg1 >>= 0x1;
		}
		return (arg0 >> 1) + (arg1 >> 5 << 7) + ((arg2 >> 2 & 0x3F) << 10);
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(I)Z")
	public static boolean method8074() {
		if (Static612.aBoolean729) {
			try {
				if ((Boolean) Static646.method1788(Static334.anApplet2, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(26) Throwable local26) {
			}
		}
		return true;
	}
}
