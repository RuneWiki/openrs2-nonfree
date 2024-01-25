import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public abstract class Class221 {

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "()V")
	protected Class221() {
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(II)Z")
	public abstract boolean method8050(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)Lclient!no;")
	public abstract Interface20 method8051();

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "(I)V")
	public abstract void method8052();

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)V")
	public abstract void method8053();
}
