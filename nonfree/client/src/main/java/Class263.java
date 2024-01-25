import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public abstract class Class263 {

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B[B)V")
	public abstract void method6922(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(III)[B")
	public abstract byte[] method6923(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(B)[B")
	public abstract byte[] method6924();
}
