import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public abstract class Class89 {

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "()V")
	protected Class89() {
	}

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "(B)V")
	public abstract void method1614();

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ZI)Z")
	public abstract boolean method1617(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)V")
	public abstract void method1619();

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)Lclient!ks;")
	public abstract Interface12 method1620();
}
