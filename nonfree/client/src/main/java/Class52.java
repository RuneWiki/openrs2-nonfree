import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public abstract class Class52 {

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I[B)V")
	public abstract void method3348(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)[B")
	public abstract byte[] method3350();
}
