import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static129 {

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "Z")
	public static boolean aBoolean226;

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(III)Z")
	public static boolean method2484(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
