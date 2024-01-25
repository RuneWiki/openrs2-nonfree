import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public abstract class Class96 {

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
	protected Class96() {
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)Lclient!og;")
	public abstract Class188 method4047();

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)I")
	public abstract int method4048(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)V")
	public abstract void method4053(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)[B")
	public abstract byte[] method4054(@OriginalArg(0) int arg0);
}
