import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public abstract class Class142 {

	static {
		new Class106("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
	protected Class142() {
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(B)Z")
	public abstract boolean method4907();

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)Z")
	protected abstract boolean method4908();

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V")
	public abstract void method4910();

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(I)I")
	public abstract int method4911();

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(I)Z")
	protected abstract boolean method4912();

	@OriginalMember(owner = "client!na", name = "f", descriptor = "(I)Z")
	public final boolean method4913() {
		return this.method4907() || this.method4908() || this.method4912();
	}

	@OriginalMember(owner = "client!na", name = "g", descriptor = "(I)I")
	public abstract int method4915();

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
	public abstract void method4916();

	@OriginalMember(owner = "client!na", name = "h", descriptor = "(I)Lclient!rb;")
	public abstract Class1_Sub8 method4918();
}
