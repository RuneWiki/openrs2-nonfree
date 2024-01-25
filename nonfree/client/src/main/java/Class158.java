import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public abstract class Class158 {

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(I[B)V")
	public abstract void method5021(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(III)[B")
	public abstract byte[] method5024(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "(B)[B")
	public abstract byte[] method5025();
}
