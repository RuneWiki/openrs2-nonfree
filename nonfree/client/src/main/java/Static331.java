import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static331 {

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_176 = new Class208(6, 8);

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
	public static int anInt6109 = 0;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)I")
	public static int method5339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static67.anIntArray113[arg1 & 0x3] : Static335.anIntArray534[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIBII)V")
	public static void method5343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 >= Static179.anInt3768 && Static121.anInt6758 >= arg3 && arg4 >= Static317.anInt5793 && arg1 <= Static69.anInt1551) {
			Static16.method187(arg1, arg6, arg2, arg3, arg0, arg5, arg4);
		} else {
			Static240.method4261(arg4, arg6, arg0, arg1, arg5, arg3, arg2);
		}
	}
}
