import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public abstract class Class251 {

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "()V")
	protected Class251() {
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)V")
	public abstract void method5854(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)[B")
	public abstract byte[] method5855(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)Lclient!ds;")
	public abstract Class85 method5860();

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(II)I")
	public abstract int method5861(@OriginalArg(1) int arg0);
}
