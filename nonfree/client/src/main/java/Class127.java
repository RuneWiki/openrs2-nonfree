import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public abstract class Class127 {

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "()V")
	protected Class127() {
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)Lclient!nr;")
	public abstract Interface16 method3271();

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(B)V")
	public abstract void method3273();

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(I)V")
	public abstract void method3275();

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IB)Z")
	public abstract boolean method3276(@OriginalArg(0) int arg0);
}
