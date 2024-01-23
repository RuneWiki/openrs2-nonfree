import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public abstract class Class10 {

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)[B")
	public abstract byte[] method288();

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z[B)V")
	public abstract void method290(@OriginalArg(1) byte[] arg0);
}
