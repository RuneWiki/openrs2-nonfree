import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public abstract class Class12 {

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)[B")
	public abstract byte[] method5578(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B[B)V")
	public abstract void method5580(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)[B")
	public abstract byte[] method5581();
}
