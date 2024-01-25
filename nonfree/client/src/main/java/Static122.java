import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static122 {

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "Z")
	public static boolean aBoolean200;

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
	public static int anInt2525;

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
	public static final int anInt2526 = 4;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)I")
	public static int method2322(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
