import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static615 {

	@OriginalMember(owner = "client!vw", name = "h", descriptor = "[I")
	public static int[] anIntArray695;

	@OriginalMember(owner = "client!vw", name = "r", descriptor = "I")
	public static int anInt10774;

	@OriginalMember(owner = "client!vw", name = "s", descriptor = "[Lclient!ga;")
	public static Class3_Sub1[] aClass3_Sub1Array145;

	@OriginalMember(owner = "client!vw", name = "u", descriptor = "I")
	public static int anInt10775;

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "I")
	public static int anInt10769 = 0;

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(III)I")
	public static int method8978(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}
}
