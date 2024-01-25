import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public abstract class Class114 {

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
	protected Class114() {
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)I")
	public abstract int method2698();

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)Lclient!bh;")
	public abstract Class1_Sub7 method2700();

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(Z)I")
	public abstract int method2701();

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(Z)Z")
	protected abstract boolean method2703();

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)V")
	public abstract void method2704();

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)Z")
	public abstract boolean method2705();

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)V")
	public abstract void method2706();

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)Z")
	public final boolean method2707() {
		return this.method2705() || this.method2708() || this.method2703();
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(B)Z")
	protected abstract boolean method2708();
}
