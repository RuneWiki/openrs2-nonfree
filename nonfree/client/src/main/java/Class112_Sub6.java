import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public final class Class112_Sub6 extends Class112 {

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!uja;)V")
	public Class112_Sub6(@OriginalArg(0) Class145_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8388(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	@Override
	public void method8390() {
		super.aClass145_Sub3_43.method8914(false);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8389() {
		return true;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(III)V")
	@Override
	public void method8393(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!jca;II)V")
	@Override
	public void method8397(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1) {
		super.aClass145_Sub3_43.method8872(arg0);
		super.aClass145_Sub3_43.method8900(arg1);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8396(@OriginalArg(1) boolean arg0) {
		super.aClass145_Sub3_43.method8914(true);
	}
}
