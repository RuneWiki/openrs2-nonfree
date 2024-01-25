import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public abstract class Class295 {

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "()V")
	protected Class295() {
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(B)V")
	public abstract void method7019();

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(III[B)I")
	public abstract int method7020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)Z")
	public abstract boolean method7021(@OriginalArg(1) int arg0) throws IOException;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)V")
	public abstract void method7023();

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I[BII)V")
	public abstract void method7026(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException;
}
