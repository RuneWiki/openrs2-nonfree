import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public abstract class Class19 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)[B")
	public abstract byte[] method983();

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I[B)V")
	public abstract void method985(@OriginalArg(1) byte[] arg0);
}
