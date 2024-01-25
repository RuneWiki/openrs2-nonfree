import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public final class Class19_Sub2 extends Class19 {

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lclient!rl;)V")
	public Class19_Sub2(@OriginalArg(0) Class82_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(Z)V")
	@Override
	public void method8277() {
		super.aClass82_Sub3_23.method5012(false);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILclient!hba;)V")
	@Override
	public void method8273(@OriginalArg(0) int arg0, @OriginalArg(2) Interface10 arg1) {
		super.aClass82_Sub3_23.method4972(arg1);
		super.aClass82_Sub3_23.method5010(arg0);
	}

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method8282() {
		return true;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8286(@OriginalArg(0) boolean arg0) {
		super.aClass82_Sub3_23.method5012(true);
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(III)V")
	@Override
	public void method8281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8274(@OriginalArg(1) boolean arg0) {
	}
}
