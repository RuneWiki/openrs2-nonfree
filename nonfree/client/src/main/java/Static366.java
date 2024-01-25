import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static366 {

	@OriginalMember(owner = "client!oe", name = "G", descriptor = "[Z")
	public static final boolean[] aBooleanArray23 = new boolean[100];

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "(III)Z")
	public static boolean method5423(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static500.method6917(arg1, arg0) & (Static24.method349(arg1, arg0) | (arg0 & 0x2000) != 0 | Static249.method3892(arg1, arg0));
	}

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "(III)Z")
	public static boolean method5425(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}
}
