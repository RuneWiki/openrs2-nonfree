import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static164 {

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
	public static int anInt3670;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)Z")
	public static boolean method2974(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static412.method5786(arg0, arg1) & Static336.method4912(arg1, arg0);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!ri;[ILclient!ri;B)V")
	public static void method2975(@OriginalArg(0) Class284 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class284 arg2) {
		if (arg1 != null) {
			Static294.anIntArray262 = arg1;
		}
		Static537.aClass284_152 = arg2;
		Static451.aClass284_127 = arg0;
	}
}
