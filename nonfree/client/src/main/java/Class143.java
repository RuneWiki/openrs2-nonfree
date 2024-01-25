import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public abstract class Class143 {

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "()V")
	protected Class143() {
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)Lclient!iq;")
	public abstract Interface3 method5470();

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(ZI)Z")
	public abstract boolean method5471(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(I)V")
	public abstract void method5472();

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)V")
	public abstract void method5473();
}
