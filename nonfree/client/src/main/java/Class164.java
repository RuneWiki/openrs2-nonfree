import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public abstract class Class164 {

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V")
	protected Class164() {
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)I")
	public abstract int method3991(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(II)[B")
	public abstract byte[] method3993(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)Lclient!vm;")
	public abstract Class301 method3995();

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(II)V")
	public abstract void method3996(@OriginalArg(0) int arg0);
}
