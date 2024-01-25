import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public abstract class Class149 {

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
	protected Class149() {
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)I")
	public abstract int method5875();

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(I)Z")
	protected abstract boolean method5876();

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(B)Z")
	public final boolean method5877() {
		return this.method5884() || this.method5876() || this.method5881();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)Lclient!ew;")
	public abstract Class2_Sub16 method5878();

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(I)I")
	public abstract int method5879();

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V")
	public abstract void method5880();

	@OriginalMember(owner = "client!of", name = "e", descriptor = "(I)Z")
	protected abstract boolean method5881();

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(Z)V")
	public abstract void method5883();

	@OriginalMember(owner = "client!of", name = "f", descriptor = "(I)Z")
	public abstract boolean method5884();
}
