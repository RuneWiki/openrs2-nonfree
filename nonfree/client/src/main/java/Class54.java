import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public abstract class Class54 {

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
	protected Class54() {
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)Lclient!hl;")
	public abstract Class3_Sub19 method4063();

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)Z")
	protected abstract boolean method4064();

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)V")
	public abstract void method4065();

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)Z")
	protected abstract boolean method4068();

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)Z")
	public abstract boolean method4070();

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(B)I")
	public abstract int method4071();

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "(I)V")
	public abstract void method4072();

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "(I)I")
	public abstract int method4074();

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(B)Z")
	public final boolean method4075() {
		return this.method4070() || this.method4068() || this.method4064();
	}
}
