import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public abstract class Class20 {

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(B)[B")
	public abstract byte[] method444();

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I[B)V")
	public abstract void method445(@OriginalArg(1) byte[] arg0);
}
