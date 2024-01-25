import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public abstract class Class191 {

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
	protected Class191() {
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)I")
	public abstract int method5138();

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)I")
	public abstract int method5141();

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)Z")
	protected abstract boolean method5142();

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(Z)Z")
	public final boolean method5143() {
		return this.method5149() || this.method5147() || this.method5142();
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
	public abstract void method5144();

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)Lclient!qw;")
	public abstract Class1_Sub41 method5145();

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(B)V")
	public abstract void method5146();

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)Z")
	protected abstract boolean method5147();

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "(B)Z")
	public abstract boolean method5149();
}
