import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public abstract class Class109 {

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I[B)V")
	public abstract void method3262(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)[B")
	public abstract byte[] method3263();
}
