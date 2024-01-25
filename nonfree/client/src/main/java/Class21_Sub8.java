import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public final class Class21_Sub8 extends Class21 {

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!eha;)V")
	public Class21_Sub8(@OriginalArg(0) Class3_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(ILclient!eha;)V")
	public Class21_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(I)I")
	public int method3997() {
		return super.anInt10876;
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(B)Z")
	public boolean method3999() {
		return true;
	}

	@OriginalMember(owner = "client!il", name = "d", descriptor = "(II)V")
	@Override
	protected void method9240(@OriginalArg(1) int arg0) {
		super.anInt10876 = arg0;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(B)I")
	@Override
	protected int method9239() {
		return 1;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
	@Override
	public void method9235() {
		if (super.anInt10876 != 0 && super.aClass3_Sub22_34.aClass21_Sub22_1.method7245() != 1) {
			super.anInt10876 = 0;
		}
		if (super.anInt10876 < 0 || super.anInt10876 > 1) {
			super.anInt10876 = this.method9239();
		}
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(II)I")
	@Override
	public int method9238(@OriginalArg(1) int arg0) {
		return arg0 == 0 || super.aClass3_Sub22_34.aClass21_Sub22_1.method7245() == 1 ? 1 : 2;
	}
}
