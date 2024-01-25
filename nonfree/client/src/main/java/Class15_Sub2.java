import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public final class Class15_Sub2 extends Class15 {

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(ILclient!hb;)V")
	public Class15_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lclient!hb;)V")
	public Class15_Sub2(@OriginalArg(0) Class6_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!at", name = "c", descriptor = "(II)I")
	@Override
	public int method8990(@OriginalArg(1) int arg0) {
		if (super.aClass6_Sub22_31.method3533()) {
			return 3;
		} else if (super.aClass6_Sub22_31.method3530() == Static237.aClass271_11) {
			return 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(B)V")
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

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(II)V")
	@Override
	protected void method8985(@OriginalArg(1) int arg0) {
		super.anInt10701 = arg0;
	}

	@OriginalMember(owner = "client!at", name = "c", descriptor = "(I)Z")
	public boolean method483() {
		if (super.aClass6_Sub22_31.method3533()) {
			return false;
		} else {
			return super.aClass6_Sub22_31.method3530() == Static237.aClass271_11;
		}
	}

	@OriginalMember(owner = "client!at", name = "d", descriptor = "(I)I")
	public int method484() {
		return super.anInt10701;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(B)I")
	@Override
	protected int method8986() {
		return 1;
	}
}
