import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public abstract class Class29 {

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "()V")
	protected Class29() {
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Z)V")
	public abstract void method4602();

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(I[BII)V")
	public abstract void method4605(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException;

	@OriginalMember(owner = "client!bba", name = "c", descriptor = "(I)V")
	public abstract void method4606();

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IZ)Z")
	public abstract boolean method4608(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "(I[BII)I")
	public abstract int method4609(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException;
}
