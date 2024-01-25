import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public abstract class Class295 {

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "()V")
	protected Class295() {
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V")
	public abstract void method7715();

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "(B)V")
	public abstract void method7718();

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(ZI)Z")
	public abstract boolean method7719(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)Lclient!vr;")
	public abstract Interface22 method7720();
}
