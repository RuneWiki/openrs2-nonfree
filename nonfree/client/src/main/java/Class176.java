import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public abstract class Class176 {

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
	protected Class176() {
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)Lclient!eh;")
	public abstract Class66 method5858();

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)V")
	public abstract void method5859(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)I")
	public abstract int method5860(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(II)[B")
	public abstract byte[] method5861(@OriginalArg(0) int arg0);
}
