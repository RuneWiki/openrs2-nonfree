import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public abstract class Class346 {

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "([BI)V")
	public abstract void method7933(@OriginalArg(0) byte[] arg0);

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)[B")
	public abstract byte[] method7934();

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)[B")
	public abstract byte[] method7936(@OriginalArg(1) int arg0);
}
