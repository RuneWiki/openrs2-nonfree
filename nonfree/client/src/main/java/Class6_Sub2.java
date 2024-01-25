import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public final class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(ILclient!fca;)V")
	public Class6_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!fca;)V")
	public Class6_Sub2(@OriginalArg(0) Class3_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V")
	@Override
	public void method8964() {
		if (this.method605()) {
			if (super.aClass3_Sub22_31.aClass6_Sub21_1.method6968() && !Static248.method4118(super.aClass3_Sub22_31.aClass6_Sub21_1.method6970())) {
				super.anInt10233 = 1;
			}
			if (super.aClass3_Sub22_31.aClass6_Sub7_2.method3506() == 1) {
				super.anInt10233 = 1;
			}
		}
		if (super.anInt10233 == 3) {
			super.anInt10233 = 2;
		}
		if (super.anInt10233 < 0 || super.anInt10233 > 3) {
			super.anInt10233 = this.method8962();
		}
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(I)I")
	public int method601() {
		return super.anInt10233;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(IB)V")
	@Override
	protected void method8961(@OriginalArg(0) int arg0) {
		super.anInt10233 = arg0;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(B)I")
	@Override
	protected int method8962() {
		return 0;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)I")
	@Override
	public int method8960(@OriginalArg(0) int arg0) {
		if (Static486.method7037(arg0)) {
			if (super.aClass3_Sub22_31.aClass6_Sub21_1.method6968() && !Static248.method4118(super.aClass3_Sub22_31.aClass6_Sub21_1.method6970())) {
				return 3;
			}
			if (super.aClass3_Sub22_31.aClass6_Sub7_2.method3506() == 1) {
				return 3;
			}
		}
		if (arg0 == 3) {
			return 3;
		} else if (Static486.method7037(arg0)) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!am", name = "d", descriptor = "(I)Z")
	public boolean method604() {
		return true;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(B)Z")
	public boolean method605() {
		return Static486.method7037(super.anInt10233);
	}
}
