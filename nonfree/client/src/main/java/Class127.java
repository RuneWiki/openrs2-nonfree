import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public abstract class Class127 {

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "()V")
	protected Class127() {
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V")
	public abstract void method3585();

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(I)V")
	public abstract void method3587();

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "(I)I")
	public abstract int method3588();

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "(I)Z")
	public abstract boolean method3589();

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "(I)Lclient!mh;")
	public abstract Class4_Sub28 method3591();

	@OriginalMember(owner = "client!uq", name = "g", descriptor = "(I)Z")
	public final boolean method3592() {
		return this.method3589() || this.method3594() || this.method3598();
	}

	@OriginalMember(owner = "client!uq", name = "h", descriptor = "(I)Z")
	protected abstract boolean method3594();

	@OriginalMember(owner = "client!uq", name = "i", descriptor = "(I)I")
	public abstract int method3595();

	@OriginalMember(owner = "client!uq", name = "j", descriptor = "(I)Z")
	protected abstract boolean method3598();
}
