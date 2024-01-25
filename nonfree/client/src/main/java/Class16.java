import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public abstract class Class16 {

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
	protected Class16() {
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
	public abstract void method4711(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)[B")
	public abstract byte[] method4713(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Lclient!ba;")
	public abstract Class15 method4714();

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(II)I")
	public abstract int method4715(@OriginalArg(1) int arg0);
}
