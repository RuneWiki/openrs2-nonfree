import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public abstract class Class191 {

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "([BI)V")
	public abstract void method7608(@OriginalArg(0) byte[] arg0);

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)[B")
	public abstract byte[] method7609();

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)[B")
	public abstract byte[] method7610(@OriginalArg(2) int arg0);
}
