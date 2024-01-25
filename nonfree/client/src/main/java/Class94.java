import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public abstract class Class94 {

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
	protected Class94() {
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V")
	public abstract void method2176(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)[B")
	public abstract byte[] method2178(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)I")
	public abstract int method2179(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)Lclient!qn;")
	public abstract Class207 method2180();
}
