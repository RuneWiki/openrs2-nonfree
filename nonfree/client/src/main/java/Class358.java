import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public abstract class Class358 {

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "()V")
	protected Class358() {
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)I")
	public abstract int method8721();

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)I")
	public abstract int method8722();

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)Z")
	public abstract boolean method8723();

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)Lclient!cia;")
	public abstract Class2_Sub1 method8724();

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)Z")
	public final boolean method8726() {
		return this.method8723() || this.method8729() || this.method8730();
	}

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "(I)V")
	public abstract void method8727();

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "(I)V")
	public abstract void method8728();

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "(I)Z")
	protected abstract boolean method8729();

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "(B)Z")
	protected abstract boolean method8730();
}
