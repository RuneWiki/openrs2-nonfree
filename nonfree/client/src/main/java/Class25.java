import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public abstract class Class25 {

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I[B)V")
	public abstract void method352(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)[B")
	public abstract byte[] method353(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)[B")
	public abstract byte[] method354();
}
