import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public final class Class17_Sub16 extends Class17 {

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lclient!eka;)V")
	public Class17_Sub16(@OriginalArg(0) Class3_Sub15 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(ILclient!eka;)V")
	public Class17_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "(II)V")
	@Override
	protected void method8737(@OriginalArg(0) int arg0) {
		super.anInt10323 = arg0;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Z)V")
	@Override
	public void method8733() {
		if (this.method5568()) {
			if (super.aClass3_Sub15_31.aClass17_Sub20_1.method6399() && !Static132.method2278(super.aClass3_Sub15_31.aClass17_Sub20_1.method6402())) {
				super.anInt10323 = 1;
			}
			if (super.aClass3_Sub15_31.lb.method3400() == 1) {
				super.anInt10323 = 1;
			}
		}
		if (super.anInt10323 == 3) {
			super.anInt10323 = 2;
		}
		if (super.anInt10323 < 0 || super.anInt10323 > 3) {
			super.anInt10323 = this.method8732();
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)I")
	@Override
	public int method8734(@OriginalArg(0) int arg0) {
		if (Static501.method7127(arg0)) {
			if (super.aClass3_Sub15_31.aClass17_Sub20_1.method6399() && !Static132.method2278(super.aClass3_Sub15_31.aClass17_Sub20_1.method6402())) {
				return 3;
			}
			if (super.aClass3_Sub15_31.lb.method3400() == 1) {
				return 3;
			}
		}
		if (arg0 == 3) {
			return 3;
		} else if (Static501.method7127(arg0)) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "(B)Z")
	public boolean method5568() {
		return Static501.method7127(super.anInt10323);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)I")
	@Override
	protected int method8732() {
		return 0;
	}

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "(B)I")
	public int method5569() {
		return super.anInt10323;
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)Z")
	public boolean method5570() {
		return true;
	}
}
