import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!gd", name = "F", descriptor = "[I")
	public static final int[] anIntArray243 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!gd", name = "J", descriptor = "[S")
	public static final short[] aShortArray36 = new short[] { 13, 48, 21, 17, 8, 16, 57, 60 };

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIILclient!fj;Lclient!fj;)V")
	public static void method3315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub3 arg3, @OriginalArg(4) Class11_Sub3 arg4) {
		@Pc(4) Class224 local4 = Static178.method3530(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass11_Sub3_2 = arg3;
			local4.aClass11_Sub3_1 = arg4;
		}
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)Lclient!ob;")
	public static Class6_Sub4_Sub12 method3316() {
		return Static461.aClass6_Sub4_Sub12_2;
	}
}
