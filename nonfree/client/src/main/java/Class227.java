import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public abstract class Class227 {

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "()V")
	protected Class227() {
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(BI)I")
	public abstract int method8068(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)Lclient!bj;")
	public abstract Class37 method8069();

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)V")
	public abstract void method8070(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(II)[B")
	public abstract byte[] method8071(@OriginalArg(1) int arg0);
}
