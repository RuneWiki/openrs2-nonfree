import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!rf", name = "U", descriptor = "Lclient!ub;")
	public static Class99 aClass99_3;

	@OriginalMember(owner = "client!rf", name = "ib", descriptor = "I")
	public static int anInt4107;

	@OriginalMember(owner = "client!rf", name = "X", descriptor = "Lclient!qe;")
	private static Class78 aClass78_712 = Static199.method3560("red:");

	@OriginalMember(owner = "client!rf", name = "S", descriptor = "Lclient!qe;")
	public static Class78 aClass78_710 = aClass78_712;

	@OriginalMember(owner = "client!rf", name = "T", descriptor = "Lclient!qe;")
	public static Class78 aClass78_711 = Static199.method3560("floorshadows");

	@OriginalMember(owner = "client!rf", name = "Y", descriptor = "Lclient!qe;")
	public static Class78 aClass78_713 = Static199.method3560("overlay)3dat");

	@OriginalMember(owner = "client!rf", name = "Z", descriptor = "Lclient!qe;")
	public static Class78 aClass78_714 = aClass78_712;

	@OriginalMember(owner = "client!rf", name = "eb", descriptor = "Z")
	public static volatile boolean aBoolean178 = true;

	@OriginalMember(owner = "client!rf", name = "hb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_715 = Static199.method3560("(Z");

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "(I)V")
	public static void method3242() {
		Static39.aClass2_Sub21_Sub2_1.method2800();
		Static41.aClass72_52 = null;
		Static9.anInt274 = 1;
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(II)V")
	public static void method3243(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub26 local10 = (Class2_Sub26) Static48.aClass103_6.method3659((long) arg0);
		if (local10 != null) {
			local10.method3986();
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(Z)Lclient!vc;")
	public static Class4 method3244() {
		try {
			return (Class4) Class.forName("Class4_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class4_Sub1();
		}
	}

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "(III)Lclient!dj;")
	public static Class27 method3245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub12 local7 = Static226.aClass2_Sub12ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass27_1;
	}
}
