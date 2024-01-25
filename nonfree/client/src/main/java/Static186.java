import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static186 {

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)I")
	public static int method3971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static223.anIntArrayArray91 == null ? 0 : Static223.anIntArrayArray91[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)Z")
	public static boolean method3972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}
}
