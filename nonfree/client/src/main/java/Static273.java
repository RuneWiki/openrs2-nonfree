import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static273 {

	@OriginalMember(owner = "client!kga", name = "Y", descriptor = "I")
	public static int anInt5808;

	@OriginalMember(owner = "client!kga", name = "X", descriptor = "I")
	public static int anInt5807 = 0;

	@OriginalMember(owner = "client!kga", name = "bb", descriptor = "[I")
	public static final int[] anIntArray348 = new int[4];

	@OriginalMember(owner = "client!kga", name = "cb", descriptor = "I")
	public static int anInt5811 = 0;

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(ILclient!ji;I[BZIII)Lclient!ch;")
	public static Class11_Sub2_Sub1 method4777(@OriginalArg(1) Class15_Sub3 arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(5) int arg2, @OriginalArg(7) int arg3) {
		if (arg0.aBoolean457 || Static282.method4863(arg2) && Static282.method4863(arg3)) {
			return new Class11_Sub2_Sub1(arg0, 3553, 6406, arg2, arg3, false, arg1, 6406);
		} else if (arg0.aBoolean446) {
			return new Class11_Sub2_Sub1(arg0, 34037, 6406, arg2, arg3, false, arg1, 6406);
		} else {
			return new Class11_Sub2_Sub1(arg0, 6406, arg2, arg3, Static178.method3152(arg2), Static178.method3152(arg3), arg1, 6406);
		}
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(III)Z")
	public static boolean method4778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static102.method2184(arg1, arg0) | (arg1 & 0x70000) != 0 || Static132.method5408(arg0, arg1);
	}
}
