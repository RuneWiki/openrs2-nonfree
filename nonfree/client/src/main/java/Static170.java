import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!le", name = "d", descriptor = "I")
	public static int anInt3645;

	@OriginalMember(owner = "client!le", name = "q", descriptor = "I")
	public static int anInt3654;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "I")
	public static int anInt3644 = 0;

	@OriginalMember(owner = "client!le", name = "j", descriptor = "Lclient!bb;")
	public static final Class16 aClass16_18 = new Class16();

	@OriginalMember(owner = "client!le", name = "o", descriptor = "I")
	public static int anInt3653 = 0;

	@OriginalMember(owner = "client!le", name = "r", descriptor = "Lclient!ub;")
	public static final Class1_Sub35 aClass1_Sub35_1 = new Class1_Sub35(0, 0);

	@OriginalMember(owner = "client!le", name = "t", descriptor = "I")
	public static int anInt3655 = 0;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 >= Static268.anInt5477 && arg4 <= Static342.anInt3000 && arg5 >= Static268.anInt5477 && arg5 <= Static342.anInt3000 && arg3 >= Static268.anInt5477 && Static342.anInt3000 >= arg3 && arg1 >= Static268.anInt5477 && Static342.anInt3000 >= arg1 && Static197.anInt4211 <= arg7 && Static326.anInt2469 >= arg7 && arg8 >= Static197.anInt4211 && arg8 <= Static326.anInt2469 && arg6 >= Static197.anInt4211 && Static326.anInt2469 >= arg6 && Static197.anInt4211 <= arg0 && Static326.anInt2469 >= arg0) {
			Static127.method2618(arg5, arg1, arg7, arg4, arg2, arg6, arg0, arg8, arg3);
		} else {
			Static167.method3363(arg8, arg2, arg4, arg0, arg3, arg7, arg6, arg1, arg5);
		}
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(I)Lclient!r;")
	public static Class176 method3389() {
		try {
			return (Class176) Class.forName("Class176_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(13) Throwable local13) {
			return null;
		}
	}
}
