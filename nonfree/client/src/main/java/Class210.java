import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public abstract class Class210 {

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "()V")
	protected Class210() {
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Z)Lclient!hq;")
	public abstract Class137 method5501();

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IB)I")
	public abstract int method5502(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(BI)[B")
	public abstract byte[] method5503(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(IB)V")
	public abstract void method5506(@OriginalArg(0) int arg0);
}
