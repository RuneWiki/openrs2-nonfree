import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public abstract class Class25 {

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
	protected Class25() {
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)Lclient!ol;")
	public abstract Class50 method394();

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	public abstract void method395();

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZI)Z")
	public abstract boolean method398(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V")
	public abstract void method399();
}
