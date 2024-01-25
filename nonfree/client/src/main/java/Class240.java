import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public abstract class Class240 {

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
	protected Class240() {
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III[B)I")
	public abstract int method5656(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
	public abstract void method5657();

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
	public abstract void method5658();

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)Z")
	public abstract boolean method5659(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(III[B)V")
	public abstract void method5660(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException;
}
