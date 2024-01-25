import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public abstract class Class89 {

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BII)[B")
	public abstract byte[] method5150(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[B)V")
	public abstract void method5155(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)[B")
	public abstract byte[] method5156();
}
