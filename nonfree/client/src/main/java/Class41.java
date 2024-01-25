import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public abstract class Class41 {

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)[B")
	public abstract byte[] method1150();

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "([BB)V")
	public abstract void method1152(@OriginalArg(0) byte[] arg0);

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(BII)[B")
	public abstract byte[] method1154(@OriginalArg(2) int arg0);
}
