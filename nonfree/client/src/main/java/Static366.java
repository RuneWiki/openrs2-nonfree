import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static366 {

	@OriginalMember(owner = "client!sj", name = "v", descriptor = "I")
	public static int anInt5866;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)I")
	public static int method4711(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILclient!gk;)Lclient!nm;")
	public static Class60_Sub4 method4712(@OriginalArg(1) Class7_Sub14 arg0) {
		return new Class60_Sub4(arg0.method3961(), arg0.method3961(), arg0.method3961(), arg0.method3961(), arg0.method3975(), arg0.method3975(), arg0.method3981());
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)Z")
	public static boolean method4713(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}
}
