import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!so", name = "M", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray26;

	@OriginalMember(owner = "client!so", name = "K", descriptor = "[I")
	public static final int[] anIntArray436 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!nj;I)V")
	public static void method5015(@OriginalArg(0) Class25_Sub1_Sub1_Sub1 arg0) {
		@Pc(19) Class5_Sub27 local19 = (Class5_Sub27) Static331.aClass42_55.method1052((long) arg0.anInt5287);
		if (local19 == null) {
			return;
		}
		if (local19.aClass5_Sub17_Sub1_1 != null) {
			Static5.aClass5_Sub17_Sub3_1.method3544(local19.aClass5_Sub17_Sub1_1);
			local19.aClass5_Sub17_Sub1_1 = null;
		}
		local19.method5803();
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIILclient!fm;Lclient!fm;)V")
	public static void method5016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class25_Sub2 arg3, @OriginalArg(4) Class25_Sub2 arg4) {
		if (Static138.aClass51ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static168.method3164(arg0, arg1, arg2);
		}
		Static138.aClass51ArrayArrayArray1[arg0][arg1][arg2].aClass25_Sub2_1 = arg3;
		Static138.aClass51ArrayArrayArray1[arg0][arg1][arg2].aClass25_Sub2_2 = arg4;
	}
}
