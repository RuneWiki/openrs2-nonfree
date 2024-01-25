import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static538 {

	@OriginalMember(owner = "client!ul", name = "s", descriptor = "Lclient!cr;")
	public static final Class54 aClass54_7 = new Class54();

	@OriginalMember(owner = "client!ul", name = "w", descriptor = "I")
	public static int anInt8762 = 0;

	@OriginalMember(owner = "client!ul", name = "y", descriptor = "Z")
	public static boolean aBoolean617 = false;

	@OriginalMember(owner = "client!ul", name = "z", descriptor = "Z")
	public static boolean aBoolean618 = false;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIILclient!kga;)Lclient!eb;")
	public static Class77_Sub1_Sub1 method7150(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class44_Sub3 arg4) {
		if (arg4.aBoolean402 || Static100.method2181(arg3) && Static100.method2181(arg1)) {
			return new Class77_Sub1_Sub1(arg4, 3553, arg0, arg2, arg3, arg1, true);
		} else if (arg4.aBoolean400) {
			return new Class77_Sub1_Sub1(arg4, 34037, arg0, arg2, arg3, arg1, true);
		} else {
			return new Class77_Sub1_Sub1(arg4, arg0, arg2, arg3, arg1, Static341.method5553(arg3), Static341.method5553(arg1), true);
		}
	}
}
