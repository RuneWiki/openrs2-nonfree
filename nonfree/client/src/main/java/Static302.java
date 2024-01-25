import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
	public static int anInt5027;

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
	public static int anInt5030;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "[I")
	public static int[] anIntArray386;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
	public static void method4111() {
		Static14.aClass151_10.method3298();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIILclient!nh;Lclient!nh;)V")
	public static void method4112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class47_Sub2 arg3, @OriginalArg(4) Class47_Sub2 arg4) {
		@Pc(4) Class137 local4 = Static266.method5735(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass47_Sub2_1 = arg3;
			local4.aClass47_Sub2_2 = arg4;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([BBI)I")
	public static int method4113(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static193.method3489(0, arg1, arg0);
	}
}
