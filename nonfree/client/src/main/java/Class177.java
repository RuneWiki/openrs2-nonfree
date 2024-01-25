import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class177 implements Interface23 {

	@OriginalMember(owner = "client!jf", name = "n", descriptor = "Lclient!pm;")
	private final Class137_Sub2 aClass137_Sub2_6;

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
	public final int anInt4722;

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "[I")
	public final int[] anIntArray378;

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
	public final int anInt4723;

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "Lclient!np;")
	private Class251 aClass251_1;

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "[F")
	public float[] aFloatArray30;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!pm;Lclient!jd;Lclient!np;)V")
	public Class177(@OriginalArg(0) Class137_Sub2 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass137_Sub2_6 = arg0;
		if (arg1 instanceof Class20_Sub1_Sub2) {
			@Pc(34) Class20_Sub1_Sub2 local34 = (Class20_Sub1_Sub2) arg1;
			this.anInt4722 = local34.anInt7886;
			this.anInt4723 = local34.anInt7883;
			this.anIntArray378 = local34.anIntArray407;
		} else if (arg1 instanceof Class20_Sub1_Sub1) {
			@Pc(13) Class20_Sub1_Sub1 local13 = (Class20_Sub1_Sub1) arg1;
			this.anInt4722 = local13.anInt7886;
			this.anIntArray378 = local13.anIntArray24;
			this.anInt4723 = local13.anInt7883;
		} else {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			this.aClass251_1 = arg2;
			if (this.aClass251_1.anInt7419 != this.anInt4723 || this.anInt4722 != this.aClass251_1.anInt7418) {
				throw new RuntimeException();
			}
			this.aFloatArray30 = this.aClass251_1.aFloatArray55;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method9042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static292.method4330(arg5, this.aClass137_Sub2_6.aFloatArray61, arg3, arg2, this.aClass137_Sub2_6.aClass14_Sub6_1.anInt1867, arg4, this.anInt4723, this.aFloatArray30, arg0, arg1, this.aClass137_Sub2_6.aClass14_Sub6_1.anIntArray136, this.anIntArray378);
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method9043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4) {
		Static292.method4330(0, this.aFloatArray30, arg3, arg2, this.anInt4723, 0, this.aClass137_Sub2_6.aClass14_Sub6_1.anInt1867, this.aClass137_Sub2_6.aFloatArray61, arg0, arg1, this.anIntArray378, arg4 ? this.aClass137_Sub2_6.aClass14_Sub6_1.anIntArray136 : null);
	}
}
