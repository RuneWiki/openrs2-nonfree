import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public abstract class Class56 {

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
	protected Class56() {
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)V")
	public abstract void method3290(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)[B")
	public abstract byte[] method3292(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)I")
	public abstract int method3293(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)Lclient!ms;")
	public abstract Class160 method3294();
}
