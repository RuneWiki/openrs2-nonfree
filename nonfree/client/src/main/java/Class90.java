import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public abstract class Class90 {

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V")
	protected Class90() {
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)Lclient!hd;")
	public abstract Class101 method3335();

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(BI)V")
	public abstract void method3336(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)[B")
	public abstract byte[] method3339(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)I")
	public abstract int method3341(@OriginalArg(1) int arg0);
}
