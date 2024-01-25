import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public abstract class Class89 {

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "()V")
	protected Class89() {
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)Lclient!hk;")
	public abstract Class70 method1842();

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)V")
	public abstract void method1844();

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)Z")
	public abstract boolean method1847(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "(I)V")
	public abstract void method1849();
}
