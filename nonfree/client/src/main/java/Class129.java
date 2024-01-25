import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public abstract class Class129 {

	static {
		new Class32(" days.", " Tage.", " jours.", " dias.");
	}

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "()V")
	protected Class129() {
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
	public abstract void method2988();

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)I")
	public abstract int method2989();

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(Z)Z")
	public abstract boolean method2990();

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(I)Z")
	protected abstract boolean method2991();

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(I)Z")
	public final boolean method2992() {
		return this.method2990() || this.method2991() || this.method2996();
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(Z)Lclient!jm;")
	public abstract Class2_Sub19 method2994();

	@OriginalMember(owner = "client!po", name = "d", descriptor = "(I)Z")
	protected abstract boolean method2996();

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(B)I")
	public abstract int method2997();

	@OriginalMember(owner = "client!po", name = "d", descriptor = "(Z)V")
	public abstract void method2998();
}
