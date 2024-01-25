import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class333 implements Interface24 {

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "Lclient!uj;")
	private final Class87_Sub3 aClass87_Sub3_11;

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "[I")
	public final int[] anIntArray650;

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
	public final int anInt9278;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
	public final int anInt9274;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "Lclient!wo;")
	private Class376 aClass376_1;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "[F")
	public float[] aFloatArray71;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!uj;Lclient!kr;Lclient!wo;)V")
	public Class333(@OriginalArg(0) Class87_Sub3 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) Class376 arg2) {
		this.aClass87_Sub3_11 = arg0;
		if (arg1 instanceof Class20_Sub1_Sub1) {
			@Pc(34) Class20_Sub1_Sub1 local34 = (Class20_Sub1_Sub1) arg1;
			this.anIntArray650 = local34.anIntArray53;
			this.anInt9278 = local34.anInt4951;
			this.anInt9274 = local34.anInt4941;
		} else if (arg1 instanceof Class20_Sub1_Sub3) {
			@Pc(17) Class20_Sub1_Sub3 local17 = (Class20_Sub1_Sub3) arg1;
			this.anIntArray650 = local17.anIntArray339;
			this.anInt9278 = local17.anInt4951;
			this.anInt9274 = local17.anInt4941;
		} else {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			this.aClass376_1 = arg2;
			if (this.aClass376_1.anInt10176 != this.anInt9274 || this.anInt9278 != this.aClass376_1.anInt10174) {
				throw new RuntimeException();
			}
			this.aFloatArray71 = this.aClass376_1.aFloatArray78;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4) {
		Static638.method6581(this.aClass87_Sub3_11.aClass2_Sub27_1.anInt7426, 0, this.aClass87_Sub3_11.aFloatArray75, this.aFloatArray71, arg1, 0, arg2, this.anInt9274, arg3, arg4 ? this.aClass87_Sub3_11.aClass2_Sub27_1.anIntArray501 : null, arg0, this.anIntArray650);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static638.method6581(this.anInt9274, arg5, this.aFloatArray71, this.aClass87_Sub3_11.aFloatArray75, arg1, arg4, arg2, this.aClass87_Sub3_11.aClass2_Sub27_1.anInt7426, arg3, this.anIntArray650, arg0, this.aClass87_Sub3_11.aClass2_Sub27_1.anIntArray501);
	}
}
