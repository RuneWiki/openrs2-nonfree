import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mga")
public final class Class201 implements Interface20 {

	@OriginalMember(owner = "client!mga", name = "k", descriptor = "Lclient!jf;")
	private final Class5_Sub3 aClass5_Sub3_7;

	@OriginalMember(owner = "client!mga", name = "c", descriptor = "I")
	public final int anInt6849;

	@OriginalMember(owner = "client!mga", name = "d", descriptor = "[I")
	public final int[] anIntArray323;

	@OriginalMember(owner = "client!mga", name = "h", descriptor = "I")
	public final int anInt6851;

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "Lclient!uh;")
	private Class339 aClass339_1;

	@OriginalMember(owner = "client!mga", name = "g", descriptor = "[F")
	public float[] aFloatArray62;

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(Lclient!jf;Lclient!ufa;Lclient!uh;)V")
	public Class201(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) Class339 arg2) {
		this.aClass5_Sub3_7 = arg0;
		if (arg1 instanceof Class4_Sub1_Sub2) {
			@Pc(34) Class4_Sub1_Sub2 local34 = (Class4_Sub1_Sub2) arg1;
			this.anInt6851 = local34.anInt9454;
			this.anIntArray323 = local34.anIntArray292;
			this.anInt6849 = local34.anInt9435;
		} else if (arg1 instanceof Class4_Sub1_Sub1) {
			@Pc(17) Class4_Sub1_Sub1 local17 = (Class4_Sub1_Sub1) arg1;
			this.anInt6849 = local17.anInt9435;
			this.anIntArray323 = local17.anIntArray4;
			this.anInt6851 = local17.anInt9454;
		} else {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			this.aClass339_1 = arg2;
			if (this.anInt6849 != this.aClass339_1.anInt9789 || this.anInt6851 != this.aClass339_1.anInt9788) {
				throw new RuntimeException();
			}
			this.aFloatArray62 = this.aClass339_1.aFloatArray73;
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4) {
		Static557.method7836(this.aClass5_Sub3_7.aClass6_Sub19_1.anInt9382, arg4 ? this.aClass5_Sub3_7.aClass6_Sub19_1.anIntArray495 : null, arg1, arg0, arg2, this.aFloatArray62, 0, this.anIntArray323, arg3, 0, this.aClass5_Sub3_7.aFloatArray55, this.anInt6849);
	}

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static557.method7836(this.anInt6849, this.anIntArray323, arg1, arg0, arg2, this.aClass5_Sub3_7.aFloatArray55, arg5, this.aClass5_Sub3_7.aClass6_Sub19_1.anIntArray495, arg3, arg4, this.aFloatArray62, this.aClass5_Sub3_7.aClass6_Sub19_1.anInt9382);
	}
}
