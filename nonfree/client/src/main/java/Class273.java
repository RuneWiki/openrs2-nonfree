import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public abstract class Class273 {

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V")
	protected Class273() {
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)Lclient!mj;")
	public abstract Interface13 method6610();

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(B)V")
	public abstract void method6611();

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)V")
	public abstract void method6613();

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(BI)Z")
	public abstract boolean method6617(@OriginalArg(1) int arg0);
}
