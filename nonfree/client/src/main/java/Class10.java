import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public abstract class Class10 {

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)[B")
	public abstract byte[] method345();

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "([BB)V")
	public abstract void method348(@OriginalArg(0) byte[] arg0);
}
