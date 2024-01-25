import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public abstract class Class95 {

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(B)[B")
	public abstract byte[] method7798();

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(III)[B")
	public abstract byte[] method7799(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!em", name = "a", descriptor = "([BB)V")
	public abstract void method7800(@OriginalArg(0) byte[] arg0);
}
