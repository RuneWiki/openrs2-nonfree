import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static192 {

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(BI)I")
	public static int method2986(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}
}
