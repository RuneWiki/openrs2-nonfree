import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public abstract class Class78 {

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "()V")
	protected Class78() {
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)I")
	public abstract int method1804();

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)Z")
	public final boolean method1805() {
		return this.method1806() || this.method1809() || this.method1811();
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)Z")
	public abstract boolean method1806();

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)V")
	public abstract void method1807();

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "(I)I")
	public abstract int method1808();

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "(I)Z")
	protected abstract boolean method1809();

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "(B)Z")
	protected abstract boolean method1811();

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "(I)Lclient!wc;")
	public abstract Class2_Sub10 method1812();

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "(B)V")
	public abstract void method1814();
}
