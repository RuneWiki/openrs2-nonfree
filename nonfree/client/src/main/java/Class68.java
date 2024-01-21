import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public abstract class Class68 {

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B[B)V")
	public abstract void method2876(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)[B")
	public abstract byte[] method2880();
}
