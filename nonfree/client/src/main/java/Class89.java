import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public abstract class Class89 {

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([BZ)V")
	public abstract void method3742(@OriginalArg(0) byte[] arg0);

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)[B")
	public abstract byte[] method3743();
}
