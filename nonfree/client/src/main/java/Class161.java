import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public abstract class Class161 {

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "()V")
	protected Class161() {
	}

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "(I)Z")
	protected abstract boolean method8572();

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)I")
	public abstract int method8573();

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V")
	public abstract void method8574();

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)V")
	public abstract void method8575();

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Z)Z")
	public final boolean method8577() {
		return this.method8579() || this.method8572() || this.method8582();
	}

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "(B)Lclient!td;")
	public abstract Class3_Sub14 method8578();

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(B)Z")
	public abstract boolean method8579();

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "(I)I")
	public abstract int method8581();

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "(I)Z")
	protected abstract boolean method8582();
}
