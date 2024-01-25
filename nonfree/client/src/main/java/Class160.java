import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public abstract class Class160 {

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "()V")
	protected Class160() {
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IB)I")
	public abstract int method6352(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BI)V")
	public abstract void method6353(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)Lclient!aca;")
	public abstract Class5 method6354();

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(II)[B")
	public abstract byte[] method6357(@OriginalArg(0) int arg0);
}
