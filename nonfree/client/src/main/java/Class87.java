import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public abstract class Class87 {

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
	protected Class87() {
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)[B")
	public abstract byte[] method2836(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)Lclient!uo;")
	public abstract Class293 method2837();

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)V")
	public abstract void method2838(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZ)I")
	public abstract int method2841(@OriginalArg(0) int arg0);
}
