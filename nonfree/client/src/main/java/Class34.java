import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public abstract class Class34 {

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(III)[B")
	public abstract byte[] method773(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)[B")
	public abstract byte[] method774();

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(I[B)V")
	public abstract void method775(@OriginalArg(1) byte[] arg0);
}
