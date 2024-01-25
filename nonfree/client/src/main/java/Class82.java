import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public abstract class Class82 {

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
	protected Class82() {
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)I")
	public abstract int method1920(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)Lclient!jp;")
	public abstract Class105 method1923();

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(BI)[B")
	public abstract byte[] method1926(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(II)V")
	public abstract void method1928(@OriginalArg(1) int arg0);
}
