import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public abstract class Class247 {

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I[B)V")
	public abstract void method5871(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)[B")
	public abstract byte[] method5872();

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)[B")
	public abstract byte[] method5873(@OriginalArg(1) int arg0);
}
