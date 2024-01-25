import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public abstract class Class177 {

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "()V")
	protected Class177() {
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)V")
	public abstract void method4000();

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(BI)Z")
	public abstract boolean method4001(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "(B)V")
	public abstract void method4004();

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "(B)Lclient!au;")
	public abstract Interface2 method4006();
}
