import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static315 {

	@OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
	public static int anInt5383;

	@OriginalMember(owner = "client!mk", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray20 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!mk", name = "l", descriptor = "Lclient!hd;")
	public static final Class128 aClass128_26 = new Class128(16);

	@OriginalMember(owner = "client!mk", name = "m", descriptor = "Z")
	public static boolean aBoolean383 = false;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!pfa;ILclient!pfa;Lclient!pfa;Lclient!pfa;)V")
	public static void method4664(@OriginalArg(0) Class251 arg0, @OriginalArg(2) Class251 arg1, @OriginalArg(3) Class251 arg2, @OriginalArg(4) Class251 arg3) {
		Static398.aClass251_95 = arg1;
		Static118.aClass251_30 = arg3;
		Static157.aClass251_50 = arg0;
		Static14.aClass292ArrayArray1 = new Class292[Static118.aClass251_30.method5755()][];
		Static285.aBooleanArray25 = new boolean[Static118.aClass251_30.method5755()];
	}
}
