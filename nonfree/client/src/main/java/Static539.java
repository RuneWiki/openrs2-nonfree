import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static539 {

	@OriginalMember(owner = "client!sea", name = "g", descriptor = "Lclient!afa;")
	public static final Class11 aClass11_5 = new Class11();

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IB)V")
	public static void method7483(@OriginalArg(0) int arg0) {
		Static343.anInt6172 = arg0;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IZI)Z")
	public static boolean method7484(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static561.method7661(arg1, arg0) | (arg1 & 0x10000) != 0 || Static293.method4566(arg1, arg0)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static179.method2975(arg1, arg0);
		}
	}
}
