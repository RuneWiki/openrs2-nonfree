import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class Class224 {

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
	protected Class224() {
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)I")
	public abstract int method5613();

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
	public abstract void method5614();

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)I")
	public abstract int method5615();

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)Z")
	public final boolean method5616() {
		return this.method5620() || this.method5622() || this.method5618();
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(I)Lclient!ke;")
	public abstract Class1_Sub22 method5617();

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(B)Z")
	protected abstract boolean method5618();

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(I)V")
	public abstract void method5619();

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(I)Z")
	public abstract boolean method5620();

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(B)Z")
	protected abstract boolean method5622();
}
