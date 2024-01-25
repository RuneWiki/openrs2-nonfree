import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public abstract class Class13 {

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V")
	protected Class13() {
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(B)Z")
	public abstract boolean method4115();

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)I")
	public abstract int method4116();

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(I)Z")
	public final boolean method4117() {
		return this.method4115() || this.method4124() || this.method4122();
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(B)V")
	public abstract void method4118();

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(B)V")
	public abstract void method4120();

	@OriginalMember(owner = "client!an", name = "d", descriptor = "(B)Lclient!qj;")
	public abstract Class10_Sub16 method4121();

	@OriginalMember(owner = "client!an", name = "e", descriptor = "(B)Z")
	protected abstract boolean method4122();

	@OriginalMember(owner = "client!an", name = "d", descriptor = "(I)I")
	public abstract int method4123();

	@OriginalMember(owner = "client!an", name = "f", descriptor = "(B)Z")
	protected abstract boolean method4124();
}
