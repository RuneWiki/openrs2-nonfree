import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public final class Class101_Sub1 extends Class101 {

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lclient!qj;)V")
	public Class101_Sub1(@OriginalArg(0) Class100_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)V")
	@Override
	public void method7840(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7836() {
		return true;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method7834(@OriginalArg(0) int arg0, @OriginalArg(2) Class23 arg1) {
		super.aClass100_Sub3_43.method6277(arg1);
		super.aClass100_Sub3_43.method6322(arg0);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7839(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
	@Override
	public void method7835() {
		super.aClass100_Sub3_43.method6340(false);
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7841(@OriginalArg(1) boolean arg0) {
		super.aClass100_Sub3_43.method6340(true);
	}
}
