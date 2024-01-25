import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public abstract class Class6 {

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(III)[B")
	public abstract byte[] method206(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)[B")
	public abstract byte[] method207();

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "([BB)V")
	public abstract void method208(@OriginalArg(0) byte[] arg0);
}
