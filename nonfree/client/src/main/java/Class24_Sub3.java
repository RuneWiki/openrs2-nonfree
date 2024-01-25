import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public final class Class24_Sub3 extends Class24 {

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lclient!hia;)V")
	public Class24_Sub3(@OriginalArg(0) Class5_Sub20 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(ILclient!hia;)V")
	public Class24_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub20 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(Z)I")
	@Override
	protected int method8881() {
		return 1;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)V")
	@Override
	public void method8874() {
		if (super.aClass5_Sub20_30.method3192() != Static569.aClass333_7) {
			super.anInt10335 = 1;
		} else if (super.aClass5_Sub20_30.method3195()) {
			super.anInt10335 = 0;
		}
		if (super.anInt10335 != 0 && super.anInt10335 != 1) {
			super.anInt10335 = this.method8881();
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II)V")
	@Override
	protected void method8880(@OriginalArg(1) int arg0) {
		super.anInt10335 = arg0;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(IB)I")
	@Override
	public int method8884(@OriginalArg(0) int arg0) {
		if (super.aClass5_Sub20_30.method3192() != Static569.aClass333_7) {
			return 3;
		} else if (super.aClass5_Sub20_30.method3195()) {
			return 3;
		} else if (arg0 == 0 || super.aClass5_Sub20_30.aClass24_Sub21_1.method6654() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!di", name = "e", descriptor = "(Z)I")
	public int method1558() {
		return super.anInt10335;
	}

	@OriginalMember(owner = "client!di", name = "d", descriptor = "(I)Z")
	public boolean method1559() {
		if (super.aClass5_Sub20_30.method3192() == Static569.aClass333_7) {
			return !super.aClass5_Sub20_30.method3195();
		} else {
			return false;
		}
	}
}
