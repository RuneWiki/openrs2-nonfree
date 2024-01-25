import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public abstract class Class161 {

	@OriginalMember(owner = "client!sw", name = "<init>", descriptor = "()V")
	protected Class161() {
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Z)I")
	public abstract int method5898();

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)Z")
	protected abstract boolean method5900();

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "(B)Z")
	protected abstract boolean method5901();

	@OriginalMember(owner = "client!sw", name = "c", descriptor = "(B)V")
	public abstract void method5902();

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "(I)I")
	public abstract int method5903();

	@OriginalMember(owner = "client!sw", name = "d", descriptor = "(B)Z")
	public final boolean method5904() {
		return this.method5905() || this.method5900() || this.method5901();
	}

	@OriginalMember(owner = "client!sw", name = "e", descriptor = "(B)Z")
	public abstract boolean method5905();

	@OriginalMember(owner = "client!sw", name = "c", descriptor = "(I)Lclient!gn;")
	public abstract Class4_Sub15 method5906();

	@OriginalMember(owner = "client!sw", name = "f", descriptor = "(B)V")
	public abstract void method5907();
}
