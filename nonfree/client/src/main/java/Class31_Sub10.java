import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public final class Class31_Sub10 extends Class31 {

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!pj;)V")
	public Class31_Sub10(@OriginalArg(0) Class137_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8593() {
		return false;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8592(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8595(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(BILclient!kja;)V")
	@Override
	public void method8588(@OriginalArg(1) int arg0, @OriginalArg(2) Interface15 arg1) {
		super.aClass137_Sub1_22.method8007(arg1);
		super.aClass137_Sub1_22.method8078(arg0);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8587(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
	@Override
	public void method8591() {
	}
}
