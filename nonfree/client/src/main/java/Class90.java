import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public abstract class Class90 {

	@OriginalMember(owner = "client!efa", name = "<init>", descriptor = "()V")
	protected Class90() {
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)V")
	public abstract void method8780();

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(II)Z")
	public abstract boolean method8781(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(I)Lclient!ll;")
	public abstract Interface16 method8782();

	@OriginalMember(owner = "client!efa", name = "c", descriptor = "(I)V")
	public abstract void method8783();
}
