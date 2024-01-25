import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!j", name = "a", descriptor = "I")
	public static int anInt3336 = 0;

	@OriginalMember(owner = "client!j", name = "b", descriptor = "[Lclient!ct;")
	public static final Interface2[] anInterface2Array2 = new Interface2[75];

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ZZLclient!gi;)V")
	public static void method2742(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class93 arg1) {
		@Pc(15) int local15 = arg1.anInt2472 == 0 ? arg1.anInt2436 : arg1.anInt2472;
		@Pc(27) int local27 = arg1.anInt2450 == 0 ? arg1.anInt2495 : arg1.anInt2450;
		Static217.method3046(Static188.aClass93ArrayArray4[arg1.anInt2508 >> 16], local27, arg1.anInt2508, local15, arg0);
		if (arg1.aClass93Array1 != null) {
			Static217.method3046(arg1.aClass93Array1, local27, arg1.anInt2508, local15, arg0);
		}
		@Pc(65) Class2_Sub9 local65 = (Class2_Sub9) Static394.aClass220_45.method5099((long) arg1.anInt2508);
		if (local65 != null) {
			Static430.method5866(arg0, local65.anInt1143, local27, local15);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIBII)V")
	public static void method2743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static5.anInt6726 / (float) Static5.anInt6725;
		@Pc(11) int local11 = arg1;
		@Pc(17) int local17 = arg0;
		if (local9 < 1.0F) {
			local17 = (int) ((float) arg1 * local9);
		} else {
			local11 = (int) ((float) arg0 / local9);
		}
		@Pc(43) int local43 = arg3 - (arg1 - local11) / 2;
		@Pc(51) int local51 = arg2 - (arg0 - local17) / 2;
		Static227.anInt3810 = -1;
		Static180.anInt3183 = Static5.anInt6726 - Static5.anInt6726 * local51 / local17;
		Static204.anInt3501 = local43 * Static5.anInt6725 / local11;
		Static32.anInt7619 = -1;
		Static423.method5788();
	}
}
