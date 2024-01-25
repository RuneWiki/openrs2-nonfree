import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public abstract class Class35 {

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)[B")
	public abstract byte[] method569();

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(III)[B")
	public abstract byte[] method573(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(I[B)V")
	public abstract void method574(@OriginalArg(1) byte[] arg0);
}
