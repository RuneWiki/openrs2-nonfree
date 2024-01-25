import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public final class Class21_Sub22 extends Class21 {

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(ILclient!eha;)V")
	public Class21_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!eha;)V")
	public Class21_Sub22(@OriginalArg(0) Class3_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	@Override
	public void method9235() {
		if (super.aClass3_Sub22_34.method2421() != Static326.aClass309_5) {
			super.anInt10876 = 1;
		} else if (super.aClass3_Sub22_34.method2415()) {
			super.anInt10876 = 0;
		}
		if (super.anInt10876 != 0 && super.anInt10876 != 1) {
			super.anInt10876 = this.method9239();
		}
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(II)V")
	@Override
	protected void method9240(@OriginalArg(1) int arg0) {
		super.anInt10876 = arg0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)I")
	@Override
	protected int method9239() {
		return 1;
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(II)I")
	@Override
	public int method9238(@OriginalArg(1) int arg0) {
		if (super.aClass3_Sub22_34.method2415()) {
			return 3;
		} else if (super.aClass3_Sub22_34.method2421() == Static326.aClass309_5) {
			if (arg0 == 0) {
				if (super.aClass3_Sub22_34.aClass21_Sub8_1.method3997() == 1) {
					return 2;
				}
				if (super.aClass3_Sub22_34.aClass21_Sub27_1.method8320() == 1) {
					return 2;
				}
				if (super.aClass3_Sub22_34.aClass21_Sub25_1.method7954() > 0) {
					return 2;
				}
			}
			return 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(B)Z")
	public boolean method7244() {
		if (super.aClass3_Sub22_34.method2415()) {
			return false;
		} else {
			return super.aClass3_Sub22_34.method2421() == Static326.aClass309_5;
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)I")
	public int method7245() {
		return super.anInt10876;
	}
}
