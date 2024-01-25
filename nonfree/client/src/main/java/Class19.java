import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public abstract class Class19 {

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)[B")
	public abstract byte[] method348();

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IBI)[B")
	public abstract byte[] method349(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "([BB)V")
	public abstract void method350(@OriginalArg(0) byte[] arg0);
}
