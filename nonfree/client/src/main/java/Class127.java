import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public abstract class Class127 {

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)[B")
	public abstract byte[] method3662();

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "([BI)V")
	public abstract void method3666(@OriginalArg(0) byte[] arg0);
}
