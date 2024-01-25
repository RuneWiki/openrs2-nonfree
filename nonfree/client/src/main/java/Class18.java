import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public abstract class Class18 {

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V")
	protected Class18() {
	}

	@OriginalMember(owner = "client!cp", name = "d", descriptor = "(I)Z")
	protected abstract boolean method4191();

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(B)I")
	public abstract int method4192();

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)Z")
	public final boolean method4194() {
		return this.method4200() || this.method4191() || this.method4201();
	}

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "(I)V")
	public abstract void method4195();

	@OriginalMember(owner = "client!cp", name = "f", descriptor = "(I)I")
	public abstract int method4196();

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "(I)V")
	public abstract void method4197();

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Z)Lclient!mn;")
	public abstract Class3_Sub23 method4198();

	@OriginalMember(owner = "client!cp", name = "g", descriptor = "(I)Z")
	public abstract boolean method4200();

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)Z")
	protected abstract boolean method4201();
}
