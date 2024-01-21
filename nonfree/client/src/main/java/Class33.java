import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public abstract class Class33 {

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "([BI)V")
	public abstract void method676(@OriginalArg(0) byte[] arg0);

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)[B")
	public abstract byte[] method677();
}
