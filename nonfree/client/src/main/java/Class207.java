import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class Class207 {

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
	protected Class207() {
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
	public abstract void method5066();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
	public abstract void method5067();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)Z")
	public abstract boolean method5068(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)Lclient!nq;")
	public abstract Interface17 method5069();
}
