import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public abstract class Class51 {

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V")
	protected Class51() {
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IB)Z")
	public abstract boolean method3507(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)V")
	public abstract void method3508();

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(II[BZ)I")
	public abstract int method3509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(II[BI)V")
	public abstract void method3510(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V")
	public abstract void method3512();
}
