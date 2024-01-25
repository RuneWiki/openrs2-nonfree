import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public abstract class Class91 {

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "()V")
	protected Class91() {
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)V")
	public abstract void method5217();

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(B)V")
	public abstract void method5218();

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)Lclient!oc;")
	public abstract Class2_Sub17 method5219();

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z)Z")
	protected abstract boolean method5220();

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "(B)Z")
	public abstract boolean method5222();

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)I")
	public abstract int method5223();

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)I")
	public abstract int method5224();

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "(I)Z")
	protected abstract boolean method5225();

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "(I)Z")
	public final boolean method5226() {
		return this.method5222() || this.method5220() || this.method5225();
	}
}
