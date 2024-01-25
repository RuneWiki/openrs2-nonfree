import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public abstract class Class260 {

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
	protected Class260() {
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)[B")
	public abstract byte[] method6250(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)I")
	public abstract int method6251(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BI)V")
	public abstract void method6254(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)Lclient!gj;")
	public abstract Class145 method6255();
}
