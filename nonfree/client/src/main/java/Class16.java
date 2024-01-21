import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class Class16 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)[B")
	public abstract byte[] method466();

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "([BI)V")
	public abstract void method467(@OriginalArg(0) byte[] arg0);
}
