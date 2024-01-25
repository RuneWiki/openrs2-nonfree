import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public abstract class Class256 {

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
	protected Class256() {
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)Lclient!ll;")
	public abstract Class1_Sub13 method7554();

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)Z")
	protected abstract boolean method7555();

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
	public abstract void method7556();

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)Z")
	public final boolean method7557() {
		return this.method7562() || this.method7559() || this.method7555();
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)I")
	public abstract int method7558();

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)Z")
	protected abstract boolean method7559();

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(B)I")
	public abstract int method7561();

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "(B)Z")
	public abstract boolean method7562();

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "(I)V")
	public abstract void method7563();
}
