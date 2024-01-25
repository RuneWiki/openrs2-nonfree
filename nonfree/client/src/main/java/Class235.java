import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public abstract class Class235 {

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V")
	protected Class235() {
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II)[B")
	public abstract byte[] method5077(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I)Lclient!sv;")
	public abstract Class306 method5078();

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IB)V")
	public abstract void method5079(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(IB)I")
	public abstract int method5081(@OriginalArg(0) int arg0);
}
