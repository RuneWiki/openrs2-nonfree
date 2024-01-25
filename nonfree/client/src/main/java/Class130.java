import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public abstract class Class130 {

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(III)[B")
	public abstract byte[] method6346(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(B)[B")
	public abstract byte[] method6347();

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "([BB)V")
	public abstract void method6351(@OriginalArg(0) byte[] arg0);
}
