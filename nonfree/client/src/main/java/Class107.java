import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public abstract class Class107 {

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V")
	protected Class107() {
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)V")
	public abstract void method1998();

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)Lclient!ks;")
	public abstract Class36 method2000();

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "(I)V")
	public abstract void method2002();

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZI)Z")
	public abstract boolean method2003(@OriginalArg(1) int arg0);
}
