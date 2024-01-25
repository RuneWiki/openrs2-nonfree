import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!no", name = "g", descriptor = "Lclient!qn;")
	public static Class290 aClass290_1;

	@OriginalMember(owner = "client!no", name = "i", descriptor = "Lclient!jm;")
	public static Class5_Sub31 aClass5_Sub31_2;

	@OriginalMember(owner = "client!no", name = "d", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_216 = new Class196(75, 7);

	@OriginalMember(owner = "client!no", name = "f", descriptor = "[I")
	public static final int[] anIntArray388 = new int[8];

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIILclient!pi;)V")
	public static void method5884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class272 arg4) {
		if (arg0 < 1 || arg1 < 1 || Static124.anInt2150 - 2 < arg0 || Static64.anInt1015 - 2 < arg1) {
			return;
		}
		if (Static129.aClass313ArrayArrayArray7 == null) {
			return;
		}
		@Pc(32) Interface10 local32 = Static652.aClass34_Sub1_2.method538(arg3, arg2, arg0, arg1);
		if (local32 == null) {
			return;
		}
		if (local32 instanceof Class41_Sub1_Sub1_Sub4) {
			((Class41_Sub1_Sub1_Sub4) local32).method7150(arg4);
			return;
		}
		if (local32 instanceof Class41_Sub1_Sub4_Sub1) {
			((Class41_Sub1_Sub4_Sub1) local32).method5064(arg4);
			return;
		}
		if (local32 instanceof Class41_Sub1_Sub3_Sub2) {
			((Class41_Sub1_Sub3_Sub2) local32).method8674(arg4);
		} else if (local32 instanceof Class41_Sub1_Sub5_Sub2) {
			((Class41_Sub1_Sub5_Sub2) local32).method4062(arg4);
			return;
		}
		return;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!st;B)V")
	public static void method5885(@OriginalArg(0) Class5_Sub47 arg0) {
		if (Static129.aClass313ArrayArrayArray7 == null) {
			return;
		}
		@Pc(8) Interface10 local8 = null;
		if (arg0.anInt9033 == 0) {
			local8 = (Interface10) Static322.method5015(arg0.anInt9032, arg0.anInt9036, arg0.anInt9031);
		}
		if (arg0.anInt9033 == 1) {
			local8 = (Interface10) Static295.method4024(arg0.anInt9032, arg0.anInt9036, arg0.anInt9031);
		}
		if (arg0.anInt9033 == 2) {
			local8 = (Interface10) Static156.method2369(arg0.anInt9032, arg0.anInt9036, arg0.anInt9031, ija.class);
		}
		if (arg0.anInt9033 == 3) {
			local8 = (Interface10) Static198.method2808(arg0.anInt9032, arg0.anInt9036, arg0.anInt9031);
		}
		if (local8 == null) {
			arg0.anInt9041 = 0;
			arg0.anInt9040 = 0;
			arg0.anInt9034 = -1;
		} else {
			arg0.anInt9034 = local8.method8668();
			arg0.anInt9041 = local8.method8670();
			arg0.anInt9040 = local8.method8671();
		}
	}
}
