import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!oia", name = "n", descriptor = "Lclient!jd;")
	public static Class20 aClass20_29;

	@OriginalMember(owner = "client!oia", name = "s", descriptor = "Lclient!m;")
	public static Class225 aClass225_1;

	@OriginalMember(owner = "client!oia", name = "k", descriptor = "Lclient!saa;")
	public static final Class310 aClass310_11 = new Class310(9, 2);

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(B)Z")
	public static boolean method6300() {
		return Static507.anInt8961 == 0 ? Static558.aClass14_Sub5_Sub2_2.method3875() : true;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(FFIFLclient!afa;ZIIFFI)[B")
	public static byte[] method6301(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) Class11 arg3, @OriginalArg(8) float arg4, @OriginalArg(9) float arg5) {
		@Pc(15) byte[] local15 = new byte[262144];
		Static34.method818(arg4, arg5, arg0, arg3, arg1, arg2, 0, local15);
		return local15;
	}
}
