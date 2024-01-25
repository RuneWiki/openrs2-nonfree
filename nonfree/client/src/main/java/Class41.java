import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public abstract class Class41 {

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "()V")
	protected Class41() {
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(II[BI)V")
	public abstract void method1728(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException;

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(II)Z")
	public abstract boolean method1729(@OriginalArg(1) int arg0) throws IOException;

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)V")
	public abstract void method1730();

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "(I)V")
	public abstract void method1733();

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "([BIII)I")
	public abstract int method1734(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException;
}
