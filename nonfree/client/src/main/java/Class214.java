import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public abstract class Class214 {

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V")
	protected Class214() {
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)Z")
	protected abstract boolean method6765();

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)I")
	public abstract int method6766();

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(I)V")
	public abstract void method6767();

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(B)V")
	public abstract void method6768();

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Z)Z")
	protected abstract boolean method6769();

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "(B)I")
	public abstract int method6770();

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "(I)Z")
	public final boolean method6771() {
		return this.method6774() || this.method6765() || this.method6769();
	}

	@OriginalMember(owner = "client!nu", name = "e", descriptor = "(I)Lclient!sda;")
	public abstract Class5_Sub42 method6773();

	@OriginalMember(owner = "client!nu", name = "f", descriptor = "(I)Z")
	public abstract boolean method6774();
}
