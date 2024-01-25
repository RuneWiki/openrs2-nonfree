import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public abstract class Class235 {

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
	protected Class235() {
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)V")
	public abstract void method6215(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IB)I")
	public abstract int method6217(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BI)[B")
	public abstract byte[] method6218(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)Lclient!wh;")
	public abstract Class317 method6221();
}
