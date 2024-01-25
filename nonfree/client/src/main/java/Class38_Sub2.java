import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public final class Class38_Sub2 extends Class38 {

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!pi;)V")
	public Class38_Sub2(@OriginalArg(0) Class144_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(IZ)V")
	@Override
	public void method9406(@OriginalArg(1) boolean arg0) {
		super.aClass144_Sub3_43.method7047(true);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9403() {
		return true;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLclient!pu;I)V")
	@Override
	public void method9401(@OriginalArg(1) Class161 arg0, @OriginalArg(2) int arg1) {
		super.aClass144_Sub3_43.method6982(arg0);
		super.aClass144_Sub3_43.method6988(arg1);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9399(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BII)V")
	@Override
	public void method9398(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)V")
	@Override
	public void method9402() {
		super.aClass144_Sub3_43.method7047(false);
	}
}
