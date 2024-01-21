import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public abstract class Class72 {

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I[B)V")
	public abstract void method2096(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)[B")
	public abstract byte[] method2100();
}
