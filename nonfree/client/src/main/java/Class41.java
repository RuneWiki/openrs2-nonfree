import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public abstract class Class41 {

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
	protected Class41() {
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II[BI)V")
	public abstract void method1065(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	public abstract void method1066();

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
	public abstract void method1067();

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(II[BI)I")
	public abstract int method1068(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Z")
	public abstract boolean method1071(@OriginalArg(1) int arg0) throws IOException;
}
