import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public abstract class Class19 {

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V")
	protected Class19() {
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V")
	public abstract void method2351();

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)Z")
	public abstract boolean method2352(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
	public abstract void method2355();

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)Lclient!pfa;")
	public abstract Interface22 method2357();
}
