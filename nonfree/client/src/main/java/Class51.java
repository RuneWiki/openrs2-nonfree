import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public abstract class Class51 {

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
	protected Class51() {
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)Lclient!mc;")
	public abstract Class131 method1728();

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)V")
	public abstract void method1729(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)I")
	public abstract int method1730(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)[B")
	public abstract byte[] method1732(@OriginalArg(0) int arg0);
}
