import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public final class Class104_Sub4 extends Class104 {

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lclient!ap;)V")
	public Class104_Sub4(@OriginalArg(0) Class9_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7871(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7865() {
		return true;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IILclient!uda;)V")
	@Override
	public void method7872(@OriginalArg(0) int arg0, @OriginalArg(2) Class132 arg1) {
		super.aClass9_Sub2_40.method814(arg1);
		super.aClass9_Sub2_40.method822(arg0);
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(B)V")
	@Override
	public void method7868() {
		super.aClass9_Sub2_40.method770(false);
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7867(@OriginalArg(0) boolean arg0) {
		super.aClass9_Sub2_40.method770(true);
	}
}
