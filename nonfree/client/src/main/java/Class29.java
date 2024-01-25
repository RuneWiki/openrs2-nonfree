import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public abstract class Class29 {

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "()V")
	protected Class29() {
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
	public abstract void method2938();

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)Z")
	protected abstract boolean method2939();

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(B)Z")
	public abstract boolean method2941();

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)I")
	public abstract int method2942();

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)Z")
	public final boolean method2944() {
		return this.method2941() || this.method2939() || this.method2947();
	}

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "(B)I")
	public abstract int method2946();

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "(I)Z")
	protected abstract boolean method2947();

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "(I)Lclient!qea;")
	public abstract Class6_Sub41 method2948();

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "(B)V")
	public abstract void method2949();
}
