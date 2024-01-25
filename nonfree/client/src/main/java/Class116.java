import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public abstract class Class116 {

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V")
	protected Class116() {
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(BI[BI)I")
	public abstract int method2476(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
	public abstract void method2477();

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "([BIIB)V")
	public abstract void method2478(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) throws IOException;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IB)Z")
	public abstract boolean method2480(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "(I)V")
	public abstract void method2483();
}
