import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static531 {

	@OriginalMember(owner = "client!wd", name = "K", descriptor = "[S")
	public static short[] aShortArray169;

	// $FF: synthetic field
	@OriginalMember(owner = "client!wd", name = "N", descriptor = "Ljava/lang/Class;")
	private static Class aClass1;

	@OriginalMember(owner = "client!wd", name = "D", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_141 = new Class6(60, 14);

	@OriginalMember(owner = "client!wd", name = "H", descriptor = "[I")
	public static final int[] anIntArray776 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!wd", name = "J", descriptor = "I")
	public static int anInt9007 = 0;

	@OriginalMember(owner = "client!wd", name = "L", descriptor = "Lclient!gf;")
	public static final Class102 aClass102_6 = new Class102();

	@OriginalMember(owner = "client!wd", name = "M", descriptor = "Lclient!vp;")
	public static Class309 aClass309_14 = null;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method7565(@OriginalArg(1) String arg0) {
		return Static262.method4385(arg0, aClass1 == null ? (aClass1 = Class1_Sub3.a("fu")) : aClass1);
	}
}
