import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public abstract class Class79 {

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(III)[B")
	public abstract byte[] method4226(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "([BI)V")
	public abstract void method4227(@OriginalArg(0) byte[] arg0);

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(Z)[B")
	public abstract byte[] method4228();
}
