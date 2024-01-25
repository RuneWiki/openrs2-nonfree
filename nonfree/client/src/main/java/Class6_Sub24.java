import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public final class Class6_Sub24 extends Class6 {

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!fca;)V")
	public Class6_Sub24(@OriginalArg(0) Class3_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(ILclient!fca;)V")
	public Class6_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(IB)V")
	@Override
	protected void method8961(@OriginalArg(0) int arg0) {
		super.anInt10233 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
	@Override
	public void method8964() {
		if (super.aClass3_Sub22_31.method2845()) {
			super.anInt10233 = 2;
		}
		if (super.anInt10233 < 0 || super.anInt10233 > 2) {
			super.anInt10233 = this.method8962();
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)I")
	@Override
	public int method8960(@OriginalArg(0) int arg0) {
		return super.aClass3_Sub22_31.method2845() ? 3 : 1;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)I")
	@Override
	protected int method8962() {
		if (super.aClass3_Sub22_31.method2845()) {
			return 2;
		} else if (super.aClass3_Sub22_31.aClass6_Sub21_1.method6968() && Static551.method7882(super.aClass3_Sub22_31.aClass6_Sub21_1.method6970())) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)I")
	public int method7991() {
		return super.anInt10233;
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)Z")
	public boolean method7992() {
		return !super.aClass3_Sub22_31.method2845();
	}
}
