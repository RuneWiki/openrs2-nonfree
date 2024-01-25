import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public abstract class Class66 {

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
	protected Class66() {
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)Lclient!bq;")
	public abstract Class5_Sub4 method5963();

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)Z")
	public final boolean method5964() {
		return this.method5970() || this.method5975() || this.method5969();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)I")
	public abstract int method5965();

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)Z")
	protected abstract boolean method5969();

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)Z")
	public abstract boolean method5970();

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V")
	public abstract void method5971();

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V")
	public abstract void method5973();

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)I")
	public abstract int method5974();

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "(I)Z")
	protected abstract boolean method5975();
}
