import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public abstract class Class230 {

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(III)[B")
	public abstract byte[] method5476(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(B[B)V")
	public abstract void method5477(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Z)[B")
	public abstract byte[] method5478();
}
