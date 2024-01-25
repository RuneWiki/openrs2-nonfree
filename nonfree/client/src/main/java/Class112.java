import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tla")
public abstract class Class112 {

	@OriginalMember(owner = "client!tla", name = "b", descriptor = "Lclient!uja;")
	protected final Class145_Sub3 aClass145_Sub3_43;

	@OriginalMember(owner = "client!tla", name = "<init>", descriptor = "(Lclient!uja;)V")
	public Class112(@OriginalArg(0) Class145_Sub3 arg0) {
		this.aClass145_Sub3_43 = arg0;
	}

	@OriginalMember(owner = "client!tla", name = "a", descriptor = "(IZ)V")
	public abstract void method8388(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!tla", name = "a", descriptor = "(Z)Z")
	public abstract boolean method8389();

	@OriginalMember(owner = "client!tla", name = "a", descriptor = "(I)V")
	public abstract void method8390();

	@OriginalMember(owner = "client!tla", name = "b", descriptor = "(III)V")
	public abstract void method8393(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!tla", name = "a", descriptor = "(BZ)V")
	public abstract void method8396(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!tla", name = "a", descriptor = "(Lclient!jca;II)V")
	public abstract void method8397(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1);
}
