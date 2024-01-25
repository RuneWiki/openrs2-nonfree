import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public abstract class Class98 {

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "()V")
	protected Class98() {
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)Lclient!bm;")
	public abstract Class13 method4513();

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V")
	public abstract void method4514();

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V")
	public abstract void method4516();

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BI)Z")
	public abstract boolean method4517(@OriginalArg(1) int arg0);
}
