import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public final class Class10_Sub3 extends Class10 {

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lclient!jca;)V")
	public Class10_Sub3(@OriginalArg(0) Class22_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(B)V")
	@Override
	public void method9549() {
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IBI)V")
	@Override
	public void method9552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9557() {
		return false;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZI)V")
	@Override
	public void method9558(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!sc;II)V")
	@Override
	public void method9546(@OriginalArg(0) Interface21 arg0, @OriginalArg(2) int arg1) {
		super.aClass22_Sub2_23.method8976(arg0);
		super.aClass22_Sub2_23.method8853(arg1);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9551(@OriginalArg(0) boolean arg0) {
	}
}
