import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public abstract class Class15 {

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(III)[B")
	public abstract byte[] method3812(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(I)[B")
	public abstract byte[] method3813();

	@OriginalMember(owner = "client!au", name = "a", descriptor = "([BZ)V")
	public abstract void method3814(@OriginalArg(0) byte[] arg0);
}
