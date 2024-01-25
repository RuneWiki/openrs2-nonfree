import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public final class Class15_Sub14 extends Class15 {

	@OriginalMember(owner = "client!jha", name = "<init>", descriptor = "(ILclient!hb;)V")
	public Class15_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!jha", name = "<init>", descriptor = "(Lclient!hb;)V")
	public Class15_Sub14(@OriginalArg(0) Class6_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jha", name = "b", descriptor = "(I)Z")
	public boolean method4649() {
		if (super.aClass6_Sub22_31.method3533()) {
			return false;
		} else {
			return super.aClass6_Sub22_31.method3530() == Static237.aClass271_11;
		}
	}

	@OriginalMember(owner = "client!jha", name = "c", descriptor = "(II)I")
	@Override
	public int method8990(@OriginalArg(1) int arg0) {
		if (super.aClass6_Sub22_31.method3533()) {
			return 3;
		} else if (super.aClass6_Sub22_31.method3530() == Static237.aClass271_11) {
			if (arg0 == 0) {
				if (super.aClass6_Sub22_31.aClass15_Sub23_1.method8214() == 1) {
					return 2;
				}
				if (super.aClass6_Sub22_31.aClass15_Sub27_1.method8659() == 1) {
					return 2;
				}
				if (super.aClass6_Sub22_31.aClass15_Sub6_1.method1414() > 0) {
					return 2;
				}
			}
			return 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(B)I")
	@Override
	protected int method8986() {
		return 1;
	}

	@OriginalMember(owner = "client!jha", name = "d", descriptor = "(I)I")
	public int method4651() {
		return super.anInt10701;
	}

	@OriginalMember(owner = "client!jha", name = "b", descriptor = "(B)V")
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

	@OriginalMember(owner = "client!jha", name = "b", descriptor = "(II)V")
	@Override
	protected void method8985(@OriginalArg(1) int arg0) {
		super.anInt10701 = arg0;
	}
}
