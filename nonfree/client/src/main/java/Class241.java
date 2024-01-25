import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public abstract class Class241 {

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
	protected Class241() {
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)Z")
	public abstract boolean method7084(@OriginalArg(1) int arg0) throws IOException;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([BIBI)I")
	public abstract int method7085(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
	public abstract void method7087();

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(III[B)V")
	public abstract void method7088(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
	public abstract void method7090();
}
