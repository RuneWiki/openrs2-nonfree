import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public abstract class Class102 {

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "()V")
	protected Class102() {
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(BI)V")
	public abstract void method6628(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IB)I")
	public abstract int method6629(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(II)[B")
	public abstract byte[] method6630(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)Lclient!gr;")
	public abstract Class129 method6631();
}
