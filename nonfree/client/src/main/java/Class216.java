import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public abstract class Class216 {

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)[B")
	public abstract byte[] method5323();

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(III)[B")
	public abstract byte[] method5324(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "([BI)V")
	public abstract void method5325(@OriginalArg(0) byte[] arg0);
}
