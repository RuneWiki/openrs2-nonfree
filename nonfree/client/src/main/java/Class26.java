import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public abstract class Class26 {

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V")
	protected Class26() {
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)Z")
	protected abstract boolean method569();

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)V")
	public abstract void method570();

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
	public abstract void method571();

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)Z")
	public final boolean method572() {
		return this.method573() || this.method575() || this.method569();
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)Z")
	public abstract boolean method573();

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(B)I")
	public abstract int method574();

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)Z")
	protected abstract boolean method575();

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)I")
	public abstract int method576();

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "(I)Lclient!vq;")
	public abstract Class1_Sub29 method577();
}
