import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public abstract class Class163 {

	@OriginalMember(owner = "client!pea", name = "<init>", descriptor = "()V")
	protected Class163() {
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(II)Z")
	public abstract boolean method4104(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(I)V")
	public abstract void method4106();

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(Z)V")
	public abstract void method4108();

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(I)Lclient!cca;")
	public abstract Interface5 method4109();
}
