import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!oha", name = "b", descriptor = "Lclient!wu;")
	public static Class380 aClass380_98;

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(II)I")
	public static int method5469(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(IZLclient!paa;I)V")
	public static void method5471(@OriginalArg(0) int arg0, @OriginalArg(2) Class261 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		if (arg1.anObjectArray20 != null) {
			@Pc(13) Class2_Sub46 local13 = new Class2_Sub46();
			local13.anObjectArray32 = arg1.anObjectArray20;
			local13.aClass261_10 = arg1;
			Static300.method4138(local13);
		}
		Static558.anInt9109 = arg1.anInt6585;
		Static241.anInt3917 = arg0;
		Static83.anInt1494 = arg1.anInt6641;
		Static8.aBoolean11 = true;
		Static144.anInt2622 = arg1.anInt6589;
		Static198.anInt8166 = arg2;
		Static620.anInt9955 = arg1.anInt6629;
		Static301.anInt4926 = arg1.anInt6614;
		Static624.method8351(arg1);
	}
}
