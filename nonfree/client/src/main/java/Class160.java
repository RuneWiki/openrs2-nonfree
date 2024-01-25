import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class160 implements Interface14 {

	@OriginalMember(owner = "client!it", name = "k", descriptor = "Lclient!ao;")
	private final Class20_Sub1 aClass20_Sub1_6;

	@OriginalMember(owner = "client!it", name = "g", descriptor = "I")
	public final int anInt5354;

	@OriginalMember(owner = "client!it", name = "d", descriptor = "I")
	public final int anInt5352;

	@OriginalMember(owner = "client!it", name = "m", descriptor = "[I")
	public final int[] anIntArray284;

	@OriginalMember(owner = "client!it", name = "f", descriptor = "Lclient!ru;")
	private Class304 aClass304_1;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "[F")
	public float[] aFloatArray49;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lclient!ao;Lclient!mi;Lclient!ru;)V")
	public Class160(@OriginalArg(0) Class20_Sub1 arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) Class304 arg2) {
		this.aClass20_Sub1_6 = arg0;
		if (arg1 instanceof Class46_Sub1_Sub1) {
			@Pc(34) Class46_Sub1_Sub1 local34 = (Class46_Sub1_Sub1) arg1;
			this.anIntArray284 = local34.anIntArray86;
			this.anInt5352 = local34.anInt6667;
			this.anInt5354 = local34.anInt6668;
		} else if (arg1 instanceof Class46_Sub1_Sub3) {
			@Pc(17) Class46_Sub1_Sub3 local17 = (Class46_Sub1_Sub3) arg1;
			this.anInt5354 = local17.anInt6668;
			this.anInt5352 = local17.anInt6667;
			this.anIntArray284 = local17.anIntArray400;
		} else {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			this.aClass304_1 = arg2;
			if (this.aClass304_1.anInt9241 != this.anInt5354 || this.anInt5352 != this.aClass304_1.anInt9244) {
				throw new RuntimeException();
			}
			this.aFloatArray49 = this.aClass304_1.aFloatArray79;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static497.method7714(this.aClass20_Sub1_6.aClass2_Sub31_1.anIntArray340, arg1, arg0, arg5, this.aClass20_Sub1_6.aFloatArray1, this.anIntArray284, arg2, arg3, this.aClass20_Sub1_6.aClass2_Sub31_1.anInt5956, this.anInt5354, arg4, this.aFloatArray49);
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4) {
		Static497.method7714(this.anIntArray284, arg1, arg0, 0, this.aFloatArray49, arg4 ? this.aClass20_Sub1_6.aClass2_Sub31_1.anIntArray340 : null, arg2, arg3, this.anInt5354, this.aClass20_Sub1_6.aClass2_Sub31_1.anInt5956, 0, this.aClass20_Sub1_6.aFloatArray1);
	}
}
