import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class Class60 {

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "([BI)V")
	public abstract void method2551(@OriginalArg(0) byte[] arg0);

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)[B")
	public abstract byte[] method2554();
}
