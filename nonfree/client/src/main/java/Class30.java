import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public abstract class Class30 {

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "Lclient!nm;")
	protected final Class164_Sub1 aClass164_Sub1_39;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!nm;)V")
	public Class30(@OriginalArg(0) Class164_Sub1 arg0) {
		this.aClass164_Sub1_39 = arg0;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "()V")
	public abstract void method4842();

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "()Z")
	public abstract boolean method4843();

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)V")
	public abstract void method4844(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
	public abstract void method4845(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(Z)V")
	public abstract void method4846(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!ap;)V")
	public abstract void method4847(@OriginalArg(0) Class15 arg0);
}
