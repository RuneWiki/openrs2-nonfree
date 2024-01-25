import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public abstract class Class68 {

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "()V")
	protected Class68() {
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IB)[B")
	public abstract byte[] method5213(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(II)V")
	public abstract void method5214(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IZ)I")
	public abstract int method5215(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(B)Lclient!vn;")
	public abstract Class252 method5216();
}
