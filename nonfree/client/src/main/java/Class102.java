import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class102 implements Interface24 {

	@OriginalMember(owner = "client!eo", name = "k", descriptor = "Lclient!ed;")
	private final Class75_Sub2 aClass75_Sub2_3;

	@OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
	public final int anInt2878;

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "[I")
	public final int[] anIntArray162;

	@OriginalMember(owner = "client!eo", name = "o", descriptor = "I")
	public final int anInt2883;

	@OriginalMember(owner = "client!eo", name = "p", descriptor = "Lclient!hc;")
	private Class147 aClass147_1;

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "[F")
	public float[] aFloatArray37;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lclient!ed;Lclient!tb;Lclient!hc;)V")
	public Class102(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) Class147 arg2) {
		this.aClass75_Sub2_3 = arg0;
		if (arg1 instanceof Class49_Sub1_Sub2) {
			@Pc(35) Class49_Sub1_Sub2 local35 = (Class49_Sub1_Sub2) arg1;
			this.anInt2878 = local35.anInt8661;
			this.anInt2883 = local35.anInt8663;
			this.anIntArray162 = local35.anIntArray266;
		} else if (arg1 instanceof Class49_Sub1_Sub1) {
			@Pc(18) Class49_Sub1_Sub1 local18 = (Class49_Sub1_Sub1) arg1;
			this.anInt2878 = local18.anInt8661;
			this.anIntArray162 = local18.anIntArray166;
			this.anInt2883 = local18.anInt8663;
		} else {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			this.aClass147_1 = arg2;
			if (this.anInt2883 != this.aClass147_1.anInt4265 || this.anInt2878 != this.aClass147_1.anInt4263) {
				throw new RuntimeException();
			}
			this.aFloatArray37 = this.aClass147_1.aFloatArray45;
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4) {
		Static374.method5637(this.aClass75_Sub2_3.aClass6_Sub41_1.anInt9945, this.aClass75_Sub2_3.aFloatArray27, this.anIntArray162, arg2, this.aFloatArray37, 0, this.anInt2883, 0, arg4 ? this.aClass75_Sub2_3.aClass6_Sub41_1.anIntArray653 : null, arg0, arg3, arg1);
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static374.method5637(this.anInt2883, this.aFloatArray37, this.aClass75_Sub2_3.aClass6_Sub41_1.anIntArray653, arg2, this.aClass75_Sub2_3.aFloatArray27, arg5, this.aClass75_Sub2_3.aClass6_Sub41_1.anInt9945, arg4, this.anIntArray162, arg0, arg3, arg1);
	}
}
