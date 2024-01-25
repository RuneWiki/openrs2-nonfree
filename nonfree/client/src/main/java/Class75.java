import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public abstract class Class75 {

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)[B")
	public abstract byte[] method5746();

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)[B")
	public abstract byte[] method5747(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B[B)V")
	public abstract void method5748(@OriginalArg(1) byte[] arg0);
}
