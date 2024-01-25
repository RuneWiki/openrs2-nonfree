import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!eq", name = "X", descriptor = "I")
	public static int anInt2953;

	@OriginalMember(owner = "client!eq", name = "hb", descriptor = "Z")
	public static final boolean aBoolean237 = false;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILclient!on;)I")
	public static int method2789(@OriginalArg(1) Class274 arg0) {
		if (arg0 == Static435.aClass274_10) {
			return 5120;
		} else if (arg0 == Static435.aClass274_11) {
			return 5122;
		} else if (Static435.aClass274_12 == arg0) {
			return 5124;
		} else if (arg0 == Static435.aClass274_13) {
			return 5121;
		} else if (Static435.aClass274_14 == arg0) {
			return 5123;
		} else if (Static435.aClass274_15 == arg0) {
			return 5125;
		} else if (Static435.aClass274_16 == arg0) {
			return 5131;
		} else if (arg0 == Static435.aClass274_17) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2790(@OriginalArg(0) String arg0) {
		@Pc(6) Class6_Sub13 local6 = Static29.method339();
		local6.aClass6_Sub15_Sub1_1.method3016(Static650.aClass162_11.anInt4493);
		local6.aClass6_Sub15_Sub1_1.method3040(0);
		@Pc(26) int local26 = local6.aClass6_Sub15_Sub1_1.anInt3174;
		local6.aClass6_Sub15_Sub1_1.method3040(658);
		@Pc(35) int[] local35 = Static202.method3745(local6);
		@Pc(39) int local39 = local6.aClass6_Sub15_Sub1_1.anInt3174;
		local6.aClass6_Sub15_Sub1_1.method2991(arg0);
		local6.aClass6_Sub15_Sub1_1.method3016(Static601.anInt9518);
		local6.aClass6_Sub15_Sub1_1.anInt3174 += 7;
		local6.aClass6_Sub15_Sub1_1.method3002(local39, local35, local6.aClass6_Sub15_Sub1_1.anInt3174);
		local6.aClass6_Sub15_Sub1_1.method2993(local6.aClass6_Sub15_Sub1_1.anInt3174 - local26);
		Static525.aClass260_3.method6404(local6);
		Static607.anInt9572 = -3;
		Static434.anInt7427 = 0;
		Static588.anInt9365 = 0;
		Static557.anInt9014 = 1;
	}
}
