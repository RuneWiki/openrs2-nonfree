import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public abstract class Class126 {

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "()V")
	protected Class126() {
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Z)Z")
	protected abstract boolean method5355();

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
	public abstract void method5357();

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)Z")
	public abstract boolean method5358();

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "(I)V")
	public abstract void method5361();

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "(I)Z")
	public final boolean method5362() {
		return this.method5358() || this.method5355() || this.method5363();
	}

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "(I)Z")
	protected abstract boolean method5363();

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(B)I")
	public abstract int method5364();

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "(B)Lclient!ic;")
	public abstract Class2_Sub11 method5365();

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "(I)I")
	public abstract int method5366();
}
