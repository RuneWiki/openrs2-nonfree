import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public abstract class Class101 {

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V")
	protected Class101() {
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)V")
	public abstract void method2454(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)Lclient!km;")
	public abstract Class132 method2455();

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(II)[B")
	public abstract byte[] method2457(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IB)I")
	public abstract int method2458(@OriginalArg(0) int arg0);
}
