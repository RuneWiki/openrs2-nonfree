import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!bh", name = "m", descriptor = "Lclient!ij;")
	public static Class93 aClass93_9;

	@OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
	public static int anInt478;

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
	public static int anInt472 = 0;

	@OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
	public static int anInt479 = 0;

	@OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
	public static int anInt481 = 104;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)Lclient!jr;")
	public static Class106 method442(@OriginalArg(1) int arg0) {
		@Pc(5) Class109 local5 = Static119.aClass109_43;
		@Pc(14) Class106 local14;
		synchronized (Static119.aClass109_43) {
			local14 = (Class106) Static119.aClass109_43.method2857((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static317.aClass93_120.method2410(Static39.method617(arg0), Static98.method1777(arg0));
		local14 = new Class106();
		local14.anInt3131 = arg0;
		if (local34 != null) {
			local14.method2827(new Class5_Sub12(local34));
		}
		local14.method2823();
		@Pc(59) Class109 local59 = Static119.aClass109_43;
		synchronized (Static119.aClass109_43) {
			Static119.aClass109_43.method2855((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)Lclient!fc;")
	public static Class10 method443() {
		try {
			return new Class10_Sub1();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class10) Class.forName("Class10_Sub2").getDeclaredConstructor().newInstance();
			} catch (@Pc(22) Throwable local22) {
				return new Class10_Sub3();
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)V")
	public static void method445(@OriginalArg(1) int arg0) {
		@Pc(8) Class5_Sub1_Sub2 local8 = Static166.method3027(arg0, 8);
		local8.method856();
	}
}
