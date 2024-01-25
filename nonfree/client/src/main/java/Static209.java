import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static209 {

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "Z")
	public static boolean aBoolean344 = true;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)I")
	public static int method3766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static345.anIntArrayArray60 == null ? 0 : Static345.anIntArrayArray60[arg0][arg1] >>> 21 & 0x7F8;
	}
}
