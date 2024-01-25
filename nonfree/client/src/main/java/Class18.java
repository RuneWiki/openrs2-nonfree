import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public abstract class Class18 {

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V")
	protected Class18() {
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)Lclient!bs;")
	public abstract Interface1 method5974();

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)V")
	public abstract void method5975();

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IZ)Z")
	public abstract boolean method5977(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V")
	public abstract void method5978();
}
