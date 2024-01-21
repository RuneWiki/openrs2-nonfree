import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public abstract class Class68 {

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([BZ)V")
	public abstract void method2457(@OriginalArg(0) byte[] arg0);

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)[B")
	public abstract byte[] method2460();
}
