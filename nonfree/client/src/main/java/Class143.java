import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public abstract class Class143 {

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)[B")
	public abstract byte[] method4421();

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I[B)V")
	public abstract void method4422(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(III)[B")
	public abstract byte[] method4423(@OriginalArg(2) int arg0);
}
