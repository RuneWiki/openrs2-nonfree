import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public abstract class Class98 {

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
	protected Class98() {
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)[B")
	public abstract byte[] method4067(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)Lclient!naa;")
	public abstract Class207 method4070();

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZ)I")
	public abstract int method4071(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZI)V")
	public abstract void method4073(@OriginalArg(1) int arg0);
}
