import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public final class Class21_Sub28 extends Class21 {

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(ILclient!gp;)V")
	public Class21_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub27 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lclient!gp;)V")
	public Class21_Sub28(@OriginalArg(0) Class3_Sub27 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ZI)I")
	@Override
	public int method8635(@OriginalArg(1) int arg0) {
		if (Static347.method5789(arg0)) {
			if (super.aClass3_Sub27_31.aClass21_Sub1_1.method1023() && !Static33.method1205(super.aClass3_Sub27_31.aClass21_Sub1_1.method1025())) {
				return 3;
			}
			if (super.aClass3_Sub27_31.aClass21_Sub2_1.method1086() == 1) {
				return 3;
			}
		}
		if (arg0 == 3) {
			return 3;
		} else if (Static347.method5789(arg0)) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(BI)V")
	@Override
	protected void method8634(@OriginalArg(1) int arg0) {
		super.anInt10079 = arg0;
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(Z)V")
	@Override
	public void method8639() {
		if (this.method8506()) {
			if (super.aClass3_Sub27_31.aClass21_Sub1_1.method1023() && !Static33.method1205(super.aClass3_Sub27_31.aClass21_Sub1_1.method1025())) {
				super.anInt10079 = 1;
			}
			if (super.aClass3_Sub27_31.aClass21_Sub2_1.method1086() == 1) {
				super.anInt10079 = 1;
			}
		}
		if (super.anInt10079 == 3) {
			super.anInt10079 = 2;
		}
		if (super.anInt10079 < 0 || super.anInt10079 > 3) {
			super.anInt10079 = this.method8636();
		}
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)Z")
	public boolean method8503() {
		return true;
	}

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "(Z)I")
	public int method8504() {
		return super.anInt10079;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)I")
	@Override
	protected int method8636() {
		return 0;
	}

	@OriginalMember(owner = "client!vu", name = "d", descriptor = "(I)Z")
	public boolean method8506() {
		return Static347.method5789(super.anInt10079);
	}
}
