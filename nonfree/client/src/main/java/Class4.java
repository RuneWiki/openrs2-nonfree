import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class Class4 {

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
	protected Class4() {
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IB)V")
	public abstract void method3420(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)I")
	public abstract int method3422(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)[B")
	public abstract byte[] method3424(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)Lclient!fd;")
	public abstract Class52 method3425();
}
