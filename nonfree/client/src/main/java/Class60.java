import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public abstract class Class60 {

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "()V")
	protected Class60() {
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(II)Z")
	public abstract boolean method1863(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I)Lclient!sc;")
	public abstract Class159 method1865();

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)V")
	public abstract void method1868();

	@OriginalMember(owner = "client!on", name = "d", descriptor = "(I)V")
	public abstract void method1870();
}
