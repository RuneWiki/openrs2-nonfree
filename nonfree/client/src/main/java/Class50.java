import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public abstract class Class50 {

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
	protected Class50() {
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)Lclient!hca;")
	public abstract Class4_Sub22 method7099();

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)I")
	public abstract int method7100();

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)Z")
	public final boolean method7101() {
		return this.method7107() || this.method7104() || this.method7106();
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)I")
	public abstract int method7102();

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
	public abstract void method7103();

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)Z")
	protected abstract boolean method7104();

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)V")
	public abstract void method7105();

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(B)Z")
	protected abstract boolean method7106();

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(Z)Z")
	public abstract boolean method7107();
}
