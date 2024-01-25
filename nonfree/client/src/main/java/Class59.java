import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public abstract class Class59 {

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "()V")
	protected Class59() {
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)Z")
	public final boolean method4100() {
		return this.method4110() || this.method4108() || this.method4102();
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(B)V")
	public abstract void method4101();

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)Z")
	protected abstract boolean method4102();

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "(B)V")
	public abstract void method4103();

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Z)Lclient!uk;")
	public abstract Class3_Sub30 method4104();

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "(B)I")
	public abstract int method4106();

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "(I)I")
	public abstract int method4107();

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "(I)Z")
	protected abstract boolean method4108();

	@OriginalMember(owner = "client!sv", name = "e", descriptor = "(B)Z")
	public abstract boolean method4110();
}
