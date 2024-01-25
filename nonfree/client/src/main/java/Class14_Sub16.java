import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public final class Class14_Sub16 extends Class14 {

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(ILclient!rd;)V")
	public Class14_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lclient!rd;)V")
	public Class14_Sub16(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)I")
	@Override
	protected int method8910() {
		return 1;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)V")
	@Override
	protected void method8909(@OriginalArg(0) int arg0) {
		super.anInt10805 = arg0;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(IB)I")
	@Override
	public int method8912(@OriginalArg(0) int arg0) {
		return arg0 == 0 || super.aClass3_Sub41_31.aClass14_Sub21_1.method6184() == 1 ? 1 : 2;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	@Override
	public void method8906() {
		if (super.anInt10805 != 0 && super.aClass3_Sub41_31.aClass14_Sub21_1.method6184() != 1) {
			super.anInt10805 = 0;
		}
		if (super.anInt10805 < 0 || super.anInt10805 > 1) {
			super.anInt10805 = this.method8910();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Z")
	public boolean method4687() {
		return true;
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)I")
	public int method4688() {
		return super.anInt10805;
	}
}
