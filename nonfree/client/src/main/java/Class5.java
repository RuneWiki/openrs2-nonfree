import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public abstract class Class5 {

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V")
	protected Class5() {
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)I")
	public abstract int method7042();

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)Lclient!sda;")
	public abstract Class1_Sub13 method7043();

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)Z")
	public abstract boolean method7044();

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "(I)Z")
	protected abstract boolean method7045();

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Z)V")
	public abstract void method7047();

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(Z)Z")
	protected abstract boolean method7048();

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)Z")
	public final boolean method7049() {
		return this.method7044() || this.method7045() || this.method7048();
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(B)I")
	public abstract int method7052();

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "(I)V")
	public abstract void method7054();
}
