import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public abstract class Class3 {

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
	protected Class3() {
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public abstract void method8871();

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Z")
	protected abstract boolean method8872();

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)Z")
	protected abstract boolean method8873();

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)Z")
	public abstract boolean method8874();

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)I")
	public abstract int method8875();

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(B)Lclient!ck;")
	public abstract Class5_Sub13 method8876();

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(B)Z")
	public final boolean method8878() {
		return this.method8874() || this.method8873() || this.method8872();
	}

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "(B)I")
	public abstract int method8879();

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "(B)V")
	public abstract void method8880();
}
