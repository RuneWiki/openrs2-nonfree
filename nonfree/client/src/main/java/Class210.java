import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public abstract class Class210 {

	@OriginalMember(owner = "client!sw", name = "<init>", descriptor = "()V")
	protected Class210() {
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(B)Lclient!oia;")
	public abstract Class265 method5142();

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IB)[B")
	public abstract byte[] method5144(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "(IB)I")
	public abstract int method5145(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(BI)V")
	public abstract void method5146(@OriginalArg(1) int arg0);
}
