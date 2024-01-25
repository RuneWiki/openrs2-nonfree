import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public abstract class Class56 {

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)[B")
	public abstract byte[] method972();

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([BI)V")
	public abstract void method974(@OriginalArg(0) byte[] arg0);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIZ)[B")
	public abstract byte[] method977(@OriginalArg(1) int arg0);
}
