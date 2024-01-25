import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static392 {

	@OriginalMember(owner = "client!nca", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIB)Z")
	public static boolean method5546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x10000) != 0 | Static568.method8029(arg0, arg1) || Static544.method7820(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static639.method8893(arg1, arg0);
		}
	}
}
