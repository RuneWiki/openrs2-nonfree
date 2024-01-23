import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public abstract class Class53 {

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
	protected Class53() {
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZI)[B")
	public abstract byte[] method3983(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(ZI)I")
	public abstract int method3986(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)Lclient!qc;")
	public abstract Class140 method3991();

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(IZ)V")
	public abstract void method3992(@OriginalArg(0) int arg0);
}
