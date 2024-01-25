import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public abstract class Class75 {

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
	protected Class75() {
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
	public abstract void method1850();

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IBI[B)V")
	public abstract void method1854(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)Z")
	public abstract boolean method1855(@OriginalArg(1) int arg0) throws IOException;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(B[BII)I")
	public abstract int method1856(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V")
	public abstract void method1857();
}
