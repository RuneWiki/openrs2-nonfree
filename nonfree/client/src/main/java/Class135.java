import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class Class135 {

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
	protected Class135() {
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)I")
	public abstract int method4407(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(B)Lclient!up;")
	public abstract Class234 method4409();

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(II)[B")
	public abstract byte[] method4410(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(II)V")
	public abstract void method4411(@OriginalArg(1) int arg0);
}
