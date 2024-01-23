import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class Class99 {

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)[B")
	public abstract byte[] method2993();

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I[B)V")
	public abstract void method2997(@OriginalArg(1) byte[] arg0);
}
