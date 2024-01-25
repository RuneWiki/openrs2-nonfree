import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public abstract class Class53 {

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
	protected Class53() {
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)Lclient!wo;")
	public abstract Interface13 method3908();

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
	public abstract void method3909();

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)Z")
	public abstract boolean method3910(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
	public abstract void method3911();
}
