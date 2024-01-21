import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public abstract class Class10 {

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(Z)[B")
	public abstract byte[] method847();

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B[B)V")
	public abstract void method848(@OriginalArg(1) byte[] arg0);
}
