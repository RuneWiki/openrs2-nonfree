import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public final class Class7_Sub27 extends Class7 {

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(ILclient!qea;)V")
	public Class7_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Lclient!qea;)V")
	public Class7_Sub27(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IB)I")
	@Override
	public int method8573(@OriginalArg(0) int arg0) {
		if (super.aClass3_Sub41_31.method6776()) {
			return 3;
		} else if (arg0 == 0 || super.aClass3_Sub41_31.aClass7_Sub1_1.method189() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)I")
	public int method8231() {
		return super.anInt10115;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)V")
	@Override
	public void method8575() {
		if (super.aClass3_Sub41_31.method6776()) {
			super.anInt10115 = 0;
		}
		if (super.anInt10115 < 0 && super.anInt10115 > 2) {
			super.anInt10115 = this.method8572();
		}
	}

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "(I)Z")
	public boolean method8232() {
		return !super.aClass3_Sub41_31.method6776();
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(II)V")
	@Override
	protected void method8576(@OriginalArg(1) int arg0) {
		super.anInt10115 = arg0;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)I")
	@Override
	protected int method8572() {
		return 1;
	}
}
