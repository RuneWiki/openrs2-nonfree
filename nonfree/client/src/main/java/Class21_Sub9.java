import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public final class Class21_Sub9 extends Class21 {

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lclient!gp;)V")
	public Class21_Sub9(@OriginalArg(0) Class3_Sub27 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(ILclient!gp;)V")
	public Class21_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub27 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!gfa", name = "c", descriptor = "(Z)I")
	public int method3111() {
		return super.anInt10079;
	}

	@OriginalMember(owner = "client!gfa", name = "c", descriptor = "(I)Z")
	public boolean method3113() {
		if (super.aClass3_Sub27_31.method3242() == Static232.aClass222_3) {
			return !super.aClass3_Sub27_31.method3241();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B)I")
	@Override
	protected int method8636() {
		return 1;
	}

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "(Z)V")
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

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ZI)I")
	@Override
	public int method8635(@OriginalArg(1) int arg0) {
		if (super.aClass3_Sub27_31.method3242() != Static232.aClass222_3) {
			return 3;
		} else if (super.aClass3_Sub27_31.method3241()) {
			return 3;
		} else if (arg0 == 0 || super.aClass3_Sub27_31.aClass21_Sub3_1.method1270() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(BI)V")
	@Override
	protected void method8634(@OriginalArg(1) int arg0) {
		super.anInt10079 = arg0;
	}
}
