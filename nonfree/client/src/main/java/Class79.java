import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public abstract class Class79 {

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "()V")
	protected Class79() {
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)Z")
	public abstract boolean method3351();

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)Z")
	protected abstract boolean method3352();

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)Lclient!rm;")
	public abstract Class14_Sub30 method3353();

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)Z")
	protected abstract boolean method3354();

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)V")
	public abstract void method3355();

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)V")
	public abstract void method3356();

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "(B)I")
	public abstract int method3358();

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "(I)Z")
	public final boolean method3360() {
		return this.method3351() || this.method3352() || this.method3354();
	}

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "(I)I")
	public abstract int method3361();
}
