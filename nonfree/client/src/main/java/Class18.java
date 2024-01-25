import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class Class18 {

	static {
		new Class15(64);
	}

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
	protected Class18() {
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)Lclient!qh;")
	public abstract Class167 method5600();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)I")
	public abstract int method5602(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)V")
	public abstract void method5604(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI)[B")
	public abstract byte[] method5605(@OriginalArg(1) int arg0);
}
