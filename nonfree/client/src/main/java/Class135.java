import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public abstract class Class135 {

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "()V")
	protected Class135() {
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Z)V")
	public abstract void method6369();

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)I")
	public abstract int method6370();

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(B)Z")
	public abstract boolean method6371();

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "(B)Z")
	public final boolean method6372() {
		return this.method6371() || this.method6377() || this.method6375();
	}

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "(I)V")
	public abstract void method6373();

	@OriginalMember(owner = "client!hea", name = "c", descriptor = "(I)Lclient!ek;")
	public abstract Class4_Sub15 method6374();

	@OriginalMember(owner = "client!hea", name = "d", descriptor = "(I)Z")
	protected abstract boolean method6375();

	@OriginalMember(owner = "client!hea", name = "e", descriptor = "(I)Z")
	protected abstract boolean method6377();

	@OriginalMember(owner = "client!hea", name = "f", descriptor = "(I)I")
	public abstract int method6378();
}
