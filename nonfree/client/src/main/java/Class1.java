import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public abstract class Class1 {

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
	protected Class1() {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)I")
	public abstract int method698();

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)Z")
	public final boolean method699() {
		return this.method700() || this.method709() || this.method705();
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)Z")
	public abstract boolean method700();

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)I")
	public abstract int method702();

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(I)Lclient!lo;")
	public abstract Class2_Sub15 method704();

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)Z")
	protected abstract boolean method705();

	@OriginalMember(owner = "client!a", name = "f", descriptor = "(I)V")
	public abstract void method706();

	@OriginalMember(owner = "client!a", name = "h", descriptor = "(I)Z")
	protected abstract boolean method709();

	@OriginalMember(owner = "client!a", name = "i", descriptor = "(I)V")
	public abstract void method711();
}
