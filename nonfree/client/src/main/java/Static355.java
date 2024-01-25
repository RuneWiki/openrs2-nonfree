import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static355 {

	@OriginalMember(owner = "client!sd", name = "J", descriptor = "I")
	public static int anInt6272;

	@OriginalMember(owner = "client!sd", name = "X", descriptor = "I")
	public static int anInt6284;

	@OriginalMember(owner = "client!sd", name = "N", descriptor = "I")
	public static int anInt6274 = 765;

	@OriginalMember(owner = "client!sd", name = "cb", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_159 = new Class81(98, 4);

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(IB)I")
	public static int method4988(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)Z")
	public static boolean method4990(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}
}
