import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public abstract class Class113 {

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "()V")
	protected Class113() {
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BI)V")
	public abstract void method3784(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)I")
	public abstract int method3786(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)Lclient!lb;")
	public abstract Class147 method3787();

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IB)[B")
	public abstract byte[] method3788(@OriginalArg(0) int arg0);
}
