import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public abstract class Class119 {

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)[B")
	public abstract byte[] method7514();

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I[B)V")
	public abstract void method7516(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)[B")
	public abstract byte[] method7518(@OriginalArg(1) int arg0);
}
