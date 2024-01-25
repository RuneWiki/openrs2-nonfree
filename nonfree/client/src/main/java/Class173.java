import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public abstract class Class173 {

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
	protected Class173() {
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)I")
	public abstract int method6487();

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)Z")
	protected abstract boolean method6488();

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)I")
	public abstract int method6489();

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
	public abstract void method6490();

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)Lclient!wk;")
	public abstract Class6_Sub5 method6491();

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)Z")
	public final boolean method6493() {
		return this.method6496() || this.method6488() || this.method6495();
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)V")
	public abstract void method6494();

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)Z")
	protected abstract boolean method6495();

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "(I)Z")
	public abstract boolean method6496();
}
