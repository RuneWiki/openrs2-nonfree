import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public abstract class Class228 {

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "()V")
	protected Class228() {
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
	public abstract void method5475();

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(B)Z")
	protected abstract boolean method5476();

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(I)Z")
	protected abstract boolean method5477();

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(B)Z")
	public final boolean method5480() {
		return this.method5483() || this.method5476() || this.method5477();
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(B)Lclient!lq;")
	public abstract Class1_Sub27 method5482();

	@OriginalMember(owner = "client!to", name = "d", descriptor = "(I)Z")
	public abstract boolean method5483();

	@OriginalMember(owner = "client!to", name = "e", descriptor = "(I)V")
	public abstract void method5484();

	@OriginalMember(owner = "client!to", name = "f", descriptor = "(I)I")
	public abstract int method5485();

	@OriginalMember(owner = "client!to", name = "d", descriptor = "(B)I")
	public abstract int method5486();
}
