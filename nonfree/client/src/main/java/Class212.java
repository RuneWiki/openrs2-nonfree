import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public final class Class212 implements Interface22 {

	@OriginalMember(owner = "client!kv", name = "f", descriptor = "Lclient!ie;")
	private final Class144_Sub2 aClass144_Sub2_6;

	@OriginalMember(owner = "client!kv", name = "k", descriptor = "[I")
	public final int[] anIntArray318;

	@OriginalMember(owner = "client!kv", name = "e", descriptor = "I")
	public final int anInt5655;

	@OriginalMember(owner = "client!kv", name = "j", descriptor = "I")
	public final int anInt5656;

	@OriginalMember(owner = "client!kv", name = "i", descriptor = "Lclient!fp;")
	private Class121 aClass121_1;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "[F")
	public float[] aFloatArray43;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lclient!ie;Lclient!fia;Lclient!fp;)V")
	public Class212(@OriginalArg(0) Class144_Sub2 arg0, @OriginalArg(1) Class45 arg1, @OriginalArg(2) Class121 arg2) {
		this.aClass144_Sub2_6 = arg0;
		if (arg1 instanceof Class45_Sub1_Sub3) {
			@Pc(35) Class45_Sub1_Sub3 local35 = (Class45_Sub1_Sub3) arg1;
			this.anInt5656 = local35.anInt8666;
			this.anInt5655 = local35.anInt8686;
			this.anIntArray318 = local35.anIntArray450;
		} else if (arg1 instanceof Class45_Sub1_Sub2) {
			@Pc(13) Class45_Sub1_Sub2 local13 = (Class45_Sub1_Sub2) arg1;
			this.anIntArray318 = local13.anIntArray67;
			this.anInt5655 = local13.anInt8686;
			this.anInt5656 = local13.anInt8666;
		} else {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			this.aClass121_1 = arg2;
			if (this.aClass121_1.anInt2639 != this.anInt5655 || this.aClass121_1.anInt2638 != this.anInt5656) {
				throw new RuntimeException();
			}
			this.aFloatArray43 = this.aClass121_1.aFloatArray13;
		}
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method9219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static11.method235(this.anIntArray318, arg4, this.anInt5655, this.aClass144_Sub2_6.aFloatArray38, this.aClass144_Sub2_6.aClass14_Sub32_1.anIntArray568, arg3, this.aFloatArray43, arg5, arg2, arg1, this.aClass144_Sub2_6.aClass14_Sub32_1.anInt10672, arg0);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method9218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4) {
		Static11.method235(arg4 ? this.aClass144_Sub2_6.aClass14_Sub32_1.anIntArray568 : null, 0, this.aClass144_Sub2_6.aClass14_Sub32_1.anInt10672, this.aFloatArray43, this.anIntArray318, arg3, this.aClass144_Sub2_6.aFloatArray38, 0, arg2, arg1, this.anInt5655, arg0);
	}
}
