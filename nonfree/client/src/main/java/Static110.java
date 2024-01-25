import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!ff", name = "l", descriptor = "Lclient!mn;")
	public static Class171 aClass171_28;

	@OriginalMember(owner = "client!ff", name = "n", descriptor = "[I")
	public static final int[] anIntArray137 = new int[200];

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIILclient!ds;)V")
	public static void method1807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub3 arg3) {
		@Pc(4) Class36 local4 = Static61.method976(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass11_Sub3_1 = arg3;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BII)I")
	public static int method1808(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg1 - 1 & arg0 >> 31;
		return local11 + ((arg0 >>> 31) + arg0) % arg1;
	}
}
