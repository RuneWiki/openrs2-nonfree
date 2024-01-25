import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public abstract class Class143 {

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(BII)[B")
	public abstract byte[] method3806(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "([BI)V")
	public abstract void method3807(@OriginalArg(0) byte[] arg0);

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)[B")
	public abstract byte[] method3810();
}
