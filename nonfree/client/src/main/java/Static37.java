import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_9 = new Class66(30);

	@OriginalMember(owner = "client!cf", name = "u", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_10 = new Class66(64);

	@OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
	public static int anInt939 = 0;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)Lclient!a;")
	public static Class1 method863(@OriginalArg(0) int arg0) {
		@Pc(10) Class1 local10 = (Class1) Static328.aClass66_103.method1939((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static228.aClass170_81.method4584(30, arg0);
		local10 = new Class1();
		if (local20 != null) {
			local10.method2(arg0, new Class5_Sub1(local20));
		}
		Static328.aClass66_103.method1936((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BIIIIII)V")
	public static void method868(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static184.anInt6250 <= arg5 && Static80.anInt4809 >= arg2 && arg0 >= Static314.anInt6018 && Static334.anInt6315 >= arg4) {
			if (arg1 == 1) {
				Static56.method1200(arg4, arg5, arg3, arg0, arg2);
			} else {
				Static322.method5429(arg3, arg1, arg5, arg0, arg2, arg4);
			}
		} else if (arg1 == 1) {
			Static166.method3083(arg5, arg0, arg4, arg2, arg3);
		} else {
			Static44.method3563(arg3, arg2, arg4, arg0, arg5, arg1);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V")
	public static void method869(@OriginalArg(0) int arg0) {
		@Pc(10) Class5_Sub9_Sub16 local10 = Static239.method4052(12, arg0);
		local10.method4138();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIZLclient!jf;)V")
	public static void method870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class96 arg2) {
		if (Static287.aClass96_16 != null || Static188.aBoolean264 || (arg2 == null || Static276.method4702(arg2) == null)) {
			return;
		}
		Static287.aClass96_16 = arg2;
		Static232.aClass96_15 = Static276.method4702(arg2);
		Static25.anInt606 = arg1;
		Static42.anInt1007 = arg0;
		Static110.anInt2338 = 0;
		Static203.aBoolean279 = false;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)Lclient!nn;")
	public static Class139 method871() {
		try {
			return (Class139) Class.forName("Class139_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
