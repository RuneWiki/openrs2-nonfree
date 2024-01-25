import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public abstract class Class272 {

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)[B")
	public abstract byte[] method5783();

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(III)[B")
	public abstract byte[] method5784(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "([BI)V")
	public abstract void method5786(@OriginalArg(0) byte[] arg0);
}
