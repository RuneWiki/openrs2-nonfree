import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static179 {

	@OriginalMember(owner = "client!ft", name = "D", descriptor = "I")
	public static int anInt3370;

	@OriginalMember(owner = "client!ft", name = "G", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_50 = new Class376(73, 7);

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IZI)Z")
	public static boolean method2975(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static473.method6806(arg1, arg0)) {
			return (arg0 & 0xB000) != 0 | Static123.method2195(arg0, arg1) | Static28.method920(arg0, arg1) ? true : (Static561.method7661(arg0, arg1) | Static231.method3708(arg1, arg0)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}
}
