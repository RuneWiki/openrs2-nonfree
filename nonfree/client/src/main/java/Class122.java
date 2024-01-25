import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public abstract class Class122 {

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(III)[B")
	public abstract byte[] method2590(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)[B")
	public abstract byte[] method2592();

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(B[B)V")
	public abstract void method2594(@OriginalArg(1) byte[] arg0);
}
