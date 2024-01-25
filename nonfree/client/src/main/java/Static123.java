import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static123 {

	@OriginalMember(owner = "client!dq", name = "i", descriptor = "I")
	public static int anInt2492;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(III)Z")
	public static boolean method2282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0xC580) != 0;
	}
}
