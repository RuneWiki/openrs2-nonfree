import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public final class Class6_Sub3 extends Class6 {

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(ILclient!hs;)V")
	public Class6_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub25 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lclient!hs;)V")
	public Class6_Sub3(@OriginalArg(0) Class5_Sub25 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(II)I")
	@Override
	public int method8536(@OriginalArg(1) int arg0) {
		return Static301.method4687(super.aClass5_Sub25_32.aClass6_Sub11_1.method3988()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!as", name = "d", descriptor = "(I)I")
	public int method308() {
		return super.anInt9925;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IB)V")
	@Override
	protected void method8538(@OriginalArg(0) int arg0) {
		super.anInt9925 = arg0;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)I")
	@Override
	protected int method8535() {
		return 0;
	}

	@OriginalMember(owner = "client!as", name = "e", descriptor = "(I)Z")
	public boolean method309() {
		return Static301.method4687(super.aClass5_Sub25_32.aClass6_Sub11_1.method3988());
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(I)V")
	@Override
	public void method8537() {
		if (super.aClass5_Sub25_32.aClass6_Sub11_1.method3984() && !Static301.method4687(super.aClass5_Sub25_32.aClass6_Sub11_1.method3988())) {
			super.anInt9925 = 0;
		}
		if (super.anInt9925 < 0 || super.anInt9925 > 1) {
			super.anInt9925 = this.method8535();
		}
	}
}
