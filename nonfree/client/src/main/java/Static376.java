import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static376 {

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_169 = new Class150(71, 7);

	@OriginalMember(owner = "client!pf", name = "k", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_170 = new Class150(36, -2);

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)Z")
	public static boolean method5638(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static182.method3093(arg0, arg1)) {
			return Static458.method6385(arg0, arg1) | (arg1 & 0xB000) != 0 | Static528.method6949(arg1, arg0) ? true : (Static388.method5701(arg1, arg0) | Static160.method2897(arg1, arg0)) & (arg0 & 0x37) == 0;
		} else {
			return false;
		}
	}
}
