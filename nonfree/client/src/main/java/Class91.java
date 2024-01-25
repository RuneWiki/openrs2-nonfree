import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public abstract class Class91 {

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
	protected Class91() {
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
	public abstract void method6218();

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V")
	public abstract void method6219();

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)Lclient!db;")
	public abstract Interface8 method6221();

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)Z")
	public abstract boolean method6224(@OriginalArg(0) int arg0);
}
