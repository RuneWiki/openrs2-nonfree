import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public abstract class Class34 {

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)[B")
	public abstract byte[] method1455();

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "([BI)V")
	public abstract void method1457(@OriginalArg(0) byte[] arg0);
}
