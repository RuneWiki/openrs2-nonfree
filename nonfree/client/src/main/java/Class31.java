import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public abstract class Class31 {

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V")
	protected Class31() {
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)V")
	public abstract void method1405(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)Lclient!oh;")
	public abstract Class126 method1406();

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(II)I")
	public abstract int method1408(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(II)[B")
	public abstract byte[] method1411(@OriginalArg(0) int arg0);
}
