import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public abstract class Class116 {

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "()V")
	protected Class116() {
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)Z")
	protected abstract boolean method8244();

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(I)V")
	public abstract void method8246();

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(B)Z")
	public abstract boolean method8247();

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "(B)Z")
	public final boolean method8248() {
		return this.method8247() || this.method8252() || this.method8244();
	}

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "(I)I")
	public abstract int method8249();

	@OriginalMember(owner = "client!gda", name = "d", descriptor = "(I)I")
	public abstract int method8250();

	@OriginalMember(owner = "client!gda", name = "e", descriptor = "(I)Z")
	protected abstract boolean method8252();

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Z)V")
	public abstract void method8253();

	@OriginalMember(owner = "client!gda", name = "f", descriptor = "(I)Lclient!pc;")
	public abstract Class3_Sub21 method8254();
}
