import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static326 {

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "Lclient!ts;")
	public static Class86 aClass86_1;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILclient!lt;)V")
	public static void method4620(@OriginalArg(1) Class158 arg0) {
		Static179.aClass158_37 = arg0;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)Z")
	public static boolean method4621(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
