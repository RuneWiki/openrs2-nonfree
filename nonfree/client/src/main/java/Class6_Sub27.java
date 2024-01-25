import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public final class Class6_Sub27 extends Class6 {

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!fca;)V")
	public Class6_Sub27(@OriginalArg(0) Class3_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(ILclient!fca;)V")
	public Class6_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IB)I")
	@Override
	public int method8960(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)I")
	public int method8665() {
		return super.anInt10233;
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(IB)V")
	@Override
	protected void method8961(@OriginalArg(0) int arg0) {
		super.anInt10233 = arg0;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)I")
	@Override
	protected int method8962() {
		return 0;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)V")
	@Override
	public void method8964() {
		if (super.anInt10233 < 0 || super.anInt10233 > 4) {
			super.anInt10233 = this.method8962();
		}
	}
}
