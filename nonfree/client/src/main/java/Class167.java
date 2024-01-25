import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public abstract class Class167 {

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "()V")
	protected Class167() {
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(II)I")
	public abstract int method3699(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I)Lclient!el;")
	public abstract Class95 method3701();

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IZ)[B")
	public abstract byte[] method3702(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IB)V")
	public abstract void method3704(@OriginalArg(0) int arg0);
}
