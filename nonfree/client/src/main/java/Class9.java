import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public abstract class Class9 {

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
	protected Class9() {
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)Z")
	protected abstract boolean method794();

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
	public abstract void method795();

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)Z")
	protected abstract boolean method796();

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
	public abstract void method798();

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(I)Z")
	public final boolean method799() {
		return this.method801() || this.method794() || this.method796();
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(B)I")
	public abstract int method800();

	@OriginalMember(owner = "client!g", name = "e", descriptor = "(I)Z")
	public abstract boolean method801();

	@OriginalMember(owner = "client!g", name = "f", descriptor = "(I)Lclient!bu;")
	public abstract Class2_Sub9 method802();

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)I")
	public abstract int method803();
}
