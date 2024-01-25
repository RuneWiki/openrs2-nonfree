import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public abstract class Class50 {

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
	protected Class50() {
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B)I")
	public abstract int method1860();

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V")
	public abstract void method1862();

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)Z")
	protected abstract boolean method1863();

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)Z")
	public abstract boolean method1864();

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(I)Z")
	protected abstract boolean method1865();

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(B)Lclient!kn;")
	public abstract Class7_Sub12 method1867();

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(I)Z")
	public final boolean method1868() {
		return this.method1864() || this.method1865() || this.method1863();
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
	public abstract void method1869();

	@OriginalMember(owner = "client!de", name = "e", descriptor = "(I)I")
	public abstract int method1870();
}
