import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public abstract class Class49 {

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V")
	protected Class49() {
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
	public abstract void method2424();

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)Lclient!q;")
	public abstract Class3_Sub21 method2425();

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)I")
	public abstract int method2426();

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(B)V")
	public abstract void method2427();

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)Z")
	protected abstract boolean method2428();

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "(I)I")
	public abstract int method2429();

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "(I)Z")
	public final boolean method2430() {
		return this.method2433() || this.method2432() || this.method2428();
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(Z)Z")
	protected abstract boolean method2432();

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "(Z)Z")
	public abstract boolean method2433();
}
