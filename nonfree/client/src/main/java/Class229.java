import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public abstract class Class229 {

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "()V")
	protected Class229() {
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IB)[B")
	public abstract byte[] method5278(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(BI)V")
	public abstract void method5279(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Z)Lclient!wk;")
	public abstract Class390 method5280();

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(BI)I")
	public abstract int method5281(@OriginalArg(1) int arg0);
}
