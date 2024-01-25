import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public abstract class Class6 {

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "()V")
	protected Class6() {
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
	public abstract void method7045();

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)Z")
	protected abstract boolean method7046();

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "(I)Z")
	public abstract boolean method7047();

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "(I)I")
	public abstract int method7048();

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "(I)I")
	public abstract int method7049();

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "(I)V")
	public abstract void method7051();

	@OriginalMember(owner = "client!wt", name = "g", descriptor = "(I)Lclient!uaa;")
	public abstract Class2_Sub35 method7052();

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)Z")
	protected abstract boolean method7053();

	@OriginalMember(owner = "client!wt", name = "h", descriptor = "(I)Z")
	public final boolean method7054() {
		return this.method7047() || this.method7053() || this.method7046();
	}
}
