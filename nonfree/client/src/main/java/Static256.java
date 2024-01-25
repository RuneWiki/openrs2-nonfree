import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!qk", name = "v", descriptor = "Lclient!wo;")
	public static Class216 aClass216_83;

	@OriginalMember(owner = "client!qk", name = "M", descriptor = "Lclient!wo;")
	public static Class216 aClass216_84;

	@OriginalMember(owner = "client!qk", name = "w", descriptor = "[J")
	public static final long[] aLongArray8 = new long[32];

	@OriginalMember(owner = "client!qk", name = "D", descriptor = "I")
	public static int anInt5309 = -1;

	@OriginalMember(owner = "client!qk", name = "K", descriptor = "[Lclient!hn;")
	public static final Class85[] aClass85Array1 = new Class85[128];

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(B)V")
	public static void method4617() {
		@Pc(10) Class87 local10 = Static322.aClass87_57;
		synchronized (Static322.aClass87_57) {
			Static322.aClass87_57.method2477();
		}
		local10 = Static28.aClass87_5;
		synchronized (Static28.aClass87_5) {
			Static28.aClass87_5.method2477();
		}
	}

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "(B)V")
	public static void method4619() {
		if (Static208.aClass32_11.method2213()) {
			Static169.method3378();
			Static208.aClass32_11.method2145(Static349.aCanvas5);
			Static45.method1050();
		} else {
			Static259.method2702(Static306.anInt6046);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
	public static String[] method4620(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			local8[local18] = local18 + ": ";
			if (arg0 != null && arg0[local18] != null) {
				local8[local18] = local8[local18] + arg0[local18];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(II)Lclient!lh;")
	public static Class124 method4624(@OriginalArg(0) int arg0) {
		@Pc(5) Class87 local5 = Static320.aClass87_46;
		@Pc(14) Class124 local14;
		synchronized (Static320.aClass87_46) {
			local14 = (Class124) Static320.aClass87_46.method2482((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(30) byte[] local30 = Static224.aClass216_76.method5648(3, arg0);
		local14 = new Class124();
		if (local30 != null) {
			local14.method3432(new Class1_Sub8(local30));
		}
		@Pc(45) Class87 local45 = Static320.aClass87_46;
		synchronized (Static320.aClass87_46) {
			Static320.aClass87_46.method2481(local14, (long) arg0);
			return local14;
		}
	}
}
