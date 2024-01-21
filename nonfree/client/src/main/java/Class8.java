import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public abstract class Class8 {

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "([BB)V")
	public abstract void method150(@OriginalArg(0) byte[] arg0);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)[B")
	public abstract byte[] method152();
}
