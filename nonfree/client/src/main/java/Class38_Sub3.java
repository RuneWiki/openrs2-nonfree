import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public final class Class38_Sub3 extends Class38 {

	static {
		new Class174("Ok", "Okay", "OK", "Ok");
	}

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lclient!nq;)V")
	public Class38_Sub3(@OriginalArg(0) Class167_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5703(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5704() {
		return true;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5707(@OriginalArg(1) boolean arg0) {
		super.aClass167_Sub1_42.method3977(true);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5708(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZLclient!lr;I)V")
	@Override
	public void method5710(@OriginalArg(1) Class137 arg0, @OriginalArg(2) int arg1) {
		super.aClass167_Sub1_42.method4028(arg0);
		super.aClass167_Sub1_42.method3998(arg1);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
	@Override
	public void method5706() {
		super.aClass167_Sub1_42.method3977(false);
	}
}
