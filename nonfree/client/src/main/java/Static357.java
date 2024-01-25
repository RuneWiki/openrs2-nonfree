import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
	public static int anInt6853;

	@OriginalMember(owner = "client!wf", name = "F", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_211 = new Class217(22, 6);

	@OriginalMember(owner = "client!wf", name = "N", descriptor = "F")
	public static float aFloat76 = 0.0F;

	@OriginalMember(owner = "client!wf", name = "O", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_231 = new Class106("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZIIBZ)Lclient!ct;")
	public static Class30 method5928(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(4) boolean arg2) {
		@Pc(10) Class28 local10 = null;
		if (Static235.aClass162_4 != null) {
			local10 = new Class28(arg1, Static235.aClass162_4, Static336.aClass162Array1[arg1], 1000000);
		}
		Static14.aClass51_Sub1Array2[arg1] = Static221.aClass204_1.method5502(local10, arg1, Static90.aClass28_3);
		if (arg0) {
			Static14.aClass51_Sub1Array2[arg1].method1735();
		}
		return new Class30(Static14.aClass51_Sub1Array2[arg1], arg2, 1);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)Z")
	public static boolean method5930(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI)I")
	public static int method5931(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static73.method1611(arg0);
	}
}
