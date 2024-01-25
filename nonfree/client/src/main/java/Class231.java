import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public abstract class Class231 {

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)[B")
	public abstract byte[] method6153();

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(III)[B")
	public abstract byte[] method6154(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "([BI)V")
	public abstract void method6155(@OriginalArg(0) byte[] arg0);
}
