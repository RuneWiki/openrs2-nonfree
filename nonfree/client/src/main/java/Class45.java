import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public abstract class Class45 {

	@OriginalMember(owner = "client!id", name = "a", descriptor = "([BI)V")
	public abstract void method2581(@OriginalArg(0) byte[] arg0);

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)[B")
	public abstract byte[] method2583();
}
