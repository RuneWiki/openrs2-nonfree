import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public final class Class24_Sub21 extends Class24 {

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!hia;)V")
	public Class24_Sub21(@OriginalArg(0) Class5_Sub20 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(ILclient!hia;)V")
	public Class24_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub20 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)Z")
	public boolean method6652() {
		if (super.aClass5_Sub20_30.method3195()) {
			return false;
		} else {
			return super.aClass5_Sub20_30.method3192() == Static569.aClass333_7;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
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

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(Z)I")
	@Override
	protected int method8881() {
		return 1;
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(Z)I")
	public int method6654() {
		return super.anInt10335;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V")
	@Override
	protected void method8880(@OriginalArg(1) int arg0) {
		super.anInt10335 = arg0;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(IB)I")
	@Override
	public int method8884(@OriginalArg(0) int arg0) {
		if (super.aClass5_Sub20_30.method3195()) {
			return 3;
		} else if (super.aClass5_Sub20_30.method3192() == Static569.aClass333_7) {
			if (arg0 == 0) {
				if (super.aClass5_Sub20_30.aClass24_Sub22_1.method6758() == 1) {
					return 2;
				}
				if (super.aClass5_Sub20_30.aClass24_Sub3_1.method1558() == 1) {
					return 2;
				}
				if (super.aClass5_Sub20_30.aClass24_Sub28_1.method8607() > 0) {
					return 2;
				}
			}
			return 1;
		} else {
			return 3;
		}
	}
}
