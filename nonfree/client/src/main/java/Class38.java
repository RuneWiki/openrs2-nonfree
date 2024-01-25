import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public abstract class Class38 {

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "Lclient!pi;")
	protected final Class144_Sub3 aClass144_Sub3_43;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!pi;)V")
	public Class38(@OriginalArg(0) Class144_Sub3 arg0) {
		this.aClass144_Sub3_43 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BII)V")
	public abstract void method9398(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZ)V")
	public abstract void method9399(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZLclient!pu;I)V")
	public abstract void method9401(@OriginalArg(1) Class161 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
	public abstract void method9402();

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)Z")
	public abstract boolean method9403();

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(IZ)V")
	public abstract void method9406(@OriginalArg(1) boolean arg0);
}
