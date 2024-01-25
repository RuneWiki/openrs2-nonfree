import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public abstract class Class174 {

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "()V")
	protected Class174() {
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)V")
	public abstract void method4086();

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(B)Lclient!ri;")
	public abstract Interface19 method4088();

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(II)Z")
	public abstract boolean method4090(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(B)V")
	public abstract void method4091();
}
