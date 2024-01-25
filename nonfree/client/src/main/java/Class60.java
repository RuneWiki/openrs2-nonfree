import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public abstract class Class60 {

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
	protected Class60() {
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
	public abstract void method5382();

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)Z")
	public abstract boolean method5384(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V")
	public abstract void method5385();

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)Lclient!di;")
	public abstract Interface2 method5386();
}
