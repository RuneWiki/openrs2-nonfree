import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public abstract class Class4 {

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "()V")
	protected Class4() {
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Z)Lclient!ve;")
	public abstract Class6_Sub39 method1208();

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "(Z)Z")
	public final boolean method1209() {
		return this.method1212() || this.method1214() || this.method1210();
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)Z")
	protected abstract boolean method1210();

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)V")
	public abstract void method1211();

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "(I)Z")
	public abstract boolean method1212();

	@OriginalMember(owner = "client!mca", name = "c", descriptor = "(Z)Z")
	protected abstract boolean method1214();

	@OriginalMember(owner = "client!mca", name = "c", descriptor = "(I)I")
	public abstract int method1215();

	@OriginalMember(owner = "client!mca", name = "d", descriptor = "(I)I")
	public abstract int method1216();

	@OriginalMember(owner = "client!mca", name = "c", descriptor = "(B)V")
	public abstract void method1217();
}
