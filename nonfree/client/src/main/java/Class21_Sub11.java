import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public final class Class21_Sub11 extends Class21 {

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(ILclient!eha;)V")
	public Class21_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lclient!eha;)V")
	public Class21_Sub11(@OriginalArg(0) Class3_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(II)I")
	@Override
	public int method9238(@OriginalArg(1) int arg0) {
		return super.aClass3_Sub22_34.method2415() ? 3 : 1;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)I")
	@Override
	protected int method9239() {
		if (super.aClass3_Sub22_34.method2415()) {
			return 2;
		} else if (super.aClass3_Sub22_34.aClass21_Sub28_2.method8618() && Static695.method6727(super.aClass3_Sub22_34.aClass21_Sub28_2.method8620())) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "(II)V")
	@Override
	protected void method9240(@OriginalArg(1) int arg0) {
		super.anInt10876 = arg0;
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)I")
	public int method4664() {
		return super.anInt10876;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
	@Override
	public void method9235() {
		if (super.aClass3_Sub22_34.method2415()) {
			super.anInt10876 = 2;
		}
		if (super.anInt10876 < 0 || super.anInt10876 > 2) {
			super.anInt10876 = this.method9239();
		}
	}

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(B)Z")
	public boolean method4665() {
		return !super.aClass3_Sub22_34.method2415();
	}
}
