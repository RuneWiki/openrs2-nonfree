import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public final class Class6_Sub9 extends Class6 {

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(ILclient!fca;)V")
	public Class6_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!fca;)V")
	public Class6_Sub9(@OriginalArg(0) Class3_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)Z")
	public boolean method3794() {
		if (super.aClass3_Sub22_31.method2845()) {
			return false;
		} else {
			return super.aClass3_Sub22_31.method2842() == Static438.aClass118_6;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
	@Override
	public void method8964() {
		if (super.aClass3_Sub22_31.method2842() != Static438.aClass118_6) {
			super.anInt10233 = 1;
		} else if (super.aClass3_Sub22_31.method2845()) {
			super.anInt10233 = 0;
		}
		if (super.anInt10233 != 0 && super.anInt10233 != 1) {
			super.anInt10233 = this.method8962();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)I")
	@Override
	protected int method8962() {
		return 1;
	}

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)I")
	public int method3802() {
		return super.anInt10233;
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(IB)V")
	@Override
	protected void method8961(@OriginalArg(0) int arg0) {
		super.anInt10233 = arg0;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IB)I")
	@Override
	public int method8960(@OriginalArg(0) int arg0) {
		if (super.aClass3_Sub22_31.method2845()) {
			return 3;
		} else if (super.aClass3_Sub22_31.method2842() == Static438.aClass118_6) {
			if (arg0 == 0) {
				if (super.aClass3_Sub22_31.aClass6_Sub5_1.method2797() == 1) {
					return 2;
				}
				if (super.aClass3_Sub22_31.aClass6_Sub15_1.method4448() == 1) {
					return 2;
				}
				if (super.aClass3_Sub22_31.aClass6_Sub29_1.method8967() > 0) {
					return 2;
				}
			}
			return 1;
		} else {
			return 3;
		}
	}
}
