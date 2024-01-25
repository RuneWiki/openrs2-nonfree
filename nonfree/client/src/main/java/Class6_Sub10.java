import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public final class Class6_Sub10 extends Class6 {

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(ILclient!fca;)V")
	public Class6_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lclient!fca;)V")
	public Class6_Sub10(@OriginalArg(0) Class3_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)Z")
	public boolean method4129() {
		return Static43.method1102(super.aClass3_Sub22_31.aClass6_Sub21_1.method6970());
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)I")
	@Override
	protected int method8962() {
		return 0;
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(IB)V")
	@Override
	protected void method8961(@OriginalArg(0) int arg0) {
		super.anInt10233 = arg0;
	}

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)I")
	public int method4135() {
		return super.anInt10233;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)I")
	@Override
	public int method8960(@OriginalArg(0) int arg0) {
		return Static43.method1102(super.aClass3_Sub22_31.aClass6_Sub21_1.method6970()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V")
	@Override
	public void method8964() {
		if (super.aClass3_Sub22_31.aClass6_Sub21_1.method6968() && !Static43.method1102(super.aClass3_Sub22_31.aClass6_Sub21_1.method6970())) {
			super.anInt10233 = 0;
		}
		if (super.anInt10233 < 0 || super.anInt10233 > 1) {
			super.anInt10233 = this.method8962();
		}
	}
}
