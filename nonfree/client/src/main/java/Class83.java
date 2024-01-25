import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public abstract class Class83 {

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "()V")
	protected Class83() {
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(I)Z")
	protected abstract boolean method6893();

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(B)V")
	public abstract void method6894();

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)I")
	public abstract int method6895();

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(I)I")
	public abstract int method6896();

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(B)Lclient!rl;")
	public abstract Class4_Sub24 method6897();

	@OriginalMember(owner = "client!du", name = "d", descriptor = "(I)Z")
	public final boolean method6900() {
		return this.method6901() || this.method6893() || this.method6903();
	}

	@OriginalMember(owner = "client!du", name = "c", descriptor = "(B)Z")
	public abstract boolean method6901();

	@OriginalMember(owner = "client!du", name = "e", descriptor = "(I)V")
	public abstract void method6902();

	@OriginalMember(owner = "client!du", name = "f", descriptor = "(I)Z")
	protected abstract boolean method6903();
}
