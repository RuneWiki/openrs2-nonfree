import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public abstract class Class30 {

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I[B)V")
	public abstract void method1935(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)[B")
	public abstract byte[] method1936();
}
