import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public abstract class Class62 {

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "()V")
	protected Class62() {
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(BI)V")
	public abstract void method2073(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)I")
	public abstract int method2074(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IB)[B")
	public abstract byte[] method2078(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)Lclient!tb;")
	public abstract Class304 method2080();
}
