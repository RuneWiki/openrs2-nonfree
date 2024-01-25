import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public abstract class Class170 {

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "()V")
	protected Class170() {
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
	public abstract void method8768();

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(II)Z")
	public abstract boolean method8769(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)V")
	public abstract void method8770();

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(II[BB)V")
	public abstract void method8773(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I[BII)I")
	public abstract int method8776(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException;
}
