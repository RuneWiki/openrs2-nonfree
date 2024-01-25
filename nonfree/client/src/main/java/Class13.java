import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public abstract class Class13 {

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "([BI)V")
	public abstract void method264(@OriginalArg(0) byte[] arg0);

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)[B")
	public abstract byte[] method265();

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IBI)[B")
	public abstract byte[] method266(@OriginalArg(2) int arg0);
}
