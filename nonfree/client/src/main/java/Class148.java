import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public abstract class Class148 {

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "([BB)V")
	public abstract void method6550(@OriginalArg(0) byte[] arg0);

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(III)[B")
	public abstract byte[] method6551(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(B)[B")
	public abstract byte[] method6552();
}
