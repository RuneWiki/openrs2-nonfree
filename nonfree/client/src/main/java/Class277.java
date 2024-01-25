import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public abstract class Class277 {

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "()V")
	protected Class277() {
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I[BII)V")
	public abstract void method7164(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) throws IOException;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(BI)Z")
	public abstract boolean method7166(@OriginalArg(1) int arg0) throws IOException;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V")
	public abstract void method7167();

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "([BIII)I")
	public abstract int method7168(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException;

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)V")
	public abstract void method7170();
}
