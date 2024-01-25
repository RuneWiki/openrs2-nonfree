import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public final class Class15_Sub27 extends Class15 {

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(ILclient!hb;)V")
	public Class15_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lclient!hb;)V")
	public Class15_Sub27(@OriginalArg(0) Class6_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "(B)V")
	@Override
	public void method8989() {
		if (super.aClass6_Sub22_31.method3530() != Static237.aClass271_11) {
			super.anInt10701 = 1;
		} else if (super.aClass6_Sub22_31.method3533()) {
			super.anInt10701 = 0;
		}
		if (super.anInt10701 != 0 && super.anInt10701 != 1) {
			super.anInt10701 = this.method8986();
		}
	}

	@OriginalMember(owner = "client!waa", name = "c", descriptor = "(II)I")
	@Override
	public int method8990(@OriginalArg(1) int arg0) {
		if (super.aClass6_Sub22_31.method3530() != Static237.aClass271_11) {
			return 3;
		} else if (super.aClass6_Sub22_31.method3533()) {
			return 3;
		} else if (arg0 == 0 || super.aClass6_Sub22_31.aClass15_Sub14_1.method4651() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(B)I")
	@Override
	protected int method8986() {
		return 1;
	}

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "(II)V")
	@Override
	protected void method8985(@OriginalArg(1) int arg0) {
		super.anInt10701 = arg0;
	}

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "(I)I")
	public int method8659() {
		return super.anInt10701;
	}

	@OriginalMember(owner = "client!waa", name = "c", descriptor = "(I)Z")
	public boolean method8662() {
		if (super.aClass6_Sub22_31.method3530() == Static237.aClass271_11) {
			return !super.aClass6_Sub22_31.method3533();
		} else {
			return false;
		}
	}
}
