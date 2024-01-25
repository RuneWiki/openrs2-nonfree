import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public abstract class Class48 {

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
	protected Class48() {
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V")
	public abstract void method7510();

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(B)I")
	public abstract int method7511();

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)I")
	public abstract int method7512();

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)Lclient!taa;")
	public abstract Class3_Sub6 method7513();

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(B)Z")
	public abstract boolean method7514();

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)Z")
	public final boolean method7515() {
		return this.method7514() || this.method7516() || this.method7518();
	}

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "(I)Z")
	protected abstract boolean method7516();

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "(I)Z")
	protected abstract boolean method7518();

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "(I)V")
	public abstract void method7519();
}
