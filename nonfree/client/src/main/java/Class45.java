import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public abstract class Class45 {

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I[B)V")
	public abstract void method1676(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)[B")
	public abstract byte[] method1677();
}
