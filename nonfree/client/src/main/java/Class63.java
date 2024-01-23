import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class Class63 {

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
	protected Class63() {
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)Lclient!ki;")
	public abstract Class89 method1925();

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)I")
	public abstract int method1927(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)[B")
	public abstract byte[] method1929(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(BI)V")
	public abstract void method1930(@OriginalArg(1) int arg0);
}
