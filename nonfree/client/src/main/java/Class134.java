import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public abstract class Class134 {

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "()V")
	protected Class134() {
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I)Z")
	protected abstract boolean method6087();

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V")
	public abstract void method6090();

	@OriginalMember(owner = "client!js", name = "c", descriptor = "(I)V")
	public abstract void method6091();

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(B)I")
	public abstract int method6092();

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(B)I")
	public abstract int method6093();

	@OriginalMember(owner = "client!js", name = "d", descriptor = "(I)Z")
	public abstract boolean method6094();

	@OriginalMember(owner = "client!js", name = "e", descriptor = "(I)Lclient!bv;")
	public abstract Class6_Sub8 method6095();

	@OriginalMember(owner = "client!js", name = "f", descriptor = "(I)Z")
	protected abstract boolean method6096();

	@OriginalMember(owner = "client!js", name = "c", descriptor = "(B)Z")
	public final boolean method6097() {
		return this.method6094() || this.method6087() || this.method6096();
	}
}
