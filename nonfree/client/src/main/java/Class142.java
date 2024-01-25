import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public abstract class Class142 {

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)[B")
	public abstract byte[] method3343();

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(B[B)V")
	public abstract void method3344(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(III)[B")
	public abstract byte[] method3345(@OriginalArg(1) int arg0);
}
