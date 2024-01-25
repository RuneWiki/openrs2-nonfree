import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!via")
public final class Class369 implements Interface26 {

	@OriginalMember(owner = "client!via", name = "h", descriptor = "Lclient!uga;")
	private final Class13_Sub3 aClass13_Sub3_12;

	@OriginalMember(owner = "client!via", name = "g", descriptor = "I")
	public final int anInt10131;

	@OriginalMember(owner = "client!via", name = "i", descriptor = "[I")
	public final int[] anIntArray887;

	@OriginalMember(owner = "client!via", name = "c", descriptor = "I")
	public final int anInt10128;

	@OriginalMember(owner = "client!via", name = "e", descriptor = "Lclient!jo;")
	private Class173 aClass173_1;

	@OriginalMember(owner = "client!via", name = "a", descriptor = "[F")
	public float[] aFloatArray81;

	@OriginalMember(owner = "client!via", name = "<init>", descriptor = "(Lclient!uga;Lclient!vr;Lclient!jo;)V")
	public Class369(@OriginalArg(0) Class13_Sub3 arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) Class173 arg2) {
		this.aClass13_Sub3_12 = arg0;
		if (arg1 instanceof Class33_Sub1_Sub3) {
			@Pc(34) Class33_Sub1_Sub3 local34 = (Class33_Sub1_Sub3) arg1;
			this.anIntArray887 = local34.anIntArray438;
			this.anInt10128 = local34.anInt4869;
			this.anInt10131 = local34.anInt4871;
		} else if (arg1 instanceof Class33_Sub1_Sub1) {
			@Pc(17) Class33_Sub1_Sub1 local17 = (Class33_Sub1_Sub1) arg1;
			this.anInt10131 = local17.anInt4871;
			this.anIntArray887 = local17.anIntArray75;
			this.anInt10128 = local17.anInt4869;
		} else {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			this.aClass173_1 = arg2;
			if (this.anInt10131 != this.aClass173_1.anInt4902 || this.anInt10128 != this.aClass173_1.anInt4904) {
				throw new RuntimeException();
			}
			this.aFloatArray81 = this.aClass173_1.aFloatArray25;
		}
	}

	@OriginalMember(owner = "client!via", name = "b", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method9017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static521.method6953(arg5, this.aClass13_Sub3_12.aClass3_Sub13_1.anIntArray475, this.aFloatArray81, this.anInt10131, this.aClass13_Sub3_12.aFloatArray78, arg4, this.anIntArray887, arg0, arg1, arg2, arg3, this.aClass13_Sub3_12.aClass3_Sub13_1.anInt5276);
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method9016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4) {
		Static521.method6953(0, this.anIntArray887, this.aClass13_Sub3_12.aFloatArray78, this.aClass13_Sub3_12.aClass3_Sub13_1.anInt5276, this.aFloatArray81, 0, arg4 ? this.aClass13_Sub3_12.aClass3_Sub13_1.anIntArray475 : null, arg0, arg1, arg2, arg3, this.anInt10131);
	}
}
