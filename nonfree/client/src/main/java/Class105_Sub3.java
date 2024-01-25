import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public final class Class105_Sub3 extends Class105 {

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lclient!kfa;)V")
	public Class105_Sub3(@OriginalArg(0) Class7_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILclient!jo;I)V")
	@Override
	public void method7388(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1) {
		super.aClass7_Sub2_41.method4313(arg1);
		super.aClass7_Sub2_41.method4288(arg0);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7390(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)V")
	@Override
	public void method7381() {
		super.aClass7_Sub2_41.method4334(false);
	}

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(III)V")
	@Override
	public void method7387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7385() {
		return true;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7382(@OriginalArg(0) boolean arg0) {
		super.aClass7_Sub2_41.method4334(true);
	}
}
