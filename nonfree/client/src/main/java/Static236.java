import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "Lclient!vr;")
	public static final Class258 aClass258_6 = new Class258("LOCAL", 4);

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!dk;Lclient!dk;I)V")
	public static void method3052(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class54 arg1) {
		Static180.aClass54_52 = arg1;
		Static161.aClass54_101 = arg0;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I[S)[S")
	public static short[] method3054(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static464.method1968(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
