import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public abstract class Class17 {

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I[B)V")
	public abstract void method7118(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)[B")
	public abstract byte[] method7119();

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZI)[B")
	public abstract byte[] method7121(@OriginalArg(2) int arg0);
}
