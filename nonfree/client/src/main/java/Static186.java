import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static186 {

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
	public static int anInt3835 = 0;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IBI)Z")
	public static boolean method3177(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}
}
