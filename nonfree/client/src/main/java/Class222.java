import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public abstract class Class222 {

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
	protected Class222() {
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)I")
	public abstract int method4779(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)Lclient!bm;")
	public abstract Class25 method4780();

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)V")
	public abstract void method4783(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZ)[B")
	public abstract byte[] method4786(@OriginalArg(0) int arg0);
}
