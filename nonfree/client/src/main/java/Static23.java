import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static23 {

	@OriginalMember(owner = "client!am", name = "j", descriptor = "Lclient!gw;")
	public static Class86 aClass86_4;

	@OriginalMember(owner = "client!am", name = "e", descriptor = "I")
	public static int anInt6817;

	@OriginalMember(owner = "client!am", name = "i", descriptor = "Z")
	public static boolean aBoolean574 = false;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(II)I")
	public static int method6108(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
