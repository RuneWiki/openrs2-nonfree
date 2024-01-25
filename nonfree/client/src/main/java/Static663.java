import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static663 {

	@OriginalMember(owner = "client!wh", name = "n", descriptor = "Lclient!ha;")
	public static Class95 aClass95_15;

	@OriginalMember(owner = "client!wh", name = "t", descriptor = "Lclient!da;")
	public static Class67 aClass67_16;

	@OriginalMember(owner = "client!wh", name = "w", descriptor = "[I")
	public static final int[] anIntArray590 = new int[1];

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "([FII)[F")
	public static float[] method8841(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static681.method4037(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIILclient!md;Lclient!md;)V")
	public static void method8842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class34_Sub1_Sub3 arg3, @OriginalArg(4) Class34_Sub1_Sub3 arg4) {
		@Pc(4) Class368 local4 = Static172.method2744(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass34_Sub1_Sub3_1 = arg3;
		local4.aClass34_Sub1_Sub3_2 = arg4;
		@Pc(19) int local19 = Static582.aClass35Array3 == Static368.aClass35Array1 ? 1 : 0;
		if (!arg3.method7845()) {
			arg3.aClass34_Sub1_23 = Static392.aClass34_Sub1Array4[local19];
			Static392.aClass34_Sub1Array4[local19] = arg3;
		} else if (arg3.method7853()) {
			arg3.aClass34_Sub1_23 = Static218.aClass34_Sub1Array2[local19];
			Static218.aClass34_Sub1Array2[local19] = arg3;
		} else {
			arg3.aClass34_Sub1_23 = Static368.aClass34_Sub1Array3[local19];
			Static368.aClass34_Sub1Array3[local19] = arg3;
			Static182.aBoolean246 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method7845()) {
			if (arg4.method7853()) {
				arg4.aClass34_Sub1_23 = Static218.aClass34_Sub1Array2[local19];
				Static218.aClass34_Sub1Array2[local19] = arg4;
				return;
			}
			arg4.aClass34_Sub1_23 = Static368.aClass34_Sub1Array3[local19];
			Static368.aClass34_Sub1Array3[local19] = arg4;
			Static182.aBoolean246 = true;
			return;
		}
		arg4.aClass34_Sub1_23 = Static392.aClass34_Sub1Array4[local19];
		Static392.aClass34_Sub1Array4[local19] = arg4;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)V")
	public static void method8843(@OriginalArg(0) int arg0) {
		@Pc(14) Class3_Sub15 local14 = (Class3_Sub15) Static484.aClass333_30.method7489((long) arg0);
		if (local14 != null) {
			local14.aBoolean204 = !local14.aBoolean204;
			local14.aClass207_Sub1_1.method8468(local14.aBoolean204);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)Z")
	public static boolean method8844(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}
}
