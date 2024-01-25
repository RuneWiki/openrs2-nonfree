import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public abstract class Class7 {

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V")
	protected Class7() {
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(BI)I")
	public abstract int method154(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)[B")
	public abstract byte[] method155(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(B)Lclient!ew;")
	public abstract Class106 method157();

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IZ)V")
	public abstract void method158(@OriginalArg(0) int arg0);
}
