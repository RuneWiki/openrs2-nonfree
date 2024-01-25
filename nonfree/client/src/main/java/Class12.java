import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public abstract class Class12 {

	static {
		new Class242("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V")
	protected Class12() {
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
	public abstract void method4209();

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)Z")
	public abstract boolean method4210();

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(B)Z")
	protected abstract boolean method4211();

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(I)V")
	public abstract void method4212();

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(I)Z")
	protected abstract boolean method4214();

	@OriginalMember(owner = "client!an", name = "d", descriptor = "(I)Lclient!uj;")
	public abstract Class4_Sub10 method4216();

	@OriginalMember(owner = "client!an", name = "e", descriptor = "(I)Z")
	public final boolean method4218() {
		return this.method4210() || this.method4211() || this.method4214();
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(Z)I")
	public abstract int method4219();

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(Z)I")
	public abstract int method4220();
}
