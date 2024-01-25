import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public abstract class Class203 {

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V")
	protected Class203() {
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)Z")
	public abstract boolean method4915();

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
	public abstract void method4917();

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)I")
	public abstract int method4918();

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)Z")
	protected abstract boolean method4920();

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)Z")
	protected abstract boolean method4921();

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)Lclient!dw;")
	public abstract Class2_Sub14 method4922();

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(B)Z")
	public final boolean method4923() {
		return this.method4915() || this.method4920() || this.method4921();
	}

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "(I)V")
	public abstract void method4924();

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "(B)I")
	public abstract int method4925();
}
