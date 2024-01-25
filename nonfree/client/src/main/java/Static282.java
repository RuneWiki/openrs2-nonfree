import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!jj", name = "j", descriptor = "Lclient!br;")
	public static Class41 aClass41_1;

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "Lclient!ed;")
	public static final Class93 aClass93_10 = new Class93(13, 0, 1, 0);

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)Lclient!ir;")
	public static Class86 method4102() {
		try {
			return (Class86) Class.forName("Class86_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIII)V")
	public static void method4103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 < arg0) {
			Static578.method7640(arg2, arg3, arg0, Static276.anIntArrayArray32[arg1]);
		} else {
			Static578.method7640(arg2, arg0, arg3, Static276.anIntArrayArray32[arg1]);
		}
	}
}
