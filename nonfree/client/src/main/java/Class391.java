import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class391 implements Interface20 {

	@OriginalMember(owner = "client!vq", name = "j", descriptor = "Lclient!rea;")
	private final Class67_Sub3 aClass67_Sub3_11;

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "I")
	public final int anInt10868;

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
	public final int anInt10864;

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "[I")
	public final int[] anIntArray607;

	@OriginalMember(owner = "client!vq", name = "k", descriptor = "Lclient!ar;")
	private Class17 aClass17_1;

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "[F")
	public float[] aFloatArray105;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!rea;Lclient!bka;Lclient!ar;)V")
	public Class391(@OriginalArg(0) Class67_Sub3 arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) Class17 arg2) {
		this.aClass67_Sub3_11 = arg0;
		if (arg1 instanceof Class9_Sub1_Sub1) {
			@Pc(35) Class9_Sub1_Sub1 local35 = (Class9_Sub1_Sub1) arg1;
			this.anInt10868 = local35.anInt7980;
			this.anIntArray607 = local35.anIntArray10;
			this.anInt10864 = local35.anInt7989;
		} else if (arg1 instanceof Class9_Sub1_Sub2) {
			@Pc(18) Class9_Sub1_Sub2 local18 = (Class9_Sub1_Sub2) arg1;
			this.anInt10868 = local18.anInt7980;
			this.anInt10864 = local18.anInt7989;
			this.anIntArray607 = local18.anIntArray161;
		} else {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			this.aClass17_1 = arg2;
			if (this.aClass17_1.anInt426 != this.anInt10864 || this.anInt10868 != this.aClass17_1.anInt425) {
				throw new RuntimeException();
			}
			this.aFloatArray105 = this.aClass17_1.aFloatArray3;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method9153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4) {
		Static478.method6998(this.aClass67_Sub3_11.aClass3_Sub31_1.anInt6047, (byte) -117, this.anIntArray607, arg1, this.aFloatArray105, 0, arg4 ? this.aClass67_Sub3_11.aClass3_Sub31_1.anIntArray346 : null, arg2, this.aClass67_Sub3_11.aFloatArray95, arg0, arg3, this.anInt10864, 0);
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method9154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static478.method6998(this.anInt10864, (byte) -110, this.aClass67_Sub3_11.aClass3_Sub31_1.anIntArray346, arg1, this.aClass67_Sub3_11.aFloatArray95, arg5, this.anIntArray607, arg2, this.aFloatArray105, arg0, arg3, this.aClass67_Sub3_11.aClass3_Sub31_1.anInt6047, arg4);
	}
}
