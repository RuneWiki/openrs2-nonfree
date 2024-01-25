import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class132 implements Interface17 {

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "Lclient!rp;")
	private final Class101_Sub3 aClass101_Sub3_8;

	@OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
	public final int anInt4210;

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "I")
	public final int anInt4205;

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "[I")
	public final int[] anIntArray193;

	@OriginalMember(owner = "client!gq", name = "l", descriptor = "Lclient!tia;")
	private Class349 aClass349_1;

	@OriginalMember(owner = "client!gq", name = "k", descriptor = "[F")
	public float[] aFloatArray23;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!rp;Lclient!mq;Lclient!tia;)V")
	public Class132(@OriginalArg(0) Class101_Sub3 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) Class349 arg2) {
		this.aClass101_Sub3_8 = arg0;
		if (arg1 instanceof Class71_Sub1_Sub1) {
			@Pc(10) Class71_Sub1_Sub1 local10 = (Class71_Sub1_Sub1) arg1;
			this.anInt4210 = local10.anInt7132;
			this.anInt4205 = local10.anInt7152;
			this.anIntArray193 = local10.anIntArray98;
		} else if (arg1 instanceof Class71_Sub1_Sub3) {
			@Pc(34) Class71_Sub1_Sub3 local34 = (Class71_Sub1_Sub3) arg1;
			this.anInt4210 = local34.anInt7132;
			this.anIntArray193 = local34.anIntArray338;
			this.anInt4205 = local34.anInt7152;
		} else {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			this.aClass349_1 = arg2;
			if (this.aClass349_1.anInt10035 != this.anInt4205 || this.anInt4210 != this.aClass349_1.anInt10033) {
				throw new RuntimeException();
			}
			this.aFloatArray23 = this.aClass349_1.aFloatArray72;
		}
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method9556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static146.method9617(this.anIntArray193, this.aClass101_Sub3_8.aFloatArray59, arg1, arg3, arg2, arg5, this.aClass101_Sub3_8.aClass2_Sub2_1.anInt8384, arg4, this.anInt4205, this.aFloatArray23, arg0, this.aClass101_Sub3_8.aClass2_Sub2_1.anIntArray422);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method9555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4) {
		Static146.method9617(arg4 ? this.aClass101_Sub3_8.aClass2_Sub2_1.anIntArray422 : null, this.aFloatArray23, arg1, arg3, arg2, 0, this.anInt4205, 0, this.aClass101_Sub3_8.aClass2_Sub2_1.anInt8384, this.aClass101_Sub3_8.aFloatArray59, arg0, this.anIntArray193);
	}
}
