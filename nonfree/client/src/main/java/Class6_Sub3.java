import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public final class Class6_Sub3 extends Class6 {

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!fca;)V")
	public Class6_Sub3(@OriginalArg(0) Class3_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(ILclient!fca;)V")
	public Class6_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IB)I")
	@Override
	public int method8960(@OriginalArg(0) int arg0) {
		if (super.aClass3_Sub22_31.method2845()) {
			return 3;
		} else if (super.aClass3_Sub22_31.aClass6_Sub15_1.method4448() == 0) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(IB)V")
	@Override
	protected void method8961(@OriginalArg(0) int arg0) {
		super.anInt10233 = arg0;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)I")
	@Override
	protected int method8962() {
		return 2;
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)Z")
	public boolean method1372() {
		if (super.aClass3_Sub22_31.method2845()) {
			return false;
		} else {
			return super.aClass3_Sub22_31.aClass6_Sub15_1.method4448() != 0;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V")
	@Override
	public void method8964() {
		if (super.aClass3_Sub22_31.method2845()) {
			super.anInt10233 = 0;
		}
		if (super.aClass3_Sub22_31.aClass6_Sub15_1.method4448() == 0) {
			super.anInt10233 = 0;
		}
		if (super.anInt10233 < 0 || super.anInt10233 > 2) {
			super.anInt10233 = this.method8962();
		}
	}

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)I")
	public int method1374() {
		return super.anInt10233;
	}
}
