import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class163 implements Interface7 {

	@OriginalMember(owner = "client!il", name = "k", descriptor = "Lclient!fga;")
	private final Class82_Sub2 aClass82_Sub2_3;

	@OriginalMember(owner = "client!il", name = "h", descriptor = "I")
	public final int anInt4814;

	@OriginalMember(owner = "client!il", name = "b", descriptor = "I")
	public final int anInt4810;

	@OriginalMember(owner = "client!il", name = "i", descriptor = "[I")
	public final int[] anIntArray266;

	@OriginalMember(owner = "client!il", name = "e", descriptor = "Lclient!iu;")
	private Class167 aClass167_1;

	@OriginalMember(owner = "client!il", name = "d", descriptor = "[F")
	public float[] aFloatArray41;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!fga;Lclient!fd;Lclient!iu;)V")
	public Class163(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) Class103 arg1, @OriginalArg(2) Class167 arg2) {
		this.aClass82_Sub2_3 = arg0;
		if (arg1 instanceof Class103_Sub2_Sub2) {
			@Pc(34) Class103_Sub2_Sub2 local34 = (Class103_Sub2_Sub2) arg1;
			this.anInt4814 = local34.anInt8627;
			this.anIntArray266 = local34.anIntArray384;
			this.anInt4810 = local34.anInt8649;
		} else if (arg1 instanceof Class103_Sub2_Sub1) {
			@Pc(17) Class103_Sub2_Sub1 local17 = (Class103_Sub2_Sub1) arg1;
			this.anInt4814 = local17.anInt8627;
			this.anInt4810 = local17.anInt8649;
			this.anIntArray266 = local17.anIntArray306;
		} else {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			this.aClass167_1 = arg2;
			if (this.anInt4814 != this.aClass167_1.anInt4956 || this.aClass167_1.anInt4955 != this.anInt4810) {
				throw new RuntimeException();
			}
			this.aFloatArray41 = this.aClass167_1.aFloatArray45;
		}
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4) {
		Static106.method1793(arg0, this.aClass82_Sub2_3.aClass3_Sub16_1.anInt9296, 0, this.aFloatArray41, 0, this.anIntArray266, arg1, arg4 ? this.aClass82_Sub2_3.aClass3_Sub16_1.anIntArray582 : null, this.anInt4814, arg3, this.aClass82_Sub2_3.aFloatArray15, arg2);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static106.method1793(arg0, this.anInt4814, arg5, this.aClass82_Sub2_3.aFloatArray15, arg4, this.aClass82_Sub2_3.aClass3_Sub16_1.anIntArray582, arg1, this.anIntArray266, this.aClass82_Sub2_3.aClass3_Sub16_1.anInt9296, arg3, this.aFloatArray41, arg2);
	}
}
