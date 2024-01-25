import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bka")
public abstract class Class42 {

	@OriginalMember(owner = "client!bka", name = "<init>", descriptor = "()V")
	protected Class42() {
	}

	@OriginalMember(owner = "client!bka", name = "d", descriptor = "(I)Z")
	protected abstract boolean method6009();

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(I)Lclient!vha;")
	public abstract Class6_Sub9 method6011();

	@OriginalMember(owner = "client!bka", name = "c", descriptor = "(B)V")
	public abstract void method6012();

	@OriginalMember(owner = "client!bka", name = "b", descriptor = "(I)I")
	public abstract int method6014();

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(Z)Z")
	public abstract boolean method6016();

	@OriginalMember(owner = "client!bka", name = "f", descriptor = "(I)Z")
	protected abstract boolean method6017();

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(B)I")
	public abstract int method6019();

	@OriginalMember(owner = "client!bka", name = "c", descriptor = "(I)Z")
	public final boolean method6020() {
		return this.method6016() || this.method6009() || this.method6017();
	}

	@OriginalMember(owner = "client!bka", name = "b", descriptor = "(B)V")
	public abstract void method6021();
}
