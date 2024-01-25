import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public final class Class21_Sub3 extends Class21 {

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(ILclient!gp;)V")
	public Class21_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub27 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!gp;)V")
	public Class21_Sub3(@OriginalArg(0) Class3_Sub27 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BI)V")
	@Override
	protected void method8634(@OriginalArg(1) int arg0) {
		super.anInt10079 = arg0;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)I")
	@Override
	protected int method8636() {
		return 1;
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(Z)I")
	public int method1270() {
		return super.anInt10079;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)I")
	@Override
	public int method8635(@OriginalArg(1) int arg0) {
		if (super.aClass3_Sub27_31.method3241()) {
			return 3;
		} else if (super.aClass3_Sub27_31.method3242() == Static232.aClass222_3) {
			if (arg0 == 0) {
				if (super.aClass3_Sub27_31.aClass21_Sub20_1.method6682() == 1) {
					return 2;
				}
				if (super.aClass3_Sub27_31.aClass21_Sub9_1.method3111() == 1) {
					return 2;
				}
				if (super.aClass3_Sub27_31.aClass21_Sub15_1.method5810() > 0) {
					return 2;
				}
			}
			return 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(Z)V")
	@Override
	public void method8639() {
		if (super.aClass3_Sub27_31.method3242() != Static232.aClass222_3) {
			super.anInt10079 = 1;
		} else if (super.aClass3_Sub27_31.method3241()) {
			super.anInt10079 = 0;
		}
		if (super.anInt10079 != 0 && super.anInt10079 != 1) {
			super.anInt10079 = this.method8636();
		}
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(I)Z")
	public boolean method1273() {
		if (super.aClass3_Sub27_31.method3241()) {
			return false;
		} else {
			return super.aClass3_Sub27_31.method3242() == Static232.aClass222_3;
		}
	}
}
