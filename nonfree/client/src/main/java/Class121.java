import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public abstract class Class121 {

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V")
	protected Class121() {
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(BI)[B")
	public abstract byte[] method4857(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)Lclient!er;")
	public abstract Class58 method4858();

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IB)I")
	public abstract int method4861(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(IB)V")
	public abstract void method4862(@OriginalArg(0) int arg0);
}
