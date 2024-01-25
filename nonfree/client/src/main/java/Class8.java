import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public abstract class Class8 {

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "Lclient!qi;")
	protected final Class82_Sub2 aClass82_Sub2_34;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!qi;)V")
	public Class8(@OriginalArg(0) Class82_Sub2 arg0) {
		this.aClass82_Sub2_34 = arg0;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V")
	public abstract void method4891(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "()Z")
	public abstract boolean method4892();

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "()V")
	public abstract void method4893();

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!et;)V")
	public abstract void method4894(@OriginalArg(0) Class7 arg0);

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
	public abstract void method4895(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(Z)V")
	public abstract void method4896(@OriginalArg(0) boolean arg0);
}
