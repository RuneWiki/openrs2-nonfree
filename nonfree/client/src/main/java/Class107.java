import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public abstract class Class107 {

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
	protected Class107() {
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)Z")
	protected abstract boolean method4070();

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(B)Z")
	public final boolean method4071() {
		return this.method4075() || this.method4070() || this.method4074();
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)I")
	public abstract int method4072();

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)Lclient!bk;")
	public abstract Class5_Sub6 method4073();

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "(I)Z")
	protected abstract boolean method4074();

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "(I)Z")
	public abstract boolean method4075();

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "(I)V")
	public abstract void method4076();

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "(B)V")
	public abstract void method4077();

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)I")
	public abstract int method4079();
}
