import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bka")
public final class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!bka", name = "<init>", descriptor = "(ILclient!rd;)V")
	public Class14_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!bka", name = "<init>", descriptor = "(Lclient!rd;)V")
	public Class14_Sub2(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bka", name = "b", descriptor = "(IB)I")
	@Override
	public int method8912(@OriginalArg(0) int arg0) {
		if (Static401.method5573(arg0)) {
			if (super.aClass3_Sub41_31.aClass14_Sub7_2.method2902() && !Static396.method5511(super.aClass3_Sub41_31.aClass14_Sub7_2.method2899())) {
				return 3;
			}
			if (super.aClass3_Sub41_31.aClass14_Sub13_1.method4048() == 1) {
				return 3;
			}
		}
		if (arg0 == 3) {
			return 3;
		} else if (Static401.method5573(arg0)) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!bka", name = "b", descriptor = "(I)I")
	@Override
	protected int method8910() {
		return 0;
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(IB)V")
	@Override
	protected void method8909(@OriginalArg(0) int arg0) {
		super.anInt10805 = arg0;
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(I)V")
	@Override
	public void method8906() {
		if (this.method1014()) {
			if (super.aClass3_Sub41_31.aClass14_Sub7_2.method2902() && !Static396.method5511(super.aClass3_Sub41_31.aClass14_Sub7_2.method2899())) {
				super.anInt10805 = 1;
			}
			if (super.aClass3_Sub41_31.aClass14_Sub13_1.method4048() == 1) {
				super.anInt10805 = 1;
			}
		}
		if (super.anInt10805 == 3) {
			super.anInt10805 = 2;
		}
		if (super.anInt10805 < 0 || super.anInt10805 > 3) {
			super.anInt10805 = this.method8910();
		}
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(B)Z")
	public boolean method1013() {
		return true;
	}

	@OriginalMember(owner = "client!bka", name = "b", descriptor = "(B)Z")
	public boolean method1014() {
		return Static401.method5573(super.anInt10805);
	}

	@OriginalMember(owner = "client!bka", name = "d", descriptor = "(I)I")
	public int method1015() {
		return super.anInt10805;
	}
}
