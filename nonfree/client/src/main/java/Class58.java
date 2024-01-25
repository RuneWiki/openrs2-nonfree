import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public abstract class Class58 {

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "()V")
	protected Class58() {
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(III[B)V")
	public abstract void method4910(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V")
	public abstract void method4914();

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(II)Z")
	public abstract boolean method4916(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(III[B)I")
	public abstract int method4918(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)V")
	public abstract void method4920();
}
