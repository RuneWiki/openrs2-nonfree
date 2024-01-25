import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public abstract class Class71 {

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "()V")
	protected Class71() {
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)I")
	public abstract int method1618();

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)Z")
	public final boolean method1619() {
		return this.method1628() || this.method1629() || this.method1626();
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)V")
	public abstract void method1620();

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)Lclient!ei;")
	public abstract Class6_Sub7 method1621();

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(B)V")
	public abstract void method1622();

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "(I)I")
	public abstract int method1624();

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "(B)Z")
	protected abstract boolean method1626();

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "(B)Z")
	public abstract boolean method1628();

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "(I)Z")
	protected abstract boolean method1629();
}
