import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static171 {

	@OriginalMember(owner = "client!mg", name = "Q", descriptor = "I")
	public static int anInt3225;

	@OriginalMember(owner = "client!mg", name = "K", descriptor = "I")
	public static int anInt3219 = 0;

	@OriginalMember(owner = "client!mg", name = "N", descriptor = "I")
	public static int anInt3222 = 0;

	@OriginalMember(owner = "client!mg", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString115 = "Loading...";

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(IB)Z")
	public static boolean method2841(@OriginalArg(0) int arg0) {
		return arg0 == (arg0 & -arg0);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BILclient!rg;)I")
	public static int method2842(@OriginalArg(1) int arg0, @OriginalArg(2) Class151 arg1) {
		if (!Static42.method612(arg1).method4794(arg0) && arg1.anObjectArray28 == null) {
			return -1;
		} else if (arg1.anIntArray510 == null || arg1.anIntArray510.length <= arg0) {
			return -1;
		} else {
			return arg1.anIntArray510[arg0];
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)I")
	public static int method2844(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}
