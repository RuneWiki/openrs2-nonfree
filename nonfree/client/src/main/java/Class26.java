import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public abstract class Class26 {

	@OriginalMember(owner = "client!qia", name = "<init>", descriptor = "()V")
	protected Class26() {
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(BI)Z")
	public abstract boolean method741(@OriginalArg(1) int arg0) throws IOException;

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(BI[BI)I")
	public abstract int method743(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException;

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(I)V")
	public abstract void method744();

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(IB[BI)V")
	public abstract void method745(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException;

	@OriginalMember(owner = "client!qia", name = "b", descriptor = "(I)V")
	public abstract void method746();
}
