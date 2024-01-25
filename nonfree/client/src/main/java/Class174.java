import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class174 implements Interface24 {

	@OriginalMember(owner = "client!io", name = "g", descriptor = "Lclient!fba;")
	private final Class100_Sub2 aClass100_Sub2_5;

	@OriginalMember(owner = "client!io", name = "k", descriptor = "I")
	public final int anInt4340;

	@OriginalMember(owner = "client!io", name = "e", descriptor = "[I")
	public final int[] anIntArray224;

	@OriginalMember(owner = "client!io", name = "j", descriptor = "I")
	public final int anInt4341;

	@OriginalMember(owner = "client!io", name = "b", descriptor = "Lclient!qe;")
	private Class298 aClass298_1;

	@OriginalMember(owner = "client!io", name = "d", descriptor = "[F")
	public float[] aFloatArray42;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!fba;Lclient!hk;Lclient!qe;)V")
	public Class174(@OriginalArg(0) Class100_Sub2 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) Class298 arg2) {
		this.aClass100_Sub2_5 = arg0;
		if (arg1 instanceof Class155_Sub1_Sub2) {
			@Pc(12) Class155_Sub1_Sub2 local12 = (Class155_Sub1_Sub2) arg1;
			this.anInt4340 = local12.anInt7487;
			this.anIntArray224 = local12.anIntArray263;
			this.anInt4341 = local12.anInt7504;
		} else if (arg1 instanceof Class155_Sub1_Sub1) {
			@Pc(34) Class155_Sub1_Sub1 local34 = (Class155_Sub1_Sub1) arg1;
			this.anInt4340 = local34.anInt7487;
			this.anInt4341 = local34.anInt7504;
			this.anIntArray224 = local34.anIntArray215;
		} else {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			this.aClass298_1 = arg2;
			if (this.aClass298_1.anInt7775 != this.anInt4340 || this.anInt4341 != this.aClass298_1.anInt7776) {
				throw new RuntimeException();
			}
			this.aFloatArray42 = this.aClass298_1.aFloatArray60;
		}
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4) {
		Static57.method1024(0, this.anInt4340, this.aClass100_Sub2_5.aClass5_Sub13_1.anInt4955, this.aFloatArray42, arg0, arg4 ? this.aClass100_Sub2_5.aClass5_Sub13_1.anIntArray271 : null, arg1, this.anIntArray224, arg3, arg2, this.aClass100_Sub2_5.aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static57.method1024(arg4, this.aClass100_Sub2_5.aClass5_Sub13_1.anInt4955, this.anInt4340, this.aClass100_Sub2_5.aFloatArray24, arg0, this.anIntArray224, arg1, this.aClass100_Sub2_5.aClass5_Sub13_1.anIntArray271, arg3, arg2, this.aFloatArray42, arg5);
	}
}
