import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public abstract class Class70 {

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)[B")
	public abstract byte[] method2437();

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "([BI)V")
	public abstract void method2438(@OriginalArg(0) byte[] arg0);
}
