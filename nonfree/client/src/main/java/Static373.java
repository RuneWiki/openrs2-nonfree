import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static373 {

	@OriginalMember(owner = "client!nia", name = "c", descriptor = "[I")
	public static int[] anIntArray464;

	@OriginalMember(owner = "client!nia", name = "d", descriptor = "Lclient!in;")
	public static Class157 aClass157_190;

	@OriginalMember(owner = "client!nia", name = "g", descriptor = "[Lclient!up;")
	public static Class346[] aClass346Array1;

	@OriginalMember(owner = "client!nia", name = "e", descriptor = "I")
	public static int anInt7362 = 0;

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(III)Z")
	public static boolean method6255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static460.method7173(arg1, arg0) & (Static588.method8686(arg0, arg1) | (arg0 & 0x2000) != 0 | Static480.method5982(arg1, arg0));
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(II)V")
	public static void method6256(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static173.anInt4169 = arg0;
		Static99.aClass3_Sub9Array1 = new Class3_Sub9[Static480.anIntArray442[Static173.anInt4169] + 1];
		Static551.anInt3120 = 0;
		Static184.anInt4423 = 0;
	}
}
