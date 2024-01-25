import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public abstract class Class138 {

	@OriginalMember(owner = "client!gia", name = "<init>", descriptor = "()V")
	protected Class138() {
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(I)Z")
	public final boolean method4764() {
		return this.method4769() || this.method4765() || this.method4766();
	}

	@OriginalMember(owner = "client!gia", name = "b", descriptor = "(I)Z")
	protected abstract boolean method4765();

	@OriginalMember(owner = "client!gia", name = "d", descriptor = "(I)Z")
	protected abstract boolean method4766();

	@OriginalMember(owner = "client!gia", name = "b", descriptor = "(B)I")
	public abstract int method4767();

	@OriginalMember(owner = "client!gia", name = "e", descriptor = "(I)V")
	public abstract void method4768();

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(B)Z")
	public abstract boolean method4769();

	@OriginalMember(owner = "client!gia", name = "g", descriptor = "(I)V")
	public abstract void method4770();

	@OriginalMember(owner = "client!gia", name = "c", descriptor = "(I)I")
	public abstract int method4771();

	@OriginalMember(owner = "client!gia", name = "f", descriptor = "(I)Lclient!em;")
	public abstract Class2_Sub18 method4772();
}
