import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public abstract class Class96 {

	static {
		new Class119("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
	}

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "()V")
	protected Class96() {
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)I")
	public abstract int method3870();

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)Z")
	protected abstract boolean method3871();

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(B)I")
	public abstract int method3872();

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)Lclient!st;")
	public abstract Class1_Sub24 method3873();

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "(I)V")
	public abstract void method3874();

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Z)Z")
	public abstract boolean method3875();

	@OriginalMember(owner = "client!gv", name = "d", descriptor = "(I)Z")
	protected abstract boolean method3876();

	@OriginalMember(owner = "client!gv", name = "e", descriptor = "(I)Z")
	public final boolean method3878() {
		return this.method3875() || this.method3871() || this.method3876();
	}

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "(B)V")
	public abstract void method3879();
}
