import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public final class Class6_Sub12 extends Class6 {

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lclient!fca;)V")
	public Class6_Sub12(@OriginalArg(0) Class3_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(ILclient!fca;)V")
	public Class6_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IB)I")
	@Override
	public int method8960(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(IB)V")
	@Override
	protected void method8961(@OriginalArg(0) int arg0) {
		super.anInt10233 = arg0;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(B)I")
	@Override
	protected int method8962() {
		return 1;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Z)V")
	@Override
	public void method8964() {
		if (super.anInt10233 != 1 && super.anInt10233 != 0) {
			super.anInt10233 = this.method8962();
		}
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(I)I")
	public int method4157() {
		return super.anInt10233;
	}
}
