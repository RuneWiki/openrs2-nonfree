import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public final class Class57_Sub11 extends Class57 {

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lclient!uv;)V")
	public Class57_Sub11(@OriginalArg(0) Class5_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)V")
	@Override
	public void method8703() {
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8707(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8712(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(III)V")
	@Override
	public void method8710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8709() {
		return false;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IILclient!bl;)V")
	@Override
	public void method8706(@OriginalArg(1) int arg0, @OriginalArg(2) Interface4 arg1) {
		super.aClass5_Sub2_23.method4008(arg1);
		super.aClass5_Sub2_23.method4018(arg0);
	}
}
