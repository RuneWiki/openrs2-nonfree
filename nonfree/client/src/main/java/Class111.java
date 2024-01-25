import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public abstract class Class111 {

	@OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "()V")
	protected Class111() {
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(I)V")
	public abstract void method8694();

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "(I)Z")
	protected abstract boolean method8695();

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(B)I")
	public abstract int method8696();

	@OriginalMember(owner = "client!sfa", name = "c", descriptor = "(I)Z")
	public final boolean method8697() {
		return this.method8700() || this.method8695() || this.method8701();
	}

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "(B)V")
	public abstract void method8698();

	@OriginalMember(owner = "client!sfa", name = "e", descriptor = "(I)Z")
	public abstract boolean method8700();

	@OriginalMember(owner = "client!sfa", name = "f", descriptor = "(I)Z")
	protected abstract boolean method8701();

	@OriginalMember(owner = "client!sfa", name = "g", descriptor = "(I)Lclient!ik;")
	public abstract Class5_Sub25 method8702();

	@OriginalMember(owner = "client!sfa", name = "c", descriptor = "(B)I")
	public abstract int method8703();
}
