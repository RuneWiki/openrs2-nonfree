import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public abstract class Class2 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[B)V")
	public abstract void method38(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)[B")
	public abstract byte[] method41();
}
