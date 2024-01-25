import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public abstract class Class210 {

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
	protected Class210() {
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(III[B)V")
	public abstract void method8027(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
	public abstract void method8028();

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)Z")
	public abstract boolean method8029(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
	public abstract void method8030();

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II[BI)I")
	public abstract int method8031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException;
}
