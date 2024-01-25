import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public abstract class Class162 {

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)[B")
	public abstract byte[] method4440();

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I[B)V")
	public abstract void method4443(@OriginalArg(1) byte[] arg0);
}
