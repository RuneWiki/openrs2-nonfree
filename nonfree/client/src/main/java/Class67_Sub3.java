import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public final class Class67_Sub3 extends Class67 {

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!cg;)V")
	public Class67_Sub3(@OriginalArg(0) Class37_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method4165(@OriginalArg(0) Class81 arg0) {
		this.aClass37_Sub1_27.method767(arg0);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	@Override
	public void method4167(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "()V")
	@Override
	public void method4166() {
		this.aClass37_Sub1_27.method764(false);
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)V")
	@Override
	public void method4164(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "()Z")
	@Override
	public boolean method4168() {
		return true;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
	@Override
	public void method4163(@OriginalArg(0) boolean arg0) {
		this.aClass37_Sub1_27.method764(true);
	}
}
