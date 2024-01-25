import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class11_Sub20 extends Class11 {

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(ILclient!up;)V")
	public Class11_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub46 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!up;)V")
	public Class11_Sub20(@OriginalArg(0) Class5_Sub46 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V")
	@Override
	public void method8534() {
		@Pc(10) int local10 = super.aClass5_Sub46_30.method8195().method2908();
		if (local10 < 96) {
			super.anInt10053 = 0;
		}
		if (super.anInt10053 > 1 && local10 < 128) {
			super.anInt10053 = 1;
		}
		if (super.anInt10053 > 2 && local10 < 192) {
			super.anInt10053 = 2;
		}
		if (super.anInt10053 < 0 || super.anInt10053 > 3) {
			super.anInt10053 = this.method8535();
		}
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)Z")
	public boolean method6519() {
		@Pc(10) int local10 = super.aClass5_Sub46_30.method8195().method2908();
		return local10 >= 96;
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(Z)I")
	public int method6520() {
		return super.anInt10053;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)I")
	@Override
	public int method8533(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = super.aClass5_Sub46_30.method8195().method2908();
		if (local10 < 96) {
			return 3;
		} else if (arg0 > 1 && local10 < 128) {
			return 3;
		} else if (arg0 > 3 && local10 < 192) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)I")
	@Override
	protected int method8535() {
		return 0;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8538(@OriginalArg(1) int arg0) {
		super.anInt10053 = arg0;
	}
}
