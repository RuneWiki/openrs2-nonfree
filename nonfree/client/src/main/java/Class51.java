import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public abstract class Class51 {

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
	protected Class51() {
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)[B")
	public abstract byte[] method8045(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)Lclient!wu;")
	public abstract Class394 method8046();

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(II)V")
	public abstract void method8047(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)I")
	public abstract int method8049(@OriginalArg(1) int arg0);
}
