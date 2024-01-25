import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public abstract class Class25 {

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V")
	protected Class25() {
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)Z")
	public final boolean method4777() {
		return this.method4779() || this.method4784() || this.method4780();
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)Z")
	public abstract boolean method4779();

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)Z")
	protected abstract boolean method4780();

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)V")
	public abstract void method4781();

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "(I)Lclient!lp;")
	public abstract Class1_Sub16 method4782();

	@OriginalMember(owner = "client!nq", name = "e", descriptor = "(I)I")
	public abstract int method4783();

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)Z")
	protected abstract boolean method4784();

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(Z)V")
	public abstract void method4787();

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "(I)I")
	public abstract int method4788();
}
