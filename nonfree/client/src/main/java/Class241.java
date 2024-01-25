import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public abstract class Class241 {

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
	protected Class241() {
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)Lclient!vaa;")
	public abstract Interface18 method6301();

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)Z")
	public abstract boolean method6303(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(B)V")
	public abstract void method6305();

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(B)V")
	public abstract void method6306();
}
