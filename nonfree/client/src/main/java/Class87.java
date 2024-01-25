import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public abstract class Class87 {

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
	protected Class87() {
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(B)Z")
	protected abstract boolean method1908();

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)I")
	public abstract int method1909();

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(B)V")
	public abstract void method1910();

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(I)Lclient!vb;")
	public abstract Class1_Sub25 method1911();

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(B)Z")
	public final boolean method1913() {
		return this.method1916() || this.method1918() || this.method1908();
	}

	@OriginalMember(owner = "client!go", name = "d", descriptor = "(I)V")
	public abstract void method1914();

	@OriginalMember(owner = "client!go", name = "d", descriptor = "(B)Z")
	public abstract boolean method1916();

	@OriginalMember(owner = "client!go", name = "e", descriptor = "(B)Z")
	protected abstract boolean method1918();

	@OriginalMember(owner = "client!go", name = "f", descriptor = "(I)I")
	public abstract int method1919();
}
