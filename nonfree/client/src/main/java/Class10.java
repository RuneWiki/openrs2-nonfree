import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public abstract class Class10 {

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
	protected Class10() {
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)Z")
	protected abstract boolean method5235();

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)Lclient!ph;")
	public abstract Class3_Sub33 method5236();

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)Z")
	public final boolean method5238() {
		return this.method5243() || this.method5244() || this.method5235();
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V")
	public abstract void method5239();

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)I")
	public abstract int method5240();

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "(I)V")
	public abstract void method5241();

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "(I)I")
	public abstract int method5242();

	@OriginalMember(owner = "client!ak", name = "g", descriptor = "(I)Z")
	public abstract boolean method5243();

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)Z")
	protected abstract boolean method5244();
}
