import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public abstract class Class11 {

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
	protected Class11() {
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	public abstract void method6138();

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)Z")
	protected abstract boolean method6139();

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)Z")
	public final boolean method6140() {
		return this.method6146() || this.method6139() || this.method6145();
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)I")
	public abstract int method6141();

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)Lclient!vt;")
	public abstract Class5_Sub7 method6142();

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)V")
	public abstract void method6143();

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)I")
	public abstract int method6144();

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)Z")
	protected abstract boolean method6145();

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)Z")
	public abstract boolean method6146();
}
