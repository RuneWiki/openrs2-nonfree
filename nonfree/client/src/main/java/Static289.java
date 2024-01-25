import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!sn", name = "r", descriptor = "Lclient!bo;")
	public static final Class24 aClass24_27 = new Class24(8);

	@OriginalMember(owner = "client!sn", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString212 = "Loaded defaults";

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(BII)Lclient!ao;")
	public static Class13 method4948(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class13 local7 = new Class13();
		local7.anInt348 = arg1 + 1 + 5;
		local7.anInt336 = -1;
		local7.anInt342 = arg0 + 1 + 5;
		local7.anInt340 = -1;
		local7.anIntArrayArray1 = new int[local7.anInt342][local7.anInt348];
		local7.method241();
		return local7;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(BI)V")
	public static void method4949(@OriginalArg(1) int arg0) {
		Static265.anInt5321 = -1;
		Static286.anInt5771 = -1;
		Static330.anInt6402 = arg0;
		Static149.method2422();
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZI)I")
	public static int method4951(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
