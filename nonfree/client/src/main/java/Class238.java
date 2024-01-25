import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public abstract class Class238 {

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "()V")
	protected Class238() {
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)Z")
	public abstract boolean method6948(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)Lclient!jfa;")
	public abstract Interface13 method6949();

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(I)V")
	public abstract void method6950();

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "(I)V")
	public abstract void method6951();
}
