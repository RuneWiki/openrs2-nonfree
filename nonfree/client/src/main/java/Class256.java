import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class256 implements Interface25 {

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "Lclient!wda;")
	private final Class22_Sub3 aClass22_Sub3_7;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
	public final int anInt6553;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
	public final int anInt6551;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "[I")
	public final int[] anIntArray497;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "Lclient!al;")
	private Class16 aClass16_1;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "[F")
	public float[] aFloatArray49;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!wda;Lclient!kw;Lclient!al;)V")
	public Class256(@OriginalArg(0) Class22_Sub3 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) Class16 arg2) {
		this.aClass22_Sub3_7 = arg0;
		if (arg1 instanceof Class178_Sub1_Sub1) {
			@Pc(12) Class178_Sub1_Sub1 local12 = (Class178_Sub1_Sub1) arg1;
			this.anInt6553 = local12.anInt9001;
			this.anInt6551 = local12.anInt8982;
			this.anIntArray497 = local12.anIntArray349;
		} else if (arg1 instanceof Class178_Sub1_Sub2) {
			@Pc(34) Class178_Sub1_Sub2 local34 = (Class178_Sub1_Sub2) arg1;
			this.anIntArray497 = local34.anIntArray503;
			this.anInt6551 = local34.anInt8982;
			this.anInt6553 = local34.anInt9001;
		} else {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			this.aClass16_1 = arg2;
			if (this.aClass16_1.anInt710 != this.anInt6551 || this.aClass16_1.anInt706 != this.anInt6553) {
				throw new RuntimeException();
			}
			this.aFloatArray49 = this.aClass16_1.aFloatArray1;
		}
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method9262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static274.method3860(this.aFloatArray49, this.anIntArray497, arg5, this.aClass22_Sub3_7.aClass3_Sub15_1.anInt6369, this.aClass22_Sub3_7.aFloatArray84, this.anInt6551, arg4, this.aClass22_Sub3_7.aClass3_Sub15_1.anIntArray488, arg1, arg0, arg3, arg2);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method9261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4) {
		Static274.method3860(this.aClass22_Sub3_7.aFloatArray84, arg4 ? this.aClass22_Sub3_7.aClass3_Sub15_1.anIntArray488 : null, 0, this.anInt6551, this.aFloatArray49, this.aClass22_Sub3_7.aClass3_Sub15_1.anInt6369, 0, this.anIntArray497, arg1, arg0, arg3, arg2);
	}
}
