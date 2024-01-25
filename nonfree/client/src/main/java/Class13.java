import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public abstract class Class13 {

	@OriginalMember(owner = "client!qha", name = "<init>", descriptor = "()V")
	protected Class13() {
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(B)V")
	public abstract void method6344();

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(I)Z")
	public final boolean method6346() {
		return this.method6352() || this.method6351() || this.method6349();
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(I)I")
	public abstract int method6347();

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(B)Lclient!qg;")
	public abstract Class5_Sub33 method6348();

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Z)Z")
	protected abstract boolean method6349();

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(Z)Z")
	protected abstract boolean method6351();

	@OriginalMember(owner = "client!qha", name = "c", descriptor = "(B)Z")
	public abstract boolean method6352();

	@OriginalMember(owner = "client!qha", name = "d", descriptor = "(I)V")
	public abstract void method6353();

	@OriginalMember(owner = "client!qha", name = "d", descriptor = "(B)I")
	public abstract int method6355();
}
