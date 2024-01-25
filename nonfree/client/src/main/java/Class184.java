import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public abstract class Class184 {

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "()V")
	protected Class184() {
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(B)Lclient!rfa;")
	public abstract Interface21 method6053();

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
	public abstract void method6054();

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(B)V")
	public abstract void method6057();

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(II)Z")
	public abstract boolean method6058(@OriginalArg(0) int arg0);
}
