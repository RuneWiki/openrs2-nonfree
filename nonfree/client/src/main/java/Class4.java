import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class Class4 {

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B[B)V")
	public abstract void method1682(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)[B")
	public abstract byte[] method1686();
}
