import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
	public static int anInt10;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
	public static int anInt11;

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "Z")
	public static boolean aBoolean3 = false;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)I")
	public static int method12(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
