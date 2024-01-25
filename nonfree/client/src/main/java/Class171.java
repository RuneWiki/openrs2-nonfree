import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public abstract class Class171 {

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
	protected Class171() {
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)Lclient!hn;")
	public abstract Class85 method4633();

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V")
	public abstract void method4637();

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)Z")
	public abstract boolean method4638(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V")
	public abstract void method4640();
}
