import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static236 {

	@OriginalMember(owner = "client!iw", name = "F", descriptor = "J")
	public static long aLong124;

	@OriginalMember(owner = "client!iw", name = "G", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_86 = new Class56(47, 3);

	@OriginalMember(owner = "client!iw", name = "U", descriptor = "I")
	public static int anInt4199 = 0;

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(B)V")
	public static void method3658() {
		if (Static9.aClass8_3 != null) {
			Static9.aClass8_3.method5525();
		}
		if (Static241.aClass8_2 != null) {
			Static241.aClass8_2.method5525();
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IILclient!vj;Z[IZ)Lclient!br;")
	public static Class24_Sub1_Sub1 method3659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class45_Sub3 arg2, @OriginalArg(4) int[] arg3) {
		if (arg2.aBoolean707 || Static259.method3984(arg1) && Static259.method3984(arg0)) {
			return new Class24_Sub1_Sub1(arg2, 3553, arg1, arg0, false, arg3);
		} else if (arg2.aBoolean698) {
			return new Class24_Sub1_Sub1(arg2, 34037, arg1, arg0, false, arg3);
		} else {
			return new Class24_Sub1_Sub1(arg2, arg1, arg0, Static371.method5424(arg1), Static371.method5424(arg0), arg3);
		}
	}
}
