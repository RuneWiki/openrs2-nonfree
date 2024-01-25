import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public abstract class Class251 {

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
	protected Class251() {
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
	public abstract void method6711();

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)Z")
	public abstract boolean method6712(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
	public abstract void method6713();

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)Lclient!oc;")
	public abstract Interface18 method6714();
}
