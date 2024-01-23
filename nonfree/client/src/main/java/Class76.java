import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class Class76 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)[B")
	public abstract byte[] method2331();

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[B)V")
	public abstract void method2332(@OriginalArg(1) byte[] arg0);
}
