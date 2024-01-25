import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public abstract class Class16 {

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IBI)[B")
	public abstract byte[] method233(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)[B")
	public abstract byte[] method234();

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(B[B)V")
	public abstract void method235(@OriginalArg(1) byte[] arg0);
}
