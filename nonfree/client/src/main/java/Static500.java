import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static500 {

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IBI)Z")
	public static boolean method5191(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(III)Z")
	public static boolean method5192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}
}
