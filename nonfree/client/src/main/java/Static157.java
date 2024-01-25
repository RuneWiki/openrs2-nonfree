import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static157 {

	@OriginalMember(owner = "client!hk", name = "F", descriptor = "[Lclient!ya;")
	public static Class139[] aClass139Array1;

	@OriginalMember(owner = "client!hk", name = "H", descriptor = "Lclient!vl;")
	public static Class263 aClass263_18;

	@OriginalMember(owner = "client!hk", name = "I", descriptor = "[I")
	public static int[] anIntArray201;

	@OriginalMember(owner = "client!hk", name = "J", descriptor = "Lclient!o;")
	public static Class85 aClass85_10;

	@OriginalMember(owner = "client!hk", name = "L", descriptor = "I")
	public static int anInt2566 = 0;

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "(III)I")
	public static int method2092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static279.anIntArray355[arg0 & 0x3] : Static10.anIntArray387[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "(III)Z")
	public static boolean method2094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((arg0 & 0x2000) != 0 | Static421.method5391(arg1, arg0) | Static220.method3165(arg0, arg1)) & Static91.method1067(arg1, arg0);
	}
}
