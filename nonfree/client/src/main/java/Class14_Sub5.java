import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public final class Class14_Sub5 extends Class14 {

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Lclient!rd;)V")
	public Class14_Sub5(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(ILclient!rd;)V")
	public Class14_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(IB)I")
	@Override
	public int method8912(@OriginalArg(0) int arg0) {
		if (super.aClass3_Sub41_31.method6704()) {
			return 3;
		} else if (super.aClass3_Sub41_31.aClass14_Sub8_1.method2916() == 0) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(I)I")
	@Override
	protected int method8910() {
		return 2;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)V")
	@Override
	public void method8906() {
		if (super.aClass3_Sub41_31.method6704()) {
			super.anInt10805 = 0;
		}
		if (super.aClass3_Sub41_31.aClass14_Sub8_1.method2916() == 0) {
			super.anInt10805 = 0;
		}
		if (super.anInt10805 < 0 || super.anInt10805 > 2) {
			super.anInt10805 = this.method8910();
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IB)V")
	@Override
	protected void method8909(@OriginalArg(0) int arg0) {
		super.anInt10805 = arg0;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)Z")
	public boolean method2510() {
		if (super.aClass3_Sub41_31.method6704()) {
			return false;
		} else {
			return super.aClass3_Sub41_31.aClass14_Sub8_1.method2916() != 0;
		}
	}

	@OriginalMember(owner = "client!fba", name = "c", descriptor = "(I)I")
	public int method2511() {
		return super.anInt10805;
	}
}
