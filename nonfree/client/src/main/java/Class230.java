import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public abstract class Class230 {

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
	protected Class230() {
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V")
	public abstract void method6027();

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(Z)V")
	public abstract void method6028();

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z[BII)I")
	public abstract int method6029(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "([BIII)V")
	public abstract void method6030(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) throws IOException;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)Z")
	public abstract boolean method6031(@OriginalArg(0) int arg0) throws IOException;
}
