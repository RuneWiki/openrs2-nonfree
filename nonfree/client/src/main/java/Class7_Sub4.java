import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public final class Class7_Sub4 extends Class7 {

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(ILclient!qea;)V")
	public Class7_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!qea;)V")
	public Class7_Sub4(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(II)V")
	@Override
	protected void method8576(@OriginalArg(1) int arg0) {
		super.anInt10115 = arg0;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)I")
	@Override
	protected int method8572() {
		return 0;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IB)I")
	@Override
	public int method8573(@OriginalArg(0) int arg0) {
		if (Static490.method7204(arg0)) {
			if (super.aClass3_Sub41_31.aClass7_Sub9_2.method4180() && !Static487.method7159(super.aClass3_Sub41_31.aClass7_Sub9_2.method4181())) {
				return 3;
			}
			if (super.aClass3_Sub41_31.aClass7_Sub22_1.method6533() == 1) {
				return 3;
			}
		}
		if (arg0 == 3) {
			return 3;
		} else if (Static490.method7204(arg0)) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)Z")
	public boolean method1401() {
		return true;
	}

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "(I)I")
	public int method1402() {
		return super.anInt10115;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)V")
	@Override
	public void method8575() {
		if (this.method1404()) {
			if (super.aClass3_Sub41_31.aClass7_Sub9_2.method4180() && !Static487.method7159(super.aClass3_Sub41_31.aClass7_Sub9_2.method4181())) {
				super.anInt10115 = 1;
			}
			if (super.aClass3_Sub41_31.aClass7_Sub22_1.method6533() == 1) {
				super.anInt10115 = 1;
			}
		}
		if (super.anInt10115 == 3) {
			super.anInt10115 = 2;
		}
		if (super.anInt10115 < 0 || super.anInt10115 > 3) {
			super.anInt10115 = this.method8572();
		}
	}

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "(B)Z")
	public boolean method1404() {
		return Static490.method7204(super.anInt10115);
	}
}
