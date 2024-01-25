import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class Class66 {

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
	protected Class66() {
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
	public abstract void method1388();

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(BI)Z")
	public abstract boolean method1390(@OriginalArg(1) int arg0) throws IOException;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(II[BI)V")
	public abstract void method1392(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException;

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)V")
	public abstract void method1393();

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I[BBI)I")
	public abstract int method1394(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException;
}
