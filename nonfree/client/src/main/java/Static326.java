import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!laa", name = "t", descriptor = "I")
	public static int anInt6046;

	@OriginalMember(owner = "client!laa", name = "v", descriptor = "[I")
	public static final int[] anIntArray387 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIIIILclient!dja;)V")
	public static void method5077(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class81 arg4) {
		if (arg3 < 1 || arg2 < 1 || Static251.anInt4680 - 2 < arg3 || Static406.anInt6924 - 2 < arg2) {
			return;
		}
		if (Static332.aClass247ArrayArrayArray1 == null) {
			return;
		}
		@Pc(42) Interface2 local42 = Static196.aClass67_Sub1_2.method1835(arg1, arg2, arg3, arg0);
		if (local42 == null) {
			return;
		}
		if (local42 instanceof Class23_Sub2_Sub1_Sub4) {
			((Class23_Sub2_Sub1_Sub4) local42).method6552(arg4);
			return;
		}
		if (local42 instanceof Class23_Sub2_Sub3_Sub2) {
			((Class23_Sub2_Sub3_Sub2) local42).method7830(arg4);
			return;
		}
		if (local42 instanceof Class23_Sub2_Sub5_Sub1) {
			((Class23_Sub2_Sub5_Sub1) local42).method6804(arg4);
		} else if (local42 instanceof Class23_Sub2_Sub2_Sub1) {
			((Class23_Sub2_Sub2_Sub1) local42).method1515(arg4);
			return;
		}
		return;
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(II)V")
	public static void method5079(@OriginalArg(0) int arg0) {
		Static201.aLong102 = 1000000000L / (long) arg0;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(III)I")
	public static int method5080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
