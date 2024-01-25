import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static523 {

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "I")
	public static int anInt9188 = 1;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BII)Z")
	public static boolean method7236(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
