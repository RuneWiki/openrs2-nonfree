import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public abstract class Class75 {

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "()V")
	protected Class75() {
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)Z")
	protected abstract boolean method8403();

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(B)V")
	public abstract void method8404();

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "(B)I")
	public abstract int method8405();

	@OriginalMember(owner = "client!tba", name = "c", descriptor = "(B)V")
	public abstract void method8407();

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Z)Z")
	public abstract boolean method8408();

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "(I)Z")
	protected abstract boolean method8409();

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "(Z)Lclient!hl;")
	public abstract Class3_Sub21 method8411();

	@OriginalMember(owner = "client!tba", name = "d", descriptor = "(B)I")
	public abstract int method8412();

	@OriginalMember(owner = "client!tba", name = "e", descriptor = "(B)Z")
	public final boolean method8413() {
		return this.method8408() || this.method8403() || this.method8409();
	}
}
