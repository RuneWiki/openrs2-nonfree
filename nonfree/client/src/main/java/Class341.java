import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class341 implements Interface15 {

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "Lclient!qk;")
	private final Class65_Sub3 aClass65_Sub3_11;

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "[I")
	public final int[] anIntArray522;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
	public final int anInt9508;

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
	public final int anInt9510;

	@OriginalMember(owner = "client!tr", name = "j", descriptor = "Lclient!oh;")
	private Class264 aClass264_1;

	@OriginalMember(owner = "client!tr", name = "i", descriptor = "[F")
	public float[] aFloatArray91;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lclient!qk;Lclient!pu;Lclient!oh;)V")
	public Class341(@OriginalArg(0) Class65_Sub3 arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) Class264 arg2) {
		this.aClass65_Sub3_11 = arg0;
		if (arg1 instanceof Class50_Sub2_Sub2) {
			@Pc(34) Class50_Sub2_Sub2 local34 = (Class50_Sub2_Sub2) arg1;
			this.anIntArray522 = local34.anIntArray183;
			this.anInt9508 = local34.anInt7255;
			this.anInt9510 = local34.anInt7252;
		} else if (arg1 instanceof Class50_Sub2_Sub1) {
			@Pc(17) Class50_Sub2_Sub1 local17 = (Class50_Sub2_Sub1) arg1;
			this.anIntArray522 = local17.anIntArray103;
			this.anInt9508 = local17.anInt7255;
			this.anInt9510 = local17.anInt7252;
		} else {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			this.aClass264_1 = arg2;
			if (this.aClass264_1.anInt7415 != this.anInt9510 || this.anInt9508 != this.aClass264_1.anInt7412) {
				throw new RuntimeException();
			}
			this.aFloatArray91 = this.aClass264_1.aFloatArray73;
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static159.method571(arg0, this.aFloatArray91, arg1, arg4, arg2, this.aClass65_Sub3_11.aClass5_Sub26_1.anIntArray230, this.anInt9510, this.anIntArray522, this.aClass65_Sub3_11.aFloatArray80, arg3, arg5, this.aClass65_Sub3_11.aClass5_Sub26_1.anInt4454);
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4) {
		Static159.method571(arg0, this.aClass65_Sub3_11.aFloatArray80, arg1, 0, arg2, this.anIntArray522, this.aClass65_Sub3_11.aClass5_Sub26_1.anInt4454, arg4 ? this.aClass65_Sub3_11.aClass5_Sub26_1.anIntArray230 : null, this.aFloatArray91, arg3, 0, this.anInt9510);
	}
}
