import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "J")
	public static long aLong77 = 20000000L;

	@OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
	public static int anInt2629 = 0;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIBIIIII)V")
	public static void method2229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 >= Static275.anInt4919 && arg4 <= Static529.anInt9089 && Static554.anInt9362 <= arg1 && arg2 <= Static62.anInt1300) {
			Static514.method7638(arg0, arg4, arg5, arg6, arg3, arg1, arg2);
		} else {
			Static39.method584(arg5, arg3, arg2, arg6, arg4, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "()V")
	public static void method2230() {
		for (@Pc(1) int local1 = 0; local1 < Static56.aClass220Array1.length; local1++) {
			Static56.aClass220Array1[local1].method4926();
		}
		Static56.aClass220Array1 = null;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIILclient!rs;II)Lclient!sb;")
	public static Class167_Sub3_Sub1 method2231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class133_Sub3 arg3, @OriginalArg(4) int arg4) {
		if (arg3.aBoolean620 || Static413.method8723(arg4) && Static413.method8723(arg0)) {
			return new Class167_Sub3_Sub1(arg3, 3553, arg1, arg2, arg4, arg0, true);
		} else if (arg3.aBoolean622) {
			return new Class167_Sub3_Sub1(arg3, 34037, arg1, arg2, arg4, arg0, true);
		} else {
			return new Class167_Sub3_Sub1(arg3, arg1, arg2, arg4, arg0, Static613.method8740(arg4), Static613.method8740(arg0), true);
		}
	}
}
