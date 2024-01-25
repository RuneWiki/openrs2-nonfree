import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static291 {

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
	public static int anInt5751;

	@OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
	public static int anInt5753 = 0;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)Z")
	public static boolean method5048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static12.method219(arg1, arg0) || Static108.method1762(arg1, arg0);
	}
}
