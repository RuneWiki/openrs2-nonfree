import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public abstract class Class35 {

	@OriginalMember(owner = "client!eda", name = "<init>", descriptor = "()V")
	protected Class35() {
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)I")
	public abstract int method5761();

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Z)Z")
	protected abstract boolean method5762();

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "(B)V")
	public abstract void method5763();

	@OriginalMember(owner = "client!eda", name = "c", descriptor = "(B)I")
	public abstract int method5764();

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "(Z)Lclient!u;")
	public abstract Class8_Sub33 method5765();

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "(I)Z")
	public final boolean method5767() {
		return this.method5769() || this.method5768() || this.method5762();
	}

	@OriginalMember(owner = "client!eda", name = "c", descriptor = "(Z)Z")
	protected abstract boolean method5768();

	@OriginalMember(owner = "client!eda", name = "d", descriptor = "(B)Z")
	public abstract boolean method5769();

	@OriginalMember(owner = "client!eda", name = "c", descriptor = "(I)V")
	public abstract void method5771();
}
