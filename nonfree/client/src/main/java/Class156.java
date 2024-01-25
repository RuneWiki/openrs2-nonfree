import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public abstract class Class156 {

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)[B")
	public abstract byte[] method4851();

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(III)[B")
	public abstract byte[] method4852(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(I[B)V")
	public abstract void method4853(@OriginalArg(1) byte[] arg0);
}
