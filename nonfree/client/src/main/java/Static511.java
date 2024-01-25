import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static511 {

	@OriginalMember(owner = "client!vf", name = "rb", descriptor = "[Lclient!sa;")
	public static Class131[] aClass131Array6;

	@OriginalMember(owner = "client!vf", name = "ub", descriptor = "I")
	public static int anInt8700;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBI)Z")
	public static boolean method7082(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static458.method6385(arg0, arg1) || Static376.method5638(arg0, arg1);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V")
	public static void method7084(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		Static523.anInt8857 = arg1;
		Static239.anInt4818 = 2;
		Static257.method4354(false, arg2, arg0);
	}
}
