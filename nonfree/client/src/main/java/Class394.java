import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class394 implements Interface8 {

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "Lclient!ut;")
	private final Class16_Sub3 aClass16_Sub3_12;

	@OriginalMember(owner = "client!wr", name = "i", descriptor = "I")
	public final int anInt10312;

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
	public final int anInt10311;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "[I")
	public final int[] anIntArray668;

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "Lclient!cs;")
	private Class66 aClass66_1;

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "[F")
	public float[] aFloatArray84;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lclient!ut;Lclient!nf;Lclient!cs;)V")
	public Class394(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(2) Class66 arg2) {
		this.aClass16_Sub3_12 = arg0;
		if (arg1 instanceof Class102_Sub1_Sub3) {
			@Pc(10) Class102_Sub1_Sub3 local10 = (Class102_Sub1_Sub3) arg1;
			this.anInt10312 = local10.anInt8218;
			this.anInt10311 = local10.anInt8224;
			this.anIntArray668 = local10.anIntArray530;
		} else if (arg1 instanceof Class102_Sub1_Sub1) {
			@Pc(34) Class102_Sub1_Sub1 local34 = (Class102_Sub1_Sub1) arg1;
			this.anIntArray668 = local34.anIntArray174;
			this.anInt10312 = local34.anInt8218;
			this.anInt10311 = local34.anInt8224;
		} else {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			this.aClass66_1 = arg2;
			if (this.aClass66_1.anInt1936 != this.anInt10311 || this.anInt10312 != this.aClass66_1.anInt1937) {
				throw new RuntimeException();
			}
			this.aFloatArray84 = this.aClass66_1.aFloatArray28;
		}
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4) {
		Static123.method2200(this.aClass16_Sub3_12.aClass3_Sub23_1.anInt8162, 0, arg2, this.aFloatArray84, this.anIntArray668, arg3, arg1, this.aClass16_Sub3_12.aFloatArray80, this.anInt10311, arg4 ? this.aClass16_Sub3_12.aClass3_Sub23_1.anIntArray504 : null, arg0, 0);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static123.method2200(this.anInt10311, arg4, arg2, this.aClass16_Sub3_12.aFloatArray80, this.aClass16_Sub3_12.aClass3_Sub23_1.anIntArray504, arg3, arg1, this.aFloatArray84, this.aClass16_Sub3_12.aClass3_Sub23_1.anInt8162, this.anIntArray668, arg0, arg5);
	}
}
