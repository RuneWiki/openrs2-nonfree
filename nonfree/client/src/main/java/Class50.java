import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public abstract class Class50 {

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
	protected Class50() {
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)Z")
	public abstract boolean method7394(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
	public abstract void method7395();

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)Lclient!wo;")
	public abstract Interface26 method7397();

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
	public abstract void method7398();
}
