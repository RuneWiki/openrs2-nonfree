import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public abstract class Class214 {

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
	protected Class214() {
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)Z")
	protected abstract boolean method7237();

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(B)Z")
	public final boolean method7239() {
		return this.method7244() || this.method7249() || this.method7237();
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(B)I")
	public abstract int method7240();

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(I)I")
	public abstract int method7241();

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(B)Lclient!wi;")
	public abstract Class2_Sub26 method7242();

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(B)Z")
	public abstract boolean method7244();

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(I)V")
	public abstract void method7245();

	@OriginalMember(owner = "client!re", name = "g", descriptor = "(B)V")
	public abstract void method7247();

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(I)Z")
	protected abstract boolean method7249();
}
