import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public abstract class Class93 {

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "()V")
	protected Class93() {
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)Z")
	public abstract boolean method2462();

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)Z")
	public final boolean method2464() {
		return this.method2462() || this.method2472() || this.method2468();
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)I")
	public abstract int method2466();

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "(B)Lclient!hc;")
	public abstract Class2_Sub1 method2467();

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "(I)Z")
	protected abstract boolean method2468();

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "(B)I")
	public abstract int method2470();

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "(I)Z")
	protected abstract boolean method2472();

	@OriginalMember(owner = "client!vp", name = "f", descriptor = "(B)V")
	public abstract void method2473();

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(Z)V")
	public abstract void method2475();
}
