import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public abstract class Class131 {

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	protected Class131() {
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V")
	public abstract void method3123(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)[B")
	public abstract byte[] method3124(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)Lclient!ea;")
	public abstract Class64 method3125();

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(IB)I")
	public abstract int method3126(@OriginalArg(0) int arg0);
}
