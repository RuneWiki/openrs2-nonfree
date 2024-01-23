import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public abstract class Class8 {

	@OriginalMember(owner = "client!al", name = "a", descriptor = "([BI)V")
	public abstract void method2693(@OriginalArg(0) byte[] arg0);

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(B)[B")
	public abstract byte[] method2695();
}
