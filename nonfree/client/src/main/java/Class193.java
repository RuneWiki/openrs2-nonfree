import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public abstract class Class193 {

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V")
	protected Class193() {
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(B)Lclient!te;")
	public abstract Class319 method5568();

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IZ)V")
	public abstract void method5569(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(II)[B")
	public abstract byte[] method5570(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IB)I")
	public abstract int method5574(@OriginalArg(0) int arg0);
}
