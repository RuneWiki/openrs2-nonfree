import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public final class Class21_Sub10 extends Class21 {

	@OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(ILclient!eha;)V")
	public Class21_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Lclient!eha;)V")
	public Class21_Sub10(@OriginalArg(0) Class3_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jfa", name = "c", descriptor = "(B)Z")
	public boolean method4496() {
		return true;
	}

	@OriginalMember(owner = "client!jfa", name = "c", descriptor = "(II)I")
	@Override
	public int method9238(@OriginalArg(1) int arg0) {
		if (Static435.method5756(arg0)) {
			if (super.aClass3_Sub22_34.aClass21_Sub28_2.method8618() && !Static44.method1189(super.aClass3_Sub22_34.aClass21_Sub28_2.method8620())) {
				return 3;
			}
			if (super.aClass3_Sub22_34.aClass21_Sub29_2.method8657() == 1) {
				return 3;
			}
		}
		if (arg0 == 3) {
			return 3;
		} else if (Static435.method5756(arg0)) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)V")
	@Override
	public void method9235() {
		if (this.method4500()) {
			if (super.aClass3_Sub22_34.aClass21_Sub28_2.method8618() && !Static44.method1189(super.aClass3_Sub22_34.aClass21_Sub28_2.method8620())) {
				super.anInt10876 = 1;
			}
			if (super.aClass3_Sub22_34.aClass21_Sub29_2.method8657() == 1) {
				super.anInt10876 = 1;
			}
		}
		if (super.anInt10876 == 3) {
			super.anInt10876 = 2;
		}
		if (super.anInt10876 < 0 || super.anInt10876 > 3) {
			super.anInt10876 = this.method9239();
		}
	}

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(I)I")
	public int method4499() {
		return super.anInt10876;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B)I")
	@Override
	protected int method9239() {
		return 0;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Z)Z")
	public boolean method4500() {
		return Static435.method5756(super.anInt10876);
	}

	@OriginalMember(owner = "client!jfa", name = "d", descriptor = "(II)V")
	@Override
	protected void method9240(@OriginalArg(1) int arg0) {
		super.anInt10876 = arg0;
	}
}
