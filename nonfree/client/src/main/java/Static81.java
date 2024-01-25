import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!cp", name = "o", descriptor = "I")
	public static int anInt1699;

	@OriginalMember(owner = "client!cp", name = "q", descriptor = "Lclient!lr;")
	public static Class196 aClass196_1;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lclient!sca;B)V")
	public static void method1416(@OriginalArg(0) Class302 arg0) {
		if (arg0.anInt8784 != Static361.anInt6679) {
			return;
		}
		if (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aString12 == null) {
			arg0.anInt8871 = 0;
			arg0.anInt8789 = 0;
			return;
		}
		arg0.anInt8845 = 150;
		arg0.anInt8786 = (int) (Math.sin((double) Static113.anInt2243 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt8823 = 5;
		arg0.anInt8871 = Static229.anInt4561;
		arg0.anInt8789 = Static236.method4095(Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aString12);
		arg0.anInt8836 = 0;
		arg0.anInt8785 = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt5532;
		arg0.anInt8798 = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt5571;
		arg0.anInt8841 = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt5533;
		@Pc(76) Class21 local76 = arg0.anInt8798 == -1 ? null : Static294.aClass373_2.method8738(arg0.anInt8798);
		if (local76 != null) {
			Static215.method3663(local76, arg0.anInt8841);
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "([SIZ)[S")
	public static short[] method1418(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static655.method5834(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
