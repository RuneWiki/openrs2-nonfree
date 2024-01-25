import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public abstract class Class38 {

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(III)[B")
	public abstract byte[] method1196(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(I[B)V")
	public abstract void method1197(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)[B")
	public abstract byte[] method1198();
}
