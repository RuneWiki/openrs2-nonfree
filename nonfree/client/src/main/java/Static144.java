import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static144 {

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
	public static int anInt2464 = -1;

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)I")
	public static int method2134(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}
}
