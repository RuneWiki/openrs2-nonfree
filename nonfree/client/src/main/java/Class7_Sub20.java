import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oha")
public final class Class7_Sub20 extends Class7 {

	@OriginalMember(owner = "client!oha", name = "<init>", descriptor = "(Lclient!qea;)V")
	public Class7_Sub20(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!oha", name = "<init>", descriptor = "(ILclient!qea;)V")
	public Class7_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!oha", name = "b", descriptor = "(I)I")
	public int method6317() {
		return super.anInt10115;
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(I)I")
	@Override
	protected int method8572() {
		if (super.aClass3_Sub41_31.method6776()) {
			return 2;
		} else if (super.aClass3_Sub41_31.aClass7_Sub9_2.method4180() && Static159.method2765(super.aClass3_Sub41_31.aClass7_Sub9_2.method4181())) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(B)V")
	@Override
	public void method8575() {
		if (super.aClass3_Sub41_31.method6776()) {
			super.anInt10115 = 2;
		}
		if (super.anInt10115 < 0 || super.anInt10115 > 2) {
			super.anInt10115 = this.method8572();
		}
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(IB)I")
	@Override
	public int method8573(@OriginalArg(0) int arg0) {
		return super.aClass3_Sub41_31.method6776() ? 3 : 1;
	}

	@OriginalMember(owner = "client!oha", name = "d", descriptor = "(I)Z")
	public boolean method6319() {
		return !super.aClass3_Sub41_31.method6776();
	}

	@OriginalMember(owner = "client!oha", name = "b", descriptor = "(II)V")
	@Override
	protected void method8576(@OriginalArg(1) int arg0) {
		super.anInt10115 = arg0;
	}
}
