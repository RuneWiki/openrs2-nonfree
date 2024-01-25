import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public abstract class Class238 {

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "()V")
	protected Class238() {
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)V")
	public abstract void method5651();

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(I)Z")
	public abstract boolean method5652();

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(B)I")
	public abstract int method5653();

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(B)Lclient!bs;")
	public abstract Class1_Sub12 method5654();

	@OriginalMember(owner = "client!oca", name = "d", descriptor = "(B)V")
	public abstract void method5656();

	@OriginalMember(owner = "client!oca", name = "e", descriptor = "(B)Z")
	protected abstract boolean method5658();

	@OriginalMember(owner = "client!oca", name = "d", descriptor = "(I)I")
	public abstract int method5661();

	@OriginalMember(owner = "client!oca", name = "e", descriptor = "(I)Z")
	public final boolean method5662() {
		return this.method5652() || this.method5663() || this.method5658();
	}

	@OriginalMember(owner = "client!oca", name = "f", descriptor = "(I)Z")
	protected abstract boolean method5663();
}
