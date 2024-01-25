import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public abstract class Class251 {

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)[B")
	public abstract byte[] method5844();

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(III)[B")
	public abstract byte[] method5845(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I[B)V")
	public abstract void method5846(@OriginalArg(1) byte[] arg0);
}
