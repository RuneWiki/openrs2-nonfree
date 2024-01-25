import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public abstract class Class4 {

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
	protected Class4() {
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)[B")
	public abstract byte[] method5777(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)I")
	public abstract int method5780(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)Lclient!eq;")
	public abstract Class71 method5781();

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(BI)V")
	public abstract void method5782(@OriginalArg(1) int arg0);
}
