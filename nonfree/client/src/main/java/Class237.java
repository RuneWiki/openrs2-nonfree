import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public abstract class Class237 {

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "()V")
	protected Class237() {
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(II)Z")
	public abstract boolean method5292(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Z)Lclient!vc;")
	public abstract Interface21 method5297();

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "(Z)V")
	public abstract void method5298();

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(B)V")
	public abstract void method5299();
}
