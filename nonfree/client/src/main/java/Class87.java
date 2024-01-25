import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public abstract class Class87 {

	@OriginalMember(owner = "client!io", name = "a", descriptor = "Lclient!ic;")
	protected final Class48_Sub2 aClass48_Sub2_39;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!ic;)V")
	public Class87(@OriginalArg(0) Class48_Sub2 arg0) {
		this.aClass48_Sub2_39 = arg0;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!vd;)V")
	public abstract void method5870(@OriginalArg(0) Class81 arg0);

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
	public abstract void method5871(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)V")
	public abstract void method5872(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!io", name = "a", descriptor = "()Z")
	public abstract boolean method5873();

	@OriginalMember(owner = "client!io", name = "b", descriptor = "()V")
	public abstract void method5874();

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(Z)V")
	public abstract void method5875(@OriginalArg(0) boolean arg0);
}
