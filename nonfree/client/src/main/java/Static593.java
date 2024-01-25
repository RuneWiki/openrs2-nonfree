import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static593 {

	@OriginalMember(owner = "client!u", name = "l", descriptor = "Lclient!kq;")
	public static Class199 aClass199_16 = null;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!qha;Lclient!qha;I)V")
	public static void method7795(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1) {
		if (arg0.aClass3_68 != null) {
			arg0.method8898();
		}
		arg0.aClass3_67 = arg1;
		arg0.aClass3_68 = arg1.aClass3_68;
		arg0.aClass3_68.aClass3_67 = arg0;
		arg0.aClass3_67.aClass3_68 = arg0;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)I")
	public static int method7796() {
		return Static106.anInt2134 == 1 ? Static235.anInt5516 : Static445.anInt6953;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)Z")
	public static boolean method7798(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}
}
