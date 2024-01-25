import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public abstract class Class22 {

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "()V")
	protected Class22() {
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(B[BII)V")
	public abstract void method7459(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) throws IOException;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
	public abstract void method7460();

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(II[BI)I")
	public abstract int method7461(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException;

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)V")
	public abstract void method7462();

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)Z")
	public abstract boolean method7464(@OriginalArg(0) int arg0) throws IOException;
}
