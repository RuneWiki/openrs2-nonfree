import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public abstract class Class29 {

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
	protected Class29() {
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)[B")
	public abstract byte[] method7181(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(IB)I")
	public abstract int method7183(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)V")
	public abstract void method7184(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)Lclient!ar;")
	public abstract Class16 method7185();
}
