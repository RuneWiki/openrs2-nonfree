import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public abstract class Class286 {

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "([BI)V")
	public abstract void method6531(@OriginalArg(0) byte[] arg0);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)[B")
	public abstract byte[] method6533(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)[B")
	public abstract byte[] method6534();
}
