import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public abstract class Class85 {

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "()V")
	protected Class85() {
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)Lclient!wv;")
	public abstract Class272 method1893();

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IB)V")
	public abstract void method1894(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(IB)I")
	public abstract int method1896(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IZ)[B")
	public abstract byte[] method1897(@OriginalArg(0) int arg0);
}
