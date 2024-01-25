import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public abstract class Class120 {

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
	protected Class120() {
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)Lclient!oba;")
	public abstract Class241 method3827();

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)V")
	public abstract void method3829(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)I")
	public abstract int method3830(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(IB)[B")
	public abstract byte[] method3831(@OriginalArg(0) int arg0);
}
