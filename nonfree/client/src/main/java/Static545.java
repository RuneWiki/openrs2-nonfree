import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static545 {

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIZ)I")
	public static int method7975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static377.anIntArray496[arg1 & 0x3] : Static106.anIntArray194[arg1 & 0x3];
	}
}
