import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public final class Class15_Sub26 extends Class15 {

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lclient!hb;)V")
	public Class15_Sub26(@OriginalArg(0) Class6_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(ILclient!hb;)V")
	public Class15_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)I")
	@Override
	protected int method8986() {
		return 2;
	}

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "(II)I")
	@Override
	public int method8990(@OriginalArg(1) int arg0) {
		if (super.aClass6_Sub22_31.method3533()) {
			return 3;
		} else if (super.aClass6_Sub22_31.aClass15_Sub27_1.method8659() == 0) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)Z")
	public boolean method8641() {
		if (super.aClass6_Sub22_31.method3533()) {
			return false;
		} else {
			return super.aClass6_Sub22_31.aClass15_Sub27_1.method8659() != 0;
		}
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(II)V")
	@Override
	protected void method8985(@OriginalArg(1) int arg0) {
		super.anInt10701 = arg0;
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(B)V")
	@Override
	public void method8989() {
		if (super.aClass6_Sub22_31.method3533()) {
			super.anInt10701 = 0;
		}
		if (super.aClass6_Sub22_31.aClass15_Sub27_1.method8659() == 0) {
			super.anInt10701 = 0;
		}
		if (super.anInt10701 < 0 || super.anInt10701 > 2) {
			super.anInt10701 = this.method8986();
		}
	}

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)I")
	public int method8642() {
		return super.anInt10701;
	}
}
