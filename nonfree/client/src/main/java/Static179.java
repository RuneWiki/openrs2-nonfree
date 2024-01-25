import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static179 {

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray11 = new boolean[8];

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "Z")
	public static boolean aBoolean278 = false;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIB)Z")
	public static boolean method3063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static442.method7188(arg0, arg1) | (arg1 & 0x70000) != 0 || Static13.method5362(arg0, arg1);
	}
}
