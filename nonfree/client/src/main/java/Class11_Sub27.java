import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public final class Class11_Sub27 extends Class11 {

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(ILclient!up;)V")
	public Class11_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub46 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lclient!up;)V")
	public Class11_Sub27(@OriginalArg(0) Class5_Sub46 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)Z")
	public boolean method7847() {
		return Static27.method537(super.aClass5_Sub46_30.aClass11_Sub15_2.method4289());
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
	@Override
	public void method8534() {
		if (super.aClass5_Sub46_30.aClass11_Sub15_2.method4284() && !Static27.method537(super.aClass5_Sub46_30.aClass11_Sub15_2.method4289())) {
			super.anInt10053 = 0;
		}
		if (super.anInt10053 < 0 || super.anInt10053 > 1) {
			super.anInt10053 = this.method8535();
		}
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(Z)I")
	public int method7849() {
		return super.anInt10053;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)I")
	@Override
	public int method8533(@OriginalArg(1) int arg0) {
		return Static27.method537(super.aClass5_Sub46_30.aClass11_Sub15_2.method4289()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)I")
	@Override
	protected int method8535() {
		return 0;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8538(@OriginalArg(1) int arg0) {
		super.anInt10053 = arg0;
	}
}
