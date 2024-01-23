import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public abstract class Class17 {

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
	protected Class17() {
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)Lclient!uj;")
	public abstract Class136 method2181();

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)[B")
	public abstract byte[] method2184(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IB)V")
	public abstract void method2187(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(IB)I")
	public abstract int method2190(@OriginalArg(0) int arg0);
}
