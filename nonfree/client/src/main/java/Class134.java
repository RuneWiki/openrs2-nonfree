import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class Class134 {

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
	protected Class134() {
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	public abstract void method8116();

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II[BI)V")
	public abstract void method8117(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)Z")
	public abstract boolean method8118(@OriginalArg(1) int arg0) throws IOException;

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V")
	public abstract void method8120();

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "([BIIZ)I")
	public abstract int method8123(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException;
}
