import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public abstract class Class64 {

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
	protected Class64() {
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	public abstract void method1812();

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "([BIII)I")
	public abstract int method1813(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException;

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
	public abstract void method1816();

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(III[B)V")
	public abstract void method1819(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Z")
	public abstract boolean method1820(@OriginalArg(0) int arg0) throws IOException;
}
