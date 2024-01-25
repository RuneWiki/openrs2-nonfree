import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class42 implements Interface10 {

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "Lclient!jr;")
	private final Class95_Sub2 aClass95_Sub2_1;

	@OriginalMember(owner = "client!bs", name = "h", descriptor = "[I")
	public final int[] anIntArray62;

	@OriginalMember(owner = "client!bs", name = "k", descriptor = "I")
	public final int anInt1234;

	@OriginalMember(owner = "client!bs", name = "l", descriptor = "I")
	public final int anInt1235;

	@OriginalMember(owner = "client!bs", name = "j", descriptor = "Lclient!lo;")
	private Class215 aClass215_1;

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "[F")
	public float[] aFloatArray7;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lclient!jr;Lclient!hh;Lclient!lo;)V")
	public Class42(@OriginalArg(0) Class95_Sub2 arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) Class215 arg2) {
		this.aClass95_Sub2_1 = arg0;
		if (arg1 instanceof Class6_Sub3_Sub1) {
			@Pc(12) Class6_Sub3_Sub1 local12 = (Class6_Sub3_Sub1) arg1;
			this.anIntArray62 = local12.anIntArray212;
			this.anInt1234 = local12.anInt6062;
			this.anInt1235 = local12.anInt6065;
		} else if (arg1 instanceof Class6_Sub3_Sub3) {
			@Pc(32) Class6_Sub3_Sub3 local32 = (Class6_Sub3_Sub3) arg1;
			this.anIntArray62 = local32.anIntArray329;
			this.anInt1235 = local32.anInt6065;
			this.anInt1234 = local32.anInt6062;
		} else {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			this.aClass215_1 = arg2;
			if (this.aClass215_1.anInt5936 != this.anInt1234 || this.anInt1235 != this.aClass215_1.anInt5937) {
				throw new RuntimeException();
			}
			this.aFloatArray7 = this.aClass215_1.aFloatArray39;
		}
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static491.method6459(arg0, this.aClass95_Sub2_1.aFloatArray31, this.anIntArray62, this.aClass95_Sub2_1.aClass3_Sub1_1.anInt8242, this.aFloatArray7, arg5, arg4, this.anInt1234, this.aClass95_Sub2_1.aClass3_Sub1_1.anIntArray439, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4) {
		Static491.method6459(arg0, this.aFloatArray7, arg4 ? this.aClass95_Sub2_1.aClass3_Sub1_1.anIntArray439 : null, this.anInt1234, this.aClass95_Sub2_1.aFloatArray31, 0, 0, this.aClass95_Sub2_1.aClass3_Sub1_1.anInt8242, this.anIntArray62, arg3, arg2, arg1);
	}
}
