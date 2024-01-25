import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public abstract class Class136 {

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(III)[B")
	public abstract byte[] method3292(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)[B")
	public abstract byte[] method3293();

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I[B)V")
	public abstract void method3296(@OriginalArg(1) byte[] arg0);
}
