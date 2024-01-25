import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public abstract class Class86 {

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
	protected Class86() {
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
	public abstract void method7262();

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
	public abstract void method7264();

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)I")
	public abstract int method7265();

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)Z")
	protected abstract boolean method7266();

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)I")
	public abstract int method7267();

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "(I)Lclient!aaa;")
	public abstract Class3_Sub1 method7268();

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)Z")
	public abstract boolean method7269();

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "(I)Z")
	public final boolean method7271() {
		return this.method7269() || this.method7272() || this.method7266();
	}

	@OriginalMember(owner = "client!ek", name = "h", descriptor = "(I)Z")
	protected abstract boolean method7272();
}
