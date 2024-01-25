import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public abstract class Class48 {

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "()V")
	protected Class48() {
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I)I")
	public abstract int method1138();

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(I)Z")
	protected abstract boolean method1139();

	@OriginalMember(owner = "client!js", name = "c", descriptor = "(I)Z")
	protected abstract boolean method1140();

	@OriginalMember(owner = "client!js", name = "d", descriptor = "(I)Z")
	public abstract boolean method1141();

	@OriginalMember(owner = "client!js", name = "e", descriptor = "(I)I")
	public abstract int method1142();

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(B)V")
	public abstract void method1145();

	@OriginalMember(owner = "client!js", name = "f", descriptor = "(I)Lclient!ic;")
	public abstract Class4_Sub1 method1146();

	@OriginalMember(owner = "client!js", name = "g", descriptor = "(I)Z")
	public final boolean method1147() {
		return this.method1141() || this.method1139() || this.method1140();
	}

	@OriginalMember(owner = "client!js", name = "c", descriptor = "(B)V")
	public abstract void method1148();
}
