import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public abstract class Class37 {

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
	protected Class37() {
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)I")
	public abstract int method1657(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)V")
	public abstract void method1660(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IB)[B")
	public abstract byte[] method1661(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)Lclient!vw;")
	public abstract Class364 method1662();
}
