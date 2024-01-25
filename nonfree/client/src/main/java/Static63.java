import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "Lclient!r;")
	public static Class12 aClass12_5;

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
	public static int anInt1544;

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_42 = new Class81(59, 0);

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "[I")
	public static final int[] anIntArray83 = new int[500];

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
	public static int anInt1540 = 2;

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "Lclient!jw;")
	public static final Class181 aClass181_3 = new Class181(3, 7);

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "([J[IZ)V")
	public static void method1404(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1) {
		Static122.method2101(arg1, arg0.length - 1, 0, arg0);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIZ)V")
	public static void method1409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class1_Sub3_Sub1 local13 = Static374.method5445(16, arg0);
		local13.method491();
		local13.anInt548 = arg1;
	}
}
