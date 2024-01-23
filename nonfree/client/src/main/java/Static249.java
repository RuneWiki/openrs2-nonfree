import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
	public static int anInt5441 = 0;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!lm;I)V")
	public static void method4263(@OriginalArg(0) Class96 arg0) {
		Static24.aClass96_1 = arg0;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!kb;IIBLclient!kb;)Lclient!ml;")
	public static Class1_Sub2_Sub16 method4264(@OriginalArg(0) Class83 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class83 arg2) {
		return Static19.method387(arg1, 0, arg2) ? Static152.method2852(arg0.method2306(arg1, 0)) : null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)Lclient!km;")
	public static Class88 method4265(@OriginalArg(0) int arg0) {
		@Pc(15) Class88 local15 = (Class88) Static83.aClass155_14.method4358((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(30) byte[] local30 = Static145.aClass83_107.method2306(Static41.method915(arg0), Static117.method1920(arg0));
		local15 = new Class88();
		if (local30 != null) {
			local15.method2590(new Class1_Sub16(local30));
		}
		Static83.aClass155_14.method4360((long) arg0, local15);
		return local15;
	}
}
