import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class10 implements Interface16 {

	@OriginalMember(owner = "client!af", name = "i", descriptor = "Lclient!cg;")
	private final Class33_Sub2 aClass33_Sub2_1;

	@OriginalMember(owner = "client!af", name = "c", descriptor = "[I")
	public final int[] anIntArray8;

	@OriginalMember(owner = "client!af", name = "j", descriptor = "I")
	public final int anInt79;

	@OriginalMember(owner = "client!af", name = "k", descriptor = "I")
	public final int anInt80;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "Lclient!sh;")
	private Class308 aClass308_1;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "[F")
	public float[] aFloatArray1;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!cg;Lclient!ac;Lclient!sh;)V")
	public Class10(@OriginalArg(0) Class33_Sub2 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) Class308 arg2) {
		this.aClass33_Sub2_1 = arg0;
		if (arg1 instanceof Class5_Sub1_Sub2) {
			@Pc(34) Class5_Sub1_Sub2 local34 = (Class5_Sub1_Sub2) arg1;
			this.anIntArray8 = local34.anIntArray57;
			this.anInt79 = local34.anInt6185;
			this.anInt80 = local34.anInt6196;
		} else if (arg1 instanceof Class5_Sub1_Sub1) {
			@Pc(13) Class5_Sub1_Sub1 local13 = (Class5_Sub1_Sub1) arg1;
			this.anIntArray8 = local13.anIntArray19;
			this.anInt79 = local13.anInt6185;
			this.anInt80 = local13.anInt6196;
		} else {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			this.aClass308_1 = arg2;
			if (this.aClass308_1.anInt9018 != this.anInt79 || this.aClass308_1.anInt9016 != this.anInt80) {
				throw new RuntimeException();
			}
			this.aFloatArray1 = this.aClass308_1.aFloatArray65;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static92.method2449(arg4, arg1, arg3, arg2, arg5, arg0, this.aFloatArray1, this.aClass33_Sub2_1.aFloatArray14, this.anIntArray8, this.aClass33_Sub2_1.aClass3_Sub37_1.anIntArray613, this.aClass33_Sub2_1.aClass3_Sub37_1.anInt10098, this.anInt79);
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4) {
		Static92.method2449(0, arg1, arg3, arg2, 0, arg0, this.aClass33_Sub2_1.aFloatArray14, this.aFloatArray1, arg4 ? this.aClass33_Sub2_1.aClass3_Sub37_1.anIntArray613 : null, this.anIntArray8, this.anInt79, this.aClass33_Sub2_1.aClass3_Sub37_1.anInt10098);
	}
}
