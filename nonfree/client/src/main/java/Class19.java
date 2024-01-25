import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public abstract class Class19 {

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(B)[B")
	public abstract byte[] method5151();

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IBI)[B")
	public abstract byte[] method5153(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!av", name = "a", descriptor = "([BB)V")
	public abstract void method5154(@OriginalArg(0) byte[] arg0);
}
