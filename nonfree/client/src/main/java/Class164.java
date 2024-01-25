import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public abstract class Class164 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)[B")
	public abstract byte[] method3655();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(III)[B")
	public abstract byte[] method3656(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "([BB)V")
	public abstract void method3659(@OriginalArg(0) byte[] arg0);
}
