import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public abstract class Class187 {

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "()V")
	protected Class187() {
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)Z")
	public abstract boolean method4602(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V")
	public abstract void method4603();

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)V")
	public abstract void method4604();

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Z)Lclient!ct;")
	public abstract Class40 method4605();
}
