import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public abstract class Class164 {

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V")
	protected Class164() {
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)Z")
	protected abstract boolean method4996();

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)Z")
	public final boolean method4998() {
		return this.method5002() || this.method4996() || this.method5004();
	}

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "(I)I")
	public abstract int method4999();

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)I")
	public abstract int method5000();

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "(I)V")
	public abstract void method5001();

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(Z)Z")
	public abstract boolean method5002();

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V")
	public abstract void method5003();

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)Z")
	protected abstract boolean method5004();

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)Lclient!va;")
	public abstract Class5_Sub10 method5005();
}
