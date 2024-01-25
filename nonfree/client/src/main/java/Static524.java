import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static524 {

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(BI)I")
	public static int method5364(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
