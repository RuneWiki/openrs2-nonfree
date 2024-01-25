import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static626 {

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "Lclient!mq;")
	public static final Class236 aClass236_6 = new Class236();

	@OriginalMember(owner = "client!wfa", name = "c", descriptor = "[I")
	public static final int[] anIntArray348 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(II)I")
	public static int method5555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static488.aByteArrayArray18 == null ? 0 : Static488.aByteArrayArray18[arg0][arg1] & 0xFF;
	}
}
