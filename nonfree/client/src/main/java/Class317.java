import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public abstract class Class317 {

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(I[B)V")
	public abstract void method7057(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(III)[B")
	public abstract byte[] method7059(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)[B")
	public abstract byte[] method7060();
}
