import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static213 {

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
	public static int anInt3732 = 0;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)I")
	public static int method3421(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
