import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static401 {

	@OriginalMember(owner = "client!mla", name = "s", descriptor = "Z")
	public static boolean aBoolean560 = false;

	@OriginalMember(owner = "client!mla", name = "a", descriptor = "(IZI)Z")
	public static boolean method5914(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100100) != 0;
	}
}
