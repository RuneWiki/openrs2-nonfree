import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public abstract class Class87 {

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "()V")
	protected Class87() {
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)Lclient!rf;")
	public abstract Class300 method5169();

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(II)[B")
	public abstract byte[] method5170(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IZ)V")
	public abstract void method5172(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(II)I")
	public abstract int method5174(@OriginalArg(1) int arg0);
}
