import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public abstract class Class11 {

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I[B)V")
	public abstract void method1398(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)[B")
	public abstract byte[] method1399();
}
