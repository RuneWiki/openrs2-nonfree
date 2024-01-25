import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!li", name = "c", descriptor = "[I")
	public static final int[] anIntArray364 = new int[14];

	@OriginalMember(owner = "client!li", name = "g", descriptor = "Z")
	public static final boolean aBoolean414 = true;

	@OriginalMember(owner = "client!li", name = "h", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_98 = new Class145(75, 2);

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
	public static void method4946() {
		Static212.method3537(false);
		if (Static508.anInt8218 >= 0 && Static508.anInt8218 != 0) {
			Static99.method1936(false, Static508.anInt8218);
			Static508.anInt8218 = -1;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;")
	public static Object method4947(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static374.aBoolean458) {
			try {
				@Pc(28) Class260 local28 = (Class260) Class.forName("Class260_Sub1").getDeclaredConstructor().newInstance();
				local28.method6257(arg0);
				return local28;
			} catch (@Pc(35) Throwable local35) {
				Static374.aBoolean458 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIB)V")
	public static void method4948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static566.anInt9279 <= arg2 && Static392.anInt6753 >= arg3 && arg4 >= Static346.anInt5494 && Static640.anInt10333 >= arg1) {
			Static252.method4188(arg1, arg2, arg4, arg0, arg3);
		} else {
			Static530.method7352(arg4, arg3, arg2, arg1, arg0);
		}
	}
}
