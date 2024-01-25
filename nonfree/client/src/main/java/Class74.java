import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public abstract class Class74 {

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
	protected Class74() {
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(B)Lclient!ab;")
	public abstract Class3_Sub1 method1864();

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(B)I")
	public abstract int method1865();

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	public abstract void method1866();

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(I)Z")
	protected abstract boolean method1867();

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(I)Z")
	protected abstract boolean method1868();

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(I)Z")
	public final boolean method1869() {
		return this.method1871() || this.method1867() || this.method1868();
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(B)I")
	public abstract int method1870();

	@OriginalMember(owner = "client!md", name = "e", descriptor = "(B)Z")
	public abstract boolean method1871();

	@OriginalMember(owner = "client!md", name = "f", descriptor = "(B)V")
	public abstract void method1872();
}
