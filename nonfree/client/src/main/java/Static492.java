import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static492 {

	@OriginalMember(owner = "client!st", name = "l", descriptor = "I")
	public static int anInt8281 = 0;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ILclient!pfa;Lclient!pfa;Lclient!he;Lclient!pfa;)Z")
	public static boolean method6723(@OriginalArg(1) Class251 arg0, @OriginalArg(2) Class251 arg1, @OriginalArg(3) Class6_Sub18_Sub2 arg2, @OriginalArg(4) Class251 arg3) {
		Static447.aClass251_103 = arg1;
		Static587.aClass6_Sub18_Sub2_3 = arg2;
		Static582.aClass251_128 = arg3;
		Static96.aClass251_24 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(I)V")
	public static void method6724() {
		Static378.aClass128_30.method3274();
		Static103.aClass128_6.method3274();
	}
}
