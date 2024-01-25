import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class Class98 {

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
	protected Class98() {
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)I")
	public abstract int method4128(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB)V")
	public abstract void method4130(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)Lclient!l;")
	public abstract Class121 method4131();

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)[B")
	public abstract byte[] method4133(@OriginalArg(0) int arg0);
}
