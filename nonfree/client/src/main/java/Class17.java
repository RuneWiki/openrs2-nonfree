import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public abstract class Class17 {

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "Lclient!sq;")
	protected final Class46_Sub2 aClass46_Sub2_37;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lclient!sq;)V")
	public Class17(@OriginalArg(0) Class46_Sub2 arg0) {
		this.aClass46_Sub2_37 = arg0;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)V")
	public abstract void method5297(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "()Z")
	public abstract boolean method5298();

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "()V")
	public abstract void method5299();

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
	public abstract void method5300(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(Z)V")
	public abstract void method5301(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!od;)V")
	public abstract void method5302(@OriginalArg(0) Class8 arg0);
}
