import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class69 implements Interface6 {

	@OriginalMember(owner = "client!cj", name = "k", descriptor = "Lclient!cba;")
	private final Class57_Sub1 aClass57_Sub1_1;

	@OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
	public final int anInt1200;

	@OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
	public final int anInt1204;

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "[I")
	public final int[] anIntArray56;

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "Lclient!cc;")
	private Class58 aClass58_1;

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "[F")
	public float[] aFloatArray12;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!cba;Lclient!fs;Lclient!cc;)V")
	public Class69(@OriginalArg(0) Class57_Sub1 arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) Class58 arg2) {
		this.aClass57_Sub1_1 = arg0;
		if (arg1 instanceof Class134_Sub1_Sub3) {
			@Pc(35) Class134_Sub1_Sub3 local35 = (Class134_Sub1_Sub3) arg1;
			this.anInt1200 = local35.anInt9955;
			this.anInt1204 = local35.anInt9966;
			this.anIntArray56 = local35.anIntArray550;
		} else if (arg1 instanceof Class134_Sub1_Sub2) {
			@Pc(18) Class134_Sub1_Sub2 local18 = (Class134_Sub1_Sub2) arg1;
			this.anInt1200 = local18.anInt9955;
			this.anInt1204 = local18.anInt9966;
			this.anIntArray56 = local18.anIntArray460;
		} else {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			this.aClass58_1 = arg2;
			if (this.anInt1204 != this.aClass58_1.anInt1061 || this.anInt1200 != this.aClass58_1.anInt1060) {
				throw new RuntimeException();
			}
			this.aFloatArray12 = this.aClass58_1.aFloatArray11;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method9030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static455.method6705(this.anIntArray56, this.aClass57_Sub1_1.aClass5_Sub18_1.anInt6328, this.aFloatArray12, arg0, arg3, this.anInt1204, arg2, this.aClass57_Sub1_1.aFloatArray9, this.aClass57_Sub1_1.aClass5_Sub18_1.anIntArray346, arg1, arg5, arg4);
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method9031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4) {
		Static455.method6705(arg4 ? this.aClass57_Sub1_1.aClass5_Sub18_1.anIntArray346 : null, this.anInt1204, this.aClass57_Sub1_1.aFloatArray9, arg0, arg3, this.aClass57_Sub1_1.aClass5_Sub18_1.anInt6328, arg2, this.aFloatArray12, this.anIntArray56, arg1, 0, 0);
	}
}
