import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static59 {

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
	public static int anInt3939 = -60;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBI)Z")
	public static boolean method3611(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}
}
