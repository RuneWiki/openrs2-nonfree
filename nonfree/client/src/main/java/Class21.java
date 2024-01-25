import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public abstract class Class21 {

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(I[B)V")
	public abstract void method6752(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)[B")
	public abstract byte[] method6753();

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(III)[B")
	public abstract byte[] method6754(@OriginalArg(1) int arg0);
}
