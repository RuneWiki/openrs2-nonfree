import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public abstract class Class50 {

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
	protected Class50() {
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)Z")
	protected abstract boolean method4988();

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)I")
	public abstract int method4989();

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
	public abstract void method4990();

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)Lclient!oq;")
	public abstract Class3_Sub5 method4991();

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)I")
	public abstract int method4993();

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)Z")
	public abstract boolean method4995();

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V")
	public abstract void method4996();

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)Z")
	public final boolean method4997() {
		return this.method4995() || this.method4988() || this.method5000();
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)Z")
	protected abstract boolean method5000();
}
