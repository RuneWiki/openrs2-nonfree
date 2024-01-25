import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static185 {

	@OriginalMember(owner = "client!fw", name = "m", descriptor = "Z")
	public static boolean aBoolean287 = false;

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(III)Z")
	public static boolean method3087(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}
}
