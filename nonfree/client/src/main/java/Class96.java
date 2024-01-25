import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public abstract class Class96 {

	@OriginalMember(owner = "client!sga", name = "<init>", descriptor = "()V")
	protected Class96() {
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(B)Z")
	public final boolean method8017() {
		return this.method8018() || this.method8022() || this.method8024();
	}

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "(B)Z")
	public abstract boolean method8018();

	@OriginalMember(owner = "client!sga", name = "c", descriptor = "(B)I")
	public abstract int method8019();

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)Lclient!hfa;")
	public abstract Class6_Sub22 method8020();

	@OriginalMember(owner = "client!sga", name = "d", descriptor = "(B)Z")
	protected abstract boolean method8022();

	@OriginalMember(owner = "client!sga", name = "c", descriptor = "(I)Z")
	protected abstract boolean method8024();

	@OriginalMember(owner = "client!sga", name = "d", descriptor = "(I)I")
	public abstract int method8026();

	@OriginalMember(owner = "client!sga", name = "e", descriptor = "(I)V")
	public abstract void method8027();

	@OriginalMember(owner = "client!sga", name = "e", descriptor = "(B)V")
	public abstract void method8028();
}
