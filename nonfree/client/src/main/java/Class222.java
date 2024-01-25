import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public abstract class Class222 {

	@OriginalMember(owner = "client!sia", name = "<init>", descriptor = "()V")
	protected Class222() {
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(IB)[B")
	public abstract byte[] method5283(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(II)I")
	public abstract int method5284(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!sia", name = "b", descriptor = "(B)Lclient!oga;")
	public abstract Class254 method5285();

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(BI)V")
	public abstract void method5287(@OriginalArg(1) int arg0);
}
