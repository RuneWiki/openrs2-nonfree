import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public abstract class Class58 {

	@OriginalMember(owner = "client!ica", name = "<init>", descriptor = "()V")
	protected Class58() {
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(BI)[B")
	public abstract byte[] method1058(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)Lclient!ofa;")
	public abstract Class231 method1060();

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(BI)I")
	public abstract int method1064(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IB)V")
	public abstract void method1065(@OriginalArg(0) int arg0);
}
