import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public abstract class Class111 {

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
	protected Class111() {
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)V")
	public abstract void method2673(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BI)I")
	public abstract int method2674(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)Lclient!ma;")
	public abstract Class165 method2675();

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(BI)[B")
	public abstract byte[] method2676(@OriginalArg(1) int arg0);
}
