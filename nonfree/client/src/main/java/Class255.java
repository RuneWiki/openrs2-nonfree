import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public abstract class Class255 {

	@OriginalMember(owner = "client!pga", name = "<init>", descriptor = "()V")
	protected Class255() {
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(I[BII)V")
	public abstract void method6259(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) throws IOException;

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(I[BII)I")
	public abstract int method6260(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException;

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)V")
	public abstract void method6263();

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(BI)Z")
	public abstract boolean method6264(@OriginalArg(1) int arg0) throws IOException;

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(B)V")
	public abstract void method6265();
}
