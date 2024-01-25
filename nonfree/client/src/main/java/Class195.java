import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public abstract class Class195 {

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BII)[B")
	public abstract byte[] method5285(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)[B")
	public abstract byte[] method5286();

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "([BZ)V")
	public abstract void method5290(@OriginalArg(0) byte[] arg0);
}
