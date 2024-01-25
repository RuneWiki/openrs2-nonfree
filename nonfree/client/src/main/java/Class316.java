import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class316 implements Interface18 {

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "Lclient!bs;")
	private final Class33_Sub1 aClass33_Sub1_11;

	@OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
	public final int anInt8072;

	@OriginalMember(owner = "client!rj", name = "i", descriptor = "[I")
	public final int[] anIntArray553;

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
	public final int anInt8070;

	@OriginalMember(owner = "client!rj", name = "j", descriptor = "Lclient!tn;")
	private Class354 aClass354_1;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "[F")
	public float[] aFloatArray57;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!bs;Lclient!tf;Lclient!tn;)V")
	public Class316(@OriginalArg(0) Class33_Sub1 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) Class354 arg2) {
		this.aClass33_Sub1_11 = arg0;
		if (arg1 instanceof Class17_Sub1_Sub3) {
			@Pc(10) Class17_Sub1_Sub3 local10 = (Class17_Sub1_Sub3) arg1;
			this.anInt8072 = local10.anInt6022;
			this.anIntArray553 = local10.anIntArray451;
			this.anInt8070 = local10.anInt6015;
		} else if (arg1 instanceof Class17_Sub1_Sub2) {
			@Pc(34) Class17_Sub1_Sub2 local34 = (Class17_Sub1_Sub2) arg1;
			this.anInt8072 = local34.anInt6022;
			this.anInt8070 = local34.anInt6015;
			this.anIntArray553 = local34.anIntArray78;
		} else {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			this.aClass354_1 = arg2;
			if (this.aClass354_1.anInt9009 != this.anInt8072 || this.aClass354_1.anInt9007 != this.anInt8070) {
				throw new RuntimeException();
			}
			this.aFloatArray57 = this.aClass354_1.aFloatArray65;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static534.method7457(arg4, this.aClass33_Sub1_11.aClass4_Sub12_1.anIntArray710, this.anInt8072, arg5, this.anIntArray553, arg2, arg3, arg0, this.aClass33_Sub1_11.aFloatArray1, this.aClass33_Sub1_11.aClass4_Sub12_1.anInt10264, this.aFloatArray57, arg1);
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4) {
		Static534.method7457(0, this.anIntArray553, this.aClass33_Sub1_11.aClass4_Sub12_1.anInt10264, 0, arg4 ? this.aClass33_Sub1_11.aClass4_Sub12_1.anIntArray710 : null, arg2, arg3, arg0, this.aFloatArray57, this.anInt8072, this.aClass33_Sub1_11.aFloatArray1, arg1);
	}
}
