import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public abstract class Class262 {

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "()V")
	protected Class262() {
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(B)Lclient!gm;")
	public abstract Interface5 method6379();

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(II)Z")
	public abstract boolean method6381(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(B)V")
	public abstract void method6382();

	@OriginalMember(owner = "client!qda", name = "c", descriptor = "(B)V")
	public abstract void method6384();
}
