import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public abstract class Class16 {

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
	protected Class16() {
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)Z")
	protected abstract boolean method5882();

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)Z")
	public abstract boolean method5883();

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)Z")
	protected abstract boolean method5884();

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)I")
	public abstract int method5885();

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V")
	public abstract void method5886();

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)I")
	public abstract int method5887();

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(B)Z")
	public final boolean method5888() {
		return this.method5883() || this.method5882() || this.method5884();
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)V")
	public abstract void method5889();

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)Lclient!qq;")
	public abstract Class3_Sub43 method5891();
}
