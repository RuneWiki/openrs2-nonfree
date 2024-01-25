import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "[I")
	public static int[] anIntArray681;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BI)Lclient!hn;")
	public static Class93 method5381(@OriginalArg(1) int arg0) {
		@Pc(5) Class70 local5 = Static293.aClass70_95;
		@Pc(14) Class93 local14;
		synchronized (Static293.aClass70_95) {
			local14 = (Class93) Static293.aClass70_95.method1396((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(30) byte[] local30 = Static117.aClass53_65.method1033(arg0, 16);
		local14 = new Class93();
		if (local30 != null) {
			local14.method2421(new Class6_Sub10(local30));
		}
		@Pc(50) Class70 local50 = Static293.aClass70_95;
		synchronized (Static293.aClass70_95) {
			Static293.aClass70_95.method1406(local14, (long) arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BIIIIII)Lclient!qi;")
	public static Class19 method5382(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg4 * 76724863L ^ (long) arg2 * 475427L ^ (long) arg3 * 97549L ^ (long) arg0 * 67481L ^ (long) arg1 * 986053L ^ (long) arg5 * 32147369L;
		@Pc(39) Class19 local39 = (Class19) Static176.aClass70_59.method1396(local33);
		if (local39 == null) {
			local39 = Static16.aClass81_1.method2968(arg0, arg3, arg2, arg1, arg5, arg4);
			Static176.aClass70_59.method1406(local39, local33);
			return local39;
		} else {
			return local39;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)V")
	public static void method5383() {
		@Pc(12) Class70 local12 = Static340.aClass70_20;
		synchronized (Static340.aClass70_20) {
			Static340.aClass70_20.method1405();
		}
	}
}
