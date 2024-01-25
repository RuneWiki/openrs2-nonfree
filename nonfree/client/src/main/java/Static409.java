import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!pn", name = "z", descriptor = "F")
	public static float aFloat203;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)I")
	public static int method8152(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = arg0 >> 31 & arg1 - 1;
		return local19 + (arg0 + (arg0 >>> 31)) % arg1;
	}
}
