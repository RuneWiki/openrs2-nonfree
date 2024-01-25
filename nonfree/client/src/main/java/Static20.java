import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static20 {

	@OriginalMember(owner = "client!al", name = "f", descriptor = "I")
	public static int anInt303;

	@OriginalMember(owner = "client!al", name = "b", descriptor = "I")
	public static final int anInt300 = 1338;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IZI)Z")
	public static boolean method280(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static86.method1835(arg0, arg1) | (arg0 & 0x40000) != 0 || Static457.method6552(arg0, arg1);
	}
}
