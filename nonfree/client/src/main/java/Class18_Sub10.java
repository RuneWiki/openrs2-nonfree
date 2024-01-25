import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public final class Class18_Sub10 extends Class18 {

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!ij;)V")
	public Class18_Sub10(@OriginalArg(0) Class13_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8643() {
		return false;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILclient!fe;)V")
	@Override
	public void method8645(@OriginalArg(0) int arg0, @OriginalArg(2) Interface6 arg1) {
		super.aClass13_Sub3_23.method8234(arg1);
		super.aClass13_Sub3_23.method8204(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V")
	@Override
	public void method8642() {
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8637(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8632(@OriginalArg(1) boolean arg0) {
	}
}
