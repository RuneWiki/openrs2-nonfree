import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public final class Class11_Sub21 extends Class11 {

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!up;)V")
	public Class11_Sub21(@OriginalArg(0) Class5_Sub46 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(ILclient!up;)V")
	public Class11_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub46 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V")
	@Override
	public void method8534() {
		if (this.method6584()) {
			if (super.aClass5_Sub46_30.aClass11_Sub15_2.method4284() && !Static545.method7736(super.aClass5_Sub46_30.aClass11_Sub15_2.method4289())) {
				super.anInt10053 = 1;
			}
			if (super.aClass5_Sub46_30.aClass11_Sub1_2.method191() == 1) {
				super.anInt10053 = 1;
			}
		}
		if (super.anInt10053 == 3) {
			super.anInt10053 = 2;
		}
		if (super.anInt10053 < 0 || super.anInt10053 > 3) {
			super.anInt10053 = this.method8535();
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)I")
	@Override
	protected int method8535() {
		return 0;
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)Z")
	public boolean method6583() {
		return true;
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)Z")
	public boolean method6584() {
		return Static85.method1342(super.anInt10053);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)I")
	@Override
	public int method8533(@OriginalArg(1) int arg0) {
		if (Static85.method1342(arg0)) {
			if (super.aClass5_Sub46_30.aClass11_Sub15_2.method4284() && !Static545.method7736(super.aClass5_Sub46_30.aClass11_Sub15_2.method4289())) {
				return 3;
			}
			if (super.aClass5_Sub46_30.aClass11_Sub1_2.method191() == 1) {
				return 3;
			}
		}
		if (arg0 == 3) {
			return 3;
		} else if (Static85.method1342(arg0)) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(Z)I")
	public int method6586() {
		return super.anInt10053;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8538(@OriginalArg(1) int arg0) {
		super.anInt10053 = arg0;
	}
}
