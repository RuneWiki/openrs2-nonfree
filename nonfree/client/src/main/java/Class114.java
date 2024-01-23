import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public abstract class Class114 {

	@OriginalMember(owner = "client!n", name = "a", descriptor = "([BI)V")
	public abstract void method3130(@OriginalArg(0) byte[] arg0);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)[B")
	public abstract byte[] method3131();
}
