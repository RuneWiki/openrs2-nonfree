import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public abstract class Class11 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZI)V")
	public abstract void method1271(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IZI[B)V")
	public abstract void method1272(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2);

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
	public abstract void method1275();

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
	public abstract void method1277();

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(III)V")
	public abstract void method1278(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V")
	public abstract void method1280();
}
