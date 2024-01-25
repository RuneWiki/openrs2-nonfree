import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public final class Class4_Sub6 extends Class4 {

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(ILclient!w;)V")
	public Class4_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub54 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!w;)V")
	public Class4_Sub6(@OriginalArg(0) Class2_Sub54 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)Z")
	public boolean method1089() {
		return true;
	}

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "(I)Z")
	public boolean method1091() {
		return Static545.method8347(super.anInt10787);
	}

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "(I)I")
	public int method1092() {
		return super.anInt10787;
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(Z)V")
	@Override
	public void method9225() {
		if (this.method1091()) {
			if (super.aClass2_Sub54_31.aClass4_Sub16_2.method4906() && !Static9.method146(super.aClass2_Sub54_31.aClass4_Sub16_2.method4907())) {
				super.anInt10787 = 1;
			}
			if (super.aClass2_Sub54_31.aClass4_Sub11_1.method3216() == 1) {
				super.anInt10787 = 1;
			}
		}
		if (super.anInt10787 == 3) {
			super.anInt10787 = 2;
		}
		if (super.anInt10787 < 0 || super.anInt10787 > 3) {
			super.anInt10787 = this.method9221();
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BI)V")
	@Override
	protected void method9227(@OriginalArg(1) int arg0) {
		super.anInt10787 = arg0;
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(II)I")
	@Override
	public int method9223(@OriginalArg(0) int arg0) {
		if (Static545.method8347(arg0)) {
			if (super.aClass2_Sub54_31.aClass4_Sub16_2.method4906() && !Static9.method146(super.aClass2_Sub54_31.aClass4_Sub16_2.method4907())) {
				return 3;
			}
			if (super.aClass2_Sub54_31.aClass4_Sub11_1.method3216() == 1) {
				return 3;
			}
		}
		if (arg0 == 3) {
			return 3;
		} else if (Static545.method8347(arg0)) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Z)I")
	@Override
	protected int method9221() {
		return 0;
	}
}
