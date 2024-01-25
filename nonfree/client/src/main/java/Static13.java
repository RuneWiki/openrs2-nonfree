import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static13 {

	@OriginalMember(owner = "client!am", name = "a", descriptor = "I")
	public static int anInt316;

	@OriginalMember(owner = "client!am", name = "g", descriptor = "I")
	public static int anInt320 = 0;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BII)Z")
	public static boolean method218(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IZ)I")
	public static int method219(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
