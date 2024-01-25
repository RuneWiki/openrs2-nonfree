import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public abstract class Class167 {

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "()V")
	protected Class167() {
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(I)Lclient!sv;")
	public abstract Class312 method6953();

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)I")
	public abstract int method6954(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(IB)[B")
	public abstract byte[] method6955(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(II)V")
	public abstract void method6957(@OriginalArg(1) int arg0);
}
