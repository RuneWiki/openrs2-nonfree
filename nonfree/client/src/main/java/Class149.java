import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public abstract class Class149 {

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "()V")
	protected Class149() {
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(II[BI)I")
	public abstract int method3278(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)V")
	public abstract void method3279();

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)Z")
	public abstract boolean method3280(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(Z)V")
	public abstract void method3281();

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z[BII)V")
	public abstract void method3282(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException;
}
