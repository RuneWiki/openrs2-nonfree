import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class Class117 {

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
	protected Class117() {
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(BI)I")
	public abstract int method3995(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)Lclient!pd;")
	public abstract Class238 method3999();

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)[B")
	public abstract byte[] method4000(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(II)V")
	public abstract void method4002(@OriginalArg(1) int arg0);
}
