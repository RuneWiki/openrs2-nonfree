import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public abstract class Class15 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)[B")
	public abstract byte[] method1697();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([BI)V")
	public abstract void method1701(@OriginalArg(0) byte[] arg0);
}
