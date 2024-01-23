import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public abstract class Class45 {

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "([BI)V")
	public abstract void method3806(@OriginalArg(0) byte[] arg0);

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)[B")
	public abstract byte[] method3809();
}
