import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public abstract class Class131 {

	@OriginalMember(owner = "client!oea", name = "<init>", descriptor = "()V")
	protected Class131() {
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)Z")
	public final boolean method6538() {
		return this.method6539() || this.method6546() || this.method6548();
	}

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(I)Z")
	public abstract boolean method6539();

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(B)V")
	public abstract void method6541();

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(B)I")
	public abstract int method6542();

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Z)Lclient!ls;")
	public abstract Class2_Sub29 method6543();

	@OriginalMember(owner = "client!oea", name = "c", descriptor = "(I)I")
	public abstract int method6544();

	@OriginalMember(owner = "client!oea", name = "e", descriptor = "(I)Z")
	protected abstract boolean method6546();

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(Z)V")
	public abstract void method6547();

	@OriginalMember(owner = "client!oea", name = "c", descriptor = "(B)Z")
	protected abstract boolean method6548();
}
