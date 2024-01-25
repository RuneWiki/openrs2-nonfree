import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public abstract class Class51 {

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	protected Class51() {
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Lclient!op;")
	public abstract Class156 method4857();

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZ)I")
	public abstract int method4858(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)V")
	public abstract void method4859(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)[B")
	public abstract byte[] method4866(@OriginalArg(0) int arg0);
}
