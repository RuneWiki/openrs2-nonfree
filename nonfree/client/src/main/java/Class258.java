import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public abstract class Class258 {

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "([BB)V")
	public abstract void method6308(@OriginalArg(0) byte[] arg0);

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(III)[B")
	public abstract byte[] method6309(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)[B")
	public abstract byte[] method6312();
}
