import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public final class Class11_Sub29 extends Class11 {

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(ILclient!up;)V")
	public Class11_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub46 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!up;)V")
	public Class11_Sub29(@OriginalArg(0) Class5_Sub46 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)I")
	@Override
	protected int method8535() {
		return 1;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8538(@OriginalArg(1) int arg0) {
		super.anInt10053 = arg0;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)I")
	public int method8541() {
		return super.anInt10053;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
	@Override
	public void method8534() {
		if (super.aClass5_Sub46_30.method8186() != Static191.aClass235_2) {
			super.anInt10053 = 1;
		} else if (super.aClass5_Sub46_30.method8187()) {
			super.anInt10053 = 0;
		}
		if (super.anInt10053 != 0 && super.anInt10053 != 1) {
			super.anInt10053 = this.method8535();
		}
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)Z")
	public boolean method8544() {
		if (super.aClass5_Sub46_30.method8186() == Static191.aClass235_2) {
			return !super.aClass5_Sub46_30.method8187();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II)I")
	@Override
	public int method8533(@OriginalArg(1) int arg0) {
		if (super.aClass5_Sub46_30.method8186() != Static191.aClass235_2) {
			return 3;
		} else if (super.aClass5_Sub46_30.method8187()) {
			return 3;
		} else if (arg0 == 0 || super.aClass5_Sub46_30.aClass11_Sub25_1.method7702() == 1) {
			return 1;
		} else {
			return 2;
		}
	}
}
