import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public abstract class Class43 {

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I[B)V")
	public abstract void method1469(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(B)[B")
	public abstract byte[] method1471();
}
