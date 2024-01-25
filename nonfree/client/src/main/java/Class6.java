import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public abstract class Class6 {

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
	protected Class6() {
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)Z")
	protected abstract boolean method3747();

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
	public abstract void method3751();

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)Z")
	public abstract boolean method3752();

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)Z")
	protected abstract boolean method3753();

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)I")
	public abstract int method3754();

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(B)V")
	public abstract void method3755();

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(B)Z")
	public final boolean method3756() {
		return this.method3752() || this.method3753() || this.method3747();
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)I")
	public abstract int method3757();

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "(B)Lclient!bh;")
	public abstract Class12_Sub3 method3758();
}
