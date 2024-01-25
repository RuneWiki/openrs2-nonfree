import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public abstract class Class8 {

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V")
	protected Class8() {
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V")
	public abstract void method357();

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)Z")
	public abstract boolean method359(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I[BII)I")
	public abstract int method360(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(II[BI)V")
	public abstract void method361(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException;

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "(I)V")
	public abstract void method362();
}
