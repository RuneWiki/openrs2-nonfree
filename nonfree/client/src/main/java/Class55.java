import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public abstract class Class55 {

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V")
	protected Class55() {
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)Lclient!gk;")
	public abstract Class64 method4232();

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BI)V")
	public abstract void method4233(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)[B")
	public abstract byte[] method4234(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(II)I")
	public abstract int method4239(@OriginalArg(1) int arg0);
}
