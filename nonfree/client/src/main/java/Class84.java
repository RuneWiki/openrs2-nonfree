import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public abstract class Class84 {

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
	protected Class84() {
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)I")
	public abstract int method5406();

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)I")
	public abstract int method5408();

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)Z")
	public final boolean method5410() {
		return this.method5413() || this.method5412() || this.method5420();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)Z")
	protected abstract boolean method5412();

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)Z")
	public abstract boolean method5413();

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V")
	public abstract void method5415();

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)V")
	public abstract void method5418();

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "(I)Lclient!qn;")
	public abstract Class1_Sub21 method5419();

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "(I)Z")
	protected abstract boolean method5420();
}
