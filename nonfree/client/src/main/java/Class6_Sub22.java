import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public final class Class6_Sub22 extends Class6 {

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(ILclient!fca;)V")
	public Class6_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lclient!fca;)V")
	public Class6_Sub22(@OriginalArg(0) Class3_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IB)I")
	@Override
	public int method8960(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)V")
	@Override
	public void method8964() {
		super.anInt10233 = this.method8962();
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(IB)V")
	@Override
	protected void method8961(@OriginalArg(0) int arg0) {
		super.anInt10233 = arg0;
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)I")
	public int method7116() {
		return super.anInt10233;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)I")
	@Override
	protected int method8962() {
		return super.aClass3_Sub22_31.method2842() == Static438.aClass118_6 && super.aClass3_Sub22_31.method2845() ? 0 : 1;
	}
}
