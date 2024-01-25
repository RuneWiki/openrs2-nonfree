import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public final class Class6_Sub18 extends Class6 {

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Lclient!fca;)V")
	public Class6_Sub18(@OriginalArg(0) Class3_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(ILclient!fca;)V")
	public Class6_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "(I)I")
	public int method6575() {
		return super.anInt10233;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Z)V")
	@Override
	public void method8964() {
		if (super.anInt10233 != 1 && super.anInt10233 != 0) {
			super.anInt10233 = this.method8962();
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IB)I")
	@Override
	public int method8960(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "(IB)V")
	@Override
	protected void method8961(@OriginalArg(0) int arg0) {
		super.anInt10233 = arg0;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)I")
	@Override
	protected int method8962() {
		return 1;
	}
}
