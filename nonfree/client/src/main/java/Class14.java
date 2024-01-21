import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public abstract class Class14 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B[B)V")
	public abstract void method487(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)[B")
	public abstract byte[] method488();
}
