import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public abstract class Class52 {

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V")
	protected Class52() {
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V")
	public abstract void method1345();

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IB)Z")
	public abstract boolean method1347(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(B)Lclient!db;")
	public abstract Class42 method1348();

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V")
	public abstract void method1349();
}
