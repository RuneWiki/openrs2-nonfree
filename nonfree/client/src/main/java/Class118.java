import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public abstract class Class118 {

	@OriginalMember(owner = "client!sga", name = "<init>", descriptor = "()V")
	protected Class118() {
	}

	@OriginalMember(owner = "client!sga", name = "c", descriptor = "(B)I")
	public abstract int method7586();

	@OriginalMember(owner = "client!sga", name = "c", descriptor = "(I)Z")
	public abstract boolean method7587();

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "(Z)Z")
	protected abstract boolean method7589();

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "(I)I")
	public abstract int method7590();

	@OriginalMember(owner = "client!sga", name = "d", descriptor = "(I)Z")
	protected abstract boolean method7591();

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "(B)V")
	public abstract void method7592();

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Z)Z")
	public final boolean method7593() {
		return this.method7587() || this.method7589() || this.method7591();
	}

	@OriginalMember(owner = "client!sga", name = "c", descriptor = "(Z)Lclient!mo;")
	public abstract Class14_Sub29 method7594();

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)V")
	public abstract void method7595();
}
