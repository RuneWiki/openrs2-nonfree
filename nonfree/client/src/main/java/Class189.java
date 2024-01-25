import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public abstract class Class189 {

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
	protected Class189() {
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZI)Z")
	public abstract boolean method4710(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V")
	public abstract void method4711();

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)V")
	public abstract void method4712();

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)Lclient!nt;")
	public abstract Interface13 method4713();
}
