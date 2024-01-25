import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public abstract class Class54 {

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
	protected Class54() {
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(B)Lclient!vfa;")
	public abstract Class3_Sub27 method7301();

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
	public abstract void method7302();

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(B)Z")
	protected abstract boolean method7305();

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(I)I")
	public abstract int method7306();

	@OriginalMember(owner = "client!si", name = "d", descriptor = "(I)Z")
	public abstract boolean method7307();

	@OriginalMember(owner = "client!si", name = "f", descriptor = "(I)Z")
	protected abstract boolean method7311();

	@OriginalMember(owner = "client!si", name = "g", descriptor = "(I)V")
	public abstract void method7312();

	@OriginalMember(owner = "client!si", name = "h", descriptor = "(I)Z")
	public final boolean method7313() {
		return this.method7307() || this.method7305() || this.method7311();
	}

	@OriginalMember(owner = "client!si", name = "i", descriptor = "(I)I")
	public abstract int method7315();
}
