import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public final class Class14_Sub19 extends Class14 {

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(ILclient!rd;)V")
	public Class14_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!rd;)V")
	public Class14_Sub19(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)V")
	@Override
	protected void method8909(@OriginalArg(0) int arg0) {
		super.anInt10805 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)I")
	public int method5938() {
		return super.anInt10805;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
	@Override
	public void method8906() {
		if (super.aClass3_Sub41_31.aClass14_Sub2_1.method1014() && super.anInt10805 == 2) {
			super.anInt10805 = 1;
		}
		if (super.anInt10805 < 0 || super.anInt10805 > 2) {
			super.anInt10805 = this.method8910();
		}
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(IB)I")
	@Override
	public int method8912(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)I")
	@Override
	protected int method8910() {
		return 2;
	}
}
