import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public abstract class Class10 {

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "()V")
	protected Class10() {
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(II)Z")
	public abstract boolean method301(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)Lclient!ec;")
	public abstract Class60 method302();

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(B)V")
	public abstract void method303();

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "(B)V")
	public abstract void method305();
}
