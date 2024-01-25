import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public abstract class Class164 {

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "()V")
	protected Class164() {
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(BI)V")
	public abstract void method4263(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(II)I")
	public abstract int method4265(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)Lclient!hc;")
	public abstract Class129 method4266();

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "(II)[B")
	public abstract byte[] method4267(@OriginalArg(0) int arg0);
}
