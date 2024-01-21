import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public abstract class Class36 {

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I[B)V")
	public abstract void method2098(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)[B")
	public abstract byte[] method2101();
}
