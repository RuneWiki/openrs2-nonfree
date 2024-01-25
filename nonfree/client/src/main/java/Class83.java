import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public abstract class Class83 {

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(III)[B")
	public abstract byte[] method3898(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "([BZ)V")
	public abstract void method3900(@OriginalArg(0) byte[] arg0);

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "(I)[B")
	public abstract byte[] method3902();
}
