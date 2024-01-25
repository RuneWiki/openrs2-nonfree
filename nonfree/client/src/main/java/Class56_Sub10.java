import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public final class Class56_Sub10 extends Class56 {

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lclient!en;)V")
	public Class56_Sub10(@OriginalArg(0) Class100_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7174(@OriginalArg(1) boolean arg0) {
		super.aClass100_Sub1_23.method4826(true);
	}

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)V")
	@Override
	public void method7183() {
		super.aClass100_Sub1_23.method4826(false);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7172() {
		return true;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILclient!hfa;)V")
	@Override
	public void method7178(@OriginalArg(0) int arg0, @OriginalArg(2) Interface10 arg1) {
		super.aClass100_Sub1_23.method4876(arg1);
		super.aClass100_Sub1_23.method4872(arg0);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7171(@OriginalArg(1) boolean arg0) {
	}
}
