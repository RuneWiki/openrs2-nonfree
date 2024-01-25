import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static249 {

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
	public static int anInt4563 = 0;

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "[I")
	public static final int[] anIntArray232 = new int[8];

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(BI[ILclient!kga;IZ)Lclient!eb;")
	public static Class77_Sub1_Sub1 method4008(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class44_Sub3 arg2, @OriginalArg(4) int arg3) {
		if (arg2.aBoolean402 || Static100.method2181(arg3) && Static100.method2181(arg0)) {
			return new Class77_Sub1_Sub1(arg2, 3553, arg3, arg0, false, arg1);
		} else if (arg2.aBoolean400) {
			return new Class77_Sub1_Sub1(arg2, 34037, arg3, arg0, false, arg1);
		} else {
			return new Class77_Sub1_Sub1(arg2, arg3, arg0, Static341.method5553(arg3), Static341.method5553(arg0), arg1);
		}
	}
}
