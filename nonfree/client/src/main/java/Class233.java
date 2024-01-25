import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public abstract class Class233 {

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Z)[B")
	public abstract byte[] method5445();

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Z[B)V")
	public abstract void method5447(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(III)[B")
	public abstract byte[] method5449(@OriginalArg(1) int arg0);
}
