import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public abstract class Class40 {

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	protected Class40() {
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Z")
	protected abstract boolean method4494();

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
	public abstract void method4495();

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)Z")
	public abstract boolean method4496();

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)Lclient!lga;")
	public abstract Class2_Sub32 method4497();

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
	public abstract void method4498();

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)I")
	public abstract int method4499();

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)Z")
	public final boolean method4500() {
		return this.method4496() || this.method4503() || this.method4494();
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)Z")
	protected abstract boolean method4503();

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)I")
	public abstract int method4504();
}
