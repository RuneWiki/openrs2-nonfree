import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static378 {

	@OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
	public static int anInt6747 = 104;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)I")
	public static int method5461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static232.anIntArray219[arg0 & 0x3] : Static548.anIntArray579[arg0 & 0x3];
	}
}
