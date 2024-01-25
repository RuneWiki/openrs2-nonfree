import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public final class Class6_Sub16 extends Class6 {

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(ILclient!fca;)V")
	public Class6_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lclient!fca;)V")
	public Class6_Sub16(@OriginalArg(0) Class3_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(Z)V")
	@Override
	public void method8964() {
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(B)I")
	@Override
	protected int method8962() {
		return 0;
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(I)I")
	public int method4632() {
		return super.anInt10233;
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(IB)V")
	@Override
	protected void method8961(@OriginalArg(0) int arg0) {
		super.anInt10233 = arg0;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IB)I")
	@Override
	public int method8960(@OriginalArg(0) int arg0) {
		return 1;
	}
}
