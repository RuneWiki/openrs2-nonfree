import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static453 {

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)I")
	public static int method6012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static120.aByteArrayArray20 == null ? 0 : Static120.aByteArrayArray20[arg0][arg1] & 0xFF;
	}
}
