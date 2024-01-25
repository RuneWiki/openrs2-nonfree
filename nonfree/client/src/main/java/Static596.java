import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static596 {

	@OriginalMember(owner = "client!tr", name = "o", descriptor = "I")
	public static int anInt9848;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IBI)I")
	public static int method8450(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) int local21 = arg0 >> 31 & arg1 - 1;
		return ((arg0 >>> 31) + arg0) % arg1 + local21;
	}
}
