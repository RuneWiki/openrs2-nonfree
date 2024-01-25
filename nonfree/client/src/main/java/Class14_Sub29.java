import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wja")
public final class Class14_Sub29 extends Class14 {

	@OriginalMember(owner = "client!wja", name = "<init>", descriptor = "(Lclient!rd;)V")
	public Class14_Sub29(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wja", name = "<init>", descriptor = "(ILclient!rd;)V")
	public Class14_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!wja", name = "b", descriptor = "(I)I")
	@Override
	protected int method8910() {
		if (super.aClass3_Sub41_31.method6704()) {
			return 2;
		} else if (super.aClass3_Sub41_31.aClass14_Sub7_2.method2902() && Static457.method6144(super.aClass3_Sub41_31.aClass14_Sub7_2.method2899())) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(IB)V")
	@Override
	protected void method8909(@OriginalArg(0) int arg0) {
		super.anInt10805 = arg0;
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(B)Z")
	public boolean method8913() {
		return !super.aClass3_Sub41_31.method6704();
	}

	@OriginalMember(owner = "client!wja", name = "c", descriptor = "(I)I")
	public int method8914() {
		return super.anInt10805;
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(I)V")
	@Override
	public void method8906() {
		if (super.aClass3_Sub41_31.method6704()) {
			super.anInt10805 = 2;
		}
		if (super.anInt10805 < 0 || super.anInt10805 > 2) {
			super.anInt10805 = this.method8910();
		}
	}

	@OriginalMember(owner = "client!wja", name = "b", descriptor = "(IB)I")
	@Override
	public int method8912(@OriginalArg(0) int arg0) {
		return super.aClass3_Sub41_31.method6704() ? 3 : 1;
	}
}
