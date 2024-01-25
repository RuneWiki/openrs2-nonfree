import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!pfa", name = "g", descriptor = "D")
	public static double aDouble16;

	@OriginalMember(owner = "client!pfa", name = "c", descriptor = "[I")
	public static final int[] anIntArray409 = new int[4096];

	@OriginalMember(owner = "client!pfa", name = "e", descriptor = "[I")
	public static final int[] anIntArray410 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!pfa", name = "i", descriptor = "I")
	public static int anInt8173 = 1;

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IILclient!ha;)Lclient!mq;")
	public static Class71 method7305(@OriginalArg(1) int arg0, @OriginalArg(2) Class101 arg1) {
		@Pc(10) Class2_Sub18 local10 = (Class2_Sub18) Static284.aClass335_14.method8357((long) arg0);
		if (local10 != null) {
			@Pc(17) Class2_Sub7_Sub4 local17 = local10.aClass78_Sub1_1.method2008();
			local10.aBoolean111 = true;
			if (local17 != null) {
				return local17.method7544(arg1);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ZLclient!ol;)Lclient!ia;")
	public static Class26_Sub4 method7306(@OriginalArg(1) Class2_Sub8 arg0) {
		return new Class26_Sub4(arg0.method5174(), arg0.method5174(), arg0.method5174(), arg0.method5174(), arg0.method5174(), arg0.method5174(), arg0.method5174(), arg0.method5174(), arg0.method5161(), arg0.method5203());
	}
}
