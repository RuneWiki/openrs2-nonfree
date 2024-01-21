import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public abstract class Class14 {

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public abstract void method1420();

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I[BIZ)V")
	public abstract void method1421(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2);

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IBI)V")
	public abstract void method1423(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(B)V")
	public abstract void method1424();

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)V")
	public abstract void method1425(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(B)V")
	public abstract void method1426();
}
